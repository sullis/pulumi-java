// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.recoveryservices.inputs.StorageMappingInputPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReplicationStorageClassificationMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationStorageClassificationMappingArgs Empty = new ReplicationStorageClassificationMappingArgs();

    /**
     * Fabric name.
     * 
     */
    @InputImport(name="fabricName", required=true)
    private final Input<String> fabricName;

    public Input<String> getFabricName() {
        return this.fabricName;
    }

    /**
     * Storage mapping input properties.
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Input<StorageMappingInputPropertiesArgs> properties;

    public Input<StorageMappingInputPropertiesArgs> getProperties() {
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

    /**
     * Storage classification mapping name.
     * 
     */
    @InputImport(name="storageClassificationMappingName")
    private final @Nullable Input<String> storageClassificationMappingName;

    public Input<String> getStorageClassificationMappingName() {
        return this.storageClassificationMappingName == null ? Input.empty() : this.storageClassificationMappingName;
    }

    /**
     * Storage classification name.
     * 
     */
    @InputImport(name="storageClassificationName", required=true)
    private final Input<String> storageClassificationName;

    public Input<String> getStorageClassificationName() {
        return this.storageClassificationName;
    }

    public ReplicationStorageClassificationMappingArgs(
        Input<String> fabricName,
        @Nullable Input<StorageMappingInputPropertiesArgs> properties,
        Input<String> resourceGroupName,
        Input<String> resourceName,
        @Nullable Input<String> storageClassificationMappingName,
        Input<String> storageClassificationName) {
        this.fabricName = Objects.requireNonNull(fabricName, "expected parameter 'fabricName' to be non-null");
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
        this.storageClassificationMappingName = storageClassificationMappingName;
        this.storageClassificationName = Objects.requireNonNull(storageClassificationName, "expected parameter 'storageClassificationName' to be non-null");
    }

    private ReplicationStorageClassificationMappingArgs() {
        this.fabricName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
        this.storageClassificationMappingName = Input.empty();
        this.storageClassificationName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationStorageClassificationMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> fabricName;
        private @Nullable Input<StorageMappingInputPropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private Input<String> resourceName;
        private @Nullable Input<String> storageClassificationMappingName;
        private Input<String> storageClassificationName;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationStorageClassificationMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fabricName = defaults.fabricName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.storageClassificationMappingName = defaults.storageClassificationMappingName;
    	      this.storageClassificationName = defaults.storageClassificationName;
        }

        public Builder setFabricName(Input<String> fabricName) {
            this.fabricName = Objects.requireNonNull(fabricName);
            return this;
        }

        public Builder setFabricName(String fabricName) {
            this.fabricName = Input.of(Objects.requireNonNull(fabricName));
            return this;
        }

        public Builder setProperties(@Nullable Input<StorageMappingInputPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable StorageMappingInputPropertiesArgs properties) {
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

        public Builder setStorageClassificationMappingName(@Nullable Input<String> storageClassificationMappingName) {
            this.storageClassificationMappingName = storageClassificationMappingName;
            return this;
        }

        public Builder setStorageClassificationMappingName(@Nullable String storageClassificationMappingName) {
            this.storageClassificationMappingName = Input.ofNullable(storageClassificationMappingName);
            return this;
        }

        public Builder setStorageClassificationName(Input<String> storageClassificationName) {
            this.storageClassificationName = Objects.requireNonNull(storageClassificationName);
            return this;
        }

        public Builder setStorageClassificationName(String storageClassificationName) {
            this.storageClassificationName = Input.of(Objects.requireNonNull(storageClassificationName));
            return this;
        }

        public ReplicationStorageClassificationMappingArgs build() {
            return new ReplicationStorageClassificationMappingArgs(fabricName, properties, resourceGroupName, resourceName, storageClassificationMappingName, storageClassificationName);
        }
    }
}
