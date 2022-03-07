// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.InstanceTemplateDiskDiskEncryptionKey;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceTemplateDisk {
    /**
     * Whether or not the disk should be auto-deleted.
     * This defaults to true.
     * 
     */
    private final @Nullable Boolean autoDelete;
    /**
     * Indicates that this is a boot disk.
     * 
     */
    private final @Nullable Boolean boot;
    /**
     * A unique device name that is reflected into the
     * /dev/  tree of a Linux operating system running within the instance. If not
     * specified, the server chooses a default device name to apply to this disk.
     * 
     */
    private final @Nullable String deviceName;
    /**
     * Encrypts or decrypts a disk using a customer-supplied encryption key.
     * 
     */
    private final @Nullable InstanceTemplateDiskDiskEncryptionKey diskEncryptionKey;
    /**
     * Name of the disk. When not provided, this defaults
     * to the name of the instance.
     * 
     */
    private final @Nullable String diskName;
    /**
     * The size of the image in gigabytes. If not
     * specified, it will inherit the size of its base image. For SCRATCH disks,
     * the size must be exactly 375GB.
     * 
     */
    private final @Nullable Integer diskSizeGb;
    /**
     * The GCE disk type. Can be either `"pd-ssd"`,
     * `"local-ssd"`, `"pd-balanced"` or `"pd-standard"`.
     * 
     */
    private final @Nullable String diskType;
    /**
     * Specifies the disk interface to use for attaching this disk,
     * which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI
     * and the request will fail if you attempt to attach a persistent disk in any other format
     * than SCSI. Local SSDs can use either NVME or SCSI.
     * 
     */
    private final @Nullable String $interface;
    /**
     * A set of ket/value label pairs to assign to disk created from
     * this template
     * 
     */
    private final @Nullable Map<String,String> labels;
    /**
     * The mode in which to attach this disk, either READ_WRITE
     * or READ_ONLY. If you are attaching or creating a boot disk, this must
     * read-write mode.
     * 
     */
    private final @Nullable String mode;
    /**
     * -- A list (short name or id) of resource policies to attach to this disk for automatic snapshot creations. Currently a max of 1 resource policy is supported.
     * 
     */
    private final @Nullable String resourcePolicies;
    /**
     * The name (**not self_link**)
     * of the disk (such as those managed by `gcp.compute.Disk`) to attach.
     * > **Note:** Either `source` or `source_image` is **required** in a disk block unless the disk type is `local-ssd`. Check the API [docs](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/insert) for details.
     * 
     */
    private final @Nullable String source;
    /**
     * The image from which to
     * initialize this disk. This can be one of: the image's `self_link`,
     * `projects/{project}/global/images/{image}`,
     * `projects/{project}/global/images/family/{family}`, `global/images/{image}`,
     * `global/images/family/{family}`, `family/{family}`, `{project}/{family}`,
     * `{project}/{image}`, `{family}`, or `{image}`.
     * > **Note:** Either `source` or `source_image` is **required** in a disk block unless the disk type is `local-ssd`. Check the API [docs](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/insert) for details.
     * 
     */
    private final @Nullable String sourceImage;
    /**
     * The type of reservation from which this instance can consume resources.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"autoDelete","boot","deviceName","diskEncryptionKey","diskName","diskSizeGb","diskType","$interface","labels","mode","resourcePolicies","source","sourceImage","type"})
    private InstanceTemplateDisk(
        @Nullable Boolean autoDelete,
        @Nullable Boolean boot,
        @Nullable String deviceName,
        @Nullable InstanceTemplateDiskDiskEncryptionKey diskEncryptionKey,
        @Nullable String diskName,
        @Nullable Integer diskSizeGb,
        @Nullable String diskType,
        @Nullable String $interface,
        @Nullable Map<String,String> labels,
        @Nullable String mode,
        @Nullable String resourcePolicies,
        @Nullable String source,
        @Nullable String sourceImage,
        @Nullable String type) {
        this.autoDelete = autoDelete;
        this.boot = boot;
        this.deviceName = deviceName;
        this.diskEncryptionKey = diskEncryptionKey;
        this.diskName = diskName;
        this.diskSizeGb = diskSizeGb;
        this.diskType = diskType;
        this.$interface = $interface;
        this.labels = labels;
        this.mode = mode;
        this.resourcePolicies = resourcePolicies;
        this.source = source;
        this.sourceImage = sourceImage;
        this.type = type;
    }

    /**
     * Whether or not the disk should be auto-deleted.
     * This defaults to true.
     * 
    */
    public Optional<Boolean> getAutoDelete() {
        return Optional.ofNullable(this.autoDelete);
    }
    /**
     * Indicates that this is a boot disk.
     * 
    */
    public Optional<Boolean> getBoot() {
        return Optional.ofNullable(this.boot);
    }
    /**
     * A unique device name that is reflected into the
     * /dev/  tree of a Linux operating system running within the instance. If not
     * specified, the server chooses a default device name to apply to this disk.
     * 
    */
    public Optional<String> getDeviceName() {
        return Optional.ofNullable(this.deviceName);
    }
    /**
     * Encrypts or decrypts a disk using a customer-supplied encryption key.
     * 
    */
    public Optional<InstanceTemplateDiskDiskEncryptionKey> getDiskEncryptionKey() {
        return Optional.ofNullable(this.diskEncryptionKey);
    }
    /**
     * Name of the disk. When not provided, this defaults
     * to the name of the instance.
     * 
    */
    public Optional<String> getDiskName() {
        return Optional.ofNullable(this.diskName);
    }
    /**
     * The size of the image in gigabytes. If not
     * specified, it will inherit the size of its base image. For SCRATCH disks,
     * the size must be exactly 375GB.
     * 
    */
    public Optional<Integer> getDiskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }
    /**
     * The GCE disk type. Can be either `"pd-ssd"`,
     * `"local-ssd"`, `"pd-balanced"` or `"pd-standard"`.
     * 
    */
    public Optional<String> getDiskType() {
        return Optional.ofNullable(this.diskType);
    }
    /**
     * Specifies the disk interface to use for attaching this disk,
     * which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI
     * and the request will fail if you attempt to attach a persistent disk in any other format
     * than SCSI. Local SSDs can use either NVME or SCSI.
     * 
    */
    public Optional<String> get$interface() {
        return Optional.ofNullable(this.$interface);
    }
    /**
     * A set of ket/value label pairs to assign to disk created from
     * this template
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    /**
     * The mode in which to attach this disk, either READ_WRITE
     * or READ_ONLY. If you are attaching or creating a boot disk, this must
     * read-write mode.
     * 
    */
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * -- A list (short name or id) of resource policies to attach to this disk for automatic snapshot creations. Currently a max of 1 resource policy is supported.
     * 
    */
    public Optional<String> getResourcePolicies() {
        return Optional.ofNullable(this.resourcePolicies);
    }
    /**
     * The name (**not self_link**)
     * of the disk (such as those managed by `gcp.compute.Disk`) to attach.
     * > **Note:** Either `source` or `source_image` is **required** in a disk block unless the disk type is `local-ssd`. Check the API [docs](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/insert) for details.
     * 
    */
    public Optional<String> getSource() {
        return Optional.ofNullable(this.source);
    }
    /**
     * The image from which to
     * initialize this disk. This can be one of: the image's `self_link`,
     * `projects/{project}/global/images/{image}`,
     * `projects/{project}/global/images/family/{family}`, `global/images/{image}`,
     * `global/images/family/{family}`, `family/{family}`, `{project}/{family}`,
     * `{project}/{image}`, `{family}`, or `{image}`.
     * > **Note:** Either `source` or `source_image` is **required** in a disk block unless the disk type is `local-ssd`. Check the API [docs](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/insert) for details.
     * 
    */
    public Optional<String> getSourceImage() {
        return Optional.ofNullable(this.sourceImage);
    }
    /**
     * The type of reservation from which this instance can consume resources.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateDisk defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoDelete;
        private @Nullable Boolean boot;
        private @Nullable String deviceName;
        private @Nullable InstanceTemplateDiskDiskEncryptionKey diskEncryptionKey;
        private @Nullable String diskName;
        private @Nullable Integer diskSizeGb;
        private @Nullable String diskType;
        private @Nullable String $interface;
        private @Nullable Map<String,String> labels;
        private @Nullable String mode;
        private @Nullable String resourcePolicies;
        private @Nullable String source;
        private @Nullable String sourceImage;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.boot = defaults.boot;
    	      this.deviceName = defaults.deviceName;
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.diskName = defaults.diskName;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.$interface = defaults.$interface;
    	      this.labels = defaults.labels;
    	      this.mode = defaults.mode;
    	      this.resourcePolicies = defaults.resourcePolicies;
    	      this.source = defaults.source;
    	      this.sourceImage = defaults.sourceImage;
    	      this.type = defaults.type;
        }

        public Builder setAutoDelete(@Nullable Boolean autoDelete) {
            this.autoDelete = autoDelete;
            return this;
        }

        public Builder setBoot(@Nullable Boolean boot) {
            this.boot = boot;
            return this;
        }

        public Builder setDeviceName(@Nullable String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder setDiskEncryptionKey(@Nullable InstanceTemplateDiskDiskEncryptionKey diskEncryptionKey) {
            this.diskEncryptionKey = diskEncryptionKey;
            return this;
        }

        public Builder setDiskName(@Nullable String diskName) {
            this.diskName = diskName;
            return this;
        }

        public Builder setDiskSizeGb(@Nullable Integer diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }

        public Builder setDiskType(@Nullable String diskType) {
            this.diskType = diskType;
            return this;
        }

        public Builder set$interface(@Nullable String $interface) {
            this.$interface = $interface;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public Builder setResourcePolicies(@Nullable String resourcePolicies) {
            this.resourcePolicies = resourcePolicies;
            return this;
        }

        public Builder setSource(@Nullable String source) {
            this.source = source;
            return this;
        }

        public Builder setSourceImage(@Nullable String sourceImage) {
            this.sourceImage = sourceImage;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public InstanceTemplateDisk build() {
            return new InstanceTemplateDisk(autoDelete, boot, deviceName, diskEncryptionKey, diskName, diskSizeGb, diskType, $interface, labels, mode, resourcePolicies, source, sourceImage, type);
        }
    }
}