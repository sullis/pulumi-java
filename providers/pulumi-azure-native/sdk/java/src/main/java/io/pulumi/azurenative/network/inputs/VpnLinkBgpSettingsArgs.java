// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * BGP settings details for a link.
 * 
 */
public final class VpnLinkBgpSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpnLinkBgpSettingsArgs Empty = new VpnLinkBgpSettingsArgs();

    /**
     * The BGP speaker's ASN.
     * 
     */
    @InputImport(name="asn")
      private final @Nullable Input<Double> asn;

    public Input<Double> getAsn() {
        return this.asn == null ? Input.empty() : this.asn;
    }

    /**
     * The BGP peering address and BGP identifier of this BGP speaker.
     * 
     */
    @InputImport(name="bgpPeeringAddress")
      private final @Nullable Input<String> bgpPeeringAddress;

    public Input<String> getBgpPeeringAddress() {
        return this.bgpPeeringAddress == null ? Input.empty() : this.bgpPeeringAddress;
    }

    public VpnLinkBgpSettingsArgs(
        @Nullable Input<Double> asn,
        @Nullable Input<String> bgpPeeringAddress) {
        this.asn = asn;
        this.bgpPeeringAddress = bgpPeeringAddress;
    }

    private VpnLinkBgpSettingsArgs() {
        this.asn = Input.empty();
        this.bgpPeeringAddress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnLinkBgpSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> asn;
        private @Nullable Input<String> bgpPeeringAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnLinkBgpSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asn = defaults.asn;
    	      this.bgpPeeringAddress = defaults.bgpPeeringAddress;
        }

        public Builder setAsn(@Nullable Input<Double> asn) {
            this.asn = asn;
            return this;
        }

        public Builder setAsn(@Nullable Double asn) {
            this.asn = Input.ofNullable(asn);
            return this;
        }

        public Builder setBgpPeeringAddress(@Nullable Input<String> bgpPeeringAddress) {
            this.bgpPeeringAddress = bgpPeeringAddress;
            return this;
        }

        public Builder setBgpPeeringAddress(@Nullable String bgpPeeringAddress) {
            this.bgpPeeringAddress = Input.ofNullable(bgpPeeringAddress);
            return this;
        }
        public VpnLinkBgpSettingsArgs build() {
            return new VpnLinkBgpSettingsArgs(asn, bgpPeeringAddress);
        }
    }
}