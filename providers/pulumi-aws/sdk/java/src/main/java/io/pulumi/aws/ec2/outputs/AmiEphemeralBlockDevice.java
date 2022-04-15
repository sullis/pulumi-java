// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AmiEphemeralBlockDevice {
    /**
     * The path at which the device is exposed to created instances.
     * 
     */
    private final String deviceName;
    /**
     * A name for the ephemeral device, of the form "ephemeralN" where
     * *N* is a volume number starting from zero.
     * 
     */
    private final String virtualName;

    @CustomType.Constructor
    private AmiEphemeralBlockDevice(
        @CustomType.Parameter("deviceName") String deviceName,
        @CustomType.Parameter("virtualName") String virtualName) {
        this.deviceName = deviceName;
        this.virtualName = virtualName;
    }

    /**
     * The path at which the device is exposed to created instances.
     * 
    */
    public String deviceName() {
        return this.deviceName;
    }
    /**
     * A name for the ephemeral device, of the form "ephemeralN" where
     * *N* is a volume number starting from zero.
     * 
    */
    public String virtualName() {
        return this.virtualName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmiEphemeralBlockDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceName;
        private String virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(AmiEphemeralBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder virtualName(String virtualName) {
            this.virtualName = Objects.requireNonNull(virtualName);
            return this;
        }        public AmiEphemeralBlockDevice build() {
            return new AmiEphemeralBlockDevice(deviceName, virtualName);
        }
    }
}
