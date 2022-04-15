// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The location of the site
 * 
 */
public final class SiteLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SiteLocationArgs Empty = new SiteLocationArgs();

    /**
     * The physical address.
     * 
     */
    @Import(name="address")
      private final @Nullable Output<String> address;

    public Output<String> address() {
        return this.address == null ? Codegen.empty() : this.address;
    }

    /**
     * The latitude.
     * 
     */
    @Import(name="latitude")
      private final @Nullable Output<String> latitude;

    public Output<String> latitude() {
        return this.latitude == null ? Codegen.empty() : this.latitude;
    }

    /**
     * The longitude.
     * 
     */
    @Import(name="longitude")
      private final @Nullable Output<String> longitude;

    public Output<String> longitude() {
        return this.longitude == null ? Codegen.empty() : this.longitude;
    }

    public SiteLocationArgs(
        @Nullable Output<String> address,
        @Nullable Output<String> latitude,
        @Nullable Output<String> longitude) {
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    private SiteLocationArgs() {
        this.address = Codegen.empty();
        this.latitude = Codegen.empty();
        this.longitude = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SiteLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> address;
        private @Nullable Output<String> latitude;
        private @Nullable Output<String> longitude;

        public Builder() {
    	      // Empty
        }

        public Builder(SiteLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.latitude = defaults.latitude;
    	      this.longitude = defaults.longitude;
        }

        public Builder address(@Nullable Output<String> address) {
            this.address = address;
            return this;
        }
        public Builder address(@Nullable String address) {
            this.address = Codegen.ofNullable(address);
            return this;
        }
        public Builder latitude(@Nullable Output<String> latitude) {
            this.latitude = latitude;
            return this;
        }
        public Builder latitude(@Nullable String latitude) {
            this.latitude = Codegen.ofNullable(latitude);
            return this;
        }
        public Builder longitude(@Nullable Output<String> longitude) {
            this.longitude = longitude;
            return this;
        }
        public Builder longitude(@Nullable String longitude) {
            this.longitude = Codegen.ofNullable(longitude);
            return this;
        }        public SiteLocationArgs build() {
            return new SiteLocationArgs(address, latitude, longitude);
        }
    }
}
