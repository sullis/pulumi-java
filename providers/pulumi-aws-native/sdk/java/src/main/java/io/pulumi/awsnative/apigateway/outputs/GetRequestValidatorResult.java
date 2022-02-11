// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRequestValidatorResult {
    private final @Nullable String requestValidatorId;
    private final @Nullable Boolean validateRequestBody;
    private final @Nullable Boolean validateRequestParameters;

    @OutputCustomType.Constructor({"requestValidatorId","validateRequestBody","validateRequestParameters"})
    private GetRequestValidatorResult(
        @Nullable String requestValidatorId,
        @Nullable Boolean validateRequestBody,
        @Nullable Boolean validateRequestParameters) {
        this.requestValidatorId = requestValidatorId;
        this.validateRequestBody = validateRequestBody;
        this.validateRequestParameters = validateRequestParameters;
    }

    public Optional<String> getRequestValidatorId() {
        return Optional.ofNullable(this.requestValidatorId);
    }
    public Optional<Boolean> getValidateRequestBody() {
        return Optional.ofNullable(this.validateRequestBody);
    }
    public Optional<Boolean> getValidateRequestParameters() {
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

        public Builder setRequestValidatorId(@Nullable String requestValidatorId) {
            this.requestValidatorId = requestValidatorId;
            return this;
        }

        public Builder setValidateRequestBody(@Nullable Boolean validateRequestBody) {
            this.validateRequestBody = validateRequestBody;
            return this;
        }

        public Builder setValidateRequestParameters(@Nullable Boolean validateRequestParameters) {
            this.validateRequestParameters = validateRequestParameters;
            return this;
        }

        public GetRequestValidatorResult build() {
            return new GetRequestValidatorResult(requestValidatorId, validateRequestBody, validateRequestParameters);
        }
    }
}
