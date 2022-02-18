// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedPrivateEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedPrivateEndpointArgs Empty = new ManagedPrivateEndpointArgs();

    /**
     * The factory name.
     * 
     */
    @InputImport(name="factoryName", required=true)
    private final Input<String> factoryName;

    public Input<String> getFactoryName() {
        return this.factoryName;
    }

    /**
     * Managed private endpoint name
     * 
     */
    @InputImport(name="managedPrivateEndpointName")
    private final @Nullable Input<String> managedPrivateEndpointName;

    public Input<String> getManagedPrivateEndpointName() {
        return this.managedPrivateEndpointName == null ? Input.empty() : this.managedPrivateEndpointName;
    }

    /**
     * Managed virtual network name
     * 
     */
    @InputImport(name="managedVirtualNetworkName", required=true)
    private final Input<String> managedVirtualNetworkName;

    public Input<String> getManagedVirtualNetworkName() {
        return this.managedVirtualNetworkName;
    }

    /**
     * Managed private endpoint properties.
     * 
     */
    @InputImport(name="properties", required=true)
    private final Input<io.pulumi.azurenative.datafactory.inputs.ManagedPrivateEndpointArgs> properties;

    public Input<io.pulumi.azurenative.datafactory.inputs.ManagedPrivateEndpointArgs> getProperties() {
        return this.properties;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ManagedPrivateEndpointArgs(
        Input<String> factoryName,
        @Nullable Input<String> managedPrivateEndpointName,
        Input<String> managedVirtualNetworkName,
        Input<io.pulumi.azurenative.datafactory.inputs.ManagedPrivateEndpointArgs> properties,
        Input<String> resourceGroupName) {
        this.factoryName = Objects.requireNonNull(factoryName, "expected parameter 'factoryName' to be non-null");
        this.managedPrivateEndpointName = managedPrivateEndpointName;
        this.managedVirtualNetworkName = Objects.requireNonNull(managedVirtualNetworkName, "expected parameter 'managedVirtualNetworkName' to be non-null");
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ManagedPrivateEndpointArgs() {
        this.factoryName = Input.empty();
        this.managedPrivateEndpointName = Input.empty();
        this.managedVirtualNetworkName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedPrivateEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> factoryName;
        private @Nullable Input<String> managedPrivateEndpointName;
        private Input<String> managedVirtualNetworkName;
        private Input<io.pulumi.azurenative.datafactory.inputs.ManagedPrivateEndpointArgs> properties;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedPrivateEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.factoryName = defaults.factoryName;
    	      this.managedPrivateEndpointName = defaults.managedPrivateEndpointName;
    	      this.managedVirtualNetworkName = defaults.managedVirtualNetworkName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setFactoryName(Input<String> factoryName) {
            this.factoryName = Objects.requireNonNull(factoryName);
            return this;
        }

        public Builder setFactoryName(String factoryName) {
            this.factoryName = Input.of(Objects.requireNonNull(factoryName));
            return this;
        }

        public Builder setManagedPrivateEndpointName(@Nullable Input<String> managedPrivateEndpointName) {
            this.managedPrivateEndpointName = managedPrivateEndpointName;
            return this;
        }

        public Builder setManagedPrivateEndpointName(@Nullable String managedPrivateEndpointName) {
            this.managedPrivateEndpointName = Input.ofNullable(managedPrivateEndpointName);
            return this;
        }

        public Builder setManagedVirtualNetworkName(Input<String> managedVirtualNetworkName) {
            this.managedVirtualNetworkName = Objects.requireNonNull(managedVirtualNetworkName);
            return this;
        }

        public Builder setManagedVirtualNetworkName(String managedVirtualNetworkName) {
            this.managedVirtualNetworkName = Input.of(Objects.requireNonNull(managedVirtualNetworkName));
            return this;
        }

        public Builder setProperties(Input<io.pulumi.azurenative.datafactory.inputs.ManagedPrivateEndpointArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setProperties(io.pulumi.azurenative.datafactory.inputs.ManagedPrivateEndpointArgs properties) {
            this.properties = Input.of(Objects.requireNonNull(properties));
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

        public ManagedPrivateEndpointArgs build() {
            return new ManagedPrivateEndpointArgs(factoryName, managedPrivateEndpointName, managedVirtualNetworkName, properties, resourceGroupName);
        }
    }
}
