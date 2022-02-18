// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.ApiErrorBaseResponse;
import io.pulumi.azurenative.compute.inputs.InnerErrorResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Api error.
 * 
 */
public final class ApiErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApiErrorResponse Empty = new ApiErrorResponse();

    /**
     * The error code.
     * 
     */
    @InputImport(name="code")
    private final @Nullable String code;

    public Optional<String> getCode() {
        return this.code == null ? Optional.empty() : Optional.ofNullable(this.code);
    }

    /**
     * The Api error details
     * 
     */
    @InputImport(name="details")
    private final @Nullable List<ApiErrorBaseResponse> details;

    public List<ApiErrorBaseResponse> getDetails() {
        return this.details == null ? List.of() : this.details;
    }

    /**
     * The Api inner error
     * 
     */
    @InputImport(name="innererror")
    private final @Nullable InnerErrorResponse innererror;

    public Optional<InnerErrorResponse> getInnererror() {
        return this.innererror == null ? Optional.empty() : Optional.ofNullable(this.innererror);
    }

    /**
     * The error message.
     * 
     */
    @InputImport(name="message")
    private final @Nullable String message;

    public Optional<String> getMessage() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    /**
     * The target of the particular error.
     * 
     */
    @InputImport(name="target")
    private final @Nullable String target;

    public Optional<String> getTarget() {
        return this.target == null ? Optional.empty() : Optional.ofNullable(this.target);
    }

    public ApiErrorResponse(
        @Nullable String code,
        @Nullable List<ApiErrorBaseResponse> details,
        @Nullable InnerErrorResponse innererror,
        @Nullable String message,
        @Nullable String target) {
        this.code = code;
        this.details = details;
        this.innererror = innererror;
        this.message = message;
        this.target = target;
    }

    private ApiErrorResponse() {
        this.code = null;
        this.details = List.of();
        this.innererror = null;
        this.message = null;
        this.target = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable List<ApiErrorBaseResponse> details;
        private @Nullable InnerErrorResponse innererror;
        private @Nullable String message;
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.innererror = defaults.innererror;
    	      this.message = defaults.message;
    	      this.target = defaults.target;
        }

        public Builder setCode(@Nullable String code) {
            this.code = code;
            return this;
        }

        public Builder setDetails(@Nullable List<ApiErrorBaseResponse> details) {
            this.details = details;
            return this;
        }

        public Builder setInnererror(@Nullable InnerErrorResponse innererror) {
            this.innererror = innererror;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = target;
            return this;
        }

        public ApiErrorResponse build() {
            return new ApiErrorResponse(code, details, innererror, message, target);
        }
    }
}
