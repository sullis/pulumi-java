// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetGameServerDeploymentRolloutArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGameServerDeploymentRolloutArgs Empty = new GetGameServerDeploymentRolloutArgs();

    /**
     * The deployment to get the rollout state from. Only 1 rollout must be associated with each deployment.
     * 
     */
    @InputImport(name="deploymentId", required=true)
      private final String deploymentId;

    public String getDeploymentId() {
        return this.deploymentId;
    }

    public GetGameServerDeploymentRolloutArgs(String deploymentId) {
        this.deploymentId = Objects.requireNonNull(deploymentId, "expected parameter 'deploymentId' to be non-null");
    }

    private GetGameServerDeploymentRolloutArgs() {
        this.deploymentId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGameServerDeploymentRolloutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deploymentId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGameServerDeploymentRolloutArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentId = defaults.deploymentId;
        }

        public Builder setDeploymentId(String deploymentId) {
            this.deploymentId = Objects.requireNonNull(deploymentId);
            return this;
        }
        public GetGameServerDeploymentRolloutArgs build() {
            return new GetGameServerDeploymentRolloutArgs(deploymentId);
        }
    }
}