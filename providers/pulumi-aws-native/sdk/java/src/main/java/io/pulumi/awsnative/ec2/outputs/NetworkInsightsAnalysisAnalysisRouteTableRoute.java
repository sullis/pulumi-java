// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkInsightsAnalysisAnalysisRouteTableRoute {
    private final @Nullable String destinationCidr;
    private final @Nullable String destinationPrefixListId;
    private final @Nullable String egressOnlyInternetGatewayId;
    private final @Nullable String gatewayId;
    private final @Nullable String instanceId;
    private final @Nullable String natGatewayId;
    private final @Nullable String networkInterfaceId;
    private final @Nullable String origin;
    private final @Nullable String transitGatewayId;
    private final @Nullable String vpcPeeringConnectionId;

    @OutputCustomType.Constructor({"destinationCidr","destinationPrefixListId","egressOnlyInternetGatewayId","gatewayId","instanceId","natGatewayId","networkInterfaceId","origin","transitGatewayId","vpcPeeringConnectionId"})
    private NetworkInsightsAnalysisAnalysisRouteTableRoute(
        @Nullable String destinationCidr,
        @Nullable String destinationPrefixListId,
        @Nullable String egressOnlyInternetGatewayId,
        @Nullable String gatewayId,
        @Nullable String instanceId,
        @Nullable String natGatewayId,
        @Nullable String networkInterfaceId,
        @Nullable String origin,
        @Nullable String transitGatewayId,
        @Nullable String vpcPeeringConnectionId) {
        this.destinationCidr = destinationCidr;
        this.destinationPrefixListId = destinationPrefixListId;
        this.egressOnlyInternetGatewayId = egressOnlyInternetGatewayId;
        this.gatewayId = gatewayId;
        this.instanceId = instanceId;
        this.natGatewayId = natGatewayId;
        this.networkInterfaceId = networkInterfaceId;
        this.origin = origin;
        this.transitGatewayId = transitGatewayId;
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    }

    public Optional<String> getDestinationCidr() {
        return Optional.ofNullable(this.destinationCidr);
    }
    public Optional<String> getDestinationPrefixListId() {
        return Optional.ofNullable(this.destinationPrefixListId);
    }
    public Optional<String> getEgressOnlyInternetGatewayId() {
        return Optional.ofNullable(this.egressOnlyInternetGatewayId);
    }
    public Optional<String> getGatewayId() {
        return Optional.ofNullable(this.gatewayId);
    }
    public Optional<String> getInstanceId() {
        return Optional.ofNullable(this.instanceId);
    }
    public Optional<String> getNatGatewayId() {
        return Optional.ofNullable(this.natGatewayId);
    }
    public Optional<String> getNetworkInterfaceId() {
        return Optional.ofNullable(this.networkInterfaceId);
    }
    public Optional<String> getOrigin() {
        return Optional.ofNullable(this.origin);
    }
    public Optional<String> getTransitGatewayId() {
        return Optional.ofNullable(this.transitGatewayId);
    }
    public Optional<String> getVpcPeeringConnectionId() {
        return Optional.ofNullable(this.vpcPeeringConnectionId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAnalysisAnalysisRouteTableRoute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String destinationCidr;
        private @Nullable String destinationPrefixListId;
        private @Nullable String egressOnlyInternetGatewayId;
        private @Nullable String gatewayId;
        private @Nullable String instanceId;
        private @Nullable String natGatewayId;
        private @Nullable String networkInterfaceId;
        private @Nullable String origin;
        private @Nullable String transitGatewayId;
        private @Nullable String vpcPeeringConnectionId;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAnalysisAnalysisRouteTableRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationCidr = defaults.destinationCidr;
    	      this.destinationPrefixListId = defaults.destinationPrefixListId;
    	      this.egressOnlyInternetGatewayId = defaults.egressOnlyInternetGatewayId;
    	      this.gatewayId = defaults.gatewayId;
    	      this.instanceId = defaults.instanceId;
    	      this.natGatewayId = defaults.natGatewayId;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.origin = defaults.origin;
    	      this.transitGatewayId = defaults.transitGatewayId;
    	      this.vpcPeeringConnectionId = defaults.vpcPeeringConnectionId;
        }

        public Builder setDestinationCidr(@Nullable String destinationCidr) {
            this.destinationCidr = destinationCidr;
            return this;
        }

        public Builder setDestinationPrefixListId(@Nullable String destinationPrefixListId) {
            this.destinationPrefixListId = destinationPrefixListId;
            return this;
        }

        public Builder setEgressOnlyInternetGatewayId(@Nullable String egressOnlyInternetGatewayId) {
            this.egressOnlyInternetGatewayId = egressOnlyInternetGatewayId;
            return this;
        }

        public Builder setGatewayId(@Nullable String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        public Builder setInstanceId(@Nullable String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        public Builder setNatGatewayId(@Nullable String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        public Builder setNetworkInterfaceId(@Nullable String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        public Builder setOrigin(@Nullable String origin) {
            this.origin = origin;
            return this;
        }

        public Builder setTransitGatewayId(@Nullable String transitGatewayId) {
            this.transitGatewayId = transitGatewayId;
            return this;
        }

        public Builder setVpcPeeringConnectionId(@Nullable String vpcPeeringConnectionId) {
            this.vpcPeeringConnectionId = vpcPeeringConnectionId;
            return this;
        }

        public NetworkInsightsAnalysisAnalysisRouteTableRoute build() {
            return new NetworkInsightsAnalysisAnalysisRouteTableRoute(destinationCidr, destinationPrefixListId, egressOnlyInternetGatewayId, gatewayId, instanceId, natGatewayId, networkInterfaceId, origin, transitGatewayId, vpcPeeringConnectionId);
        }
    }
}
