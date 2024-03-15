# ReplicasApi

All URIs are relative to *https://tavusapi.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewReplica**](ReplicasApi.md#createNewReplica) | **POST** /v2/replicas | Create Replica |
| [**deleteByReplicaId**](ReplicasApi.md#deleteByReplicaId) | **DELETE** /v2/replicas/{replica_id} | Delete Replica |
| [**getReplicaById**](ReplicasApi.md#getReplicaById) | **GET** /v2/replicas/{replica_id} | Get Replica |
| [**list**](ReplicasApi.md#list) | **GET** /v2/replicas | List Replicas |
| [**renameReplicaById**](ReplicasApi.md#renameReplicaById) | **PATCH** /v2/replicas/{replica_id}/name | Rename Replica |


<a name="createNewReplica"></a>
# **createNewReplica**
> ReplicasCreateNewReplicaResponse createNewReplica().replicasCreateNewReplicaRequest(replicasCreateNewReplicaRequest).execute();

Create Replica

This endpoint creates a new Replica that can be used to generate personalized videos.   The only required body parameter is &#x60;train_video_url&#x60;. This url must be a download link such as a presigned S3 url. Please ensure you pass in a video that meets the [requirements](https://docs.tavusapi.com/api-reference) for training.  Replica training will fail without the following consent statement being present at the beginning of the video: &gt; I, [FULL NAME], am currently speaking and consent Tavus to create an AI clone of me by using the audio and video samples I provide. I understand that this AI clone can be used to create videos that look and sound like me.  Learn more about the consent statement [here](https://docs.tavusapi.com/api-reference).  Learn more about training a personal Replica [here](https://docs.tavusapi.com/api-reference). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tavus;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReplicasApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://tavusapi.com";
    
    configuration.apiKey  = "YOUR API KEY";
    Tavus client = new Tavus(configuration);
    String trainVideoUrl = "trainVideoUrl_example"; // A direct link to a publicly accessible storage location such as an S3 bucket. This video will be used for replica training.
    String callbackUrl = "callbackUrl_example"; // A url that will receive a callback on completion of replica training or on error.
    String replicaName = "replicaName_example"; // A name for the replica.
    try {
      ReplicasCreateNewReplicaResponse result = client
              .replicas
              .createNewReplica(trainVideoUrl)
              .callbackUrl(callbackUrl)
              .replicaName(replicaName)
              .execute();
      System.out.println(result);
      System.out.println(result.getReplicaId());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicasApi#createNewReplica");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReplicasCreateNewReplicaResponse> response = client
              .replicas
              .createNewReplica(trainVideoUrl)
              .callbackUrl(callbackUrl)
              .replicaName(replicaName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicasApi#createNewReplica");
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
| **replicasCreateNewReplicaRequest** | [**ReplicasCreateNewReplicaRequest**](ReplicasCreateNewReplicaRequest.md)|  | [optional] |

### Return type

[**ReplicasCreateNewReplicaResponse**](ReplicasCreateNewReplicaResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="deleteByReplicaId"></a>
# **deleteByReplicaId**
> deleteByReplicaId(replicaId).execute();

Delete Replica

This endpoint deletes a single Replica by its unique identifier. Once deleted, this Replica can not be used to generate videos. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tavus;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReplicasApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://tavusapi.com";
    
    configuration.apiKey  = "YOUR API KEY";
    Tavus client = new Tavus(configuration);
    String replicaId = "replicaId_example";
    try {
      client
              .replicas
              .deleteByReplicaId(replicaId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicasApi#deleteByReplicaId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .replicas
              .deleteByReplicaId(replicaId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicasApi#deleteByReplicaId");
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
| **replicaId** | **String**|  | |

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

<a name="getReplicaById"></a>
# **getReplicaById**
> ReplicasGetReplicaByIdResponse getReplicaById(replicaId).execute();

Get Replica

This endpoint returns a single Replica by its unique identifier.   Included in the response body is a &#x60;training_progress&#x60; string that represents the progress of the Replica training. If there are any errors during training, the &#x60;status&#x60; will be &#x60;error&#x60; and the &#x60;error_message&#x60; will be populated. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tavus;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReplicasApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://tavusapi.com";
    
    configuration.apiKey  = "YOUR API KEY";
    Tavus client = new Tavus(configuration);
    String replicaId = "replicaId_example";
    try {
      ReplicasGetReplicaByIdResponse result = client
              .replicas
              .getReplicaById(replicaId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreatedAt());
      System.out.println(result.getErrorMessage());
      System.out.println(result.getReplicaId());
      System.out.println(result.getReplicaName());
      System.out.println(result.getStatus());
      System.out.println(result.getThumbnailVideoUrl());
      System.out.println(result.getTrainingProgress());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicasApi#getReplicaById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReplicasGetReplicaByIdResponse> response = client
              .replicas
              .getReplicaById(replicaId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicasApi#getReplicaById");
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
| **replicaId** | **String**|  | |

### Return type

[**ReplicasGetReplicaByIdResponse**](ReplicasGetReplicaByIdResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="list"></a>
# **list**
> ReplicasListResponse list().execute();

List Replicas

This endpoint returns a list of all replicas that have been created by the API Key in use. In the response, a root level &#x60;data&#x60; key will contain the list of Replicas. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tavus;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReplicasApi;
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
      ReplicasListResponse result = client
              .replicas
              .list()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicasApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReplicasListResponse> response = client
              .replicas
              .list()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicasApi#list");
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

[**ReplicasListResponse**](ReplicasListResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="renameReplicaById"></a>
# **renameReplicaById**
> renameReplicaById(replicaId).replicasRenameReplicaByIdRequest(replicasRenameReplicaByIdRequest).execute();

Rename Replica

This endpoint renames a single Replica by its unique identifier.  

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tavus;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReplicasApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://tavusapi.com";
    
    configuration.apiKey  = "YOUR API KEY";
    Tavus client = new Tavus(configuration);
    String replicaName = "replicaName_example";
    String replicaId = "replicaId_example";
    try {
      client
              .replicas
              .renameReplicaById(replicaName, replicaId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicasApi#renameReplicaById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .replicas
              .renameReplicaById(replicaName, replicaId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicasApi#renameReplicaById");
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
| **replicaId** | **String**|  | |
| **replicasRenameReplicaByIdRequest** | [**ReplicasRenameReplicaByIdRequest**](ReplicasRenameReplicaByIdRequest.md)|  | [optional] |

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

