# SellerAppMetaApisApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCancellationReasonsPost**](SellerAppMetaApisApi.md#getCancellationReasonsPost) | **POST** /get_cancellation_reasons |  |
| [**getFeedbackFormPost**](SellerAppMetaApisApi.md#getFeedbackFormPost) | **POST** /get_feedback_form |  |
| [**getRatingCategoriesPost**](SellerAppMetaApisApi.md#getRatingCategoriesPost) | **POST** /get_rating_categories |  |
| [**getReturnReasonsPost**](SellerAppMetaApisApi.md#getReturnReasonsPost) | **POST** /get_return_reasons |  |


<a name="getCancellationReasonsPost"></a>
# **getCancellationReasonsPost**
> SearchPost200Response getCancellationReasonsPost(getCancellationReasonsPostRequest)



Get cancellation reasons from the Seller App

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SellerAppMetaApisApi;

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

    SellerAppMetaApisApi apiInstance = new SellerAppMetaApisApi(defaultClient);
    GetCancellationReasonsPostRequest getCancellationReasonsPostRequest = new GetCancellationReasonsPostRequest(); // GetCancellationReasonsPostRequest | Context header is sent as the request
    try {
      SearchPost200Response result = apiInstance.getCancellationReasonsPost(getCancellationReasonsPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SellerAppMetaApisApi#getCancellationReasonsPost");
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
| **getCancellationReasonsPostRequest** | [**GetCancellationReasonsPostRequest**](GetCancellationReasonsPostRequest.md)| Context header is sent as the request | [optional] |

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

<a name="getFeedbackFormPost"></a>
# **getFeedbackFormPost**
> SearchPost200Response getFeedbackFormPost(getFeedbackFormPostRequest)



Request a feedback form from the Seller App

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SellerAppMetaApisApi;

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

    SellerAppMetaApisApi apiInstance = new SellerAppMetaApisApi(defaultClient);
    GetFeedbackFormPostRequest getFeedbackFormPostRequest = new GetFeedbackFormPostRequest(); // GetFeedbackFormPostRequest | The rating value and category is sent by the Buyer App
    try {
      SearchPost200Response result = apiInstance.getFeedbackFormPost(getFeedbackFormPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SellerAppMetaApisApi#getFeedbackFormPost");
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
| **getFeedbackFormPostRequest** | [**GetFeedbackFormPostRequest**](GetFeedbackFormPostRequest.md)| The rating value and category is sent by the Buyer App | [optional] |

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

<a name="getRatingCategoriesPost"></a>
# **getRatingCategoriesPost**
> SearchPost200Response getRatingCategoriesPost(getCancellationReasonsPostRequest)



Get a list of categories that can be rated by the Seller App

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SellerAppMetaApisApi;

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

    SellerAppMetaApisApi apiInstance = new SellerAppMetaApisApi(defaultClient);
    GetCancellationReasonsPostRequest getCancellationReasonsPostRequest = new GetCancellationReasonsPostRequest(); // GetCancellationReasonsPostRequest | Context header is sent as the request
    try {
      SearchPost200Response result = apiInstance.getRatingCategoriesPost(getCancellationReasonsPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SellerAppMetaApisApi#getRatingCategoriesPost");
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
| **getCancellationReasonsPostRequest** | [**GetCancellationReasonsPostRequest**](GetCancellationReasonsPostRequest.md)| Context header is sent as the request | [optional] |

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

<a name="getReturnReasonsPost"></a>
# **getReturnReasonsPost**
> SearchPost200Response getReturnReasonsPost(getCancellationReasonsPostRequest)



Get return reasons from the Seller App

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SellerAppMetaApisApi;

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

    SellerAppMetaApisApi apiInstance = new SellerAppMetaApisApi(defaultClient);
    GetCancellationReasonsPostRequest getCancellationReasonsPostRequest = new GetCancellationReasonsPostRequest(); // GetCancellationReasonsPostRequest | Context header is sent as the request
    try {
      SearchPost200Response result = apiInstance.getReturnReasonsPost(getCancellationReasonsPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SellerAppMetaApisApi#getReturnReasonsPost");
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
| **getCancellationReasonsPostRequest** | [**GetCancellationReasonsPostRequest**](GetCancellationReasonsPostRequest.md)| Context header is sent as the request | [optional] |

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

