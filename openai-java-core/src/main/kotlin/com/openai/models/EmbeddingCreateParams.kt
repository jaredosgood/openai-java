// File generated from our OpenAPI spec by Stainless.

package com.openai.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openai.core.BaseDeserializer
import com.openai.core.BaseSerializer
import com.openai.core.Enum
import com.openai.core.ExcludeMissing
import com.openai.core.JsonField
import com.openai.core.JsonValue
import com.openai.core.NoAutoDetect
import com.openai.core.getOrThrow
import com.openai.core.toImmutable
import com.openai.errors.OpenAIInvalidDataException
import com.openai.models.*
import java.util.Objects
import java.util.Optional

class EmbeddingCreateParams
constructor(
    private val input: Input,
    private val model: Model,
    private val dimensions: Long?,
    private val encodingFormat: EncodingFormat?,
    private val user: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun input(): Input = input

    fun model(): Model = model

    fun dimensions(): Optional<Long> = Optional.ofNullable(dimensions)

    fun encodingFormat(): Optional<EncodingFormat> = Optional.ofNullable(encodingFormat)

    fun user(): Optional<String> = Optional.ofNullable(user)

    @JvmSynthetic
    internal fun getBody(): EmbeddingCreateBody {
        return EmbeddingCreateBody(
            input,
            model,
            dimensions,
            encodingFormat,
            user,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = EmbeddingCreateBody.Builder::class)
    @NoAutoDetect
    class EmbeddingCreateBody
    internal constructor(
        private val input: Input?,
        private val model: Model?,
        private val dimensions: Long?,
        private val encodingFormat: EncodingFormat?,
        private val user: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in
         * a single request, pass an array of strings or array of token arrays. The input must not
         * exceed the max input tokens for the model (8192 tokens for `text-embedding-ada-002`),
         * cannot be an empty string, and any array must be 2048 dimensions or less.
         * [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken)
         * for counting tokens.
         */
        @JsonProperty("input") fun input(): Input? = input

        /**
         * ID of the model to use. You can use the
         * [List models](https://platform.openai.com/docs/api-reference/models/list) API to see all
         * of your available models, or see our
         * [Model overview](https://platform.openai.com/docs/models/overview) for descriptions of
         * them.
         */
        @JsonProperty("model") fun model(): Model? = model

        /**
         * The number of dimensions the resulting output embeddings should have. Only supported in
         * `text-embedding-3` and later models.
         */
        @JsonProperty("dimensions") fun dimensions(): Long? = dimensions

        /**
         * The format to return the embeddings in. Can be either `float` or
         * [`base64`](https://pypi.org/project/pybase64/).
         */
        @JsonProperty("encoding_format") fun encodingFormat(): EncodingFormat? = encodingFormat

        /**
         * A unique identifier representing your end-user, which can help OpenAI to monitor and
         * detect abuse.
         * [Learn more](https://platform.openai.com/docs/guides/safety-best-practices/end-user-ids).
         */
        @JsonProperty("user") fun user(): String? = user

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var input: Input? = null
            private var model: Model? = null
            private var dimensions: Long? = null
            private var encodingFormat: EncodingFormat? = null
            private var user: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(embeddingCreateBody: EmbeddingCreateBody) = apply {
                this.input = embeddingCreateBody.input
                this.model = embeddingCreateBody.model
                this.dimensions = embeddingCreateBody.dimensions
                this.encodingFormat = embeddingCreateBody.encodingFormat
                this.user = embeddingCreateBody.user
                additionalProperties(embeddingCreateBody.additionalProperties)
            }

            /**
             * Input text to embed, encoded as a string or array of tokens. To embed multiple inputs
             * in a single request, pass an array of strings or array of token arrays. The input
             * must not exceed the max input tokens for the model (8192 tokens for
             * `text-embedding-ada-002`), cannot be an empty string, and any array must be 2048
             * dimensions or less.
             * [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken)
             * for counting tokens.
             */
            @JsonProperty("input") fun input(input: Input) = apply { this.input = input }

            /**
             * ID of the model to use. You can use the
             * [List models](https://platform.openai.com/docs/api-reference/models/list) API to see
             * all of your available models, or see our
             * [Model overview](https://platform.openai.com/docs/models/overview) for descriptions
             * of them.
             */
            @JsonProperty("model") fun model(model: Model) = apply { this.model = model }

            /**
             * The number of dimensions the resulting output embeddings should have. Only supported
             * in `text-embedding-3` and later models.
             */
            @JsonProperty("dimensions")
            fun dimensions(dimensions: Long) = apply { this.dimensions = dimensions }

            /**
             * The format to return the embeddings in. Can be either `float` or
             * [`base64`](https://pypi.org/project/pybase64/).
             */
            @JsonProperty("encoding_format")
            fun encodingFormat(encodingFormat: EncodingFormat) = apply {
                this.encodingFormat = encodingFormat
            }

            /**
             * A unique identifier representing your end-user, which can help OpenAI to monitor and
             * detect abuse.
             * [Learn more](https://platform.openai.com/docs/guides/safety-best-practices/end-user-ids).
             */
            @JsonProperty("user") fun user(user: String) = apply { this.user = user }

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

            fun build(): EmbeddingCreateBody =
                EmbeddingCreateBody(
                    checkNotNull(input) { "`input` is required but was not set" },
                    checkNotNull(model) { "`model` is required but was not set" },
                    dimensions,
                    encodingFormat,
                    user,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EmbeddingCreateBody && this.input == other.input && this.model == other.model && this.dimensions == other.dimensions && this.encodingFormat == other.encodingFormat && this.user == other.user && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(input, model, dimensions, encodingFormat, user, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "EmbeddingCreateBody{input=$input, model=$model, dimensions=$dimensions, encodingFormat=$encodingFormat, user=$user, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EmbeddingCreateParams && this.input == other.input && this.model == other.model && this.dimensions == other.dimensions && this.encodingFormat == other.encodingFormat && this.user == other.user && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(input, model, dimensions, encodingFormat, user, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "EmbeddingCreateParams{input=$input, model=$model, dimensions=$dimensions, encodingFormat=$encodingFormat, user=$user, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var input: Input? = null
        private var model: Model? = null
        private var dimensions: Long? = null
        private var encodingFormat: EncodingFormat? = null
        private var user: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(embeddingCreateParams: EmbeddingCreateParams) = apply {
            this.input = embeddingCreateParams.input
            this.model = embeddingCreateParams.model
            this.dimensions = embeddingCreateParams.dimensions
            this.encodingFormat = embeddingCreateParams.encodingFormat
            this.user = embeddingCreateParams.user
            additionalQueryParams(embeddingCreateParams.additionalQueryParams)
            additionalHeaders(embeddingCreateParams.additionalHeaders)
            additionalBodyProperties(embeddingCreateParams.additionalBodyProperties)
        }

        /**
         * Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in
         * a single request, pass an array of strings or array of token arrays. The input must not
         * exceed the max input tokens for the model (8192 tokens for `text-embedding-ada-002`),
         * cannot be an empty string, and any array must be 2048 dimensions or less.
         * [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken)
         * for counting tokens.
         */
        fun input(input: Input) = apply { this.input = input }

        /**
         * Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in
         * a single request, pass an array of strings or array of token arrays. The input must not
         * exceed the max input tokens for the model (8192 tokens for `text-embedding-ada-002`),
         * cannot be an empty string, and any array must be 2048 dimensions or less.
         * [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken)
         * for counting tokens.
         */
        fun input(string: String) = apply { this.input = Input.ofString(string) }

        /**
         * Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in
         * a single request, pass an array of strings or array of token arrays. The input must not
         * exceed the max input tokens for the model (8192 tokens for `text-embedding-ada-002`),
         * cannot be an empty string, and any array must be 2048 dimensions or less.
         * [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken)
         * for counting tokens.
         */
        fun inputOfArrayOfStrings(arrayOfStrings: List<String>) = apply {
            this.input = Input.ofArrayOfStrings(arrayOfStrings)
        }

        /**
         * Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in
         * a single request, pass an array of strings or array of token arrays. The input must not
         * exceed the max input tokens for the model (8192 tokens for `text-embedding-ada-002`),
         * cannot be an empty string, and any array must be 2048 dimensions or less.
         * [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken)
         * for counting tokens.
         */
        fun inputOfArrayOfTokens(arrayOfTokens: List<Long>) = apply {
            this.input = Input.ofArrayOfTokens(arrayOfTokens)
        }

        /**
         * Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in
         * a single request, pass an array of strings or array of token arrays. The input must not
         * exceed the max input tokens for the model (8192 tokens for `text-embedding-ada-002`),
         * cannot be an empty string, and any array must be 2048 dimensions or less.
         * [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken)
         * for counting tokens.
         */
        fun inputOfArrayOfTokenArrays(arrayOfTokenArrays: List<List<Long>>) = apply {
            this.input = Input.ofArrayOfTokenArrays(arrayOfTokenArrays)
        }

        /**
         * ID of the model to use. You can use the
         * [List models](https://platform.openai.com/docs/api-reference/models/list) API to see all
         * of your available models, or see our
         * [Model overview](https://platform.openai.com/docs/models/overview) for descriptions of
         * them.
         */
        fun model(model: Model) = apply { this.model = model }

        /**
         * ID of the model to use. You can use the
         * [List models](https://platform.openai.com/docs/api-reference/models/list) API to see all
         * of your available models, or see our
         * [Model overview](https://platform.openai.com/docs/models/overview) for descriptions of
         * them.
         */
        fun model(string: String) = apply { this.model = Model.ofString(string) }

        /**
         * ID of the model to use. You can use the
         * [List models](https://platform.openai.com/docs/api-reference/models/list) API to see all
         * of your available models, or see our
         * [Model overview](https://platform.openai.com/docs/models/overview) for descriptions of
         * them.
         */
        fun model(embeddingModel: EmbeddingModel) = apply {
            this.model = Model.ofEmbeddingModel(embeddingModel)
        }

        /**
         * The number of dimensions the resulting output embeddings should have. Only supported in
         * `text-embedding-3` and later models.
         */
        fun dimensions(dimensions: Long) = apply { this.dimensions = dimensions }

        /**
         * The format to return the embeddings in. Can be either `float` or
         * [`base64`](https://pypi.org/project/pybase64/).
         */
        fun encodingFormat(encodingFormat: EncodingFormat) = apply {
            this.encodingFormat = encodingFormat
        }

        /**
         * A unique identifier representing your end-user, which can help OpenAI to monitor and
         * detect abuse.
         * [Learn more](https://platform.openai.com/docs/guides/safety-best-practices/end-user-ids).
         */
        fun user(user: String) = apply { this.user = user }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): EmbeddingCreateParams =
            EmbeddingCreateParams(
                checkNotNull(input) { "`input` is required but was not set" },
                checkNotNull(model) { "`model` is required but was not set" },
                dimensions,
                encodingFormat,
                user,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(using = Input.Deserializer::class)
    @JsonSerialize(using = Input.Serializer::class)
    class Input
    private constructor(
        private val string: String? = null,
        private val arrayOfStrings: List<String>? = null,
        private val arrayOfTokens: List<Long>? = null,
        private val arrayOfTokenArrays: List<List<Long>>? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        /** The string that will be turned into an embedding. */
        fun string(): Optional<String> = Optional.ofNullable(string)
        /** The array of strings that will be turned into an embedding. */
        fun arrayOfStrings(): Optional<List<String>> = Optional.ofNullable(arrayOfStrings)
        /** The array of integers that will be turned into an embedding. */
        fun arrayOfTokens(): Optional<List<Long>> = Optional.ofNullable(arrayOfTokens)
        /** The array of arrays containing integers that will be turned into an embedding. */
        fun arrayOfTokenArrays(): Optional<List<List<Long>>> =
            Optional.ofNullable(arrayOfTokenArrays)

        fun isString(): Boolean = string != null

        fun isArrayOfStrings(): Boolean = arrayOfStrings != null

        fun isArrayOfTokens(): Boolean = arrayOfTokens != null

        fun isArrayOfTokenArrays(): Boolean = arrayOfTokenArrays != null

        fun asString(): String = string.getOrThrow("string")

        fun asArrayOfStrings(): List<String> = arrayOfStrings.getOrThrow("arrayOfStrings")

        fun asArrayOfTokens(): List<Long> = arrayOfTokens.getOrThrow("arrayOfTokens")

        fun asArrayOfTokenArrays(): List<List<Long>> =
            arrayOfTokenArrays.getOrThrow("arrayOfTokenArrays")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                string != null -> visitor.visitString(string)
                arrayOfStrings != null -> visitor.visitArrayOfStrings(arrayOfStrings)
                arrayOfTokens != null -> visitor.visitArrayOfTokens(arrayOfTokens)
                arrayOfTokenArrays != null -> visitor.visitArrayOfTokenArrays(arrayOfTokenArrays)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Input = apply {
            if (!validated) {
                if (
                    string == null &&
                        arrayOfStrings == null &&
                        arrayOfTokens == null &&
                        arrayOfTokenArrays == null
                ) {
                    throw OpenAIInvalidDataException("Unknown Input: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Input && this.string == other.string && this.arrayOfStrings == other.arrayOfStrings && this.arrayOfTokens == other.arrayOfTokens && this.arrayOfTokenArrays == other.arrayOfTokenArrays /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(string, arrayOfStrings, arrayOfTokens, arrayOfTokenArrays) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                string != null -> "Input{string=$string}"
                arrayOfStrings != null -> "Input{arrayOfStrings=$arrayOfStrings}"
                arrayOfTokens != null -> "Input{arrayOfTokens=$arrayOfTokens}"
                arrayOfTokenArrays != null -> "Input{arrayOfTokenArrays=$arrayOfTokenArrays}"
                _json != null -> "Input{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Input")
            }
        }

        companion object {

            @JvmStatic fun ofString(string: String) = Input(string = string)

            @JvmStatic
            fun ofArrayOfStrings(arrayOfStrings: List<String>) =
                Input(arrayOfStrings = arrayOfStrings)

            @JvmStatic
            fun ofArrayOfTokens(arrayOfTokens: List<Long>) = Input(arrayOfTokens = arrayOfTokens)

            @JvmStatic
            fun ofArrayOfTokenArrays(arrayOfTokenArrays: List<List<Long>>) =
                Input(arrayOfTokenArrays = arrayOfTokenArrays)
        }

        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitArrayOfStrings(arrayOfStrings: List<String>): T

            fun visitArrayOfTokens(arrayOfTokens: List<Long>): T

            fun visitArrayOfTokenArrays(arrayOfTokenArrays: List<List<Long>>): T

            fun unknown(json: JsonValue?): T {
                throw OpenAIInvalidDataException("Unknown Input: $json")
            }
        }

        class Deserializer : BaseDeserializer<Input>(Input::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Input {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return Input(string = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                    return Input(arrayOfStrings = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<List<Long>>())?.let {
                    return Input(arrayOfTokens = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<List<List<Long>>>())?.let {
                    return Input(arrayOfTokenArrays = it, _json = json)
                }

                return Input(_json = json)
            }
        }

        class Serializer : BaseSerializer<Input>(Input::class) {

            override fun serialize(
                value: Input,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.arrayOfStrings != null -> generator.writeObject(value.arrayOfStrings)
                    value.arrayOfTokens != null -> generator.writeObject(value.arrayOfTokens)
                    value.arrayOfTokenArrays != null ->
                        generator.writeObject(value.arrayOfTokenArrays)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Input")
                }
            }
        }
    }

    @JsonDeserialize(using = Model.Deserializer::class)
    @JsonSerialize(using = Model.Serializer::class)
    class Model
    private constructor(
        private val string: String? = null,
        private val embeddingModel: EmbeddingModel? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun embeddingModel(): Optional<EmbeddingModel> = Optional.ofNullable(embeddingModel)

        fun isString(): Boolean = string != null

        fun isEmbeddingModel(): Boolean = embeddingModel != null

        fun asString(): String = string.getOrThrow("string")

        fun asEmbeddingModel(): EmbeddingModel = embeddingModel.getOrThrow("embeddingModel")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                string != null -> visitor.visitString(string)
                embeddingModel != null -> visitor.visitEmbeddingModel(embeddingModel)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Model = apply {
            if (!validated) {
                if (string == null && embeddingModel == null) {
                    throw OpenAIInvalidDataException("Unknown Model: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Model && this.string == other.string && this.embeddingModel == other.embeddingModel /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(string, embeddingModel) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                string != null -> "Model{string=$string}"
                embeddingModel != null -> "Model{embeddingModel=$embeddingModel}"
                _json != null -> "Model{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Model")
            }
        }

        companion object {

            @JvmStatic fun ofString(string: String) = Model(string = string)

            @JvmStatic
            fun ofEmbeddingModel(embeddingModel: EmbeddingModel) =
                Model(embeddingModel = embeddingModel)
        }

        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitEmbeddingModel(embeddingModel: EmbeddingModel): T

            fun unknown(json: JsonValue?): T {
                throw OpenAIInvalidDataException("Unknown Model: $json")
            }
        }

        class Deserializer : BaseDeserializer<Model>(Model::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Model {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return Model(string = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<EmbeddingModel>())?.let {
                    return Model(embeddingModel = it, _json = json)
                }

                return Model(_json = json)
            }
        }

        class Serializer : BaseSerializer<Model>(Model::class) {

            override fun serialize(
                value: Model,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.embeddingModel != null -> generator.writeObject(value.embeddingModel)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Model")
                }
            }
        }
    }

    class EncodingFormat
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EncodingFormat && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val FLOAT = EncodingFormat(JsonField.of("float"))

            @JvmField val BASE64 = EncodingFormat(JsonField.of("base64"))

            @JvmStatic fun of(value: String) = EncodingFormat(JsonField.of(value))
        }

        enum class Known {
            FLOAT,
            BASE64,
        }

        enum class Value {
            FLOAT,
            BASE64,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                FLOAT -> Value.FLOAT
                BASE64 -> Value.BASE64
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                FLOAT -> Known.FLOAT
                BASE64 -> Known.BASE64
                else -> throw OpenAIInvalidDataException("Unknown EncodingFormat: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
