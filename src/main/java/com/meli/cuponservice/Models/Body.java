
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
@Generated("jsonschema2pojo")
public class Body {

    @JsonProperty("id")
    private String id;
    @JsonProperty("site_id")
    private String siteId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("subtitle")
    private Object subtitle;
    @JsonProperty("seller_id")
    private Integer sellerId;
    @JsonProperty("category_id")
    private String categoryId;
    @JsonProperty("official_store_id")
    private Integer officialStoreId;
    @JsonProperty("price")
    private Integer price;
    @JsonProperty("base_price")
    private Integer basePrice;
    @JsonProperty("original_price")
    private Object originalPrice;
    @JsonProperty("currency_id")
    private String currencyId;
    @JsonProperty("initial_quantity")
    private Integer initialQuantity;
    @JsonProperty("available_quantity")
    private Integer availableQuantity;
    @JsonProperty("sold_quantity")
    private Integer soldQuantity;
    @JsonProperty("sale_terms")
    private List<Object> saleTerms = null;
    @JsonProperty("buying_mode")
    private String buyingMode;
    @JsonProperty("listing_type_id")
    private String listingTypeId;
    @JsonProperty("start_time")
    private String startTime;
    @JsonProperty("stop_time")
    private String stopTime;
    @JsonProperty("condition")
    private String condition;
    @JsonProperty("permalink")
    private String permalink;
    @JsonProperty("thumbnail_id")
    private String thumbnailId;
    @JsonProperty("thumbnail")
    private String thumbnail;
    @JsonProperty("secure_thumbnail")
    private String secureThumbnail;
    @JsonProperty("pictures")
    private List<Object> pictures = null;
    @JsonProperty("video_id")
    private Object videoId;
    @JsonProperty("descriptions")
    private List<Object> descriptions = null;
    @JsonProperty("accepts_mercadopago")
    private Boolean acceptsMercadopago;
    @JsonProperty("non_mercado_pago_payment_methods")
    private List<Object> nonMercadoPagoPaymentMethods = null;
    @JsonProperty("shipping")
    private Shipping shipping;
    @JsonProperty("international_delivery_mode")
    private String internationalDeliveryMode;
    @JsonProperty("seller_address")
    private SellerAddress sellerAddress;
    @JsonProperty("seller_contact")
    private Object sellerContact;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("coverage_areas")
    private List<Object> coverageAreas = null;
    @JsonProperty("attributes")
    private List<Object> attributes = null;
    @JsonProperty("warnings")
    private List<Object> warnings = null;
    @JsonProperty("listing_source")
    private String listingSource;
    @JsonProperty("variations")
    private List<Object> variations = null;
    @JsonProperty("status")
    private String status;
    @JsonProperty("sub_status")
    private List<Object> subStatus = null;
    @JsonProperty("tags")
    private List<String> tags = null;
    @JsonProperty("warranty")
    private String warranty;
    @JsonProperty("catalog_product_id")
    private String catalogProductId;
    @JsonProperty("domain_id")
    private String domainId;
    @JsonProperty("parent_item_id")
    private Object parentItemId;
    @JsonProperty("differential_pricing")
    private Object differentialPricing;
    @JsonProperty("deal_ids")
    private List<Object> dealIds = null;
    @JsonProperty("automatic_relist")
    private Boolean automaticRelist;
    @JsonProperty("date_created")
    private String dateCreated;
    @JsonProperty("last_updated")
    private String lastUpdated;
    @JsonProperty("health")
    private Object health;
    @JsonProperty("catalog_listing")
    private Boolean catalogListing;
    @JsonProperty("channels")
    private List<String> channels = null;
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

    @JsonProperty("site_id")
    public String getSiteId() {
        return siteId;
    }

    @JsonProperty("site_id")
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("subtitle")
    public Object getSubtitle() {
        return subtitle;
    }

    @JsonProperty("subtitle")
    public void setSubtitle(Object subtitle) {
        this.subtitle = subtitle;
    }

    @JsonProperty("seller_id")
    public Integer getSellerId() {
        return sellerId;
    }

    @JsonProperty("seller_id")
    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    @JsonProperty("category_id")
    public String getCategoryId() {
        return categoryId;
    }

    @JsonProperty("category_id")
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    @JsonProperty("official_store_id")
    public Integer getOfficialStoreId() {
        return officialStoreId;
    }

    @JsonProperty("official_store_id")
    public void setOfficialStoreId(Integer officialStoreId) {
        this.officialStoreId = officialStoreId;
    }

