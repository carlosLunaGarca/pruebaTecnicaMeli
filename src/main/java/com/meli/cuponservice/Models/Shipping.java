
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
    "mode",
    "methods",
    "tags",
    "dimensions",
    "local_pick_up",
    "free_shipping",
    "logistic_type",
    "store_pick_up"
})
@Generated("jsonschema2pojo")
public class Shipping {

    @JsonProperty("mode")
    private String mode;
    @JsonProperty("methods")
    private List<Object> methods = null;
    @JsonProperty("tags")
    private List<String> tags = null;
    @JsonProperty("dimensions")
    private Object dimensions;
    @JsonProperty("local_pick_up")
    private Boolean localPickUp;
    @JsonProperty("free_shipping")
    private Boolean freeShipping;
    @JsonProperty("logistic_type")
    private String logisticType;
    @JsonProperty("store_pick_up")
    private Boolean storePickUp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("mode")
    public String getMode() {
        return mode;
    }

    @JsonProperty("mode")
    public void setMode(String mode) {
        this.mode = mode;
    }

    @JsonProperty("methods")
    public List<Object> getMethods() {
        return methods;
    }

    @JsonProperty("methods")
    public void setMethods(List<Object> methods) {
        this.methods = methods;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("dimensions")
    public Object getDimensions() {
        return dimensions;
    }

    @JsonProperty("dimensions")
    public void setDimensions(Object dimensions) {
        this.dimensions = dimensions;
    }

    @JsonProperty("local_pick_up")
    public Boolean getLocalPickUp() {
        return localPickUp;
    }

    @JsonProperty("local_pick_up")
    public void setLocalPickUp(Boolean localPickUp) {
        this.localPickUp = localPickUp;
    }

    @JsonProperty("free_shipping")
    public Boolean getFreeShipping() {
        return freeShipping;
    }

    @JsonProperty("free_shipping")
    public void setFreeShipping(Boolean freeShipping) {
        this.freeShipping = freeShipping;
    }

    @JsonProperty("logistic_type")
    public String getLogisticType() {
        return logisticType;
    }

    @JsonProperty("logistic_type")
    public void setLogisticType(String logisticType) {
        this.logisticType = logisticType;
    }

    @JsonProperty("store_pick_up")
    public Boolean getStorePickUp() {
        return storePickUp;
    }

    @JsonProperty("store_pick_up")
    public void setStorePickUp(Boolean storePickUp) {
        this.storePickUp = storePickUp;
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
