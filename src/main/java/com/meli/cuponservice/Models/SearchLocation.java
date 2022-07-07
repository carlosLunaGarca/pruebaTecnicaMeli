
package com.meli.cuponservice.Models;

import java.util.HashMap;
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
    "neighborhood",
    "city",
    "state"
})
@Generated("jsonschema2pojo")
public class SearchLocation {

    @JsonProperty("neighborhood")
    private Neighborhood neighborhood;
    @JsonProperty("city")
    private City__1 city;
    @JsonProperty("state")
    private State__1 state;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("neighborhood")
    public Neighborhood getNeighborhood() {
        return neighborhood;
    }

    @JsonProperty("neighborhood")
    public void setNeighborhood(Neighborhood neighborhood) {
        this.neighborhood = neighborhood;
    }

    @JsonProperty("city")
    public City__1 getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(City__1 city) {
        this.city = city;
    }

    @JsonProperty("state")
    public State__1 getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(State__1 state) {
        this.state = state;
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
