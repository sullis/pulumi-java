// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.logic.inputs.IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs;
import io.pulumi.azurenative.logic.inputs.ResourceReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationServiceEnvironmentManagedApiArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationServiceEnvironmentManagedApiArgs Empty = new IntegrationServiceEnvironmentManagedApiArgs();

    /**
     * The api name.
     * 
     */
    @InputImport(name="apiName")
      private final @Nullable Input<String> apiName;

    public Input<String> getApiName() {
        return this.apiName == null ? Input.empty() : this.apiName;
    }

    /**
     * The integration service environment managed api deployment parameters.
     * 
     */
    @InputImport(name="deploymentParameters")
      private final @Nullable Input<IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs> deploymentParameters;

    public Input<IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs> getDeploymentParameters() {
        return this.deploymentParameters == null ? Input.empty() : this.deploymentParameters;
    }

    /**
     * The integration service environment reference.
     * 
     */
    @InputImport(name="integrationServiceEnvironment")
      private final @Nullable Input<ResourceReferenceArgs> integrationServiceEnvironment;

    public Input<ResourceReferenceArgs> getIntegrationServiceEnvironment() {
        return this.integrationServiceEnvironment == null ? Input.empty() : this.integrationServiceEnvironment;
    }

    /**
     * The integration service environment name.
     * 
     */
    @InputImport(name="integrationServiceEnvironmentName", required=true)
      private final Input<String> integrationServiceEnvironmentName;

    public Input<String> getIntegrationServiceEnvironmentName() {
        return this.integrationServiceEnvironmentName;
    }

    /**
     * The resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroup", required=true)
      private final Input<String> resourceGroup;

    public Input<String> getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * The resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public IntegrationServiceEnvironmentManagedApiArgs(
        @Nullable Input<String> apiName,
        @Nullable Input<IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs> deploymentParameters,
        @Nullable Input<ResourceReferenceArgs> integrationServiceEnvironment,
        Input<String> integrationServiceEnvironmentName,
        @Nullable Input<String> location,
        Input<String> resourceGroup,
        @Nullable Input<Map<String,String>> tags) {
        this.apiName = apiName;
        this.deploymentParameters = deploymentParameters;
        this.integrationServiceEnvironment = integrationServiceEnvironment;
        this.integrationServiceEnvironmentName = Objects.requireNonNull(integrationServiceEnvironmentName, "expected parameter 'integrationServiceEnvironmentName' to be non-null");
        this.location = location;
        this.resourceGroup = Objects.requireNonNull(resourceGroup, "expected parameter 'resourceGroup' to be non-null");
        this.tags = tags;
    }

    private IntegrationServiceEnvironmentManagedApiArgs() {
        this.apiName = Input.empty();
        this.deploymentParameters = Input.empty();
        this.integrationServiceEnvironment = Input.empty();
        this.integrationServiceEnvironmentName = Input.empty();
        this.location = Input.empty();
        this.resourceGroup = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationServiceEnvironmentManagedApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiName;
        private @Nullable Input<IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs> deploymentParameters;
        private @Nullable Input<ResourceReferenceArgs> integrationServiceEnvironment;
        private Input<String> integrationServiceEnvironmentName;
        private @Nullable Input<String> location;
        private Input<String> resourceGroup;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationServiceEnvironmentManagedApiArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiName = defaults.apiName;
    	      this.deploymentParameters = defaults.deploymentParameters;
    	      this.integrationServiceEnvironment = defaults.integrationServiceEnvironment;
    	      this.integrationServiceEnvironmentName = defaults.integrationServiceEnvironmentName;
    	      this.location = defaults.location;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.tags = defaults.tags;
        }

        public Builder setApiName(@Nullable Input<String> apiName) {
            this.apiName = apiName;
            return this;
        }

        public Builder setApiName(@Nullable String apiName) {
            this.apiName = Input.ofNullable(apiName);
            return this;
        }

        public Builder setDeploymentParameters(@Nullable Input<IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs> deploymentParameters) {
            this.deploymentParameters = deploymentParameters;
            return this;
        }

        public Builder setDeploymentParameters(@Nullable IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs deploymentParameters) {
            this.deploymentParameters = Input.ofNullable(deploymentParameters);
            return this;
        }

        public Builder setIntegrationServiceEnvironment(@Nullable Input<ResourceReferenceArgs> integrationServiceEnvironment) {
            this.integrationServiceEnvironment = integrationServiceEnvironment;
            return this;
        }

        public Builder setIntegrationServiceEnvironment(@Nullable ResourceReferenceArgs integrationServiceEnvironment) {
            this.integrationServiceEnvironment = Input.ofNullable(integrationServiceEnvironment);
            return this;
        }

        public Builder setIntegrationServiceEnvironmentName(Input<String> integrationServiceEnvironmentName) {
            this.integrationServiceEnvironmentName = Objects.requireNonNull(integrationServiceEnvironmentName);
            return this;
        }

        public Builder setIntegrationServiceEnvironmentName(String integrationServiceEnvironmentName) {
            this.integrationServiceEnvironmentName = Input.of(Objects.requireNonNull(integrationServiceEnvironmentName));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setResourceGroup(Input<String> resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }

        public Builder setResourceGroup(String resourceGroup) {
            this.resourceGroup = Input.of(Objects.requireNonNull(resourceGroup));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public IntegrationServiceEnvironmentManagedApiArgs build() {
            return new IntegrationServiceEnvironmentManagedApiArgs(apiName, deploymentParameters, integrationServiceEnvironment, integrationServiceEnvironmentName, location, resourceGroup, tags);
        }
    }
}