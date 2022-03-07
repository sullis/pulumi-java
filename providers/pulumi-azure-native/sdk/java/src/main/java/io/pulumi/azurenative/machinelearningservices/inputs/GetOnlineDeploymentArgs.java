// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetOnlineDeploymentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetOnlineDeploymentArgs Empty = new GetOnlineDeploymentArgs();

    /**
     * Inference Endpoint Deployment name.
     * 
     */
    @InputImport(name="deploymentName", required=true)
      private final String deploymentName;

    public String getDeploymentName() {
        return this.deploymentName;
    }

    /**
     * Inference endpoint name.
     * 
     */
    @InputImport(name="endpointName", required=true)
      private final String endpointName;

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
      private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetOnlineDeploymentArgs(
        String deploymentName,
        String endpointName,
        String resourceGroupName,
        String workspaceName) {
        this.deploymentName = Objects.requireNonNull(deploymentName, "expected parameter 'deploymentName' to be non-null");
        this.endpointName = Objects.requireNonNull(endpointName, "expected parameter 'endpointName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetOnlineDeploymentArgs() {
        this.deploymentName = null;
        this.endpointName = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOnlineDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deploymentName;
        private String endpointName;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOnlineDeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentName = defaults.deploymentName;
    	      this.endpointName = defaults.endpointName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setDeploymentName(String deploymentName) {
            this.deploymentName = Objects.requireNonNull(deploymentName);
            return this;
        }

        public Builder setEndpointName(String endpointName) {
            this.endpointName = Objects.requireNonNull(endpointName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public GetOnlineDeploymentArgs build() {
            return new GetOnlineDeploymentArgs(deploymentName, endpointName, resourceGroupName, workspaceName);
        }
    }
}