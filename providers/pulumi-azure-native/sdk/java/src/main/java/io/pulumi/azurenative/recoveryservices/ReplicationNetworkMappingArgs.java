// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.recoveryservices.inputs.CreateNetworkMappingInputPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReplicationNetworkMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationNetworkMappingArgs Empty = new ReplicationNetworkMappingArgs();

    /**
     * Primary fabric name.
     * 
     */
    @InputImport(name="fabricName", required=true)
      private final Input<String> fabricName;

    public Input<String> getFabricName() {
        return this.fabricName;
    }

    /**
     * Network mapping name.
     * 
     */
    @InputImport(name="networkMappingName")
      private final @Nullable Input<String> networkMappingName;

    public Input<String> getNetworkMappingName() {
        return this.networkMappingName == null ? Input.empty() : this.networkMappingName;
    }

    /**
     * Primary network name.
     * 
     */
    @InputImport(name="networkName", required=true)
      private final Input<String> networkName;

    public Input<String> getNetworkName() {
        return this.networkName;
    }

    /**
     * Input properties for creating network mapping.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<CreateNetworkMappingInputPropertiesArgs> properties;

    public Input<CreateNetworkMappingInputPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @InputImport(name="resourceName", required=true)
      private final Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName;
    }

    public ReplicationNetworkMappingArgs(
        Input<String> fabricName,
        @Nullable Input<String> networkMappingName,
        Input<String> networkName,
        @Nullable Input<CreateNetworkMappingInputPropertiesArgs> properties,
        Input<String> resourceGroupName,
        Input<String> resourceName) {
        this.fabricName = Objects.requireNonNull(fabricName, "expected parameter 'fabricName' to be non-null");
        this.networkMappingName = networkMappingName;
        this.networkName = Objects.requireNonNull(networkName, "expected parameter 'networkName' to be non-null");
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private ReplicationNetworkMappingArgs() {
        this.fabricName = Input.empty();
        this.networkMappingName = Input.empty();
        this.networkName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationNetworkMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> fabricName;
        private @Nullable Input<String> networkMappingName;
        private Input<String> networkName;
        private @Nullable Input<CreateNetworkMappingInputPropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private Input<String> resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationNetworkMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fabricName = defaults.fabricName;
    	      this.networkMappingName = defaults.networkMappingName;
    	      this.networkName = defaults.networkName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder setFabricName(Input<String> fabricName) {
            this.fabricName = Objects.requireNonNull(fabricName);
            return this;
        }

        public Builder setFabricName(String fabricName) {
            this.fabricName = Input.of(Objects.requireNonNull(fabricName));
            return this;
        }

        public Builder setNetworkMappingName(@Nullable Input<String> networkMappingName) {
            this.networkMappingName = networkMappingName;
            return this;
        }

        public Builder setNetworkMappingName(@Nullable String networkMappingName) {
            this.networkMappingName = Input.ofNullable(networkMappingName);
            return this;
        }

        public Builder setNetworkName(Input<String> networkName) {
            this.networkName = Objects.requireNonNull(networkName);
            return this;
        }

        public Builder setNetworkName(String networkName) {
            this.networkName = Input.of(Objects.requireNonNull(networkName));
            return this;
        }

        public Builder setProperties(@Nullable Input<CreateNetworkMappingInputPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable CreateNetworkMappingInputPropertiesArgs properties) {
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

        public Builder setResourceName(Input<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public Builder setResourceName(String resourceName) {
            this.resourceName = Input.of(Objects.requireNonNull(resourceName));
            return this;
        }
        public ReplicationNetworkMappingArgs build() {
            return new ReplicationNetworkMappingArgs(fabricName, networkMappingName, networkName, properties, resourceGroupName, resourceName);
        }
    }
}