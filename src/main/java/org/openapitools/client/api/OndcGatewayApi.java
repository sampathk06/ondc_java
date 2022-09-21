/*
 * ONDC Protocol Core API
 * ONDC Protocol Core API specification. This is an adaptation of Beckn Core version 0.9.3
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.OnSearchPost200Response;
import org.openapitools.client.model.OnSearchPostRequest;
import org.openapitools.client.model.SearchPost200Response;
import org.openapitools.client.model.SearchPostRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class OndcGatewayApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public OndcGatewayApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OndcGatewayApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for onSearchPost
     * @param onSearchPostRequest Sellers provide their catalog in response to buyer search (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Acknowledgement of message received </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call onSearchPostCall(OnSearchPostRequest onSearchPostRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = onSearchPostRequest;

        // create path and map variables
        String localVarPath = "/on_search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "GatewaySubscriberAuth", "GatewaySubscriberAuthNew", "SubscriberAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call onSearchPostValidateBeforeCall(OnSearchPostRequest onSearchPostRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = onSearchPostCall(onSearchPostRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * Send catalog
     * @param onSearchPostRequest Sellers provide their catalog in response to buyer search (optional)
     * @return OnSearchPost200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Acknowledgement of message received </td><td>  -  </td></tr>
     </table>
     */
    public OnSearchPost200Response onSearchPost(OnSearchPostRequest onSearchPostRequest) throws ApiException {
        ApiResponse<OnSearchPost200Response> localVarResp = onSearchPostWithHttpInfo(onSearchPostRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Send catalog
     * @param onSearchPostRequest Sellers provide their catalog in response to buyer search (optional)
     * @return ApiResponse&lt;OnSearchPost200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Acknowledgement of message received </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OnSearchPost200Response> onSearchPostWithHttpInfo(OnSearchPostRequest onSearchPostRequest) throws ApiException {
        okhttp3.Call localVarCall = onSearchPostValidateBeforeCall(onSearchPostRequest, null);
        Type localVarReturnType = new TypeToken<OnSearchPost200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Send catalog
     * @param onSearchPostRequest Sellers provide their catalog in response to buyer search (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Acknowledgement of message received </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call onSearchPostAsync(OnSearchPostRequest onSearchPostRequest, final ApiCallback<OnSearchPost200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = onSearchPostValidateBeforeCall(onSearchPostRequest, _callback);
        Type localVarReturnType = new TypeToken<OnSearchPost200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchPost
     * @param searchPostRequest Buyer searches for products and services (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Acknowledgement of message received </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchPostCall(SearchPostRequest searchPostRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = searchPostRequest;

        // create path and map variables
        String localVarPath = "/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "GatewaySubscriberAuth", "GatewaySubscriberAuthNew", "SubscriberAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call searchPostValidateBeforeCall(SearchPostRequest searchPostRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = searchPostCall(searchPostRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * Search for services by intent
     * @param searchPostRequest Buyer searches for products and services (optional)
     * @return SearchPost200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Acknowledgement of message received </td><td>  -  </td></tr>
     </table>
     */
    public SearchPost200Response searchPost(SearchPostRequest searchPostRequest) throws ApiException {
        ApiResponse<SearchPost200Response> localVarResp = searchPostWithHttpInfo(searchPostRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Search for services by intent
     * @param searchPostRequest Buyer searches for products and services (optional)
     * @return ApiResponse&lt;SearchPost200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Acknowledgement of message received </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SearchPost200Response> searchPostWithHttpInfo(SearchPostRequest searchPostRequest) throws ApiException {
        okhttp3.Call localVarCall = searchPostValidateBeforeCall(searchPostRequest, null);
        Type localVarReturnType = new TypeToken<SearchPost200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Search for services by intent
     * @param searchPostRequest Buyer searches for products and services (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Acknowledgement of message received </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchPostAsync(SearchPostRequest searchPostRequest, final ApiCallback<SearchPost200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchPostValidateBeforeCall(searchPostRequest, _callback);
        Type localVarReturnType = new TypeToken<SearchPost200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
