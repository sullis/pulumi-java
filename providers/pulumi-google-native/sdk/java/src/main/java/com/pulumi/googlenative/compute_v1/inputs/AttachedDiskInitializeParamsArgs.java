// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_v1.enums.AttachedDiskInitializeParamsOnUpdateAction;
import com.pulumi.googlenative.compute_v1.inputs.CustomerEncryptionKeyArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * [Input Only] Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
 * 
 */
public final class AttachedDiskInitializeParamsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AttachedDiskInitializeParamsArgs Empty = new AttachedDiskInitializeParamsArgs();

    /**
     * An optional description. Provide this property when creating the disk.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description. Provide this property when creating the disk.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies the disk name. If not specified, the default is to use the name of the instance. If a disk with the same name already exists in the given region, the existing disk is attached to the new instance and the new disk is not created.
     * 
     */
    @Import(name="diskName")
    private @Nullable Output<String> diskName;

    /**
     * @return Specifies the disk name. If not specified, the default is to use the name of the instance. If a disk with the same name already exists in the given region, the existing disk is attached to the new instance and the new disk is not created.
     * 
     */
    public Optional<Output<String>> diskName() {
        return Optional.ofNullable(this.diskName);
    }

    /**
     * Specifies the size of the disk in base-2 GB. The size must be at least 10 GB. If you specify a sourceImage, which is required for boot disks, the default size is the size of the sourceImage. If you do not specify a sourceImage, the default disk size is 500 GB.
     * 
     */
    @Import(name="diskSizeGb")
    private @Nullable Output<String> diskSizeGb;

    /**
     * @return Specifies the size of the disk in base-2 GB. The size must be at least 10 GB. If you specify a sourceImage, which is required for boot disks, the default size is the size of the sourceImage. If you do not specify a sourceImage, the default disk size is 500 GB.
     * 
     */
    public Optional<Output<String>> diskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }

    /**
     * Specifies the disk type to use to create the instance. If not specified, the default is pd-standard, specified using the full URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/pd-standard For a full list of acceptable values, see Persistent disk types. If you define this field, you can provide either the full or partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/diskType - projects/project/zones/zone/diskTypes/diskType - zones/zone/diskTypes/diskType Note that for InstanceTemplate, this is the name of the disk type, not URL.
     * 
     */
    @Import(name="diskType")
    private @Nullable Output<String> diskType;

    /**
     * @return Specifies the disk type to use to create the instance. If not specified, the default is pd-standard, specified using the full URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/pd-standard For a full list of acceptable values, see Persistent disk types. If you define this field, you can provide either the full or partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/diskType - projects/project/zones/zone/diskTypes/diskType - zones/zone/diskTypes/diskType Note that for InstanceTemplate, this is the name of the disk type, not URL.
     * 
     */
    public Optional<Output<String>> diskType() {
        return Optional.ofNullable(this.diskType);
    }

    /**
     * Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * A list of publicly visible licenses. Reserved for Google&#39;s use.
     * 
     */
    @Import(name="licenses")
    private @Nullable Output<List<String>> licenses;

    /**
     * @return A list of publicly visible licenses. Reserved for Google&#39;s use.
     * 
     */
    public Optional<Output<List<String>>> licenses() {
        return Optional.ofNullable(this.licenses);
    }

    /**
     * Specifies which action to take on instance update with this disk. Default is to use the existing disk.
     * 
     */
    @Import(name="onUpdateAction")
    private @Nullable Output<AttachedDiskInitializeParamsOnUpdateAction> onUpdateAction;

    /**
     * @return Specifies which action to take on instance update with this disk. Default is to use the existing disk.
     * 
     */
    public Optional<Output<AttachedDiskInitializeParamsOnUpdateAction>> onUpdateAction() {
        return Optional.ofNullable(this.onUpdateAction);
    }

    /**
     * Indicates how many IOPS to provision for the disk. This sets the number of I/O operations per second that the disk can handle. Values must be between 10,000 and 120,000. For more details, see the Extreme persistent disk documentation.
     * 
     */
    @Import(name="provisionedIops")
    private @Nullable Output<String> provisionedIops;

    /**
     * @return Indicates how many IOPS to provision for the disk. This sets the number of I/O operations per second that the disk can handle. Values must be between 10,000 and 120,000. For more details, see the Extreme persistent disk documentation.
     * 
     */
    public Optional<Output<String>> provisionedIops() {
        return Optional.ofNullable(this.provisionedIops);
    }

    /**
     * Resource policies applied to this disk for automatic snapshot creations. Specified using the full or partial URL. For instance template, specify only the resource policy name.
     * 
     */
    @Import(name="resourcePolicies")
    private @Nullable Output<List<String>> resourcePolicies;

    /**
     * @return Resource policies applied to this disk for automatic snapshot creations. Specified using the full or partial URL. For instance template, specify only the resource policy name.
     * 
     */
    public Optional<Output<List<String>>> resourcePolicies() {
        return Optional.ofNullable(this.resourcePolicies);
    }

    /**
     * The source image to create this disk. When creating a new instance, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required except for local SSD. To create a disk with one of the public operating system images, specify the image by its family name. For example, specify family/debian-9 to use the latest Debian 9 image: projects/debian-cloud/global/images/family/debian-9 Alternatively, use a specific version of a public operating system image: projects/debian-cloud/global/images/debian-9-stretch-vYYYYMMDD To create a disk with a custom image that you created, specify the image name in the following format: global/images/my-custom-image You can also specify a custom image by its image family, which returns the latest version of the image in that family. Replace the image name with family/family-name: global/images/family/my-image-family If the source image is deleted later, this field will not be set.
     * 
     */
    @Import(name="sourceImage")
    private @Nullable Output<String> sourceImage;

    /**
     * @return The source image to create this disk. When creating a new instance, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required except for local SSD. To create a disk with one of the public operating system images, specify the image by its family name. For example, specify family/debian-9 to use the latest Debian 9 image: projects/debian-cloud/global/images/family/debian-9 Alternatively, use a specific version of a public operating system image: projects/debian-cloud/global/images/debian-9-stretch-vYYYYMMDD To create a disk with a custom image that you created, specify the image name in the following format: global/images/my-custom-image You can also specify a custom image by its image family, which returns the latest version of the image in that family. Replace the image name with family/family-name: global/images/family/my-image-family If the source image is deleted later, this field will not be set.
     * 
     */
    public Optional<Output<String>> sourceImage() {
        return Optional.ofNullable(this.sourceImage);
    }

    /**
     * The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key. Instance templates do not store customer-supplied encryption keys, so you cannot create disks for instances in a managed instance group if the source images are encrypted with your own keys.
     * 
     */
    @Import(name="sourceImageEncryptionKey")
    private @Nullable Output<CustomerEncryptionKeyArgs> sourceImageEncryptionKey;

    /**
     * @return The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key. Instance templates do not store customer-supplied encryption keys, so you cannot create disks for instances in a managed instance group if the source images are encrypted with your own keys.
     * 
     */
    public Optional<Output<CustomerEncryptionKeyArgs>> sourceImageEncryptionKey() {
        return Optional.ofNullable(this.sourceImageEncryptionKey);
    }

    /**
     * The source snapshot to create this disk. When creating a new instance, one of initializeParams.sourceSnapshot or initializeParams.sourceImage or disks.source is required except for local SSD. To create a disk with a snapshot that you created, specify the snapshot name in the following format: global/snapshots/my-backup If the source snapshot is deleted later, this field will not be set.
     * 
     */
    @Import(name="sourceSnapshot")
    private @Nullable Output<String> sourceSnapshot;

    /**
     * @return The source snapshot to create this disk. When creating a new instance, one of initializeParams.sourceSnapshot or initializeParams.sourceImage or disks.source is required except for local SSD. To create a disk with a snapshot that you created, specify the snapshot name in the following format: global/snapshots/my-backup If the source snapshot is deleted later, this field will not be set.
     * 
     */
    public Optional<Output<String>> sourceSnapshot() {
        return Optional.ofNullable(this.sourceSnapshot);
    }

    /**
     * The customer-supplied encryption key of the source snapshot.
     * 
     */
    @Import(name="sourceSnapshotEncryptionKey")
    private @Nullable Output<CustomerEncryptionKeyArgs> sourceSnapshotEncryptionKey;

    /**
     * @return The customer-supplied encryption key of the source snapshot.
     * 
     */
    public Optional<Output<CustomerEncryptionKeyArgs>> sourceSnapshotEncryptionKey() {
        return Optional.ofNullable(this.sourceSnapshotEncryptionKey);
    }

    private AttachedDiskInitializeParamsArgs() {}

    private AttachedDiskInitializeParamsArgs(AttachedDiskInitializeParamsArgs $) {
        this.description = $.description;
        this.diskName = $.diskName;
        this.diskSizeGb = $.diskSizeGb;
        this.diskType = $.diskType;
        this.labels = $.labels;
        this.licenses = $.licenses;
        this.onUpdateAction = $.onUpdateAction;
        this.provisionedIops = $.provisionedIops;
        this.resourcePolicies = $.resourcePolicies;
        this.sourceImage = $.sourceImage;
        this.sourceImageEncryptionKey = $.sourceImageEncryptionKey;
        this.sourceSnapshot = $.sourceSnapshot;
        this.sourceSnapshotEncryptionKey = $.sourceSnapshotEncryptionKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AttachedDiskInitializeParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttachedDiskInitializeParamsArgs $;

        public Builder() {
            $ = new AttachedDiskInitializeParamsArgs();
        }

        public Builder(AttachedDiskInitializeParamsArgs defaults) {
            $ = new AttachedDiskInitializeParamsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An optional description. Provide this property when creating the disk.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description. Provide this property when creating the disk.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param diskName Specifies the disk name. If not specified, the default is to use the name of the instance. If a disk with the same name already exists in the given region, the existing disk is attached to the new instance and the new disk is not created.
         * 
         * @return builder
         * 
         */
        public Builder diskName(@Nullable Output<String> diskName) {
            $.diskName = diskName;
            return this;
        }

        /**
         * @param diskName Specifies the disk name. If not specified, the default is to use the name of the instance. If a disk with the same name already exists in the given region, the existing disk is attached to the new instance and the new disk is not created.
         * 
         * @return builder
         * 
         */
        public Builder diskName(String diskName) {
            return diskName(Output.of(diskName));
        }

        /**
         * @param diskSizeGb Specifies the size of the disk in base-2 GB. The size must be at least 10 GB. If you specify a sourceImage, which is required for boot disks, the default size is the size of the sourceImage. If you do not specify a sourceImage, the default disk size is 500 GB.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(@Nullable Output<String> diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        /**
         * @param diskSizeGb Specifies the size of the disk in base-2 GB. The size must be at least 10 GB. If you specify a sourceImage, which is required for boot disks, the default size is the size of the sourceImage. If you do not specify a sourceImage, the default disk size is 500 GB.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(String diskSizeGb) {
            return diskSizeGb(Output.of(diskSizeGb));
        }

        /**
         * @param diskType Specifies the disk type to use to create the instance. If not specified, the default is pd-standard, specified using the full URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/pd-standard For a full list of acceptable values, see Persistent disk types. If you define this field, you can provide either the full or partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/diskType - projects/project/zones/zone/diskTypes/diskType - zones/zone/diskTypes/diskType Note that for InstanceTemplate, this is the name of the disk type, not URL.
         * 
         * @return builder
         * 
         */
        public Builder diskType(@Nullable Output<String> diskType) {
            $.diskType = diskType;
            return this;
        }

        /**
         * @param diskType Specifies the disk type to use to create the instance. If not specified, the default is pd-standard, specified using the full URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/pd-standard For a full list of acceptable values, see Persistent disk types. If you define this field, you can provide either the full or partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/diskType - projects/project/zones/zone/diskTypes/diskType - zones/zone/diskTypes/diskType Note that for InstanceTemplate, this is the name of the disk type, not URL.
         * 
         * @return builder
         * 
         */
        public Builder diskType(String diskType) {
            return diskType(Output.of(diskType));
        }

        /**
         * @param labels Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param licenses A list of publicly visible licenses. Reserved for Google&#39;s use.
         * 
         * @return builder
         * 
         */
        public Builder licenses(@Nullable Output<List<String>> licenses) {
            $.licenses = licenses;
            return this;
        }

        /**
         * @param licenses A list of publicly visible licenses. Reserved for Google&#39;s use.
         * 
         * @return builder
         * 
         */
        public Builder licenses(List<String> licenses) {
            return licenses(Output.of(licenses));
        }

        /**
         * @param licenses A list of publicly visible licenses. Reserved for Google&#39;s use.
         * 
         * @return builder
         * 
         */
        public Builder licenses(String... licenses) {
            return licenses(List.of(licenses));
        }

        /**
         * @param onUpdateAction Specifies which action to take on instance update with this disk. Default is to use the existing disk.
         * 
         * @return builder
         * 
         */
        public Builder onUpdateAction(@Nullable Output<AttachedDiskInitializeParamsOnUpdateAction> onUpdateAction) {
            $.onUpdateAction = onUpdateAction;
            return this;
        }

        /**
         * @param onUpdateAction Specifies which action to take on instance update with this disk. Default is to use the existing disk.
         * 
         * @return builder
         * 
         */
        public Builder onUpdateAction(AttachedDiskInitializeParamsOnUpdateAction onUpdateAction) {
            return onUpdateAction(Output.of(onUpdateAction));
        }

        /**
         * @param provisionedIops Indicates how many IOPS to provision for the disk. This sets the number of I/O operations per second that the disk can handle. Values must be between 10,000 and 120,000. For more details, see the Extreme persistent disk documentation.
         * 
         * @return builder
         * 
         */
        public Builder provisionedIops(@Nullable Output<String> provisionedIops) {
            $.provisionedIops = provisionedIops;
            return this;
        }

        /**
         * @param provisionedIops Indicates how many IOPS to provision for the disk. This sets the number of I/O operations per second that the disk can handle. Values must be between 10,000 and 120,000. For more details, see the Extreme persistent disk documentation.
         * 
         * @return builder
         * 
         */
        public Builder provisionedIops(String provisionedIops) {
            return provisionedIops(Output.of(provisionedIops));
        }

        /**
         * @param resourcePolicies Resource policies applied to this disk for automatic snapshot creations. Specified using the full or partial URL. For instance template, specify only the resource policy name.
         * 
         * @return builder
         * 
         */
        public Builder resourcePolicies(@Nullable Output<List<String>> resourcePolicies) {
            $.resourcePolicies = resourcePolicies;
            return this;
        }

        /**
         * @param resourcePolicies Resource policies applied to this disk for automatic snapshot creations. Specified using the full or partial URL. For instance template, specify only the resource policy name.
         * 
         * @return builder
         * 
         */
        public Builder resourcePolicies(List<String> resourcePolicies) {
            return resourcePolicies(Output.of(resourcePolicies));
        }

        /**
         * @param resourcePolicies Resource policies applied to this disk for automatic snapshot creations. Specified using the full or partial URL. For instance template, specify only the resource policy name.
         * 
         * @return builder
         * 
         */
        public Builder resourcePolicies(String... resourcePolicies) {
            return resourcePolicies(List.of(resourcePolicies));
        }

        /**
         * @param sourceImage The source image to create this disk. When creating a new instance, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required except for local SSD. To create a disk with one of the public operating system images, specify the image by its family name. For example, specify family/debian-9 to use the latest Debian 9 image: projects/debian-cloud/global/images/family/debian-9 Alternatively, use a specific version of a public operating system image: projects/debian-cloud/global/images/debian-9-stretch-vYYYYMMDD To create a disk with a custom image that you created, specify the image name in the following format: global/images/my-custom-image You can also specify a custom image by its image family, which returns the latest version of the image in that family. Replace the image name with family/family-name: global/images/family/my-image-family If the source image is deleted later, this field will not be set.
         * 
         * @return builder
         * 
         */
        public Builder sourceImage(@Nullable Output<String> sourceImage) {
            $.sourceImage = sourceImage;
            return this;
        }

        /**
         * @param sourceImage The source image to create this disk. When creating a new instance, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required except for local SSD. To create a disk with one of the public operating system images, specify the image by its family name. For example, specify family/debian-9 to use the latest Debian 9 image: projects/debian-cloud/global/images/family/debian-9 Alternatively, use a specific version of a public operating system image: projects/debian-cloud/global/images/debian-9-stretch-vYYYYMMDD To create a disk with a custom image that you created, specify the image name in the following format: global/images/my-custom-image You can also specify a custom image by its image family, which returns the latest version of the image in that family. Replace the image name with family/family-name: global/images/family/my-image-family If the source image is deleted later, this field will not be set.
         * 
         * @return builder
         * 
         */
        public Builder sourceImage(String sourceImage) {
            return sourceImage(Output.of(sourceImage));
        }

        /**
         * @param sourceImageEncryptionKey The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key. Instance templates do not store customer-supplied encryption keys, so you cannot create disks for instances in a managed instance group if the source images are encrypted with your own keys.
         * 
         * @return builder
         * 
         */
        public Builder sourceImageEncryptionKey(@Nullable Output<CustomerEncryptionKeyArgs> sourceImageEncryptionKey) {
            $.sourceImageEncryptionKey = sourceImageEncryptionKey;
            return this;
        }

        /**
         * @param sourceImageEncryptionKey The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key. Instance templates do not store customer-supplied encryption keys, so you cannot create disks for instances in a managed instance group if the source images are encrypted with your own keys.
         * 
         * @return builder
         * 
         */
        public Builder sourceImageEncryptionKey(CustomerEncryptionKeyArgs sourceImageEncryptionKey) {
            return sourceImageEncryptionKey(Output.of(sourceImageEncryptionKey));
        }

        /**
         * @param sourceSnapshot The source snapshot to create this disk. When creating a new instance, one of initializeParams.sourceSnapshot or initializeParams.sourceImage or disks.source is required except for local SSD. To create a disk with a snapshot that you created, specify the snapshot name in the following format: global/snapshots/my-backup If the source snapshot is deleted later, this field will not be set.
         * 
         * @return builder
         * 
         */
        public Builder sourceSnapshot(@Nullable Output<String> sourceSnapshot) {
            $.sourceSnapshot = sourceSnapshot;
            return this;
        }

        /**
         * @param sourceSnapshot The source snapshot to create this disk. When creating a new instance, one of initializeParams.sourceSnapshot or initializeParams.sourceImage or disks.source is required except for local SSD. To create a disk with a snapshot that you created, specify the snapshot name in the following format: global/snapshots/my-backup If the source snapshot is deleted later, this field will not be set.
         * 
         * @return builder
         * 
         */
        public Builder sourceSnapshot(String sourceSnapshot) {
            return sourceSnapshot(Output.of(sourceSnapshot));
        }

        /**
         * @param sourceSnapshotEncryptionKey The customer-supplied encryption key of the source snapshot.
         * 
         * @return builder
         * 
         */
        public Builder sourceSnapshotEncryptionKey(@Nullable Output<CustomerEncryptionKeyArgs> sourceSnapshotEncryptionKey) {
            $.sourceSnapshotEncryptionKey = sourceSnapshotEncryptionKey;
            return this;
        }

        /**
         * @param sourceSnapshotEncryptionKey The customer-supplied encryption key of the source snapshot.
         * 
         * @return builder
         * 
         */
        public Builder sourceSnapshotEncryptionKey(CustomerEncryptionKeyArgs sourceSnapshotEncryptionKey) {
            return sourceSnapshotEncryptionKey(Output.of(sourceSnapshotEncryptionKey));
        }

        public AttachedDiskInitializeParamsArgs build() {
            return $;
        }
    }

}
