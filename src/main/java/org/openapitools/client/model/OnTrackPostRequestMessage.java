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
import org.openapitools.client.model.Tracking;

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
 * OnTrackPostRequestMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-21T15:31:26.696+05:30[Asia/Kolkata]")
public class OnTrackPostRequestMessage {
  public static final String SERIALIZED_NAME_TRACKING = "tracking";
  @SerializedName(SERIALIZED_NAME_TRACKING)
  private Tracking tracking;

  public OnTrackPostRequestMessage() {
  }

  public OnTrackPostRequestMessage tracking(Tracking tracking) {
    
    this.tracking = tracking;
    return this;
  }

   /**
   * Get tracking
   * @return tracking
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Tracking getTracking() {
    return tracking;
  }


  public void setTracking(Tracking tracking) {
    this.tracking = tracking;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnTrackPostRequestMessage onTrackPostRequestMessage = (OnTrackPostRequestMessage) o;
    return Objects.equals(this.tracking, onTrackPostRequestMessage.tracking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tracking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnTrackPostRequestMessage {\n");
    sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
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
    openapiFields.add("tracking");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tracking");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OnTrackPostRequestMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OnTrackPostRequestMessage.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnTrackPostRequestMessage is not found in the empty JSON string", OnTrackPostRequestMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OnTrackPostRequestMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OnTrackPostRequestMessage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OnTrackPostRequestMessage.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `tracking`
      if (jsonObj.get("tracking") != null && !jsonObj.get("tracking").isJsonNull()) {
        Tracking.validateJsonObject(jsonObj.getAsJsonObject("tracking"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnTrackPostRequestMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnTrackPostRequestMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnTrackPostRequestMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnTrackPostRequestMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<OnTrackPostRequestMessage>() {
           @Override
           public void write(JsonWriter out, OnTrackPostRequestMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OnTrackPostRequestMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OnTrackPostRequestMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OnTrackPostRequestMessage
  * @throws IOException if the JSON string is invalid with respect to OnTrackPostRequestMessage
  */
  public static OnTrackPostRequestMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnTrackPostRequestMessage.class);
  }

 /**
  * Convert an instance of OnTrackPostRequestMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

