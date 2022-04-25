// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.InstanceTemplateDiskDiskEncryptionKeyGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceTemplateDiskGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceTemplateDiskGetArgs Empty = new InstanceTemplateDiskGetArgs();

    /**
     * Whether or not the disk should be auto-deleted.
     * This defaults to true.
     * 
     */
    @Import(name="autoDelete")
    private @Nullable Output<Boolean> autoDelete;

    /**
     * @return Whether or not the disk should be auto-deleted.
     * This defaults to true.
     * 
     */
    public Optional<Output<Boolean>> autoDelete() {
        return Optional.ofNullable(this.autoDelete);
    }

    /**
     * Indicates that this is a boot disk.
     * 
     */
    @Import(name="boot")
    private @Nullable Output<Boolean> boot;

    /**
     * @return Indicates that this is a boot disk.
     * 
     */
    public Optional<Output<Boolean>> boot() {
        return Optional.ofNullable(this.boot);
    }

    /**
     * A unique device name that is reflected into the
     * /dev/  tree of a Linux operating system running within the instance. If not
     * specified, the server chooses a default device name to apply to this disk.
     * 
     */
    @Import(name="deviceName")
    private @Nullable Output<String> deviceName;

    /**
     * @return A unique device name that is reflected into the
     * /dev/  tree of a Linux operating system running within the instance. If not
     * specified, the server chooses a default device name to apply to this disk.
     * 
     */
    public Optional<Output<String>> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }

    /**
     * Encrypts or decrypts a disk using a customer-supplied encryption key.
     * 
     */
    @Import(name="diskEncryptionKey")
    private @Nullable Output<InstanceTemplateDiskDiskEncryptionKeyGetArgs> diskEncryptionKey;

    /**
     * @return Encrypts or decrypts a disk using a customer-supplied encryption key.
     * 
     */
    public Optional<Output<InstanceTemplateDiskDiskEncryptionKeyGetArgs>> diskEncryptionKey() {
        return Optional.ofNullable(this.diskEncryptionKey);
    }

    /**
     * Name of the disk. When not provided, this defaults
     * to the name of the instance.
     * 
     */
    @Import(name="diskName")
    private @Nullable Output<String> diskName;

    /**
     * @return Name of the disk. When not provided, this defaults
     * to the name of the instance.
     * 
     */
    public Optional<Output<String>> diskName() {
        return Optional.ofNullable(this.diskName);
    }

    /**
     * The size of the image in gigabytes. If not
     * specified, it will inherit the size of its base image. For SCRATCH disks,
     * the size must be exactly 375GB.
     * 
     */
    @Import(name="diskSizeGb")
    private @Nullable Output<Integer> diskSizeGb;

    /**
     * @return The size of the image in gigabytes. If not
     * specified, it will inherit the size of its base image. For SCRATCH disks,
     * the size must be exactly 375GB.
     * 
     */
    public Optional<Output<Integer>> diskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }

    /**
     * The GCE disk type. Can be either `&#34;pd-ssd&#34;`,
     * `&#34;local-ssd&#34;`, `&#34;pd-balanced&#34;` or `&#34;pd-standard&#34;`.
     * 
     */
    @Import(name="diskType")
    private @Nullable Output<String> diskType;

    /**
     * @return The GCE disk type. Can be either `&#34;pd-ssd&#34;`,
     * `&#34;local-ssd&#34;`, `&#34;pd-balanced&#34;` or `&#34;pd-standard&#34;`.
     * 
     */
    public Optional<Output<String>> diskType() {
        return Optional.ofNullable(this.diskType);
    }

    /**
     * Specifies the disk interface to use for attaching this disk,
     * which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI
     * and the request will fail if you attempt to attach a persistent disk in any other format
     * than SCSI. Local SSDs can use either NVME or SCSI.
     * 
     */
    @Import(name="interface")
    private @Nullable Output<String> interface_;

    /**
     * @return Specifies the disk interface to use for attaching this disk,
     * which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI
     * and the request will fail if you attempt to attach a persistent disk in any other format
     * than SCSI. Local SSDs can use either NVME or SCSI.
     * 
     */
    public Optional<Output<String>> interface_() {
        return Optional.ofNullable(this.interface_);
    }

    /**
     * A set of ket/value label pairs to assign to disk created from
     * this template
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return A set of ket/value label pairs to assign to disk created from
     * this template
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The mode in which to attach this disk, either READ_WRITE
     * or READ_ONLY. If you are attaching or creating a boot disk, this must
     * read-write mode.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return The mode in which to attach this disk, either READ_WRITE
     * or READ_ONLY. If you are attaching or creating a boot disk, this must
     * read-write mode.
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * -- A list (short name or id) of resource policies to attach to this disk for automatic snapshot creations. Currently a max of 1 resource policy is supported.
     * 
     */
    @Import(name="resourcePolicies")
    private @Nullable Output<String> resourcePolicies;

    /**
     * @return -- A list (short name or id) of resource policies to attach to this disk for automatic snapshot creations. Currently a max of 1 resource policy is supported.
     * 
     */
    public Optional<Output<String>> resourcePolicies() {
        return Optional.ofNullable(this.resourcePolicies);
    }

    /**
     * The name (**not self_link**)
     * of the disk (such as those managed by `gcp.compute.Disk`) to attach.
     * &gt; **Note:** Either `source` or `source_image` is **required** in a disk block unless the disk type is `local-ssd`. Check the API [docs](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/insert) for details.
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return The name (**not self_link**)
     * of the disk (such as those managed by `gcp.compute.Disk`) to attach.
     * &gt; **Note:** Either `source` or `source_image` is **required** in a disk block unless the disk type is `local-ssd`. Check the API [docs](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/insert) for details.
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * The image from which to
     * initialize this disk. This can be one of: the image&#39;s `self_link`,
     * `projects/{project}/global/images/{image}`,
     * `projects/{project}/global/images/family/{family}`, `global/images/{image}`,
     * `global/images/family/{family}`, `family/{family}`, `{project}/{family}`,
     * `{project}/{image}`, `{family}`, or `{image}`.
     * &gt; **Note:** Either `source` or `source_image` is **required** in a disk block unless the disk type is `local-ssd`. Check the API [docs](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/insert) for details.
     * 
     */
    @Import(name="sourceImage")
    private @Nullable Output<String> sourceImage;

    /**
     * @return The image from which to
     * initialize this disk. This can be one of: the image&#39;s `self_link`,
     * `projects/{project}/global/images/{image}`,
     * `projects/{project}/global/images/family/{family}`, `global/images/{image}`,
     * `global/images/family/{family}`, `family/{family}`, `{project}/{family}`,
     * `{project}/{image}`, `{family}`, or `{image}`.
     * &gt; **Note:** Either `source` or `source_image` is **required** in a disk block unless the disk type is `local-ssd`. Check the API [docs](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/insert) for details.
     * 
     */
    public Optional<Output<String>> sourceImage() {
        return Optional.ofNullable(this.sourceImage);
    }

    /**
     * The type of reservation from which this instance can consume resources.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of reservation from which this instance can consume resources.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private InstanceTemplateDiskGetArgs() {}

    private InstanceTemplateDiskGetArgs(InstanceTemplateDiskGetArgs $) {
        this.autoDelete = $.autoDelete;
        this.boot = $.boot;
        this.deviceName = $.deviceName;
        this.diskEncryptionKey = $.diskEncryptionKey;
        this.diskName = $.diskName;
        this.diskSizeGb = $.diskSizeGb;
        this.diskType = $.diskType;
        this.interface_ = $.interface_;
        this.labels = $.labels;
        this.mode = $.mode;
        this.resourcePolicies = $.resourcePolicies;
        this.source = $.source;
        this.sourceImage = $.sourceImage;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceTemplateDiskGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceTemplateDiskGetArgs $;

        public Builder() {
            $ = new InstanceTemplateDiskGetArgs();
        }

        public Builder(InstanceTemplateDiskGetArgs defaults) {
            $ = new InstanceTemplateDiskGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoDelete Whether or not the disk should be auto-deleted.
         * This defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder autoDelete(@Nullable Output<Boolean> autoDelete) {
            $.autoDelete = autoDelete;
            return this;
        }

        /**
         * @param autoDelete Whether or not the disk should be auto-deleted.
         * This defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder autoDelete(Boolean autoDelete) {
            return autoDelete(Output.of(autoDelete));
        }

        /**
         * @param boot Indicates that this is a boot disk.
         * 
         * @return builder
         * 
         */
        public Builder boot(@Nullable Output<Boolean> boot) {
            $.boot = boot;
            return this;
        }

        /**
         * @param boot Indicates that this is a boot disk.
         * 
         * @return builder
         * 
         */
        public Builder boot(Boolean boot) {
            return boot(Output.of(boot));
        }

        /**
         * @param deviceName A unique device name that is reflected into the
         * /dev/  tree of a Linux operating system running within the instance. If not
         * specified, the server chooses a default device name to apply to this disk.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(@Nullable Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param deviceName A unique device name that is reflected into the
         * /dev/  tree of a Linux operating system running within the instance. If not
         * specified, the server chooses a default device name to apply to this disk.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        /**
         * @param diskEncryptionKey Encrypts or decrypts a disk using a customer-supplied encryption key.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionKey(@Nullable Output<InstanceTemplateDiskDiskEncryptionKeyGetArgs> diskEncryptionKey) {
            $.diskEncryptionKey = diskEncryptionKey;
            return this;
        }

        /**
         * @param diskEncryptionKey Encrypts or decrypts a disk using a customer-supplied encryption key.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionKey(InstanceTemplateDiskDiskEncryptionKeyGetArgs diskEncryptionKey) {
            return diskEncryptionKey(Output.of(diskEncryptionKey));
        }

        /**
         * @param diskName Name of the disk. When not provided, this defaults
         * to the name of the instance.
         * 
         * @return builder
         * 
         */
        public Builder diskName(@Nullable Output<String> diskName) {
            $.diskName = diskName;
            return this;
        }

        /**
         * @param diskName Name of the disk. When not provided, this defaults
         * to the name of the instance.
         * 
         * @return builder
         * 
         */
        public Builder diskName(String diskName) {
            return diskName(Output.of(diskName));
        }

        /**
         * @param diskSizeGb The size of the image in gigabytes. If not
         * specified, it will inherit the size of its base image. For SCRATCH disks,
         * the size must be exactly 375GB.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(@Nullable Output<Integer> diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        /**
         * @param diskSizeGb The size of the image in gigabytes. If not
         * specified, it will inherit the size of its base image. For SCRATCH disks,
         * the size must be exactly 375GB.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(Integer diskSizeGb) {
            return diskSizeGb(Output.of(diskSizeGb));
        }

        /**
         * @param diskType The GCE disk type. Can be either `&#34;pd-ssd&#34;`,
         * `&#34;local-ssd&#34;`, `&#34;pd-balanced&#34;` or `&#34;pd-standard&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder diskType(@Nullable Output<String> diskType) {
            $.diskType = diskType;
            return this;
        }

        /**
         * @param diskType The GCE disk type. Can be either `&#34;pd-ssd&#34;`,
         * `&#34;local-ssd&#34;`, `&#34;pd-balanced&#34;` or `&#34;pd-standard&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder diskType(String diskType) {
            return diskType(Output.of(diskType));
        }

        /**
         * @param interface_ Specifies the disk interface to use for attaching this disk,
         * which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI
         * and the request will fail if you attempt to attach a persistent disk in any other format
         * than SCSI. Local SSDs can use either NVME or SCSI.
         * 
         * @return builder
         * 
         */
        public Builder interface_(@Nullable Output<String> interface_) {
            $.interface_ = interface_;
            return this;
        }

        /**
         * @param interface_ Specifies the disk interface to use for attaching this disk,
         * which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI
         * and the request will fail if you attempt to attach a persistent disk in any other format
         * than SCSI. Local SSDs can use either NVME or SCSI.
         * 
         * @return builder
         * 
         */
        public Builder interface_(String interface_) {
            return interface_(Output.of(interface_));
        }

        /**
         * @param labels A set of ket/value label pairs to assign to disk created from
         * this template
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels A set of ket/value label pairs to assign to disk created from
         * this template
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param mode The mode in which to attach this disk, either READ_WRITE
         * or READ_ONLY. If you are attaching or creating a boot disk, this must
         * read-write mode.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode The mode in which to attach this disk, either READ_WRITE
         * or READ_ONLY. If you are attaching or creating a boot disk, this must
         * read-write mode.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param resourcePolicies -- A list (short name or id) of resource policies to attach to this disk for automatic snapshot creations. Currently a max of 1 resource policy is supported.
         * 
         * @return builder
         * 
         */
        public Builder resourcePolicies(@Nullable Output<String> resourcePolicies) {
            $.resourcePolicies = resourcePolicies;
            return this;
        }

        /**
         * @param resourcePolicies -- A list (short name or id) of resource policies to attach to this disk for automatic snapshot creations. Currently a max of 1 resource policy is supported.
         * 
         * @return builder
         * 
         */
        public Builder resourcePolicies(String resourcePolicies) {
            return resourcePolicies(Output.of(resourcePolicies));
        }

        /**
         * @param source The name (**not self_link**)
         * of the disk (such as those managed by `gcp.compute.Disk`) to attach.
         * &gt; **Note:** Either `source` or `source_image` is **required** in a disk block unless the disk type is `local-ssd`. Check the API [docs](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/insert) for details.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The name (**not self_link**)
         * of the disk (such as those managed by `gcp.compute.Disk`) to attach.
         * &gt; **Note:** Either `source` or `source_image` is **required** in a disk block unless the disk type is `local-ssd`. Check the API [docs](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/insert) for details.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        /**
         * @param sourceImage The image from which to
         * initialize this disk. This can be one of: the image&#39;s `self_link`,
         * `projects/{project}/global/images/{image}`,
         * `projects/{project}/global/images/family/{family}`, `global/images/{image}`,
         * `global/images/family/{family}`, `family/{family}`, `{project}/{family}`,
         * `{project}/{image}`, `{family}`, or `{image}`.
         * &gt; **Note:** Either `source` or `source_image` is **required** in a disk block unless the disk type is `local-ssd`. Check the API [docs](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/insert) for details.
         * 
         * @return builder
         * 
         */
        public Builder sourceImage(@Nullable Output<String> sourceImage) {
            $.sourceImage = sourceImage;
            return this;
        }

        /**
         * @param sourceImage The image from which to
         * initialize this disk. This can be one of: the image&#39;s `self_link`,
         * `projects/{project}/global/images/{image}`,
         * `projects/{project}/global/images/family/{family}`, `global/images/{image}`,
         * `global/images/family/{family}`, `family/{family}`, `{project}/{family}`,
         * `{project}/{image}`, `{family}`, or `{image}`.
         * &gt; **Note:** Either `source` or `source_image` is **required** in a disk block unless the disk type is `local-ssd`. Check the API [docs](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/insert) for details.
         * 
         * @return builder
         * 
         */
        public Builder sourceImage(String sourceImage) {
            return sourceImage(Output.of(sourceImage));
        }

        /**
         * @param type The type of reservation from which this instance can consume resources.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of reservation from which this instance can consume resources.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public InstanceTemplateDiskGetArgs build() {
            return $;
        }
    }

}
