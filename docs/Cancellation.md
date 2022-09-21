

# Cancellation

Describes the ACK response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**refId** | **String** |  |  [optional] |
|**policies** | [**List&lt;Policy&gt;**](Policy.md) |  |  [optional] |
|**time** | **OffsetDateTime** |  |  [optional] |
|**cancelledBy** | **String** |  |  [optional] |
|**reasons** | [**Option**](Option.md) |  |  [optional] |
|**selectedReason** | [**CancellationSelectedReason**](CancellationSelectedReason.md) |  |  [optional] |
|**additionalDescription** | [**Descriptor**](Descriptor.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FULL | &quot;full&quot; |
| PARTIAL | &quot;partial&quot; |



