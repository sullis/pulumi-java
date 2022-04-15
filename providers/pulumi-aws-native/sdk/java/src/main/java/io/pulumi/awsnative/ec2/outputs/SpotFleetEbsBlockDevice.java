// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.enums.SpotFleetEbsBlockDeviceVolumeType;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpotFleetEbsBlockDevice {
    private final @Nullable Boolean deleteOnTermination;
    private final @Nullable Boolean encrypted;
    private final @Nullable Integer iops;
    private final @Nullable String snapshotId;
    private final @Nullable Integer volumeSize;
    private final @Nullable SpotFleetEbsBlockDeviceVolumeType volumeType;

    @CustomType.Constructor
    private SpotFleetEbsBlockDevice(
        @CustomType.Parameter("deleteOnTermination") @Nullable Boolean deleteOnTermination,
        @CustomType.Parameter("encrypted") @Nullable Boolean encrypted,
        @CustomType.Parameter("iops") @Nullable Integer iops,
        @CustomType.Parameter("snapshotId") @Nullable String snapshotId,
        @CustomType.Parameter("volumeSize") @Nullable Integer volumeSize,
        @CustomType.Parameter("volumeType") @Nullable SpotFleetEbsBlockDeviceVolumeType volumeType) {
        this.deleteOnTermination = deleteOnTermination;
        this.encrypted = encrypted;
        this.iops = iops;
        this.snapshotId = snapshotId;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    public Optional<Boolean> deleteOnTermination() {
        return Optional.ofNullable(this.deleteOnTermination);
    }
    public Optional<Boolean> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }
    public Optional<Integer> iops() {
        return Optional.ofNullable(this.iops);
    }
    public Optional<String> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }
    public Optional<Integer> volumeSize() {
        return Optional.ofNullable(this.volumeSize);
    }
    public Optional<SpotFleetEbsBlockDeviceVolumeType> volumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetEbsBlockDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean deleteOnTermination;
        private @Nullable Boolean encrypted;
        private @Nullable Integer iops;
        private @Nullable String snapshotId;
        private @Nullable Integer volumeSize;
        private @Nullable SpotFleetEbsBlockDeviceVolumeType volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetEbsBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.snapshotId = defaults.snapshotId;
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
        public Builder snapshotId(@Nullable String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public Builder volumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }
        public Builder volumeType(@Nullable SpotFleetEbsBlockDeviceVolumeType volumeType) {
            this.volumeType = volumeType;
            return this;
        }        public SpotFleetEbsBlockDevice build() {
            return new SpotFleetEbsBlockDevice(deleteOnTermination, encrypted, iops, snapshotId, volumeSize, volumeType);
        }
    }
}
