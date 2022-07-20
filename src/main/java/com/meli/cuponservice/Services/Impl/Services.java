package com.meli.cuponservice.Services.Impl;

import com.meli.cuponservice.Entitys.Favoritos;
import com.meli.cuponservice.Models.Item;
import com.meli.cuponservice.Models.Request;
import com.meli.cuponservice.Models.Response;
import com.meli.cuponservice.Models.ResponseCalCupon;
import com.meli.cuponservice.Repos.FavoritosRepo;
import com.meli.cuponservice.Services.IServices;
import com.meli.cuponservice.WebClients.IWebClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Service
public class Services implements IServices {
    @Autowired
    IWebClient iWebClient;
    @Autowired
    FavoritosRepo favoritosRepo;

    public Response<ResponseCalCupon> calcularService(Request request){
        Response<ResponseCalCupon> response= new Response<>();
        ResponseCalCupon respuesta = new ResponseCalCupon();
        try {
            if(!request.getItemIds().isEmpty()) {
                Response<List<Item>> itemsInfo = iWebClient.getItems(request.getItemIds());

                Integer amount = request.getAmount();
                respuesta.setAmount(amount);
                ArrayList<Favoritos> listCompras = new ArrayList<>();
                ArrayList<String> listaId = new ArrayList<>();
                Collections.sort(itemsInfo.getData());


                for (Item item : itemsInfo.getData()) {
                    if (respuesta.getItemIds() == null && request.getAmount() - item.getBody().getPrice() > -1) {
                        respuesta.setItemIds(new ArrayList<>());
                        request.setAmount(request.getAmount() - item.getBody().getPrice());
                        respuesta.setAmount(request.getAmount());
                        respuesta.getItemIds().add(item.getBody().getId());

                        Favoritos favoritoAux = new Favoritos();
                        favoritoAux.setId(item.getBody().getId());
                        favoritoAux.setPrice((long) item.getBody().getPrice());
                        favoritoAux.setFavoriteCounter(1);
                        listCompras.add(favoritoAux);
                        listaId.add(favoritoAux.getId());
                    } else if (request.getAmount() - item.getBody().getPrice() > -1) {
                        request.setAmount(request.getAmount() - item.getBody().getPrice());
                        respuesta.setAmount(request.getAmount());
                        respuesta.getItemIds().add(item.getBody().getId());
                        Favoritos favoritoAux = new Favoritos();
                        favoritoAux.setId(item.getBody().getId());
                        favoritoAux.setPrice((long) item.getBody().getPrice());

                        if (!listCompras.contains(favoritoAux)) {

                            favoritoAux.setFavoriteCounter(1);
                            listaId.add(favoritoAux.getId());
                            listCompras.add(favoritoAux);
                        } else {
                            int index = listCompras.indexOf(favoritoAux);
                            Favoritos auxF = listCompras.get(index);

                            auxF.setFavoriteCounter(auxF.getFavoriteCounter() + 1);
                            listCompras.set(index, auxF);
                        }

                    } else {
                        break;
                    }
                }


                for (Favoritos update : favoritosRepo.findAllById(listaId)) {
                    if (listCompras.contains(update)) {
                        int index = listCompras.indexOf(update);
                        listCompras.get(index).setFavoriteCounter(update.getFavoriteCounter() + listCompras.get(index).getFavoriteCounter());
                    }
                }
                favoritosRepo.saveAll(listCompras);
                respuesta.setAmount(amount - respuesta.getAmount());
            }else{
                response.setMessage(" no hay Ids ");
                response.setIsSuccess(false);
                response.setIsWarning(true);
                return response;
            }
        }catch(Exception e ){
            response.setMessage(" uno o mas de los ids no existe en meli  ");
            response.setIsSuccess(false);
            response.setIsWarning(true);
            return response;
        }
        response.setData(respuesta);
        response.setIsSuccess(true);
        response.setMessage("OK");
        response.setIsWarning(false);

        return  response;

    }

    @Override
    public List<Favoritos> getFavoritos() {
        ArrayList<Favoritos> lista5Favoritos= new ArrayList<>();
        List<Favoritos> lista = favoritosRepo.findByOrderByFavoriteCounterDesc();
        for (int i=0;i<lista.size();i++){
            if(i<=4) {
                lista5Favoritos.add(lista.get(i));
            }else{
                break;
            }
        }
        return lista5Favoritos;
    }

}
