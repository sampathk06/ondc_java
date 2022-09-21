

# Payment

Describes a payment

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uri** | **URI** | A payment uri to be called by the Buyer App. If empty, then the payment is to be done offline. The details of payment should be present in the params object. If &#x60;&#x60;&#x60;tl_method&#x60;&#x60;&#x60; &#x3D; http/get, then the payment details will be sent as url params. Two url param values, &#x60;&#x60;&#x60;$transaction_id&#x60;&#x60;&#x60; and &#x60;&#x60;&#x60;$amount&#x60;&#x60;&#x60; are mandatory. And example url would be : https://www.example.com/pay?txid&#x3D;$transaction_id&amp;amount&#x3D;$amount&amp;vpa&#x3D;upiid&amp;payee&#x3D;shopez&amp;billno&#x3D;1234 |  [optional] |
|**tlMethod** | [**TlMethodEnum**](#TlMethodEnum) |  |  [optional] |
|**params** | **PaymentParams** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**time** | [**Time**](Time.md) |  |  [optional] |
|**collectedBy** | [**CollectedByEnum**](#CollectedByEnum) |  |  [optional] |



## Enum: TlMethodEnum

| Name | Value |
|---- | -----|
| HTTP_GET | &quot;http/get&quot; |
| HTTP_POST | &quot;http/post&quot; |
| PAYTO | &quot;payto&quot; |
| UPI | &quot;upi&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ON_ORDER | &quot;ON-ORDER&quot; |
| PRE_FULFILLMENT | &quot;PRE-FULFILLMENT&quot; |
| ON_FULFILLMENT | &quot;ON-FULFILLMENT&quot; |
| POST_FULFILLMENT | &quot;POST-FULFILLMENT&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PAID | &quot;PAID&quot; |
| NOT_PAID | &quot;NOT-PAID&quot; |



## Enum: CollectedByEnum

| Name | Value |
|---- | -----|
| BAP | &quot;BAP&quot; |
| BPP | &quot;BPP&quot; |



