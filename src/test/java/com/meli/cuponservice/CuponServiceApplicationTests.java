package com.meli.cuponservice;

import com.meli.cuponservice.Entitys.Favoritos;
import com.meli.cuponservice.Models.*;
import com.meli.cuponservice.Repos.FavoritosRepo;
import com.meli.cuponservice.Services.IServices;
import com.meli.cuponservice.WebClients.IWebClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class CuponServiceApplicationTests {
    @Autowired
FavoritosRepo favoritosRepo;
    @Autowired
IServices iServices;
@Autowired
    IWebClient iWebClient;

    @Test
    void contextLoads() {
        Assertions.assertNotNull(favoritosRepo.findByOrderByFavoriteCounterDesc());

    }
    @Test
    void ClientWeb(){
        List<String> listaItems= new ArrayList<>();
        listaItems.add("MLA1138746052");
        Response<List<Item>> conparador= new Response<>();
        Item item1 = new Item();
        Body b1= new Body();
        item1.setCode(200);
        b1.setId("MLA1138746052");
        b1.setPrice(12999);
        item1.setBody(b1);
        conparador.setData(new ArrayList<>());
        conparador.getData().add(item1);
        Assertions.assertEquals(iWebClient.getItems(listaItems),conparador);
    }
    @Test
    void Services(){

        Request peticion= new Request();
        List<String> listaIds=  new ArrayList<>();
        List<String> listaIdsSalida=  new ArrayList<>();
        listaIdsSalida.add("MLA1138746052");
        Response<ResponseCalCupon> response= new Response<>();
        ResponseCalCupon  cuerpo= new ResponseCalCupon();
        cuerpo.setAmount(12999);
        cuerpo.setItemIds(listaIdsSalida);
        response.setData(cuerpo);
        response.setMessage("OK");
        response.setIsSuccess(true);
        response.setIsWarning(false);
        listaIds.add("MLA1138746052");
        peticion.setAmount(100000);
        peticion.setItemIds(listaIds);
        Assertions.assertEquals(iServices.calcularService(peticion),response);

            }

}
