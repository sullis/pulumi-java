// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceEbsBlockDeviceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceEbsBlockDeviceArgs Empty = new InstanceEbsBlockDeviceArgs();

    @Import(name="deleteOnTermination")
      private final @Nullable Output<Boolean> deleteOnTermination;

    public Output<Boolean> deleteOnTermination() {
        return this.deleteOnTermination == null ? Codegen.empty() : this.deleteOnTermination;
    }

    @Import(name="deviceName", required=true)
      private final Output<String> deviceName;

    public Output<String> deviceName() {
        return this.deviceName;
    }

    @Import(name="iops")
      private final @Nullable Output<Integer> iops;

    public Output<Integer> iops() {
        return this.iops == null ? Codegen.empty() : this.iops;
    }

    @Import(name="snapshotId")
      private final @Nullable Output<String> snapshotId;

    public Output<String> snapshotId() {
        return this.snapshotId == null ? Codegen.empty() : this.snapshotId;
    }

    @Import(name="volumeSize")
      private final @Nullable Output<Integer> volumeSize;

    public Output<Integer> volumeSize() {
        return this.volumeSize == null ? Codegen.empty() : this.volumeSize;
    }

    @Import(name="volumeType")
      private final @Nullable Output<String> volumeType;

    public Output<String> volumeType() {
        return this.volumeType == null ? Codegen.empty() : this.volumeType;
    }

    public InstanceEbsBlockDeviceArgs(
        @Nullable Output<Boolean> deleteOnTermination,
        Output<String> deviceName,
        @Nullable Output<Integer> iops,
        @Nullable Output<String> snapshotId,
        @Nullable Output<Integer> volumeSize,
        @Nullable Output<String> volumeType) {
        this.deleteOnTermination = deleteOnTermination;
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.iops = iops;
        this.snapshotId = snapshotId;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    private InstanceEbsBlockDeviceArgs() {
        this.deleteOnTermination = Codegen.empty();
        this.deviceName = Codegen.empty();
        this.iops = Codegen.empty();
        this.snapshotId = Codegen.empty();
        this.volumeSize = Codegen.empty();
        this.volumeType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceEbsBlockDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> deleteOnTermination;
        private Output<String> deviceName;
        private @Nullable Output<Integer> iops;
        private @Nullable Output<String> snapshotId;
        private @Nullable Output<Integer> volumeSize;
        private @Nullable Output<String> volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceEbsBlockDeviceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.deviceName = defaults.deviceName;
    	      this.iops = defaults.iops;
    	      this.snapshotId = defaults.snapshotId;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder deleteOnTermination(@Nullable Output<Boolean> deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }
        public Builder deleteOnTermination(@Nullable Boolean deleteOnTermination) {
            this.deleteOnTermination = Codegen.ofNullable(deleteOnTermination);
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
        public Builder iops(@Nullable Output<Integer> iops) {
            this.iops = iops;
            return this;
        }
        public Builder iops(@Nullable Integer iops) {
            this.iops = Codegen.ofNullable(iops);
            return this;
        }
        public Builder snapshotId(@Nullable Output<String> snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public Builder snapshotId(@Nullable String snapshotId) {
            this.snapshotId = Codegen.ofNullable(snapshotId);
            return this;
        }
        public Builder volumeSize(@Nullable Output<Integer> volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }
        public Builder volumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = Codegen.ofNullable(volumeSize);
            return this;
        }
        public Builder volumeType(@Nullable Output<String> volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public Builder volumeType(@Nullable String volumeType) {
            this.volumeType = Codegen.ofNullable(volumeType);
            return this;
        }        public InstanceEbsBlockDeviceArgs build() {
            return new InstanceEbsBlockDeviceArgs(deleteOnTermination, deviceName, iops, snapshotId, volumeSize, volumeType);
        }
    }
}
