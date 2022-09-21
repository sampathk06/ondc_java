

# Error

Describes an error object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**code** | **String** | ONDC specific error code. For full list of error codes, refer to docs/drafts/Error Codes.md of this repo |  |
|**path** | **String** | Path to json schema generating the error. Used only during json schema validation errors |  [optional] |
|**message** | **String** | Human readable message describing the error |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CONTEXT_ERROR | &quot;CONTEXT-ERROR&quot; |
| CORE_ERROR | &quot;CORE-ERROR&quot; |
| DOMAIN_ERROR | &quot;DOMAIN-ERROR&quot; |
| POLICY_ERROR | &quot;POLICY-ERROR&quot; |
| JSON_SCHEMA_ERROR | &quot;JSON-SCHEMA-ERROR&quot; |



