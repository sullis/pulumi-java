// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTable;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PointToPointVpnGatewayConnectionConfigurationRoute {
    /**
     * @return The Virtual Hub Route Table resource id associated with this Routing Configuration.
     * 
     */
    private final String associatedRouteTableId;
    /**
     * @return A `propagated_route_table` block as defined below.
     * 
     */
    private final @Nullable PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTable propagatedRouteTable;

    @CustomType.Constructor
    private PointToPointVpnGatewayConnectionConfigurationRoute(
        @CustomType.Parameter("associatedRouteTableId") String associatedRouteTableId,
        @CustomType.Parameter("propagatedRouteTable") @Nullable PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTable propagatedRouteTable) {
        this.associatedRouteTableId = associatedRouteTableId;
        this.propagatedRouteTable = propagatedRouteTable;
    }

    /**
     * @return The Virtual Hub Route Table resource id associated with this Routing Configuration.
     * 
     */
    public String associatedRouteTableId() {
        return this.associatedRouteTableId;
    }
    /**
     * @return A `propagated_route_table` block as defined below.
     * 
     */
    public Optional<PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTable> propagatedRouteTable() {
        return Optional.ofNullable(this.propagatedRouteTable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PointToPointVpnGatewayConnectionConfigurationRoute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String associatedRouteTableId;
        private @Nullable PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTable propagatedRouteTable;

        public Builder() {
    	      // Empty
        }

        public Builder(PointToPointVpnGatewayConnectionConfigurationRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associatedRouteTableId = defaults.associatedRouteTableId;
    	      this.propagatedRouteTable = defaults.propagatedRouteTable;
        }

        public Builder associatedRouteTableId(String associatedRouteTableId) {
            this.associatedRouteTableId = Objects.requireNonNull(associatedRouteTableId);
            return this;
        }
        public Builder propagatedRouteTable(@Nullable PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTable propagatedRouteTable) {
            this.propagatedRouteTable = propagatedRouteTable;
            return this;
        }        public PointToPointVpnGatewayConnectionConfigurationRoute build() {
            return new PointToPointVpnGatewayConnectionConfigurationRoute(associatedRouteTableId, propagatedRouteTable);
        }
    }
}
