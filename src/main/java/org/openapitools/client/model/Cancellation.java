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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.CancellationSelectedReason;
import org.openapitools.client.model.Descriptor;
import org.openapitools.client.model.Option;
import org.openapitools.client.model.Policy;

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
 * Describes the ACK response
 */
@ApiModel(description = "Describes the ACK response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-21T15:31:26.696+05:30[Asia/Kolkata]")
public class Cancellation {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    FULL("full"),
    
    PARTIAL("partial");

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

  public static final String SERIALIZED_NAME_REF_ID = "ref_id";
  @SerializedName(SERIALIZED_NAME_REF_ID)
  private String refId;

  public static final String SERIALIZED_NAME_POLICIES = "policies";
  @SerializedName(SERIALIZED_NAME_POLICIES)
  private List<Policy> policies = null;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private OffsetDateTime time;

  public static final String SERIALIZED_NAME_CANCELLED_BY = "cancelled_by";
  @SerializedName(SERIALIZED_NAME_CANCELLED_BY)
  private String cancelledBy;

  public static final String SERIALIZED_NAME_REASONS = "reasons";
  @SerializedName(SERIALIZED_NAME_REASONS)
  private Option reasons;

  public static final String SERIALIZED_NAME_SELECTED_REASON = "selected_reason";
  @SerializedName(SERIALIZED_NAME_SELECTED_REASON)
  private CancellationSelectedReason selectedReason;

  public static final String SERIALIZED_NAME_ADDITIONAL_DESCRIPTION = "additional_description";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DESCRIPTION)
  private Descriptor additionalDescription;

  public Cancellation() {
  }

  public Cancellation type(TypeEnum type) {
    
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


  public Cancellation refId(String refId) {
    
    this.refId = refId;
    return this;
  }

   /**
   * Get refId
   * @return refId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRefId() {
    return refId;
  }


  public void setRefId(String refId) {
    this.refId = refId;
  }


  public Cancellation policies(List<Policy> policies) {
    
    this.policies = policies;
    return this;
  }

  public Cancellation addPoliciesItem(Policy policiesItem) {
    if (this.policies == null) {
      this.policies = new ArrayList<>();
    }
    this.policies.add(policiesItem);
    return this;
  }

   /**
   * Get policies
   * @return policies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Policy> getPolicies() {
    return policies;
  }


  public void setPolicies(List<Policy> policies) {
    this.policies = policies;
  }


  public Cancellation time(OffsetDateTime time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getTime() {
    return time;
  }


  public void setTime(OffsetDateTime time) {
    this.time = time;
  }


  public Cancellation cancelledBy(String cancelledBy) {
    
    this.cancelledBy = cancelledBy;
    return this;
  }

   /**
   * Get cancelledBy
   * @return cancelledBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCancelledBy() {
    return cancelledBy;
  }


  public void setCancelledBy(String cancelledBy) {
    this.cancelledBy = cancelledBy;
  }


  public Cancellation reasons(Option reasons) {
    
    this.reasons = reasons;
    return this;
  }

   /**
   * Get reasons
   * @return reasons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Option getReasons() {
    return reasons;
  }


  public void setReasons(Option reasons) {
    this.reasons = reasons;
  }


  public Cancellation selectedReason(CancellationSelectedReason selectedReason) {
    
    this.selectedReason = selectedReason;
    return this;
  }

   /**
   * Get selectedReason
   * @return selectedReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CancellationSelectedReason getSelectedReason() {
    return selectedReason;
  }


  public void setSelectedReason(CancellationSelectedReason selectedReason) {
    this.selectedReason = selectedReason;
  }


  public Cancellation additionalDescription(Descriptor additionalDescription) {
    
    this.additionalDescription = additionalDescription;
    return this;
  }

   /**
   * Get additionalDescription
   * @return additionalDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Descriptor getAdditionalDescription() {
    return additionalDescription;
  }


  public void setAdditionalDescription(Descriptor additionalDescription) {
    this.additionalDescription = additionalDescription;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cancellation cancellation = (Cancellation) o;
    return Objects.equals(this.type, cancellation.type) &&
        Objects.equals(this.refId, cancellation.refId) &&
        Objects.equals(this.policies, cancellation.policies) &&
        Objects.equals(this.time, cancellation.time) &&
        Objects.equals(this.cancelledBy, cancellation.cancelledBy) &&
        Objects.equals(this.reasons, cancellation.reasons) &&
        Objects.equals(this.selectedReason, cancellation.selectedReason) &&
        Objects.equals(this.additionalDescription, cancellation.additionalDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, refId, policies, time, cancelledBy, reasons, selectedReason, additionalDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cancellation {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    refId: ").append(toIndentedString(refId)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    cancelledBy: ").append(toIndentedString(cancelledBy)).append("\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
    sb.append("    selectedReason: ").append(toIndentedString(selectedReason)).append("\n");
    sb.append("    additionalDescription: ").append(toIndentedString(additionalDescription)).append("\n");
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
    openapiFields.add("ref_id");
    openapiFields.add("policies");
    openapiFields.add("time");
    openapiFields.add("cancelled_by");
    openapiFields.add("reasons");
    openapiFields.add("selected_reason");
    openapiFields.add("additional_description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Cancellation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Cancellation.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Cancellation is not found in the empty JSON string", Cancellation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Cancellation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Cancellation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("ref_id") != null && !jsonObj.get("ref_id").isJsonNull()) && !jsonObj.get("ref_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref_id").toString()));
      }
      JsonArray jsonArraypolicies = jsonObj.getAsJsonArray("policies");
      if (jsonArraypolicies != null) {
        // ensure the json data is an array
        if (!jsonObj.get("policies").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `policies` to be an array in the JSON string but got `%s`", jsonObj.get("policies").toString()));
        }

        // validate the optional field `policies` (array)
        for (int i = 0; i < jsonArraypolicies.size(); i++) {
          Policy.validateJsonObject(jsonArraypolicies.get(i).getAsJsonObject());
        };
      }
      if ((jsonObj.get("cancelled_by") != null && !jsonObj.get("cancelled_by").isJsonNull()) && !jsonObj.get("cancelled_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cancelled_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cancelled_by").toString()));
      }
      // validate the optional field `reasons`
      if (jsonObj.get("reasons") != null && !jsonObj.get("reasons").isJsonNull()) {
        Option.validateJsonObject(jsonObj.getAsJsonObject("reasons"));
      }
      // validate the optional field `selected_reason`
      if (jsonObj.get("selected_reason") != null && !jsonObj.get("selected_reason").isJsonNull()) {
        CancellationSelectedReason.validateJsonObject(jsonObj.getAsJsonObject("selected_reason"));
      }
      // validate the optional field `additional_description`
      if (jsonObj.get("additional_description") != null && !jsonObj.get("additional_description").isJsonNull()) {
        Descriptor.validateJsonObject(jsonObj.getAsJsonObject("additional_description"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Cancellation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Cancellation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Cancellation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Cancellation.class));

       return (TypeAdapter<T>) new TypeAdapter<Cancellation>() {
           @Override
           public void write(JsonWriter out, Cancellation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Cancellation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Cancellation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Cancellation
  * @throws IOException if the JSON string is invalid with respect to Cancellation
  */
  public static Cancellation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Cancellation.class);
  }

 /**
  * Convert an instance of Cancellation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

