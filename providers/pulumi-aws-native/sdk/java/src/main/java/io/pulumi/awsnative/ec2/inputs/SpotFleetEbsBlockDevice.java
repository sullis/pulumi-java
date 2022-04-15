// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.enums.SpotFleetEbsBlockDeviceVolumeType;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotFleetEbsBlockDevice extends io.pulumi.resources.InvokeArgs {

    public static final SpotFleetEbsBlockDevice Empty = new SpotFleetEbsBlockDevice();

    @Import(name="deleteOnTermination")
      private final @Nullable Boolean deleteOnTermination;

    public Optional<Boolean> deleteOnTermination() {
        return this.deleteOnTermination == null ? Optional.empty() : Optional.ofNullable(this.deleteOnTermination);
    }

    @Import(name="encrypted")
      private final @Nullable Boolean encrypted;

    public Optional<Boolean> encrypted() {
        return this.encrypted == null ? Optional.empty() : Optional.ofNullable(this.encrypted);
    }

    @Import(name="iops")
      private final @Nullable Integer iops;

    public Optional<Integer> iops() {
        return this.iops == null ? Optional.empty() : Optional.ofNullable(this.iops);
    }

    @Import(name="snapshotId")
      private final @Nullable String snapshotId;

    public Optional<String> snapshotId() {
        return this.snapshotId == null ? Optional.empty() : Optional.ofNullable(this.snapshotId);
    }

    @Import(name="volumeSize")
      private final @Nullable Integer volumeSize;

    public Optional<Integer> volumeSize() {
        return this.volumeSize == null ? Optional.empty() : Optional.ofNullable(this.volumeSize);
    }

    @Import(name="volumeType")
      private final @Nullable SpotFleetEbsBlockDeviceVolumeType volumeType;

    public Optional<SpotFleetEbsBlockDeviceVolumeType> volumeType() {
        return this.volumeType == null ? Optional.empty() : Optional.ofNullable(this.volumeType);
    }

    public SpotFleetEbsBlockDevice(
        @Nullable Boolean deleteOnTermination,
        @Nullable Boolean encrypted,
        @Nullable Integer iops,
        @Nullable String snapshotId,
        @Nullable Integer volumeSize,
        @Nullable SpotFleetEbsBlockDeviceVolumeType volumeType) {
        this.deleteOnTermination = deleteOnTermination;
        this.encrypted = encrypted;
        this.iops = iops;
        this.snapshotId = snapshotId;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    private SpotFleetEbsBlockDevice() {
        this.deleteOnTermination = null;
        this.encrypted = null;
        this.iops = null;
        this.snapshotId = null;
        this.volumeSize = null;
        this.volumeType = null;
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
