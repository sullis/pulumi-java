// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeviceLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceLocationArgs Empty = new DeviceLocationArgs();

    @InputImport(name="address")
    private final @Nullable Input<String> address;

    public Input<String> getAddress() {
        return this.address == null ? Input.empty() : this.address;
    }

    @InputImport(name="latitude")
    private final @Nullable Input<String> latitude;

    public Input<String> getLatitude() {
        return this.latitude == null ? Input.empty() : this.latitude;
    }

    @InputImport(name="longitude")
    private final @Nullable Input<String> longitude;

    public Input<String> getLongitude() {
        return this.longitude == null ? Input.empty() : this.longitude;
    }

    public DeviceLocationArgs(
        @Nullable Input<String> address,
        @Nullable Input<String> latitude,
        @Nullable Input<String> longitude) {
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    private DeviceLocationArgs() {
        this.address = Input.empty();
        this.latitude = Input.empty();
        this.longitude = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> address;
        private @Nullable Input<String> latitude;
        private @Nullable Input<String> longitude;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.latitude = defaults.latitude;
    	      this.longitude = defaults.longitude;
        }

        public Builder setAddress(@Nullable Input<String> address) {
            this.address = address;
            return this;
        }

        public Builder setAddress(@Nullable String address) {
            this.address = Input.ofNullable(address);
            return this;
        }

        public Builder setLatitude(@Nullable Input<String> latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder setLatitude(@Nullable String latitude) {
            this.latitude = Input.ofNullable(latitude);
            return this;
        }

        public Builder setLongitude(@Nullable Input<String> longitude) {
            this.longitude = longitude;
            return this;
        }

        public Builder setLongitude(@Nullable String longitude) {
            this.longitude = Input.ofNullable(longitude);
            return this;
        }

        public DeviceLocationArgs build() {
            return new DeviceLocationArgs(address, latitude, longitude);
        }
    }
}
