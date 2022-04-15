// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRequestValidatorResult {
    /**
     * ID of the request validator.
     * 
     */
    private final @Nullable String requestValidatorId;
    /**
     * Indicates whether to validate the request body according to the configured schema for the targeted API and method.
     * 
     */
    private final @Nullable Boolean validateRequestBody;
    /**
     * Indicates whether to validate request parameters.
     * 
     */
    private final @Nullable Boolean validateRequestParameters;

    @CustomType.Constructor
    private GetRequestValidatorResult(
        @CustomType.Parameter("requestValidatorId") @Nullable String requestValidatorId,
        @CustomType.Parameter("validateRequestBody") @Nullable Boolean validateRequestBody,
        @CustomType.Parameter("validateRequestParameters") @Nullable Boolean validateRequestParameters) {
        this.requestValidatorId = requestValidatorId;
        this.validateRequestBody = validateRequestBody;
        this.validateRequestParameters = validateRequestParameters;
    }

    /**
     * ID of the request validator.
     * 
    */
    public Optional<String> requestValidatorId() {
        return Optional.ofNullable(this.requestValidatorId);
    }
    /**
     * Indicates whether to validate the request body according to the configured schema for the targeted API and method.
     * 
    */
    public Optional<Boolean> validateRequestBody() {
        return Optional.ofNullable(this.validateRequestBody);
    }
    /**
     * Indicates whether to validate request parameters.
     * 
    */
    public Optional<Boolean> validateRequestParameters() {
        return Optional.ofNullable(this.validateRequestParameters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRequestValidatorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String requestValidatorId;
        private @Nullable Boolean validateRequestBody;
        private @Nullable Boolean validateRequestParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRequestValidatorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestValidatorId = defaults.requestValidatorId;
    	      this.validateRequestBody = defaults.validateRequestBody;
    	      this.validateRequestParameters = defaults.validateRequestParameters;
        }

        public Builder requestValidatorId(@Nullable String requestValidatorId) {
            this.requestValidatorId = requestValidatorId;
            return this;
        }
        public Builder validateRequestBody(@Nullable Boolean validateRequestBody) {
            this.validateRequestBody = validateRequestBody;
            return this;
        }
        public Builder validateRequestParameters(@Nullable Boolean validateRequestParameters) {
            this.validateRequestParameters = validateRequestParameters;
            return this;
        }        public GetRequestValidatorResult build() {
            return new GetRequestValidatorResult(requestValidatorId, validateRequestBody, validateRequestParameters);
        }
    }
}
