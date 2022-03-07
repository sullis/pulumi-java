// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Session affinity option, must be one of the following values: NONE: Connections from the same client IP may go to any instance in the pool. CLIENT_IP: Connections from the same client IP will go to the same instance in the pool while that instance remains healthy. CLIENT_IP_PROTO: Connections from the same client IP with the same IP protocol will go to the same instance in the pool while that instance remains healthy.
     * 
     */
    @EnumType
    public enum TargetPoolSessionAffinity {
        /**
         * 2-tuple hash on packet's source and destination IP addresses. Connections from the same source IP address to the same destination IP address will be served by the same backend VM while that VM remains healthy.
         * 
         */
        ClientIp("CLIENT_IP"),
        /**
         * 1-tuple hash only on packet's source IP address. Connections from the same source IP address will be served by the same backend VM while that VM remains healthy. This option can only be used for Internal TCP/UDP Load Balancing.
         * 
         */
        ClientIpNoDestination("CLIENT_IP_NO_DESTINATION"),
        /**
         * 5-tuple hash on packet's source and destination IP addresses, IP protocol, and source and destination ports. Connections for the same IP protocol from the same source IP address and port to the same destination IP address and port will be served by the same backend VM while that VM remains healthy. This option cannot be used for HTTP(S) load balancing.
         * 
         */
        ClientIpPortProto("CLIENT_IP_PORT_PROTO"),
        /**
         * 3-tuple hash on packet's source and destination IP addresses, and IP protocol. Connections for the same IP protocol from the same source IP address to the same destination IP address will be served by the same backend VM while that VM remains healthy. This option cannot be used for HTTP(S) load balancing.
         * 
         */
        ClientIpProto("CLIENT_IP_PROTO"),
        /**
         * Hash based on a cookie generated by the L7 loadbalancer. Only valid for HTTP(S) load balancing.
         * 
         */
        GeneratedCookie("GENERATED_COOKIE"),
        /**
         * The hash is based on a user specified header field.
         * 
         */
        HeaderField("HEADER_FIELD"),
        /**
         * The hash is based on a user provided cookie.
         * 
         */
        HttpCookie("HTTP_COOKIE"),
        /**
         * No session affinity. Connections from the same client IP may go to any instance in the pool.
         * 
         */
        None("NONE");

        private final String value;

        TargetPoolSessionAffinity(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TargetPoolSessionAffinity[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }