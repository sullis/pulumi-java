// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class TransitGatewayMulticastGroupMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransitGatewayMulticastGroupMemberArgs Empty = new TransitGatewayMulticastGroupMemberArgs();

    /**
     * The IP address assigned to the transit gateway multicast group.
     * 
     */
    @Import(name="groupIpAddress", required=true)
      private final Output<String> groupIpAddress;

    public Output<String> groupIpAddress() {
        return this.groupIpAddress;
    }

    /**
     * The ID of the transit gateway attachment.
     * 
     */
    @Import(name="networkInterfaceId", required=true)
      private final Output<String> networkInterfaceId;

    public Output<String> networkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * The ID of the transit gateway multicast domain.
     * 
     */
    @Import(name="transitGatewayMulticastDomainId", required=true)
      private final Output<String> transitGatewayMulticastDomainId;

    public Output<String> transitGatewayMulticastDomainId() {
        return this.transitGatewayMulticastDomainId;
    }

    public TransitGatewayMulticastGroupMemberArgs(
        Output<String> groupIpAddress,
        Output<String> networkInterfaceId,
        Output<String> transitGatewayMulticastDomainId) {
        this.groupIpAddress = Objects.requireNonNull(groupIpAddress, "expected parameter 'groupIpAddress' to be non-null");
        this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId, "expected parameter 'networkInterfaceId' to be non-null");
        this.transitGatewayMulticastDomainId = Objects.requireNonNull(transitGatewayMulticastDomainId, "expected parameter 'transitGatewayMulticastDomainId' to be non-null");
    }

    private TransitGatewayMulticastGroupMemberArgs() {
        this.groupIpAddress = Codegen.empty();
        this.networkInterfaceId = Codegen.empty();
        this.transitGatewayMulticastDomainId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransitGatewayMulticastGroupMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> groupIpAddress;
        private Output<String> networkInterfaceId;
        private Output<String> transitGatewayMulticastDomainId;

        public Builder() {
    	      // Empty
        }

        public Builder(TransitGatewayMulticastGroupMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupIpAddress = defaults.groupIpAddress;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.transitGatewayMulticastDomainId = defaults.transitGatewayMulticastDomainId;
        }

        public Builder groupIpAddress(Output<String> groupIpAddress) {
            this.groupIpAddress = Objects.requireNonNull(groupIpAddress);
            return this;
        }
        public Builder groupIpAddress(String groupIpAddress) {
            this.groupIpAddress = Output.of(Objects.requireNonNull(groupIpAddress));
            return this;
        }
        public Builder networkInterfaceId(Output<String> networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Output.of(Objects.requireNonNull(networkInterfaceId));
            return this;
        }
        public Builder transitGatewayMulticastDomainId(Output<String> transitGatewayMulticastDomainId) {
            this.transitGatewayMulticastDomainId = Objects.requireNonNull(transitGatewayMulticastDomainId);
            return this;
        }
        public Builder transitGatewayMulticastDomainId(String transitGatewayMulticastDomainId) {
            this.transitGatewayMulticastDomainId = Output.of(Objects.requireNonNull(transitGatewayMulticastDomainId));
            return this;
        }        public TransitGatewayMulticastGroupMemberArgs build() {
            return new TransitGatewayMulticastGroupMemberArgs(groupIpAddress, networkInterfaceId, transitGatewayMulticastDomainId);
        }
    }
}
