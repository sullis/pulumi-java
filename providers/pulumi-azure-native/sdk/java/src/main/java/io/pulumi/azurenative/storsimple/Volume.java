// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storsimple.VolumeArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The volume.
 * API Version: 2017-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storsimple:Volume Volume1ForSDKTest /subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.StorSimple/managers/ManagerForSDKTest1/devices/Device05ForSDKTest/volumeContainers/VolumeContainerForSDKTest/volumes/Volume1ForSDKTest 
 * ```
 * 
 */
@ResourceType(type="azure-native:storsimple:Volume")
public class Volume extends io.pulumi.resources.CustomResource {
    /**
     * The IDs of the access control records, associated with the volume.
     * 
     */
    @OutputExport(name="accessControlRecordIds", type=List.class, parameters={String.class})
    private Output<List<String>> accessControlRecordIds;

    /**
     * @return The IDs of the access control records, associated with the volume.
     * 
     */
    public Output<List<String>> getAccessControlRecordIds() {
        return this.accessControlRecordIds;
    }
    /**
     * The IDs of the backup policies, in which this volume is part of.
     * 
     */
    @OutputExport(name="backupPolicyIds", type=List.class, parameters={String.class})
    private Output<List<String>> backupPolicyIds;

    /**
     * @return The IDs of the backup policies, in which this volume is part of.
     * 
     */
    public Output<List<String>> getBackupPolicyIds() {
        return this.backupPolicyIds;
    }
    /**
     * The backup status of the volume.
     * 
     */
    @OutputExport(name="backupStatus", type=String.class, parameters={})
    private Output<String> backupStatus;

    /**
     * @return The backup status of the volume.
     * 
     */
    public Output<String> getBackupStatus() {
        return this.backupStatus;
    }
    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return The Kind of the object. Currently only Series8000 is supported
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * The monitoring status of the volume.
     * 
     */
    @OutputExport(name="monitoringStatus", type=String.class, parameters={})
    private Output<String> monitoringStatus;

    /**
     * @return The monitoring status of the volume.
     * 
     */
    public Output<String> getMonitoringStatus() {
        return this.monitoringStatus;
    }
    /**
     * The name of the object.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the object.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The operation status on the volume.
     * 
     */
    @OutputExport(name="operationStatus", type=String.class, parameters={})
    private Output<String> operationStatus;

    /**
     * @return The operation status on the volume.
     * 
     */
    public Output<String> getOperationStatus() {
        return this.operationStatus;
    }
    /**
     * The size of the volume in bytes.
     * 
     */
    @OutputExport(name="sizeInBytes", type=Double.class, parameters={})
    private Output<Double> sizeInBytes;

    /**
     * @return The size of the volume in bytes.
     * 
     */
    public Output<Double> getSizeInBytes() {
        return this.sizeInBytes;
    }
    /**
     * The hierarchical type of the object.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The hierarchical type of the object.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The ID of the volume container, in which this volume is created.
     * 
     */
    @OutputExport(name="volumeContainerId", type=String.class, parameters={})
    private Output<String> volumeContainerId;

    /**
     * @return The ID of the volume container, in which this volume is created.
     * 
     */
    public Output<String> getVolumeContainerId() {
        return this.volumeContainerId;
    }
    /**
     * The volume status.
     * 
     */
    @OutputExport(name="volumeStatus", type=String.class, parameters={})
    private Output<String> volumeStatus;

    /**
     * @return The volume status.
     * 
     */
    public Output<String> getVolumeStatus() {
        return this.volumeStatus;
    }
    /**
     * The type of the volume.
     * 
     */
    @OutputExport(name="volumeType", type=String.class, parameters={})
    private Output<String> volumeType;

    /**
     * @return The type of the volume.
     * 
     */
    public Output<String> getVolumeType() {
        return this.volumeType;
    }

    public interface BuilderApplicator {
        public void apply(VolumeArgs.Builder a);
    }
    private static io.pulumi.azurenative.storsimple.VolumeArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.storsimple.VolumeArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Volume(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Volume(String name) {
        this(name, VolumeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Volume(String name, VolumeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Volume(String name, VolumeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storsimple:Volume", name, args == null ? VolumeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Volume(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storsimple:Volume", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:storsimple/v20170601:Volume").build())
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
    public static Volume get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Volume(name, id, options);
    }
}