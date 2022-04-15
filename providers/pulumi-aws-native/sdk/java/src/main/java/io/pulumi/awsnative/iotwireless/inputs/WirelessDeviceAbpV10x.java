// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.inputs;

import io.pulumi.awsnative.iotwireless.inputs.WirelessDeviceSessionKeysAbpV10x;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WirelessDeviceAbpV10x extends io.pulumi.resources.InvokeArgs {

    public static final WirelessDeviceAbpV10x Empty = new WirelessDeviceAbpV10x();

    @Import(name="devAddr", required=true)
      private final String devAddr;

    public String devAddr() {
        return this.devAddr;
    }

    @Import(name="sessionKeys", required=true)
      private final WirelessDeviceSessionKeysAbpV10x sessionKeys;

    public WirelessDeviceSessionKeysAbpV10x sessionKeys() {
        return this.sessionKeys;
    }

    public WirelessDeviceAbpV10x(
        String devAddr,
        WirelessDeviceSessionKeysAbpV10x sessionKeys) {
        this.devAddr = Objects.requireNonNull(devAddr, "expected parameter 'devAddr' to be non-null");
        this.sessionKeys = Objects.requireNonNull(sessionKeys, "expected parameter 'sessionKeys' to be non-null");
    }

    private WirelessDeviceAbpV10x() {
        this.devAddr = null;
        this.sessionKeys = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessDeviceAbpV10x defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String devAddr;
        private WirelessDeviceSessionKeysAbpV10x sessionKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(WirelessDeviceAbpV10x defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.devAddr = defaults.devAddr;
    	      this.sessionKeys = defaults.sessionKeys;
        }

        public Builder devAddr(String devAddr) {
            this.devAddr = Objects.requireNonNull(devAddr);
            return this;
        }
        public Builder sessionKeys(WirelessDeviceSessionKeysAbpV10x sessionKeys) {
            this.sessionKeys = Objects.requireNonNull(sessionKeys);
            return this;
        }        public WirelessDeviceAbpV10x build() {
            return new WirelessDeviceAbpV10x(devAddr, sessionKeys);
        }
    }
}
