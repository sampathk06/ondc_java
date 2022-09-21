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
 * Describes the price of an item. Allows for domain extension.
 */
@ApiModel(description = "Describes the price of an item. Allows for domain extension.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-21T15:31:26.696+05:30[Asia/Kolkata]")
public class Price {
  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_ESTIMATED_VALUE = "estimated_value";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_VALUE)
  private String estimatedValue;

  public static final String SERIALIZED_NAME_COMPUTED_VALUE = "computed_value";
  @SerializedName(SERIALIZED_NAME_COMPUTED_VALUE)
  private String computedValue;

  public static final String SERIALIZED_NAME_LISTED_VALUE = "listed_value";
  @SerializedName(SERIALIZED_NAME_LISTED_VALUE)
  private String listedValue;

  public static final String SERIALIZED_NAME_OFFERED_VALUE = "offered_value";
  @SerializedName(SERIALIZED_NAME_OFFERED_VALUE)
  private String offeredValue;

  public static final String SERIALIZED_NAME_MINIMUM_VALUE = "minimum_value";
  @SerializedName(SERIALIZED_NAME_MINIMUM_VALUE)
  private String minimumValue;

  public static final String SERIALIZED_NAME_MAXIMUM_VALUE = "maximum_value";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_VALUE)
  private String maximumValue;

  public Price() {
  }

  public Price currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * ISO 4217 alphabetic currency code e.g. &#39;INR&#39;
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO 4217 alphabetic currency code e.g. 'INR'")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Price value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Describes a decimal value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describes a decimal value")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public Price estimatedValue(String estimatedValue) {
    
    this.estimatedValue = estimatedValue;
    return this;
  }

   /**
   * Describes a decimal value
   * @return estimatedValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describes a decimal value")

  public String getEstimatedValue() {
    return estimatedValue;
  }


  public void setEstimatedValue(String estimatedValue) {
    this.estimatedValue = estimatedValue;
  }


  public Price computedValue(String computedValue) {
    
    this.computedValue = computedValue;
    return this;
  }

   /**
   * Describes a decimal value
   * @return computedValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describes a decimal value")

  public String getComputedValue() {
    return computedValue;
  }


  public void setComputedValue(String computedValue) {
    this.computedValue = computedValue;
  }


  public Price listedValue(String listedValue) {
    
    this.listedValue = listedValue;
    return this;
  }

   /**
   * Describes a decimal value
   * @return listedValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describes a decimal value")

  public String getListedValue() {
    return listedValue;
  }


  public void setListedValue(String listedValue) {
    this.listedValue = listedValue;
  }


  public Price offeredValue(String offeredValue) {
    
    this.offeredValue = offeredValue;
    return this;
  }

   /**
   * Describes a decimal value
   * @return offeredValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describes a decimal value")

  public String getOfferedValue() {
    return offeredValue;
  }


  public void setOfferedValue(String offeredValue) {
    this.offeredValue = offeredValue;
  }


  public Price minimumValue(String minimumValue) {
    
    this.minimumValue = minimumValue;
    return this;
  }

   /**
   * Describes a decimal value
   * @return minimumValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describes a decimal value")

  public String getMinimumValue() {
    return minimumValue;
  }


  public void setMinimumValue(String minimumValue) {
    this.minimumValue = minimumValue;
  }


  public Price maximumValue(String maximumValue) {
    
    this.maximumValue = maximumValue;
    return this;
  }

   /**
   * Describes a decimal value
   * @return maximumValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describes a decimal value")

  public String getMaximumValue() {
    return maximumValue;
  }


  public void setMaximumValue(String maximumValue) {
    this.maximumValue = maximumValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Price price = (Price) o;
    return Objects.equals(this.currency, price.currency) &&
        Objects.equals(this.value, price.value) &&
        Objects.equals(this.estimatedValue, price.estimatedValue) &&
        Objects.equals(this.computedValue, price.computedValue) &&
        Objects.equals(this.listedValue, price.listedValue) &&
        Objects.equals(this.offeredValue, price.offeredValue) &&
        Objects.equals(this.minimumValue, price.minimumValue) &&
        Objects.equals(this.maximumValue, price.maximumValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, value, estimatedValue, computedValue, listedValue, offeredValue, minimumValue, maximumValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    estimatedValue: ").append(toIndentedString(estimatedValue)).append("\n");
    sb.append("    computedValue: ").append(toIndentedString(computedValue)).append("\n");
    sb.append("    listedValue: ").append(toIndentedString(listedValue)).append("\n");
    sb.append("    offeredValue: ").append(toIndentedString(offeredValue)).append("\n");
    sb.append("    minimumValue: ").append(toIndentedString(minimumValue)).append("\n");
    sb.append("    maximumValue: ").append(toIndentedString(maximumValue)).append("\n");
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
    openapiFields.add("currency");
    openapiFields.add("value");
    openapiFields.add("estimated_value");
    openapiFields.add("computed_value");
    openapiFields.add("listed_value");
    openapiFields.add("offered_value");
    openapiFields.add("minimum_value");
    openapiFields.add("maximum_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Price
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Price.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Price is not found in the empty JSON string", Price.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Price.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Price` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("estimated_value") != null && !jsonObj.get("estimated_value").isJsonNull()) && !jsonObj.get("estimated_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `estimated_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("estimated_value").toString()));
      }
      if ((jsonObj.get("computed_value") != null && !jsonObj.get("computed_value").isJsonNull()) && !jsonObj.get("computed_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `computed_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("computed_value").toString()));
      }
      if ((jsonObj.get("listed_value") != null && !jsonObj.get("listed_value").isJsonNull()) && !jsonObj.get("listed_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `listed_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("listed_value").toString()));
      }
      if ((jsonObj.get("offered_value") != null && !jsonObj.get("offered_value").isJsonNull()) && !jsonObj.get("offered_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offered_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offered_value").toString()));
      }
      if ((jsonObj.get("minimum_value") != null && !jsonObj.get("minimum_value").isJsonNull()) && !jsonObj.get("minimum_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minimum_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minimum_value").toString()));
      }
      if ((jsonObj.get("maximum_value") != null && !jsonObj.get("maximum_value").isJsonNull()) && !jsonObj.get("maximum_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maximum_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maximum_value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Price.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Price' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Price> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Price.class));

       return (TypeAdapter<T>) new TypeAdapter<Price>() {
           @Override
           public void write(JsonWriter out, Price value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Price read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Price given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Price
  * @throws IOException if the JSON string is invalid with respect to Price
  */
  public static Price fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Price.class);
  }

 /**
  * Convert an instance of Price to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

