<div align="left">

[![Visit Tavus](./header.png)](https://www.tavus.io&#x2F;)

# [Tavus](https://www.tavus.io&#x2F;)

We're an AI video research company making personalized video possible at scale. Generate videos of yourself, and never record again! Available via web app & developer APIs.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Tavus&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>tavus-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:tavus-java-sdk:1.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/tavus-java-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://tavusapi.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ReplicasApi* | [**createNewReplica**](docs/ReplicasApi.md#createNewReplica) | **POST** /v2/replicas | Create Replica
*ReplicasApi* | [**deleteByReplicaId**](docs/ReplicasApi.md#deleteByReplicaId) | **DELETE** /v2/replicas/{replica_id} | Delete Replica
*ReplicasApi* | [**getReplicaById**](docs/ReplicasApi.md#getReplicaById) | **GET** /v2/replicas/{replica_id} | Get Replica
*ReplicasApi* | [**list**](docs/ReplicasApi.md#list) | **GET** /v2/replicas | List Replicas
*ReplicasApi* | [**renameReplicaById**](docs/ReplicasApi.md#renameReplicaById) | **PATCH** /v2/replicas/{replica_id}/name | Rename Replica
*VideosApi* | [**createVideoFromReplicaAndScript**](docs/VideosApi.md#createVideoFromReplicaAndScript) | **POST** /v2/videos | Generate Video
*VideosApi* | [**deleteByVideoId**](docs/VideosApi.md#deleteByVideoId) | **DELETE** /v2/videos/{video_id} | Delete Video
*VideosApi* | [**getAll**](docs/VideosApi.md#getAll) | **GET** /v2/videos | List Videos
*VideosApi* | [**getByVideoId**](docs/VideosApi.md#getByVideoId) | **GET** /v2/videos/{video_id} | Get Video
*VideosApi* | [**updateName**](docs/VideosApi.md#updateName) | **PATCH** /v2/videos/{video_id}/name | Rename Video


## Documentation for Models

 - [ReplicasCreateNewReplicaRequest](docs/ReplicasCreateNewReplicaRequest.md)
 - [ReplicasCreateNewReplicaResponse](docs/ReplicasCreateNewReplicaResponse.md)
 - [ReplicasGetReplicaByIdResponse](docs/ReplicasGetReplicaByIdResponse.md)
 - [ReplicasListResponse](docs/ReplicasListResponse.md)
 - [ReplicasListResponseDataInner](docs/ReplicasListResponseDataInner.md)
 - [ReplicasRenameReplicaByIdRequest](docs/ReplicasRenameReplicaByIdRequest.md)
 - [VideosCreateVideoFromReplicaAndScriptRequest](docs/VideosCreateVideoFromReplicaAndScriptRequest.md)
 - [VideosCreateVideoFromReplicaAndScriptResponse](docs/VideosCreateVideoFromReplicaAndScriptResponse.md)
 - [VideosGetAllResponse](docs/VideosGetAllResponse.md)
 - [VideosGetAllResponseDataInner](docs/VideosGetAllResponseDataInner.md)
 - [VideosGetByVideoIdResponse](docs/VideosGetByVideoIdResponse.md)
 - [VideosGetByVideoIdResponseData](docs/VideosGetByVideoIdResponseData.md)
 - [VideosUpdateNameRequest](docs/VideosUpdateNameRequest.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
