// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Error response of an operation failure
 * 
 */
public final class ErrorResponseResponse extends com.pulumi.resources.InvokeArgs {

    public static final ErrorResponseResponse Empty = new ErrorResponseResponse();

    /**
     * Error code
     * 
     */
    @Import(name="code")
    private @Nullable String code;

    /**
     * @return Error code
     * 
     */
    public Optional<String> code() {
        return Optional.ofNullable(this.code);
    }

    /**
     * Error message indicating why the operation failed.
     * 
     */
    @Import(name="message")
    private @Nullable String message;

    /**
     * @return Error message indicating why the operation failed.
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }

    private ErrorResponseResponse() {}

    private ErrorResponseResponse(ErrorResponseResponse $) {
        this.code = $.code;
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
         * @param code Error code
         * 
         * @return builder
         * 
         */
        public Builder code(@Nullable String code) {
            $.code = code;
            return this;
        }

        /**
         * @param message Error message indicating why the operation failed.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable String message) {
            $.message = message;
            return this;
        }

        public ErrorResponseResponse build() {
            return $;
        }
    }

}
