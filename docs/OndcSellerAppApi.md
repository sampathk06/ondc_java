# OndcSellerAppApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelPost**](OndcSellerAppApi.md#cancelPost) | **POST** /cancel |  |
| [**confirmPost**](OndcSellerAppApi.md#confirmPost) | **POST** /confirm |  |
| [**initPost**](OndcSellerAppApi.md#initPost) | **POST** /init |  |
| [**ratingPost**](OndcSellerAppApi.md#ratingPost) | **POST** /rating |  |
| [**searchPost**](OndcSellerAppApi.md#searchPost) | **POST** /search |  |
| [**selectPost**](OndcSellerAppApi.md#selectPost) | **POST** /select |  |
| [**statusPost**](OndcSellerAppApi.md#statusPost) | **POST** /status |  |
| [**supportPost**](OndcSellerAppApi.md#supportPost) | **POST** /support |  |
| [**trackPost**](OndcSellerAppApi.md#trackPost) | **POST** /track |  |
| [**updatePost**](OndcSellerAppApi.md#updatePost) | **POST** /update |  |


<a name="cancelPost"></a>
# **cancelPost**
> SearchPost200Response cancelPost(cancelPostRequest)



Cancel an order

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OndcSellerAppApi;

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

    OndcSellerAppApi apiInstance = new OndcSellerAppApi(defaultClient);
    CancelPostRequest cancelPostRequest = new CancelPostRequest(); // CancelPostRequest | Buyer cancels an order
    try {
      SearchPost200Response result = apiInstance.cancelPost(cancelPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OndcSellerAppApi#cancelPost");
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
| **cancelPostRequest** | [**CancelPostRequest**](CancelPostRequest.md)| Buyer cancels an order | [optional] |

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

<a name="confirmPost"></a>
# **confirmPost**
> SearchPost200Response confirmPost(selectPostRequest)



Initialize an order by providing billing and/or shipping details

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OndcSellerAppApi;

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

    OndcSellerAppApi apiInstance = new OndcSellerAppApi(defaultClient);
    SelectPostRequest selectPostRequest = new SelectPostRequest(); // SelectPostRequest | Buyer confirms an order
    try {
      SearchPost200Response result = apiInstance.confirmPost(selectPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OndcSellerAppApi#confirmPost");
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
| **selectPostRequest** | [**SelectPostRequest**](SelectPostRequest.md)| Buyer confirms an order | [optional] |

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

<a name="initPost"></a>
# **initPost**
> SearchPost200Response initPost(selectPostRequest)



Initialize an order by providing billing and/or shipping details

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OndcSellerAppApi;

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

    OndcSellerAppApi apiInstance = new OndcSellerAppApi(defaultClient);
    SelectPostRequest selectPostRequest = new SelectPostRequest(); // SelectPostRequest | Buyer initializes order checkout
    try {
      SearchPost200Response result = apiInstance.initPost(selectPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OndcSellerAppApi#initPost");
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
| **selectPostRequest** | [**SelectPostRequest**](SelectPostRequest.md)| Buyer initializes order checkout | [optional] |

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

<a name="ratingPost"></a>
# **ratingPost**
> SearchPost200Response ratingPost(ratingPostRequest)



Provide feedback on a service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OndcSellerAppApi;

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

    OndcSellerAppApi apiInstance = new OndcSellerAppApi(defaultClient);
    RatingPostRequest ratingPostRequest = new RatingPostRequest(); // RatingPostRequest | Buyer rates for one or more rating categories
    try {
      SearchPost200Response result = apiInstance.ratingPost(ratingPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OndcSellerAppApi#ratingPost");
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
| **ratingPostRequest** | [**RatingPostRequest**](RatingPostRequest.md)| Buyer rates for one or more rating categories | [optional] |

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
import org.openapitools.client.api.OndcSellerAppApi;

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

    OndcSellerAppApi apiInstance = new OndcSellerAppApi(defaultClient);
    SearchPostRequest searchPostRequest = new SearchPostRequest(); // SearchPostRequest | Buyer searches for products and services
    try {
      SearchPost200Response result = apiInstance.searchPost(searchPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OndcSellerAppApi#searchPost");
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

<a name="selectPost"></a>
# **selectPost**
> SearchPost200Response selectPost(selectPostRequest)



Select items from the catalog and build your order

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OndcSellerAppApi;

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

    OndcSellerAppApi apiInstance = new OndcSellerAppApi(defaultClient);
    SelectPostRequest selectPostRequest = new SelectPostRequest(); // SelectPostRequest | Buyer selects one or more catalog items
    try {
      SearchPost200Response result = apiInstance.selectPost(selectPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OndcSellerAppApi#selectPost");
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
| **selectPostRequest** | [**SelectPostRequest**](SelectPostRequest.md)| Buyer selects one or more catalog items | [optional] |

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

<a name="statusPost"></a>
# **statusPost**
> SearchPost200Response statusPost(statusPostRequest)



Fetch the latest order object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OndcSellerAppApi;

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

    OndcSellerAppApi apiInstance = new OndcSellerAppApi(defaultClient);
    StatusPostRequest statusPostRequest = new StatusPostRequest(); // StatusPostRequest | Buyer checks for status of order
    try {
      SearchPost200Response result = apiInstance.statusPost(statusPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OndcSellerAppApi#statusPost");
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
| **statusPostRequest** | [**StatusPostRequest**](StatusPostRequest.md)| Buyer checks for status of order | [optional] |

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

<a name="supportPost"></a>
# **supportPost**
> SearchPost200Response supportPost(supportPostRequest)



Contact support

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OndcSellerAppApi;

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

    OndcSellerAppApi apiInstance = new OndcSellerAppApi(defaultClient);
    SupportPostRequest supportPostRequest = new SupportPostRequest(); // SupportPostRequest | Buyer searches for Support Contact details
    try {
      SearchPost200Response result = apiInstance.supportPost(supportPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OndcSellerAppApi#supportPost");
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
| **supportPostRequest** | [**SupportPostRequest**](SupportPostRequest.md)| Buyer searches for Support Contact details | [optional] |

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

<a name="trackPost"></a>
# **trackPost**
> SearchPost200Response trackPost(trackPostRequest)



Track an active order

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OndcSellerAppApi;

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

    OndcSellerAppApi apiInstance = new OndcSellerAppApi(defaultClient);
    TrackPostRequest trackPostRequest = new TrackPostRequest(); // TrackPostRequest | Buyer tracks fulfillment of an order
    try {
      SearchPost200Response result = apiInstance.trackPost(trackPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OndcSellerAppApi#trackPost");
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
| **trackPostRequest** | [**TrackPostRequest**](TrackPostRequest.md)| Buyer tracks fulfillment of an order | [optional] |

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

<a name="updatePost"></a>
# **updatePost**
> SearchPost200Response updatePost(updatePostRequest)



Update an order

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OndcSellerAppApi;

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

    OndcSellerAppApi apiInstance = new OndcSellerAppApi(defaultClient);
    UpdatePostRequest updatePostRequest = new UpdatePostRequest(); // UpdatePostRequest | Buyer updates an order
    try {
      SearchPost200Response result = apiInstance.updatePost(updatePostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OndcSellerAppApi#updatePost");
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
| **updatePostRequest** | [**UpdatePostRequest**](UpdatePostRequest.md)| Buyer updates an order | [optional] |

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

