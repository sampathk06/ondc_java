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
import org.openapitools.client.model.Scalar;

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
 * Describes the dimensions of a real-world object
 */
@ApiModel(description = "Describes the dimensions of a real-world object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-21T15:31:26.696+05:30[Asia/Kolkata]")
public class Dimensions {
  public static final String SERIALIZED_NAME_LENGTH = "length";
  @SerializedName(SERIALIZED_NAME_LENGTH)
  private Scalar length;

  public static final String SERIALIZED_NAME_BREADTH = "breadth";
  @SerializedName(SERIALIZED_NAME_BREADTH)
  private Scalar breadth;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Scalar height;

  public Dimensions() {
  }

  public Dimensions length(Scalar length) {
    
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Scalar getLength() {
    return length;
  }


  public void setLength(Scalar length) {
    this.length = length;
  }


  public Dimensions breadth(Scalar breadth) {
    
    this.breadth = breadth;
    return this;
  }

   /**
   * Get breadth
   * @return breadth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Scalar getBreadth() {
    return breadth;
  }


  public void setBreadth(Scalar breadth) {
    this.breadth = breadth;
  }


  public Dimensions height(Scalar height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Scalar getHeight() {
    return height;
  }


  public void setHeight(Scalar height) {
    this.height = height;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dimensions dimensions = (Dimensions) o;
    return Objects.equals(this.length, dimensions.length) &&
        Objects.equals(this.breadth, dimensions.breadth) &&
        Objects.equals(this.height, dimensions.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, breadth, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dimensions {\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    breadth: ").append(toIndentedString(breadth)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
    openapiFields.add("length");
    openapiFields.add("breadth");
    openapiFields.add("height");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Dimensions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Dimensions.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dimensions is not found in the empty JSON string", Dimensions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Dimensions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Dimensions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `length`
      if (jsonObj.get("length") != null && !jsonObj.get("length").isJsonNull()) {
        Scalar.validateJsonObject(jsonObj.getAsJsonObject("length"));
      }
      // validate the optional field `breadth`
      if (jsonObj.get("breadth") != null && !jsonObj.get("breadth").isJsonNull()) {
        Scalar.validateJsonObject(jsonObj.getAsJsonObject("breadth"));
      }
      // validate the optional field `height`
      if (jsonObj.get("height") != null && !jsonObj.get("height").isJsonNull()) {
        Scalar.validateJsonObject(jsonObj.getAsJsonObject("height"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dimensions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dimensions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dimensions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dimensions.class));

       return (TypeAdapter<T>) new TypeAdapter<Dimensions>() {
           @Override
           public void write(JsonWriter out, Dimensions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Dimensions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Dimensions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Dimensions
  * @throws IOException if the JSON string is invalid with respect to Dimensions
  */
  public static Dimensions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dimensions.class);
  }

 /**
  * Convert an instance of Dimensions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

