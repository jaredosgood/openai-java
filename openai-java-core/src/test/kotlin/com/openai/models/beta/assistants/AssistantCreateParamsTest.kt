// File generated from our OpenAPI spec by Stainless.

package com.openai.models.beta.assistants

import com.openai.core.JsonValue
import com.openai.models.ChatModel
import com.openai.models.ReasoningEffort
import com.openai.models.beta.threads.AssistantResponseFormatOption
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssistantCreateParamsTest {

    @Test
    fun create() {
        AssistantCreateParams.builder()
            .model(ChatModel.GPT_4_1)
            .description("description")
            .instructions("instructions")
            .metadata(
                AssistantCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .name("name")
            .reasoningEffort(ReasoningEffort.LOW)
            .responseFormatAuto()
            .temperature(1.0)
            .toolResources(
                AssistantCreateParams.ToolResources.builder()
                    .codeInterpreter(
                        AssistantCreateParams.ToolResources.CodeInterpreter.builder()
                            .addFileId("string")
                            .build()
                    )
                    .fileSearch(
                        AssistantCreateParams.ToolResources.FileSearch.builder()
                            .addVectorStoreId("string")
                            .addVectorStore(
                                AssistantCreateParams.ToolResources.FileSearch.VectorStore.builder()
                                    .chunkingStrategyAuto()
                                    .addFileId("string")
                                    .metadata(
                                        AssistantCreateParams.ToolResources.FileSearch.VectorStore
                                            .Metadata
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
            .addTool(CodeInterpreterTool.builder().build())
            .topP(1.0)
            .build()
    }

    @Test
    fun body() {
        val params =
            AssistantCreateParams.builder()
                .model(ChatModel.GPT_4_1)
                .description("description")
                .instructions("instructions")
                .metadata(
                    AssistantCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .reasoningEffort(ReasoningEffort.LOW)
                .responseFormatAuto()
                .temperature(1.0)
                .toolResources(
                    AssistantCreateParams.ToolResources.builder()
                        .codeInterpreter(
                            AssistantCreateParams.ToolResources.CodeInterpreter.builder()
                                .addFileId("string")
                                .build()
                        )
                        .fileSearch(
                            AssistantCreateParams.ToolResources.FileSearch.builder()
                                .addVectorStoreId("string")
                                .addVectorStore(
                                    AssistantCreateParams.ToolResources.FileSearch.VectorStore
                                        .builder()
                                        .chunkingStrategyAuto()
                                        .addFileId("string")
                                        .metadata(
                                            AssistantCreateParams.ToolResources.FileSearch
                                                .VectorStore
                                                .Metadata
                                                .builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from("string"),
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .addTool(CodeInterpreterTool.builder().build())
                .topP(1.0)
                .build()

        val body = params._body()

        assertThat(body.model()).isEqualTo(ChatModel.GPT_4_1)
        assertThat(body.description()).contains("description")
        assertThat(body.instructions()).contains("instructions")
        assertThat(body.metadata())
            .contains(
                AssistantCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.name()).contains("name")
        assertThat(body.reasoningEffort()).contains(ReasoningEffort.LOW)
        assertThat(body.responseFormat()).contains(AssistantResponseFormatOption.ofAuto())
        assertThat(body.temperature()).contains(1.0)
        assertThat(body.toolResources())
            .contains(
                AssistantCreateParams.ToolResources.builder()
                    .codeInterpreter(
                        AssistantCreateParams.ToolResources.CodeInterpreter.builder()
                            .addFileId("string")
                            .build()
                    )
                    .fileSearch(
                        AssistantCreateParams.ToolResources.FileSearch.builder()
                            .addVectorStoreId("string")
                            .addVectorStore(
                                AssistantCreateParams.ToolResources.FileSearch.VectorStore.builder()
                                    .chunkingStrategyAuto()
                                    .addFileId("string")
                                    .metadata(
                                        AssistantCreateParams.ToolResources.FileSearch.VectorStore
                                            .Metadata
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(body.tools().getOrNull())
            .containsExactly(AssistantTool.ofCodeInterpreter(CodeInterpreterTool.builder().build()))
        assertThat(body.topP()).contains(1.0)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AssistantCreateParams.builder().model(ChatModel.GPT_4_1).build()

        val body = params._body()

        assertThat(body.model()).isEqualTo(ChatModel.GPT_4_1)
    }
}
