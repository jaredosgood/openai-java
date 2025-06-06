// File generated from our OpenAPI spec by Stainless.

package com.openai.models.audio.translations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openai.core.jsonMapper
import com.openai.models.audio.transcriptions.TranscriptionSegment
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranslationVerboseTest {

    @Test
    fun create() {
        val translationVerbose =
            TranslationVerbose.builder()
                .duration(0.0)
                .language("language")
                .text("text")
                .addSegment(
                    TranscriptionSegment.builder()
                        .id(0L)
                        .avgLogprob(0.0f)
                        .compressionRatio(0.0f)
                        .end(0.0f)
                        .noSpeechProb(0.0f)
                        .seek(0L)
                        .start(0.0f)
                        .temperature(0.0f)
                        .text("text")
                        .addToken(0L)
                        .build()
                )
                .build()

        assertThat(translationVerbose.duration()).isEqualTo(0.0)
        assertThat(translationVerbose.language()).isEqualTo("language")
        assertThat(translationVerbose.text()).isEqualTo("text")
        assertThat(translationVerbose.segments().getOrNull())
            .containsExactly(
                TranscriptionSegment.builder()
                    .id(0L)
                    .avgLogprob(0.0f)
                    .compressionRatio(0.0f)
                    .end(0.0f)
                    .noSpeechProb(0.0f)
                    .seek(0L)
                    .start(0.0f)
                    .temperature(0.0f)
                    .text("text")
                    .addToken(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val translationVerbose =
            TranslationVerbose.builder()
                .duration(0.0)
                .language("language")
                .text("text")
                .addSegment(
                    TranscriptionSegment.builder()
                        .id(0L)
                        .avgLogprob(0.0f)
                        .compressionRatio(0.0f)
                        .end(0.0f)
                        .noSpeechProb(0.0f)
                        .seek(0L)
                        .start(0.0f)
                        .temperature(0.0f)
                        .text("text")
                        .addToken(0L)
                        .build()
                )
                .build()

        val roundtrippedTranslationVerbose =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(translationVerbose),
                jacksonTypeRef<TranslationVerbose>(),
            )

        assertThat(roundtrippedTranslationVerbose).isEqualTo(translationVerbose)
    }
}
