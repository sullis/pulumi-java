// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVpcEndpointDnsEntry extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcEndpointDnsEntry Empty = new GetVpcEndpointDnsEntry();

    /**
     * The DNS name.
     * 
     */
    @Import(name="dnsName", required=true)
    private String dnsName;

    /**
     * @return The DNS name.
     * 
     */
    public String dnsName() {
        return this.dnsName;
    }

    /**
     * The ID of the private hosted zone.
     * 
     */
    @Import(name="hostedZoneId", required=true)
    private String hostedZoneId;

    /**
     * @return The ID of the private hosted zone.
     * 
     */
    public String hostedZoneId() {
        return this.hostedZoneId;
    }

    private GetVpcEndpointDnsEntry() {}

    private GetVpcEndpointDnsEntry(GetVpcEndpointDnsEntry $) {
        this.dnsName = $.dnsName;
        this.hostedZoneId = $.hostedZoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcEndpointDnsEntry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcEndpointDnsEntry $;

        public Builder() {
            $ = new GetVpcEndpointDnsEntry();
        }

        public Builder(GetVpcEndpointDnsEntry defaults) {
            $ = new GetVpcEndpointDnsEntry(Objects.requireNonNull(defaults));
        }

        /**
         * @param dnsName The DNS name.
         * 
         * @return builder
         * 
         */
        public Builder dnsName(String dnsName) {
            $.dnsName = dnsName;
            return this;
        }

        /**
         * @param hostedZoneId The ID of the private hosted zone.
         * 
         * @return builder
         * 
         */
        public Builder hostedZoneId(String hostedZoneId) {
            $.hostedZoneId = hostedZoneId;
            return this;
        }

        public GetVpcEndpointDnsEntry build() {
            $.dnsName = Objects.requireNonNull($.dnsName, "expected parameter 'dnsName' to be non-null");
            $.hostedZoneId = Objects.requireNonNull($.hostedZoneId, "expected parameter 'hostedZoneId' to be non-null");
            return $;
        }
    }

}
