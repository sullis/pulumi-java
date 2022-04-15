// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.inputs.SpotFleetEbsBlockDeviceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotFleetBlockDeviceMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetBlockDeviceMappingArgs Empty = new SpotFleetBlockDeviceMappingArgs();

    @Import(name="deviceName", required=true)
      private final Output<String> deviceName;

    public Output<String> deviceName() {
        return this.deviceName;
    }

    @Import(name="ebs")
      private final @Nullable Output<SpotFleetEbsBlockDeviceArgs> ebs;

    public Output<SpotFleetEbsBlockDeviceArgs> ebs() {
        return this.ebs == null ? Codegen.empty() : this.ebs;
    }

    @Import(name="noDevice")
      private final @Nullable Output<String> noDevice;

    public Output<String> noDevice() {
        return this.noDevice == null ? Codegen.empty() : this.noDevice;
    }

    @Import(name="virtualName")
      private final @Nullable Output<String> virtualName;

    public Output<String> virtualName() {
        return this.virtualName == null ? Codegen.empty() : this.virtualName;
    }

    public SpotFleetBlockDeviceMappingArgs(
        Output<String> deviceName,
        @Nullable Output<SpotFleetEbsBlockDeviceArgs> ebs,
        @Nullable Output<String> noDevice,
        @Nullable Output<String> virtualName) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.ebs = ebs;
        this.noDevice = noDevice;
        this.virtualName = virtualName;
    }

    private SpotFleetBlockDeviceMappingArgs() {
        this.deviceName = Codegen.empty();
        this.ebs = Codegen.empty();
        this.noDevice = Codegen.empty();
        this.virtualName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetBlockDeviceMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> deviceName;
        private @Nullable Output<SpotFleetEbsBlockDeviceArgs> ebs;
        private @Nullable Output<String> noDevice;
        private @Nullable Output<String> virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetBlockDeviceMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.ebs = defaults.ebs;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder deviceName(Output<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Output.of(Objects.requireNonNull(deviceName));
            return this;
        }
        public Builder ebs(@Nullable Output<SpotFleetEbsBlockDeviceArgs> ebs) {
            this.ebs = ebs;
            return this;
        }
        public Builder ebs(@Nullable SpotFleetEbsBlockDeviceArgs ebs) {
            this.ebs = Codegen.ofNullable(ebs);
            return this;
        }
        public Builder noDevice(@Nullable Output<String> noDevice) {
            this.noDevice = noDevice;
            return this;
        }
        public Builder noDevice(@Nullable String noDevice) {
            this.noDevice = Codegen.ofNullable(noDevice);
            return this;
        }
        public Builder virtualName(@Nullable Output<String> virtualName) {
            this.virtualName = virtualName;
            return this;
        }
        public Builder virtualName(@Nullable String virtualName) {
            this.virtualName = Codegen.ofNullable(virtualName);
            return this;
        }        public SpotFleetBlockDeviceMappingArgs build() {
            return new SpotFleetBlockDeviceMappingArgs(deviceName, ebs, noDevice, virtualName);
        }
    }
}
