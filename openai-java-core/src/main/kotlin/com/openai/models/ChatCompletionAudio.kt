// File generated from our OpenAPI spec by Stainless.

package com.openai.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.openai.core.ExcludeMissing
import com.openai.core.JsonField
import com.openai.core.JsonMissing
import com.openai.core.JsonValue
import com.openai.core.NoAutoDetect
import com.openai.core.toImmutable
import java.util.Objects

/**
 * If the audio output modality is requested, this object contains data about the audio response
 * from the model. [Learn more](https://platform.openai.com/docs/guides/audio).
 */
@JsonDeserialize(builder = ChatCompletionAudio.Builder::class)
@NoAutoDetect
class ChatCompletionAudio
private constructor(
    private val id: JsonField<String>,
    private val expiresAt: JsonField<Long>,
    private val data: JsonField<String>,
    private val transcript: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Unique identifier for this audio response. */
    fun id(): String = id.getRequired("id")

    /**
     * The Unix timestamp (in seconds) for when this audio response will no longer be accessible on
     * the server for use in multi-turn conversations.
     */
    fun expiresAt(): Long = expiresAt.getRequired("expires_at")

    /**
     * Base64 encoded audio bytes generated by the model, in the format specified in the request.
     */
    fun data(): String = data.getRequired("data")

    /** Transcript of the audio generated by the model. */
    fun transcript(): String = transcript.getRequired("transcript")

    /** Unique identifier for this audio response. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The Unix timestamp (in seconds) for when this audio response will no longer be accessible on
     * the server for use in multi-turn conversations.
     */
    @JsonProperty("expires_at") @ExcludeMissing fun _expiresAt() = expiresAt

    /**
     * Base64 encoded audio bytes generated by the model, in the format specified in the request.
     */
    @JsonProperty("data") @ExcludeMissing fun _data() = data

    /** Transcript of the audio generated by the model. */
    @JsonProperty("transcript") @ExcludeMissing fun _transcript() = transcript

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ChatCompletionAudio = apply {
        if (!validated) {
            id()
            expiresAt()
            data()
            transcript()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var expiresAt: JsonField<Long> = JsonMissing.of()
        private var data: JsonField<String> = JsonMissing.of()
        private var transcript: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(chatCompletionAudio: ChatCompletionAudio) = apply {
            this.id = chatCompletionAudio.id
            this.expiresAt = chatCompletionAudio.expiresAt
            this.data = chatCompletionAudio.data
            this.transcript = chatCompletionAudio.transcript
            additionalProperties(chatCompletionAudio.additionalProperties)
        }

        /** Unique identifier for this audio response. */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for this audio response. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The Unix timestamp (in seconds) for when this audio response will no longer be accessible
         * on the server for use in multi-turn conversations.
         */
        fun expiresAt(expiresAt: Long) = expiresAt(JsonField.of(expiresAt))

        /**
         * The Unix timestamp (in seconds) for when this audio response will no longer be accessible
         * on the server for use in multi-turn conversations.
         */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun expiresAt(expiresAt: JsonField<Long>) = apply { this.expiresAt = expiresAt }

        /**
         * Base64 encoded audio bytes generated by the model, in the format specified in the
         * request.
         */
        fun data(data: String) = data(JsonField.of(data))

        /**
         * Base64 encoded audio bytes generated by the model, in the format specified in the
         * request.
         */
        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<String>) = apply { this.data = data }

        /** Transcript of the audio generated by the model. */
        fun transcript(transcript: String) = transcript(JsonField.of(transcript))

        /** Transcript of the audio generated by the model. */
        @JsonProperty("transcript")
        @ExcludeMissing
        fun transcript(transcript: JsonField<String>) = apply { this.transcript = transcript }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): ChatCompletionAudio =
            ChatCompletionAudio(
                id,
                expiresAt,
                data,
                transcript,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ChatCompletionAudio && this.id == other.id && this.expiresAt == other.expiresAt && this.data == other.data && this.transcript == other.transcript && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(id, expiresAt, data, transcript, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ChatCompletionAudio{id=$id, expiresAt=$expiresAt, data=$data, transcript=$transcript, additionalProperties=$additionalProperties}"
}
