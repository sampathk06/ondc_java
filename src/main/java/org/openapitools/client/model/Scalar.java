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
import java.math.BigDecimal;
import org.openapitools.client.model.ScalarRange;

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
 * An object representing a scalar quantity.
 */
@ApiModel(description = "An object representing a scalar quantity.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-21T15:31:26.696+05:30[Asia/Kolkata]")
public class Scalar {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CONSTANT("CONSTANT"),
    
    VARIABLE("VARIABLE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private BigDecimal value;

  public static final String SERIALIZED_NAME_ESTIMATED_VALUE = "estimated_value";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_VALUE)
  private BigDecimal estimatedValue;

  public static final String SERIALIZED_NAME_COMPUTED_VALUE = "computed_value";
  @SerializedName(SERIALIZED_NAME_COMPUTED_VALUE)
  private BigDecimal computedValue;

  public static final String SERIALIZED_NAME_RANGE = "range";
  @SerializedName(SERIALIZED_NAME_RANGE)
  private ScalarRange range;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public Scalar() {
  }

  public Scalar type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Scalar value(BigDecimal value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getValue() {
    return value;
  }


  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public Scalar estimatedValue(BigDecimal estimatedValue) {
    
    this.estimatedValue = estimatedValue;
    return this;
  }

   /**
   * Get estimatedValue
   * @return estimatedValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getEstimatedValue() {
    return estimatedValue;
  }


  public void setEstimatedValue(BigDecimal estimatedValue) {
    this.estimatedValue = estimatedValue;
  }


  public Scalar computedValue(BigDecimal computedValue) {
    
    this.computedValue = computedValue;
    return this;
  }

   /**
   * Get computedValue
   * @return computedValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getComputedValue() {
    return computedValue;
  }


  public void setComputedValue(BigDecimal computedValue) {
    this.computedValue = computedValue;
  }


  public Scalar range(ScalarRange range) {
    
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScalarRange getRange() {
    return range;
  }


  public void setRange(ScalarRange range) {
    this.range = range;
  }


  public Scalar unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scalar scalar = (Scalar) o;
    return Objects.equals(this.type, scalar.type) &&
        Objects.equals(this.value, scalar.value) &&
        Objects.equals(this.estimatedValue, scalar.estimatedValue) &&
        Objects.equals(this.computedValue, scalar.computedValue) &&
        Objects.equals(this.range, scalar.range) &&
        Objects.equals(this.unit, scalar.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value, estimatedValue, computedValue, range, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scalar {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    estimatedValue: ").append(toIndentedString(estimatedValue)).append("\n");
    sb.append("    computedValue: ").append(toIndentedString(computedValue)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("value");
    openapiFields.add("estimated_value");
    openapiFields.add("computed_value");
    openapiFields.add("range");
    openapiFields.add("unit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("value");
    openapiRequiredFields.add("unit");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Scalar
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Scalar.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Scalar is not found in the empty JSON string", Scalar.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Scalar.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Scalar` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Scalar.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `range`
      if (jsonObj.get("range") != null && !jsonObj.get("range").isJsonNull()) {
        ScalarRange.validateJsonObject(jsonObj.getAsJsonObject("range"));
      }
      if ((jsonObj.get("unit") != null && !jsonObj.get("unit").isJsonNull()) && !jsonObj.get("unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Scalar.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Scalar' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Scalar> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Scalar.class));

       return (TypeAdapter<T>) new TypeAdapter<Scalar>() {
           @Override
           public void write(JsonWriter out, Scalar value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Scalar read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Scalar given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Scalar
  * @throws IOException if the JSON string is invalid with respect to Scalar
  */
  public static Scalar fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Scalar.class);
  }

 /**
  * Convert an instance of Scalar to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

