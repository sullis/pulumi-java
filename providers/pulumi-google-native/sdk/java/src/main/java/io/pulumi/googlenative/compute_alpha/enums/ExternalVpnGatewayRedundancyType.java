// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Indicates the user-supplied redundancy type of this external VPN gateway.
     * 
     */
    @EnumType
    public enum ExternalVpnGatewayRedundancyType {
        /**
         * The external VPN gateway has four public IP addresses; at the time of writing this API, the AWS virtual private gateway is an example which has four public IP addresses for high availability connections; there should be two VPN connections in the AWS virtual private gateway , each AWS VPN connection has two public IP addresses; please make sure to put two public IP addresses from one AWS VPN connection into interfaces 0 and 1 of this external VPN gateway, and put the other two public IP addresses from another AWS VPN connection into interfaces 2 and 3 of this external VPN gateway. When displaying highly available configuration status for the VPN tunnels connected to FOUR_IPS_REDUNDANCY external VPN gateway, Google will always detect whether interfaces 0 and 1 are connected on one interface of HA Cloud VPN gateway, and detect whether interfaces 2 and 3 are connected to another interface of the HA Cloud VPN gateway.
         * 
         */
        FourIpsRedundancy("FOUR_IPS_REDUNDANCY"),
        /**
         * The external VPN gateway has only one public IP address which internally provide redundancy or failover.
         * 
         */
        SingleIpInternallyRedundant("SINGLE_IP_INTERNALLY_REDUNDANT"),
        /**
         * The external VPN gateway has two public IP addresses which are redundant with each other, the following two types of setup on your on-premises side would have this type of redundancy: (1) Two separate on-premises gateways, each with one public IP address, the two on-premises gateways are redundant with each other. (2) A single on-premise gateway with two public IP addresses that are redundant with eatch other.
         * 
         */
        TwoIpsRedundancy("TWO_IPS_REDUNDANCY");

        private final String value;

        ExternalVpnGatewayRedundancyType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ExternalVpnGatewayRedundancyType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }