// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTableArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PointToPointVpnGatewayConnectionConfigurationRouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final PointToPointVpnGatewayConnectionConfigurationRouteArgs Empty = new PointToPointVpnGatewayConnectionConfigurationRouteArgs();

    /**
     * The Virtual Hub Route Table resource id associated with this Routing Configuration.
     * 
     */
    @Import(name="associatedRouteTableId", required=true)
    private Output<String> associatedRouteTableId;

    /**
     * @return The Virtual Hub Route Table resource id associated with this Routing Configuration.
     * 
     */
    public Output<String> associatedRouteTableId() {
        return this.associatedRouteTableId;
    }

    /**
     * A `propagated_route_table` block as defined below.
     * 
     */
    @Import(name="propagatedRouteTable")
    private @Nullable Output<PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTableArgs> propagatedRouteTable;

    /**
     * @return A `propagated_route_table` block as defined below.
     * 
     */
    public Optional<Output<PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTableArgs>> propagatedRouteTable() {
        return Optional.ofNullable(this.propagatedRouteTable);
    }

    private PointToPointVpnGatewayConnectionConfigurationRouteArgs() {}

    private PointToPointVpnGatewayConnectionConfigurationRouteArgs(PointToPointVpnGatewayConnectionConfigurationRouteArgs $) {
        this.associatedRouteTableId = $.associatedRouteTableId;
        this.propagatedRouteTable = $.propagatedRouteTable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PointToPointVpnGatewayConnectionConfigurationRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PointToPointVpnGatewayConnectionConfigurationRouteArgs $;

        public Builder() {
            $ = new PointToPointVpnGatewayConnectionConfigurationRouteArgs();
        }

        public Builder(PointToPointVpnGatewayConnectionConfigurationRouteArgs defaults) {
            $ = new PointToPointVpnGatewayConnectionConfigurationRouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param associatedRouteTableId The Virtual Hub Route Table resource id associated with this Routing Configuration.
         * 
         * @return builder
         * 
         */
        public Builder associatedRouteTableId(Output<String> associatedRouteTableId) {
            $.associatedRouteTableId = associatedRouteTableId;
            return this;
        }

        /**
         * @param associatedRouteTableId The Virtual Hub Route Table resource id associated with this Routing Configuration.
         * 
         * @return builder
         * 
         */
        public Builder associatedRouteTableId(String associatedRouteTableId) {
            return associatedRouteTableId(Output.of(associatedRouteTableId));
        }

        /**
         * @param propagatedRouteTable A `propagated_route_table` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder propagatedRouteTable(@Nullable Output<PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTableArgs> propagatedRouteTable) {
            $.propagatedRouteTable = propagatedRouteTable;
            return this;
        }

        /**
         * @param propagatedRouteTable A `propagated_route_table` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder propagatedRouteTable(PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTableArgs propagatedRouteTable) {
            return propagatedRouteTable(Output.of(propagatedRouteTable));
        }

        public PointToPointVpnGatewayConnectionConfigurationRouteArgs build() {
            $.associatedRouteTableId = Objects.requireNonNull($.associatedRouteTableId, "expected parameter 'associatedRouteTableId' to be non-null");
            return $;
        }
    }

}
