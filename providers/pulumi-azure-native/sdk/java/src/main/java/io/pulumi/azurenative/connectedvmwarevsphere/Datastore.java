// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.connectedvmwarevsphere.DatastoreArgs;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.ResourceStatusResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.SystemDataResponse;
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
 * Define the datastore.
 * API Version: 2020-10-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:connectedvmwarevsphere:Datastore ContosoAgent /subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.ConnectedVMwarevSphere/Datastores/ContosoAgent 
 * ```
 * 
 */
@ResourceType(type="azure-native:connectedvmwarevsphere:Datastore")
public class Datastore extends io.pulumi.resources.CustomResource {
    /**
     * Gets the name of the corresponding resource in Kubernetes.
     * 
     */
    @OutputExport(name="customResourceName", type=String.class, parameters={})
    private Output<String> customResourceName;

    /**
     * @return Gets the name of the corresponding resource in Kubernetes.
     * 
     */
    public Output<String> getCustomResourceName() {
        return this.customResourceName;
    }
    /**
     * Gets or sets the extended location.
     * 
     */
    @OutputExport(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return Gets or sets the extended location.
     * 
     */
    public Output</* @Nullable */ ExtendedLocationResponse> getExtendedLocation() {
        return this.extendedLocation;
    }
    /**
     * Gets or sets the inventory Item ID for the datastore.
     * 
     */
    @OutputExport(name="inventoryItemId", type=String.class, parameters={})
    private Output</* @Nullable */ String> inventoryItemId;

    /**
     * @return Gets or sets the inventory Item ID for the datastore.
     * 
     */
    public Output</* @Nullable */ String> getInventoryItemId() {
        return this.inventoryItemId;
    }
    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Gets or sets the location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Gets or sets the location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Gets or sets the vCenter Managed Object name for the datastore.
     * 
     */
    @OutputExport(name="moName", type=String.class, parameters={})
    private Output<String> moName;

    /**
     * @return Gets or sets the vCenter Managed Object name for the datastore.
     * 
     */
    public Output<String> getMoName() {
        return this.moName;
    }
    /**
     * Gets or sets the vCenter MoRef (Managed Object Reference) ID for the datastore.
     * 
     */
    @OutputExport(name="moRefId", type=String.class, parameters={})
    private Output</* @Nullable */ String> moRefId;

    /**
     * @return Gets or sets the vCenter MoRef (Managed Object Reference) ID for the datastore.
     * 
     */
    public Output</* @Nullable */ String> getMoRefId() {
        return this.moRefId;
    }
    /**
     * Gets or sets the name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Gets or sets the name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Provisioning state of the resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource status information.
     * 
     */
    @OutputExport(name="statuses", type=List.class, parameters={ResourceStatusResponse.class})
    private Output<List<ResourceStatusResponse>> statuses;

    /**
     * @return The resource status information.
     * 
     */
    public Output<List<ResourceStatusResponse>> getStatuses() {
        return this.statuses;
    }
    /**
     * The system data.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system data.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Gets or sets the Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Gets or sets the Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Gets or sets the type of the resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Gets or sets the type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Gets or sets a unique identifier for this resource.
     * 
     */
    @OutputExport(name="uuid", type=String.class, parameters={})
    private Output<String> uuid;

    /**
     * @return Gets or sets a unique identifier for this resource.
     * 
     */
    public Output<String> getUuid() {
        return this.uuid;
    }
    /**
     * Gets or sets the ARM Id of the vCenter resource in which this datastore resides.
     * 
     */
    @OutputExport(name="vCenterId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vCenterId;

    /**
     * @return Gets or sets the ARM Id of the vCenter resource in which this datastore resides.
     * 
     */
    public Output</* @Nullable */ String> getVCenterId() {
        return this.vCenterId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Datastore(String name, DatastoreArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:connectedvmwarevsphere:Datastore", name, args == null ? DatastoreArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Datastore(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:connectedvmwarevsphere:Datastore", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:connectedvmwarevsphere/v20201001preview:Datastore").build())
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
    public static Datastore get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Datastore(name, id, options);
    }
}
