/*
 * ONDC Protocol Core API
 * ONDC Protocol Core API specification. This is an adaptation of Beckn Core version 0.9.3
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Descriptor;
import org.openapitools.client.model.Id;
import org.openapitools.client.model.Time;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Describes an offer
 */
@ApiModel(description = "Describes an offer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-21T15:31:26.696+05:30[Asia/Kolkata]")
public class Offer {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTOR = "descriptor";
  @SerializedName(SERIALIZED_NAME_DESCRIPTOR)
  private Descriptor descriptor;

  public static final String SERIALIZED_NAME_LOCATION_IDS = "location_ids";
  @SerializedName(SERIALIZED_NAME_LOCATION_IDS)
  private List<Id> locationIds = null;

  public static final String SERIALIZED_NAME_CATEGORY_IDS = "category_ids";
  @SerializedName(SERIALIZED_NAME_CATEGORY_IDS)
  private List<Id> categoryIds = null;

  public static final String SERIALIZED_NAME_ITEM_IDS = "item_ids";
  @SerializedName(SERIALIZED_NAME_ITEM_IDS)
  private List<Id> itemIds = null;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private Time time;

  public Offer() {
  }

  public Offer id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Offer descriptor(Descriptor descriptor) {
    
    this.descriptor = descriptor;
    return this;
  }

   /**
   * Get descriptor
   * @return descriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Descriptor getDescriptor() {
    return descriptor;
  }


  public void setDescriptor(Descriptor descriptor) {
    this.descriptor = descriptor;
  }


  public Offer locationIds(List<Id> locationIds) {
    
    this.locationIds = locationIds;
    return this;
  }

  public Offer addLocationIdsItem(Id locationIdsItem) {
    if (this.locationIds == null) {
      this.locationIds = new ArrayList<>();
    }
    this.locationIds.add(locationIdsItem);
    return this;
  }

   /**
   * Get locationIds
   * @return locationIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Id> getLocationIds() {
    return locationIds;
  }


  public void setLocationIds(List<Id> locationIds) {
    this.locationIds = locationIds;
  }


  public Offer categoryIds(List<Id> categoryIds) {
    
    this.categoryIds = categoryIds;
    return this;
  }

  public Offer addCategoryIdsItem(Id categoryIdsItem) {
    if (this.categoryIds == null) {
      this.categoryIds = new ArrayList<>();
    }
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

   /**
   * Get categoryIds
   * @return categoryIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Id> getCategoryIds() {
    return categoryIds;
  }


  public void setCategoryIds(List<Id> categoryIds) {
    this.categoryIds = categoryIds;
  }


  public Offer itemIds(List<Id> itemIds) {
    
    this.itemIds = itemIds;
    return this;
  }

  public Offer addItemIdsItem(Id itemIdsItem) {
    if (this.itemIds == null) {
      this.itemIds = new ArrayList<>();
    }
    this.itemIds.add(itemIdsItem);
    return this;
  }

   /**
   * Get itemIds
   * @return itemIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Id> getItemIds() {
    return itemIds;
  }


  public void setItemIds(List<Id> itemIds) {
    this.itemIds = itemIds;
  }


  public Offer time(Time time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Time getTime() {
    return time;
  }


  public void setTime(Time time) {
    this.time = time;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Offer offer = (Offer) o;
    return Objects.equals(this.id, offer.id) &&
        Objects.equals(this.descriptor, offer.descriptor) &&
        Objects.equals(this.locationIds, offer.locationIds) &&
        Objects.equals(this.categoryIds, offer.categoryIds) &&
        Objects.equals(this.itemIds, offer.itemIds) &&
        Objects.equals(this.time, offer.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descriptor, locationIds, categoryIds, itemIds, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Offer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    locationIds: ").append(toIndentedString(locationIds)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("descriptor");
    openapiFields.add("location_ids");
    openapiFields.add("category_ids");
    openapiFields.add("item_ids");
    openapiFields.add("time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Offer
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Offer.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Offer is not found in the empty JSON string", Offer.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Offer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Offer` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `descriptor`
      if (jsonObj.get("descriptor") != null && !jsonObj.get("descriptor").isJsonNull()) {
        Descriptor.validateJsonObject(jsonObj.getAsJsonObject("descriptor"));
      }
      // ensure the json data is an array
      if ((jsonObj.get("location_ids") != null && !jsonObj.get("location_ids").isJsonNull()) && !jsonObj.get("location_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `location_ids` to be an array in the JSON string but got `%s`", jsonObj.get("location_ids").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("category_ids") != null && !jsonObj.get("category_ids").isJsonNull()) && !jsonObj.get("category_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_ids` to be an array in the JSON string but got `%s`", jsonObj.get("category_ids").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("item_ids") != null && !jsonObj.get("item_ids").isJsonNull()) && !jsonObj.get("item_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_ids` to be an array in the JSON string but got `%s`", jsonObj.get("item_ids").toString()));
      }
      // validate the optional field `time`
      if (jsonObj.get("time") != null && !jsonObj.get("time").isJsonNull()) {
        Time.validateJsonObject(jsonObj.getAsJsonObject("time"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Offer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Offer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Offer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Offer.class));

       return (TypeAdapter<T>) new TypeAdapter<Offer>() {
           @Override
           public void write(JsonWriter out, Offer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Offer read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Offer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Offer
  * @throws IOException if the JSON string is invalid with respect to Offer
  */
  public static Offer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Offer.class);
  }

 /**
  * Convert an instance of Offer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

