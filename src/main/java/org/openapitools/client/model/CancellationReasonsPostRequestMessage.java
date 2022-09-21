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
import org.openapitools.client.model.Option;

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
 * CancellationReasonsPostRequestMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-21T15:31:26.696+05:30[Asia/Kolkata]")
public class CancellationReasonsPostRequestMessage {
  public static final String SERIALIZED_NAME_CANCELLATION_REASONS = "cancellation_reasons";
  @SerializedName(SERIALIZED_NAME_CANCELLATION_REASONS)
  private List<Option> cancellationReasons = null;

  public CancellationReasonsPostRequestMessage() {
  }

  public CancellationReasonsPostRequestMessage cancellationReasons(List<Option> cancellationReasons) {
    
    this.cancellationReasons = cancellationReasons;
    return this;
  }

  public CancellationReasonsPostRequestMessage addCancellationReasonsItem(Option cancellationReasonsItem) {
    if (this.cancellationReasons == null) {
      this.cancellationReasons = new ArrayList<>();
    }
    this.cancellationReasons.add(cancellationReasonsItem);
    return this;
  }

   /**
   * Get cancellationReasons
   * @return cancellationReasons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Option> getCancellationReasons() {
    return cancellationReasons;
  }


  public void setCancellationReasons(List<Option> cancellationReasons) {
    this.cancellationReasons = cancellationReasons;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancellationReasonsPostRequestMessage cancellationReasonsPostRequestMessage = (CancellationReasonsPostRequestMessage) o;
    return Objects.equals(this.cancellationReasons, cancellationReasonsPostRequestMessage.cancellationReasons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancellationReasons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancellationReasonsPostRequestMessage {\n");
    sb.append("    cancellationReasons: ").append(toIndentedString(cancellationReasons)).append("\n");
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
    openapiFields.add("cancellation_reasons");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CancellationReasonsPostRequestMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CancellationReasonsPostRequestMessage.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CancellationReasonsPostRequestMessage is not found in the empty JSON string", CancellationReasonsPostRequestMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CancellationReasonsPostRequestMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CancellationReasonsPostRequestMessage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraycancellationReasons = jsonObj.getAsJsonArray("cancellation_reasons");
      if (jsonArraycancellationReasons != null) {
        // ensure the json data is an array
        if (!jsonObj.get("cancellation_reasons").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `cancellation_reasons` to be an array in the JSON string but got `%s`", jsonObj.get("cancellation_reasons").toString()));
        }

        // validate the optional field `cancellation_reasons` (array)
        for (int i = 0; i < jsonArraycancellationReasons.size(); i++) {
          Option.validateJsonObject(jsonArraycancellationReasons.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CancellationReasonsPostRequestMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CancellationReasonsPostRequestMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CancellationReasonsPostRequestMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CancellationReasonsPostRequestMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<CancellationReasonsPostRequestMessage>() {
           @Override
           public void write(JsonWriter out, CancellationReasonsPostRequestMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CancellationReasonsPostRequestMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CancellationReasonsPostRequestMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CancellationReasonsPostRequestMessage
  * @throws IOException if the JSON string is invalid with respect to CancellationReasonsPostRequestMessage
  */
  public static CancellationReasonsPostRequestMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CancellationReasonsPostRequestMessage.class);
  }

 /**
  * Convert an instance of CancellationReasonsPostRequestMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

