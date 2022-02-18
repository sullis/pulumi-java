// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.inputs;

import io.pulumi.awsnative.iotwireless.inputs.WirelessDeviceSessionKeysAbpV11;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class WirelessDeviceAbpV11 extends io.pulumi.resources.InvokeArgs {

    public static final WirelessDeviceAbpV11 Empty = new WirelessDeviceAbpV11();

    @InputImport(name="devAddr", required=true)
    private final String devAddr;

    public String getDevAddr() {
        return this.devAddr;
    }

    @InputImport(name="sessionKeys", required=true)
    private final WirelessDeviceSessionKeysAbpV11 sessionKeys;

    public WirelessDeviceSessionKeysAbpV11 getSessionKeys() {
        return this.sessionKeys;
    }

    public WirelessDeviceAbpV11(
        String devAddr,
        WirelessDeviceSessionKeysAbpV11 sessionKeys) {
        this.devAddr = Objects.requireNonNull(devAddr, "expected parameter 'devAddr' to be non-null");
        this.sessionKeys = Objects.requireNonNull(sessionKeys, "expected parameter 'sessionKeys' to be non-null");
    }

    private WirelessDeviceAbpV11() {
        this.devAddr = null;
        this.sessionKeys = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessDeviceAbpV11 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String devAddr;
        private WirelessDeviceSessionKeysAbpV11 sessionKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(WirelessDeviceAbpV11 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.devAddr = defaults.devAddr;
    	      this.sessionKeys = defaults.sessionKeys;
        }

        public Builder setDevAddr(String devAddr) {
            this.devAddr = Objects.requireNonNull(devAddr);
            return this;
        }

        public Builder setSessionKeys(WirelessDeviceSessionKeysAbpV11 sessionKeys) {
            this.sessionKeys = Objects.requireNonNull(sessionKeys);
            return this;
        }

        public WirelessDeviceAbpV11 build() {
            return new WirelessDeviceAbpV11(devAddr, sessionKeys);
        }
    }
}
