// File generated from our OpenAPI spec by Stainless.

package com.openai.models.completions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.openai.core.ExcludeMissing
import com.openai.core.JsonField
import com.openai.core.JsonMissing
import com.openai.core.JsonValue
import com.openai.core.checkRequired
import com.openai.errors.OpenAIInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Usage statistics for the completion request. */
class CompletionUsage
private constructor(
    private val completionTokens: JsonField<Long>,
    private val promptTokens: JsonField<Long>,
    private val totalTokens: JsonField<Long>,
    private val completionTokensDetails: JsonField<CompletionTokensDetails>,
    private val promptTokensDetails: JsonField<PromptTokensDetails>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("completion_tokens")
        @ExcludeMissing
        completionTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("prompt_tokens")
        @ExcludeMissing
        promptTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total_tokens")
        @ExcludeMissing
        totalTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("completion_tokens_details")
        @ExcludeMissing
        completionTokensDetails: JsonField<CompletionTokensDetails> = JsonMissing.of(),
        @JsonProperty("prompt_tokens_details")
        @ExcludeMissing
        promptTokensDetails: JsonField<PromptTokensDetails> = JsonMissing.of(),
    ) : this(
        completionTokens,
        promptTokens,
        totalTokens,
        completionTokensDetails,
        promptTokensDetails,
        mutableMapOf(),
    )

    /**
     * Number of tokens in the generated completion.
     *
     * @throws OpenAIInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun completionTokens(): Long = completionTokens.getRequired("completion_tokens")

    /**
     * Number of tokens in the prompt.
     *
     * @throws OpenAIInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun promptTokens(): Long = promptTokens.getRequired("prompt_tokens")

    /**
     * Total number of tokens used in the request (prompt + completion).
     *
     * @throws OpenAIInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalTokens(): Long = totalTokens.getRequired("total_tokens")

    /**
     * Breakdown of tokens used in a completion.
     *
     * @throws OpenAIInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completionTokensDetails(): Optional<CompletionTokensDetails> =
        completionTokensDetails.getOptional("completion_tokens_details")

    /**
     * Breakdown of tokens used in the prompt.
     *
     * @throws OpenAIInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptTokensDetails(): Optional<PromptTokensDetails> =
        promptTokensDetails.getOptional("prompt_tokens_details")

    /**
     * Returns the raw JSON value of [completionTokens].
     *
     * Unlike [completionTokens], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("completion_tokens")
    @ExcludeMissing
    fun _completionTokens(): JsonField<Long> = completionTokens

    /**
     * Returns the raw JSON value of [promptTokens].
     *
     * Unlike [promptTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt_tokens")
    @ExcludeMissing
    fun _promptTokens(): JsonField<Long> = promptTokens

    /**
     * Returns the raw JSON value of [totalTokens].
     *
     * Unlike [totalTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_tokens") @ExcludeMissing fun _totalTokens(): JsonField<Long> = totalTokens

    /**
     * Returns the raw JSON value of [completionTokensDetails].
     *
     * Unlike [completionTokensDetails], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("completion_tokens_details")
    @ExcludeMissing
    fun _completionTokensDetails(): JsonField<CompletionTokensDetails> = completionTokensDetails

    /**
     * Returns the raw JSON value of [promptTokensDetails].
     *
     * Unlike [promptTokensDetails], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("prompt_tokens_details")
    @ExcludeMissing
    fun _promptTokensDetails(): JsonField<PromptTokensDetails> = promptTokensDetails

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CompletionUsage].
         *
         * The following fields are required:
         * ```java
         * .completionTokens()
         * .promptTokens()
         * .totalTokens()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CompletionUsage]. */
    class Builder internal constructor() {

        private var completionTokens: JsonField<Long>? = null
        private var promptTokens: JsonField<Long>? = null
        private var totalTokens: JsonField<Long>? = null
        private var completionTokensDetails: JsonField<CompletionTokensDetails> = JsonMissing.of()
        private var promptTokensDetails: JsonField<PromptTokensDetails> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(completionUsage: CompletionUsage) = apply {
            completionTokens = completionUsage.completionTokens
            promptTokens = completionUsage.promptTokens
            totalTokens = completionUsage.totalTokens
            completionTokensDetails = completionUsage.completionTokensDetails
            promptTokensDetails = completionUsage.promptTokensDetails
            additionalProperties = completionUsage.additionalProperties.toMutableMap()
        }

        /** Number of tokens in the generated completion. */
        fun completionTokens(completionTokens: Long) =
            completionTokens(JsonField.of(completionTokens))

        /**
         * Sets [Builder.completionTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completionTokens] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completionTokens(completionTokens: JsonField<Long>) = apply {
            this.completionTokens = completionTokens
        }

        /** Number of tokens in the prompt. */
        fun promptTokens(promptTokens: Long) = promptTokens(JsonField.of(promptTokens))

        /**
         * Sets [Builder.promptTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun promptTokens(promptTokens: JsonField<Long>) = apply { this.promptTokens = promptTokens }

        /** Total number of tokens used in the request (prompt + completion). */
        fun totalTokens(totalTokens: Long) = totalTokens(JsonField.of(totalTokens))

        /**
         * Sets [Builder.totalTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalTokens(totalTokens: JsonField<Long>) = apply { this.totalTokens = totalTokens }

        /** Breakdown of tokens used in a completion. */
        fun completionTokensDetails(completionTokensDetails: CompletionTokensDetails) =
            completionTokensDetails(JsonField.of(completionTokensDetails))

        /**
         * Sets [Builder.completionTokensDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completionTokensDetails] with a well-typed
         * [CompletionTokensDetails] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun completionTokensDetails(completionTokensDetails: JsonField<CompletionTokensDetails>) =
            apply {
                this.completionTokensDetails = completionTokensDetails
            }

        /** Breakdown of tokens used in the prompt. */
        fun promptTokensDetails(promptTokensDetails: PromptTokensDetails) =
            promptTokensDetails(JsonField.of(promptTokensDetails))

        /**
         * Sets [Builder.promptTokensDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptTokensDetails] with a well-typed
         * [PromptTokensDetails] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun promptTokensDetails(promptTokensDetails: JsonField<PromptTokensDetails>) = apply {
            this.promptTokensDetails = promptTokensDetails
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [CompletionUsage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .completionTokens()
         * .promptTokens()
         * .totalTokens()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CompletionUsage =
            CompletionUsage(
                checkRequired("completionTokens", completionTokens),
                checkRequired("promptTokens", promptTokens),
                checkRequired("totalTokens", totalTokens),
                completionTokensDetails,
                promptTokensDetails,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CompletionUsage = apply {
        if (validated) {
            return@apply
        }

        completionTokens()
        promptTokens()
        totalTokens()
        completionTokensDetails().ifPresent { it.validate() }
        promptTokensDetails().ifPresent { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: OpenAIInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (completionTokens.asKnown().isPresent) 1 else 0) +
            (if (promptTokens.asKnown().isPresent) 1 else 0) +
            (if (totalTokens.asKnown().isPresent) 1 else 0) +
            (completionTokensDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (promptTokensDetails.asKnown().getOrNull()?.validity() ?: 0)

    /** Breakdown of tokens used in a completion. */
    class CompletionTokensDetails
    private constructor(
        private val acceptedPredictionTokens: JsonField<Long>,
        private val audioTokens: JsonField<Long>,
        private val reasoningTokens: JsonField<Long>,
        private val rejectedPredictionTokens: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accepted_prediction_tokens")
            @ExcludeMissing
            acceptedPredictionTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("audio_tokens")
            @ExcludeMissing
            audioTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("reasoning_tokens")
            @ExcludeMissing
            reasoningTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("rejected_prediction_tokens")
            @ExcludeMissing
            rejectedPredictionTokens: JsonField<Long> = JsonMissing.of(),
        ) : this(
            acceptedPredictionTokens,
            audioTokens,
            reasoningTokens,
            rejectedPredictionTokens,
            mutableMapOf(),
        )

        /**
         * When using Predicted Outputs, the number of tokens in the prediction that appeared in the
         * completion.
         *
         * @throws OpenAIInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun acceptedPredictionTokens(): Optional<Long> =
            acceptedPredictionTokens.getOptional("accepted_prediction_tokens")

        /**
         * Audio input tokens generated by the model.
         *
         * @throws OpenAIInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun audioTokens(): Optional<Long> = audioTokens.getOptional("audio_tokens")

        /**
         * Tokens generated by the model for reasoning.
         *
         * @throws OpenAIInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reasoningTokens(): Optional<Long> = reasoningTokens.getOptional("reasoning_tokens")

        /**
         * When using Predicted Outputs, the number of tokens in the prediction that did not appear
         * in the completion. However, like reasoning tokens, these tokens are still counted in the
         * total completion tokens for purposes of billing, output, and context window limits.
         *
         * @throws OpenAIInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rejectedPredictionTokens(): Optional<Long> =
            rejectedPredictionTokens.getOptional("rejected_prediction_tokens")

        /**
         * Returns the raw JSON value of [acceptedPredictionTokens].
         *
         * Unlike [acceptedPredictionTokens], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("accepted_prediction_tokens")
        @ExcludeMissing
        fun _acceptedPredictionTokens(): JsonField<Long> = acceptedPredictionTokens

        /**
         * Returns the raw JSON value of [audioTokens].
         *
         * Unlike [audioTokens], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("audio_tokens")
        @ExcludeMissing
        fun _audioTokens(): JsonField<Long> = audioTokens

        /**
         * Returns the raw JSON value of [reasoningTokens].
         *
         * Unlike [reasoningTokens], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("reasoning_tokens")
        @ExcludeMissing
        fun _reasoningTokens(): JsonField<Long> = reasoningTokens

        /**
         * Returns the raw JSON value of [rejectedPredictionTokens].
         *
         * Unlike [rejectedPredictionTokens], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("rejected_prediction_tokens")
        @ExcludeMissing
        fun _rejectedPredictionTokens(): JsonField<Long> = rejectedPredictionTokens

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [CompletionTokensDetails].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CompletionTokensDetails]. */
        class Builder internal constructor() {

            private var acceptedPredictionTokens: JsonField<Long> = JsonMissing.of()
            private var audioTokens: JsonField<Long> = JsonMissing.of()
            private var reasoningTokens: JsonField<Long> = JsonMissing.of()
            private var rejectedPredictionTokens: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(completionTokensDetails: CompletionTokensDetails) = apply {
                acceptedPredictionTokens = completionTokensDetails.acceptedPredictionTokens
                audioTokens = completionTokensDetails.audioTokens
                reasoningTokens = completionTokensDetails.reasoningTokens
                rejectedPredictionTokens = completionTokensDetails.rejectedPredictionTokens
                additionalProperties = completionTokensDetails.additionalProperties.toMutableMap()
            }

            /**
             * When using Predicted Outputs, the number of tokens in the prediction that appeared in
             * the completion.
             */
            fun acceptedPredictionTokens(acceptedPredictionTokens: Long) =
                acceptedPredictionTokens(JsonField.of(acceptedPredictionTokens))

            /**
             * Sets [Builder.acceptedPredictionTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.acceptedPredictionTokens] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun acceptedPredictionTokens(acceptedPredictionTokens: JsonField<Long>) = apply {
                this.acceptedPredictionTokens = acceptedPredictionTokens
            }

            /** Audio input tokens generated by the model. */
            fun audioTokens(audioTokens: Long) = audioTokens(JsonField.of(audioTokens))

            /**
             * Sets [Builder.audioTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.audioTokens] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun audioTokens(audioTokens: JsonField<Long>) = apply { this.audioTokens = audioTokens }

            /** Tokens generated by the model for reasoning. */
            fun reasoningTokens(reasoningTokens: Long) =
                reasoningTokens(JsonField.of(reasoningTokens))

            /**
             * Sets [Builder.reasoningTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reasoningTokens] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reasoningTokens(reasoningTokens: JsonField<Long>) = apply {
                this.reasoningTokens = reasoningTokens
            }

            /**
             * When using Predicted Outputs, the number of tokens in the prediction that did not
             * appear in the completion. However, like reasoning tokens, these tokens are still
             * counted in the total completion tokens for purposes of billing, output, and context
             * window limits.
             */
            fun rejectedPredictionTokens(rejectedPredictionTokens: Long) =
                rejectedPredictionTokens(JsonField.of(rejectedPredictionTokens))

            /**
             * Sets [Builder.rejectedPredictionTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rejectedPredictionTokens] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun rejectedPredictionTokens(rejectedPredictionTokens: JsonField<Long>) = apply {
                this.rejectedPredictionTokens = rejectedPredictionTokens
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [CompletionTokensDetails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CompletionTokensDetails =
                CompletionTokensDetails(
                    acceptedPredictionTokens,
                    audioTokens,
                    reasoningTokens,
                    rejectedPredictionTokens,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CompletionTokensDetails = apply {
            if (validated) {
                return@apply
            }

            acceptedPredictionTokens()
            audioTokens()
            reasoningTokens()
            rejectedPredictionTokens()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OpenAIInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (acceptedPredictionTokens.asKnown().isPresent) 1 else 0) +
                (if (audioTokens.asKnown().isPresent) 1 else 0) +
                (if (reasoningTokens.asKnown().isPresent) 1 else 0) +
                (if (rejectedPredictionTokens.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CompletionTokensDetails && acceptedPredictionTokens == other.acceptedPredictionTokens && audioTokens == other.audioTokens && reasoningTokens == other.reasoningTokens && rejectedPredictionTokens == other.rejectedPredictionTokens && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(acceptedPredictionTokens, audioTokens, reasoningTokens, rejectedPredictionTokens, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CompletionTokensDetails{acceptedPredictionTokens=$acceptedPredictionTokens, audioTokens=$audioTokens, reasoningTokens=$reasoningTokens, rejectedPredictionTokens=$rejectedPredictionTokens, additionalProperties=$additionalProperties}"
    }

    /** Breakdown of tokens used in the prompt. */
    class PromptTokensDetails
    private constructor(
        private val audioTokens: JsonField<Long>,
        private val cachedTokens: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("audio_tokens")
            @ExcludeMissing
            audioTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("cached_tokens")
            @ExcludeMissing
            cachedTokens: JsonField<Long> = JsonMissing.of(),
        ) : this(audioTokens, cachedTokens, mutableMapOf())

        /**
         * Audio input tokens present in the prompt.
         *
         * @throws OpenAIInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun audioTokens(): Optional<Long> = audioTokens.getOptional("audio_tokens")

        /**
         * Cached tokens present in the prompt.
         *
         * @throws OpenAIInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cachedTokens(): Optional<Long> = cachedTokens.getOptional("cached_tokens")

        /**
         * Returns the raw JSON value of [audioTokens].
         *
         * Unlike [audioTokens], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("audio_tokens")
        @ExcludeMissing
        fun _audioTokens(): JsonField<Long> = audioTokens

        /**
         * Returns the raw JSON value of [cachedTokens].
         *
         * Unlike [cachedTokens], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cached_tokens")
        @ExcludeMissing
        fun _cachedTokens(): JsonField<Long> = cachedTokens

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [PromptTokensDetails]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PromptTokensDetails]. */
        class Builder internal constructor() {

            private var audioTokens: JsonField<Long> = JsonMissing.of()
            private var cachedTokens: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(promptTokensDetails: PromptTokensDetails) = apply {
                audioTokens = promptTokensDetails.audioTokens
                cachedTokens = promptTokensDetails.cachedTokens
                additionalProperties = promptTokensDetails.additionalProperties.toMutableMap()
            }

            /** Audio input tokens present in the prompt. */
            fun audioTokens(audioTokens: Long) = audioTokens(JsonField.of(audioTokens))

            /**
             * Sets [Builder.audioTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.audioTokens] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun audioTokens(audioTokens: JsonField<Long>) = apply { this.audioTokens = audioTokens }

            /** Cached tokens present in the prompt. */
            fun cachedTokens(cachedTokens: Long) = cachedTokens(JsonField.of(cachedTokens))

            /**
             * Sets [Builder.cachedTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cachedTokens] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cachedTokens(cachedTokens: JsonField<Long>) = apply {
                this.cachedTokens = cachedTokens
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [PromptTokensDetails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PromptTokensDetails =
                PromptTokensDetails(audioTokens, cachedTokens, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): PromptTokensDetails = apply {
            if (validated) {
                return@apply
            }

            audioTokens()
            cachedTokens()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OpenAIInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (audioTokens.asKnown().isPresent) 1 else 0) +
                (if (cachedTokens.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PromptTokensDetails && audioTokens == other.audioTokens && cachedTokens == other.cachedTokens && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(audioTokens, cachedTokens, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PromptTokensDetails{audioTokens=$audioTokens, cachedTokens=$cachedTokens, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CompletionUsage && completionTokens == other.completionTokens && promptTokens == other.promptTokens && totalTokens == other.totalTokens && completionTokensDetails == other.completionTokensDetails && promptTokensDetails == other.promptTokensDetails && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(completionTokens, promptTokens, totalTokens, completionTokensDetails, promptTokensDetails, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CompletionUsage{completionTokens=$completionTokens, promptTokens=$promptTokens, totalTokens=$totalTokens, completionTokensDetails=$completionTokensDetails, promptTokensDetails=$promptTokensDetails, additionalProperties=$additionalProperties}"
}