    @JsonProperty("price")
    public Integer getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Integer price) {
        this.price = price;
    }

    @JsonProperty("base_price")
    public Integer getBasePrice() {
        return basePrice;
    }

    @JsonProperty("base_price")
    public void setBasePrice(Integer basePrice) {
        this.basePrice = basePrice;
    }

    @JsonProperty("original_price")
    public Object getOriginalPrice() {
        return originalPrice;
    }

    @JsonProperty("original_price")
    public void setOriginalPrice(Object originalPrice) {
        this.originalPrice = originalPrice;
    }

    @JsonProperty("currency_id")
    public String getCurrencyId() {
        return currencyId;
    }

    @JsonProperty("currency_id")
    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    @JsonProperty("initial_quantity")
    public Integer getInitialQuantity() {
        return initialQuantity;
    }

    @JsonProperty("initial_quantity")
    public void setInitialQuantity(Integer initialQuantity) {
        this.initialQuantity = initialQuantity;
    }

    @JsonProperty("available_quantity")
    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    @JsonProperty("available_quantity")
    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    @JsonProperty("sold_quantity")
    public Integer getSoldQuantity() {
        return soldQuantity;
    }

    @JsonProperty("sold_quantity")
    public void setSoldQuantity(Integer soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    @JsonProperty("sale_terms")
    public List<Object> getSaleTerms() {
        return saleTerms;
    }

    @JsonProperty("sale_terms")
    public void setSaleTerms(List<Object> saleTerms) {
        this.saleTerms = saleTerms;
    }

    @JsonProperty("buying_mode")
    public String getBuyingMode() {
        return buyingMode;
    }

    @JsonProperty("buying_mode")
    public void setBuyingMode(String buyingMode) {
        this.buyingMode = buyingMode;
    }

    @JsonProperty("listing_type_id")
    public String getListingTypeId() {
        return listingTypeId;
    }

    @JsonProperty("listing_type_id")
    public void setListingTypeId(String listingTypeId) {
        this.listingTypeId = listingTypeId;
    }

    @JsonProperty("start_time")
    public String getStartTime() {
        return startTime;
    }

    @JsonProperty("start_time")
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @JsonProperty("stop_time")
    public String getStopTime() {
        return stopTime;
    }

    @JsonProperty("stop_time")
    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    @JsonProperty("condition")
    public String getCondition() {
        return condition;
    }

    @JsonProperty("condition")
    public void setCondition(String condition) {
        this.condition = condition;
    }

    @JsonProperty("permalink")
    public String getPermalink() {
        return permalink;
    }

    @JsonProperty("permalink")
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    @JsonProperty("thumbnail_id")
    public String getThumbnailId() {
        return thumbnailId;
    }

    @JsonProperty("thumbnail_id")
    public void setThumbnailId(String thumbnailId) {
        this.thumbnailId = thumbnailId;
    }

    @JsonProperty("thumbnail")
    public String getThumbnail() {
        return thumbnail;
    }

    @JsonProperty("thumbnail")
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @JsonProperty("secure_thumbnail")
    public String getSecureThumbnail() {
        return secureThumbnail;
    }

    @JsonProperty("secure_thumbnail")
    public void setSecureThumbnail(String secureThumbnail) {
        this.secureThumbnail = secureThumbnail;
    }

    @JsonProperty("pictures")
    public List<Object> getPictures() {
        return pictures;
    }

    @JsonProperty("pictures")
    public void setPictures(List<Object> pictures) {
        this.pictures = pictures;
    }

    @JsonProperty("video_id")
    public Object getVideoId() {
        return videoId;
    }

    @JsonProperty("video_id")
    public void setVideoId(Object videoId) {
        this.videoId = videoId;
    }

    @JsonProperty("descriptions")
    public List<Object> getDescriptions() {
        return descriptions;
    }

    @JsonProperty("descriptions")
    public void setDescriptions(List<Object> descriptions) {
        this.descriptions = descriptions;
    }

    @JsonProperty("accepts_mercadopago")
    public Boolean getAcceptsMercadopago() {
        return acceptsMercadopago;
    }

    @JsonProperty("accepts_mercadopago")
    public void setAcceptsMercadopago(Boolean acceptsMercadopago) {
        this.acceptsMercadopago = acceptsMercadopago;
    }

    @JsonProperty("non_mercado_pago_payment_methods")
    public List<Object> getNonMercadoPagoPaymentMethods() {
        return nonMercadoPagoPaymentMethods;
    }

    @JsonProperty("non_mercado_pago_payment_methods")
    public void setNonMercadoPagoPaymentMethods(List<Object> nonMercadoPagoPaymentMethods) {
        this.nonMercadoPagoPaymentMethods = nonMercadoPagoPaymentMethods;
    }

    @JsonProperty("shipping")
    public Shipping getShipping() {
        return shipping;
    }

    @JsonProperty("shipping")
    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    @JsonProperty("international_delivery_mode")
    public String getInternationalDeliveryMode() {
        return internationalDeliveryMode;
    }

    @JsonProperty("international_delivery_mode")
    public void setInternationalDeliveryMode(String internationalDeliveryMode) {
        this.internationalDeliveryMode = internationalDeliveryMode;
    }

    @JsonProperty("seller_address")
    public SellerAddress getSellerAddress() {
        return sellerAddress;
    }

    @JsonProperty("seller_address")
    public void setSellerAddress(SellerAddress sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    @JsonProperty("seller_contact")
    public Object getSellerContact() {
        return sellerContact;
    }

    @JsonProperty("seller_contact")
    public void setSellerContact(Object sellerContact) {
        this.sellerContact = sellerContact;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("coverage_areas")
    public List<Object> getCoverageAreas() {
        return coverageAreas;
    }

    @JsonProperty("coverage_areas")
    public void setCoverageAreas(List<Object> coverageAreas) {
        this.coverageAreas = coverageAreas;
    }

    @JsonProperty("attributes")
    public List<Object> getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(List<Object> attributes) {
        this.attributes = attributes;
    }

    @JsonProperty("warnings")
    public List<Object> getWarnings() {
        return warnings;
    }

    @JsonProperty("warnings")
    public void setWarnings(List<Object> warnings) {
        this.warnings = warnings;
    }

    @JsonProperty("listing_source")
    public String getListingSource() {
        return listingSource;
    }

    @JsonProperty("listing_source")
    public void setListingSource(String listingSource) {
        this.listingSource = listingSource;
    }

    @JsonProperty("variations")
    public List<Object> getVariations() {
        return variations;
    }

    @JsonProperty("variations")
    public void setVariations(List<Object> variations) {
        this.variations = variations;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("sub_status")
    public List<Object> getSubStatus() {
        return subStatus;
    }

    @JsonProperty("sub_status")
    public void setSubStatus(List<Object> subStatus) {
        this.subStatus = subStatus;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("warranty")
    public String getWarranty() {
        return warranty;
    }

    @JsonProperty("warranty")
    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    @JsonProperty("catalog_product_id")
    public String getCatalogProductId() {
        return catalogProductId;
    }

    @JsonProperty("catalog_product_id")
    public void setCatalogProductId(String catalogProductId) {
        this.catalogProductId = catalogProductId;
    }

    @JsonProperty("domain_id")
    public String getDomainId() {
        return domainId;
    }

    @JsonProperty("domain_id")
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    @JsonProperty("parent_item_id")
    public Object getParentItemId() {
        return parentItemId;
    }

    @JsonProperty("parent_item_id")
    public void setParentItemId(Object parentItemId) {
        this.parentItemId = parentItemId;
    }

    @JsonProperty("differential_pricing")
    public Object getDifferentialPricing() {
        return differentialPricing;
    }

    @JsonProperty("differential_pricing")
    public void setDifferentialPricing(Object differentialPricing) {
        this.differentialPricing = differentialPricing;
    }

    @JsonProperty("deal_ids")
    public List<Object> getDealIds() {
        return dealIds;
    }

    @JsonProperty("deal_ids")
    public void setDealIds(List<Object> dealIds) {
        this.dealIds = dealIds;
    }

    @JsonProperty("automatic_relist")
    public Boolean getAutomaticRelist() {
        return automaticRelist;
    }

    @JsonProperty("automatic_relist")
    public void setAutomaticRelist(Boolean automaticRelist) {
        this.automaticRelist = automaticRelist;
    }

    @JsonProperty("date_created")
    public String getDateCreated() {
        return dateCreated;
    }

    @JsonProperty("date_created")
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @JsonProperty("last_updated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("last_updated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @JsonProperty("health")
    public Object getHealth() {
        return health;
    }

    @JsonProperty("health")
    public void setHealth(Object health) {
        this.health = health;
    }

    @JsonProperty("catalog_listing")
    public Boolean getCatalogListing() {
        return catalogListing;
    }

    @JsonProperty("catalog_listing")
    public void setCatalogListing(Boolean catalogListing) {
        this.catalogListing = catalogListing;
    }

    @JsonProperty("channels")
    public List<String> getChannels() {
        return channels;
    }

    @JsonProperty("channels")
    public void setChannels(List<String> channels) {
        this.channels = channels;
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
