# SellerMetaApisApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFeedbackCategoriesPost**](SellerMetaApisApi.md#getFeedbackCategoriesPost) | **POST** /get_feedback_categories |  |


<a name="getFeedbackCategoriesPost"></a>
# **getFeedbackCategoriesPost**
> SearchPost200Response getFeedbackCategoriesPost(getCancellationReasonsPostRequest)



Get a list of categories for which feedback can be given by the Buyer App

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SellerMetaApisApi;

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

    SellerMetaApisApi apiInstance = new SellerMetaApisApi(defaultClient);
    GetCancellationReasonsPostRequest getCancellationReasonsPostRequest = new GetCancellationReasonsPostRequest(); // GetCancellationReasonsPostRequest | Context header is sent as the request
    try {
      SearchPost200Response result = apiInstance.getFeedbackCategoriesPost(getCancellationReasonsPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SellerMetaApisApi#getFeedbackCategoriesPost");
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

