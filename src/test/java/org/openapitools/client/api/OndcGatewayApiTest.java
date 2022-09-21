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

import org.openapitools.client.ApiException;
import org.openapitools.client.model.OnSearchPost200Response;
import org.openapitools.client.model.OnSearchPostRequest;
import org.openapitools.client.model.SearchPost200Response;
import org.openapitools.client.model.SearchPostRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OndcGatewayApi
 */
@Disabled
public class OndcGatewayApiTest {

    private final OndcGatewayApi api = new OndcGatewayApi();

    /**
     * Send catalog
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void onSearchPostTest() throws ApiException {
        OnSearchPostRequest onSearchPostRequest = null;
        OnSearchPost200Response response = api.onSearchPost(onSearchPostRequest);
        // TODO: test validations
    }

    /**
     * Search for services by intent
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchPostTest() throws ApiException {
        SearchPostRequest searchPostRequest = null;
        SearchPost200Response response = api.searchPost(searchPostRequest);
        // TODO: test validations
    }

}
