/*
 * Tavus Developer API Collection
 * We're an AI video research company making personalized video possible at scale. Generate videos of yourself, and never record again! Available via web app & developer APIs.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

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
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * VideosCreateVideoFromReplicaAndScriptResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VideosCreateVideoFromReplicaAndScriptResponse {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_HOSTED_URL = "hosted_url";
  @SerializedName(SERIALIZED_NAME_HOSTED_URL)
  private String hostedUrl;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId;

  public static final String SERIALIZED_NAME_VIDEO_NAME = "video_name";
  @SerializedName(SERIALIZED_NAME_VIDEO_NAME)
  private String videoName;

  public VideosCreateVideoFromReplicaAndScriptResponse() {
  }

  public VideosCreateVideoFromReplicaAndScriptResponse createdAt(String createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time the video was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the video was created.")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public VideosCreateVideoFromReplicaAndScriptResponse hostedUrl(String hostedUrl) {
    
    
    
    
    this.hostedUrl = hostedUrl;
    return this;
  }

   /**
   * A direct link to view your video once generation has completed, hosted by Tavus.
   * @return hostedUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A direct link to view your video once generation has completed, hosted by Tavus.")

  public String getHostedUrl() {
    return hostedUrl;
  }


  public void setHostedUrl(String hostedUrl) {
    
    
    
    this.hostedUrl = hostedUrl;
  }


  public VideosCreateVideoFromReplicaAndScriptResponse status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The status of the video.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the video.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public VideosCreateVideoFromReplicaAndScriptResponse videoId(String videoId) {
    
    
    
    
    this.videoId = videoId;
    return this;
  }

   /**
   * A unique identifier for the video.
   * @return videoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier for the video.")

  public String getVideoId() {
    return videoId;
  }


  public void setVideoId(String videoId) {
    
    
    
    this.videoId = videoId;
  }


  public VideosCreateVideoFromReplicaAndScriptResponse videoName(String videoName) {
    
    
    
    
    this.videoName = videoName;
    return this;
  }

   /**
   * The name of the video.
   * @return videoName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the video.")

  public String getVideoName() {
    return videoName;
  }


  public void setVideoName(String videoName) {
    
    
    
    this.videoName = videoName;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the VideosCreateVideoFromReplicaAndScriptResponse instance itself
   */
  public VideosCreateVideoFromReplicaAndScriptResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideosCreateVideoFromReplicaAndScriptResponse videosCreateVideoFromReplicaAndScriptResponse = (VideosCreateVideoFromReplicaAndScriptResponse) o;
    return Objects.equals(this.createdAt, videosCreateVideoFromReplicaAndScriptResponse.createdAt) &&
        Objects.equals(this.hostedUrl, videosCreateVideoFromReplicaAndScriptResponse.hostedUrl) &&
        Objects.equals(this.status, videosCreateVideoFromReplicaAndScriptResponse.status) &&
        Objects.equals(this.videoId, videosCreateVideoFromReplicaAndScriptResponse.videoId) &&
        Objects.equals(this.videoName, videosCreateVideoFromReplicaAndScriptResponse.videoName)&&
        Objects.equals(this.additionalProperties, videosCreateVideoFromReplicaAndScriptResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, hostedUrl, status, videoId, videoName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideosCreateVideoFromReplicaAndScriptResponse {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    hostedUrl: ").append(toIndentedString(hostedUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    videoName: ").append(toIndentedString(videoName)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("hosted_url");
    openapiFields.add("status");
    openapiFields.add("video_id");
    openapiFields.add("video_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VideosCreateVideoFromReplicaAndScriptResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VideosCreateVideoFromReplicaAndScriptResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VideosCreateVideoFromReplicaAndScriptResponse is not found in the empty JSON string", VideosCreateVideoFromReplicaAndScriptResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("hosted_url") != null && !jsonObj.get("hosted_url").isJsonNull()) && !jsonObj.get("hosted_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hosted_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hosted_url").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("video_id") != null && !jsonObj.get("video_id").isJsonNull()) && !jsonObj.get("video_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `video_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("video_id").toString()));
      }
      if ((jsonObj.get("video_name") != null && !jsonObj.get("video_name").isJsonNull()) && !jsonObj.get("video_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `video_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("video_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VideosCreateVideoFromReplicaAndScriptResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VideosCreateVideoFromReplicaAndScriptResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VideosCreateVideoFromReplicaAndScriptResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VideosCreateVideoFromReplicaAndScriptResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<VideosCreateVideoFromReplicaAndScriptResponse>() {
           @Override
           public void write(JsonWriter out, VideosCreateVideoFromReplicaAndScriptResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public VideosCreateVideoFromReplicaAndScriptResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VideosCreateVideoFromReplicaAndScriptResponse instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VideosCreateVideoFromReplicaAndScriptResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VideosCreateVideoFromReplicaAndScriptResponse
  * @throws IOException if the JSON string is invalid with respect to VideosCreateVideoFromReplicaAndScriptResponse
  */
  public static VideosCreateVideoFromReplicaAndScriptResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VideosCreateVideoFromReplicaAndScriptResponse.class);
  }

 /**
  * Convert an instance of VideosCreateVideoFromReplicaAndScriptResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

