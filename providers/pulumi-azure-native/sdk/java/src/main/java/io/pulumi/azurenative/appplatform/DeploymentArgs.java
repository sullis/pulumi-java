// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.appplatform.inputs.DeploymentResourcePropertiesArgs;
import io.pulumi.azurenative.appplatform.inputs.SkuArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentArgs Empty = new DeploymentArgs();

    /**
     * The name of the App resource.
     * 
     */
    @InputImport(name="appName", required=true)
    private final Input<String> appName;

    public Input<String> getAppName() {
        return this.appName;
    }

    /**
     * The name of the Deployment resource.
     * 
     */
    @InputImport(name="deploymentName")
    private final @Nullable Input<String> deploymentName;

    public Input<String> getDeploymentName() {
        return this.deploymentName == null ? Input.empty() : this.deploymentName;
    }

    /**
     * Properties of the Deployment resource
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Input<DeploymentResourcePropertiesArgs> properties;

    public Input<DeploymentResourcePropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @InputImport(name="serviceName", required=true)
    private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    /**
     * Sku of the Deployment resource
     * 
     */
    @InputImport(name="sku")
    private final @Nullable Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    public DeploymentArgs(
        Input<String> appName,
        @Nullable Input<String> deploymentName,
        @Nullable Input<DeploymentResourcePropertiesArgs> properties,
        Input<String> resourceGroupName,
        Input<String> serviceName,
        @Nullable Input<SkuArgs> sku) {
        this.appName = Objects.requireNonNull(appName, "expected parameter 'appName' to be non-null");
        this.deploymentName = deploymentName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.sku = sku;
    }

    private DeploymentArgs() {
        this.appName = Input.empty();
        this.deploymentName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceName = Input.empty();
        this.sku = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> appName;
        private @Nullable Input<String> deploymentName;
        private @Nullable Input<DeploymentResourcePropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private Input<String> serviceName;
        private @Nullable Input<SkuArgs> sku;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appName = defaults.appName;
    	      this.deploymentName = defaults.deploymentName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.sku = defaults.sku;
        }

        public Builder setAppName(Input<String> appName) {
            this.appName = Objects.requireNonNull(appName);
            return this;
        }

        public Builder setAppName(String appName) {
            this.appName = Input.of(Objects.requireNonNull(appName));
            return this;
        }

        public Builder setDeploymentName(@Nullable Input<String> deploymentName) {
            this.deploymentName = deploymentName;
            return this;
        }

        public Builder setDeploymentName(@Nullable String deploymentName) {
            this.deploymentName = Input.ofNullable(deploymentName);
            return this;
        }

        public Builder setProperties(@Nullable Input<DeploymentResourcePropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable DeploymentResourcePropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }

        public Builder setSku(@Nullable Input<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable SkuArgs sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public DeploymentArgs build() {
            return new DeploymentArgs(appName, deploymentName, properties, resourceGroupName, serviceName, sku);
        }
    }
}
