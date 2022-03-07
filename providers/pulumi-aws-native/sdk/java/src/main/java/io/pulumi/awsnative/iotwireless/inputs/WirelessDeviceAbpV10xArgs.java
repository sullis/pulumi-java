// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.inputs;

import io.pulumi.awsnative.iotwireless.inputs.WirelessDeviceSessionKeysAbpV10xArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class WirelessDeviceAbpV10xArgs extends io.pulumi.resources.ResourceArgs {

    public static final WirelessDeviceAbpV10xArgs Empty = new WirelessDeviceAbpV10xArgs();

    @InputImport(name="devAddr", required=true)
      private final Input<String> devAddr;

    public Input<String> getDevAddr() {
        return this.devAddr;
    }

    @InputImport(name="sessionKeys", required=true)
      private final Input<WirelessDeviceSessionKeysAbpV10xArgs> sessionKeys;

    public Input<WirelessDeviceSessionKeysAbpV10xArgs> getSessionKeys() {
        return this.sessionKeys;
    }

    public WirelessDeviceAbpV10xArgs(
        Input<String> devAddr,
        Input<WirelessDeviceSessionKeysAbpV10xArgs> sessionKeys) {
        this.devAddr = Objects.requireNonNull(devAddr, "expected parameter 'devAddr' to be non-null");
        this.sessionKeys = Objects.requireNonNull(sessionKeys, "expected parameter 'sessionKeys' to be non-null");
    }

    private WirelessDeviceAbpV10xArgs() {
        this.devAddr = Input.empty();
        this.sessionKeys = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessDeviceAbpV10xArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> devAddr;
        private Input<WirelessDeviceSessionKeysAbpV10xArgs> sessionKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(WirelessDeviceAbpV10xArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.devAddr = defaults.devAddr;
    	      this.sessionKeys = defaults.sessionKeys;
        }

        public Builder setDevAddr(Input<String> devAddr) {
            this.devAddr = Objects.requireNonNull(devAddr);
            return this;
        }

        public Builder setDevAddr(String devAddr) {
            this.devAddr = Input.of(Objects.requireNonNull(devAddr));
            return this;
        }

        public Builder setSessionKeys(Input<WirelessDeviceSessionKeysAbpV10xArgs> sessionKeys) {
            this.sessionKeys = Objects.requireNonNull(sessionKeys);
            return this;
        }

        public Builder setSessionKeys(WirelessDeviceSessionKeysAbpV10xArgs sessionKeys) {
            this.sessionKeys = Input.of(Objects.requireNonNull(sessionKeys));
            return this;
        }
        public WirelessDeviceAbpV10xArgs build() {
            return new WirelessDeviceAbpV10xArgs(devAddr, sessionKeys);
        }
    }
}