// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.servicenetworking;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionArgs Empty = new ConnectionArgs();

    /**
     * Name of VPC network connected with service producers using VPC peering.
     * 
     */
    @Import(name="network", required=true)
    private Output<String> network;

    /**
     * @return Name of VPC network connected with service producers using VPC peering.
     * 
     */
    public Output<String> network() {
        return this.network;
    }

    /**
     * Named IP address range(s) of PEERING type reserved for
     * this service provider. Note that invoking this method with a different range when connection
     * is already established will not reallocate already provisioned service producer subnetworks.
     * 
     */
    @Import(name="reservedPeeringRanges", required=true)
    private Output<List<String>> reservedPeeringRanges;

    /**
     * @return Named IP address range(s) of PEERING type reserved for
     * this service provider. Note that invoking this method with a different range when connection
     * is already established will not reallocate already provisioned service producer subnetworks.
     * 
     */
    public Output<List<String>> reservedPeeringRanges() {
        return this.reservedPeeringRanges;
    }

    /**
     * Provider peering service that is managing peering connectivity for a
     * service provider organization. For Google services that support this functionality it is
     * &#39;servicenetworking.googleapis.com&#39;.
     * 
     */
    @Import(name="service", required=true)
    private Output<String> service;

    /**
     * @return Provider peering service that is managing peering connectivity for a
     * service provider organization. For Google services that support this functionality it is
     * &#39;servicenetworking.googleapis.com&#39;.
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    private ConnectionArgs() {}

    private ConnectionArgs(ConnectionArgs $) {
        this.network = $.network;
        this.reservedPeeringRanges = $.reservedPeeringRanges;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionArgs $;

        public Builder() {
            $ = new ConnectionArgs();
        }

        public Builder(ConnectionArgs defaults) {
            $ = new ConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param network Name of VPC network connected with service producers using VPC peering.
         * 
         * @return builder
         * 
         */
        public Builder network(Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network Name of VPC network connected with service producers using VPC peering.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param reservedPeeringRanges Named IP address range(s) of PEERING type reserved for
         * this service provider. Note that invoking this method with a different range when connection
         * is already established will not reallocate already provisioned service producer subnetworks.
         * 
         * @return builder
         * 
         */
        public Builder reservedPeeringRanges(Output<List<String>> reservedPeeringRanges) {
            $.reservedPeeringRanges = reservedPeeringRanges;
            return this;
        }

        /**
         * @param reservedPeeringRanges Named IP address range(s) of PEERING type reserved for
         * this service provider. Note that invoking this method with a different range when connection
         * is already established will not reallocate already provisioned service producer subnetworks.
         * 
         * @return builder
         * 
         */
        public Builder reservedPeeringRanges(List<String> reservedPeeringRanges) {
            return reservedPeeringRanges(Output.of(reservedPeeringRanges));
        }

        /**
         * @param reservedPeeringRanges Named IP address range(s) of PEERING type reserved for
         * this service provider. Note that invoking this method with a different range when connection
         * is already established will not reallocate already provisioned service producer subnetworks.
         * 
         * @return builder
         * 
         */
        public Builder reservedPeeringRanges(String... reservedPeeringRanges) {
            return reservedPeeringRanges(List.of(reservedPeeringRanges));
        }

        /**
         * @param service Provider peering service that is managing peering connectivity for a
         * service provider organization. For Google services that support this functionality it is
         * &#39;servicenetworking.googleapis.com&#39;.
         * 
         * @return builder
         * 
         */
        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service Provider peering service that is managing peering connectivity for a
         * service provider organization. For Google services that support this functionality it is
         * &#39;servicenetworking.googleapis.com&#39;.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        public ConnectionArgs build() {
            $.network = Objects.requireNonNull($.network, "expected parameter 'network' to be non-null");
            $.reservedPeeringRanges = Objects.requireNonNull($.reservedPeeringRanges, "expected parameter 'reservedPeeringRanges' to be non-null");
            $.service = Objects.requireNonNull($.service, "expected parameter 'service' to be non-null");
            return $;
        }
    }

}
