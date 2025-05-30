// File generated from our OpenAPI spec by Stainless.

package com.openai.models.evals

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openai.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EvalLabelModelGraderTest {

    @Test
    fun create() {
        val evalLabelModelGrader =
            EvalLabelModelGrader.builder()
                .addInput(
                    EvalLabelModelGrader.Input.builder()
                        .content("string")
                        .role(EvalLabelModelGrader.Input.Role.USER)
                        .type(EvalLabelModelGrader.Input.Type.MESSAGE)
                        .build()
                )
                .addLabel("string")
                .model("model")
                .name("name")
                .addPassingLabel("string")
                .build()

        assertThat(evalLabelModelGrader.input())
            .containsExactly(
                EvalLabelModelGrader.Input.builder()
                    .content("string")
                    .role(EvalLabelModelGrader.Input.Role.USER)
                    .type(EvalLabelModelGrader.Input.Type.MESSAGE)
                    .build()
            )
        assertThat(evalLabelModelGrader.labels()).containsExactly("string")
        assertThat(evalLabelModelGrader.model()).isEqualTo("model")
        assertThat(evalLabelModelGrader.name()).isEqualTo("name")
        assertThat(evalLabelModelGrader.passingLabels()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val evalLabelModelGrader =
            EvalLabelModelGrader.builder()
                .addInput(
                    EvalLabelModelGrader.Input.builder()
                        .content("string")
                        .role(EvalLabelModelGrader.Input.Role.USER)
                        .type(EvalLabelModelGrader.Input.Type.MESSAGE)
                        .build()
                )
                .addLabel("string")
                .model("model")
                .name("name")
                .addPassingLabel("string")
                .build()

        val roundtrippedEvalLabelModelGrader =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(evalLabelModelGrader),
                jacksonTypeRef<EvalLabelModelGrader>(),
            )

        assertThat(roundtrippedEvalLabelModelGrader).isEqualTo(evalLabelModelGrader)
    }
}
