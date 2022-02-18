// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.compute.SnapshotArgs;
import io.pulumi.azurenative.compute.outputs.CreationDataResponse;
import io.pulumi.azurenative.compute.outputs.EncryptionResponse;
import io.pulumi.azurenative.compute.outputs.EncryptionSettingsCollectionResponse;
import io.pulumi.azurenative.compute.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.compute.outputs.PurchasePlanResponse;
import io.pulumi.azurenative.compute.outputs.SnapshotSkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Snapshot resource.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:compute:Snapshot mySnapshot2 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/snapshots/{snapshotName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:compute:Snapshot")
public class Snapshot extends io.pulumi.resources.CustomResource {
    /**
     * Disk source information. CreationData information cannot be changed after the disk has been created.
     * 
     */
    @OutputExport(name="creationData", type=CreationDataResponse.class, parameters={})
    private Output<CreationDataResponse> creationData;

    /**
     * @return Disk source information. CreationData information cannot be changed after the disk has been created.
     * 
     */
    public Output<CreationDataResponse> getCreationData() {
        return this.creationData;
    }
    /**
     * ARM id of the DiskAccess resource for using private endpoints on disks.
     * 
     */
    @OutputExport(name="diskAccessId", type=String.class, parameters={})
    private Output</* @Nullable */ String> diskAccessId;

    /**
     * @return ARM id of the DiskAccess resource for using private endpoints on disks.
     * 
     */
    public Output</* @Nullable */ String> getDiskAccessId() {
        return this.diskAccessId;
    }
    /**
     * The size of the disk in bytes. This field is read only.
     * 
     */
    @OutputExport(name="diskSizeBytes", type=Double.class, parameters={})
    private Output<Double> diskSizeBytes;

    /**
     * @return The size of the disk in bytes. This field is read only.
     * 
     */
    public Output<Double> getDiskSizeBytes() {
        return this.diskSizeBytes;
    }
    /**
     * If creationData.createOption is Empty, this field is mandatory and it indicates the size of the disk to create. If this field is present for updates or creation with other options, it indicates a resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's size.
     * 
     */
    @OutputExport(name="diskSizeGB", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> diskSizeGB;

    /**
     * @return If creationData.createOption is Empty, this field is mandatory and it indicates the size of the disk to create. If this field is present for updates or creation with other options, it indicates a resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's size.
     * 
     */
    public Output</* @Nullable */ Integer> getDiskSizeGB() {
        return this.diskSizeGB;
    }
    /**
     * The state of the snapshot.
     * 
     */
    @OutputExport(name="diskState", type=String.class, parameters={})
    private Output<String> diskState;

    /**
     * @return The state of the snapshot.
     * 
     */
    public Output<String> getDiskState() {
        return this.diskState;
    }
    /**
     * Encryption property can be used to encrypt data at rest with customer managed keys or platform managed keys.
     * 
     */
    @OutputExport(name="encryption", type=EncryptionResponse.class, parameters={})
    private Output</* @Nullable */ EncryptionResponse> encryption;

    /**
     * @return Encryption property can be used to encrypt data at rest with customer managed keys or platform managed keys.
     * 
     */
    public Output</* @Nullable */ EncryptionResponse> getEncryption() {
        return this.encryption;
    }
    /**
     * Encryption settings collection used be Azure Disk Encryption, can contain multiple encryption settings per disk or snapshot.
     * 
     */
    @OutputExport(name="encryptionSettingsCollection", type=EncryptionSettingsCollectionResponse.class, parameters={})
    private Output</* @Nullable */ EncryptionSettingsCollectionResponse> encryptionSettingsCollection;

    /**
     * @return Encryption settings collection used be Azure Disk Encryption, can contain multiple encryption settings per disk or snapshot.
     * 
     */
    public Output</* @Nullable */ EncryptionSettingsCollectionResponse> getEncryptionSettingsCollection() {
        return this.encryptionSettingsCollection;
    }
    /**
     * The extended location where the snapshot will be created. Extended location cannot be changed.
     * 
     */
    @OutputExport(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return The extended location where the snapshot will be created. Extended location cannot be changed.
     * 
     */
    public Output</* @Nullable */ ExtendedLocationResponse> getExtendedLocation() {
        return this.extendedLocation;
    }
    /**
     * The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     * 
     */
    @OutputExport(name="hyperVGeneration", type=String.class, parameters={})
    private Output</* @Nullable */ String> hyperVGeneration;

    /**
     * @return The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     * 
     */
    public Output</* @Nullable */ String> getHyperVGeneration() {
        return this.hyperVGeneration;
    }
    /**
     * Whether a snapshot is incremental. Incremental snapshots on the same disk occupy less space than full snapshots and can be diffed.
     * 
     */
    @OutputExport(name="incremental", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> incremental;

    /**
     * @return Whether a snapshot is incremental. Incremental snapshots on the same disk occupy less space than full snapshots and can be diffed.
     * 
     */
    public Output</* @Nullable */ Boolean> getIncremental() {
        return this.incremental;
    }
    /**
     * Resource location
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Unused. Always Null.
     * 
     */
    @OutputExport(name="managedBy", type=String.class, parameters={})
    private Output<String> managedBy;

    /**
     * @return Unused. Always Null.
     * 
     */
    public Output<String> getManagedBy() {
        return this.managedBy;
    }
    /**
     * Resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Policy for accessing the disk via network.
     * 
     */
    @OutputExport(name="networkAccessPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> networkAccessPolicy;

    /**
     * @return Policy for accessing the disk via network.
     * 
     */
    public Output</* @Nullable */ String> getNetworkAccessPolicy() {
        return this.networkAccessPolicy;
    }
    /**
     * The Operating System type.
     * 
     */
    @OutputExport(name="osType", type=String.class, parameters={})
    private Output</* @Nullable */ String> osType;

    /**
     * @return The Operating System type.
     * 
     */
    public Output</* @Nullable */ String> getOsType() {
        return this.osType;
    }
    /**
     * The disk provisioning state.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The disk provisioning state.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Purchase plan information for the image from which the source disk for the snapshot was originally created.
     * 
     */
    @OutputExport(name="purchasePlan", type=PurchasePlanResponse.class, parameters={})
    private Output</* @Nullable */ PurchasePlanResponse> purchasePlan;

    /**
     * @return Purchase plan information for the image from which the source disk for the snapshot was originally created.
     * 
     */
    public Output</* @Nullable */ PurchasePlanResponse> getPurchasePlan() {
        return this.purchasePlan;
    }
    /**
     * The snapshots sku name. Can be Standard_LRS, Premium_LRS, or Standard_ZRS. This is an optional parameter for incremental snapshot and the default behavior is the SKU will be set to the same sku as the previous snapshot
     * 
     */
    @OutputExport(name="sku", type=SnapshotSkuResponse.class, parameters={})
    private Output</* @Nullable */ SnapshotSkuResponse> sku;

    /**
     * @return The snapshots sku name. Can be Standard_LRS, Premium_LRS, or Standard_ZRS. This is an optional parameter for incremental snapshot and the default behavior is the SKU will be set to the same sku as the previous snapshot
     * 
     */
    public Output</* @Nullable */ SnapshotSkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Indicates the OS on a snapshot supports hibernation.
     * 
     */
    @OutputExport(name="supportsHibernation", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> supportsHibernation;

    /**
     * @return Indicates the OS on a snapshot supports hibernation.
     * 
     */
    public Output</* @Nullable */ Boolean> getSupportsHibernation() {
        return this.supportsHibernation;
    }
    /**
     * Resource tags
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The time when the snapshot was created.
     * 
     */
    @OutputExport(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The time when the snapshot was created.
     * 
     */
    public Output<String> getTimeCreated() {
        return this.timeCreated;
    }
    /**
     * Resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Unique Guid identifying the resource.
     * 
     */
    @OutputExport(name="uniqueId", type=String.class, parameters={})
    private Output<String> uniqueId;

    /**
     * @return Unique Guid identifying the resource.
     * 
     */
    public Output<String> getUniqueId() {
        return this.uniqueId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Snapshot(String name, SnapshotArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:Snapshot", name, args == null ? SnapshotArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Snapshot(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:Snapshot", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:compute/v20160430preview:Snapshot").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20170330:Snapshot").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20180401:Snapshot").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20180601:Snapshot").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20180930:Snapshot").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20190301:Snapshot").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20190701:Snapshot").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20191101:Snapshot").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20200501:Snapshot").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20200630:Snapshot").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20200930:Snapshot").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20201201:Snapshot").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20210401:Snapshot").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20210801:Snapshot").build())
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
    public static Snapshot get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Snapshot(name, id, options);
    }
}
