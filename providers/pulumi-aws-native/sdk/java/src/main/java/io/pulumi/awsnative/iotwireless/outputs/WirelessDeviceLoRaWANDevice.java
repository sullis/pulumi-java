// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.outputs;

import io.pulumi.awsnative.iotwireless.outputs.WirelessDeviceAbpV10x;
import io.pulumi.awsnative.iotwireless.outputs.WirelessDeviceAbpV11;
import io.pulumi.awsnative.iotwireless.outputs.WirelessDeviceOtaaV10x;
import io.pulumi.awsnative.iotwireless.outputs.WirelessDeviceOtaaV11;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WirelessDeviceLoRaWANDevice {
    private final @Nullable WirelessDeviceAbpV10x abpV10x;
    private final @Nullable WirelessDeviceAbpV11 abpV11;
    private final @Nullable String devEui;
    private final @Nullable String deviceProfileId;
    private final @Nullable WirelessDeviceOtaaV10x otaaV10x;
    private final @Nullable WirelessDeviceOtaaV11 otaaV11;
    private final @Nullable String serviceProfileId;

    @CustomType.Constructor
    private WirelessDeviceLoRaWANDevice(
        @CustomType.Parameter("abpV10x") @Nullable WirelessDeviceAbpV10x abpV10x,
        @CustomType.Parameter("abpV11") @Nullable WirelessDeviceAbpV11 abpV11,
        @CustomType.Parameter("devEui") @Nullable String devEui,
        @CustomType.Parameter("deviceProfileId") @Nullable String deviceProfileId,
        @CustomType.Parameter("otaaV10x") @Nullable WirelessDeviceOtaaV10x otaaV10x,
        @CustomType.Parameter("otaaV11") @Nullable WirelessDeviceOtaaV11 otaaV11,
        @CustomType.Parameter("serviceProfileId") @Nullable String serviceProfileId) {
        this.abpV10x = abpV10x;
        this.abpV11 = abpV11;
        this.devEui = devEui;
        this.deviceProfileId = deviceProfileId;
        this.otaaV10x = otaaV10x;
        this.otaaV11 = otaaV11;
        this.serviceProfileId = serviceProfileId;
    }

    public Optional<WirelessDeviceAbpV10x> abpV10x() {
        return Optional.ofNullable(this.abpV10x);
    }
    public Optional<WirelessDeviceAbpV11> abpV11() {
        return Optional.ofNullable(this.abpV11);
    }
    public Optional<String> devEui() {
        return Optional.ofNullable(this.devEui);
    }
    public Optional<String> deviceProfileId() {
        return Optional.ofNullable(this.deviceProfileId);
    }
    public Optional<WirelessDeviceOtaaV10x> otaaV10x() {
        return Optional.ofNullable(this.otaaV10x);
    }
    public Optional<WirelessDeviceOtaaV11> otaaV11() {
        return Optional.ofNullable(this.otaaV11);
    }
    public Optional<String> serviceProfileId() {
        return Optional.ofNullable(this.serviceProfileId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessDeviceLoRaWANDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WirelessDeviceAbpV10x abpV10x;
        private @Nullable WirelessDeviceAbpV11 abpV11;
        private @Nullable String devEui;
        private @Nullable String deviceProfileId;
        private @Nullable WirelessDeviceOtaaV10x otaaV10x;
        private @Nullable WirelessDeviceOtaaV11 otaaV11;
        private @Nullable String serviceProfileId;

        public Builder() {
    	      // Empty
        }

        public Builder(WirelessDeviceLoRaWANDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abpV10x = defaults.abpV10x;
    	      this.abpV11 = defaults.abpV11;
    	      this.devEui = defaults.devEui;
    	      this.deviceProfileId = defaults.deviceProfileId;
    	      this.otaaV10x = defaults.otaaV10x;
    	      this.otaaV11 = defaults.otaaV11;
    	      this.serviceProfileId = defaults.serviceProfileId;
        }

        public Builder abpV10x(@Nullable WirelessDeviceAbpV10x abpV10x) {
            this.abpV10x = abpV10x;
            return this;
        }
        public Builder abpV11(@Nullable WirelessDeviceAbpV11 abpV11) {
            this.abpV11 = abpV11;
            return this;
        }
        public Builder devEui(@Nullable String devEui) {
            this.devEui = devEui;
            return this;
        }
        public Builder deviceProfileId(@Nullable String deviceProfileId) {
            this.deviceProfileId = deviceProfileId;
            return this;
        }
        public Builder otaaV10x(@Nullable WirelessDeviceOtaaV10x otaaV10x) {
            this.otaaV10x = otaaV10x;
            return this;
        }
        public Builder otaaV11(@Nullable WirelessDeviceOtaaV11 otaaV11) {
            this.otaaV11 = otaaV11;
            return this;
        }
        public Builder serviceProfileId(@Nullable String serviceProfileId) {
            this.serviceProfileId = serviceProfileId;
            return this;
        }        public WirelessDeviceLoRaWANDevice build() {
            return new WirelessDeviceLoRaWANDevice(abpV10x, abpV11, devEui, deviceProfileId, otaaV10x, otaaV11, serviceProfileId);
        }
    }
}
