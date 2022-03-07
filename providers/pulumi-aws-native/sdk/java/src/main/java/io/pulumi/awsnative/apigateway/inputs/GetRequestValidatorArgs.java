// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetRequestValidatorArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRequestValidatorArgs Empty = new GetRequestValidatorArgs();

    /**
     * ID of the request validator.
     * 
     */
    @InputImport(name="requestValidatorId", required=true)
      private final String requestValidatorId;

    public String getRequestValidatorId() {
        return this.requestValidatorId;
    }

    /**
     * The identifier of the targeted API entity.
     * 
     */
    @InputImport(name="restApiId", required=true)
      private final String restApiId;

    public String getRestApiId() {
        return this.restApiId;
    }

    public GetRequestValidatorArgs(
        String requestValidatorId,
        String restApiId) {
        this.requestValidatorId = Objects.requireNonNull(requestValidatorId, "expected parameter 'requestValidatorId' to be non-null");
        this.restApiId = Objects.requireNonNull(restApiId, "expected parameter 'restApiId' to be non-null");
    }

    private GetRequestValidatorArgs() {
        this.requestValidatorId = null;
        this.restApiId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRequestValidatorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String requestValidatorId;
        private String restApiId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRequestValidatorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestValidatorId = defaults.requestValidatorId;
    	      this.restApiId = defaults.restApiId;
        }

        public Builder setRequestValidatorId(String requestValidatorId) {
            this.requestValidatorId = Objects.requireNonNull(requestValidatorId);
            return this;
        }

        public Builder setRestApiId(String restApiId) {
            this.restApiId = Objects.requireNonNull(restApiId);
            return this;
        }
        public GetRequestValidatorArgs build() {
            return new GetRequestValidatorArgs(requestValidatorId, restApiId);
        }
    }
}