// File generated from our OpenAPI spec by Stainless.

package com.openai.models.chat.completions

import com.openai.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCompletionListParamsTest {

    @Test
    fun create() {
        ChatCompletionListParams.builder()
            .after("after")
            .limit(0L)
            .metadata(
                ChatCompletionListParams.Metadata.builder()
                    .putAdditionalProperty("foo", "string")
                    .build()
            )
            .model("model")
            .order(ChatCompletionListParams.Order.ASC)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ChatCompletionListParams.builder()
                .after("after")
                .limit(0L)
                .metadata(
                    ChatCompletionListParams.Metadata.builder()
                        .putAdditionalProperty("foo", "string")
                        .build()
                )
                .model("model")
                .order(ChatCompletionListParams.Order.ASC)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("limit", "0")
                    .put("metadata[foo]", "string")
                    .put("model", "model")
                    .put("order", "asc")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ChatCompletionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
