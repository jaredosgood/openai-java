// File generated from our OpenAPI spec by Stainless.

package com.openai.models.vectorstores.files

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileDeleteParamsTest {

    @Test
    fun create() {
        FileDeleteParams.builder().vectorStoreId("vector_store_id").fileId("file_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            FileDeleteParams.builder().vectorStoreId("vector_store_id").fileId("file_id").build()

        assertThat(params._pathParam(0)).isEqualTo("vector_store_id")
        assertThat(params._pathParam(1)).isEqualTo("file_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
