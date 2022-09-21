# OndcGatewayApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**onSearchPost**](OndcGatewayApi.md#onSearchPost) | **POST** /on_search |  |
| [**searchPost**](OndcGatewayApi.md#searchPost) | **POST** /search |  |


<a name="onSearchPost"></a>
# **onSearchPost**
> OnSearchPost200Response onSearchPost(onSearchPostRequest)



Send catalog

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OndcGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: GatewaySubscriberAuth
    ApiKeyAuth GatewaySubscriberAuth = (ApiKeyAuth) defaultClient.getAuthentication("GatewaySubscriberAuth");
    GatewaySubscriberAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //GatewaySubscriberAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: GatewaySubscriberAuthNew
    ApiKeyAuth GatewaySubscriberAuthNew = (ApiKeyAuth) defaultClient.getAuthentication("GatewaySubscriberAuthNew");
    GatewaySubscriberAuthNew.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //GatewaySubscriberAuthNew.setApiKeyPrefix("Token");

    // Configure API key authorization: SubscriberAuth
    ApiKeyAuth SubscriberAuth = (ApiKeyAuth) defaultClient.getAuthentication("SubscriberAuth");
    SubscriberAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SubscriberAuth.setApiKeyPrefix("Token");

    OndcGatewayApi apiInstance = new OndcGatewayApi(defaultClient);
    OnSearchPostRequest onSearchPostRequest = new OnSearchPostRequest(); // OnSearchPostRequest | Sellers provide their catalog in response to buyer search
    try {
      OnSearchPost200Response result = apiInstance.onSearchPost(onSearchPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OndcGatewayApi#onSearchPost");
      System.err.println("Status code: " + e.getCode());
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
| **onSearchPostRequest** | [**OnSearchPostRequest**](OnSearchPostRequest.md)| Sellers provide their catalog in response to buyer search | [optional] |

### Return type

[**OnSearchPost200Response**](OnSearchPost200Response.md)

### Authorization

[GatewaySubscriberAuth](../README.md#GatewaySubscriberAuth), [GatewaySubscriberAuthNew](../README.md#GatewaySubscriberAuthNew), [SubscriberAuth](../README.md#SubscriberAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Acknowledgement of message received |  -  |

<a name="searchPost"></a>
# **searchPost**
> SearchPost200Response searchPost(searchPostRequest)



Search for services by intent

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OndcGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: GatewaySubscriberAuth
    ApiKeyAuth GatewaySubscriberAuth = (ApiKeyAuth) defaultClient.getAuthentication("GatewaySubscriberAuth");
    GatewaySubscriberAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //GatewaySubscriberAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: GatewaySubscriberAuthNew
    ApiKeyAuth GatewaySubscriberAuthNew = (ApiKeyAuth) defaultClient.getAuthentication("GatewaySubscriberAuthNew");
    GatewaySubscriberAuthNew.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //GatewaySubscriberAuthNew.setApiKeyPrefix("Token");

    // Configure API key authorization: SubscriberAuth
    ApiKeyAuth SubscriberAuth = (ApiKeyAuth) defaultClient.getAuthentication("SubscriberAuth");
    SubscriberAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SubscriberAuth.setApiKeyPrefix("Token");

    OndcGatewayApi apiInstance = new OndcGatewayApi(defaultClient);
    SearchPostRequest searchPostRequest = new SearchPostRequest(); // SearchPostRequest | Buyer searches for products and services
    try {
      SearchPost200Response result = apiInstance.searchPost(searchPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OndcGatewayApi#searchPost");
      System.err.println("Status code: " + e.getCode());
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
| **searchPostRequest** | [**SearchPostRequest**](SearchPostRequest.md)| Buyer searches for products and services | [optional] |

### Return type

[**SearchPost200Response**](SearchPost200Response.md)

### Authorization

[GatewaySubscriberAuth](../README.md#GatewaySubscriberAuth), [GatewaySubscriberAuthNew](../README.md#GatewaySubscriberAuthNew), [SubscriberAuth](../README.md#SubscriberAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Acknowledgement of message received |  -  |

