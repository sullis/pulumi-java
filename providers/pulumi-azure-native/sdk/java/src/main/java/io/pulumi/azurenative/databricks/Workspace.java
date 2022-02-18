// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databricks.WorkspaceArgs;
import io.pulumi.azurenative.databricks.outputs.CreatedByResponse;
import io.pulumi.azurenative.databricks.outputs.ManagedIdentityConfigurationResponse;
import io.pulumi.azurenative.databricks.outputs.SkuResponse;
import io.pulumi.azurenative.databricks.outputs.WorkspaceCustomParametersResponse;
import io.pulumi.azurenative.databricks.outputs.WorkspaceProviderAuthorizationResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Information about workspace.
 * API Version: 2018-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:databricks:Workspace myWorkspace /subscriptions/subid/resourceGroups/rg/providers/Microsoft.Databricks/workspaces/myWorkspace 
 * ```
 * 
 */
@ResourceType(type="azure-native:databricks:Workspace")
public class Workspace extends io.pulumi.resources.CustomResource {
    /**
     * The workspace provider authorizations.
     * 
     */
    @OutputExport(name="authorizations", type=List.class, parameters={WorkspaceProviderAuthorizationResponse.class})
    private Output</* @Nullable */ List<WorkspaceProviderAuthorizationResponse>> authorizations;

    /**
     * @return The workspace provider authorizations.
     * 
     */
    public Output</* @Nullable */ List<WorkspaceProviderAuthorizationResponse>> getAuthorizations() {
        return this.authorizations;
    }
    /**
     * Indicates the Object ID, PUID and Application ID of entity that created the workspace.
     * 
     */
    @OutputExport(name="createdBy", type=CreatedByResponse.class, parameters={})
    private Output</* @Nullable */ CreatedByResponse> createdBy;

    /**
     * @return Indicates the Object ID, PUID and Application ID of entity that created the workspace.
     * 
     */
    public Output</* @Nullable */ CreatedByResponse> getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Specifies the date and time when the workspace is created.
     * 
     */
    @OutputExport(name="createdDateTime", type=String.class, parameters={})
    private Output<String> createdDateTime;

    /**
     * @return Specifies the date and time when the workspace is created.
     * 
     */
    public Output<String> getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The managed resource group Id.
     * 
     */
    @OutputExport(name="managedResourceGroupId", type=String.class, parameters={})
    private Output<String> managedResourceGroupId;

    /**
     * @return The managed resource group Id.
     * 
     */
    public Output<String> getManagedResourceGroupId() {
        return this.managedResourceGroupId;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The workspace's custom parameters.
     * 
     */
    @OutputExport(name="parameters", type=WorkspaceCustomParametersResponse.class, parameters={})
    private Output</* @Nullable */ WorkspaceCustomParametersResponse> parameters;

    /**
     * @return The workspace's custom parameters.
     * 
     */
    public Output</* @Nullable */ WorkspaceCustomParametersResponse> getParameters() {
        return this.parameters;
    }
    /**
     * The workspace provisioning state.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The workspace provisioning state.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The SKU of the resource.
     * 
     */
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return The SKU of the resource.
     * 
     */
    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * The details of Managed Identity of Storage Account
     * 
     */
    @OutputExport(name="storageAccountIdentity", type=ManagedIdentityConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ ManagedIdentityConfigurationResponse> storageAccountIdentity;

    /**
     * @return The details of Managed Identity of Storage Account
     * 
     */
    public Output</* @Nullable */ ManagedIdentityConfigurationResponse> getStorageAccountIdentity() {
        return this.storageAccountIdentity;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The blob URI where the UI definition file is located.
     * 
     */
    @OutputExport(name="uiDefinitionUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> uiDefinitionUri;

    /**
     * @return The blob URI where the UI definition file is located.
     * 
     */
    public Output</* @Nullable */ String> getUiDefinitionUri() {
        return this.uiDefinitionUri;
    }
    /**
     * Indicates the Object ID, PUID and Application ID of entity that last updated the workspace.
     * 
     */
    @OutputExport(name="updatedBy", type=CreatedByResponse.class, parameters={})
    private Output</* @Nullable */ CreatedByResponse> updatedBy;

    /**
     * @return Indicates the Object ID, PUID and Application ID of entity that last updated the workspace.
     * 
     */
    public Output</* @Nullable */ CreatedByResponse> getUpdatedBy() {
        return this.updatedBy;
    }
    /**
     * The unique identifier of the databricks workspace in databricks control plane.
     * 
     */
    @OutputExport(name="workspaceId", type=String.class, parameters={})
    private Output<String> workspaceId;

    /**
     * @return The unique identifier of the databricks workspace in databricks control plane.
     * 
     */
    public Output<String> getWorkspaceId() {
        return this.workspaceId;
    }
    /**
     * The workspace URL which is of the format 'adb-{workspaceId}.{random}.azuredatabricks.net'
     * 
     */
    @OutputExport(name="workspaceUrl", type=String.class, parameters={})
    private Output<String> workspaceUrl;

    /**
     * @return The workspace URL which is of the format 'adb-{workspaceId}.{random}.azuredatabricks.net'
     * 
     */
    public Output<String> getWorkspaceUrl() {
        return this.workspaceUrl;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Workspace(String name, WorkspaceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databricks:Workspace", name, args == null ? WorkspaceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Workspace(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databricks:Workspace", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:databricks/v20180401:Workspace").build()),
                Input.of(Alias.builder().setType("azure-native:databricks/v20210401preview:Workspace").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Workspace get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Workspace(name, id, options);
    }
}
