// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LaunchConfigurationEbsBlockDeviceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchConfigurationEbsBlockDeviceGetArgs Empty = new LaunchConfigurationEbsBlockDeviceGetArgs();

    @Import(name="deleteOnTermination")
      private final @Nullable Output<Boolean> deleteOnTermination;

    public Output<Boolean> getDeleteOnTermination() {
        return this.deleteOnTermination == null ? Output.empty() : this.deleteOnTermination;
    }

    @Import(name="deviceName", required=true)
      private final Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName;
    }

    @Import(name="encrypted")
      private final @Nullable Output<Boolean> encrypted;

    public Output<Boolean> getEncrypted() {
        return this.encrypted == null ? Output.empty() : this.encrypted;
    }

    @Import(name="iops")
      private final @Nullable Output<Integer> iops;

    public Output<Integer> getIops() {
        return this.iops == null ? Output.empty() : this.iops;
    }

    @Import(name="noDevice")
      private final @Nullable Output<Boolean> noDevice;

    public Output<Boolean> getNoDevice() {
        return this.noDevice == null ? Output.empty() : this.noDevice;
    }

    @Import(name="snapshotId")
      private final @Nullable Output<String> snapshotId;

    public Output<String> getSnapshotId() {
        return this.snapshotId == null ? Output.empty() : this.snapshotId;
    }

    @Import(name="throughput")
      private final @Nullable Output<Integer> throughput;

    public Output<Integer> getThroughput() {
        return this.throughput == null ? Output.empty() : this.throughput;
    }

    @Import(name="volumeSize")
      private final @Nullable Output<Integer> volumeSize;

    public Output<Integer> getVolumeSize() {
        return this.volumeSize == null ? Output.empty() : this.volumeSize;
    }

    @Import(name="volumeType")
      private final @Nullable Output<String> volumeType;

    public Output<String> getVolumeType() {
        return this.volumeType == null ? Output.empty() : this.volumeType;
    }

    public LaunchConfigurationEbsBlockDeviceGetArgs(
        @Nullable Output<Boolean> deleteOnTermination,
        Output<String> deviceName,
        @Nullable Output<Boolean> encrypted,
        @Nullable Output<Integer> iops,
        @Nullable Output<Boolean> noDevice,
        @Nullable Output<String> snapshotId,
        @Nullable Output<Integer> throughput,
        @Nullable Output<Integer> volumeSize,
        @Nullable Output<String> volumeType) {
        this.deleteOnTermination = deleteOnTermination;
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.encrypted = encrypted;
        this.iops = iops;
        this.noDevice = noDevice;
        this.snapshotId = snapshotId;
        this.throughput = throughput;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    private LaunchConfigurationEbsBlockDeviceGetArgs() {
        this.deleteOnTermination = Output.empty();
        this.deviceName = Output.empty();
        this.encrypted = Output.empty();
        this.iops = Output.empty();
        this.noDevice = Output.empty();
        this.snapshotId = Output.empty();
        this.throughput = Output.empty();
        this.volumeSize = Output.empty();
        this.volumeType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchConfigurationEbsBlockDeviceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> deleteOnTermination;
        private Output<String> deviceName;
        private @Nullable Output<Boolean> encrypted;
        private @Nullable Output<Integer> iops;
        private @Nullable Output<Boolean> noDevice;
        private @Nullable Output<String> snapshotId;
        private @Nullable Output<Integer> throughput;
        private @Nullable Output<Integer> volumeSize;
        private @Nullable Output<String> volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchConfigurationEbsBlockDeviceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.deviceName = defaults.deviceName;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.noDevice = defaults.noDevice;
    	      this.snapshotId = defaults.snapshotId;
    	      this.throughput = defaults.throughput;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder deleteOnTermination(@Nullable Output<Boolean> deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }
        public Builder deleteOnTermination(@Nullable Boolean deleteOnTermination) {
            this.deleteOnTermination = Output.ofNullable(deleteOnTermination);
            return this;
        }
        public Builder deviceName(Output<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Output.of(Objects.requireNonNull(deviceName));
            return this;
        }
        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Builder encrypted(@Nullable Boolean encrypted) {
            this.encrypted = Output.ofNullable(encrypted);
            return this;
        }
        public Builder iops(@Nullable Output<Integer> iops) {
            this.iops = iops;
            return this;
        }
        public Builder iops(@Nullable Integer iops) {
            this.iops = Output.ofNullable(iops);
            return this;
        }
        public Builder noDevice(@Nullable Output<Boolean> noDevice) {
            this.noDevice = noDevice;
            return this;
        }
        public Builder noDevice(@Nullable Boolean noDevice) {
            this.noDevice = Output.ofNullable(noDevice);
            return this;
        }
        public Builder snapshotId(@Nullable Output<String> snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public Builder snapshotId(@Nullable String snapshotId) {
            this.snapshotId = Output.ofNullable(snapshotId);
            return this;
        }
        public Builder throughput(@Nullable Output<Integer> throughput) {
            this.throughput = throughput;
            return this;
        }
        public Builder throughput(@Nullable Integer throughput) {
            this.throughput = Output.ofNullable(throughput);
            return this;
        }
        public Builder volumeSize(@Nullable Output<Integer> volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }
        public Builder volumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = Output.ofNullable(volumeSize);
            return this;
        }
        public Builder volumeType(@Nullable Output<String> volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public Builder volumeType(@Nullable String volumeType) {
            this.volumeType = Output.ofNullable(volumeType);
            return this;
        }        public LaunchConfigurationEbsBlockDeviceGetArgs build() {
            return new LaunchConfigurationEbsBlockDeviceGetArgs(deleteOnTermination, deviceName, encrypted, iops, noDevice, snapshotId, throughput, volumeSize, volumeType);
        }
    }
}
