// File generated from our OpenAPI spec by Stainless.

package com.openai.models.chat.completions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.openai.core.ExcludeMissing
import com.openai.core.JsonField
import com.openai.core.JsonMissing
import com.openai.core.JsonValue
import com.openai.core.NoAutoDetect
import com.openai.core.checkKnown
import com.openai.core.checkRequired
import com.openai.core.immutableEmptyMap
import com.openai.core.toImmutable
import com.openai.errors.OpenAIInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A chat completion message generated by the model. */
@NoAutoDetect
class ChatCompletionStoreMessage
@JsonCreator
private constructor(
    @JsonProperty("content")
    @ExcludeMissing
    private val content: JsonField<String> = JsonMissing.of(),
    @JsonProperty("refusal")
    @ExcludeMissing
    private val refusal: JsonField<String> = JsonMissing.of(),
    @JsonProperty("role") @ExcludeMissing private val role: JsonValue = JsonMissing.of(),
    @JsonProperty("annotations")
    @ExcludeMissing
    private val annotations: JsonField<List<ChatCompletionMessage.Annotation>> = JsonMissing.of(),
    @JsonProperty("audio")
    @ExcludeMissing
    private val audio: JsonField<ChatCompletionAudio> = JsonMissing.of(),
    @JsonProperty("function_call")
    @ExcludeMissing
    private val functionCall: JsonField<ChatCompletionMessage.FunctionCall> = JsonMissing.of(),
    @JsonProperty("tool_calls")
    @ExcludeMissing
    private val toolCalls: JsonField<List<ChatCompletionMessageToolCall>> = JsonMissing.of(),
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The contents of the message.
     *
     * @throws OpenAIInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun content(): Optional<String> = Optional.ofNullable(content.getNullable("content"))

    /**
     * The refusal message generated by the model.
     *
     * @throws OpenAIInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun refusal(): Optional<String> = Optional.ofNullable(refusal.getNullable("refusal"))

    /**
     * The role of the author of this message.
     *
     * Expected to always return the following:
     * ```java
     * JsonValue.from("assistant")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

    /**
     * Annotations for the message, when applicable, as when using the
     * [web search tool](https://platform.openai.com/docs/guides/tools-web-search?api-mode=chat).
     *
     * @throws OpenAIInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun annotations(): Optional<List<ChatCompletionMessage.Annotation>> =
        Optional.ofNullable(annotations.getNullable("annotations"))

    /**
     * If the audio output modality is requested, this object contains data about the audio response
     * from the model. [Learn more](https://platform.openai.com/docs/guides/audio).
     *
     * @throws OpenAIInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun audio(): Optional<ChatCompletionAudio> = Optional.ofNullable(audio.getNullable("audio"))

    /**
     * Deprecated and replaced by `tool_calls`. The name and arguments of a function that should be
     * called, as generated by the model.
     *
     * @throws OpenAIInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun functionCall(): Optional<ChatCompletionMessage.FunctionCall> =
        Optional.ofNullable(functionCall.getNullable("function_call"))

    /**
     * The tool calls generated by the model, such as function calls.
     *
     * @throws OpenAIInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolCalls(): Optional<List<ChatCompletionMessageToolCall>> =
        Optional.ofNullable(toolCalls.getNullable("tool_calls"))

    /**
     * The identifier of the chat message.
     *
     * @throws OpenAIInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

    /**
     * Returns the raw JSON value of [refusal].
     *
     * Unlike [refusal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("refusal") @ExcludeMissing fun _refusal(): JsonField<String> = refusal

    /**
     * Returns the raw JSON value of [annotations].
     *
     * Unlike [annotations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("annotations")
    @ExcludeMissing
    fun _annotations(): JsonField<List<ChatCompletionMessage.Annotation>> = annotations

    /**
     * Returns the raw JSON value of [audio].
     *
     * Unlike [audio], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("audio") @ExcludeMissing fun _audio(): JsonField<ChatCompletionAudio> = audio

    /**
     * Returns the raw JSON value of [functionCall].
     *
     * Unlike [functionCall], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("function_call")
    @ExcludeMissing
    fun _functionCall(): JsonField<ChatCompletionMessage.FunctionCall> = functionCall

    /**
     * Returns the raw JSON value of [toolCalls].
     *
     * Unlike [toolCalls], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tool_calls")
    @ExcludeMissing
    fun _toolCalls(): JsonField<List<ChatCompletionMessageToolCall>> = toolCalls

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun toChatCompletionMessage(): ChatCompletionMessage =
        ChatCompletionMessage.builder()
            .content(content)
            .refusal(refusal)
            .role(role)
            .annotations(annotations)
            .audio(audio)
            .functionCall(functionCall)
            .toolCalls(toolCalls)
            .build()

    private var validated: Boolean = false

    fun validate(): ChatCompletionStoreMessage = apply {
        if (validated) {
            return@apply
        }

        content()
        refusal()
        _role().let {
            if (it != JsonValue.from("assistant")) {
                throw OpenAIInvalidDataException("'role' is invalid, received $it")
            }
        }
        annotations().ifPresent { it.forEach { it.validate() } }
        audio().ifPresent { it.validate() }
        functionCall().ifPresent { it.validate() }
        toolCalls().ifPresent { it.forEach { it.validate() } }
        id()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ChatCompletionStoreMessage].
         *
         * The following fields are required:
         * ```java
         * .content()
         * .refusal()
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChatCompletionStoreMessage]. */
    class Builder internal constructor() {

        private var content: JsonField<String>? = null
        private var refusal: JsonField<String>? = null
        private var role: JsonValue = JsonValue.from("assistant")
        private var annotations: JsonField<MutableList<ChatCompletionMessage.Annotation>>? = null
        private var audio: JsonField<ChatCompletionAudio> = JsonMissing.of()
        private var functionCall: JsonField<ChatCompletionMessage.FunctionCall> = JsonMissing.of()
        private var toolCalls: JsonField<MutableList<ChatCompletionMessageToolCall>>? = null
        private var id: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(chatCompletionStoreMessage: ChatCompletionStoreMessage) = apply {
            content = chatCompletionStoreMessage.content
            refusal = chatCompletionStoreMessage.refusal
            role = chatCompletionStoreMessage.role
            annotations = chatCompletionStoreMessage.annotations.map { it.toMutableList() }
            audio = chatCompletionStoreMessage.audio
            functionCall = chatCompletionStoreMessage.functionCall
            toolCalls = chatCompletionStoreMessage.toolCalls.map { it.toMutableList() }
            id = chatCompletionStoreMessage.id
            additionalProperties = chatCompletionStoreMessage.additionalProperties.toMutableMap()
        }

        /** The contents of the message. */
        fun content(content: String?) = content(JsonField.ofNullable(content))

        /** Alias for calling [Builder.content] with `content.orElse(null)`. */
        fun content(content: Optional<String>) = content(content.getOrNull())

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun content(content: JsonField<String>) = apply { this.content = content }

        /** The refusal message generated by the model. */
        fun refusal(refusal: String?) = refusal(JsonField.ofNullable(refusal))

        /** Alias for calling [Builder.refusal] with `refusal.orElse(null)`. */
        fun refusal(refusal: Optional<String>) = refusal(refusal.getOrNull())

        /**
         * Sets [Builder.refusal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refusal] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun refusal(refusal: JsonField<String>) = apply { this.refusal = refusal }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```java
         * JsonValue.from("assistant")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun role(role: JsonValue) = apply { this.role = role }

        /**
         * Annotations for the message, when applicable, as when using the
         * [web search tool](https://platform.openai.com/docs/guides/tools-web-search?api-mode=chat).
         */
        fun annotations(annotations: List<ChatCompletionMessage.Annotation>) =
            annotations(JsonField.of(annotations))

        /**
         * Sets [Builder.annotations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.annotations] with a well-typed
         * `List<ChatCompletionMessage.Annotation>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun annotations(annotations: JsonField<List<ChatCompletionMessage.Annotation>>) = apply {
            this.annotations = annotations.map { it.toMutableList() }
        }

        /**
         * Adds a single [ChatCompletionMessage.Annotation] to [annotations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAnnotation(annotation: ChatCompletionMessage.Annotation) = apply {
            annotations =
                (annotations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("annotations", it).add(annotation)
                }
        }

        /**
         * If the audio output modality is requested, this object contains data about the audio
         * response from the model. [Learn more](https://platform.openai.com/docs/guides/audio).
         */
        fun audio(audio: ChatCompletionAudio?) = audio(JsonField.ofNullable(audio))

        /** Alias for calling [Builder.audio] with `audio.orElse(null)`. */
        fun audio(audio: Optional<ChatCompletionAudio>) = audio(audio.getOrNull())

        /**
         * Sets [Builder.audio] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audio] with a well-typed [ChatCompletionAudio] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun audio(audio: JsonField<ChatCompletionAudio>) = apply { this.audio = audio }

        /**
         * Deprecated and replaced by `tool_calls`. The name and arguments of a function that should
         * be called, as generated by the model.
         */
        @Deprecated("deprecated")
        fun functionCall(functionCall: ChatCompletionMessage.FunctionCall) =
            functionCall(JsonField.of(functionCall))

        /**
         * Sets [Builder.functionCall] to an arbitrary JSON value.
         *
         * You should usually call [Builder.functionCall] with a well-typed
         * [ChatCompletionMessage.FunctionCall] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun functionCall(functionCall: JsonField<ChatCompletionMessage.FunctionCall>) = apply {
            this.functionCall = functionCall
        }

        /** The tool calls generated by the model, such as function calls. */
        fun toolCalls(toolCalls: List<ChatCompletionMessageToolCall>) =
            toolCalls(JsonField.of(toolCalls))

        /**
         * Sets [Builder.toolCalls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolCalls] with a well-typed
         * `List<ChatCompletionMessageToolCall>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun toolCalls(toolCalls: JsonField<List<ChatCompletionMessageToolCall>>) = apply {
            this.toolCalls = toolCalls.map { it.toMutableList() }
        }

        /**
         * Adds a single [ChatCompletionMessageToolCall] to [toolCalls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addToolCall(toolCall: ChatCompletionMessageToolCall) = apply {
            toolCalls =
                (toolCalls ?: JsonField.of(mutableListOf())).also {
                    checkKnown("toolCalls", it).add(toolCall)
                }
        }

        /** The identifier of the chat message. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

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
         * Returns an immutable instance of [ChatCompletionStoreMessage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .content()
         * .refusal()
         * .id()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChatCompletionStoreMessage =
            ChatCompletionStoreMessage(
                checkRequired("content", content),
                checkRequired("refusal", refusal),
                role,
                (annotations ?: JsonMissing.of()).map { it.toImmutable() },
                audio,
                functionCall,
                (toolCalls ?: JsonMissing.of()).map { it.toImmutable() },
                checkRequired("id", id),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ChatCompletionStoreMessage && content == other.content && refusal == other.refusal && role == other.role && annotations == other.annotations && audio == other.audio && functionCall == other.functionCall && toolCalls == other.toolCalls && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(content, refusal, role, annotations, audio, functionCall, toolCalls, id, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatCompletionStoreMessage{content=$content, refusal=$refusal, role=$role, annotations=$annotations, audio=$audio, functionCall=$functionCall, toolCalls=$toolCalls, id=$id, additionalProperties=$additionalProperties}"
}
