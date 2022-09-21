

# Subscriber

Any entity which wants to authenticate itself on a network. This can be a Buyer App, Seller App or Gateway.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subscriberId** | **String** | Registered domain name of the subscriber. Must have a valid SSL certificate issued by a Certificate Authority of the operating region |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**cbUrl** | **String** | Callback URL of the subscriber. The Registry will call this URL&#39;s on_subscribe API to validate the subscriber\\&#39;s credentials |  [optional] |
|**domain** | **String** | Codification of domains supported by ONDC |  [optional] |
|**city** | **Code** |  |  [optional] |
|**country** | **Code** |  |  [optional] |
|**signingPublicKey** | **String** | Signing Public key of the subscriber. &lt;br/&gt;&lt;br/&gt;Any subscriber platform (Buyer App, Seller App, Gateway) who wants to transact on the network must digitally sign the &#x60;&#x60;&#x60;requestBody&#x60;&#x60;&#x60; using the corresponding private key of this public key and send it in the transport layer header. In case of &#x60;&#x60;&#x60;HTTP&#x60;&#x60;&#x60; it is the &#x60;&#x60;&#x60;Authorization&#x60;&#x60;&#x60; header. &lt;br&gt;&lt;br/&gt;The &#x60;&#x60;&#x60;Authorization&#x60;&#x60;&#x60; will be used to validate the signature of a Buyer App or Seller App.&lt;br/&gt;&lt;br/&gt;Furthermore, if an API call is being proxied or multicast by a ONDC Gateway, the Gateway must use it\\&#39;s signing key to digitally sign the &#x60;&#x60;&#x60;requestBody&#x60;&#x60;&#x60; using the corresponding private key of this public key and send it in the &#x60;&#x60;&#x60;X-Gateway-Authorization&#x60;&#x60;&#x60; header. |  [optional] |
|**encryptionPublicKey** | **String** | Encryption public key of the Buyer App. Any Seller App must encrypt the &#x60;&#x60;&#x60;requestBody.message&#x60;&#x60;&#x60; value of the &#x60;&#x60;&#x60;on_search&#x60;&#x60;&#x60; API using this public key. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**created** | **OffsetDateTime** | Timestamp when a subscriber was added to the registry with status &#x3D; INITIATED |  [optional] |
|**updated** | **OffsetDateTime** |  |  [optional] |
|**expires** | **OffsetDateTime** | Expiry timestamp in UTC derived from the &#x60;&#x60;&#x60;lease_time&#x60;&#x60;&#x60; of the subscriber |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BAP | &quot;bap&quot; |
| BPP | &quot;bpp&quot; |
| BG | &quot;bg&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| INITIATED | &quot;INITIATED&quot; |
| UNDER_SUBSCRIPTION | &quot;UNDER_SUBSCRIPTION&quot; |
| SUBSCRIBED | &quot;SUBSCRIBED&quot; |
| INVALID_SSL | &quot;INVALID_SSL&quot; |
| UNSUBSCRIBED | &quot;UNSUBSCRIBED&quot; |



