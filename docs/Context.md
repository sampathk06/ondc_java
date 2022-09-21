

# Context

Describes a ONDC message context

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**domain** | **String** | Codification of domains supported by ONDC |  |
|**country** | **Code** |  |  |
|**city** | **Code** |  |  |
|**action** | [**ActionEnum**](#ActionEnum) | Defines the ONDC API call. Any actions other than the enumerated actions are not supported by ONDC Protocol |  |
|**coreVersion** | **String** | Version of ONDC core API specification being used |  |
|**bapId** | **String** | Unique id of the Buyer App. By default it is the fully qualified domain name of the Buyer App |  |
|**bapUri** | **URI** | URI of the Seller App for accepting callbacks. Must have the same domain name as the bap_id |  |
|**bppId** | **String** | Unique id of the Seller App. By default it is the fully qualified domain name of the Seller App |  [optional] |
|**bppUri** | **URI** | URI of the Seller App. Must have the same domain name as the bap_id |  [optional] |
|**transactionId** | **String** | This is a unique value which persists across all API calls from search through confirm |  |
|**messageId** | **String** | This is a unique value which persists during a request / callback cycle |  |
|**timestamp** | **OffsetDateTime** | Time of request generation in RFC3339 format |  |
|**key** | **String** | The encryption public key of the sender |  [optional] |
|**ttl** | **String** | The duration in ISO8601 format after timestamp for which this message holds valid. |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| SEARCH | &quot;search&quot; |
| SELECT | &quot;select&quot; |
| INIT | &quot;init&quot; |
| CONFIRM | &quot;confirm&quot; |
| UPDATE | &quot;update&quot; |
| STATUS | &quot;status&quot; |
| TRACK | &quot;track&quot; |
| CANCEL | &quot;cancel&quot; |
| RATING | &quot;rating&quot; |
| SUPPORT | &quot;support&quot; |
| ON_SEARCH | &quot;on_search&quot; |
| ON_SELECT | &quot;on_select&quot; |
| ON_INIT | &quot;on_init&quot; |
| ON_CONFIRM | &quot;on_confirm&quot; |
| ON_UPDATE | &quot;on_update&quot; |
| ON_STATUS | &quot;on_status&quot; |
| ON_TRACK | &quot;on_track&quot; |
| ON_CANCEL | &quot;on_cancel&quot; |
| ON_RATING | &quot;on_rating&quot; |
| ON_SUPPORT | &quot;on_support&quot; |



