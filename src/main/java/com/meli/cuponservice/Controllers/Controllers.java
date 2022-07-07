package com.meli.cuponservice.Controllers;

import com.meli.cuponservice.Entitys.Favoritos;
import com.meli.cuponservice.Models.Request;
import com.meli.cuponservice.Models.ResponseCalCupon;
import com.meli.cuponservice.Services.IServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*",methods = {RequestMethod.DELETE,RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
public class Controllers {
@Autowired
    IServices iServices;
    @PostMapping("/coupon")
    public ResponseCalCupon CalcularCupon (@RequestBody Request request){

    return iServices.calcularService(request);
    }
    @GetMapping("/favoritescoupon")
    public List<Favoritos> getFavoritos() {
        return iServices.getFavoritos();
    }
}
