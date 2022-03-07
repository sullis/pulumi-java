// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.fsx.OpenZfsVolumeArgs;
import io.pulumi.aws.fsx.inputs.OpenZfsVolumeState;
import io.pulumi.aws.fsx.outputs.OpenZfsVolumeNfsExports;
import io.pulumi.aws.fsx.outputs.OpenZfsVolumeOriginSnapshot;
import io.pulumi.aws.fsx.outputs.OpenZfsVolumeUserAndGroupQuota;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an Amazon FSx for OpenZFS volume.
 * See the [FSx OpenZFS User Guide](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/what-is-fsx.html) for more information.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * FSx Volumes can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:fsx/openZfsVolume:OpenZfsVolume example fsvol-543ab12b1ca672f33
 * ```
 * 
 */
@ResourceType(type="aws:fsx/openZfsVolume:OpenZfsVolume")
public class OpenZfsVolume extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name of the file system.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name of the file system.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A boolean flag indicating whether tags for the file system should be copied to snapshots. The default value is false.
     * 
     */
    @OutputExport(name="copyTagsToSnapshots", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> copyTagsToSnapshots;

    /**
     * @return A boolean flag indicating whether tags for the file system should be copied to snapshots. The default value is false.
     * 
     */
    public Output</* @Nullable */ Boolean> getCopyTagsToSnapshots() {
        return this.copyTagsToSnapshots;
    }
    /**
     * Method used to compress the data on the volume. Valid values are `NONE` or `ZSTD`. Child volumes that don't specify compression option will inherit from parent volume. This option on file system applies to the root volume.
     * 
     */
    @OutputExport(name="dataCompressionType", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataCompressionType;

    /**
     * @return Method used to compress the data on the volume. Valid values are `NONE` or `ZSTD`. Child volumes that don't specify compression option will inherit from parent volume. This option on file system applies to the root volume.
     * 
     */
    public Output</* @Nullable */ String> getDataCompressionType() {
        return this.dataCompressionType;
    }
    /**
     * The name of the Volume. You can use a maximum of 203 alphanumeric characters, plus the underscore (_) special character.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Volume. You can use a maximum of 203 alphanumeric characters, plus the underscore (_) special character.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * NFS export configuration for the root volume. Exactly 1 item. See NFS Exports Below.
     * 
     */
    @OutputExport(name="nfsExports", type=OpenZfsVolumeNfsExports.class, parameters={})
    private Output</* @Nullable */ OpenZfsVolumeNfsExports> nfsExports;

    /**
     * @return NFS export configuration for the root volume. Exactly 1 item. See NFS Exports Below.
     * 
     */
    public Output</* @Nullable */ OpenZfsVolumeNfsExports> getNfsExports() {
        return this.nfsExports;
    }
    /**
     * The ARN of the source snapshot to create the volume from.
     * 
     */
    @OutputExport(name="originSnapshot", type=OpenZfsVolumeOriginSnapshot.class, parameters={})
    private Output</* @Nullable */ OpenZfsVolumeOriginSnapshot> originSnapshot;

    /**
     * @return The ARN of the source snapshot to create the volume from.
     * 
     */
    public Output</* @Nullable */ OpenZfsVolumeOriginSnapshot> getOriginSnapshot() {
        return this.originSnapshot;
    }
    /**
     * The volume id of volume that will be the parent volume for the volume being created, this could be the root volume created from the `aws.fsx.OpenZfsFileSystem` resource with the `root_volume_id` or the `id` property of another `aws.fsx.OpenZfsVolume`.
     * 
     */
    @OutputExport(name="parentVolumeId", type=String.class, parameters={})
    private Output<String> parentVolumeId;

    /**
     * @return The volume id of volume that will be the parent volume for the volume being created, this could be the root volume created from the `aws.fsx.OpenZfsFileSystem` resource with the `root_volume_id` or the `id` property of another `aws.fsx.OpenZfsVolume`.
     * 
     */
    public Output<String> getParentVolumeId() {
        return this.parentVolumeId;
    }
    /**
     * specifies whether the volume is read-only. Default is false.
     * 
     */
    @OutputExport(name="readOnly", type=Boolean.class, parameters={})
    private Output<Boolean> readOnly;

    /**
     * @return specifies whether the volume is read-only. Default is false.
     * 
     */
    public Output<Boolean> getReadOnly() {
        return this.readOnly;
    }
    /**
     * - The amount of storage that the user or group can use in gibibytes (GiB). Valid values between `0` and `2147483647`
     * 
     */
    @OutputExport(name="storageCapacityQuotaGib", type=Integer.class, parameters={})
    private Output<Integer> storageCapacityQuotaGib;

    /**
     * @return - The amount of storage that the user or group can use in gibibytes (GiB). Valid values between `0` and `2147483647`
     * 
     */
    public Output<Integer> getStorageCapacityQuotaGib() {
        return this.storageCapacityQuotaGib;
    }
    /**
     * The amount of storage in gibibytes (GiB) to reserve from the parent volume.
     * 
     */
    @OutputExport(name="storageCapacityReservationGib", type=Integer.class, parameters={})
    private Output<Integer> storageCapacityReservationGib;

    /**
     * @return The amount of storage in gibibytes (GiB) to reserve from the parent volume.
     * 
     */
    public Output<Integer> getStorageCapacityReservationGib() {
        return this.storageCapacityReservationGib;
    }
    /**
     * A map of tags to assign to the file system. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the file system. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * - Specify how much storage users or groups can use on the volume. Maximum of 100 items. See User and Group Quotas Below.
     * 
     */
    @OutputExport(name="userAndGroupQuotas", type=List.class, parameters={OpenZfsVolumeUserAndGroupQuota.class})
    private Output<List<OpenZfsVolumeUserAndGroupQuota>> userAndGroupQuotas;

    /**
     * @return - Specify how much storage users or groups can use on the volume. Maximum of 100 items. See User and Group Quotas Below.
     * 
     */
    public Output<List<OpenZfsVolumeUserAndGroupQuota>> getUserAndGroupQuotas() {
        return this.userAndGroupQuotas;
    }
    @OutputExport(name="volumeType", type=String.class, parameters={})
    private Output</* @Nullable */ String> volumeType;

    public Output</* @Nullable */ String> getVolumeType() {
        return this.volumeType;
    }

    public interface BuilderApplicator {
        public void apply(OpenZfsVolumeArgs.Builder a);
    }
    private static io.pulumi.aws.fsx.OpenZfsVolumeArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.fsx.OpenZfsVolumeArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public OpenZfsVolume(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OpenZfsVolume(String name) {
        this(name, OpenZfsVolumeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OpenZfsVolume(String name, OpenZfsVolumeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OpenZfsVolume(String name, OpenZfsVolumeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:fsx/openZfsVolume:OpenZfsVolume", name, args == null ? OpenZfsVolumeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private OpenZfsVolume(String name, Input<String> id, @Nullable OpenZfsVolumeState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:fsx/openZfsVolume:OpenZfsVolume", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static OpenZfsVolume get(String name, Input<String> id, @Nullable OpenZfsVolumeState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new OpenZfsVolume(name, id, state, options);
    }
}