// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.outputs;

import io.pulumi.azurenative.databricks.outputs.CreatedByResponse;
import io.pulumi.azurenative.databricks.outputs.ManagedIdentityConfigurationResponse;
import io.pulumi.azurenative.databricks.outputs.SkuResponse;
import io.pulumi.azurenative.databricks.outputs.WorkspaceCustomParametersResponse;
import io.pulumi.azurenative.databricks.outputs.WorkspaceProviderAuthorizationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWorkspaceResult {
    /**
     * The workspace provider authorizations.
     * 
     */
    private final @Nullable List<WorkspaceProviderAuthorizationResponse> authorizations;
    /**
     * Indicates the Object ID, PUID and Application ID of entity that created the workspace.
     * 
     */
    private final @Nullable CreatedByResponse createdBy;
    /**
     * Specifies the date and time when the workspace is created.
     * 
     */
    private final String createdDateTime;
    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * The managed resource group Id.
     * 
     */
    private final String managedResourceGroupId;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The workspace's custom parameters.
     * 
     */
    private final @Nullable WorkspaceCustomParametersResponse parameters;
    /**
     * The workspace provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * The SKU of the resource.
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * The details of Managed Identity of Storage Account
     * 
     */
    private final @Nullable ManagedIdentityConfigurationResponse storageAccountIdentity;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    private final String type;
    /**
     * The blob URI where the UI definition file is located.
     * 
     */
    private final @Nullable String uiDefinitionUri;
    /**
     * Indicates the Object ID, PUID and Application ID of entity that last updated the workspace.
     * 
     */
    private final @Nullable CreatedByResponse updatedBy;
    /**
     * The unique identifier of the databricks workspace in databricks control plane.
     * 
     */
    private final String workspaceId;
    /**
     * The workspace URL which is of the format 'adb-{workspaceId}.{random}.azuredatabricks.net'
     * 
     */
    private final String workspaceUrl;

    @OutputCustomType.Constructor({"authorizations","createdBy","createdDateTime","id","location","managedResourceGroupId","name","parameters","provisioningState","sku","storageAccountIdentity","tags","type","uiDefinitionUri","updatedBy","workspaceId","workspaceUrl"})
    private GetWorkspaceResult(
        @Nullable List<WorkspaceProviderAuthorizationResponse> authorizations,
        @Nullable CreatedByResponse createdBy,
        String createdDateTime,
        String id,
        String location,
        String managedResourceGroupId,
        String name,
        @Nullable WorkspaceCustomParametersResponse parameters,
        String provisioningState,
        @Nullable SkuResponse sku,
        @Nullable ManagedIdentityConfigurationResponse storageAccountIdentity,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable String uiDefinitionUri,
        @Nullable CreatedByResponse updatedBy,
        String workspaceId,
        String workspaceUrl) {
        this.authorizations = authorizations;
        this.createdBy = createdBy;
        this.createdDateTime = Objects.requireNonNull(createdDateTime);
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.managedResourceGroupId = Objects.requireNonNull(managedResourceGroupId);
        this.name = Objects.requireNonNull(name);
        this.parameters = parameters;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.sku = sku;
        this.storageAccountIdentity = storageAccountIdentity;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.uiDefinitionUri = uiDefinitionUri;
        this.updatedBy = updatedBy;
        this.workspaceId = Objects.requireNonNull(workspaceId);
        this.workspaceUrl = Objects.requireNonNull(workspaceUrl);
    }

    /**
     * The workspace provider authorizations.
     * 
     */
    public List<WorkspaceProviderAuthorizationResponse> getAuthorizations() {
        return this.authorizations == null ? List.of() : this.authorizations;
    }
    /**
     * Indicates the Object ID, PUID and Application ID of entity that created the workspace.
     * 
     */
    public Optional<CreatedByResponse> getCreatedBy() {
        return Optional.ofNullable(this.createdBy);
    }
    /**
     * Specifies the date and time when the workspace is created.
     * 
     */
    public String getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * The managed resource group Id.
     * 
     */
    public String getManagedResourceGroupId() {
        return this.managedResourceGroupId;
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The workspace's custom parameters.
     * 
     */
    public Optional<WorkspaceCustomParametersResponse> getParameters() {
        return Optional.ofNullable(this.parameters);
    }
    /**
     * The workspace provisioning state.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The SKU of the resource.
     * 
     */
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * The details of Managed Identity of Storage Account
     * 
     */
    public Optional<ManagedIdentityConfigurationResponse> getStorageAccountIdentity() {
        return Optional.ofNullable(this.storageAccountIdentity);
    }
    /**
     * Resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The blob URI where the UI definition file is located.
     * 
     */
    public Optional<String> getUiDefinitionUri() {
        return Optional.ofNullable(this.uiDefinitionUri);
    }
    /**
     * Indicates the Object ID, PUID and Application ID of entity that last updated the workspace.
     * 
     */
    public Optional<CreatedByResponse> getUpdatedBy() {
        return Optional.ofNullable(this.updatedBy);
    }
    /**
     * The unique identifier of the databricks workspace in databricks control plane.
     * 
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }
    /**
     * The workspace URL which is of the format 'adb-{workspaceId}.{random}.azuredatabricks.net'
     * 
     */
    public String getWorkspaceUrl() {
        return this.workspaceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkspaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<WorkspaceProviderAuthorizationResponse> authorizations;
        private @Nullable CreatedByResponse createdBy;
        private String createdDateTime;
        private String id;
        private String location;
        private String managedResourceGroupId;
        private String name;
        private @Nullable WorkspaceCustomParametersResponse parameters;
        private String provisioningState;
        private @Nullable SkuResponse sku;
        private @Nullable ManagedIdentityConfigurationResponse storageAccountIdentity;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable String uiDefinitionUri;
        private @Nullable CreatedByResponse updatedBy;
        private String workspaceId;
        private String workspaceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkspaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizations = defaults.authorizations;
    	      this.createdBy = defaults.createdBy;
    	      this.createdDateTime = defaults.createdDateTime;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.managedResourceGroupId = defaults.managedResourceGroupId;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sku = defaults.sku;
    	      this.storageAccountIdentity = defaults.storageAccountIdentity;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.uiDefinitionUri = defaults.uiDefinitionUri;
    	      this.updatedBy = defaults.updatedBy;
    	      this.workspaceId = defaults.workspaceId;
    	      this.workspaceUrl = defaults.workspaceUrl;
        }

        public Builder setAuthorizations(@Nullable List<WorkspaceProviderAuthorizationResponse> authorizations) {
            this.authorizations = authorizations;
            return this;
        }

        public Builder setCreatedBy(@Nullable CreatedByResponse createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder setCreatedDateTime(String createdDateTime) {
            this.createdDateTime = Objects.requireNonNull(createdDateTime);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setManagedResourceGroupId(String managedResourceGroupId) {
            this.managedResourceGroupId = Objects.requireNonNull(managedResourceGroupId);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(@Nullable WorkspaceCustomParametersResponse parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setStorageAccountIdentity(@Nullable ManagedIdentityConfigurationResponse storageAccountIdentity) {
            this.storageAccountIdentity = storageAccountIdentity;
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

        public Builder setUiDefinitionUri(@Nullable String uiDefinitionUri) {
            this.uiDefinitionUri = uiDefinitionUri;
            return this;
        }

        public Builder setUpdatedBy(@Nullable CreatedByResponse updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public Builder setWorkspaceId(String workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }

        public Builder setWorkspaceUrl(String workspaceUrl) {
            this.workspaceUrl = Objects.requireNonNull(workspaceUrl);
            return this;
        }

        public GetWorkspaceResult build() {
            return new GetWorkspaceResult(authorizations, createdBy, createdDateTime, id, location, managedResourceGroupId, name, parameters, provisioningState, sku, storageAccountIdentity, tags, type, uiDefinitionUri, updatedBy, workspaceId, workspaceUrl);
        }
    }
}
