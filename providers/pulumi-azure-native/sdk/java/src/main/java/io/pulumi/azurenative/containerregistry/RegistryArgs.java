// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.containerregistry.inputs.NetworkRuleSetArgs;
import io.pulumi.azurenative.containerregistry.inputs.PoliciesArgs;
import io.pulumi.azurenative.containerregistry.inputs.SkuArgs;
import io.pulumi.azurenative.containerregistry.inputs.StorageAccountPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegistryArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegistryArgs Empty = new RegistryArgs();

    /**
     * The value that indicates whether the admin user is enabled.
     * 
     */
    @InputImport(name="adminUserEnabled")
      private final @Nullable Input<Boolean> adminUserEnabled;

    public Input<Boolean> getAdminUserEnabled() {
        return this.adminUserEnabled == null ? Input.empty() : this.adminUserEnabled;
    }

    /**
     * The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The network rule set for a container registry.
     * 
     */
    @InputImport(name="networkRuleSet")
      private final @Nullable Input<NetworkRuleSetArgs> networkRuleSet;

    public Input<NetworkRuleSetArgs> getNetworkRuleSet() {
        return this.networkRuleSet == null ? Input.empty() : this.networkRuleSet;
    }

    /**
     * The policies for a container registry.
     * 
     */
    @InputImport(name="policies")
      private final @Nullable Input<PoliciesArgs> policies;

    public Input<PoliciesArgs> getPolicies() {
        return this.policies == null ? Input.empty() : this.policies;
    }

    /**
     * The name of the container registry.
     * 
     */
    @InputImport(name="registryName")
      private final @Nullable Input<String> registryName;

    public Input<String> getRegistryName() {
        return this.registryName == null ? Input.empty() : this.registryName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The SKU of the container registry.
     * 
     */
    @InputImport(name="sku", required=true)
      private final Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku;
    }

    /**
     * The properties of the storage account for the container registry. Only applicable to Classic SKU.
     * 
     */
    @InputImport(name="storageAccount")
      private final @Nullable Input<StorageAccountPropertiesArgs> storageAccount;

    public Input<StorageAccountPropertiesArgs> getStorageAccount() {
        return this.storageAccount == null ? Input.empty() : this.storageAccount;
    }

    /**
     * The tags of the resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public RegistryArgs(
        @Nullable Input<Boolean> adminUserEnabled,
        @Nullable Input<String> location,
        @Nullable Input<NetworkRuleSetArgs> networkRuleSet,
        @Nullable Input<PoliciesArgs> policies,
        @Nullable Input<String> registryName,
        Input<String> resourceGroupName,
        Input<SkuArgs> sku,
        @Nullable Input<StorageAccountPropertiesArgs> storageAccount,
        @Nullable Input<Map<String,String>> tags) {
        this.adminUserEnabled = adminUserEnabled == null ? Input.ofNullable(false) : adminUserEnabled;
        this.location = location;
        this.networkRuleSet = networkRuleSet;
        this.policies = policies;
        this.registryName = registryName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.storageAccount = storageAccount;
        this.tags = tags;
    }

    private RegistryArgs() {
        this.adminUserEnabled = Input.empty();
        this.location = Input.empty();
        this.networkRuleSet = Input.empty();
        this.policies = Input.empty();
        this.registryName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.storageAccount = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> adminUserEnabled;
        private @Nullable Input<String> location;
        private @Nullable Input<NetworkRuleSetArgs> networkRuleSet;
        private @Nullable Input<PoliciesArgs> policies;
        private @Nullable Input<String> registryName;
        private Input<String> resourceGroupName;
        private Input<SkuArgs> sku;
        private @Nullable Input<StorageAccountPropertiesArgs> storageAccount;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminUserEnabled = defaults.adminUserEnabled;
    	      this.location = defaults.location;
    	      this.networkRuleSet = defaults.networkRuleSet;
    	      this.policies = defaults.policies;
    	      this.registryName = defaults.registryName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.storageAccount = defaults.storageAccount;
    	      this.tags = defaults.tags;
        }

        public Builder setAdminUserEnabled(@Nullable Input<Boolean> adminUserEnabled) {
            this.adminUserEnabled = adminUserEnabled;
            return this;
        }

        public Builder setAdminUserEnabled(@Nullable Boolean adminUserEnabled) {
            this.adminUserEnabled = Input.ofNullable(adminUserEnabled);
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

        public Builder setNetworkRuleSet(@Nullable Input<NetworkRuleSetArgs> networkRuleSet) {
            this.networkRuleSet = networkRuleSet;
            return this;
        }

        public Builder setNetworkRuleSet(@Nullable NetworkRuleSetArgs networkRuleSet) {
            this.networkRuleSet = Input.ofNullable(networkRuleSet);
            return this;
        }

        public Builder setPolicies(@Nullable Input<PoliciesArgs> policies) {
            this.policies = policies;
            return this;
        }

        public Builder setPolicies(@Nullable PoliciesArgs policies) {
            this.policies = Input.ofNullable(policies);
            return this;
        }

        public Builder setRegistryName(@Nullable Input<String> registryName) {
            this.registryName = registryName;
            return this;
        }

        public Builder setRegistryName(@Nullable String registryName) {
            this.registryName = Input.ofNullable(registryName);
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

        public Builder setSku(Input<SkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setSku(SkuArgs sku) {
            this.sku = Input.of(Objects.requireNonNull(sku));
            return this;
        }

        public Builder setStorageAccount(@Nullable Input<StorageAccountPropertiesArgs> storageAccount) {
            this.storageAccount = storageAccount;
            return this;
        }

        public Builder setStorageAccount(@Nullable StorageAccountPropertiesArgs storageAccount) {
            this.storageAccount = Input.ofNullable(storageAccount);
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
        public RegistryArgs build() {
            return new RegistryArgs(adminUserEnabled, location, networkRuleSet, policies, registryName, resourceGroupName, sku, storageAccount, tags);
        }
    }
}