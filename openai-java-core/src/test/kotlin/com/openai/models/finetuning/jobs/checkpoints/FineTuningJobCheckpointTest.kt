// File generated from our OpenAPI spec by Stainless.

package com.openai.models.finetuning.jobs.checkpoints

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openai.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FineTuningJobCheckpointTest {

    @Test
    fun create() {
        val fineTuningJobCheckpoint =
            FineTuningJobCheckpoint.builder()
                .id("id")
                .createdAt(0L)
                .fineTunedModelCheckpoint("fine_tuned_model_checkpoint")
                .fineTuningJobId("fine_tuning_job_id")
                .metrics(
                    FineTuningJobCheckpoint.Metrics.builder()
                        .fullValidLoss(0.0)
                        .fullValidMeanTokenAccuracy(0.0)
                        .step(0.0)
                        .trainLoss(0.0)
                        .trainMeanTokenAccuracy(0.0)
                        .validLoss(0.0)
                        .validMeanTokenAccuracy(0.0)
                        .build()
                )
                .stepNumber(0L)
                .build()

        assertThat(fineTuningJobCheckpoint.id()).isEqualTo("id")
        assertThat(fineTuningJobCheckpoint.createdAt()).isEqualTo(0L)
        assertThat(fineTuningJobCheckpoint.fineTunedModelCheckpoint())
            .isEqualTo("fine_tuned_model_checkpoint")
        assertThat(fineTuningJobCheckpoint.fineTuningJobId()).isEqualTo("fine_tuning_job_id")
        assertThat(fineTuningJobCheckpoint.metrics())
            .isEqualTo(
                FineTuningJobCheckpoint.Metrics.builder()
                    .fullValidLoss(0.0)
                    .fullValidMeanTokenAccuracy(0.0)
                    .step(0.0)
                    .trainLoss(0.0)
                    .trainMeanTokenAccuracy(0.0)
                    .validLoss(0.0)
                    .validMeanTokenAccuracy(0.0)
                    .build()
            )
        assertThat(fineTuningJobCheckpoint.stepNumber()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fineTuningJobCheckpoint =
            FineTuningJobCheckpoint.builder()
                .id("id")
                .createdAt(0L)
                .fineTunedModelCheckpoint("fine_tuned_model_checkpoint")
                .fineTuningJobId("fine_tuning_job_id")
                .metrics(
                    FineTuningJobCheckpoint.Metrics.builder()
                        .fullValidLoss(0.0)
                        .fullValidMeanTokenAccuracy(0.0)
                        .step(0.0)
                        .trainLoss(0.0)
                        .trainMeanTokenAccuracy(0.0)
                        .validLoss(0.0)
                        .validMeanTokenAccuracy(0.0)
                        .build()
                )
                .stepNumber(0L)
                .build()

        val roundtrippedFineTuningJobCheckpoint =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fineTuningJobCheckpoint),
                jacksonTypeRef<FineTuningJobCheckpoint>(),
            )

        assertThat(roundtrippedFineTuningJobCheckpoint).isEqualTo(fineTuningJobCheckpoint)
    }
}
