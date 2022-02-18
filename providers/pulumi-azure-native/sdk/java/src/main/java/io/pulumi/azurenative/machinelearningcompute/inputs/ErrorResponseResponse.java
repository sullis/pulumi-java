// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.inputs;

import io.pulumi.azurenative.machinelearningcompute.inputs.ErrorDetailResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Error response information.
 * 
 */
public final class ErrorResponseResponse extends io.pulumi.resources.InvokeArgs {

    public static final ErrorResponseResponse Empty = new ErrorResponseResponse();

    /**
     * Error code.
     * 
     */
    @InputImport(name="code", required=true)
    private final String code;

    public String getCode() {
        return this.code;
    }

    /**
     * An array of error detail objects.
     * 
     */
    @InputImport(name="details")
    private final @Nullable List<ErrorDetailResponse> details;

    public List<ErrorDetailResponse> getDetails() {
        return this.details == null ? List.of() : this.details;
    }

    /**
     * Error message.
     * 
     */
    @InputImport(name="message", required=true)
    private final String message;

    public String getMessage() {
        return this.message;
    }

    public ErrorResponseResponse(
        String code,
        @Nullable List<ErrorDetailResponse> details,
        String message) {
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.details = details;
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
    }

    private ErrorResponseResponse() {
        this.code = null;
        this.details = List.of();
        this.message = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorResponseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private @Nullable List<ErrorDetailResponse> details;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorResponseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setDetails(@Nullable List<ErrorDetailResponse> details) {
            this.details = details;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public ErrorResponseResponse build() {
            return new ErrorResponseResponse(code, details, message);
        }
    }
}
