// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class WirelessDeviceOtaaV11Args extends io.pulumi.resources.ResourceArgs {

    public static final WirelessDeviceOtaaV11Args Empty = new WirelessDeviceOtaaV11Args();

    @InputImport(name="appKey", required=true)
    private final Input<String> appKey;

    public Input<String> getAppKey() {
        return this.appKey;
    }

    @InputImport(name="joinEui", required=true)
    private final Input<String> joinEui;

    public Input<String> getJoinEui() {
        return this.joinEui;
    }

    @InputImport(name="nwkKey", required=true)
    private final Input<String> nwkKey;

    public Input<String> getNwkKey() {
        return this.nwkKey;
    }

    public WirelessDeviceOtaaV11Args(
        Input<String> appKey,
        Input<String> joinEui,
        Input<String> nwkKey) {
        this.appKey = Objects.requireNonNull(appKey, "expected parameter 'appKey' to be non-null");
        this.joinEui = Objects.requireNonNull(joinEui, "expected parameter 'joinEui' to be non-null");
        this.nwkKey = Objects.requireNonNull(nwkKey, "expected parameter 'nwkKey' to be non-null");
    }

    private WirelessDeviceOtaaV11Args() {
        this.appKey = Input.empty();
        this.joinEui = Input.empty();
        this.nwkKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessDeviceOtaaV11Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> appKey;
        private Input<String> joinEui;
        private Input<String> nwkKey;

        public Builder() {
    	      // Empty
        }

        public Builder(WirelessDeviceOtaaV11Args defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appKey = defaults.appKey;
    	      this.joinEui = defaults.joinEui;
    	      this.nwkKey = defaults.nwkKey;
        }

        public Builder setAppKey(Input<String> appKey) {
            this.appKey = Objects.requireNonNull(appKey);
            return this;
        }

        public Builder setAppKey(String appKey) {
            this.appKey = Input.of(Objects.requireNonNull(appKey));
            return this;
        }

        public Builder setJoinEui(Input<String> joinEui) {
            this.joinEui = Objects.requireNonNull(joinEui);
            return this;
        }

        public Builder setJoinEui(String joinEui) {
            this.joinEui = Input.of(Objects.requireNonNull(joinEui));
            return this;
        }

        public Builder setNwkKey(Input<String> nwkKey) {
            this.nwkKey = Objects.requireNonNull(nwkKey);
            return this;
        }

        public Builder setNwkKey(String nwkKey) {
            this.nwkKey = Input.of(Objects.requireNonNull(nwkKey));
            return this;
        }

        public WirelessDeviceOtaaV11Args build() {
            return new WirelessDeviceOtaaV11Args(appKey, joinEui, nwkKey);
        }
    }
}
