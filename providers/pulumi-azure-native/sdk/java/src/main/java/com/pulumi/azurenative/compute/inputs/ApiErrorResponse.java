// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.ApiErrorBaseResponse;
import com.pulumi.azurenative.compute.inputs.InnerErrorResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Api error.
 * 
 */
public final class ApiErrorResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApiErrorResponse Empty = new ApiErrorResponse();

    /**
     * The error code.
     * 
     */
    @Import(name="code")
    private @Nullable String code;

    /**
     * @return The error code.
     * 
     */
    public Optional<String> code() {
        return Optional.ofNullable(this.code);
    }

    /**
     * The Api error details
     * 
     */
    @Import(name="details")
    private @Nullable List<ApiErrorBaseResponse> details;

    /**
     * @return The Api error details
     * 
     */
    public Optional<List<ApiErrorBaseResponse>> details() {
        return Optional.ofNullable(this.details);
    }

    /**
     * The Api inner error
     * 
     */
    @Import(name="innererror")
    private @Nullable InnerErrorResponse innererror;

    /**
     * @return The Api inner error
     * 
     */
    public Optional<InnerErrorResponse> innererror() {
        return Optional.ofNullable(this.innererror);
    }

    /**
     * The error message.
     * 
     */
    @Import(name="message")
    private @Nullable String message;

    /**
     * @return The error message.
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * The target of the particular error.
     * 
     */
    @Import(name="target")
    private @Nullable String target;

    /**
     * @return The target of the particular error.
     * 
     */
    public Optional<String> target() {
        return Optional.ofNullable(this.target);
    }

    private ApiErrorResponse() {}

    private ApiErrorResponse(ApiErrorResponse $) {
        this.code = $.code;
        this.details = $.details;
        this.innererror = $.innererror;
        this.message = $.message;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiErrorResponse $;

        public Builder() {
            $ = new ApiErrorResponse();
        }

        public Builder(ApiErrorResponse defaults) {
            $ = new ApiErrorResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param code The error code.
         * 
         * @return builder
         * 
         */
        public Builder code(@Nullable String code) {
            $.code = code;
            return this;
        }

        /**
         * @param details The Api error details
         * 
         * @return builder
         * 
         */
        public Builder details(@Nullable List<ApiErrorBaseResponse> details) {
            $.details = details;
            return this;
        }

        /**
         * @param details The Api error details
         * 
         * @return builder
         * 
         */
        public Builder details(ApiErrorBaseResponse... details) {
            return details(List.of(details));
        }

        /**
         * @param innererror The Api inner error
         * 
         * @return builder
         * 
         */
        public Builder innererror(@Nullable InnerErrorResponse innererror) {
            $.innererror = innererror;
            return this;
        }

        /**
         * @param message The error message.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable String message) {
            $.message = message;
            return this;
        }

        /**
         * @param target The target of the particular error.
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable String target) {
            $.target = target;
            return this;
        }

        public ApiErrorResponse build() {
            return $;
        }
    }

}
