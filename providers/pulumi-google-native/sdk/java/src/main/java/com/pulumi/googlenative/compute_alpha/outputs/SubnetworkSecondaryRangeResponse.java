// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SubnetworkSecondaryRangeResponse {
    /**
     * @return The range of IP addresses belonging to this subnetwork secondary range. Provide this property when you create the subnetwork. Ranges must be unique and non-overlapping with all primary and secondary IP ranges within a network. Only IPv4 is supported. The range can be any range listed in the Valid ranges list.
     * 
     */
    private final String ipCidrRange;
    /**
     * @return The name associated with this subnetwork secondary range, used when adding an alias IP range to a VM instance. The name must be 1-63 characters long, and comply with RFC1035. The name must be unique within the subnetwork.
     * 
     */
    private final String rangeName;
    /**
     * @return The URL of the reserved internal range.
     * 
     */
    private final String reservedInternalRange;

    @CustomType.Constructor
    private SubnetworkSecondaryRangeResponse(
        @CustomType.Parameter("ipCidrRange") String ipCidrRange,
        @CustomType.Parameter("rangeName") String rangeName,
        @CustomType.Parameter("reservedInternalRange") String reservedInternalRange) {
        this.ipCidrRange = ipCidrRange;
        this.rangeName = rangeName;
        this.reservedInternalRange = reservedInternalRange;
    }

    /**
     * @return The range of IP addresses belonging to this subnetwork secondary range. Provide this property when you create the subnetwork. Ranges must be unique and non-overlapping with all primary and secondary IP ranges within a network. Only IPv4 is supported. The range can be any range listed in the Valid ranges list.
     * 
     */
    public String ipCidrRange() {
        return this.ipCidrRange;
    }
    /**
     * @return The name associated with this subnetwork secondary range, used when adding an alias IP range to a VM instance. The name must be 1-63 characters long, and comply with RFC1035. The name must be unique within the subnetwork.
     * 
     */
    public String rangeName() {
        return this.rangeName;
    }
    /**
     * @return The URL of the reserved internal range.
     * 
     */
    public String reservedInternalRange() {
        return this.reservedInternalRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetworkSecondaryRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipCidrRange;
        private String rangeName;
        private String reservedInternalRange;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetworkSecondaryRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.rangeName = defaults.rangeName;
    	      this.reservedInternalRange = defaults.reservedInternalRange;
        }

        public Builder ipCidrRange(String ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }
        public Builder rangeName(String rangeName) {
            this.rangeName = Objects.requireNonNull(rangeName);
            return this;
        }
        public Builder reservedInternalRange(String reservedInternalRange) {
            this.reservedInternalRange = Objects.requireNonNull(reservedInternalRange);
            return this;
        }        public SubnetworkSecondaryRangeResponse build() {
            return new SubnetworkSecondaryRangeResponse(ipCidrRange, rangeName, reservedInternalRange);
        }
    }
}
