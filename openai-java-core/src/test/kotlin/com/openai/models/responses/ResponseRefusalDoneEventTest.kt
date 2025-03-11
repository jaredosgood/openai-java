// File generated from our OpenAPI spec by Stainless.

package com.openai.models.responses

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ResponseRefusalDoneEventTest {

    @Test
    fun createResponseRefusalDoneEvent() {
        val responseRefusalDoneEvent =
            ResponseRefusalDoneEvent.builder()
                .contentIndex(0L)
                .itemId("item_id")
                .outputIndex(0L)
                .refusal("refusal")
                .build()
        assertThat(responseRefusalDoneEvent).isNotNull
        assertThat(responseRefusalDoneEvent.contentIndex()).isEqualTo(0L)
        assertThat(responseRefusalDoneEvent.itemId()).isEqualTo("item_id")
        assertThat(responseRefusalDoneEvent.outputIndex()).isEqualTo(0L)
        assertThat(responseRefusalDoneEvent.refusal()).isEqualTo("refusal")
    }
}
