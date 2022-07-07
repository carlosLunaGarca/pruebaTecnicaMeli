
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
    "city",
    "state",
    "country",
    "search_location",
    "id"
})
@Generated("jsonschema2pojo")
public class SellerAddress {

    @JsonProperty("city")
    private City city;
    @JsonProperty("state")
    private State state;
    @JsonProperty("country")
    private Country country;
    @JsonProperty("search_location")
    private SearchLocation searchLocation;
    @JsonProperty("id")
    private Integer id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("city")
    public City getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(City city) {
        this.city = city;
    }

    @JsonProperty("state")
    public State getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(State state) {
        this.state = state;
    }

    @JsonProperty("country")
    public Country getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(Country country) {
        this.country = country;
    }

    @JsonProperty("search_location")
    public SearchLocation getSearchLocation() {
        return searchLocation;
    }

    @JsonProperty("search_location")
    public void setSearchLocation(SearchLocation searchLocation) {
        this.searchLocation = searchLocation;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
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
