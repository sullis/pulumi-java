// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WirelessDeviceOtaaV11 extends io.pulumi.resources.InvokeArgs {

    public static final WirelessDeviceOtaaV11 Empty = new WirelessDeviceOtaaV11();

    @Import(name="appKey", required=true)
      private final String appKey;

    public String appKey() {
        return this.appKey;
    }

    @Import(name="joinEui", required=true)
      private final String joinEui;

    public String joinEui() {
        return this.joinEui;
    }

    @Import(name="nwkKey", required=true)
      private final String nwkKey;

    public String nwkKey() {
        return this.nwkKey;
    }

    public WirelessDeviceOtaaV11(
        String appKey,
        String joinEui,
        String nwkKey) {
        this.appKey = Objects.requireNonNull(appKey, "expected parameter 'appKey' to be non-null");
        this.joinEui = Objects.requireNonNull(joinEui, "expected parameter 'joinEui' to be non-null");
        this.nwkKey = Objects.requireNonNull(nwkKey, "expected parameter 'nwkKey' to be non-null");
    }

    private WirelessDeviceOtaaV11() {
        this.appKey = null;
        this.joinEui = null;
        this.nwkKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessDeviceOtaaV11 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appKey;
        private String joinEui;
        private String nwkKey;

        public Builder() {
    	      // Empty
        }

        public Builder(WirelessDeviceOtaaV11 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appKey = defaults.appKey;
    	      this.joinEui = defaults.joinEui;
    	      this.nwkKey = defaults.nwkKey;
        }

        public Builder appKey(String appKey) {
            this.appKey = Objects.requireNonNull(appKey);
            return this;
        }
        public Builder joinEui(String joinEui) {
            this.joinEui = Objects.requireNonNull(joinEui);
            return this;
        }
        public Builder nwkKey(String nwkKey) {
            this.nwkKey = Objects.requireNonNull(nwkKey);
            return this;
        }        public WirelessDeviceOtaaV11 build() {
            return new WirelessDeviceOtaaV11(appKey, joinEui, nwkKey);
        }
    }
}
