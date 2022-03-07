// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualApplianceSkuPropertiesResponse {
    /**
     * Virtual Appliance Scale Unit.
     * 
     */
    private final @Nullable String bundledScaleUnit;
    /**
     * Virtual Appliance Version.
     * 
     */
    private final @Nullable String marketPlaceVersion;
    /**
     * Virtual Appliance Vendor.
     * 
     */
    private final @Nullable String vendor;

    @OutputCustomType.Constructor({"bundledScaleUnit","marketPlaceVersion","vendor"})
    private VirtualApplianceSkuPropertiesResponse(
        @Nullable String bundledScaleUnit,
        @Nullable String marketPlaceVersion,
        @Nullable String vendor) {
        this.bundledScaleUnit = bundledScaleUnit;
        this.marketPlaceVersion = marketPlaceVersion;
        this.vendor = vendor;
    }

    /**
     * Virtual Appliance Scale Unit.
     * 
    */
    public Optional<String> getBundledScaleUnit() {
        return Optional.ofNullable(this.bundledScaleUnit);
    }
    /**
     * Virtual Appliance Version.
     * 
    */
    public Optional<String> getMarketPlaceVersion() {
        return Optional.ofNullable(this.marketPlaceVersion);
    }
    /**
     * Virtual Appliance Vendor.
     * 
    */
    public Optional<String> getVendor() {
        return Optional.ofNullable(this.vendor);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualApplianceSkuPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bundledScaleUnit;
        private @Nullable String marketPlaceVersion;
        private @Nullable String vendor;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualApplianceSkuPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bundledScaleUnit = defaults.bundledScaleUnit;
    	      this.marketPlaceVersion = defaults.marketPlaceVersion;
    	      this.vendor = defaults.vendor;
        }

        public Builder setBundledScaleUnit(@Nullable String bundledScaleUnit) {
            this.bundledScaleUnit = bundledScaleUnit;
            return this;
        }

        public Builder setMarketPlaceVersion(@Nullable String marketPlaceVersion) {
            this.marketPlaceVersion = marketPlaceVersion;
            return this;
        }

        public Builder setVendor(@Nullable String vendor) {
            this.vendor = vendor;
            return this;
        }
        public VirtualApplianceSkuPropertiesResponse build() {
            return new VirtualApplianceSkuPropertiesResponse(bundledScaleUnit, marketPlaceVersion, vendor);
        }
    }
}