# BuyerAppMetaApisApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancellationReasonsPost**](BuyerAppMetaApisApi.md#cancellationReasonsPost) | **POST** /cancellation_reasons |  |
| [**feedbackCategoriesPost**](BuyerAppMetaApisApi.md#feedbackCategoriesPost) | **POST** /feedback_categories |  |
| [**feedbackFormPost**](BuyerAppMetaApisApi.md#feedbackFormPost) | **POST** /feedback_form |  |
| [**ratingCategoriesPost**](BuyerAppMetaApisApi.md#ratingCategoriesPost) | **POST** /rating_categories |  |
| [**returnReasonsPost**](BuyerAppMetaApisApi.md#returnReasonsPost) | **POST** /return_reasons |  |


<a name="cancellationReasonsPost"></a>
# **cancellationReasonsPost**
> SearchPost200Response cancellationReasonsPost(cancellationReasonsPostRequest)



Get cancellation reasons from the Seller App

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BuyerAppMetaApisApi;

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

    BuyerAppMetaApisApi apiInstance = new BuyerAppMetaApisApi(defaultClient);
    CancellationReasonsPostRequest cancellationReasonsPostRequest = new CancellationReasonsPostRequest(); // CancellationReasonsPostRequest | List of cancellation reasons
    try {
      SearchPost200Response result = apiInstance.cancellationReasonsPost(cancellationReasonsPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerAppMetaApisApi#cancellationReasonsPost");
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
| **cancellationReasonsPostRequest** | [**CancellationReasonsPostRequest**](CancellationReasonsPostRequest.md)| List of cancellation reasons | [optional] |

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

<a name="feedbackCategoriesPost"></a>
# **feedbackCategoriesPost**
> SearchPost200Response feedbackCategoriesPost(feedbackCategoriesPostRequest)



Get a list of categories for which feedback can be given by the Buyer App

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BuyerAppMetaApisApi;

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

    BuyerAppMetaApisApi apiInstance = new BuyerAppMetaApisApi(defaultClient);
    FeedbackCategoriesPostRequest feedbackCategoriesPostRequest = new FeedbackCategoriesPostRequest(); // FeedbackCategoriesPostRequest | Array of categories for which feedback can be given by the Buyer App
    try {
      SearchPost200Response result = apiInstance.feedbackCategoriesPost(feedbackCategoriesPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerAppMetaApisApi#feedbackCategoriesPost");
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
| **feedbackCategoriesPostRequest** | [**FeedbackCategoriesPostRequest**](FeedbackCategoriesPostRequest.md)| Array of categories for which feedback can be given by the Buyer App | [optional] |

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

<a name="feedbackFormPost"></a>
# **feedbackFormPost**
> SearchPost200Response feedbackFormPost(feedbackFormPostRequest)



Get a feedback form from the Seller App

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BuyerAppMetaApisApi;

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

    BuyerAppMetaApisApi apiInstance = new BuyerAppMetaApisApi(defaultClient);
    FeedbackFormPostRequest feedbackFormPostRequest = new FeedbackFormPostRequest(); // FeedbackFormPostRequest | Feedback form sent by the Buyer App
    try {
      SearchPost200Response result = apiInstance.feedbackFormPost(feedbackFormPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerAppMetaApisApi#feedbackFormPost");
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
| **feedbackFormPostRequest** | [**FeedbackFormPostRequest**](FeedbackFormPostRequest.md)| Feedback form sent by the Buyer App | [optional] |

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

<a name="ratingCategoriesPost"></a>
# **ratingCategoriesPost**
> SearchPost200Response ratingCategoriesPost(ratingCategoriesPostRequest)



Get a list of categories that can be rated by the Buyer App

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BuyerAppMetaApisApi;

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

    BuyerAppMetaApisApi apiInstance = new BuyerAppMetaApisApi(defaultClient);
    RatingCategoriesPostRequest ratingCategoriesPostRequest = new RatingCategoriesPostRequest(); // RatingCategoriesPostRequest | Array of categories which can be rated
    try {
      SearchPost200Response result = apiInstance.ratingCategoriesPost(ratingCategoriesPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerAppMetaApisApi#ratingCategoriesPost");
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
| **ratingCategoriesPostRequest** | [**RatingCategoriesPostRequest**](RatingCategoriesPostRequest.md)| Array of categories which can be rated | [optional] |

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

<a name="returnReasonsPost"></a>
# **returnReasonsPost**
> SearchPost200Response returnReasonsPost(returnReasonsPostRequest)



Get return reasons from the Seller App

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BuyerAppMetaApisApi;

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

    BuyerAppMetaApisApi apiInstance = new BuyerAppMetaApisApi(defaultClient);
    ReturnReasonsPostRequest returnReasonsPostRequest = new ReturnReasonsPostRequest(); // ReturnReasonsPostRequest | List of return reasons
    try {
      SearchPost200Response result = apiInstance.returnReasonsPost(returnReasonsPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerAppMetaApisApi#returnReasonsPost");
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
| **returnReasonsPostRequest** | [**ReturnReasonsPostRequest**](ReturnReasonsPostRequest.md)| List of return reasons | [optional] |

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

