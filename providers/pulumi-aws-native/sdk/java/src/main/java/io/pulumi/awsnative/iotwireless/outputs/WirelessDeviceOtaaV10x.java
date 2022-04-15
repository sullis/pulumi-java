// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WirelessDeviceOtaaV10x {
    private final String appEui;
    private final String appKey;

    @CustomType.Constructor
    private WirelessDeviceOtaaV10x(
        @CustomType.Parameter("appEui") String appEui,
        @CustomType.Parameter("appKey") String appKey) {
        this.appEui = appEui;
        this.appKey = appKey;
    }

    public String appEui() {
        return this.appEui;
    }
    public String appKey() {
        return this.appKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessDeviceOtaaV10x defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appEui;
        private String appKey;

        public Builder() {
    	      // Empty
        }

        public Builder(WirelessDeviceOtaaV10x defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEui = defaults.appEui;
    	      this.appKey = defaults.appKey;
        }

        public Builder appEui(String appEui) {
            this.appEui = Objects.requireNonNull(appEui);
            return this;
        }
        public Builder appKey(String appKey) {
            this.appKey = Objects.requireNonNull(appKey);
            return this;
        }        public WirelessDeviceOtaaV10x build() {
            return new WirelessDeviceOtaaV10x(appEui, appKey);
        }
    }
}
