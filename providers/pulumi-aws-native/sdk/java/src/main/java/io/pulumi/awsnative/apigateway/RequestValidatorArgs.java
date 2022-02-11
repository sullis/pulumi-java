// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RequestValidatorArgs extends io.pulumi.resources.ResourceArgs {

    public static final RequestValidatorArgs Empty = new RequestValidatorArgs();

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="restApiId", required=true)
    private final Input<String> restApiId;

    public Input<String> getRestApiId() {
        return this.restApiId;
    }

    @InputImport(name="validateRequestBody")
    private final @Nullable Input<Boolean> validateRequestBody;

    public Input<Boolean> getValidateRequestBody() {
        return this.validateRequestBody == null ? Input.empty() : this.validateRequestBody;
    }

    @InputImport(name="validateRequestParameters")
    private final @Nullable Input<Boolean> validateRequestParameters;

    public Input<Boolean> getValidateRequestParameters() {
        return this.validateRequestParameters == null ? Input.empty() : this.validateRequestParameters;
    }

    public RequestValidatorArgs(
        @Nullable Input<String> name,
        Input<String> restApiId,
        @Nullable Input<Boolean> validateRequestBody,
        @Nullable Input<Boolean> validateRequestParameters) {
        this.name = name;
        this.restApiId = Objects.requireNonNull(restApiId, "expected parameter 'restApiId' to be non-null");
        this.validateRequestBody = validateRequestBody;
        this.validateRequestParameters = validateRequestParameters;
    }

    private RequestValidatorArgs() {
        this.name = Input.empty();
        this.restApiId = Input.empty();
        this.validateRequestBody = Input.empty();
        this.validateRequestParameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RequestValidatorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private Input<String> restApiId;
        private @Nullable Input<Boolean> validateRequestBody;
        private @Nullable Input<Boolean> validateRequestParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(RequestValidatorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.restApiId = defaults.restApiId;
    	      this.validateRequestBody = defaults.validateRequestBody;
    	      this.validateRequestParameters = defaults.validateRequestParameters;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRestApiId(Input<String> restApiId) {
            this.restApiId = Objects.requireNonNull(restApiId);
            return this;
        }

        public Builder setRestApiId(String restApiId) {
            this.restApiId = Input.of(Objects.requireNonNull(restApiId));
            return this;
        }

        public Builder setValidateRequestBody(@Nullable Input<Boolean> validateRequestBody) {
            this.validateRequestBody = validateRequestBody;
            return this;
        }

        public Builder setValidateRequestBody(@Nullable Boolean validateRequestBody) {
            this.validateRequestBody = Input.ofNullable(validateRequestBody);
            return this;
        }

        public Builder setValidateRequestParameters(@Nullable Input<Boolean> validateRequestParameters) {
            this.validateRequestParameters = validateRequestParameters;
            return this;
        }

        public Builder setValidateRequestParameters(@Nullable Boolean validateRequestParameters) {
            this.validateRequestParameters = Input.ofNullable(validateRequestParameters);
            return this;
        }

        public RequestValidatorArgs build() {
            return new RequestValidatorArgs(name, restApiId, validateRequestBody, validateRequestParameters);
        }
    }
}
