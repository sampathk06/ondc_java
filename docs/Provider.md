

# Provider

Describes a service provider. This can be a restaurant, a hospital, a Store etc

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Id of the provider |  [optional] |
|**descriptor** | [**Descriptor**](Descriptor.md) |  |  [optional] |
|**categoryId** | **String** | Category Id of the provider |  [optional] |
|**rating** | **Value** |  |  [optional] |
|**time** | [**Time**](Time.md) |  |  [optional] |
|**categories** | [**List&lt;Category&gt;**](Category.md) |  |  [optional] |
|**fulfillments** | [**List&lt;Fulfillment&gt;**](Fulfillment.md) |  |  [optional] |
|**payments** | [**List&lt;Payment&gt;**](Payment.md) |  |  [optional] |
|**locations** | [**List&lt;ProviderLocationsInner&gt;**](ProviderLocationsInner.md) |  |  [optional] |
|**offers** | [**List&lt;Offer&gt;**](Offer.md) |  |  [optional] |
|**items** | [**List&lt;Item&gt;**](Item.md) |  |  [optional] |
|**exp** | **OffsetDateTime** | Time after which catalog has to be refreshed |  [optional] |
|**rateable** | **Boolean** | If the entity can be rated or not |  [optional] |
|**tags** | **Map&lt;String, String&gt;** | Describes a tag. This is a simple key-value store which is used to contain extended metadata |  [optional] |



