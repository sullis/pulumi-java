// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDeploymentResult {
    /**
     * Primary Id for this resource
     * 
     */
    private final @Nullable String deploymentId;
    /**
     * A description of the purpose of the API Gateway deployment.
     * 
     */
    private final @Nullable String description;

    @CustomType.Constructor
    private GetDeploymentResult(
        @CustomType.Parameter("deploymentId") @Nullable String deploymentId,
        @CustomType.Parameter("description") @Nullable String description) {
        this.deploymentId = deploymentId;
        this.description = description;
    }

    /**
     * Primary Id for this resource
     * 
    */
    public Optional<String> deploymentId() {
        return Optional.ofNullable(this.deploymentId);
    }
    /**
     * A description of the purpose of the API Gateway deployment.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deploymentId;
        private @Nullable String description;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeploymentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentId = defaults.deploymentId;
    	      this.description = defaults.description;
        }

        public Builder deploymentId(@Nullable String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }        public GetDeploymentResult build() {
            return new GetDeploymentResult(deploymentId, description);
        }
    }
}
