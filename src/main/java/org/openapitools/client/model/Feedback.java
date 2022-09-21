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
import org.openapitools.client.model.FeedbackFormElement;
import org.openapitools.client.model.FeedbackUrl;

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
 * Feedback for a service
 */
@ApiModel(description = "Feedback for a service")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-21T15:31:26.696+05:30[Asia/Kolkata]")
public class Feedback {
  public static final String SERIALIZED_NAME_FEEDBACK_FORM = "feedback_form";
  @SerializedName(SERIALIZED_NAME_FEEDBACK_FORM)
  private List<FeedbackFormElement> feedbackForm = null;

  public static final String SERIALIZED_NAME_FEEDBACK_URL = "feedback_url";
  @SerializedName(SERIALIZED_NAME_FEEDBACK_URL)
  private FeedbackUrl feedbackUrl;

  public Feedback() {
  }

  public Feedback feedbackForm(List<FeedbackFormElement> feedbackForm) {
    
    this.feedbackForm = feedbackForm;
    return this;
  }

  public Feedback addFeedbackFormItem(FeedbackFormElement feedbackFormItem) {
    if (this.feedbackForm == null) {
      this.feedbackForm = new ArrayList<>();
    }
    this.feedbackForm.add(feedbackFormItem);
    return this;
  }

   /**
   * Describes a feedback form that a Seller App can send to get feedback from the Buyer App
   * @return feedbackForm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describes a feedback form that a Seller App can send to get feedback from the Buyer App")

  public List<FeedbackFormElement> getFeedbackForm() {
    return feedbackForm;
  }


  public void setFeedbackForm(List<FeedbackFormElement> feedbackForm) {
    this.feedbackForm = feedbackForm;
  }


  public Feedback feedbackUrl(FeedbackUrl feedbackUrl) {
    
    this.feedbackUrl = feedbackUrl;
    return this;
  }

   /**
   * Get feedbackUrl
   * @return feedbackUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FeedbackUrl getFeedbackUrl() {
    return feedbackUrl;
  }


  public void setFeedbackUrl(FeedbackUrl feedbackUrl) {
    this.feedbackUrl = feedbackUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Feedback feedback = (Feedback) o;
    return Objects.equals(this.feedbackForm, feedback.feedbackForm) &&
        Objects.equals(this.feedbackUrl, feedback.feedbackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackForm, feedbackUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feedback {\n");
    sb.append("    feedbackForm: ").append(toIndentedString(feedbackForm)).append("\n");
    sb.append("    feedbackUrl: ").append(toIndentedString(feedbackUrl)).append("\n");
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
    openapiFields.add("feedback_form");
    openapiFields.add("feedback_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Feedback
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Feedback.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Feedback is not found in the empty JSON string", Feedback.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Feedback.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Feedback` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayfeedbackForm = jsonObj.getAsJsonArray("feedback_form");
      if (jsonArrayfeedbackForm != null) {
        // ensure the json data is an array
        if (!jsonObj.get("feedback_form").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `feedback_form` to be an array in the JSON string but got `%s`", jsonObj.get("feedback_form").toString()));
        }

        // validate the optional field `feedback_form` (array)
        for (int i = 0; i < jsonArrayfeedbackForm.size(); i++) {
          FeedbackFormElement.validateJsonObject(jsonArrayfeedbackForm.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `feedback_url`
      if (jsonObj.get("feedback_url") != null && !jsonObj.get("feedback_url").isJsonNull()) {
        FeedbackUrl.validateJsonObject(jsonObj.getAsJsonObject("feedback_url"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Feedback.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Feedback' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Feedback> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Feedback.class));

       return (TypeAdapter<T>) new TypeAdapter<Feedback>() {
           @Override
           public void write(JsonWriter out, Feedback value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Feedback read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Feedback given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Feedback
  * @throws IOException if the JSON string is invalid with respect to Feedback
  */
  public static Feedback fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Feedback.class);
  }

 /**
  * Convert an instance of Feedback to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

