// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WirelessDeviceOtaaV10x extends io.pulumi.resources.InvokeArgs {

    public static final WirelessDeviceOtaaV10x Empty = new WirelessDeviceOtaaV10x();

    @Import(name="appEui", required=true)
      private final String appEui;

    public String appEui() {
        return this.appEui;
    }

    @Import(name="appKey", required=true)
      private final String appKey;

    public String appKey() {
        return this.appKey;
    }

    public WirelessDeviceOtaaV10x(
        String appEui,
        String appKey) {
        this.appEui = Objects.requireNonNull(appEui, "expected parameter 'appEui' to be non-null");
        this.appKey = Objects.requireNonNull(appKey, "expected parameter 'appKey' to be non-null");
    }

    private WirelessDeviceOtaaV10x() {
        this.appEui = null;
        this.appKey = null;
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
