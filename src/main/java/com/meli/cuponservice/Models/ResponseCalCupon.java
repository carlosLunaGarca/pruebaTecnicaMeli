package com.meli.cuponservice.Models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "item_ids",
        "total"
})
@Generated("jsonschema2pojo")
public class ResponseCalCupon {

    @JsonProperty("item_ids")
    private List<String> itemIds = null;
    @JsonProperty("total")
    private Integer total;
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

    @JsonProperty("total")
    public Integer getAmount() {
        return total;
    }

    @JsonProperty("total")
    public void setAmount(Integer amount) {
        this.total = amount;
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