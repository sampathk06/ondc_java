

# Order

Describes the details of an order

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Hash of order object without id |  [optional] |
|**state** | **String** |  |  [optional] |
|**provider** | [**OrderProvider**](OrderProvider.md) |  |  [optional] |
|**items** | [**List&lt;OrderItemsInner&gt;**](OrderItemsInner.md) |  |  [optional] |
|**addOns** | [**List&lt;OrderAddOnsInner&gt;**](OrderAddOnsInner.md) |  |  [optional] |
|**offers** | [**List&lt;OrderOffersInner&gt;**](OrderOffersInner.md) |  |  [optional] |
|**documents** | [**List&lt;Document&gt;**](Document.md) |  |  [optional] |
|**billing** | [**Billing**](Billing.md) |  |  [optional] |
|**fulfillment** | [**Fulfillment**](Fulfillment.md) |  |  [optional] |
|**quote** | [**Quotation**](Quotation.md) |  |  [optional] |
|**payment** | [**Payment**](Payment.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



