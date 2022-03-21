// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.purview.outputs;

import io.pulumi.azurenative.purview.outputs.AccountPropertiesResponseEndpoints;
import io.pulumi.azurenative.purview.outputs.AccountPropertiesResponseManagedResources;
import io.pulumi.azurenative.purview.outputs.AccountPropertiesResponseSystemData;
import io.pulumi.azurenative.purview.outputs.AccountResponseSku;
import io.pulumi.azurenative.purview.outputs.CloudConnectorsResponse;
import io.pulumi.azurenative.purview.outputs.IdentityResponse;
import io.pulumi.azurenative.purview.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccountResult {
    /**
     * Cloud connectors.
     * External cloud identifier used as part of scanning configuration.
     * 
     */
    private final @Nullable CloudConnectorsResponse cloudConnectors;
    /**
     * Gets the time at which the entity was created.
     * 
     */
    private final String createdAt;
    /**
     * Gets the creator of the entity.
     * 
     */
    private final String createdBy;
    /**
     * Gets the creators of the entity's object id.
     * 
     */
    private final String createdByObjectId;
    /**
     * The URIs that are the public endpoints of the account.
     * 
     */
    private final AccountPropertiesResponseEndpoints endpoints;
    /**
     * Gets or sets the friendly name.
     * 
     */
    private final String friendlyName;
    /**
     * Gets or sets the identifier.
     * 
     */
    private final String id;
    /**
     * Identity Info on the tracked resource
     * 
     */
    private final @Nullable IdentityResponse identity;
    /**
     * Gets or sets the location.
     * 
     */
    private final @Nullable String location;
    /**
     * Gets or sets the managed resource group name
     * 
     */
    private final @Nullable String managedResourceGroupName;
    /**
     * Gets the resource identifiers of the managed resources.
     * 
     */
    private final AccountPropertiesResponseManagedResources managedResources;
    /**
     * Gets or sets the name.
     * 
     */
    private final String name;
    /**
     * Gets the private endpoint connections information.
     * 
     */
    private final List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * Gets or sets the state of the provisioning.
     * 
     */
    private final String provisioningState;
    /**
     * Gets or sets the public network access.
     * 
     */
    private final @Nullable String publicNetworkAccess;
    /**
     * Gets or sets the Sku.
     * 
     */
    private final AccountResponseSku sku;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final AccountPropertiesResponseSystemData systemData;
    /**
     * Tags on the azure resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Gets or sets the type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetAccountResult(
        @CustomType.Parameter("cloudConnectors") @Nullable CloudConnectorsResponse cloudConnectors,
        @CustomType.Parameter("createdAt") String createdAt,
        @CustomType.Parameter("createdBy") String createdBy,
        @CustomType.Parameter("createdByObjectId") String createdByObjectId,
        @CustomType.Parameter("endpoints") AccountPropertiesResponseEndpoints endpoints,
        @CustomType.Parameter("friendlyName") String friendlyName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable IdentityResponse identity,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("managedResourceGroupName") @Nullable String managedResourceGroupName,
        @CustomType.Parameter("managedResources") AccountPropertiesResponseManagedResources managedResources,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("privateEndpointConnections") List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publicNetworkAccess") @Nullable String publicNetworkAccess,
        @CustomType.Parameter("sku") AccountResponseSku sku,
        @CustomType.Parameter("systemData") AccountPropertiesResponseSystemData systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.cloudConnectors = cloudConnectors;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.createdByObjectId = createdByObjectId;
        this.endpoints = endpoints;
        this.friendlyName = friendlyName;
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.managedResourceGroupName = managedResourceGroupName;
        this.managedResources = managedResources;
        this.name = name;
        this.privateEndpointConnections = privateEndpointConnections;
        this.provisioningState = provisioningState;
        this.publicNetworkAccess = publicNetworkAccess;
        this.sku = sku;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Cloud connectors.
     * External cloud identifier used as part of scanning configuration.
     * 
    */
    public Optional<CloudConnectorsResponse> getCloudConnectors() {
        return Optional.ofNullable(this.cloudConnectors);
    }
    /**
     * Gets the time at which the entity was created.
     * 
    */
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the creator of the entity.
     * 
    */
    public String getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the creators of the entity's object id.
     * 
    */
    public String getCreatedByObjectId() {
        return this.createdByObjectId;
    }
    /**
     * The URIs that are the public endpoints of the account.
     * 
    */
    public AccountPropertiesResponseEndpoints getEndpoints() {
        return this.endpoints;
    }
    /**
     * Gets or sets the friendly name.
     * 
    */
    public String getFriendlyName() {
        return this.friendlyName;
    }
    /**
     * Gets or sets the identifier.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Identity Info on the tracked resource
     * 
    */
    public Optional<IdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * Gets or sets the location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Gets or sets the managed resource group name
     * 
    */
    public Optional<String> getManagedResourceGroupName() {
        return Optional.ofNullable(this.managedResourceGroupName);
    }
    /**
     * Gets the resource identifiers of the managed resources.
     * 
    */
    public AccountPropertiesResponseManagedResources getManagedResources() {
        return this.managedResources;
    }
    /**
     * Gets or sets the name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Gets the private endpoint connections information.
     * 
    */
    public List<PrivateEndpointConnectionResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Gets or sets the state of the provisioning.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Gets or sets the public network access.
     * 
    */
    public Optional<String> getPublicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }
    /**
     * Gets or sets the Sku.
     * 
    */
    public AccountResponseSku getSku() {
        return this.sku;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
    */
    public AccountPropertiesResponseSystemData getSystemData() {
        return this.systemData;
    }
    /**
     * Tags on the azure resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Gets or sets the type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CloudConnectorsResponse cloudConnectors;
        private String createdAt;
        private String createdBy;
        private String createdByObjectId;
        private AccountPropertiesResponseEndpoints endpoints;
        private String friendlyName;
        private String id;
        private @Nullable IdentityResponse identity;
        private @Nullable String location;
        private @Nullable String managedResourceGroupName;
        private AccountPropertiesResponseManagedResources managedResources;
        private String name;
        private List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private @Nullable String publicNetworkAccess;
        private AccountResponseSku sku;
        private AccountPropertiesResponseSystemData systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudConnectors = defaults.cloudConnectors;
    	      this.createdAt = defaults.createdAt;
    	      this.createdBy = defaults.createdBy;
    	      this.createdByObjectId = defaults.createdByObjectId;
    	      this.endpoints = defaults.endpoints;
    	      this.friendlyName = defaults.friendlyName;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.managedResourceGroupName = defaults.managedResourceGroupName;
    	      this.managedResources = defaults.managedResources;
    	      this.name = defaults.name;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.sku = defaults.sku;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder cloudConnectors(@Nullable CloudConnectorsResponse cloudConnectors) {
            this.cloudConnectors = cloudConnectors;
            return this;
        }
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        public Builder createdBy(String createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
            return this;
        }
        public Builder createdByObjectId(String createdByObjectId) {
            this.createdByObjectId = Objects.requireNonNull(createdByObjectId);
            return this;
        }
        public Builder endpoints(AccountPropertiesResponseEndpoints endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }
        public Builder friendlyName(String friendlyName) {
            this.friendlyName = Objects.requireNonNull(friendlyName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable IdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder managedResourceGroupName(@Nullable String managedResourceGroupName) {
            this.managedResourceGroupName = managedResourceGroupName;
            return this;
        }
        public Builder managedResources(AccountPropertiesResponseManagedResources managedResources) {
            this.managedResources = Objects.requireNonNull(managedResources);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder privateEndpointConnections(List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }
        public Builder privateEndpointConnections(PrivateEndpointConnectionResponse... privateEndpointConnections) {
            return privateEndpointConnections(List.of(privateEndpointConnections));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder publicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Builder sku(AccountResponseSku sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder systemData(AccountPropertiesResponseSystemData systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetAccountResult build() {
            return new GetAccountResult(cloudConnectors, createdAt, createdBy, createdByObjectId, endpoints, friendlyName, id, identity, location, managedResourceGroupName, managedResources, name, privateEndpointConnections, provisioningState, publicNetworkAccess, sku, systemData, tags, type);
        }
    }
}
