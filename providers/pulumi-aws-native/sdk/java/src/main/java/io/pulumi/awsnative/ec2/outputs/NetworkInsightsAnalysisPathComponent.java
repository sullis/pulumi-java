// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.outputs.NetworkInsightsAnalysisAnalysisAclRule;
import io.pulumi.awsnative.ec2.outputs.NetworkInsightsAnalysisAnalysisComponent;
import io.pulumi.awsnative.ec2.outputs.NetworkInsightsAnalysisAnalysisPacketHeader;
import io.pulumi.awsnative.ec2.outputs.NetworkInsightsAnalysisAnalysisRouteTableRoute;
import io.pulumi.awsnative.ec2.outputs.NetworkInsightsAnalysisAnalysisSecurityGroupRule;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkInsightsAnalysisPathComponent {
    private final @Nullable NetworkInsightsAnalysisAnalysisAclRule aclRule;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent component;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent destinationVpc;
    private final @Nullable NetworkInsightsAnalysisAnalysisPacketHeader inboundHeader;
    private final @Nullable NetworkInsightsAnalysisAnalysisPacketHeader outboundHeader;
    private final @Nullable NetworkInsightsAnalysisAnalysisRouteTableRoute routeTableRoute;
    private final @Nullable NetworkInsightsAnalysisAnalysisSecurityGroupRule securityGroupRule;
    private final @Nullable Integer sequenceNumber;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent sourceVpc;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent subnet;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent vpc;

    @OutputCustomType.Constructor({"aclRule","component","destinationVpc","inboundHeader","outboundHeader","routeTableRoute","securityGroupRule","sequenceNumber","sourceVpc","subnet","vpc"})
    private NetworkInsightsAnalysisPathComponent(
        @Nullable NetworkInsightsAnalysisAnalysisAclRule aclRule,
        @Nullable NetworkInsightsAnalysisAnalysisComponent component,
        @Nullable NetworkInsightsAnalysisAnalysisComponent destinationVpc,
        @Nullable NetworkInsightsAnalysisAnalysisPacketHeader inboundHeader,
        @Nullable NetworkInsightsAnalysisAnalysisPacketHeader outboundHeader,
        @Nullable NetworkInsightsAnalysisAnalysisRouteTableRoute routeTableRoute,
        @Nullable NetworkInsightsAnalysisAnalysisSecurityGroupRule securityGroupRule,
        @Nullable Integer sequenceNumber,
        @Nullable NetworkInsightsAnalysisAnalysisComponent sourceVpc,
        @Nullable NetworkInsightsAnalysisAnalysisComponent subnet,
        @Nullable NetworkInsightsAnalysisAnalysisComponent vpc) {
        this.aclRule = aclRule;
        this.component = component;
        this.destinationVpc = destinationVpc;
        this.inboundHeader = inboundHeader;
        this.outboundHeader = outboundHeader;
        this.routeTableRoute = routeTableRoute;
        this.securityGroupRule = securityGroupRule;
        this.sequenceNumber = sequenceNumber;
        this.sourceVpc = sourceVpc;
        this.subnet = subnet;
        this.vpc = vpc;
    }

    public Optional<NetworkInsightsAnalysisAnalysisAclRule> getAclRule() {
        return Optional.ofNullable(this.aclRule);
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getComponent() {
        return Optional.ofNullable(this.component);
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getDestinationVpc() {
        return Optional.ofNullable(this.destinationVpc);
    }
    public Optional<NetworkInsightsAnalysisAnalysisPacketHeader> getInboundHeader() {
        return Optional.ofNullable(this.inboundHeader);
    }
    public Optional<NetworkInsightsAnalysisAnalysisPacketHeader> getOutboundHeader() {
        return Optional.ofNullable(this.outboundHeader);
    }
    public Optional<NetworkInsightsAnalysisAnalysisRouteTableRoute> getRouteTableRoute() {
        return Optional.ofNullable(this.routeTableRoute);
    }
    public Optional<NetworkInsightsAnalysisAnalysisSecurityGroupRule> getSecurityGroupRule() {
        return Optional.ofNullable(this.securityGroupRule);
    }
    public Optional<Integer> getSequenceNumber() {
        return Optional.ofNullable(this.sequenceNumber);
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getSourceVpc() {
        return Optional.ofNullable(this.sourceVpc);
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getSubnet() {
        return Optional.ofNullable(this.subnet);
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getVpc() {
        return Optional.ofNullable(this.vpc);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAnalysisPathComponent defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable NetworkInsightsAnalysisAnalysisAclRule aclRule;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent component;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent destinationVpc;
        private @Nullable NetworkInsightsAnalysisAnalysisPacketHeader inboundHeader;
        private @Nullable NetworkInsightsAnalysisAnalysisPacketHeader outboundHeader;
        private @Nullable NetworkInsightsAnalysisAnalysisRouteTableRoute routeTableRoute;
        private @Nullable NetworkInsightsAnalysisAnalysisSecurityGroupRule securityGroupRule;
        private @Nullable Integer sequenceNumber;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent sourceVpc;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent subnet;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent vpc;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAnalysisPathComponent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aclRule = defaults.aclRule;
    	      this.component = defaults.component;
    	      this.destinationVpc = defaults.destinationVpc;
    	      this.inboundHeader = defaults.inboundHeader;
    	      this.outboundHeader = defaults.outboundHeader;
    	      this.routeTableRoute = defaults.routeTableRoute;
    	      this.securityGroupRule = defaults.securityGroupRule;
    	      this.sequenceNumber = defaults.sequenceNumber;
    	      this.sourceVpc = defaults.sourceVpc;
    	      this.subnet = defaults.subnet;
    	      this.vpc = defaults.vpc;
        }

        public Builder setAclRule(@Nullable NetworkInsightsAnalysisAnalysisAclRule aclRule) {
            this.aclRule = aclRule;
            return this;
        }

        public Builder setComponent(@Nullable NetworkInsightsAnalysisAnalysisComponent component) {
            this.component = component;
            return this;
        }

        public Builder setDestinationVpc(@Nullable NetworkInsightsAnalysisAnalysisComponent destinationVpc) {
            this.destinationVpc = destinationVpc;
            return this;
        }

        public Builder setInboundHeader(@Nullable NetworkInsightsAnalysisAnalysisPacketHeader inboundHeader) {
            this.inboundHeader = inboundHeader;
            return this;
        }

        public Builder setOutboundHeader(@Nullable NetworkInsightsAnalysisAnalysisPacketHeader outboundHeader) {
            this.outboundHeader = outboundHeader;
            return this;
        }

        public Builder setRouteTableRoute(@Nullable NetworkInsightsAnalysisAnalysisRouteTableRoute routeTableRoute) {
            this.routeTableRoute = routeTableRoute;
            return this;
        }

        public Builder setSecurityGroupRule(@Nullable NetworkInsightsAnalysisAnalysisSecurityGroupRule securityGroupRule) {
            this.securityGroupRule = securityGroupRule;
            return this;
        }

        public Builder setSequenceNumber(@Nullable Integer sequenceNumber) {
            this.sequenceNumber = sequenceNumber;
            return this;
        }

        public Builder setSourceVpc(@Nullable NetworkInsightsAnalysisAnalysisComponent sourceVpc) {
            this.sourceVpc = sourceVpc;
            return this;
        }

        public Builder setSubnet(@Nullable NetworkInsightsAnalysisAnalysisComponent subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder setVpc(@Nullable NetworkInsightsAnalysisAnalysisComponent vpc) {
            this.vpc = vpc;
            return this;
        }

        public NetworkInsightsAnalysisPathComponent build() {
            return new NetworkInsightsAnalysisPathComponent(aclRule, component, destinationVpc, inboundHeader, outboundHeader, routeTableRoute, securityGroupRule, sequenceNumber, sourceVpc, subnet, vpc);
        }
    }
}
