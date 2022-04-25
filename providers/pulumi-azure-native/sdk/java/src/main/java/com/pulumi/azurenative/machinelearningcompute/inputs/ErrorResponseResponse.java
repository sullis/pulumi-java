// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningcompute.inputs;

import com.pulumi.azurenative.machinelearningcompute.inputs.ErrorDetailResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Error response information.
 * 
 */
public final class ErrorResponseResponse extends com.pulumi.resources.InvokeArgs {

    public static final ErrorResponseResponse Empty = new ErrorResponseResponse();

    /**
     * Error code.
     * 
     */
    @Import(name="code", required=true)
    private String code;

    /**
     * @return Error code.
     * 
     */
    public String code() {
        return this.code;
    }

    /**
     * An array of error detail objects.
     * 
     */
    @Import(name="details")
    private @Nullable List<ErrorDetailResponse> details;

    /**
     * @return An array of error detail objects.
     * 
     */
    public Optional<List<ErrorDetailResponse>> details() {
        return Optional.ofNullable(this.details);
    }

    /**
     * Error message.
     * 
     */
    @Import(name="message", required=true)
    private String message;

    /**
     * @return Error message.
     * 
     */
    public String message() {
        return this.message;
    }

    private ErrorResponseResponse() {}

    private ErrorResponseResponse(ErrorResponseResponse $) {
        this.code = $.code;
        this.details = $.details;
        this.message = $.message;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ErrorResponseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ErrorResponseResponse $;

        public Builder() {
            $ = new ErrorResponseResponse();
        }

        public Builder(ErrorResponseResponse defaults) {
            $ = new ErrorResponseResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param code Error code.
         * 
         * @return builder
         * 
         */
        public Builder code(String code) {
            $.code = code;
            return this;
        }

        /**
         * @param details An array of error detail objects.
         * 
         * @return builder
         * 
         */
        public Builder details(@Nullable List<ErrorDetailResponse> details) {
            $.details = details;
            return this;
        }

        /**
         * @param details An array of error detail objects.
         * 
         * @return builder
         * 
         */
        public Builder details(ErrorDetailResponse... details) {
            return details(List.of(details));
        }

        /**
         * @param message Error message.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            $.message = message;
            return this;
        }

        public ErrorResponseResponse build() {
            $.code = Objects.requireNonNull($.code, "expected parameter 'code' to be non-null");
            $.message = Objects.requireNonNull($.message, "expected parameter 'message' to be non-null");
            return $;
        }
    }

}
