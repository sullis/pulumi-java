// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTransitGatewayMulticastDomainArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTransitGatewayMulticastDomainArgs Empty = new GetTransitGatewayMulticastDomainArgs();

    /**
     * The ID of the transit gateway multicast domain.
     * 
     */
    @Import(name="transitGatewayMulticastDomainId", required=true)
      private final String transitGatewayMulticastDomainId;

    public String transitGatewayMulticastDomainId() {
        return this.transitGatewayMulticastDomainId;
    }

    public GetTransitGatewayMulticastDomainArgs(String transitGatewayMulticastDomainId) {
        this.transitGatewayMulticastDomainId = Objects.requireNonNull(transitGatewayMulticastDomainId, "expected parameter 'transitGatewayMulticastDomainId' to be non-null");
    }

    private GetTransitGatewayMulticastDomainArgs() {
        this.transitGatewayMulticastDomainId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitGatewayMulticastDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String transitGatewayMulticastDomainId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransitGatewayMulticastDomainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transitGatewayMulticastDomainId = defaults.transitGatewayMulticastDomainId;
        }

        public Builder transitGatewayMulticastDomainId(String transitGatewayMulticastDomainId) {
            this.transitGatewayMulticastDomainId = Objects.requireNonNull(transitGatewayMulticastDomainId);
            return this;
        }        public GetTransitGatewayMulticastDomainArgs build() {
            return new GetTransitGatewayMulticastDomainArgs(transitGatewayMulticastDomainId);
        }
    }
}
