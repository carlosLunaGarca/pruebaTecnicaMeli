package com.meli.cuponservice.Utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Constans {
    @Value("${constant.url.MeliUrl}")
    public String URLMELI;
}
