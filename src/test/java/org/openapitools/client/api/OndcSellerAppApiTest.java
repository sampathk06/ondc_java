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
import org.openapitools.client.model.CancelPostRequest;
import org.openapitools.client.model.RatingPostRequest;
import org.openapitools.client.model.SearchPost200Response;
import org.openapitools.client.model.SearchPostRequest;
import org.openapitools.client.model.SelectPostRequest;
import org.openapitools.client.model.StatusPostRequest;
import org.openapitools.client.model.SupportPostRequest;
import org.openapitools.client.model.TrackPostRequest;
import org.openapitools.client.model.UpdatePostRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OndcSellerAppApi
 */
@Disabled
public class OndcSellerAppApiTest {

    private final OndcSellerAppApi api = new OndcSellerAppApi();

    /**
     * Cancel an order
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelPostTest() throws ApiException {
        CancelPostRequest cancelPostRequest = null;
        SearchPost200Response response = api.cancelPost(cancelPostRequest);
        // TODO: test validations
    }

    /**
     * Initialize an order by providing billing and/or shipping details
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void confirmPostTest() throws ApiException {
        SelectPostRequest selectPostRequest = null;
        SearchPost200Response response = api.confirmPost(selectPostRequest);
        // TODO: test validations
    }

    /**
     * Initialize an order by providing billing and/or shipping details
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void initPostTest() throws ApiException {
        SelectPostRequest selectPostRequest = null;
        SearchPost200Response response = api.initPost(selectPostRequest);
        // TODO: test validations
    }

    /**
     * Provide feedback on a service
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ratingPostTest() throws ApiException {
        RatingPostRequest ratingPostRequest = null;
        SearchPost200Response response = api.ratingPost(ratingPostRequest);
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

    /**
     * Select items from the catalog and build your order
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void selectPostTest() throws ApiException {
        SelectPostRequest selectPostRequest = null;
        SearchPost200Response response = api.selectPost(selectPostRequest);
        // TODO: test validations
    }

    /**
     * Fetch the latest order object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void statusPostTest() throws ApiException {
        StatusPostRequest statusPostRequest = null;
        SearchPost200Response response = api.statusPost(statusPostRequest);
        // TODO: test validations
    }

    /**
     * Contact support
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void supportPostTest() throws ApiException {
        SupportPostRequest supportPostRequest = null;
        SearchPost200Response response = api.supportPost(supportPostRequest);
        // TODO: test validations
    }

    /**
     * Track an active order
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void trackPostTest() throws ApiException {
        TrackPostRequest trackPostRequest = null;
        SearchPost200Response response = api.trackPost(trackPostRequest);
        // TODO: test validations
    }

    /**
     * Update an order
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePostTest() throws ApiException {
        UpdatePostRequest updatePostRequest = null;
        SearchPost200Response response = api.updatePost(updatePostRequest);
        // TODO: test validations
    }

}
