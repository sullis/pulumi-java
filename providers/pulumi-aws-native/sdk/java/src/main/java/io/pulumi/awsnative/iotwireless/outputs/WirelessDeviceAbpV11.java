// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.outputs;

import io.pulumi.awsnative.iotwireless.outputs.WirelessDeviceSessionKeysAbpV11;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WirelessDeviceAbpV11 {
    private final String devAddr;
    private final WirelessDeviceSessionKeysAbpV11 sessionKeys;

    @OutputCustomType.Constructor({"devAddr","sessionKeys"})
    private WirelessDeviceAbpV11(
        String devAddr,
        WirelessDeviceSessionKeysAbpV11 sessionKeys) {
        this.devAddr = Objects.requireNonNull(devAddr);
        this.sessionKeys = Objects.requireNonNull(sessionKeys);
    }

    public String getDevAddr() {
        return this.devAddr;
    }
    public WirelessDeviceSessionKeysAbpV11 getSessionKeys() {
        return this.sessionKeys;
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