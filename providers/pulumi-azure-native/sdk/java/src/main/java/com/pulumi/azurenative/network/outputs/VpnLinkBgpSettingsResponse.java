// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VpnLinkBgpSettingsResponse {
    /**
     * @return The BGP speaker&#39;s ASN.
     * 
     */
    private final @Nullable Double asn;
    /**
     * @return The BGP peering address and BGP identifier of this BGP speaker.
     * 
     */
    private final @Nullable String bgpPeeringAddress;

    @CustomType.Constructor
    private VpnLinkBgpSettingsResponse(
        @CustomType.Parameter("asn") @Nullable Double asn,
        @CustomType.Parameter("bgpPeeringAddress") @Nullable String bgpPeeringAddress) {
        this.asn = asn;
        this.bgpPeeringAddress = bgpPeeringAddress;
    }

    /**
     * @return The BGP speaker&#39;s ASN.
     * 
     */
    public Optional<Double> asn() {
        return Optional.ofNullable(this.asn);
    }
    /**
     * @return The BGP peering address and BGP identifier of this BGP speaker.
     * 
     */
    public Optional<String> bgpPeeringAddress() {
        return Optional.ofNullable(this.bgpPeeringAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnLinkBgpSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double asn;
        private @Nullable String bgpPeeringAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnLinkBgpSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asn = defaults.asn;
    	      this.bgpPeeringAddress = defaults.bgpPeeringAddress;
        }

        public Builder asn(@Nullable Double asn) {
            this.asn = asn;
            return this;
        }
        public Builder bgpPeeringAddress(@Nullable String bgpPeeringAddress) {
            this.bgpPeeringAddress = bgpPeeringAddress;
            return this;
        }        public VpnLinkBgpSettingsResponse build() {
            return new VpnLinkBgpSettingsResponse(asn, bgpPeeringAddress);
        }
    }
}
