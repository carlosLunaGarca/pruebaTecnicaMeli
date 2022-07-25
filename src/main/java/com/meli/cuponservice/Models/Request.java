package com.meli.cuponservice.Models;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "item_ids",
        "amount"
})
@Generated("jsonschema2pojo")
public class Request {

    @JsonProperty("item_ids")
    private List<String> itemIds = null;
    @JsonProperty("amount")
    private Integer amount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("item_ids")
    public List<String> getItemIds() {
        return itemIds;
    }

    @JsonProperty("item_ids")
    public void setItemIds(List<String> itemIds) {
        this.itemIds = itemIds;
    }

    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}