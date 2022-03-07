// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection;

import io.pulumi.azurenative.dataprotection.inputs.DppIdentityDetailsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupVaultArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupVaultArgs Empty = new BackupVaultArgs();

    /**
     * Optional ETag.
     * 
     */
    @InputImport(name="eTag")
      private final @Nullable Input<String> eTag;

    public Input<String> getETag() {
        return this.eTag == null ? Input.empty() : this.eTag;
    }

    /**
     * Input Managed Identity Details
     * 
     */
    @InputImport(name="identity")
      private final @Nullable Input<DppIdentityDetailsArgs> identity;

    public Input<DppIdentityDetailsArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * BackupVaultResource properties
     * 
     */
    @InputImport(name="properties", required=true)
      private final Input<io.pulumi.azurenative.dataprotection.inputs.BackupVaultArgs> properties;

    public Input<io.pulumi.azurenative.dataprotection.inputs.BackupVaultArgs> getProperties() {
        return this.properties;
    }

    /**
     * The name of the resource group where the backup vault is present.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The name of the backup vault.
     * 
     */
    @InputImport(name="vaultName")
      private final @Nullable Input<String> vaultName;

    public Input<String> getVaultName() {
        return this.vaultName == null ? Input.empty() : this.vaultName;
    }

    public BackupVaultArgs(
        @Nullable Input<String> eTag,
        @Nullable Input<DppIdentityDetailsArgs> identity,
        @Nullable Input<String> location,
        Input<io.pulumi.azurenative.dataprotection.inputs.BackupVaultArgs> properties,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> vaultName) {
        this.eTag = eTag;
        this.identity = identity;
        this.location = location;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.vaultName = vaultName;
    }

    private BackupVaultArgs() {
        this.eTag = Input.empty();
        this.identity = Input.empty();
        this.location = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.vaultName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupVaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> eTag;
        private @Nullable Input<DppIdentityDetailsArgs> identity;
        private @Nullable Input<String> location;
        private Input<io.pulumi.azurenative.dataprotection.inputs.BackupVaultArgs> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> vaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupVaultArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.vaultName = defaults.vaultName;
        }

        public Builder setETag(@Nullable Input<String> eTag) {
            this.eTag = eTag;
            return this;
        }

        public Builder setETag(@Nullable String eTag) {
            this.eTag = Input.ofNullable(eTag);
            return this;
        }

        public Builder setIdentity(@Nullable Input<DppIdentityDetailsArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable DppIdentityDetailsArgs identity) {
            this.identity = Input.ofNullable(identity);
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

        public Builder setProperties(Input<io.pulumi.azurenative.dataprotection.inputs.BackupVaultArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setProperties(io.pulumi.azurenative.dataprotection.inputs.BackupVaultArgs properties) {
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVaultName(@Nullable Input<String> vaultName) {
            this.vaultName = vaultName;
            return this;
        }

        public Builder setVaultName(@Nullable String vaultName) {
            this.vaultName = Input.ofNullable(vaultName);
            return this;
        }
        public BackupVaultArgs build() {
            return new BackupVaultArgs(eTag, identity, location, properties, resourceGroupName, tags, vaultName);
        }
    }
}