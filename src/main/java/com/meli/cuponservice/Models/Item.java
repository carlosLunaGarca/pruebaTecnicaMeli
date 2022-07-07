
package com.meli.cuponservice.Models;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "body"
})
@Generated("jsonschema2pojo")
public class Item implements Comparable<Item>  {

    @JsonProperty("code")
    private Integer code;
    @JsonProperty("body")
    private Body body;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    @JsonProperty("body")
    public Body getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(Body body) {
        this.body = body;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


    @Override
    public int compareTo( Item o) {
        if(this.body.getPrice()>o.getBody().getPrice()){
            return 1;
        }else if(this.body.getPrice()<o.getBody().getPrice()){
            return -1;
        }else if(this.body.getPrice()==o.getBody().getPrice()){
            return 0;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Objects.equals(body.getId(), item.body.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(body.getId());
    }
}
