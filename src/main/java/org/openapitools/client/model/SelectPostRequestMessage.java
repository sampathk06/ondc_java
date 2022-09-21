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
import org.openapitools.client.model.Order;

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
 * SelectPostRequestMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-21T15:31:26.696+05:30[Asia/Kolkata]")
public class SelectPostRequestMessage {
  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Order order;

  public SelectPostRequestMessage() {
  }

  public SelectPostRequestMessage order(Order order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Order getOrder() {
    return order;
  }


  public void setOrder(Order order) {
    this.order = order;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectPostRequestMessage selectPostRequestMessage = (SelectPostRequestMessage) o;
    return Objects.equals(this.order, selectPostRequestMessage.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectPostRequestMessage {\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
    openapiFields.add("order");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("order");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SelectPostRequestMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SelectPostRequestMessage.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SelectPostRequestMessage is not found in the empty JSON string", SelectPostRequestMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SelectPostRequestMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SelectPostRequestMessage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SelectPostRequestMessage.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `order`
      if (jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) {
        Order.validateJsonObject(jsonObj.getAsJsonObject("order"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SelectPostRequestMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SelectPostRequestMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SelectPostRequestMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SelectPostRequestMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<SelectPostRequestMessage>() {
           @Override
           public void write(JsonWriter out, SelectPostRequestMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SelectPostRequestMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SelectPostRequestMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SelectPostRequestMessage
  * @throws IOException if the JSON string is invalid with respect to SelectPostRequestMessage
  */
  public static SelectPostRequestMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SelectPostRequestMessage.class);
  }

 /**
  * Convert an instance of SelectPostRequestMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

