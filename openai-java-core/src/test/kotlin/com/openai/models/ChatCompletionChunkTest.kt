// File generated from our OpenAPI spec by Stainless.

package com.openai.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ChatCompletionChunkTest {

    @Test
    fun createChatCompletionChunk() {
        val chatCompletionChunk =
            ChatCompletionChunk.builder()
                .id("id")
                .choices(
                    listOf(
                        ChatCompletionChunk.Choice.builder()
                            .delta(
                                ChatCompletionChunk.Choice.Delta.builder()
                                    .content("content")
                                    .functionCall(
                                        ChatCompletionChunk.Choice.Delta.FunctionCall.builder()
                                            .arguments("arguments")
                                            .name("name")
                                            .build()
                                    )
                                    .refusal("refusal")
                                    .role(ChatCompletionChunk.Choice.Delta.Role.SYSTEM)
                                    .toolCalls(
                                        listOf(
                                            ChatCompletionChunk.Choice.Delta.ToolCall.builder()
                                                .index(123L)
                                                .id("id")
                                                .function(
                                                    ChatCompletionChunk.Choice.Delta.ToolCall
                                                        .Function
                                                        .builder()
                                                        .arguments("arguments")
                                                        .name("name")
                                                        .build()
                                                )
                                                .type(
                                                    ChatCompletionChunk.Choice.Delta.ToolCall.Type
                                                        .FUNCTION
                                                )
                                                .build()
                                        )
                                    )
                                    .build()
                            )
                            .finishReason(ChatCompletionChunk.Choice.FinishReason.STOP)
                            .index(123L)
                            .logprobs(
                                ChatCompletionChunk.Choice.Logprobs.builder()
                                    .content(
                                        listOf(
                                            ChatCompletionTokenLogprob.builder()
                                                .token("token")
                                                .bytes(listOf(123L))
                                                .logprob(42.23)
                                                .topLogprobs(
                                                    listOf(
                                                        ChatCompletionTokenLogprob.TopLogprob
                                                            .builder()
                                                            .token("token")
                                                            .bytes(listOf(123L))
                                                            .logprob(42.23)
                                                            .build()
                                                    )
                                                )
                                                .build()
                                        )
                                    )
                                    .refusal(
                                        listOf(
                                            ChatCompletionTokenLogprob.builder()
                                                .token("token")
                                                .bytes(listOf(123L))
                                                .logprob(42.23)
                                                .topLogprobs(
                                                    listOf(
                                                        ChatCompletionTokenLogprob.TopLogprob
                                                            .builder()
                                                            .token("token")
                                                            .bytes(listOf(123L))
                                                            .logprob(42.23)
                                                            .build()
                                                    )
                                                )
                                                .build()
                                        )
                                    )
                                    .build()
                            )
                            .build()
                    )
                )
                .created(123L)
                .model("model")
                .object_(ChatCompletionChunk.Object.CHAT_COMPLETION_CHUNK)
                .serviceTier(ChatCompletionChunk.ServiceTier.SCALE)
                .systemFingerprint("system_fingerprint")
                .usage(
                    ChatCompletionChunk.Usage.builder()
                        .completionTokens(123L)
                        .promptTokens(123L)
                        .totalTokens(123L)
                        .completionTokensDetails(
                            ChatCompletionChunk.Usage.CompletionTokensDetails.builder()
                                .audioTokens(123L)
                                .reasoningTokens(123L)
                                .build()
                        )
                        .promptTokensDetails(
                            ChatCompletionChunk.Usage.PromptTokensDetails.builder()
                                .audioTokens(123L)
                                .cachedTokens(123L)
                                .build()
                        )
                        .build()
                )
                .build()
        assertThat(chatCompletionChunk).isNotNull
        assertThat(chatCompletionChunk.id()).isEqualTo("id")
        assertThat(chatCompletionChunk.choices())
            .containsExactly(
                ChatCompletionChunk.Choice.builder()
                    .delta(
                        ChatCompletionChunk.Choice.Delta.builder()
                            .content("content")
                            .functionCall(
                                ChatCompletionChunk.Choice.Delta.FunctionCall.builder()
                                    .arguments("arguments")
                                    .name("name")
                                    .build()
                            )
                            .refusal("refusal")
                            .role(ChatCompletionChunk.Choice.Delta.Role.SYSTEM)
                            .toolCalls(
                                listOf(
                                    ChatCompletionChunk.Choice.Delta.ToolCall.builder()
                                        .index(123L)
                                        .id("id")
                                        .function(
                                            ChatCompletionChunk.Choice.Delta.ToolCall.Function
                                                .builder()
                                                .arguments("arguments")
                                                .name("name")
                                                .build()
                                        )
                                        .type(
                                            ChatCompletionChunk.Choice.Delta.ToolCall.Type.FUNCTION
                                        )
                                        .build()
                                )
                            )
                            .build()
                    )
                    .finishReason(ChatCompletionChunk.Choice.FinishReason.STOP)
                    .index(123L)
                    .logprobs(
                        ChatCompletionChunk.Choice.Logprobs.builder()
                            .content(
                                listOf(
                                    ChatCompletionTokenLogprob.builder()
                                        .token("token")
                                        .bytes(listOf(123L))
                                        .logprob(42.23)
                                        .topLogprobs(
                                            listOf(
                                                ChatCompletionTokenLogprob.TopLogprob.builder()
                                                    .token("token")
                                                    .bytes(listOf(123L))
                                                    .logprob(42.23)
                                                    .build()
                                            )
                                        )
                                        .build()
                                )
                            )
                            .refusal(
                                listOf(
                                    ChatCompletionTokenLogprob.builder()
                                        .token("token")
                                        .bytes(listOf(123L))
                                        .logprob(42.23)
                                        .topLogprobs(
                                            listOf(
                                                ChatCompletionTokenLogprob.TopLogprob.builder()
                                                    .token("token")
                                                    .bytes(listOf(123L))
                                                    .logprob(42.23)
                                                    .build()
                                            )
                                        )
                                        .build()
                                )
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(chatCompletionChunk.created()).isEqualTo(123L)
        assertThat(chatCompletionChunk.model()).isEqualTo("model")
        assertThat(chatCompletionChunk.object_())
            .isEqualTo(ChatCompletionChunk.Object.CHAT_COMPLETION_CHUNK)
        assertThat(chatCompletionChunk.serviceTier())
            .contains(ChatCompletionChunk.ServiceTier.SCALE)
        assertThat(chatCompletionChunk.systemFingerprint()).contains("system_fingerprint")
        assertThat(chatCompletionChunk.usage())
            .contains(
                ChatCompletionChunk.Usage.builder()
                    .completionTokens(123L)
                    .promptTokens(123L)
                    .totalTokens(123L)
                    .completionTokensDetails(
                        ChatCompletionChunk.Usage.CompletionTokensDetails.builder()
                            .audioTokens(123L)
                            .reasoningTokens(123L)
                            .build()
                    )
                    .promptTokensDetails(
                        ChatCompletionChunk.Usage.PromptTokensDetails.builder()
                            .audioTokens(123L)
                            .cachedTokens(123L)
                            .build()
                    )
                    .build()
            )
    }
}
