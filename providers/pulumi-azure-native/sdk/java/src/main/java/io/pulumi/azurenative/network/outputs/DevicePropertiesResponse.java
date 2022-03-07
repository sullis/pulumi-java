// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DevicePropertiesResponse {
    /**
     * Model of the device.
     * 
     */
    private final @Nullable String deviceModel;
    /**
     * Name of the device Vendor.
     * 
     */
    private final @Nullable String deviceVendor;
    /**
     * Link speed.
     * 
     */
    private final @Nullable Integer linkSpeedInMbps;

    @OutputCustomType.Constructor({"deviceModel","deviceVendor","linkSpeedInMbps"})
    private DevicePropertiesResponse(
        @Nullable String deviceModel,
        @Nullable String deviceVendor,
        @Nullable Integer linkSpeedInMbps) {
        this.deviceModel = deviceModel;
        this.deviceVendor = deviceVendor;
        this.linkSpeedInMbps = linkSpeedInMbps;
    }

    /**
     * Model of the device.
     * 
    */
    public Optional<String> getDeviceModel() {
        return Optional.ofNullable(this.deviceModel);
    }
    /**
     * Name of the device Vendor.
     * 
    */
    public Optional<String> getDeviceVendor() {
        return Optional.ofNullable(this.deviceVendor);
    }
    /**
     * Link speed.
     * 
    */
    public Optional<Integer> getLinkSpeedInMbps() {
        return Optional.ofNullable(this.linkSpeedInMbps);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DevicePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deviceModel;
        private @Nullable String deviceVendor;
        private @Nullable Integer linkSpeedInMbps;

        public Builder() {
    	      // Empty
        }

        public Builder(DevicePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceModel = defaults.deviceModel;
    	      this.deviceVendor = defaults.deviceVendor;
    	      this.linkSpeedInMbps = defaults.linkSpeedInMbps;
        }

        public Builder setDeviceModel(@Nullable String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }

        public Builder setDeviceVendor(@Nullable String deviceVendor) {
            this.deviceVendor = deviceVendor;
            return this;
        }

        public Builder setLinkSpeedInMbps(@Nullable Integer linkSpeedInMbps) {
            this.linkSpeedInMbps = linkSpeedInMbps;
            return this;
        }
        public DevicePropertiesResponse build() {
            return new DevicePropertiesResponse(deviceModel, deviceVendor, linkSpeedInMbps);
        }
    }
}