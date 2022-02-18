// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.storage.inputs.BlobInventoryPolicySchemaArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BlobInventoryPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BlobInventoryPolicyArgs Empty = new BlobInventoryPolicyArgs();

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @InputImport(name="accountName", required=true)
    private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the storage account blob inventory policy. It should always be 'default'
     * 
     */
    @InputImport(name="blobInventoryPolicyName")
    private final @Nullable Input<String> blobInventoryPolicyName;

    public Input<String> getBlobInventoryPolicyName() {
        return this.blobInventoryPolicyName == null ? Input.empty() : this.blobInventoryPolicyName;
    }

    /**
     * The storage account blob inventory policy object. It is composed of policy rules.
     * 
     */
    @InputImport(name="policy", required=true)
    private final Input<BlobInventoryPolicySchemaArgs> policy;

    public Input<BlobInventoryPolicySchemaArgs> getPolicy() {
        return this.policy;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public BlobInventoryPolicyArgs(
        Input<String> accountName,
        @Nullable Input<String> blobInventoryPolicyName,
        Input<BlobInventoryPolicySchemaArgs> policy,
        Input<String> resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.blobInventoryPolicyName = blobInventoryPolicyName;
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private BlobInventoryPolicyArgs() {
        this.accountName = Input.empty();
        this.blobInventoryPolicyName = Input.empty();
        this.policy = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobInventoryPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<String> blobInventoryPolicyName;
        private Input<BlobInventoryPolicySchemaArgs> policy;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobInventoryPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.blobInventoryPolicyName = defaults.blobInventoryPolicyName;
    	      this.policy = defaults.policy;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setBlobInventoryPolicyName(@Nullable Input<String> blobInventoryPolicyName) {
            this.blobInventoryPolicyName = blobInventoryPolicyName;
            return this;
        }

        public Builder setBlobInventoryPolicyName(@Nullable String blobInventoryPolicyName) {
            this.blobInventoryPolicyName = Input.ofNullable(blobInventoryPolicyName);
            return this;
        }

        public Builder setPolicy(Input<BlobInventoryPolicySchemaArgs> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }

        public Builder setPolicy(BlobInventoryPolicySchemaArgs policy) {
            this.policy = Input.of(Objects.requireNonNull(policy));
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

        public BlobInventoryPolicyArgs build() {
            return new BlobInventoryPolicyArgs(accountName, blobInventoryPolicyName, policy, resourceGroupName);
        }
    }
}
