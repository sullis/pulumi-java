// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridcompute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ErrorDetailResponse extends com.pulumi.resources.InvokeArgs {

    public static final ErrorDetailResponse Empty = new ErrorDetailResponse();

    /**
     * The error&#39;s code.
     * 
     */
    @Import(name="code", required=true)
    private String code;

    /**
     * @return The error&#39;s code.
     * 
     */
    public String code() {
        return this.code;
    }

    /**
     * Additional error details.
     * 
     */
    @Import(name="details")
    private @Nullable List<ErrorDetailResponse> details;

    /**
     * @return Additional error details.
     * 
     */
    public Optional<List<ErrorDetailResponse>> details() {
        return Optional.ofNullable(this.details);
    }

    /**
     * A human readable error message.
     * 
     */
    @Import(name="message", required=true)
    private String message;

    /**
     * @return A human readable error message.
     * 
     */
    public String message() {
        return this.message;
    }

    /**
     * Indicates which property in the request is responsible for the error.
     * 
     */
    @Import(name="target")
    private @Nullable String target;

    /**
     * @return Indicates which property in the request is responsible for the error.
     * 
     */
    public Optional<String> target() {
        return Optional.ofNullable(this.target);
    }

    private ErrorDetailResponse() {}

    private ErrorDetailResponse(ErrorDetailResponse $) {
        this.code = $.code;
        this.details = $.details;
        this.message = $.message;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ErrorDetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ErrorDetailResponse $;

        public Builder() {
            $ = new ErrorDetailResponse();
        }

        public Builder(ErrorDetailResponse defaults) {
            $ = new ErrorDetailResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param code The error&#39;s code.
         * 
         * @return builder
         * 
         */
        public Builder code(String code) {
            $.code = code;
            return this;
        }

        /**
         * @param details Additional error details.
         * 
         * @return builder
         * 
         */
        public Builder details(@Nullable List<ErrorDetailResponse> details) {
            $.details = details;
            return this;
        }

        /**
         * @param details Additional error details.
         * 
         * @return builder
         * 
         */
        public Builder details(ErrorDetailResponse... details) {
            return details(List.of(details));
        }

        /**
         * @param message A human readable error message.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            $.message = message;
            return this;
        }

        /**
         * @param target Indicates which property in the request is responsible for the error.
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable String target) {
            $.target = target;
            return this;
        }

        public ErrorDetailResponse build() {
            $.code = Objects.requireNonNull($.code, "expected parameter 'code' to be non-null");
            $.message = Objects.requireNonNull($.message, "expected parameter 'message' to be non-null");
            return $;
        }
    }

}
