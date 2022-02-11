// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetTransitGatewayMulticastGroupMemberArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTransitGatewayMulticastGroupMemberArgs Empty = new GetTransitGatewayMulticastGroupMemberArgs();

    @InputImport(name="groupIpAddress", required=true)
    private final String groupIpAddress;

    public String getGroupIpAddress() {
        return this.groupIpAddress;
    }

    @InputImport(name="networkInterfaceId", required=true)
    private final String networkInterfaceId;

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    @InputImport(name="transitGatewayMulticastDomainId", required=true)
    private final String transitGatewayMulticastDomainId;

    public String getTransitGatewayMulticastDomainId() {
        return this.transitGatewayMulticastDomainId;
    }

    public GetTransitGatewayMulticastGroupMemberArgs(
        String groupIpAddress,
        String networkInterfaceId,
        String transitGatewayMulticastDomainId) {
        this.groupIpAddress = Objects.requireNonNull(groupIpAddress, "expected parameter 'groupIpAddress' to be non-null");
        this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId, "expected parameter 'networkInterfaceId' to be non-null");
        this.transitGatewayMulticastDomainId = Objects.requireNonNull(transitGatewayMulticastDomainId, "expected parameter 'transitGatewayMulticastDomainId' to be non-null");
    }

    private GetTransitGatewayMulticastGroupMemberArgs() {
        this.groupIpAddress = null;
        this.networkInterfaceId = null;
        this.transitGatewayMulticastDomainId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitGatewayMulticastGroupMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String groupIpAddress;
        private String networkInterfaceId;
        private String transitGatewayMulticastDomainId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransitGatewayMulticastGroupMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupIpAddress = defaults.groupIpAddress;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.transitGatewayMulticastDomainId = defaults.transitGatewayMulticastDomainId;
        }

        public Builder setGroupIpAddress(String groupIpAddress) {
            this.groupIpAddress = Objects.requireNonNull(groupIpAddress);
            return this;
        }

        public Builder setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }

        public Builder setTransitGatewayMulticastDomainId(String transitGatewayMulticastDomainId) {
            this.transitGatewayMulticastDomainId = Objects.requireNonNull(transitGatewayMulticastDomainId);
            return this;
        }

        public GetTransitGatewayMulticastGroupMemberArgs build() {
            return new GetTransitGatewayMulticastGroupMemberArgs(groupIpAddress, networkInterfaceId, transitGatewayMulticastDomainId);
        }
    }
}
