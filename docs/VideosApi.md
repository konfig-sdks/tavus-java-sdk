# VideosApi

All URIs are relative to *https://tavusapi.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createVideoFromReplicaAndScript**](VideosApi.md#createVideoFromReplicaAndScript) | **POST** /v2/videos | Generate Video |
| [**deleteByVideoId**](VideosApi.md#deleteByVideoId) | **DELETE** /v2/videos/{video_id} | Delete Video |
| [**getAll**](VideosApi.md#getAll) | **GET** /v2/videos | List Videos |
| [**getByVideoId**](VideosApi.md#getByVideoId) | **GET** /v2/videos/{video_id} | Get Video |
| [**updateName**](VideosApi.md#updateName) | **PATCH** /v2/videos/{video_id}/name | Rename Video |


<a name="createVideoFromReplicaAndScript"></a>
# **createVideoFromReplicaAndScript**
> VideosCreateVideoFromReplicaAndScriptResponse createVideoFromReplicaAndScript().videosCreateVideoFromReplicaAndScriptRequest(videosCreateVideoFromReplicaAndScriptRequest).execute();

Generate Video

This endpoint generates a new video using a Replica and a script.   The only required body parameters are &#x60;replica_id&#x60; and &#x60;script&#x60;. The &#x60;replica_id&#x60; is a unique identifier for the Replica that will be used to generate the video. The &#x60;script&#x60; is the text that will be spoken by the Replica in the video.  If a &#x60;background_url&#x60; is provided, Tavus will record a video of the website and use it as the background for the video. If a &#x60;background_source_url&#x60; is provided, where the URL points to a download link such as a presigned S3 URL, Tavus will use the video as the background for the video. If neither are provided, the video will consist of a full screen Replica.  To learn more about generating videos with Replicas, see [here](https://docs.tavusapi.com/api-reference).  To learn more about writing an effective script for your video, see [Scripting prompting](https://docs.tavusapi.com/api-reference). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tavus;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://tavusapi.com";
    
    configuration.apiKey  = "YOUR API KEY";
    Tavus client = new Tavus(configuration);
    String replicaId = "replicaId_example"; // A unique identifier for the replica that will be used to generate the video.
    String script = "script_example"; // A script to be used for the video.
    String backgroundSourceUrl = "backgroundSourceUrl_example"; // A direct link to a video that is publicly accessible via a storage location such as an S3 bucket. This will be used as the background for the video. The video must be publicly accessible.
    String backgroundUrl = "backgroundUrl_example"; // A link to a website. This will be used as the background for the video. The website must be publicly accessible and properly formed.
    String videoName = "videoName_example"; // A name for the video.
    try {
      VideosCreateVideoFromReplicaAndScriptResponse result = client
              .videos
              .createVideoFromReplicaAndScript(replicaId, script)
              .backgroundSourceUrl(backgroundSourceUrl)
              .backgroundUrl(backgroundUrl)
              .videoName(videoName)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreatedAt());
      System.out.println(result.getHostedUrl());
      System.out.println(result.getStatus());
      System.out.println(result.getVideoId());
      System.out.println(result.getVideoName());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#createVideoFromReplicaAndScript");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VideosCreateVideoFromReplicaAndScriptResponse> response = client
              .videos
              .createVideoFromReplicaAndScript(replicaId, script)
              .backgroundSourceUrl(backgroundSourceUrl)
              .backgroundUrl(backgroundUrl)
              .videoName(videoName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#createVideoFromReplicaAndScript");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videosCreateVideoFromReplicaAndScriptRequest** | [**VideosCreateVideoFromReplicaAndScriptRequest**](VideosCreateVideoFromReplicaAndScriptRequest.md)|  | [optional] |

### Return type

[**VideosCreateVideoFromReplicaAndScriptResponse**](VideosCreateVideoFromReplicaAndScriptResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="deleteByVideoId"></a>
# **deleteByVideoId**
> deleteByVideoId(videoId).execute();

Delete Video

This endpoint deletes a single video by its unique identifier. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tavus;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://tavusapi.com";
    
    configuration.apiKey  = "YOUR API KEY";
    Tavus client = new Tavus(configuration);
    String videoId = "videoId_example";
    try {
      client
              .videos
              .deleteByVideoId(videoId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#deleteByVideoId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .videos
              .deleteByVideoId(videoId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#deleteByVideoId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getAll"></a>
# **getAll**
> VideosGetAllResponse getAll().execute();

List Videos

This endpoint returns a list of all videos that have been generated by the API Key in use.  

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tavus;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://tavusapi.com";
    
    configuration.apiKey  = "YOUR API KEY";
    Tavus client = new Tavus(configuration);
    try {
      VideosGetAllResponse result = client
              .videos
              .getAll()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VideosGetAllResponse> response = client
              .videos
              .getAll()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**VideosGetAllResponse**](VideosGetAllResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getByVideoId"></a>
# **getByVideoId**
> VideosGetByVideoIdResponse getByVideoId(videoId).execute();

Get Video

This endpoint returns a single video by its unique identifier.   The response body will contain a &#x60;status&#x60; string that represents the status of the video. If the video is ready, the response body will also contain a &#x60;download_url&#x60;, &#x60;stream_url&#x60;, and &#x60;hosted_url&#x60; that can be used to download, stream, and view the video respectively. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tavus;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://tavusapi.com";
    
    configuration.apiKey  = "YOUR API KEY";
    Tavus client = new Tavus(configuration);
    String videoId = "videoId_example";
    try {
      VideosGetByVideoIdResponse result = client
              .videos
              .getByVideoId(videoId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreatedAt());
      System.out.println(result.getData());
      System.out.println(result.getDownloadUrl());
      System.out.println(result.getHostedUrl());
      System.out.println(result.getStatus());
      System.out.println(result.getStatusDetails());
      System.out.println(result.getStreamUrl());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getVideoId());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#getByVideoId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VideosGetByVideoIdResponse> response = client
              .videos
              .getByVideoId(videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#getByVideoId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**|  | |

### Return type

[**VideosGetByVideoIdResponse**](VideosGetByVideoIdResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="updateName"></a>
# **updateName**
> updateName(videoId).videosUpdateNameRequest(videosUpdateNameRequest).execute();

Rename Video

This endpoint renames a single video by its unique identifier. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tavus;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://tavusapi.com";
    
    configuration.apiKey  = "YOUR API KEY";
    Tavus client = new Tavus(configuration);
    String videoName = "videoName_example";
    String videoId = "videoId_example";
    try {
      client
              .videos
              .updateName(videoName, videoId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#updateName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .videos
              .updateName(videoName, videoId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#updateName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**|  | |
| **videosUpdateNameRequest** | [**VideosUpdateNameRequest**](VideosUpdateNameRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

