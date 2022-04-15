// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.outputs;

import io.pulumi.awsnative.imagebuilder.enums.ContainerRecipeEbsInstanceBlockDeviceSpecificationVolumeType;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerRecipeEbsInstanceBlockDeviceSpecification {
    /**
     * Use to configure delete on termination of the associated device.
     * 
     */
    private final @Nullable Boolean deleteOnTermination;
    /**
     * Use to configure device encryption.
     * 
     */
    private final @Nullable Boolean encrypted;
    /**
     * Use to configure device IOPS.
     * 
     */
    private final @Nullable Integer iops;
    /**
     * Use to configure the KMS key to use when encrypting the device.
     * 
     */
    private final @Nullable String kmsKeyId;
    /**
     * The snapshot that defines the device contents.
     * 
     */
    private final @Nullable String snapshotId;
    /**
     * For GP3 volumes only – The throughput in MiB/s that the volume supports.
     * 
     */
    private final @Nullable Integer throughput;
    /**
     * Use to override the device's volume size.
     * 
     */
    private final @Nullable Integer volumeSize;
    /**
     * Use to override the device's volume type.
     * 
     */
    private final @Nullable ContainerRecipeEbsInstanceBlockDeviceSpecificationVolumeType volumeType;

    @CustomType.Constructor
    private ContainerRecipeEbsInstanceBlockDeviceSpecification(
        @CustomType.Parameter("deleteOnTermination") @Nullable Boolean deleteOnTermination,
        @CustomType.Parameter("encrypted") @Nullable Boolean encrypted,
        @CustomType.Parameter("iops") @Nullable Integer iops,
        @CustomType.Parameter("kmsKeyId") @Nullable String kmsKeyId,
        @CustomType.Parameter("snapshotId") @Nullable String snapshotId,
        @CustomType.Parameter("throughput") @Nullable Integer throughput,
        @CustomType.Parameter("volumeSize") @Nullable Integer volumeSize,
        @CustomType.Parameter("volumeType") @Nullable ContainerRecipeEbsInstanceBlockDeviceSpecificationVolumeType volumeType) {
        this.deleteOnTermination = deleteOnTermination;
        this.encrypted = encrypted;
        this.iops = iops;
        this.kmsKeyId = kmsKeyId;
        this.snapshotId = snapshotId;
        this.throughput = throughput;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    /**
     * Use to configure delete on termination of the associated device.
     * 
    */
    public Optional<Boolean> deleteOnTermination() {
        return Optional.ofNullable(this.deleteOnTermination);
    }
    /**
     * Use to configure device encryption.
     * 
    */
    public Optional<Boolean> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }
    /**
     * Use to configure device IOPS.
     * 
    */
    public Optional<Integer> iops() {
        return Optional.ofNullable(this.iops);
    }
    /**
     * Use to configure the KMS key to use when encrypting the device.
     * 
    */
    public Optional<String> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * The snapshot that defines the device contents.
     * 
    */
    public Optional<String> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }
    /**
     * For GP3 volumes only – The throughput in MiB/s that the volume supports.
     * 
    */
    public Optional<Integer> throughput() {
        return Optional.ofNullable(this.throughput);
    }
    /**
     * Use to override the device's volume size.
     * 
    */
    public Optional<Integer> volumeSize() {
        return Optional.ofNullable(this.volumeSize);
    }
    /**
     * Use to override the device's volume type.
     * 
    */
    public Optional<ContainerRecipeEbsInstanceBlockDeviceSpecificationVolumeType> volumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerRecipeEbsInstanceBlockDeviceSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean deleteOnTermination;
        private @Nullable Boolean encrypted;
        private @Nullable Integer iops;
        private @Nullable String kmsKeyId;
        private @Nullable String snapshotId;
        private @Nullable Integer throughput;
        private @Nullable Integer volumeSize;
        private @Nullable ContainerRecipeEbsInstanceBlockDeviceSpecificationVolumeType volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerRecipeEbsInstanceBlockDeviceSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.snapshotId = defaults.snapshotId;
    	      this.throughput = defaults.throughput;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder deleteOnTermination(@Nullable Boolean deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }
        public Builder encrypted(@Nullable Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Builder iops(@Nullable Integer iops) {
            this.iops = iops;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder snapshotId(@Nullable String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public Builder throughput(@Nullable Integer throughput) {
            this.throughput = throughput;
            return this;
        }
        public Builder volumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }
        public Builder volumeType(@Nullable ContainerRecipeEbsInstanceBlockDeviceSpecificationVolumeType volumeType) {
            this.volumeType = volumeType;
            return this;
        }        public ContainerRecipeEbsInstanceBlockDeviceSpecification build() {
            return new ContainerRecipeEbsInstanceBlockDeviceSpecification(deleteOnTermination, encrypted, iops, kmsKeyId, snapshotId, throughput, volumeSize, volumeType);
        }
    }
}
