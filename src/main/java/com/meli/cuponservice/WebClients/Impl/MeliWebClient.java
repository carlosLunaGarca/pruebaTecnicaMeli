package com.meli.cuponservice.WebClients.Impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.meli.cuponservice.Models.Item;
import com.meli.cuponservice.Models.Response;
import com.meli.cuponservice.Utils.Constans;
import com.meli.cuponservice.WebClients.IWebClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class MeliWebClient implements IWebClient {

    @Autowired
    Constans constantes;

    @Override
    public Response<List<Item>> getItems(List<String> itemsId) {
        Response<List<Item>> response = new Response<>();
        String url = constantes.URLMELI+itemsId.toString().replaceAll("[\\[\\] ]","");
        try {
            Mono<ResponseEntity<String>> mono = WebClient.create(url)
                    .get()
                    .accept(MediaType.APPLICATION_JSON)
                    .header("Content-Type", "application/json")
                    .exchange()
                    .flatMap(resp -> resp.toEntity(String.class));

            ResponseEntity<String> resp = mono.block();

            if (resp != null && (resp.getStatusCode().equals(HttpStatus.OK) || resp.getStatusCode().equals(HttpStatus.NO_CONTENT))) {
                ObjectMapper om = new ObjectMapper();
                List<Item> itemsResponse= om.readValue(resp.getBody(), new TypeReference<List<Item>>(){});
                log.info("peticion exitosa "+itemsResponse.toString());
                 response.setData(itemsResponse);
            }

        } catch (Exception e) {
            response.setMessage(e.getMessage());
            response.setIsSuccess(false);
            log.error("fallo salida de fallo ==== "+ e.getMessage());
        }
        return response;
    }
}
