// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.RouterAdvertisedIpRangeResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RouterBgpResponse extends com.pulumi.resources.InvokeArgs {

    public static final RouterBgpResponse Empty = new RouterBgpResponse();

    /**
     * User-specified flag to indicate which mode to use for advertisement. The options are DEFAULT or CUSTOM.
     * 
     */
    @Import(name="advertiseMode", required=true)
    private String advertiseMode;

    /**
     * @return User-specified flag to indicate which mode to use for advertisement. The options are DEFAULT or CUSTOM.
     * 
     */
    public String advertiseMode() {
        return this.advertiseMode;
    }

    /**
     * User-specified list of prefix groups to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These groups will be advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
     * 
     */
    @Import(name="advertisedGroups", required=true)
    private List<String> advertisedGroups;

    /**
     * @return User-specified list of prefix groups to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These groups will be advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
     * 
     */
    public List<String> advertisedGroups() {
        return this.advertisedGroups;
    }

    /**
     * User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These IP ranges will be advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
     * 
     */
    @Import(name="advertisedIpRanges", required=true)
    private List<RouterAdvertisedIpRangeResponse> advertisedIpRanges;

    /**
     * @return User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These IP ranges will be advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
     * 
     */
    public List<RouterAdvertisedIpRangeResponse> advertisedIpRanges() {
        return this.advertisedIpRanges;
    }

    /**
     * Local BGP Autonomous System Number (ASN). Must be an RFC6996 private ASN, either 16-bit or 32-bit. The value will be fixed for this router resource. All VPN tunnels that link to this router will have the same local ASN.
     * 
     */
    @Import(name="asn", required=true)
    private Integer asn;

    /**
     * @return Local BGP Autonomous System Number (ASN). Must be an RFC6996 private ASN, either 16-bit or 32-bit. The value will be fixed for this router resource. All VPN tunnels that link to this router will have the same local ASN.
     * 
     */
    public Integer asn() {
        return this.asn;
    }

    /**
     * The interval in seconds between BGP keepalive messages that are sent to the peer. Hold time is three times the interval at which keepalive messages are sent, and the hold time is the maximum number of seconds allowed to elapse between successive keepalive messages that BGP receives from a peer. BGP will use the smaller of either the local hold time value or the peer&#39;s hold time value as the hold time for the BGP connection between the two peers. If set, this value must be between 20 and 60. The default is 20.
     * 
     */
    @Import(name="keepaliveInterval", required=true)
    private Integer keepaliveInterval;

    /**
     * @return The interval in seconds between BGP keepalive messages that are sent to the peer. Hold time is three times the interval at which keepalive messages are sent, and the hold time is the maximum number of seconds allowed to elapse between successive keepalive messages that BGP receives from a peer. BGP will use the smaller of either the local hold time value or the peer&#39;s hold time value as the hold time for the BGP connection between the two peers. If set, this value must be between 20 and 60. The default is 20.
     * 
     */
    public Integer keepaliveInterval() {
        return this.keepaliveInterval;
    }

    private RouterBgpResponse() {}

    private RouterBgpResponse(RouterBgpResponse $) {
        this.advertiseMode = $.advertiseMode;
        this.advertisedGroups = $.advertisedGroups;
        this.advertisedIpRanges = $.advertisedIpRanges;
        this.asn = $.asn;
        this.keepaliveInterval = $.keepaliveInterval;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouterBgpResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouterBgpResponse $;

        public Builder() {
            $ = new RouterBgpResponse();
        }

        public Builder(RouterBgpResponse defaults) {
            $ = new RouterBgpResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param advertiseMode User-specified flag to indicate which mode to use for advertisement. The options are DEFAULT or CUSTOM.
         * 
         * @return builder
         * 
         */
        public Builder advertiseMode(String advertiseMode) {
            $.advertiseMode = advertiseMode;
            return this;
        }

        /**
         * @param advertisedGroups User-specified list of prefix groups to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These groups will be advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
         * 
         * @return builder
         * 
         */
        public Builder advertisedGroups(List<String> advertisedGroups) {
            $.advertisedGroups = advertisedGroups;
            return this;
        }

        /**
         * @param advertisedGroups User-specified list of prefix groups to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These groups will be advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
         * 
         * @return builder
         * 
         */
        public Builder advertisedGroups(String... advertisedGroups) {
            return advertisedGroups(List.of(advertisedGroups));
        }

        /**
         * @param advertisedIpRanges User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These IP ranges will be advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
         * 
         * @return builder
         * 
         */
        public Builder advertisedIpRanges(List<RouterAdvertisedIpRangeResponse> advertisedIpRanges) {
            $.advertisedIpRanges = advertisedIpRanges;
            return this;
        }

        /**
         * @param advertisedIpRanges User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These IP ranges will be advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
         * 
         * @return builder
         * 
         */
        public Builder advertisedIpRanges(RouterAdvertisedIpRangeResponse... advertisedIpRanges) {
            return advertisedIpRanges(List.of(advertisedIpRanges));
        }

        /**
         * @param asn Local BGP Autonomous System Number (ASN). Must be an RFC6996 private ASN, either 16-bit or 32-bit. The value will be fixed for this router resource. All VPN tunnels that link to this router will have the same local ASN.
         * 
         * @return builder
         * 
         */
        public Builder asn(Integer asn) {
            $.asn = asn;
            return this;
        }

        /**
         * @param keepaliveInterval The interval in seconds between BGP keepalive messages that are sent to the peer. Hold time is three times the interval at which keepalive messages are sent, and the hold time is the maximum number of seconds allowed to elapse between successive keepalive messages that BGP receives from a peer. BGP will use the smaller of either the local hold time value or the peer&#39;s hold time value as the hold time for the BGP connection between the two peers. If set, this value must be between 20 and 60. The default is 20.
         * 
         * @return builder
         * 
         */
        public Builder keepaliveInterval(Integer keepaliveInterval) {
            $.keepaliveInterval = keepaliveInterval;
            return this;
        }

        public RouterBgpResponse build() {
            $.advertiseMode = Objects.requireNonNull($.advertiseMode, "expected parameter 'advertiseMode' to be non-null");
            $.advertisedGroups = Objects.requireNonNull($.advertisedGroups, "expected parameter 'advertisedGroups' to be non-null");
            $.advertisedIpRanges = Objects.requireNonNull($.advertisedIpRanges, "expected parameter 'advertisedIpRanges' to be non-null");
            $.asn = Objects.requireNonNull($.asn, "expected parameter 'asn' to be non-null");
            $.keepaliveInterval = Objects.requireNonNull($.keepaliveInterval, "expected parameter 'keepaliveInterval' to be non-null");
            return $;
        }
    }

}
