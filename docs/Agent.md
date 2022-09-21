

# Agent

Describes an order executor

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Describes the name of a person in format: ./{given_name}/{honorific_prefix}/{first_name}/{middle_name}/{last_name}/{honorific_suffix} |  [optional] |
|**image** | **String** | Image of an object. &lt;br/&gt;&lt;br/&gt; A url based image will look like &lt;br/&gt;&lt;br/&gt;&#x60;&#x60;&#x60;uri:http://path/to/image&#x60;&#x60;&#x60; &lt;br/&gt;&lt;br/&gt; An image can also be sent as a data string. For example : &lt;br/&gt;&lt;br/&gt; &#x60;&#x60;&#x60;data:js87y34ilhriuho84r3i4&#x60;&#x60;&#x60; |  [optional] |
|**dob** | **LocalDate** |  |  [optional] |
|**gender** | **String** | Gender of something, typically a Person, but possibly also fictional characters, animals, etc. While Male and Female may be used, text strings are also acceptable for people who do not identify as a binary gender |  [optional] |
|**cred** | **String** |  |  [optional] |
|**tags** | **Map&lt;String, String&gt;** | Describes a tag. This is a simple key-value store which is used to contain extended metadata |  [optional] |
|**phone** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**rateable** | **Boolean** | If the entity can be rated or not |  [optional] |



