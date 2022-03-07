// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch;

import io.pulumi.azurenative.batch.enums.PoolAllocationMode;
import io.pulumi.azurenative.batch.enums.PublicNetworkAccessType;
import io.pulumi.azurenative.batch.inputs.AutoStorageBasePropertiesArgs;
import io.pulumi.azurenative.batch.inputs.BatchAccountIdentityArgs;
import io.pulumi.azurenative.batch.inputs.EncryptionPropertiesArgs;
import io.pulumi.azurenative.batch.inputs.KeyVaultReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BatchAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final BatchAccountArgs Empty = new BatchAccountArgs();

    /**
     * A name for the Batch account which must be unique within the region. Batch account names must be between 3 and 24 characters in length and must use only numbers and lowercase letters. This name is used as part of the DNS name that is used to access the Batch service in the region in which the account is created. For example: http://accountname.region.batch.azure.com/.
     * 
     */
    @InputImport(name="accountName")
      private final @Nullable Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName == null ? Input.empty() : this.accountName;
    }

    /**
     * The properties related to the auto-storage account.
     * 
     */
    @InputImport(name="autoStorage")
      private final @Nullable Input<AutoStorageBasePropertiesArgs> autoStorage;

    public Input<AutoStorageBasePropertiesArgs> getAutoStorage() {
        return this.autoStorage == null ? Input.empty() : this.autoStorage;
    }

    /**
     * Configures how customer data is encrypted inside the Batch account. By default, accounts are encrypted using a Microsoft managed key. For additional control, a customer-managed key can be used instead.
     * 
     */
    @InputImport(name="encryption")
      private final @Nullable Input<EncryptionPropertiesArgs> encryption;

    public Input<EncryptionPropertiesArgs> getEncryption() {
        return this.encryption == null ? Input.empty() : this.encryption;
    }

    /**
     * The identity of the Batch account.
     * 
     */
    @InputImport(name="identity")
      private final @Nullable Input<BatchAccountIdentityArgs> identity;

    public Input<BatchAccountIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * A reference to the Azure key vault associated with the Batch account.
     * 
     */
    @InputImport(name="keyVaultReference")
      private final @Nullable Input<KeyVaultReferenceArgs> keyVaultReference;

    public Input<KeyVaultReferenceArgs> getKeyVaultReference() {
        return this.keyVaultReference == null ? Input.empty() : this.keyVaultReference;
    }

    /**
     * The region in which to create the account.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The pool allocation mode also affects how clients may authenticate to the Batch Service API. If the mode is BatchService, clients may authenticate using access keys or Azure Active Directory. If the mode is UserSubscription, clients must use Azure Active Directory. The default is BatchService.
     * 
     */
    @InputImport(name="poolAllocationMode")
      private final @Nullable Input<PoolAllocationMode> poolAllocationMode;

    public Input<PoolAllocationMode> getPoolAllocationMode() {
        return this.poolAllocationMode == null ? Input.empty() : this.poolAllocationMode;
    }

    /**
     * If not specified, the default value is 'enabled'.
     * 
     */
    @InputImport(name="publicNetworkAccess")
      private final @Nullable Input<PublicNetworkAccessType> publicNetworkAccess;

    public Input<PublicNetworkAccessType> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Input.empty() : this.publicNetworkAccess;
    }

    /**
     * The name of the resource group that contains the Batch account.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The user-specified tags associated with the account.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public BatchAccountArgs(
        @Nullable Input<String> accountName,
        @Nullable Input<AutoStorageBasePropertiesArgs> autoStorage,
        @Nullable Input<EncryptionPropertiesArgs> encryption,
        @Nullable Input<BatchAccountIdentityArgs> identity,
        @Nullable Input<KeyVaultReferenceArgs> keyVaultReference,
        @Nullable Input<String> location,
        @Nullable Input<PoolAllocationMode> poolAllocationMode,
        @Nullable Input<PublicNetworkAccessType> publicNetworkAccess,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.accountName = accountName;
        this.autoStorage = autoStorage;
        this.encryption = encryption;
        this.identity = identity;
        this.keyVaultReference = keyVaultReference;
        this.location = location;
        this.poolAllocationMode = poolAllocationMode;
        this.publicNetworkAccess = publicNetworkAccess;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private BatchAccountArgs() {
        this.accountName = Input.empty();
        this.autoStorage = Input.empty();
        this.encryption = Input.empty();
        this.identity = Input.empty();
        this.keyVaultReference = Input.empty();
        this.location = Input.empty();
        this.poolAllocationMode = Input.empty();
        this.publicNetworkAccess = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BatchAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accountName;
        private @Nullable Input<AutoStorageBasePropertiesArgs> autoStorage;
        private @Nullable Input<EncryptionPropertiesArgs> encryption;
        private @Nullable Input<BatchAccountIdentityArgs> identity;
        private @Nullable Input<KeyVaultReferenceArgs> keyVaultReference;
        private @Nullable Input<String> location;
        private @Nullable Input<PoolAllocationMode> poolAllocationMode;
        private @Nullable Input<PublicNetworkAccessType> publicNetworkAccess;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(BatchAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.autoStorage = defaults.autoStorage;
    	      this.encryption = defaults.encryption;
    	      this.identity = defaults.identity;
    	      this.keyVaultReference = defaults.keyVaultReference;
    	      this.location = defaults.location;
    	      this.poolAllocationMode = defaults.poolAllocationMode;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setAccountName(@Nullable Input<String> accountName) {
            this.accountName = accountName;
            return this;
        }

        public Builder setAccountName(@Nullable String accountName) {
            this.accountName = Input.ofNullable(accountName);
            return this;
        }

        public Builder setAutoStorage(@Nullable Input<AutoStorageBasePropertiesArgs> autoStorage) {
            this.autoStorage = autoStorage;
            return this;
        }

        public Builder setAutoStorage(@Nullable AutoStorageBasePropertiesArgs autoStorage) {
            this.autoStorage = Input.ofNullable(autoStorage);
            return this;
        }

        public Builder setEncryption(@Nullable Input<EncryptionPropertiesArgs> encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setEncryption(@Nullable EncryptionPropertiesArgs encryption) {
            this.encryption = Input.ofNullable(encryption);
            return this;
        }

        public Builder setIdentity(@Nullable Input<BatchAccountIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable BatchAccountIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setKeyVaultReference(@Nullable Input<KeyVaultReferenceArgs> keyVaultReference) {
            this.keyVaultReference = keyVaultReference;
            return this;
        }

        public Builder setKeyVaultReference(@Nullable KeyVaultReferenceArgs keyVaultReference) {
            this.keyVaultReference = Input.ofNullable(keyVaultReference);
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

        public Builder setPoolAllocationMode(@Nullable Input<PoolAllocationMode> poolAllocationMode) {
            this.poolAllocationMode = poolAllocationMode;
            return this;
        }

        public Builder setPoolAllocationMode(@Nullable PoolAllocationMode poolAllocationMode) {
            this.poolAllocationMode = Input.ofNullable(poolAllocationMode);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Input<PublicNetworkAccessType> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable PublicNetworkAccessType publicNetworkAccess) {
            this.publicNetworkAccess = Input.ofNullable(publicNetworkAccess);
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
        public BatchAccountArgs build() {
            return new BatchAccountArgs(accountName, autoStorage, encryption, identity, keyVaultReference, location, poolAllocationMode, publicNetworkAccess, resourceGroupName, tags);
        }
    }
}