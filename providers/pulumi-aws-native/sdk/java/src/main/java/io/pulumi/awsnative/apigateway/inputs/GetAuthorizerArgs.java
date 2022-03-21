// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAuthorizerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAuthorizerArgs Empty = new GetAuthorizerArgs();

    @Import(name="authorizerId", required=true)
      private final String authorizerId;

    public String getAuthorizerId() {
        return this.authorizerId;
    }

    /**
     * The identifier of the API.
     * 
     */
    @Import(name="restApiId", required=true)
      private final String restApiId;

    public String getRestApiId() {
        return this.restApiId;
    }

    public GetAuthorizerArgs(
        String authorizerId,
        String restApiId) {
        this.authorizerId = Objects.requireNonNull(authorizerId, "expected parameter 'authorizerId' to be non-null");
        this.restApiId = Objects.requireNonNull(restApiId, "expected parameter 'restApiId' to be non-null");
    }

    private GetAuthorizerArgs() {
        this.authorizerId = null;
        this.restApiId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthorizerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizerId;
        private String restApiId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAuthorizerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizerId = defaults.authorizerId;
    	      this.restApiId = defaults.restApiId;
        }

        public Builder authorizerId(String authorizerId) {
            this.authorizerId = Objects.requireNonNull(authorizerId);
            return this;
        }
        public Builder restApiId(String restApiId) {
            this.restApiId = Objects.requireNonNull(restApiId);
            return this;
        }        public GetAuthorizerArgs build() {
            return new GetAuthorizerArgs(authorizerId, restApiId);
        }
    }
}
