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
import com.konfigthis.client.model.VideosGetByVideoIdResponseData;
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
 * VideosGetByVideoIdResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VideosGetByVideoIdResponse {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private VideosGetByVideoIdResponseData data;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "download_url";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private String downloadUrl;

  public static final String SERIALIZED_NAME_HOSTED_URL = "hosted_url";
  @SerializedName(SERIALIZED_NAME_HOSTED_URL)
  private String hostedUrl;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STATUS_DETAILS = "status_details";
  @SerializedName(SERIALIZED_NAME_STATUS_DETAILS)
  private String statusDetails;

  public static final String SERIALIZED_NAME_STREAM_URL = "stream_url";
  @SerializedName(SERIALIZED_NAME_STREAM_URL)
  private String streamUrl;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId;

  public VideosGetByVideoIdResponse() {
  }

  public VideosGetByVideoIdResponse createdAt(String createdAt) {
    
    
    
    
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


  public VideosGetByVideoIdResponse data(VideosGetByVideoIdResponseData data) {
    
    
    
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VideosGetByVideoIdResponseData getData() {
    return data;
  }


  public void setData(VideosGetByVideoIdResponseData data) {
    
    
    
    this.data = data;
  }


  public VideosGetByVideoIdResponse downloadUrl(String downloadUrl) {
    
    
    
    
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * A direct link to download your generated video.
   * @return downloadUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A direct link to download your generated video.")

  public String getDownloadUrl() {
    return downloadUrl;
  }


  public void setDownloadUrl(String downloadUrl) {
    
    
    
    this.downloadUrl = downloadUrl;
  }


  public VideosGetByVideoIdResponse hostedUrl(String hostedUrl) {
    
    
    
    
    this.hostedUrl = hostedUrl;
    return this;
  }

   /**
   * A direct link to view your generated video, hosted by Tavus.
   * @return hostedUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A direct link to view your generated video, hosted by Tavus.")

  public String getHostedUrl() {
    return hostedUrl;
  }


  public void setHostedUrl(String hostedUrl) {
    
    
    
    this.hostedUrl = hostedUrl;
  }


  public VideosGetByVideoIdResponse status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The status of the video.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ready", value = "The status of the video.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public VideosGetByVideoIdResponse statusDetails(String statusDetails) {
    
    
    
    
    this.statusDetails = statusDetails;
    return this;
  }

   /**
   * A detailed status of the video.
   * @return statusDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A detailed status of the video.")

  public String getStatusDetails() {
    return statusDetails;
  }


  public void setStatusDetails(String statusDetails) {
    
    
    
    this.statusDetails = statusDetails;
  }


  public VideosGetByVideoIdResponse streamUrl(String streamUrl) {
    
    
    
    
    this.streamUrl = streamUrl;
    return this;
  }

   /**
   * A direct link to stream your generated video.
   * @return streamUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A direct link to stream your generated video.")

  public String getStreamUrl() {
    return streamUrl;
  }


  public void setStreamUrl(String streamUrl) {
    
    
    
    this.streamUrl = streamUrl;
  }


  public VideosGetByVideoIdResponse updatedAt(String updatedAt) {
    
    
    
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time of when the video was last updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time of when the video was last updated.")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    
    
    
    this.updatedAt = updatedAt;
  }


  public VideosGetByVideoIdResponse videoId(String videoId) {
    
    
    
    
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
   * @return the VideosGetByVideoIdResponse instance itself
   */
  public VideosGetByVideoIdResponse putAdditionalProperty(String key, Object value) {
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
    VideosGetByVideoIdResponse videosGetByVideoIdResponse = (VideosGetByVideoIdResponse) o;
    return Objects.equals(this.createdAt, videosGetByVideoIdResponse.createdAt) &&
        Objects.equals(this.data, videosGetByVideoIdResponse.data) &&
        Objects.equals(this.downloadUrl, videosGetByVideoIdResponse.downloadUrl) &&
        Objects.equals(this.hostedUrl, videosGetByVideoIdResponse.hostedUrl) &&
        Objects.equals(this.status, videosGetByVideoIdResponse.status) &&
        Objects.equals(this.statusDetails, videosGetByVideoIdResponse.statusDetails) &&
        Objects.equals(this.streamUrl, videosGetByVideoIdResponse.streamUrl) &&
        Objects.equals(this.updatedAt, videosGetByVideoIdResponse.updatedAt) &&
        Objects.equals(this.videoId, videosGetByVideoIdResponse.videoId)&&
        Objects.equals(this.additionalProperties, videosGetByVideoIdResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, data, downloadUrl, hostedUrl, status, statusDetails, streamUrl, updatedAt, videoId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideosGetByVideoIdResponse {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    hostedUrl: ").append(toIndentedString(hostedUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n");
    sb.append("    streamUrl: ").append(toIndentedString(streamUrl)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("download_url");
    openapiFields.add("hosted_url");
    openapiFields.add("status");
    openapiFields.add("status_details");
    openapiFields.add("stream_url");
    openapiFields.add("updated_at");
    openapiFields.add("video_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VideosGetByVideoIdResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VideosGetByVideoIdResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VideosGetByVideoIdResponse is not found in the empty JSON string", VideosGetByVideoIdResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      // validate the optional field `data`
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        VideosGetByVideoIdResponseData.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
      if ((jsonObj.get("download_url") != null && !jsonObj.get("download_url").isJsonNull()) && !jsonObj.get("download_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `download_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("download_url").toString()));
      }
      if ((jsonObj.get("hosted_url") != null && !jsonObj.get("hosted_url").isJsonNull()) && !jsonObj.get("hosted_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hosted_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hosted_url").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("status_details") != null && !jsonObj.get("status_details").isJsonNull()) && !jsonObj.get("status_details").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_details` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status_details").toString()));
      }
      if ((jsonObj.get("stream_url") != null && !jsonObj.get("stream_url").isJsonNull()) && !jsonObj.get("stream_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stream_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stream_url").toString()));
      }
      if ((jsonObj.get("updated_at") != null && !jsonObj.get("updated_at").isJsonNull()) && !jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
      if ((jsonObj.get("video_id") != null && !jsonObj.get("video_id").isJsonNull()) && !jsonObj.get("video_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `video_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("video_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VideosGetByVideoIdResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VideosGetByVideoIdResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VideosGetByVideoIdResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VideosGetByVideoIdResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<VideosGetByVideoIdResponse>() {
           @Override
           public void write(JsonWriter out, VideosGetByVideoIdResponse value) throws IOException {
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
           public VideosGetByVideoIdResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VideosGetByVideoIdResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VideosGetByVideoIdResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VideosGetByVideoIdResponse
  * @throws IOException if the JSON string is invalid with respect to VideosGetByVideoIdResponse
  */
  public static VideosGetByVideoIdResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VideosGetByVideoIdResponse.class);
  }

 /**
  * Convert an instance of VideosGetByVideoIdResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

