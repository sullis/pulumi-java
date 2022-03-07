// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.storage.enums.AccessTier;
import io.pulumi.azurenative.storage.enums.Kind;
import io.pulumi.azurenative.storage.enums.LargeFileSharesState;
import io.pulumi.azurenative.storage.enums.MinimumTlsVersion;
import io.pulumi.azurenative.storage.inputs.AzureFilesIdentityBasedAuthenticationArgs;
import io.pulumi.azurenative.storage.inputs.CustomDomainArgs;
import io.pulumi.azurenative.storage.inputs.EncryptionArgs;
import io.pulumi.azurenative.storage.inputs.ExtendedLocationArgs;
import io.pulumi.azurenative.storage.inputs.IdentityArgs;
import io.pulumi.azurenative.storage.inputs.KeyPolicyArgs;
import io.pulumi.azurenative.storage.inputs.NetworkRuleSetArgs;
import io.pulumi.azurenative.storage.inputs.RoutingPreferenceArgs;
import io.pulumi.azurenative.storage.inputs.SasPolicyArgs;
import io.pulumi.azurenative.storage.inputs.SkuArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StorageAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageAccountArgs Empty = new StorageAccountArgs();

    /**
     * Required for storage accounts where kind = BlobStorage. The access tier used for billing.
     * 
     */
    @InputImport(name="accessTier")
      private final @Nullable Input<AccessTier> accessTier;

    public Input<AccessTier> getAccessTier() {
        return this.accessTier == null ? Input.empty() : this.accessTier;
    }

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @InputImport(name="accountName")
      private final @Nullable Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName == null ? Input.empty() : this.accountName;
    }

    /**
     * Allow or disallow public access to all blobs or containers in the storage account. The default interpretation is true for this property.
     * 
     */
    @InputImport(name="allowBlobPublicAccess")
      private final @Nullable Input<Boolean> allowBlobPublicAccess;

    public Input<Boolean> getAllowBlobPublicAccess() {
        return this.allowBlobPublicAccess == null ? Input.empty() : this.allowBlobPublicAccess;
    }

    /**
     * Indicates whether the storage account permits requests to be authorized with the account access key via Shared Key. If false, then all requests, including shared access signatures, must be authorized with Azure Active Directory (Azure AD). The default value is null, which is equivalent to true.
     * 
     */
    @InputImport(name="allowSharedKeyAccess")
      private final @Nullable Input<Boolean> allowSharedKeyAccess;

    public Input<Boolean> getAllowSharedKeyAccess() {
        return this.allowSharedKeyAccess == null ? Input.empty() : this.allowSharedKeyAccess;
    }

    /**
     * Provides the identity based authentication settings for Azure Files.
     * 
     */
    @InputImport(name="azureFilesIdentityBasedAuthentication")
      private final @Nullable Input<AzureFilesIdentityBasedAuthenticationArgs> azureFilesIdentityBasedAuthentication;

    public Input<AzureFilesIdentityBasedAuthenticationArgs> getAzureFilesIdentityBasedAuthentication() {
        return this.azureFilesIdentityBasedAuthentication == null ? Input.empty() : this.azureFilesIdentityBasedAuthentication;
    }

    /**
     * User domain assigned to the storage account. Name is the CNAME source. Only one custom domain is supported per storage account at this time. To clear the existing custom domain, use an empty string for the custom domain name property.
     * 
     */
    @InputImport(name="customDomain")
      private final @Nullable Input<CustomDomainArgs> customDomain;

    public Input<CustomDomainArgs> getCustomDomain() {
        return this.customDomain == null ? Input.empty() : this.customDomain;
    }

    /**
     * Allows https traffic only to storage service if sets to true. The default value is true since API version 2019-04-01.
     * 
     */
    @InputImport(name="enableHttpsTrafficOnly")
      private final @Nullable Input<Boolean> enableHttpsTrafficOnly;

    public Input<Boolean> getEnableHttpsTrafficOnly() {
        return this.enableHttpsTrafficOnly == null ? Input.empty() : this.enableHttpsTrafficOnly;
    }

    /**
     * NFS 3.0 protocol support enabled if set to true.
     * 
     */
    @InputImport(name="enableNfsV3")
      private final @Nullable Input<Boolean> enableNfsV3;

    public Input<Boolean> getEnableNfsV3() {
        return this.enableNfsV3 == null ? Input.empty() : this.enableNfsV3;
    }

    /**
     * Not applicable. Azure Storage encryption is enabled for all storage accounts and cannot be disabled.
     * 
     */
    @InputImport(name="encryption")
      private final @Nullable Input<EncryptionArgs> encryption;

    public Input<EncryptionArgs> getEncryption() {
        return this.encryption == null ? Input.empty() : this.encryption;
    }

    /**
     * Optional. Set the extended location of the resource. If not set, the storage account will be created in Azure main region. Otherwise it will be created in the specified extended location
     * 
     */
    @InputImport(name="extendedLocation")
      private final @Nullable Input<ExtendedLocationArgs> extendedLocation;

    public Input<ExtendedLocationArgs> getExtendedLocation() {
        return this.extendedLocation == null ? Input.empty() : this.extendedLocation;
    }

    /**
     * The identity of the resource.
     * 
     */
    @InputImport(name="identity")
      private final @Nullable Input<IdentityArgs> identity;

    public Input<IdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * Account HierarchicalNamespace enabled if sets to true.
     * 
     */
    @InputImport(name="isHnsEnabled")
      private final @Nullable Input<Boolean> isHnsEnabled;

    public Input<Boolean> getIsHnsEnabled() {
        return this.isHnsEnabled == null ? Input.empty() : this.isHnsEnabled;
    }

    /**
     * KeyPolicy assigned to the storage account.
     * 
     */
    @InputImport(name="keyPolicy")
      private final @Nullable Input<KeyPolicyArgs> keyPolicy;

    public Input<KeyPolicyArgs> getKeyPolicy() {
        return this.keyPolicy == null ? Input.empty() : this.keyPolicy;
    }

    /**
     * Required. Indicates the type of storage account.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<Either<String,Kind>> kind;

    public Input<Either<String,Kind>> getKind() {
        return this.kind;
    }

    /**
     * Allow large file shares if sets to Enabled. It cannot be disabled once it is enabled.
     * 
     */
    @InputImport(name="largeFileSharesState")
      private final @Nullable Input<Either<String,LargeFileSharesState>> largeFileSharesState;

    public Input<Either<String,LargeFileSharesState>> getLargeFileSharesState() {
        return this.largeFileSharesState == null ? Input.empty() : this.largeFileSharesState;
    }

    /**
     * Required. Gets or sets the location of the resource. This will be one of the supported and registered Azure Geo Regions (e.g. West US, East US, Southeast Asia, etc.). The geo region of a resource cannot be changed once it is created, but if an identical geo region is specified on update, the request will succeed.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Set the minimum TLS version to be permitted on requests to storage. The default interpretation is TLS 1.0 for this property.
     * 
     */
    @InputImport(name="minimumTlsVersion")
      private final @Nullable Input<Either<String,MinimumTlsVersion>> minimumTlsVersion;

    public Input<Either<String,MinimumTlsVersion>> getMinimumTlsVersion() {
        return this.minimumTlsVersion == null ? Input.empty() : this.minimumTlsVersion;
    }

    /**
     * Network rule set
     * 
     */
    @InputImport(name="networkRuleSet")
      private final @Nullable Input<NetworkRuleSetArgs> networkRuleSet;

    public Input<NetworkRuleSetArgs> getNetworkRuleSet() {
        return this.networkRuleSet == null ? Input.empty() : this.networkRuleSet;
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

    /**
     * Maintains information about the network routing choice opted by the user for data transfer
     * 
     */
    @InputImport(name="routingPreference")
      private final @Nullable Input<RoutingPreferenceArgs> routingPreference;

    public Input<RoutingPreferenceArgs> getRoutingPreference() {
        return this.routingPreference == null ? Input.empty() : this.routingPreference;
    }

    /**
     * SasPolicy assigned to the storage account.
     * 
     */
    @InputImport(name="sasPolicy")
      private final @Nullable Input<SasPolicyArgs> sasPolicy;

    public Input<SasPolicyArgs> getSasPolicy() {
        return this.sasPolicy == null ? Input.empty() : this.sasPolicy;
    }

    /**
     * Required. Gets or sets the SKU name.
     * 
     */
    @InputImport(name="sku", required=true)
      private final Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku;
    }

    /**
     * Gets or sets a list of key value pairs that describe the resource. These tags can be used for viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key with a length no greater than 128 characters and a value with a length no greater than 256 characters.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public StorageAccountArgs(
        @Nullable Input<AccessTier> accessTier,
        @Nullable Input<String> accountName,
        @Nullable Input<Boolean> allowBlobPublicAccess,
        @Nullable Input<Boolean> allowSharedKeyAccess,
        @Nullable Input<AzureFilesIdentityBasedAuthenticationArgs> azureFilesIdentityBasedAuthentication,
        @Nullable Input<CustomDomainArgs> customDomain,
        @Nullable Input<Boolean> enableHttpsTrafficOnly,
        @Nullable Input<Boolean> enableNfsV3,
        @Nullable Input<EncryptionArgs> encryption,
        @Nullable Input<ExtendedLocationArgs> extendedLocation,
        @Nullable Input<IdentityArgs> identity,
        @Nullable Input<Boolean> isHnsEnabled,
        @Nullable Input<KeyPolicyArgs> keyPolicy,
        Input<Either<String,Kind>> kind,
        @Nullable Input<Either<String,LargeFileSharesState>> largeFileSharesState,
        @Nullable Input<String> location,
        @Nullable Input<Either<String,MinimumTlsVersion>> minimumTlsVersion,
        @Nullable Input<NetworkRuleSetArgs> networkRuleSet,
        Input<String> resourceGroupName,
        @Nullable Input<RoutingPreferenceArgs> routingPreference,
        @Nullable Input<SasPolicyArgs> sasPolicy,
        Input<SkuArgs> sku,
        @Nullable Input<Map<String,String>> tags) {
        this.accessTier = accessTier;
        this.accountName = accountName;
        this.allowBlobPublicAccess = allowBlobPublicAccess;
        this.allowSharedKeyAccess = allowSharedKeyAccess;
        this.azureFilesIdentityBasedAuthentication = azureFilesIdentityBasedAuthentication;
        this.customDomain = customDomain;
        this.enableHttpsTrafficOnly = enableHttpsTrafficOnly;
        this.enableNfsV3 = enableNfsV3;
        this.encryption = encryption;
        this.extendedLocation = extendedLocation;
        this.identity = identity;
        this.isHnsEnabled = isHnsEnabled;
        this.keyPolicy = keyPolicy;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.largeFileSharesState = largeFileSharesState;
        this.location = location;
        this.minimumTlsVersion = minimumTlsVersion;
        this.networkRuleSet = networkRuleSet;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.routingPreference = routingPreference;
        this.sasPolicy = sasPolicy;
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.tags = tags;
    }

    private StorageAccountArgs() {
        this.accessTier = Input.empty();
        this.accountName = Input.empty();
        this.allowBlobPublicAccess = Input.empty();
        this.allowSharedKeyAccess = Input.empty();
        this.azureFilesIdentityBasedAuthentication = Input.empty();
        this.customDomain = Input.empty();
        this.enableHttpsTrafficOnly = Input.empty();
        this.enableNfsV3 = Input.empty();
        this.encryption = Input.empty();
        this.extendedLocation = Input.empty();
        this.identity = Input.empty();
        this.isHnsEnabled = Input.empty();
        this.keyPolicy = Input.empty();
        this.kind = Input.empty();
        this.largeFileSharesState = Input.empty();
        this.location = Input.empty();
        this.minimumTlsVersion = Input.empty();
        this.networkRuleSet = Input.empty();
        this.resourceGroupName = Input.empty();
        this.routingPreference = Input.empty();
        this.sasPolicy = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AccessTier> accessTier;
        private @Nullable Input<String> accountName;
        private @Nullable Input<Boolean> allowBlobPublicAccess;
        private @Nullable Input<Boolean> allowSharedKeyAccess;
        private @Nullable Input<AzureFilesIdentityBasedAuthenticationArgs> azureFilesIdentityBasedAuthentication;
        private @Nullable Input<CustomDomainArgs> customDomain;
        private @Nullable Input<Boolean> enableHttpsTrafficOnly;
        private @Nullable Input<Boolean> enableNfsV3;
        private @Nullable Input<EncryptionArgs> encryption;
        private @Nullable Input<ExtendedLocationArgs> extendedLocation;
        private @Nullable Input<IdentityArgs> identity;
        private @Nullable Input<Boolean> isHnsEnabled;
        private @Nullable Input<KeyPolicyArgs> keyPolicy;
        private Input<Either<String,Kind>> kind;
        private @Nullable Input<Either<String,LargeFileSharesState>> largeFileSharesState;
        private @Nullable Input<String> location;
        private @Nullable Input<Either<String,MinimumTlsVersion>> minimumTlsVersion;
        private @Nullable Input<NetworkRuleSetArgs> networkRuleSet;
        private Input<String> resourceGroupName;
        private @Nullable Input<RoutingPreferenceArgs> routingPreference;
        private @Nullable Input<SasPolicyArgs> sasPolicy;
        private Input<SkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessTier = defaults.accessTier;
    	      this.accountName = defaults.accountName;
    	      this.allowBlobPublicAccess = defaults.allowBlobPublicAccess;
    	      this.allowSharedKeyAccess = defaults.allowSharedKeyAccess;
    	      this.azureFilesIdentityBasedAuthentication = defaults.azureFilesIdentityBasedAuthentication;
    	      this.customDomain = defaults.customDomain;
    	      this.enableHttpsTrafficOnly = defaults.enableHttpsTrafficOnly;
    	      this.enableNfsV3 = defaults.enableNfsV3;
    	      this.encryption = defaults.encryption;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.identity = defaults.identity;
    	      this.isHnsEnabled = defaults.isHnsEnabled;
    	      this.keyPolicy = defaults.keyPolicy;
    	      this.kind = defaults.kind;
    	      this.largeFileSharesState = defaults.largeFileSharesState;
    	      this.location = defaults.location;
    	      this.minimumTlsVersion = defaults.minimumTlsVersion;
    	      this.networkRuleSet = defaults.networkRuleSet;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.routingPreference = defaults.routingPreference;
    	      this.sasPolicy = defaults.sasPolicy;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder setAccessTier(@Nullable Input<AccessTier> accessTier) {
            this.accessTier = accessTier;
            return this;
        }

        public Builder setAccessTier(@Nullable AccessTier accessTier) {
            this.accessTier = Input.ofNullable(accessTier);
            return this;
        }

        public Builder setAccountName(@Nullable Input<String> accountName) {
            this.accountName = accountName;
            return this;
        }

        public Builder setAccountName(@Nullable String accountName) {
            this.accountName = Input.ofNullable(accountName);
            return this;
        }

        public Builder setAllowBlobPublicAccess(@Nullable Input<Boolean> allowBlobPublicAccess) {
            this.allowBlobPublicAccess = allowBlobPublicAccess;
            return this;
        }

        public Builder setAllowBlobPublicAccess(@Nullable Boolean allowBlobPublicAccess) {
            this.allowBlobPublicAccess = Input.ofNullable(allowBlobPublicAccess);
            return this;
        }

        public Builder setAllowSharedKeyAccess(@Nullable Input<Boolean> allowSharedKeyAccess) {
            this.allowSharedKeyAccess = allowSharedKeyAccess;
            return this;
        }

        public Builder setAllowSharedKeyAccess(@Nullable Boolean allowSharedKeyAccess) {
            this.allowSharedKeyAccess = Input.ofNullable(allowSharedKeyAccess);
            return this;
        }

        public Builder setAzureFilesIdentityBasedAuthentication(@Nullable Input<AzureFilesIdentityBasedAuthenticationArgs> azureFilesIdentityBasedAuthentication) {
            this.azureFilesIdentityBasedAuthentication = azureFilesIdentityBasedAuthentication;
            return this;
        }

        public Builder setAzureFilesIdentityBasedAuthentication(@Nullable AzureFilesIdentityBasedAuthenticationArgs azureFilesIdentityBasedAuthentication) {
            this.azureFilesIdentityBasedAuthentication = Input.ofNullable(azureFilesIdentityBasedAuthentication);
            return this;
        }

        public Builder setCustomDomain(@Nullable Input<CustomDomainArgs> customDomain) {
            this.customDomain = customDomain;
            return this;
        }

        public Builder setCustomDomain(@Nullable CustomDomainArgs customDomain) {
            this.customDomain = Input.ofNullable(customDomain);
            return this;
        }

        public Builder setEnableHttpsTrafficOnly(@Nullable Input<Boolean> enableHttpsTrafficOnly) {
            this.enableHttpsTrafficOnly = enableHttpsTrafficOnly;
            return this;
        }

        public Builder setEnableHttpsTrafficOnly(@Nullable Boolean enableHttpsTrafficOnly) {
            this.enableHttpsTrafficOnly = Input.ofNullable(enableHttpsTrafficOnly);
            return this;
        }

        public Builder setEnableNfsV3(@Nullable Input<Boolean> enableNfsV3) {
            this.enableNfsV3 = enableNfsV3;
            return this;
        }

        public Builder setEnableNfsV3(@Nullable Boolean enableNfsV3) {
            this.enableNfsV3 = Input.ofNullable(enableNfsV3);
            return this;
        }

        public Builder setEncryption(@Nullable Input<EncryptionArgs> encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setEncryption(@Nullable EncryptionArgs encryption) {
            this.encryption = Input.ofNullable(encryption);
            return this;
        }

        public Builder setExtendedLocation(@Nullable Input<ExtendedLocationArgs> extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder setExtendedLocation(@Nullable ExtendedLocationArgs extendedLocation) {
            this.extendedLocation = Input.ofNullable(extendedLocation);
            return this;
        }

        public Builder setIdentity(@Nullable Input<IdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable IdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setIsHnsEnabled(@Nullable Input<Boolean> isHnsEnabled) {
            this.isHnsEnabled = isHnsEnabled;
            return this;
        }

        public Builder setIsHnsEnabled(@Nullable Boolean isHnsEnabled) {
            this.isHnsEnabled = Input.ofNullable(isHnsEnabled);
            return this;
        }

        public Builder setKeyPolicy(@Nullable Input<KeyPolicyArgs> keyPolicy) {
            this.keyPolicy = keyPolicy;
            return this;
        }

        public Builder setKeyPolicy(@Nullable KeyPolicyArgs keyPolicy) {
            this.keyPolicy = Input.ofNullable(keyPolicy);
            return this;
        }

        public Builder setKind(Input<Either<String,Kind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(Either<String,Kind> kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setLargeFileSharesState(@Nullable Input<Either<String,LargeFileSharesState>> largeFileSharesState) {
            this.largeFileSharesState = largeFileSharesState;
            return this;
        }

        public Builder setLargeFileSharesState(@Nullable Either<String,LargeFileSharesState> largeFileSharesState) {
            this.largeFileSharesState = Input.ofNullable(largeFileSharesState);
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

        public Builder setMinimumTlsVersion(@Nullable Input<Either<String,MinimumTlsVersion>> minimumTlsVersion) {
            this.minimumTlsVersion = minimumTlsVersion;
            return this;
        }

        public Builder setMinimumTlsVersion(@Nullable Either<String,MinimumTlsVersion> minimumTlsVersion) {
            this.minimumTlsVersion = Input.ofNullable(minimumTlsVersion);
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

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setRoutingPreference(@Nullable Input<RoutingPreferenceArgs> routingPreference) {
            this.routingPreference = routingPreference;
            return this;
        }

        public Builder setRoutingPreference(@Nullable RoutingPreferenceArgs routingPreference) {
            this.routingPreference = Input.ofNullable(routingPreference);
            return this;
        }

        public Builder setSasPolicy(@Nullable Input<SasPolicyArgs> sasPolicy) {
            this.sasPolicy = sasPolicy;
            return this;
        }

        public Builder setSasPolicy(@Nullable SasPolicyArgs sasPolicy) {
            this.sasPolicy = Input.ofNullable(sasPolicy);
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public StorageAccountArgs build() {
            return new StorageAccountArgs(accessTier, accountName, allowBlobPublicAccess, allowSharedKeyAccess, azureFilesIdentityBasedAuthentication, customDomain, enableHttpsTrafficOnly, enableNfsV3, encryption, extendedLocation, identity, isHnsEnabled, keyPolicy, kind, largeFileSharesState, location, minimumTlsVersion, networkRuleSet, resourceGroupName, routingPreference, sasPolicy, sku, tags);
        }
    }
}