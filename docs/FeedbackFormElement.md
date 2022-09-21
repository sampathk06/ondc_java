

# FeedbackFormElement

An element in the feedback form. It can be question or an answer to the question.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**parentId** | **Id** |  |  [optional] |
|**question** | **String** | Specifies the question to which the answer options will be contained in the child FeedbackFormElements |  [optional] |
|**answer** | **String** | Specifies an answer option to which the question will be in the FeedbackFormElement specified in parent_id |  [optional] |
|**answerType** | [**AnswerTypeEnum**](#AnswerTypeEnum) | Specifies how the answer option should be rendered. |  [optional] |



## Enum: AnswerTypeEnum

| Name | Value |
|---- | -----|
| RADIO | &quot;radio&quot; |
| CHECKBOX | &quot;checkbox&quot; |
| TEXT | &quot;text&quot; |



