package com.meli.cuponservice.WebClients;

import com.meli.cuponservice.Models.Item;
import com.meli.cuponservice.Models.Response;

import java.util.List;

public interface IWebClient {
     Response<List<Item>> getItems(List<String> ItemsId);
}
