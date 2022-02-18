// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.recoveryservices.inputs.EnableMigrationInputPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReplicationMigrationItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationMigrationItemArgs Empty = new ReplicationMigrationItemArgs();

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
     * Migration item name.
     * 
     */
    @InputImport(name="migrationItemName")
    private final @Nullable Input<String> migrationItemName;

    public Input<String> getMigrationItemName() {
        return this.migrationItemName == null ? Input.empty() : this.migrationItemName;
    }

    /**
     * Enable migration input properties.
     * 
     */
    @InputImport(name="properties", required=true)
    private final Input<EnableMigrationInputPropertiesArgs> properties;

    public Input<EnableMigrationInputPropertiesArgs> getProperties() {
        return this.properties;
    }

    /**
     * Protection container name.
     * 
     */
    @InputImport(name="protectionContainerName", required=true)
    private final Input<String> protectionContainerName;

    public Input<String> getProtectionContainerName() {
        return this.protectionContainerName;
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

    public ReplicationMigrationItemArgs(
        Input<String> fabricName,
        @Nullable Input<String> migrationItemName,
        Input<EnableMigrationInputPropertiesArgs> properties,
        Input<String> protectionContainerName,
        Input<String> resourceGroupName,
        Input<String> resourceName) {
        this.fabricName = Objects.requireNonNull(fabricName, "expected parameter 'fabricName' to be non-null");
        this.migrationItemName = migrationItemName;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.protectionContainerName = Objects.requireNonNull(protectionContainerName, "expected parameter 'protectionContainerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private ReplicationMigrationItemArgs() {
        this.fabricName = Input.empty();
        this.migrationItemName = Input.empty();
        this.properties = Input.empty();
        this.protectionContainerName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationMigrationItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> fabricName;
        private @Nullable Input<String> migrationItemName;
        private Input<EnableMigrationInputPropertiesArgs> properties;
        private Input<String> protectionContainerName;
        private Input<String> resourceGroupName;
        private Input<String> resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationMigrationItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fabricName = defaults.fabricName;
    	      this.migrationItemName = defaults.migrationItemName;
    	      this.properties = defaults.properties;
    	      this.protectionContainerName = defaults.protectionContainerName;
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

        public Builder setMigrationItemName(@Nullable Input<String> migrationItemName) {
            this.migrationItemName = migrationItemName;
            return this;
        }

        public Builder setMigrationItemName(@Nullable String migrationItemName) {
            this.migrationItemName = Input.ofNullable(migrationItemName);
            return this;
        }

        public Builder setProperties(Input<EnableMigrationInputPropertiesArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setProperties(EnableMigrationInputPropertiesArgs properties) {
            this.properties = Input.of(Objects.requireNonNull(properties));
            return this;
        }

        public Builder setProtectionContainerName(Input<String> protectionContainerName) {
            this.protectionContainerName = Objects.requireNonNull(protectionContainerName);
            return this;
        }

        public Builder setProtectionContainerName(String protectionContainerName) {
            this.protectionContainerName = Input.of(Objects.requireNonNull(protectionContainerName));
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

        public ReplicationMigrationItemArgs build() {
            return new ReplicationMigrationItemArgs(fabricName, migrationItemName, properties, protectionContainerName, resourceGroupName, resourceName);
        }
    }
}
