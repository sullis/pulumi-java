// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.enums.ExpressRoutePeeringState;
import com.pulumi.azurenative.network.enums.ExpressRoutePeeringType;
import com.pulumi.azurenative.network.inputs.ExpressRouteCircuitConnectionArgs;
import com.pulumi.azurenative.network.inputs.ExpressRouteCircuitPeeringConfigArgs;
import com.pulumi.azurenative.network.inputs.ExpressRouteCircuitStatsArgs;
import com.pulumi.azurenative.network.inputs.Ipv6ExpressRouteCircuitPeeringConfigArgs;
import com.pulumi.azurenative.network.inputs.SubResourceArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExpressRouteCircuitPeeringArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExpressRouteCircuitPeeringArgs Empty = new ExpressRouteCircuitPeeringArgs();

    /**
     * The Azure ASN.
     * 
     */
    @Import(name="azureASN")
    private @Nullable Output<Integer> azureASN;

    /**
     * @return The Azure ASN.
     * 
     */
    public Optional<Output<Integer>> azureASN() {
        return Optional.ofNullable(this.azureASN);
    }

    /**
     * The name of the express route circuit.
     * 
     */
    @Import(name="circuitName", required=true)
    private Output<String> circuitName;

    /**
     * @return The name of the express route circuit.
     * 
     */
    public Output<String> circuitName() {
        return this.circuitName;
    }

    /**
     * The list of circuit connections associated with Azure Private Peering for this circuit.
     * 
     */
    @Import(name="connections")
    private @Nullable Output<List<ExpressRouteCircuitConnectionArgs>> connections;

    /**
     * @return The list of circuit connections associated with Azure Private Peering for this circuit.
     * 
     */
    public Optional<Output<List<ExpressRouteCircuitConnectionArgs>>> connections() {
        return Optional.ofNullable(this.connections);
    }

    /**
     * The GatewayManager Etag.
     * 
     */
    @Import(name="gatewayManagerEtag")
    private @Nullable Output<String> gatewayManagerEtag;

    /**
     * @return The GatewayManager Etag.
     * 
     */
    public Optional<Output<String>> gatewayManagerEtag() {
        return Optional.ofNullable(this.gatewayManagerEtag);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The IPv6 peering configuration.
     * 
     */
    @Import(name="ipv6PeeringConfig")
    private @Nullable Output<Ipv6ExpressRouteCircuitPeeringConfigArgs> ipv6PeeringConfig;

    /**
     * @return The IPv6 peering configuration.
     * 
     */
    public Optional<Output<Ipv6ExpressRouteCircuitPeeringConfigArgs>> ipv6PeeringConfig() {
        return Optional.ofNullable(this.ipv6PeeringConfig);
    }

    /**
     * The Microsoft peering configuration.
     * 
     */
    @Import(name="microsoftPeeringConfig")
    private @Nullable Output<ExpressRouteCircuitPeeringConfigArgs> microsoftPeeringConfig;

    /**
     * @return The Microsoft peering configuration.
     * 
     */
    public Optional<Output<ExpressRouteCircuitPeeringConfigArgs>> microsoftPeeringConfig() {
        return Optional.ofNullable(this.microsoftPeeringConfig);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The peer ASN.
     * 
     */
    @Import(name="peerASN")
    private @Nullable Output<Double> peerASN;

    /**
     * @return The peer ASN.
     * 
     */
    public Optional<Output<Double>> peerASN() {
        return Optional.ofNullable(this.peerASN);
    }

    /**
     * The name of the peering.
     * 
     */
    @Import(name="peeringName")
    private @Nullable Output<String> peeringName;

    /**
     * @return The name of the peering.
     * 
     */
    public Optional<Output<String>> peeringName() {
        return Optional.ofNullable(this.peeringName);
    }

    /**
     * The peering type.
     * 
     */
    @Import(name="peeringType")
    private @Nullable Output<Either<String,ExpressRoutePeeringType>> peeringType;

    /**
     * @return The peering type.
     * 
     */
    public Optional<Output<Either<String,ExpressRoutePeeringType>>> peeringType() {
        return Optional.ofNullable(this.peeringType);
    }

    /**
     * The primary port.
     * 
     */
    @Import(name="primaryAzurePort")
    private @Nullable Output<String> primaryAzurePort;

    /**
     * @return The primary port.
     * 
     */
    public Optional<Output<String>> primaryAzurePort() {
        return Optional.ofNullable(this.primaryAzurePort);
    }

    /**
     * The primary address prefix.
     * 
     */
    @Import(name="primaryPeerAddressPrefix")
    private @Nullable Output<String> primaryPeerAddressPrefix;

    /**
     * @return The primary address prefix.
     * 
     */
    public Optional<Output<String>> primaryPeerAddressPrefix() {
        return Optional.ofNullable(this.primaryPeerAddressPrefix);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The reference to the RouteFilter resource.
     * 
     */
    @Import(name="routeFilter")
    private @Nullable Output<SubResourceArgs> routeFilter;

    /**
     * @return The reference to the RouteFilter resource.
     * 
     */
    public Optional<Output<SubResourceArgs>> routeFilter() {
        return Optional.ofNullable(this.routeFilter);
    }

    /**
     * The secondary port.
     * 
     */
    @Import(name="secondaryAzurePort")
    private @Nullable Output<String> secondaryAzurePort;

    /**
     * @return The secondary port.
     * 
     */
    public Optional<Output<String>> secondaryAzurePort() {
        return Optional.ofNullable(this.secondaryAzurePort);
    }

    /**
     * The secondary address prefix.
     * 
     */
    @Import(name="secondaryPeerAddressPrefix")
    private @Nullable Output<String> secondaryPeerAddressPrefix;

    /**
     * @return The secondary address prefix.
     * 
     */
    public Optional<Output<String>> secondaryPeerAddressPrefix() {
        return Optional.ofNullable(this.secondaryPeerAddressPrefix);
    }

    /**
     * The shared key.
     * 
     */
    @Import(name="sharedKey")
    private @Nullable Output<String> sharedKey;

    /**
     * @return The shared key.
     * 
     */
    public Optional<Output<String>> sharedKey() {
        return Optional.ofNullable(this.sharedKey);
    }

    /**
     * The peering state.
     * 
     */
    @Import(name="state")
    private @Nullable Output<Either<String,ExpressRoutePeeringState>> state;

    /**
     * @return The peering state.
     * 
     */
    public Optional<Output<Either<String,ExpressRoutePeeringState>>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The peering stats of express route circuit.
     * 
     */
    @Import(name="stats")
    private @Nullable Output<ExpressRouteCircuitStatsArgs> stats;

    /**
     * @return The peering stats of express route circuit.
     * 
     */
    public Optional<Output<ExpressRouteCircuitStatsArgs>> stats() {
        return Optional.ofNullable(this.stats);
    }

    /**
     * The VLAN ID.
     * 
     */
    @Import(name="vlanId")
    private @Nullable Output<Integer> vlanId;

    /**
     * @return The VLAN ID.
     * 
     */
    public Optional<Output<Integer>> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    private ExpressRouteCircuitPeeringArgs() {}

    private ExpressRouteCircuitPeeringArgs(ExpressRouteCircuitPeeringArgs $) {
        this.azureASN = $.azureASN;
        this.circuitName = $.circuitName;
        this.connections = $.connections;
        this.gatewayManagerEtag = $.gatewayManagerEtag;
        this.id = $.id;
        this.ipv6PeeringConfig = $.ipv6PeeringConfig;
        this.microsoftPeeringConfig = $.microsoftPeeringConfig;
        this.name = $.name;
        this.peerASN = $.peerASN;
        this.peeringName = $.peeringName;
        this.peeringType = $.peeringType;
        this.primaryAzurePort = $.primaryAzurePort;
        this.primaryPeerAddressPrefix = $.primaryPeerAddressPrefix;
        this.resourceGroupName = $.resourceGroupName;
        this.routeFilter = $.routeFilter;
        this.secondaryAzurePort = $.secondaryAzurePort;
        this.secondaryPeerAddressPrefix = $.secondaryPeerAddressPrefix;
        this.sharedKey = $.sharedKey;
        this.state = $.state;
        this.stats = $.stats;
        this.vlanId = $.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExpressRouteCircuitPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExpressRouteCircuitPeeringArgs $;

        public Builder() {
            $ = new ExpressRouteCircuitPeeringArgs();
        }

        public Builder(ExpressRouteCircuitPeeringArgs defaults) {
            $ = new ExpressRouteCircuitPeeringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param azureASN The Azure ASN.
         * 
         * @return builder
         * 
         */
        public Builder azureASN(@Nullable Output<Integer> azureASN) {
            $.azureASN = azureASN;
            return this;
        }

        /**
         * @param azureASN The Azure ASN.
         * 
         * @return builder
         * 
         */
        public Builder azureASN(Integer azureASN) {
            return azureASN(Output.of(azureASN));
        }

        /**
         * @param circuitName The name of the express route circuit.
         * 
         * @return builder
         * 
         */
        public Builder circuitName(Output<String> circuitName) {
            $.circuitName = circuitName;
            return this;
        }

        /**
         * @param circuitName The name of the express route circuit.
         * 
         * @return builder
         * 
         */
        public Builder circuitName(String circuitName) {
            return circuitName(Output.of(circuitName));
        }

        /**
         * @param connections The list of circuit connections associated with Azure Private Peering for this circuit.
         * 
         * @return builder
         * 
         */
        public Builder connections(@Nullable Output<List<ExpressRouteCircuitConnectionArgs>> connections) {
            $.connections = connections;
            return this;
        }

        /**
         * @param connections The list of circuit connections associated with Azure Private Peering for this circuit.
         * 
         * @return builder
         * 
         */
        public Builder connections(List<ExpressRouteCircuitConnectionArgs> connections) {
            return connections(Output.of(connections));
        }

        /**
         * @param connections The list of circuit connections associated with Azure Private Peering for this circuit.
         * 
         * @return builder
         * 
         */
        public Builder connections(ExpressRouteCircuitConnectionArgs... connections) {
            return connections(List.of(connections));
        }

        /**
         * @param gatewayManagerEtag The GatewayManager Etag.
         * 
         * @return builder
         * 
         */
        public Builder gatewayManagerEtag(@Nullable Output<String> gatewayManagerEtag) {
            $.gatewayManagerEtag = gatewayManagerEtag;
            return this;
        }

        /**
         * @param gatewayManagerEtag The GatewayManager Etag.
         * 
         * @return builder
         * 
         */
        public Builder gatewayManagerEtag(String gatewayManagerEtag) {
            return gatewayManagerEtag(Output.of(gatewayManagerEtag));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param ipv6PeeringConfig The IPv6 peering configuration.
         * 
         * @return builder
         * 
         */
        public Builder ipv6PeeringConfig(@Nullable Output<Ipv6ExpressRouteCircuitPeeringConfigArgs> ipv6PeeringConfig) {
            $.ipv6PeeringConfig = ipv6PeeringConfig;
            return this;
        }

        /**
         * @param ipv6PeeringConfig The IPv6 peering configuration.
         * 
         * @return builder
         * 
         */
        public Builder ipv6PeeringConfig(Ipv6ExpressRouteCircuitPeeringConfigArgs ipv6PeeringConfig) {
            return ipv6PeeringConfig(Output.of(ipv6PeeringConfig));
        }

        /**
         * @param microsoftPeeringConfig The Microsoft peering configuration.
         * 
         * @return builder
         * 
         */
        public Builder microsoftPeeringConfig(@Nullable Output<ExpressRouteCircuitPeeringConfigArgs> microsoftPeeringConfig) {
            $.microsoftPeeringConfig = microsoftPeeringConfig;
            return this;
        }

        /**
         * @param microsoftPeeringConfig The Microsoft peering configuration.
         * 
         * @return builder
         * 
         */
        public Builder microsoftPeeringConfig(ExpressRouteCircuitPeeringConfigArgs microsoftPeeringConfig) {
            return microsoftPeeringConfig(Output.of(microsoftPeeringConfig));
        }

        /**
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param peerASN The peer ASN.
         * 
         * @return builder
         * 
         */
        public Builder peerASN(@Nullable Output<Double> peerASN) {
            $.peerASN = peerASN;
            return this;
        }

        /**
         * @param peerASN The peer ASN.
         * 
         * @return builder
         * 
         */
        public Builder peerASN(Double peerASN) {
            return peerASN(Output.of(peerASN));
        }

        /**
         * @param peeringName The name of the peering.
         * 
         * @return builder
         * 
         */
        public Builder peeringName(@Nullable Output<String> peeringName) {
            $.peeringName = peeringName;
            return this;
        }

        /**
         * @param peeringName The name of the peering.
         * 
         * @return builder
         * 
         */
        public Builder peeringName(String peeringName) {
            return peeringName(Output.of(peeringName));
        }

        /**
         * @param peeringType The peering type.
         * 
         * @return builder
         * 
         */
        public Builder peeringType(@Nullable Output<Either<String,ExpressRoutePeeringType>> peeringType) {
            $.peeringType = peeringType;
            return this;
        }

        /**
         * @param peeringType The peering type.
         * 
         * @return builder
         * 
         */
        public Builder peeringType(Either<String,ExpressRoutePeeringType> peeringType) {
            return peeringType(Output.of(peeringType));
        }

        /**
         * @param peeringType The peering type.
         * 
         * @return builder
         * 
         */
        public Builder peeringType(String peeringType) {
            return peeringType(Either.ofLeft(peeringType));
        }

        /**
         * @param peeringType The peering type.
         * 
         * @return builder
         * 
         */
        public Builder peeringType(ExpressRoutePeeringType peeringType) {
            return peeringType(Either.ofRight(peeringType));
        }

        /**
         * @param primaryAzurePort The primary port.
         * 
         * @return builder
         * 
         */
        public Builder primaryAzurePort(@Nullable Output<String> primaryAzurePort) {
            $.primaryAzurePort = primaryAzurePort;
            return this;
        }

        /**
         * @param primaryAzurePort The primary port.
         * 
         * @return builder
         * 
         */
        public Builder primaryAzurePort(String primaryAzurePort) {
            return primaryAzurePort(Output.of(primaryAzurePort));
        }

        /**
         * @param primaryPeerAddressPrefix The primary address prefix.
         * 
         * @return builder
         * 
         */
        public Builder primaryPeerAddressPrefix(@Nullable Output<String> primaryPeerAddressPrefix) {
            $.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
            return this;
        }

        /**
         * @param primaryPeerAddressPrefix The primary address prefix.
         * 
         * @return builder
         * 
         */
        public Builder primaryPeerAddressPrefix(String primaryPeerAddressPrefix) {
            return primaryPeerAddressPrefix(Output.of(primaryPeerAddressPrefix));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param routeFilter The reference to the RouteFilter resource.
         * 
         * @return builder
         * 
         */
        public Builder routeFilter(@Nullable Output<SubResourceArgs> routeFilter) {
            $.routeFilter = routeFilter;
            return this;
        }

        /**
         * @param routeFilter The reference to the RouteFilter resource.
         * 
         * @return builder
         * 
         */
        public Builder routeFilter(SubResourceArgs routeFilter) {
            return routeFilter(Output.of(routeFilter));
        }

        /**
         * @param secondaryAzurePort The secondary port.
         * 
         * @return builder
         * 
         */
        public Builder secondaryAzurePort(@Nullable Output<String> secondaryAzurePort) {
            $.secondaryAzurePort = secondaryAzurePort;
            return this;
        }

        /**
         * @param secondaryAzurePort The secondary port.
         * 
         * @return builder
         * 
         */
        public Builder secondaryAzurePort(String secondaryAzurePort) {
            return secondaryAzurePort(Output.of(secondaryAzurePort));
        }

        /**
         * @param secondaryPeerAddressPrefix The secondary address prefix.
         * 
         * @return builder
         * 
         */
        public Builder secondaryPeerAddressPrefix(@Nullable Output<String> secondaryPeerAddressPrefix) {
            $.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
            return this;
        }

        /**
         * @param secondaryPeerAddressPrefix The secondary address prefix.
         * 
         * @return builder
         * 
         */
        public Builder secondaryPeerAddressPrefix(String secondaryPeerAddressPrefix) {
            return secondaryPeerAddressPrefix(Output.of(secondaryPeerAddressPrefix));
        }

        /**
         * @param sharedKey The shared key.
         * 
         * @return builder
         * 
         */
        public Builder sharedKey(@Nullable Output<String> sharedKey) {
            $.sharedKey = sharedKey;
            return this;
        }

        /**
         * @param sharedKey The shared key.
         * 
         * @return builder
         * 
         */
        public Builder sharedKey(String sharedKey) {
            return sharedKey(Output.of(sharedKey));
        }

        /**
         * @param state The peering state.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<Either<String,ExpressRoutePeeringState>> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The peering state.
         * 
         * @return builder
         * 
         */
        public Builder state(Either<String,ExpressRoutePeeringState> state) {
            return state(Output.of(state));
        }

        /**
         * @param state The peering state.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Either.ofLeft(state));
        }

        /**
         * @param state The peering state.
         * 
         * @return builder
         * 
         */
        public Builder state(ExpressRoutePeeringState state) {
            return state(Either.ofRight(state));
        }

        /**
         * @param stats The peering stats of express route circuit.
         * 
         * @return builder
         * 
         */
        public Builder stats(@Nullable Output<ExpressRouteCircuitStatsArgs> stats) {
            $.stats = stats;
            return this;
        }

        /**
         * @param stats The peering stats of express route circuit.
         * 
         * @return builder
         * 
         */
        public Builder stats(ExpressRouteCircuitStatsArgs stats) {
            return stats(Output.of(stats));
        }

        /**
         * @param vlanId The VLAN ID.
         * 
         * @return builder
         * 
         */
        public Builder vlanId(@Nullable Output<Integer> vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        /**
         * @param vlanId The VLAN ID.
         * 
         * @return builder
         * 
         */
        public Builder vlanId(Integer vlanId) {
            return vlanId(Output.of(vlanId));
        }

        public ExpressRouteCircuitPeeringArgs build() {
            $.circuitName = Objects.requireNonNull($.circuitName, "expected parameter 'circuitName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
