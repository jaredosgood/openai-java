// File generated from our OpenAPI spec by Stainless.

package com.openai.models.evals

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openai.core.JsonValue
import com.openai.core.jsonMapper
import com.openai.models.graders.gradermodels.LabelModelGrader
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EvalRetrieveResponseTest {

    @Test
    fun create() {
        val evalRetrieveResponse =
            EvalRetrieveResponse.builder()
                .id("id")
                .createdAt(0L)
                .customDataSourceConfig(
                    EvalCustomDataSourceConfig.Schema.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .metadata(
                    EvalRetrieveResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("Chatbot effectiveness Evaluation")
                .addTestingCriterion(
                    LabelModelGrader.builder()
                        .addInput(
                            LabelModelGrader.Input.builder()
                                .content("string")
                                .role(LabelModelGrader.Input.Role.USER)
                                .type(LabelModelGrader.Input.Type.MESSAGE)
                                .build()
                        )
                        .addLabel("string")
                        .model("model")
                        .name("name")
                        .addPassingLabel("string")
                        .build()
                )
                .build()

        assertThat(evalRetrieveResponse.id()).isEqualTo("id")
        assertThat(evalRetrieveResponse.createdAt()).isEqualTo(0L)
        assertThat(evalRetrieveResponse.dataSourceConfig())
            .isEqualTo(
                EvalRetrieveResponse.DataSourceConfig.ofCustom(
                    EvalCustomDataSourceConfig.builder()
                        .schema(
                            EvalCustomDataSourceConfig.Schema.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
            )
        assertThat(evalRetrieveResponse.metadata())
            .contains(
                EvalRetrieveResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(evalRetrieveResponse.name()).isEqualTo("Chatbot effectiveness Evaluation")
        assertThat(evalRetrieveResponse.testingCriteria())
            .containsExactly(
                EvalRetrieveResponse.TestingCriterion.ofLabelModelGrader(
                    LabelModelGrader.builder()
                        .addInput(
                            LabelModelGrader.Input.builder()
                                .content("string")
                                .role(LabelModelGrader.Input.Role.USER)
                                .type(LabelModelGrader.Input.Type.MESSAGE)
                                .build()
                        )
                        .addLabel("string")
                        .model("model")
                        .name("name")
                        .addPassingLabel("string")
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val evalRetrieveResponse =
            EvalRetrieveResponse.builder()
                .id("id")
                .createdAt(0L)
                .customDataSourceConfig(
                    EvalCustomDataSourceConfig.Schema.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .metadata(
                    EvalRetrieveResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("Chatbot effectiveness Evaluation")
                .addTestingCriterion(
                    LabelModelGrader.builder()
                        .addInput(
                            LabelModelGrader.Input.builder()
                                .content("string")
                                .role(LabelModelGrader.Input.Role.USER)
                                .type(LabelModelGrader.Input.Type.MESSAGE)
                                .build()
                        )
                        .addLabel("string")
                        .model("model")
                        .name("name")
                        .addPassingLabel("string")
                        .build()
                )
                .build()

        val roundtrippedEvalRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(evalRetrieveResponse),
                jacksonTypeRef<EvalRetrieveResponse>(),
            )

        assertThat(roundtrippedEvalRetrieveResponse).isEqualTo(evalRetrieveResponse)
    }
}
