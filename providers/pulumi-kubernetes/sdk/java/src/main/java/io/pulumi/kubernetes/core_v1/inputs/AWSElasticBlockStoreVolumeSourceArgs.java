// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a Persistent Disk resource in AWS.
 * 
 * An AWS EBS disk must exist before mounting to a container. The disk must also be in the same AWS zone as the kubelet. An AWS EBS disk can only be mounted as read/write once. AWS EBS volumes support ownership management and SELinux relabeling.
 * 
 */
public final class AWSElasticBlockStoreVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AWSElasticBlockStoreVolumeSourceArgs Empty = new AWSElasticBlockStoreVolumeSourceArgs();

    /**
     * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     * 
     */
    @InputImport(name="fsType")
    private final @Nullable Input<String> fsType;

    public Input<String> getFsType() {
        return this.fsType == null ? Input.empty() : this.fsType;
    }

    /**
     * The partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).
     * 
     */
    @InputImport(name="partition")
    private final @Nullable Input<Integer> partition;

    public Input<Integer> getPartition() {
        return this.partition == null ? Input.empty() : this.partition;
    }

    /**
     * Specify "true" to force and set the ReadOnly property in VolumeMounts to "true". If omitted, the default is "false". More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     * 
     */
    @InputImport(name="readOnly")
    private final @Nullable Input<Boolean> readOnly;

    public Input<Boolean> getReadOnly() {
        return this.readOnly == null ? Input.empty() : this.readOnly;
    }

    /**
     * Unique ID of the persistent disk resource in AWS (Amazon EBS volume). More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     * 
     */
    @InputImport(name="volumeID", required=true)
    private final Input<String> volumeID;

    public Input<String> getVolumeID() {
        return this.volumeID;
    }

    public AWSElasticBlockStoreVolumeSourceArgs(
        @Nullable Input<String> fsType,
        @Nullable Input<Integer> partition,
        @Nullable Input<Boolean> readOnly,
        Input<String> volumeID) {
        this.fsType = fsType;
        this.partition = partition;
        this.readOnly = readOnly;
        this.volumeID = Objects.requireNonNull(volumeID, "expected parameter 'volumeID' to be non-null");
    }

    private AWSElasticBlockStoreVolumeSourceArgs() {
        this.fsType = Input.empty();
        this.partition = Input.empty();
        this.readOnly = Input.empty();
        this.volumeID = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AWSElasticBlockStoreVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> fsType;
        private @Nullable Input<Integer> partition;
        private @Nullable Input<Boolean> readOnly;
        private Input<String> volumeID;

        public Builder() {
    	      // Empty
        }

        public Builder(AWSElasticBlockStoreVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.partition = defaults.partition;
    	      this.readOnly = defaults.readOnly;
    	      this.volumeID = defaults.volumeID;
        }

        public Builder setFsType(@Nullable Input<String> fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder setFsType(@Nullable String fsType) {
            this.fsType = Input.ofNullable(fsType);
            return this;
        }

        public Builder setPartition(@Nullable Input<Integer> partition) {
            this.partition = partition;
            return this;
        }

        public Builder setPartition(@Nullable Integer partition) {
            this.partition = Input.ofNullable(partition);
            return this;
        }

        public Builder setReadOnly(@Nullable Input<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = Input.ofNullable(readOnly);
            return this;
        }

        public Builder setVolumeID(Input<String> volumeID) {
            this.volumeID = Objects.requireNonNull(volumeID);
            return this;
        }

        public Builder setVolumeID(String volumeID) {
            this.volumeID = Input.of(Objects.requireNonNull(volumeID));
            return this;
        }

        public AWSElasticBlockStoreVolumeSourceArgs build() {
            return new AWSElasticBlockStoreVolumeSourceArgs(fsType, partition, readOnly, volumeID);
        }
    }
}
