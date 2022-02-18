// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.documentdb.enums.ConnectorOffer;
import io.pulumi.azurenative.documentdb.enums.DatabaseAccountKind;
import io.pulumi.azurenative.documentdb.enums.DatabaseAccountOfferType;
import io.pulumi.azurenative.documentdb.enums.NetworkAclBypass;
import io.pulumi.azurenative.documentdb.enums.PublicNetworkAccess;
import io.pulumi.azurenative.documentdb.inputs.ApiPropertiesArgs;
import io.pulumi.azurenative.documentdb.inputs.CapabilityArgs;
import io.pulumi.azurenative.documentdb.inputs.ConsistencyPolicyArgs;
import io.pulumi.azurenative.documentdb.inputs.ContinuousModeBackupPolicyArgs;
import io.pulumi.azurenative.documentdb.inputs.CorsPolicyArgs;
import io.pulumi.azurenative.documentdb.inputs.IpAddressOrRangeArgs;
import io.pulumi.azurenative.documentdb.inputs.LocationArgs;
import io.pulumi.azurenative.documentdb.inputs.ManagedServiceIdentityArgs;
import io.pulumi.azurenative.documentdb.inputs.PeriodicModeBackupPolicyArgs;
import io.pulumi.azurenative.documentdb.inputs.VirtualNetworkRuleArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseAccountArgs Empty = new DatabaseAccountArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @InputImport(name="accountName")
    private final @Nullable Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName == null ? Input.empty() : this.accountName;
    }

    /**
     * API specific properties. Currently, supported only for MongoDB API.
     * 
     */
    @InputImport(name="apiProperties")
    private final @Nullable Input<ApiPropertiesArgs> apiProperties;

    public Input<ApiPropertiesArgs> getApiProperties() {
        return this.apiProperties == null ? Input.empty() : this.apiProperties;
    }

    /**
     * The object representing the policy for taking backups on an account.
     * 
     */
    @InputImport(name="backupPolicy")
    private final @Nullable Input<Either<ContinuousModeBackupPolicyArgs,PeriodicModeBackupPolicyArgs>> backupPolicy;

    public Input<Either<ContinuousModeBackupPolicyArgs,PeriodicModeBackupPolicyArgs>> getBackupPolicy() {
        return this.backupPolicy == null ? Input.empty() : this.backupPolicy;
    }

    /**
     * List of Cosmos DB capabilities for the account
     * 
     */
    @InputImport(name="capabilities")
    private final @Nullable Input<List<CapabilityArgs>> capabilities;

    public Input<List<CapabilityArgs>> getCapabilities() {
        return this.capabilities == null ? Input.empty() : this.capabilities;
    }

    /**
     * The cassandra connector offer type for the Cosmos DB database C* account.
     * 
     */
    @InputImport(name="connectorOffer")
    private final @Nullable Input<Either<String,ConnectorOffer>> connectorOffer;

    public Input<Either<String,ConnectorOffer>> getConnectorOffer() {
        return this.connectorOffer == null ? Input.empty() : this.connectorOffer;
    }

    /**
     * The consistency policy for the Cosmos DB account.
     * 
     */
    @InputImport(name="consistencyPolicy")
    private final @Nullable Input<ConsistencyPolicyArgs> consistencyPolicy;

    public Input<ConsistencyPolicyArgs> getConsistencyPolicy() {
        return this.consistencyPolicy == null ? Input.empty() : this.consistencyPolicy;
    }

    /**
     * The CORS policy for the Cosmos DB database account.
     * 
     */
    @InputImport(name="cors")
    private final @Nullable Input<List<CorsPolicyArgs>> cors;

    public Input<List<CorsPolicyArgs>> getCors() {
        return this.cors == null ? Input.empty() : this.cors;
    }

    /**
     * The offer type for the database
     * 
     */
    @InputImport(name="databaseAccountOfferType", required=true)
    private final Input<DatabaseAccountOfferType> databaseAccountOfferType;

    public Input<DatabaseAccountOfferType> getDatabaseAccountOfferType() {
        return this.databaseAccountOfferType;
    }

    /**
     * The default identity for accessing key vault used in features like customer managed keys. The default identity needs to be explicitly set by the users. It can be "FirstPartyIdentity", "SystemAssignedIdentity" and more.
     * 
     */
    @InputImport(name="defaultIdentity")
    private final @Nullable Input<String> defaultIdentity;

    public Input<String> getDefaultIdentity() {
        return this.defaultIdentity == null ? Input.empty() : this.defaultIdentity;
    }

    /**
     * Disable write operations on metadata resources (databases, containers, throughput) via account keys
     * 
     */
    @InputImport(name="disableKeyBasedMetadataWriteAccess")
    private final @Nullable Input<Boolean> disableKeyBasedMetadataWriteAccess;

    public Input<Boolean> getDisableKeyBasedMetadataWriteAccess() {
        return this.disableKeyBasedMetadataWriteAccess == null ? Input.empty() : this.disableKeyBasedMetadataWriteAccess;
    }

    /**
     * Flag to indicate whether to enable storage analytics.
     * 
     */
    @InputImport(name="enableAnalyticalStorage")
    private final @Nullable Input<Boolean> enableAnalyticalStorage;

    public Input<Boolean> getEnableAnalyticalStorage() {
        return this.enableAnalyticalStorage == null ? Input.empty() : this.enableAnalyticalStorage;
    }

    /**
     * Enables automatic failover of the write region in the rare event that the region is unavailable due to an outage. Automatic failover will result in a new write region for the account and is chosen based on the failover priorities configured for the account.
     * 
     */
    @InputImport(name="enableAutomaticFailover")
    private final @Nullable Input<Boolean> enableAutomaticFailover;

    public Input<Boolean> getEnableAutomaticFailover() {
        return this.enableAutomaticFailover == null ? Input.empty() : this.enableAutomaticFailover;
    }

    /**
     * Enables the cassandra connector on the Cosmos DB C* account
     * 
     */
    @InputImport(name="enableCassandraConnector")
    private final @Nullable Input<Boolean> enableCassandraConnector;

    public Input<Boolean> getEnableCassandraConnector() {
        return this.enableCassandraConnector == null ? Input.empty() : this.enableCassandraConnector;
    }

    /**
     * Flag to indicate whether Free Tier is enabled.
     * 
     */
    @InputImport(name="enableFreeTier")
    private final @Nullable Input<Boolean> enableFreeTier;

    public Input<Boolean> getEnableFreeTier() {
        return this.enableFreeTier == null ? Input.empty() : this.enableFreeTier;
    }

    /**
     * Enables the account to write in multiple locations
     * 
     */
    @InputImport(name="enableMultipleWriteLocations")
    private final @Nullable Input<Boolean> enableMultipleWriteLocations;

    public Input<Boolean> getEnableMultipleWriteLocations() {
        return this.enableMultipleWriteLocations == null ? Input.empty() : this.enableMultipleWriteLocations;
    }

    /**
     * Identity for the resource.
     * 
     */
    @InputImport(name="identity")
    private final @Nullable Input<ManagedServiceIdentityArgs> identity;

    public Input<ManagedServiceIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * List of IpRules.
     * 
     */
    @InputImport(name="ipRules")
    private final @Nullable Input<List<IpAddressOrRangeArgs>> ipRules;

    public Input<List<IpAddressOrRangeArgs>> getIpRules() {
        return this.ipRules == null ? Input.empty() : this.ipRules;
    }

    /**
     * Flag to indicate whether to enable/disable Virtual Network ACL rules.
     * 
     */
    @InputImport(name="isVirtualNetworkFilterEnabled")
    private final @Nullable Input<Boolean> isVirtualNetworkFilterEnabled;

    public Input<Boolean> getIsVirtualNetworkFilterEnabled() {
        return this.isVirtualNetworkFilterEnabled == null ? Input.empty() : this.isVirtualNetworkFilterEnabled;
    }

    /**
     * The URI of the key vault
     * 
     */
    @InputImport(name="keyVaultKeyUri")
    private final @Nullable Input<String> keyVaultKeyUri;

    public Input<String> getKeyVaultKeyUri() {
        return this.keyVaultKeyUri == null ? Input.empty() : this.keyVaultKeyUri;
    }

    /**
     * Indicates the type of database account. This can only be set at database account creation.
     * 
     */
    @InputImport(name="kind")
    private final @Nullable Input<Either<String,DatabaseAccountKind>> kind;

    public Input<Either<String,DatabaseAccountKind>> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * The location of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * An array that contains the georeplication locations enabled for the Cosmos DB account.
     * 
     */
    @InputImport(name="locations", required=true)
    private final Input<List<LocationArgs>> locations;

    public Input<List<LocationArgs>> getLocations() {
        return this.locations;
    }

    /**
     * Indicates what services are allowed to bypass firewall checks.
     * 
     */
    @InputImport(name="networkAclBypass")
    private final @Nullable Input<NetworkAclBypass> networkAclBypass;

    public Input<NetworkAclBypass> getNetworkAclBypass() {
        return this.networkAclBypass == null ? Input.empty() : this.networkAclBypass;
    }

    /**
     * An array that contains the Resource Ids for Network Acl Bypass for the Cosmos DB account.
     * 
     */
    @InputImport(name="networkAclBypassResourceIds")
    private final @Nullable Input<List<String>> networkAclBypassResourceIds;

    public Input<List<String>> getNetworkAclBypassResourceIds() {
        return this.networkAclBypassResourceIds == null ? Input.empty() : this.networkAclBypassResourceIds;
    }

    /**
     * Whether requests from Public Network are allowed
     * 
     */
    @InputImport(name="publicNetworkAccess")
    private final @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess;

    public Input<Either<String,PublicNetworkAccess>> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Input.empty() : this.publicNetworkAccess;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with "defaultExperience": "Cassandra". Current "defaultExperience" values also include "Table", "Graph", "DocumentDB", and "MongoDB".
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * List of Virtual Network ACL rules configured for the Cosmos DB account.
     * 
     */
    @InputImport(name="virtualNetworkRules")
    private final @Nullable Input<List<VirtualNetworkRuleArgs>> virtualNetworkRules;

    public Input<List<VirtualNetworkRuleArgs>> getVirtualNetworkRules() {
        return this.virtualNetworkRules == null ? Input.empty() : this.virtualNetworkRules;
    }

    public DatabaseAccountArgs(
        @Nullable Input<String> accountName,
        @Nullable Input<ApiPropertiesArgs> apiProperties,
        @Nullable Input<Either<ContinuousModeBackupPolicyArgs,PeriodicModeBackupPolicyArgs>> backupPolicy,
        @Nullable Input<List<CapabilityArgs>> capabilities,
        @Nullable Input<Either<String,ConnectorOffer>> connectorOffer,
        @Nullable Input<ConsistencyPolicyArgs> consistencyPolicy,
        @Nullable Input<List<CorsPolicyArgs>> cors,
        Input<DatabaseAccountOfferType> databaseAccountOfferType,
        @Nullable Input<String> defaultIdentity,
        @Nullable Input<Boolean> disableKeyBasedMetadataWriteAccess,
        @Nullable Input<Boolean> enableAnalyticalStorage,
        @Nullable Input<Boolean> enableAutomaticFailover,
        @Nullable Input<Boolean> enableCassandraConnector,
        @Nullable Input<Boolean> enableFreeTier,
        @Nullable Input<Boolean> enableMultipleWriteLocations,
        @Nullable Input<ManagedServiceIdentityArgs> identity,
        @Nullable Input<List<IpAddressOrRangeArgs>> ipRules,
        @Nullable Input<Boolean> isVirtualNetworkFilterEnabled,
        @Nullable Input<String> keyVaultKeyUri,
        @Nullable Input<Either<String,DatabaseAccountKind>> kind,
        @Nullable Input<String> location,
        Input<List<LocationArgs>> locations,
        @Nullable Input<NetworkAclBypass> networkAclBypass,
        @Nullable Input<List<String>> networkAclBypassResourceIds,
        @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<List<VirtualNetworkRuleArgs>> virtualNetworkRules) {
        this.accountName = accountName;
        this.apiProperties = apiProperties;
        this.backupPolicy = backupPolicy;
        this.capabilities = capabilities;
        this.connectorOffer = connectorOffer;
        this.consistencyPolicy = consistencyPolicy;
        this.cors = cors;
        this.databaseAccountOfferType = Objects.requireNonNull(databaseAccountOfferType, "expected parameter 'databaseAccountOfferType' to be non-null");
        this.defaultIdentity = defaultIdentity;
        this.disableKeyBasedMetadataWriteAccess = disableKeyBasedMetadataWriteAccess;
        this.enableAnalyticalStorage = enableAnalyticalStorage;
        this.enableAutomaticFailover = enableAutomaticFailover;
        this.enableCassandraConnector = enableCassandraConnector;
        this.enableFreeTier = enableFreeTier;
        this.enableMultipleWriteLocations = enableMultipleWriteLocations;
        this.identity = identity;
        this.ipRules = ipRules;
        this.isVirtualNetworkFilterEnabled = isVirtualNetworkFilterEnabled;
        this.keyVaultKeyUri = keyVaultKeyUri;
        this.kind = kind == null ? Input.ofLeft("GlobalDocumentDB") : kind;
        this.location = location;
        this.locations = Objects.requireNonNull(locations, "expected parameter 'locations' to be non-null");
        this.networkAclBypass = networkAclBypass;
        this.networkAclBypassResourceIds = networkAclBypassResourceIds;
        this.publicNetworkAccess = publicNetworkAccess;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.virtualNetworkRules = virtualNetworkRules;
    }

    private DatabaseAccountArgs() {
        this.accountName = Input.empty();
        this.apiProperties = Input.empty();
        this.backupPolicy = Input.empty();
        this.capabilities = Input.empty();
        this.connectorOffer = Input.empty();
        this.consistencyPolicy = Input.empty();
        this.cors = Input.empty();
        this.databaseAccountOfferType = Input.empty();
        this.defaultIdentity = Input.empty();
        this.disableKeyBasedMetadataWriteAccess = Input.empty();
        this.enableAnalyticalStorage = Input.empty();
        this.enableAutomaticFailover = Input.empty();
        this.enableCassandraConnector = Input.empty();
        this.enableFreeTier = Input.empty();
        this.enableMultipleWriteLocations = Input.empty();
        this.identity = Input.empty();
        this.ipRules = Input.empty();
        this.isVirtualNetworkFilterEnabled = Input.empty();
        this.keyVaultKeyUri = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.locations = Input.empty();
        this.networkAclBypass = Input.empty();
        this.networkAclBypassResourceIds = Input.empty();
        this.publicNetworkAccess = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.virtualNetworkRules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accountName;
        private @Nullable Input<ApiPropertiesArgs> apiProperties;
        private @Nullable Input<Either<ContinuousModeBackupPolicyArgs,PeriodicModeBackupPolicyArgs>> backupPolicy;
        private @Nullable Input<List<CapabilityArgs>> capabilities;
        private @Nullable Input<Either<String,ConnectorOffer>> connectorOffer;
        private @Nullable Input<ConsistencyPolicyArgs> consistencyPolicy;
        private @Nullable Input<List<CorsPolicyArgs>> cors;
        private Input<DatabaseAccountOfferType> databaseAccountOfferType;
        private @Nullable Input<String> defaultIdentity;
        private @Nullable Input<Boolean> disableKeyBasedMetadataWriteAccess;
        private @Nullable Input<Boolean> enableAnalyticalStorage;
        private @Nullable Input<Boolean> enableAutomaticFailover;
        private @Nullable Input<Boolean> enableCassandraConnector;
        private @Nullable Input<Boolean> enableFreeTier;
        private @Nullable Input<Boolean> enableMultipleWriteLocations;
        private @Nullable Input<ManagedServiceIdentityArgs> identity;
        private @Nullable Input<List<IpAddressOrRangeArgs>> ipRules;
        private @Nullable Input<Boolean> isVirtualNetworkFilterEnabled;
        private @Nullable Input<String> keyVaultKeyUri;
        private @Nullable Input<Either<String,DatabaseAccountKind>> kind;
        private @Nullable Input<String> location;
        private Input<List<LocationArgs>> locations;
        private @Nullable Input<NetworkAclBypass> networkAclBypass;
        private @Nullable Input<List<String>> networkAclBypassResourceIds;
        private @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<List<VirtualNetworkRuleArgs>> virtualNetworkRules;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.apiProperties = defaults.apiProperties;
    	      this.backupPolicy = defaults.backupPolicy;
    	      this.capabilities = defaults.capabilities;
    	      this.connectorOffer = defaults.connectorOffer;
    	      this.consistencyPolicy = defaults.consistencyPolicy;
    	      this.cors = defaults.cors;
    	      this.databaseAccountOfferType = defaults.databaseAccountOfferType;
    	      this.defaultIdentity = defaults.defaultIdentity;
    	      this.disableKeyBasedMetadataWriteAccess = defaults.disableKeyBasedMetadataWriteAccess;
    	      this.enableAnalyticalStorage = defaults.enableAnalyticalStorage;
    	      this.enableAutomaticFailover = defaults.enableAutomaticFailover;
    	      this.enableCassandraConnector = defaults.enableCassandraConnector;
    	      this.enableFreeTier = defaults.enableFreeTier;
    	      this.enableMultipleWriteLocations = defaults.enableMultipleWriteLocations;
    	      this.identity = defaults.identity;
    	      this.ipRules = defaults.ipRules;
    	      this.isVirtualNetworkFilterEnabled = defaults.isVirtualNetworkFilterEnabled;
    	      this.keyVaultKeyUri = defaults.keyVaultKeyUri;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.locations = defaults.locations;
    	      this.networkAclBypass = defaults.networkAclBypass;
    	      this.networkAclBypassResourceIds = defaults.networkAclBypassResourceIds;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.virtualNetworkRules = defaults.virtualNetworkRules;
        }

        public Builder setAccountName(@Nullable Input<String> accountName) {
            this.accountName = accountName;
            return this;
        }

        public Builder setAccountName(@Nullable String accountName) {
            this.accountName = Input.ofNullable(accountName);
            return this;
        }

        public Builder setApiProperties(@Nullable Input<ApiPropertiesArgs> apiProperties) {
            this.apiProperties = apiProperties;
            return this;
        }

        public Builder setApiProperties(@Nullable ApiPropertiesArgs apiProperties) {
            this.apiProperties = Input.ofNullable(apiProperties);
            return this;
        }

        public Builder setBackupPolicy(@Nullable Input<Either<ContinuousModeBackupPolicyArgs,PeriodicModeBackupPolicyArgs>> backupPolicy) {
            this.backupPolicy = backupPolicy;
            return this;
        }

        public Builder setBackupPolicy(@Nullable Either<ContinuousModeBackupPolicyArgs,PeriodicModeBackupPolicyArgs> backupPolicy) {
            this.backupPolicy = Input.ofNullable(backupPolicy);
            return this;
        }

        public Builder setCapabilities(@Nullable Input<List<CapabilityArgs>> capabilities) {
            this.capabilities = capabilities;
            return this;
        }

        public Builder setCapabilities(@Nullable List<CapabilityArgs> capabilities) {
            this.capabilities = Input.ofNullable(capabilities);
            return this;
        }

        public Builder setConnectorOffer(@Nullable Input<Either<String,ConnectorOffer>> connectorOffer) {
            this.connectorOffer = connectorOffer;
            return this;
        }

        public Builder setConnectorOffer(@Nullable Either<String,ConnectorOffer> connectorOffer) {
            this.connectorOffer = Input.ofNullable(connectorOffer);
            return this;
        }

        public Builder setConsistencyPolicy(@Nullable Input<ConsistencyPolicyArgs> consistencyPolicy) {
            this.consistencyPolicy = consistencyPolicy;
            return this;
        }

        public Builder setConsistencyPolicy(@Nullable ConsistencyPolicyArgs consistencyPolicy) {
            this.consistencyPolicy = Input.ofNullable(consistencyPolicy);
            return this;
        }

        public Builder setCors(@Nullable Input<List<CorsPolicyArgs>> cors) {
            this.cors = cors;
            return this;
        }

        public Builder setCors(@Nullable List<CorsPolicyArgs> cors) {
            this.cors = Input.ofNullable(cors);
            return this;
        }

        public Builder setDatabaseAccountOfferType(Input<DatabaseAccountOfferType> databaseAccountOfferType) {
            this.databaseAccountOfferType = Objects.requireNonNull(databaseAccountOfferType);
            return this;
        }

        public Builder setDatabaseAccountOfferType(DatabaseAccountOfferType databaseAccountOfferType) {
            this.databaseAccountOfferType = Input.of(Objects.requireNonNull(databaseAccountOfferType));
            return this;
        }

        public Builder setDefaultIdentity(@Nullable Input<String> defaultIdentity) {
            this.defaultIdentity = defaultIdentity;
            return this;
        }

        public Builder setDefaultIdentity(@Nullable String defaultIdentity) {
            this.defaultIdentity = Input.ofNullable(defaultIdentity);
            return this;
        }

        public Builder setDisableKeyBasedMetadataWriteAccess(@Nullable Input<Boolean> disableKeyBasedMetadataWriteAccess) {
            this.disableKeyBasedMetadataWriteAccess = disableKeyBasedMetadataWriteAccess;
            return this;
        }

        public Builder setDisableKeyBasedMetadataWriteAccess(@Nullable Boolean disableKeyBasedMetadataWriteAccess) {
            this.disableKeyBasedMetadataWriteAccess = Input.ofNullable(disableKeyBasedMetadataWriteAccess);
            return this;
        }

        public Builder setEnableAnalyticalStorage(@Nullable Input<Boolean> enableAnalyticalStorage) {
            this.enableAnalyticalStorage = enableAnalyticalStorage;
            return this;
        }

        public Builder setEnableAnalyticalStorage(@Nullable Boolean enableAnalyticalStorage) {
            this.enableAnalyticalStorage = Input.ofNullable(enableAnalyticalStorage);
            return this;
        }

        public Builder setEnableAutomaticFailover(@Nullable Input<Boolean> enableAutomaticFailover) {
            this.enableAutomaticFailover = enableAutomaticFailover;
            return this;
        }

        public Builder setEnableAutomaticFailover(@Nullable Boolean enableAutomaticFailover) {
            this.enableAutomaticFailover = Input.ofNullable(enableAutomaticFailover);
            return this;
        }

        public Builder setEnableCassandraConnector(@Nullable Input<Boolean> enableCassandraConnector) {
            this.enableCassandraConnector = enableCassandraConnector;
            return this;
        }

        public Builder setEnableCassandraConnector(@Nullable Boolean enableCassandraConnector) {
            this.enableCassandraConnector = Input.ofNullable(enableCassandraConnector);
            return this;
        }

        public Builder setEnableFreeTier(@Nullable Input<Boolean> enableFreeTier) {
            this.enableFreeTier = enableFreeTier;
            return this;
        }

        public Builder setEnableFreeTier(@Nullable Boolean enableFreeTier) {
            this.enableFreeTier = Input.ofNullable(enableFreeTier);
            return this;
        }

        public Builder setEnableMultipleWriteLocations(@Nullable Input<Boolean> enableMultipleWriteLocations) {
            this.enableMultipleWriteLocations = enableMultipleWriteLocations;
            return this;
        }

        public Builder setEnableMultipleWriteLocations(@Nullable Boolean enableMultipleWriteLocations) {
            this.enableMultipleWriteLocations = Input.ofNullable(enableMultipleWriteLocations);
            return this;
        }

        public Builder setIdentity(@Nullable Input<ManagedServiceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable ManagedServiceIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setIpRules(@Nullable Input<List<IpAddressOrRangeArgs>> ipRules) {
            this.ipRules = ipRules;
            return this;
        }

        public Builder setIpRules(@Nullable List<IpAddressOrRangeArgs> ipRules) {
            this.ipRules = Input.ofNullable(ipRules);
            return this;
        }

        public Builder setIsVirtualNetworkFilterEnabled(@Nullable Input<Boolean> isVirtualNetworkFilterEnabled) {
            this.isVirtualNetworkFilterEnabled = isVirtualNetworkFilterEnabled;
            return this;
        }

        public Builder setIsVirtualNetworkFilterEnabled(@Nullable Boolean isVirtualNetworkFilterEnabled) {
            this.isVirtualNetworkFilterEnabled = Input.ofNullable(isVirtualNetworkFilterEnabled);
            return this;
        }

        public Builder setKeyVaultKeyUri(@Nullable Input<String> keyVaultKeyUri) {
            this.keyVaultKeyUri = keyVaultKeyUri;
            return this;
        }

        public Builder setKeyVaultKeyUri(@Nullable String keyVaultKeyUri) {
            this.keyVaultKeyUri = Input.ofNullable(keyVaultKeyUri);
            return this;
        }

        public Builder setKind(@Nullable Input<Either<String,DatabaseAccountKind>> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable Either<String,DatabaseAccountKind> kind) {
            this.kind = Input.ofNullable(kind);
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

        public Builder setLocations(Input<List<LocationArgs>> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }

        public Builder setLocations(List<LocationArgs> locations) {
            this.locations = Input.of(Objects.requireNonNull(locations));
            return this;
        }

        public Builder setNetworkAclBypass(@Nullable Input<NetworkAclBypass> networkAclBypass) {
            this.networkAclBypass = networkAclBypass;
            return this;
        }

        public Builder setNetworkAclBypass(@Nullable NetworkAclBypass networkAclBypass) {
            this.networkAclBypass = Input.ofNullable(networkAclBypass);
            return this;
        }

        public Builder setNetworkAclBypassResourceIds(@Nullable Input<List<String>> networkAclBypassResourceIds) {
            this.networkAclBypassResourceIds = networkAclBypassResourceIds;
            return this;
        }

        public Builder setNetworkAclBypassResourceIds(@Nullable List<String> networkAclBypassResourceIds) {
            this.networkAclBypassResourceIds = Input.ofNullable(networkAclBypassResourceIds);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Either<String,PublicNetworkAccess> publicNetworkAccess) {
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

        public Builder setVirtualNetworkRules(@Nullable Input<List<VirtualNetworkRuleArgs>> virtualNetworkRules) {
            this.virtualNetworkRules = virtualNetworkRules;
            return this;
        }

        public Builder setVirtualNetworkRules(@Nullable List<VirtualNetworkRuleArgs> virtualNetworkRules) {
            this.virtualNetworkRules = Input.ofNullable(virtualNetworkRules);
            return this;
        }

        public DatabaseAccountArgs build() {
            return new DatabaseAccountArgs(accountName, apiProperties, backupPolicy, capabilities, connectorOffer, consistencyPolicy, cors, databaseAccountOfferType, defaultIdentity, disableKeyBasedMetadataWriteAccess, enableAnalyticalStorage, enableAutomaticFailover, enableCassandraConnector, enableFreeTier, enableMultipleWriteLocations, identity, ipRules, isVirtualNetworkFilterEnabled, keyVaultKeyUri, kind, location, locations, networkAclBypass, networkAclBypassResourceIds, publicNetworkAccess, resourceGroupName, tags, virtualNetworkRules);
        }
    }
}
