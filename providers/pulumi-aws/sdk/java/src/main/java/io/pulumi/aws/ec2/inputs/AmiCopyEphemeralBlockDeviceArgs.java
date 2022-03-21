// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AmiCopyEphemeralBlockDeviceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AmiCopyEphemeralBlockDeviceArgs Empty = new AmiCopyEphemeralBlockDeviceArgs();

    /**
     * The path at which the device is exposed to created instances.
     * 
     */
    @Import(name="deviceName")
      private final @Nullable Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName == null ? Output.empty() : this.deviceName;
    }

    /**
     * A name for the ephemeral device, of the form "ephemeralN" where
     * *N* is a volume number starting from zero.
     * 
     */
    @Import(name="virtualName")
      private final @Nullable Output<String> virtualName;

    public Output<String> getVirtualName() {
        return this.virtualName == null ? Output.empty() : this.virtualName;
    }

    public AmiCopyEphemeralBlockDeviceArgs(
        @Nullable Output<String> deviceName,
        @Nullable Output<String> virtualName) {
        this.deviceName = deviceName;
        this.virtualName = virtualName;
    }

    private AmiCopyEphemeralBlockDeviceArgs() {
        this.deviceName = Output.empty();
        this.virtualName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmiCopyEphemeralBlockDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> deviceName;
        private @Nullable Output<String> virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(AmiCopyEphemeralBlockDeviceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder deviceName(@Nullable Output<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = Output.ofNullable(deviceName);
            return this;
        }
        public Builder virtualName(@Nullable Output<String> virtualName) {
            this.virtualName = virtualName;
            return this;
        }
        public Builder virtualName(@Nullable String virtualName) {
            this.virtualName = Output.ofNullable(virtualName);
            return this;
        }        public AmiCopyEphemeralBlockDeviceArgs build() {
            return new AmiCopyEphemeralBlockDeviceArgs(deviceName, virtualName);
        }
    }
}
