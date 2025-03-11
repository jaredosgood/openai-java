// File generated from our OpenAPI spec by Stainless.

package com.openai.models.responses

import com.fasterxml.jackson.annotation.JsonCreator
import com.openai.core.Enum
import com.openai.core.JsonField
import com.openai.errors.OpenAIInvalidDataException

/**
 * Specify additional output data to include in the model response. Currently supported values are:
 * - `file_search_call.results`: Include the search results of the file search tool call.
 * - `message.input_image.image_url`: Include image urls from the input message.
 * - `computer_call_output.output.image_url`: Include image urls from the computer call output.
 */
class ResponseIncludable @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val FILE_SEARCH_CALL_RESULTS = of("file_search_call.results")

        @JvmField val MESSAGE_INPUT_IMAGE_IMAGE_URL = of("message.input_image.image_url")

        @JvmField
        val COMPUTER_CALL_OUTPUT_OUTPUT_IMAGE_URL = of("computer_call_output.output.image_url")

        @JvmStatic fun of(value: String) = ResponseIncludable(JsonField.of(value))
    }

    /** An enum containing [ResponseIncludable]'s known values. */
    enum class Known {
        FILE_SEARCH_CALL_RESULTS,
        MESSAGE_INPUT_IMAGE_IMAGE_URL,
        COMPUTER_CALL_OUTPUT_OUTPUT_IMAGE_URL,
    }

    /**
     * An enum containing [ResponseIncludable]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [ResponseIncludable] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        FILE_SEARCH_CALL_RESULTS,
        MESSAGE_INPUT_IMAGE_IMAGE_URL,
        COMPUTER_CALL_OUTPUT_OUTPUT_IMAGE_URL,
        /**
         * An enum member indicating that [ResponseIncludable] was instantiated with an unknown
         * value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            FILE_SEARCH_CALL_RESULTS -> Value.FILE_SEARCH_CALL_RESULTS
            MESSAGE_INPUT_IMAGE_IMAGE_URL -> Value.MESSAGE_INPUT_IMAGE_IMAGE_URL
            COMPUTER_CALL_OUTPUT_OUTPUT_IMAGE_URL -> Value.COMPUTER_CALL_OUTPUT_OUTPUT_IMAGE_URL
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws OpenAIInvalidDataException if this class instance's value is a not a known member.
     */
    fun known(): Known =
        when (this) {
            FILE_SEARCH_CALL_RESULTS -> Known.FILE_SEARCH_CALL_RESULTS
            MESSAGE_INPUT_IMAGE_IMAGE_URL -> Known.MESSAGE_INPUT_IMAGE_IMAGE_URL
            COMPUTER_CALL_OUTPUT_OUTPUT_IMAGE_URL -> Known.COMPUTER_CALL_OUTPUT_OUTPUT_IMAGE_URL
            else -> throw OpenAIInvalidDataException("Unknown ResponseIncludable: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws OpenAIInvalidDataException if this class instance's value does not have the expected
     *   primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { OpenAIInvalidDataException("Value is not a String") }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResponseIncludable && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
