
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
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "site_id",
    "title",
    "subtitle",
    "seller_id",
    "category_id",
    "official_store_id",
    "price",
    "base_price",
    "original_price",
    "currency_id",
    "initial_quantity",
    "available_quantity",
    "sold_quantity",
    "sale_terms",
    "buying_mode",
    "listing_type_id",
    "start_time",
    "stop_time",
    "condition",
    "permalink",
    "thumbnail_id",
    "thumbnail",
    "secure_thumbnail",
    "pictures",
    "video_id",
    "descriptions",
    "accepts_mercadopago",
    "non_mercado_pago_payment_methods",
    "shipping",
    "international_delivery_mode",
    "seller_address",
    "seller_contact",
    "location",
    "coverage_areas",
    "attributes",
    "warnings",
    "listing_source",
    "variations",
    "status",
    "sub_status",
    "tags",
    "warranty",
    "catalog_product_id",
    "domain_id",
    "parent_item_id",
    "differential_pricing",
    "deal_ids",
    "automatic_relist",
    "date_created",
    "last_updated",
    "health",
    "catalog_listing",
    "channels"
})
@Data
@Generated("jsonschema2pojo")
public class Body {

    @JsonProperty("id")
    private String id;

    @JsonProperty("price")
    private Integer price;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
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
    @Override
    public String toString() {
        return "id "+ id+" "+" price "+price;
    }

}
