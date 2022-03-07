// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.azurenative.synapse.outputs.DataLakeStorageAccountDetailsResponse;
import io.pulumi.azurenative.synapse.outputs.EncryptionDetailsResponse;
import io.pulumi.azurenative.synapse.outputs.ManagedIdentityResponse;
import io.pulumi.azurenative.synapse.outputs.ManagedVirtualNetworkSettingsResponse;
import io.pulumi.azurenative.synapse.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.synapse.outputs.PurviewConfigurationResponse;
import io.pulumi.azurenative.synapse.outputs.VirtualNetworkProfileResponse;
import io.pulumi.azurenative.synapse.outputs.WorkspaceRepositoryConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWorkspaceResult {
    /**
     * The ADLA resource ID.
     * 
     */
    private final String adlaResourceId;
    /**
     * Connectivity endpoints
     * 
     */
    private final @Nullable Map<String,String> connectivityEndpoints;
    /**
     * Workspace default data lake storage account details
     * 
     */
    private final @Nullable DataLakeStorageAccountDetailsResponse defaultDataLakeStorage;
    /**
     * The encryption details of the workspace
     * 
     */
    private final @Nullable EncryptionDetailsResponse encryption;
    /**
     * Workspace level configs and feature flags
     * 
     */
    private final Map<String,Object> extraProperties;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Identity of the workspace
     * 
     */
    private final @Nullable ManagedIdentityResponse identity;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * Workspace managed resource group. The resource group name uniquely identifies the resource group within the user subscriptionId. The resource group name must be no longer than 90 characters long, and must be alphanumeric characters (Char.IsLetterOrDigit()) and '-', '_', '(', ')' and'.'. Note that the name cannot end with '.'
     * 
     */
    private final @Nullable String managedResourceGroupName;
    /**
     * Setting this to 'default' will ensure that all compute for this workspace is in a virtual network managed on behalf of the user.
     * 
     */
    private final @Nullable String managedVirtualNetwork;
    /**
     * Managed Virtual Network Settings
     * 
     */
    private final @Nullable ManagedVirtualNetworkSettingsResponse managedVirtualNetworkSettings;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Private endpoint connections to the workspace
     * 
     */
    private final @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * Resource provisioning state
     * 
     */
    private final String provisioningState;
    /**
     * Enable or Disable public network access to workspace
     * 
     */
    private final @Nullable String publicNetworkAccess;
    /**
     * Purview Configuration
     * 
     */
    private final @Nullable PurviewConfigurationResponse purviewConfiguration;
    /**
     * Login for workspace SQL active directory administrator
     * 
     */
    private final @Nullable String sqlAdministratorLogin;
    /**
     * SQL administrator login password
     * 
     */
    private final @Nullable String sqlAdministratorLoginPassword;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;
    /**
     * Virtual Network profile
     * 
     */
    private final @Nullable VirtualNetworkProfileResponse virtualNetworkProfile;
    /**
     * Git integration settings
     * 
     */
    private final @Nullable WorkspaceRepositoryConfigurationResponse workspaceRepositoryConfiguration;
    /**
     * The workspace unique identifier
     * 
     */
    private final String workspaceUID;

    @OutputCustomType.Constructor({"adlaResourceId","connectivityEndpoints","defaultDataLakeStorage","encryption","extraProperties","id","identity","location","managedResourceGroupName","managedVirtualNetwork","managedVirtualNetworkSettings","name","privateEndpointConnections","provisioningState","publicNetworkAccess","purviewConfiguration","sqlAdministratorLogin","sqlAdministratorLoginPassword","tags","type","virtualNetworkProfile","workspaceRepositoryConfiguration","workspaceUID"})
    private GetWorkspaceResult(
        String adlaResourceId,
        @Nullable Map<String,String> connectivityEndpoints,
        @Nullable DataLakeStorageAccountDetailsResponse defaultDataLakeStorage,
        @Nullable EncryptionDetailsResponse encryption,
        Map<String,Object> extraProperties,
        String id,
        @Nullable ManagedIdentityResponse identity,
        String location,
        @Nullable String managedResourceGroupName,
        @Nullable String managedVirtualNetwork,
        @Nullable ManagedVirtualNetworkSettingsResponse managedVirtualNetworkSettings,
        String name,
        @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        String provisioningState,
        @Nullable String publicNetworkAccess,
        @Nullable PurviewConfigurationResponse purviewConfiguration,
        @Nullable String sqlAdministratorLogin,
        @Nullable String sqlAdministratorLoginPassword,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable VirtualNetworkProfileResponse virtualNetworkProfile,
        @Nullable WorkspaceRepositoryConfigurationResponse workspaceRepositoryConfiguration,
        String workspaceUID) {
        this.adlaResourceId = Objects.requireNonNull(adlaResourceId);
        this.connectivityEndpoints = connectivityEndpoints;
        this.defaultDataLakeStorage = defaultDataLakeStorage;
        this.encryption = encryption;
        this.extraProperties = Objects.requireNonNull(extraProperties);
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.location = Objects.requireNonNull(location);
        this.managedResourceGroupName = managedResourceGroupName;
        this.managedVirtualNetwork = managedVirtualNetwork;
        this.managedVirtualNetworkSettings = managedVirtualNetworkSettings;
        this.name = Objects.requireNonNull(name);
        this.privateEndpointConnections = privateEndpointConnections;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.publicNetworkAccess = publicNetworkAccess;
        this.purviewConfiguration = purviewConfiguration;
        this.sqlAdministratorLogin = sqlAdministratorLogin;
        this.sqlAdministratorLoginPassword = sqlAdministratorLoginPassword;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.virtualNetworkProfile = virtualNetworkProfile;
        this.workspaceRepositoryConfiguration = workspaceRepositoryConfiguration;
        this.workspaceUID = Objects.requireNonNull(workspaceUID);
    }

    /**
     * The ADLA resource ID.
     * 
    */
    public String getAdlaResourceId() {
        return this.adlaResourceId;
    }
    /**
     * Connectivity endpoints
     * 
    */
    public Map<String,String> getConnectivityEndpoints() {
        return this.connectivityEndpoints == null ? Map.of() : this.connectivityEndpoints;
    }
    /**
     * Workspace default data lake storage account details
     * 
    */
    public Optional<DataLakeStorageAccountDetailsResponse> getDefaultDataLakeStorage() {
        return Optional.ofNullable(this.defaultDataLakeStorage);
    }
    /**
     * The encryption details of the workspace
     * 
    */
    public Optional<EncryptionDetailsResponse> getEncryption() {
        return Optional.ofNullable(this.encryption);
    }
    /**
     * Workspace level configs and feature flags
     * 
    */
    public Map<String,Object> getExtraProperties() {
        return this.extraProperties;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Identity of the workspace
     * 
    */
    public Optional<ManagedIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Workspace managed resource group. The resource group name uniquely identifies the resource group within the user subscriptionId. The resource group name must be no longer than 90 characters long, and must be alphanumeric characters (Char.IsLetterOrDigit()) and '-', '_', '(', ')' and'.'. Note that the name cannot end with '.'
     * 
    */
    public Optional<String> getManagedResourceGroupName() {
        return Optional.ofNullable(this.managedResourceGroupName);
    }
    /**
     * Setting this to 'default' will ensure that all compute for this workspace is in a virtual network managed on behalf of the user.
     * 
    */
    public Optional<String> getManagedVirtualNetwork() {
        return Optional.ofNullable(this.managedVirtualNetwork);
    }
    /**
     * Managed Virtual Network Settings
     * 
    */
    public Optional<ManagedVirtualNetworkSettingsResponse> getManagedVirtualNetworkSettings() {
        return Optional.ofNullable(this.managedVirtualNetworkSettings);
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Private endpoint connections to the workspace
     * 
    */
    public List<PrivateEndpointConnectionResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections == null ? List.of() : this.privateEndpointConnections;
    }
    /**
     * Resource provisioning state
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Enable or Disable public network access to workspace
     * 
    */
    public Optional<String> getPublicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }
    /**
     * Purview Configuration
     * 
    */
    public Optional<PurviewConfigurationResponse> getPurviewConfiguration() {
        return Optional.ofNullable(this.purviewConfiguration);
    }
    /**
     * Login for workspace SQL active directory administrator
     * 
    */
    public Optional<String> getSqlAdministratorLogin() {
        return Optional.ofNullable(this.sqlAdministratorLogin);
    }
    /**
     * SQL administrator login password
     * 
    */
    public Optional<String> getSqlAdministratorLoginPassword() {
        return Optional.ofNullable(this.sqlAdministratorLoginPassword);
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Virtual Network profile
     * 
    */
    public Optional<VirtualNetworkProfileResponse> getVirtualNetworkProfile() {
        return Optional.ofNullable(this.virtualNetworkProfile);
    }
    /**
     * Git integration settings
     * 
    */
    public Optional<WorkspaceRepositoryConfigurationResponse> getWorkspaceRepositoryConfiguration() {
        return Optional.ofNullable(this.workspaceRepositoryConfiguration);
    }
    /**
     * The workspace unique identifier
     * 
    */
    public String getWorkspaceUID() {
        return this.workspaceUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkspaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String adlaResourceId;
        private @Nullable Map<String,String> connectivityEndpoints;
        private @Nullable DataLakeStorageAccountDetailsResponse defaultDataLakeStorage;
        private @Nullable EncryptionDetailsResponse encryption;
        private Map<String,Object> extraProperties;
        private String id;
        private @Nullable ManagedIdentityResponse identity;
        private String location;
        private @Nullable String managedResourceGroupName;
        private @Nullable String managedVirtualNetwork;
        private @Nullable ManagedVirtualNetworkSettingsResponse managedVirtualNetworkSettings;
        private String name;
        private @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private @Nullable String publicNetworkAccess;
        private @Nullable PurviewConfigurationResponse purviewConfiguration;
        private @Nullable String sqlAdministratorLogin;
        private @Nullable String sqlAdministratorLoginPassword;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable VirtualNetworkProfileResponse virtualNetworkProfile;
        private @Nullable WorkspaceRepositoryConfigurationResponse workspaceRepositoryConfiguration;
        private String workspaceUID;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkspaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adlaResourceId = defaults.adlaResourceId;
    	      this.connectivityEndpoints = defaults.connectivityEndpoints;
    	      this.defaultDataLakeStorage = defaults.defaultDataLakeStorage;
    	      this.encryption = defaults.encryption;
    	      this.extraProperties = defaults.extraProperties;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.managedResourceGroupName = defaults.managedResourceGroupName;
    	      this.managedVirtualNetwork = defaults.managedVirtualNetwork;
    	      this.managedVirtualNetworkSettings = defaults.managedVirtualNetworkSettings;
    	      this.name = defaults.name;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.purviewConfiguration = defaults.purviewConfiguration;
    	      this.sqlAdministratorLogin = defaults.sqlAdministratorLogin;
    	      this.sqlAdministratorLoginPassword = defaults.sqlAdministratorLoginPassword;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.virtualNetworkProfile = defaults.virtualNetworkProfile;
    	      this.workspaceRepositoryConfiguration = defaults.workspaceRepositoryConfiguration;
    	      this.workspaceUID = defaults.workspaceUID;
        }

        public Builder setAdlaResourceId(String adlaResourceId) {
            this.adlaResourceId = Objects.requireNonNull(adlaResourceId);
            return this;
        }

        public Builder setConnectivityEndpoints(@Nullable Map<String,String> connectivityEndpoints) {
            this.connectivityEndpoints = connectivityEndpoints;
            return this;
        }

        public Builder setDefaultDataLakeStorage(@Nullable DataLakeStorageAccountDetailsResponse defaultDataLakeStorage) {
            this.defaultDataLakeStorage = defaultDataLakeStorage;
            return this;
        }

        public Builder setEncryption(@Nullable EncryptionDetailsResponse encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setExtraProperties(Map<String,Object> extraProperties) {
            this.extraProperties = Objects.requireNonNull(extraProperties);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable ManagedIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setManagedResourceGroupName(@Nullable String managedResourceGroupName) {
            this.managedResourceGroupName = managedResourceGroupName;
            return this;
        }

        public Builder setManagedVirtualNetwork(@Nullable String managedVirtualNetwork) {
            this.managedVirtualNetwork = managedVirtualNetwork;
            return this;
        }

        public Builder setManagedVirtualNetworkSettings(@Nullable ManagedVirtualNetworkSettingsResponse managedVirtualNetworkSettings) {
            this.managedVirtualNetworkSettings = managedVirtualNetworkSettings;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrivateEndpointConnections(@Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = privateEndpointConnections;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setPurviewConfiguration(@Nullable PurviewConfigurationResponse purviewConfiguration) {
            this.purviewConfiguration = purviewConfiguration;
            return this;
        }

        public Builder setSqlAdministratorLogin(@Nullable String sqlAdministratorLogin) {
            this.sqlAdministratorLogin = sqlAdministratorLogin;
            return this;
        }

        public Builder setSqlAdministratorLoginPassword(@Nullable String sqlAdministratorLoginPassword) {
            this.sqlAdministratorLoginPassword = sqlAdministratorLoginPassword;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVirtualNetworkProfile(@Nullable VirtualNetworkProfileResponse virtualNetworkProfile) {
            this.virtualNetworkProfile = virtualNetworkProfile;
            return this;
        }

        public Builder setWorkspaceRepositoryConfiguration(@Nullable WorkspaceRepositoryConfigurationResponse workspaceRepositoryConfiguration) {
            this.workspaceRepositoryConfiguration = workspaceRepositoryConfiguration;
            return this;
        }

        public Builder setWorkspaceUID(String workspaceUID) {
            this.workspaceUID = Objects.requireNonNull(workspaceUID);
            return this;
        }
        public GetWorkspaceResult build() {
            return new GetWorkspaceResult(adlaResourceId, connectivityEndpoints, defaultDataLakeStorage, encryption, extraProperties, id, identity, location, managedResourceGroupName, managedVirtualNetwork, managedVirtualNetworkSettings, name, privateEndpointConnections, provisioningState, publicNetworkAccess, purviewConfiguration, sqlAdministratorLogin, sqlAdministratorLoginPassword, tags, type, virtualNetworkProfile, workspaceRepositoryConfiguration, workspaceUID);
        }
    }
}