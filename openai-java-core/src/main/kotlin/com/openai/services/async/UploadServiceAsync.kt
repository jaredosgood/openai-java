// File generated from our OpenAPI spec by Stainless.

package com.openai.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.openai.core.RequestOptions
import com.openai.core.http.HttpResponseFor
import com.openai.models.uploads.Upload
import com.openai.models.uploads.UploadCancelParams
import com.openai.models.uploads.UploadCompleteParams
import com.openai.models.uploads.UploadCreateParams
import com.openai.services.async.uploads.PartServiceAsync
import java.util.concurrent.CompletableFuture

interface UploadServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun parts(): PartServiceAsync

    /**
     * Creates an intermediate
     * [Upload](https://platform.openai.com/docs/api-reference/uploads/object) object that you can
     * add [Parts](https://platform.openai.com/docs/api-reference/uploads/part-object) to.
     * Currently, an Upload can accept at most 8 GB in total and expires after an hour after you
     * create it.
     *
     * Once you complete the Upload, we will create a
     * [File](https://platform.openai.com/docs/api-reference/files/object) object that contains all
     * the parts you uploaded. This File is usable in the rest of our platform as a regular File
     * object.
     *
     * For certain `purpose` values, the correct `mime_type` must be specified. Please refer to
     * documentation for the
     * [supported MIME types for your use case](https://platform.openai.com/docs/assistants/tools/file-search#supported-files).
     *
     * For guidance on the proper filename extensions for each purpose, please follow the
     * documentation on
     * [creating a File](https://platform.openai.com/docs/api-reference/files/create).
     */
    fun create(params: UploadCreateParams): CompletableFuture<Upload> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: UploadCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Upload>

    /** Cancels the Upload. No Parts may be added after an Upload is cancelled. */
    fun cancel(params: UploadCancelParams): CompletableFuture<Upload> =
        cancel(params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(
        params: UploadCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Upload>

    /**
     * Completes the [Upload](https://platform.openai.com/docs/api-reference/uploads/object).
     *
     * Within the returned Upload object, there is a nested
     * [File](https://platform.openai.com/docs/api-reference/files/object) object that is ready to
     * use in the rest of the platform.
     *
     * You can specify the order of the Parts by passing in an ordered list of the Part IDs.
     *
     * The number of bytes uploaded upon completion must match the number of bytes initially
     * specified when creating the Upload object. No Parts may be added after an Upload is
     * completed.
     */
    fun complete(params: UploadCompleteParams): CompletableFuture<Upload> =
        complete(params, RequestOptions.none())

    /** @see [complete] */
    fun complete(
        params: UploadCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Upload>

    /**
     * A view of [UploadServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun parts(): PartServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /uploads`, but is otherwise the same as
         * [UploadServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: UploadCreateParams): CompletableFuture<HttpResponseFor<Upload>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: UploadCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Upload>>

        /**
         * Returns a raw HTTP response for `post /uploads/{upload_id}/cancel`, but is otherwise the
         * same as [UploadServiceAsync.cancel].
         */
        @MustBeClosed
        fun cancel(params: UploadCancelParams): CompletableFuture<HttpResponseFor<Upload>> =
            cancel(params, RequestOptions.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            params: UploadCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Upload>>

        /**
         * Returns a raw HTTP response for `post /uploads/{upload_id}/complete`, but is otherwise
         * the same as [UploadServiceAsync.complete].
         */
        @MustBeClosed
        fun complete(params: UploadCompleteParams): CompletableFuture<HttpResponseFor<Upload>> =
            complete(params, RequestOptions.none())

        /** @see [complete] */
        @MustBeClosed
        fun complete(
            params: UploadCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Upload>>
    }
}
