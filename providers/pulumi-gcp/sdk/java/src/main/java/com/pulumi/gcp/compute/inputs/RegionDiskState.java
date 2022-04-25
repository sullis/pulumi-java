// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.RegionDiskDiskEncryptionKeyGetArgs;
import com.pulumi.gcp.compute.inputs.RegionDiskSourceSnapshotEncryptionKeyGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionDiskState extends com.pulumi.resources.ResourceArgs {

    public static final RegionDiskState Empty = new RegionDiskState();

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Import(name="creationTimestamp")
    private @Nullable Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Optional<Output<String>> creationTimestamp() {
        return Optional.ofNullable(this.creationTimestamp);
    }

    /**
     * An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Encrypts the disk using a customer-supplied encryption key.
     * After you encrypt a disk with a customer-supplied key, you must
     * provide the same key if you use the disk later (e.g. to create a disk
     * snapshot or an image, or to attach the disk to a virtual machine).
     * Customer-supplied encryption keys do not protect access to metadata of
     * the disk.
     * If you do not provide an encryption key when creating the disk, then
     * the disk will be encrypted using an automatically generated key and
     * you do not need to provide a key to use the disk later.
     * Structure is documented below.
     * 
     */
    @Import(name="diskEncryptionKey")
    private @Nullable Output<RegionDiskDiskEncryptionKeyGetArgs> diskEncryptionKey;

    /**
     * @return Encrypts the disk using a customer-supplied encryption key.
     * After you encrypt a disk with a customer-supplied key, you must
     * provide the same key if you use the disk later (e.g. to create a disk
     * snapshot or an image, or to attach the disk to a virtual machine).
     * Customer-supplied encryption keys do not protect access to metadata of
     * the disk.
     * If you do not provide an encryption key when creating the disk, then
     * the disk will be encrypted using an automatically generated key and
     * you do not need to provide a key to use the disk later.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionDiskDiskEncryptionKeyGetArgs>> diskEncryptionKey() {
        return Optional.ofNullable(this.diskEncryptionKey);
    }

    /**
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI.
     * 
     * @deprecated
     * This field is no longer in use, disk interfaces will be automatically determined on attachment. To resolve this issue, remove this field from your config.
     * 
     */
    @Deprecated /* This field is no longer in use, disk interfaces will be automatically determined on attachment. To resolve this issue, remove this field from your config. */
    @Import(name="interface")
    private @Nullable Output<String> interface_;

    /**
     * @return Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI.
     * 
     * @deprecated
     * This field is no longer in use, disk interfaces will be automatically determined on attachment. To resolve this issue, remove this field from your config.
     * 
     */
    @Deprecated /* This field is no longer in use, disk interfaces will be automatically determined on attachment. To resolve this issue, remove this field from your config. */
    public Optional<Output<String>> interface_() {
        return Optional.ofNullable(this.interface_);
    }

    /**
     * The fingerprint used for optimistic locking of this resource. Used internally during updates.
     * 
     */
    @Import(name="labelFingerprint")
    private @Nullable Output<String> labelFingerprint;

    /**
     * @return The fingerprint used for optimistic locking of this resource. Used internally during updates.
     * 
     */
    public Optional<Output<String>> labelFingerprint() {
        return Optional.ofNullable(this.labelFingerprint);
    }

    /**
     * Labels to apply to this disk.  A list of key-&gt;value pairs.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels to apply to this disk.  A list of key-&gt;value pairs.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Last attach timestamp in RFC3339 text format.
     * 
     */
    @Import(name="lastAttachTimestamp")
    private @Nullable Output<String> lastAttachTimestamp;

    /**
     * @return Last attach timestamp in RFC3339 text format.
     * 
     */
    public Optional<Output<String>> lastAttachTimestamp() {
        return Optional.ofNullable(this.lastAttachTimestamp);
    }

    /**
     * Last detach timestamp in RFC3339 text format.
     * 
     */
    @Import(name="lastDetachTimestamp")
    private @Nullable Output<String> lastDetachTimestamp;

    /**
     * @return Last detach timestamp in RFC3339 text format.
     * 
     */
    public Optional<Output<String>> lastDetachTimestamp() {
        return Optional.ofNullable(this.lastDetachTimestamp);
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Physical block size of the persistent disk, in bytes. If not present
     * in a request, a default value is used. Currently supported sizes
     * are 4096 and 16384, other sizes may be added in the future.
     * If an unsupported value is requested, the error message will list
     * the supported values for the caller&#39;s project.
     * 
     */
    @Import(name="physicalBlockSizeBytes")
    private @Nullable Output<Integer> physicalBlockSizeBytes;

    /**
     * @return Physical block size of the persistent disk, in bytes. If not present
     * in a request, a default value is used. Currently supported sizes
     * are 4096 and 16384, other sizes may be added in the future.
     * If an unsupported value is requested, the error message will list
     * the supported values for the caller&#39;s project.
     * 
     */
    public Optional<Output<Integer>> physicalBlockSizeBytes() {
        return Optional.ofNullable(this.physicalBlockSizeBytes);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * A reference to the region where the disk resides.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return A reference to the region where the disk resides.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * URLs of the zones where the disk should be replicated to.
     * 
     */
    @Import(name="replicaZones")
    private @Nullable Output<List<String>> replicaZones;

    /**
     * @return URLs of the zones where the disk should be replicated to.
     * 
     */
    public Optional<Output<List<String>>> replicaZones() {
        return Optional.ofNullable(this.replicaZones);
    }

    /**
     * The URI of the created resource.
     * 
     */
    @Import(name="selfLink")
    private @Nullable Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Optional<Output<String>> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }

    /**
     * Size of the persistent disk, specified in GB. You can specify this
     * field when creating a persistent disk using the sourceImage or
     * sourceSnapshot parameter, or specify it alone to create an empty
     * persistent disk.
     * If you specify this field along with sourceImage or sourceSnapshot,
     * the value of sizeGb must not be less than the size of the sourceImage
     * or the size of the snapshot.
     * 
     */
    @Import(name="size")
    private @Nullable Output<Integer> size;

    /**
     * @return Size of the persistent disk, specified in GB. You can specify this
     * field when creating a persistent disk using the sourceImage or
     * sourceSnapshot parameter, or specify it alone to create an empty
     * persistent disk.
     * If you specify this field along with sourceImage or sourceSnapshot,
     * the value of sizeGb must not be less than the size of the sourceImage
     * or the size of the snapshot.
     * 
     */
    public Optional<Output<Integer>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * The source snapshot used to create this disk. You can provide this as
     * a partial or full URL to the resource. For example, the following are
     * valid values:
     * * `https://www.googleapis.com/compute/v1/projects/project/global/snapshots/snapshot`
     * * `projects/project/global/snapshots/snapshot`
     * * `global/snapshots/snapshot`
     * * `snapshot`
     * 
     */
    @Import(name="snapshot")
    private @Nullable Output<String> snapshot;

    /**
     * @return The source snapshot used to create this disk. You can provide this as
     * a partial or full URL to the resource. For example, the following are
     * valid values:
     * * `https://www.googleapis.com/compute/v1/projects/project/global/snapshots/snapshot`
     * * `projects/project/global/snapshots/snapshot`
     * * `global/snapshots/snapshot`
     * * `snapshot`
     * 
     */
    public Optional<Output<String>> snapshot() {
        return Optional.ofNullable(this.snapshot);
    }

    /**
     * The customer-supplied encryption key of the source snapshot. Required
     * if the source snapshot is protected by a customer-supplied encryption
     * key.
     * Structure is documented below.
     * 
     */
    @Import(name="sourceSnapshotEncryptionKey")
    private @Nullable Output<RegionDiskSourceSnapshotEncryptionKeyGetArgs> sourceSnapshotEncryptionKey;

    /**
     * @return The customer-supplied encryption key of the source snapshot. Required
     * if the source snapshot is protected by a customer-supplied encryption
     * key.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionDiskSourceSnapshotEncryptionKeyGetArgs>> sourceSnapshotEncryptionKey() {
        return Optional.ofNullable(this.sourceSnapshotEncryptionKey);
    }

    /**
     * The unique ID of the snapshot used to create this disk. This value identifies the exact snapshot that was used to create
     * this persistent disk. For example, if you created the persistent disk from a snapshot that was later deleted and
     * recreated under the same name, the source snapshot ID would identify the exact version of the snapshot that was used.
     * 
     */
    @Import(name="sourceSnapshotId")
    private @Nullable Output<String> sourceSnapshotId;

    /**
     * @return The unique ID of the snapshot used to create this disk. This value identifies the exact snapshot that was used to create
     * this persistent disk. For example, if you created the persistent disk from a snapshot that was later deleted and
     * recreated under the same name, the source snapshot ID would identify the exact version of the snapshot that was used.
     * 
     */
    public Optional<Output<String>> sourceSnapshotId() {
        return Optional.ofNullable(this.sourceSnapshotId);
    }

    /**
     * URL of the disk type resource describing which disk type to use to
     * create the disk. Provide this when creating the disk.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return URL of the disk type resource describing which disk type to use to
     * create the disk. Provide this when creating the disk.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Links to the users of the disk (attached instances) in form: project/zones/zone/instances/instance
     * 
     */
    @Import(name="users")
    private @Nullable Output<List<String>> users;

    /**
     * @return Links to the users of the disk (attached instances) in form: project/zones/zone/instances/instance
     * 
     */
    public Optional<Output<List<String>>> users() {
        return Optional.ofNullable(this.users);
    }

    private RegionDiskState() {}

    private RegionDiskState(RegionDiskState $) {
        this.creationTimestamp = $.creationTimestamp;
        this.description = $.description;
        this.diskEncryptionKey = $.diskEncryptionKey;
        this.interface_ = $.interface_;
        this.labelFingerprint = $.labelFingerprint;
        this.labels = $.labels;
        this.lastAttachTimestamp = $.lastAttachTimestamp;
        this.lastDetachTimestamp = $.lastDetachTimestamp;
        this.name = $.name;
        this.physicalBlockSizeBytes = $.physicalBlockSizeBytes;
        this.project = $.project;
        this.region = $.region;
        this.replicaZones = $.replicaZones;
        this.selfLink = $.selfLink;
        this.size = $.size;
        this.snapshot = $.snapshot;
        this.sourceSnapshotEncryptionKey = $.sourceSnapshotEncryptionKey;
        this.sourceSnapshotId = $.sourceSnapshotId;
        this.type = $.type;
        this.users = $.users;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionDiskState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionDiskState $;

        public Builder() {
            $ = new RegionDiskState();
        }

        public Builder(RegionDiskState defaults) {
            $ = new RegionDiskState(Objects.requireNonNull(defaults));
        }

        /**
         * @param creationTimestamp Creation timestamp in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder creationTimestamp(@Nullable Output<String> creationTimestamp) {
            $.creationTimestamp = creationTimestamp;
            return this;
        }

        /**
         * @param creationTimestamp Creation timestamp in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder creationTimestamp(String creationTimestamp) {
            return creationTimestamp(Output.of(creationTimestamp));
        }

        /**
         * @param description An optional description of this resource. Provide this property when
         * you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when
         * you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param diskEncryptionKey Encrypts the disk using a customer-supplied encryption key.
         * After you encrypt a disk with a customer-supplied key, you must
         * provide the same key if you use the disk later (e.g. to create a disk
         * snapshot or an image, or to attach the disk to a virtual machine).
         * Customer-supplied encryption keys do not protect access to metadata of
         * the disk.
         * If you do not provide an encryption key when creating the disk, then
         * the disk will be encrypted using an automatically generated key and
         * you do not need to provide a key to use the disk later.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionKey(@Nullable Output<RegionDiskDiskEncryptionKeyGetArgs> diskEncryptionKey) {
            $.diskEncryptionKey = diskEncryptionKey;
            return this;
        }

        /**
         * @param diskEncryptionKey Encrypts the disk using a customer-supplied encryption key.
         * After you encrypt a disk with a customer-supplied key, you must
         * provide the same key if you use the disk later (e.g. to create a disk
         * snapshot or an image, or to attach the disk to a virtual machine).
         * Customer-supplied encryption keys do not protect access to metadata of
         * the disk.
         * If you do not provide an encryption key when creating the disk, then
         * the disk will be encrypted using an automatically generated key and
         * you do not need to provide a key to use the disk later.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionKey(RegionDiskDiskEncryptionKeyGetArgs diskEncryptionKey) {
            return diskEncryptionKey(Output.of(diskEncryptionKey));
        }

        /**
         * @param interface_ Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI.
         * 
         * @return builder
         * 
         * @deprecated
         * This field is no longer in use, disk interfaces will be automatically determined on attachment. To resolve this issue, remove this field from your config.
         * 
         */
        @Deprecated /* This field is no longer in use, disk interfaces will be automatically determined on attachment. To resolve this issue, remove this field from your config. */
        public Builder interface_(@Nullable Output<String> interface_) {
            $.interface_ = interface_;
            return this;
        }

        /**
         * @param interface_ Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI.
         * 
         * @return builder
         * 
         * @deprecated
         * This field is no longer in use, disk interfaces will be automatically determined on attachment. To resolve this issue, remove this field from your config.
         * 
         */
        @Deprecated /* This field is no longer in use, disk interfaces will be automatically determined on attachment. To resolve this issue, remove this field from your config. */
        public Builder interface_(String interface_) {
            return interface_(Output.of(interface_));
        }

        /**
         * @param labelFingerprint The fingerprint used for optimistic locking of this resource. Used internally during updates.
         * 
         * @return builder
         * 
         */
        public Builder labelFingerprint(@Nullable Output<String> labelFingerprint) {
            $.labelFingerprint = labelFingerprint;
            return this;
        }

        /**
         * @param labelFingerprint The fingerprint used for optimistic locking of this resource. Used internally during updates.
         * 
         * @return builder
         * 
         */
        public Builder labelFingerprint(String labelFingerprint) {
            return labelFingerprint(Output.of(labelFingerprint));
        }

        /**
         * @param labels Labels to apply to this disk.  A list of key-&gt;value pairs.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels to apply to this disk.  A list of key-&gt;value pairs.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param lastAttachTimestamp Last attach timestamp in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder lastAttachTimestamp(@Nullable Output<String> lastAttachTimestamp) {
            $.lastAttachTimestamp = lastAttachTimestamp;
            return this;
        }

        /**
         * @param lastAttachTimestamp Last attach timestamp in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder lastAttachTimestamp(String lastAttachTimestamp) {
            return lastAttachTimestamp(Output.of(lastAttachTimestamp));
        }

        /**
         * @param lastDetachTimestamp Last detach timestamp in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder lastDetachTimestamp(@Nullable Output<String> lastDetachTimestamp) {
            $.lastDetachTimestamp = lastDetachTimestamp;
            return this;
        }

        /**
         * @param lastDetachTimestamp Last detach timestamp in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder lastDetachTimestamp(String lastDetachTimestamp) {
            return lastDetachTimestamp(Output.of(lastDetachTimestamp));
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is
         * created. The name must be 1-63 characters long, and comply with
         * RFC1035. Specifically, the name must be 1-63 characters long and match
         * the regular expression `a-z?` which means the
         * first character must be a lowercase letter, and all following
         * characters must be a dash, lowercase letter, or digit, except the last
         * character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is
         * created. The name must be 1-63 characters long, and comply with
         * RFC1035. Specifically, the name must be 1-63 characters long and match
         * the regular expression `a-z?` which means the
         * first character must be a lowercase letter, and all following
         * characters must be a dash, lowercase letter, or digit, except the last
         * character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param physicalBlockSizeBytes Physical block size of the persistent disk, in bytes. If not present
         * in a request, a default value is used. Currently supported sizes
         * are 4096 and 16384, other sizes may be added in the future.
         * If an unsupported value is requested, the error message will list
         * the supported values for the caller&#39;s project.
         * 
         * @return builder
         * 
         */
        public Builder physicalBlockSizeBytes(@Nullable Output<Integer> physicalBlockSizeBytes) {
            $.physicalBlockSizeBytes = physicalBlockSizeBytes;
            return this;
        }

        /**
         * @param physicalBlockSizeBytes Physical block size of the persistent disk, in bytes. If not present
         * in a request, a default value is used. Currently supported sizes
         * are 4096 and 16384, other sizes may be added in the future.
         * If an unsupported value is requested, the error message will list
         * the supported values for the caller&#39;s project.
         * 
         * @return builder
         * 
         */
        public Builder physicalBlockSizeBytes(Integer physicalBlockSizeBytes) {
            return physicalBlockSizeBytes(Output.of(physicalBlockSizeBytes));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param region A reference to the region where the disk resides.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region A reference to the region where the disk resides.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param replicaZones URLs of the zones where the disk should be replicated to.
         * 
         * @return builder
         * 
         */
        public Builder replicaZones(@Nullable Output<List<String>> replicaZones) {
            $.replicaZones = replicaZones;
            return this;
        }

        /**
         * @param replicaZones URLs of the zones where the disk should be replicated to.
         * 
         * @return builder
         * 
         */
        public Builder replicaZones(List<String> replicaZones) {
            return replicaZones(Output.of(replicaZones));
        }

        /**
         * @param replicaZones URLs of the zones where the disk should be replicated to.
         * 
         * @return builder
         * 
         */
        public Builder replicaZones(String... replicaZones) {
            return replicaZones(List.of(replicaZones));
        }

        /**
         * @param selfLink The URI of the created resource.
         * 
         * @return builder
         * 
         */
        public Builder selfLink(@Nullable Output<String> selfLink) {
            $.selfLink = selfLink;
            return this;
        }

        /**
         * @param selfLink The URI of the created resource.
         * 
         * @return builder
         * 
         */
        public Builder selfLink(String selfLink) {
            return selfLink(Output.of(selfLink));
        }

        /**
         * @param size Size of the persistent disk, specified in GB. You can specify this
         * field when creating a persistent disk using the sourceImage or
         * sourceSnapshot parameter, or specify it alone to create an empty
         * persistent disk.
         * If you specify this field along with sourceImage or sourceSnapshot,
         * the value of sizeGb must not be less than the size of the sourceImage
         * or the size of the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size Size of the persistent disk, specified in GB. You can specify this
         * field when creating a persistent disk using the sourceImage or
         * sourceSnapshot parameter, or specify it alone to create an empty
         * persistent disk.
         * If you specify this field along with sourceImage or sourceSnapshot,
         * the value of sizeGb must not be less than the size of the sourceImage
         * or the size of the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        /**
         * @param snapshot The source snapshot used to create this disk. You can provide this as
         * a partial or full URL to the resource. For example, the following are
         * valid values:
         * * `https://www.googleapis.com/compute/v1/projects/project/global/snapshots/snapshot`
         * * `projects/project/global/snapshots/snapshot`
         * * `global/snapshots/snapshot`
         * * `snapshot`
         * 
         * @return builder
         * 
         */
        public Builder snapshot(@Nullable Output<String> snapshot) {
            $.snapshot = snapshot;
            return this;
        }

        /**
         * @param snapshot The source snapshot used to create this disk. You can provide this as
         * a partial or full URL to the resource. For example, the following are
         * valid values:
         * * `https://www.googleapis.com/compute/v1/projects/project/global/snapshots/snapshot`
         * * `projects/project/global/snapshots/snapshot`
         * * `global/snapshots/snapshot`
         * * `snapshot`
         * 
         * @return builder
         * 
         */
        public Builder snapshot(String snapshot) {
            return snapshot(Output.of(snapshot));
        }

        /**
         * @param sourceSnapshotEncryptionKey The customer-supplied encryption key of the source snapshot. Required
         * if the source snapshot is protected by a customer-supplied encryption
         * key.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sourceSnapshotEncryptionKey(@Nullable Output<RegionDiskSourceSnapshotEncryptionKeyGetArgs> sourceSnapshotEncryptionKey) {
            $.sourceSnapshotEncryptionKey = sourceSnapshotEncryptionKey;
            return this;
        }

        /**
         * @param sourceSnapshotEncryptionKey The customer-supplied encryption key of the source snapshot. Required
         * if the source snapshot is protected by a customer-supplied encryption
         * key.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sourceSnapshotEncryptionKey(RegionDiskSourceSnapshotEncryptionKeyGetArgs sourceSnapshotEncryptionKey) {
            return sourceSnapshotEncryptionKey(Output.of(sourceSnapshotEncryptionKey));
        }

        /**
         * @param sourceSnapshotId The unique ID of the snapshot used to create this disk. This value identifies the exact snapshot that was used to create
         * this persistent disk. For example, if you created the persistent disk from a snapshot that was later deleted and
         * recreated under the same name, the source snapshot ID would identify the exact version of the snapshot that was used.
         * 
         * @return builder
         * 
         */
        public Builder sourceSnapshotId(@Nullable Output<String> sourceSnapshotId) {
            $.sourceSnapshotId = sourceSnapshotId;
            return this;
        }

        /**
         * @param sourceSnapshotId The unique ID of the snapshot used to create this disk. This value identifies the exact snapshot that was used to create
         * this persistent disk. For example, if you created the persistent disk from a snapshot that was later deleted and
         * recreated under the same name, the source snapshot ID would identify the exact version of the snapshot that was used.
         * 
         * @return builder
         * 
         */
        public Builder sourceSnapshotId(String sourceSnapshotId) {
            return sourceSnapshotId(Output.of(sourceSnapshotId));
        }

        /**
         * @param type URL of the disk type resource describing which disk type to use to
         * create the disk. Provide this when creating the disk.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type URL of the disk type resource describing which disk type to use to
         * create the disk. Provide this when creating the disk.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param users Links to the users of the disk (attached instances) in form: project/zones/zone/instances/instance
         * 
         * @return builder
         * 
         */
        public Builder users(@Nullable Output<List<String>> users) {
            $.users = users;
            return this;
        }

        /**
         * @param users Links to the users of the disk (attached instances) in form: project/zones/zone/instances/instance
         * 
         * @return builder
         * 
         */
        public Builder users(List<String> users) {
            return users(Output.of(users));
        }

        /**
         * @param users Links to the users of the disk (attached instances) in form: project/zones/zone/instances/instance
         * 
         * @return builder
         * 
         */
        public Builder users(String... users) {
            return users(List.of(users));
        }

        public RegionDiskState build() {
            return $;
        }
    }

}
