package com.meli.cuponservice.Services;

import com.meli.cuponservice.Entitys.Favoritos;
import com.meli.cuponservice.Models.Request;
import com.meli.cuponservice.Models.Response;
import com.meli.cuponservice.Models.ResponseCalCupon;

import java.util.List;

public interface IServices {
     Response<ResponseCalCupon>    calcularService(Request request);
     List<Favoritos> getFavoritos();
}
