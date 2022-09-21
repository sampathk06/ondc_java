

# Fulfillment

Describes how a single product/service will be rendered/fulfilled to the end customer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique reference ID to the fulfillment of an order |  [optional] |
|**type** | **String** | This describes the type of fulfillment |  [optional] |
|**providerId** | **Id** |  |  [optional] |
|**rating** | **Value** |  |  [optional] |
|**state** | [**State**](State.md) |  |  [optional] |
|**tracking** | **Boolean** | Indicates whether the fulfillment allows tracking |  [optional] |
|**customer** | [**FulfillmentCustomer**](FulfillmentCustomer.md) |  |  [optional] |
|**agent** | [**Agent**](Agent.md) |  |  [optional] |
|**person** | [**Person**](Person.md) |  |  [optional] |
|**contact** | [**Contact**](Contact.md) |  |  [optional] |
|**vehicle** | [**Vehicle**](Vehicle.md) |  |  [optional] |
|**start** | [**FulfillmentStart**](FulfillmentStart.md) |  |  [optional] |
|**end** | [**FulfillmentEnd**](FulfillmentEnd.md) |  |  [optional] |
|**rateable** | **Boolean** | If the entity can be rated or not |  [optional] |
|**tags** | **Map&lt;String, String&gt;** | Describes a tag. This is a simple key-value store which is used to contain extended metadata |  [optional] |



