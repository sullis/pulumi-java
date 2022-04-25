// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.IpsecPolicyResponse;
import com.pulumi.azurenative.network.outputs.LocalNetworkGatewayResponse;
import com.pulumi.azurenative.network.outputs.SubResourceResponse;
import com.pulumi.azurenative.network.outputs.TrafficSelectorPolicyResponse;
import com.pulumi.azurenative.network.outputs.TunnelConnectionHealthResponse;
import com.pulumi.azurenative.network.outputs.VirtualNetworkGatewayResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVirtualNetworkGatewayConnectionResult {
    /**
     * @return The authorizationKey.
     * 
     */
    private final @Nullable String authorizationKey;
    /**
     * @return The connection mode for this connection.
     * 
     */
    private final @Nullable String connectionMode;
    /**
     * @return Connection protocol used for this connection.
     * 
     */
    private final @Nullable String connectionProtocol;
    /**
     * @return Virtual Network Gateway connection status.
     * 
     */
    private final String connectionStatus;
    /**
     * @return Gateway connection type.
     * 
     */
    private final String connectionType;
    /**
     * @return The dead peer detection timeout of this connection in seconds.
     * 
     */
    private final @Nullable Integer dpdTimeoutSeconds;
    /**
     * @return The egress bytes transferred in this connection.
     * 
     */
    private final Double egressBytesTransferred;
    /**
     * @return EnableBgp flag.
     * 
     */
    private final @Nullable Boolean enableBgp;
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * @return Bypass ExpressRoute Gateway for data forwarding.
     * 
     */
    private final @Nullable Boolean expressRouteGatewayBypass;
    /**
     * @return Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * @return The ingress bytes transferred in this connection.
     * 
     */
    private final Double ingressBytesTransferred;
    /**
     * @return The IPSec Policies to be considered by this connection.
     * 
     */
    private final @Nullable List<IpsecPolicyResponse> ipsecPolicies;
    /**
     * @return The reference to local network gateway resource.
     * 
     */
    private final @Nullable LocalNetworkGatewayResponse localNetworkGateway2;
    /**
     * @return Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return The reference to peerings resource.
     * 
     */
    private final @Nullable SubResourceResponse peer;
    /**
     * @return The provisioning state of the virtual network gateway connection resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return The resource GUID property of the virtual network gateway connection resource.
     * 
     */
    private final String resourceGuid;
    /**
     * @return The routing weight.
     * 
     */
    private final @Nullable Integer routingWeight;
    /**
     * @return The IPSec shared key.
     * 
     */
    private final @Nullable String sharedKey;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The Traffic Selector Policies to be considered by this connection.
     * 
     */
    private final @Nullable List<TrafficSelectorPolicyResponse> trafficSelectorPolicies;
    /**
     * @return Collection of all tunnels&#39; connection health status.
     * 
     */
    private final List<TunnelConnectionHealthResponse> tunnelConnectionStatus;
    /**
     * @return Resource type.
     * 
     */
    private final String type;
    /**
     * @return Use private local Azure IP for the connection.
     * 
     */
    private final @Nullable Boolean useLocalAzureIpAddress;
    /**
     * @return Enable policy-based traffic selectors.
     * 
     */
    private final @Nullable Boolean usePolicyBasedTrafficSelectors;
    /**
     * @return The reference to virtual network gateway resource.
     * 
     */
    private final VirtualNetworkGatewayResponse virtualNetworkGateway1;
    /**
     * @return The reference to virtual network gateway resource.
     * 
     */
    private final @Nullable VirtualNetworkGatewayResponse virtualNetworkGateway2;

    @CustomType.Constructor
    private GetVirtualNetworkGatewayConnectionResult(
        @CustomType.Parameter("authorizationKey") @Nullable String authorizationKey,
        @CustomType.Parameter("connectionMode") @Nullable String connectionMode,
        @CustomType.Parameter("connectionProtocol") @Nullable String connectionProtocol,
        @CustomType.Parameter("connectionStatus") String connectionStatus,
        @CustomType.Parameter("connectionType") String connectionType,
        @CustomType.Parameter("dpdTimeoutSeconds") @Nullable Integer dpdTimeoutSeconds,
        @CustomType.Parameter("egressBytesTransferred") Double egressBytesTransferred,
        @CustomType.Parameter("enableBgp") @Nullable Boolean enableBgp,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("expressRouteGatewayBypass") @Nullable Boolean expressRouteGatewayBypass,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("ingressBytesTransferred") Double ingressBytesTransferred,
        @CustomType.Parameter("ipsecPolicies") @Nullable List<IpsecPolicyResponse> ipsecPolicies,
        @CustomType.Parameter("localNetworkGateway2") @Nullable LocalNetworkGatewayResponse localNetworkGateway2,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("peer") @Nullable SubResourceResponse peer,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("resourceGuid") String resourceGuid,
        @CustomType.Parameter("routingWeight") @Nullable Integer routingWeight,
        @CustomType.Parameter("sharedKey") @Nullable String sharedKey,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("trafficSelectorPolicies") @Nullable List<TrafficSelectorPolicyResponse> trafficSelectorPolicies,
        @CustomType.Parameter("tunnelConnectionStatus") List<TunnelConnectionHealthResponse> tunnelConnectionStatus,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("useLocalAzureIpAddress") @Nullable Boolean useLocalAzureIpAddress,
        @CustomType.Parameter("usePolicyBasedTrafficSelectors") @Nullable Boolean usePolicyBasedTrafficSelectors,
        @CustomType.Parameter("virtualNetworkGateway1") VirtualNetworkGatewayResponse virtualNetworkGateway1,
        @CustomType.Parameter("virtualNetworkGateway2") @Nullable VirtualNetworkGatewayResponse virtualNetworkGateway2) {
        this.authorizationKey = authorizationKey;
        this.connectionMode = connectionMode;
        this.connectionProtocol = connectionProtocol;
        this.connectionStatus = connectionStatus;
        this.connectionType = connectionType;
        this.dpdTimeoutSeconds = dpdTimeoutSeconds;
        this.egressBytesTransferred = egressBytesTransferred;
        this.enableBgp = enableBgp;
        this.etag = etag;
        this.expressRouteGatewayBypass = expressRouteGatewayBypass;
        this.id = id;
        this.ingressBytesTransferred = ingressBytesTransferred;
        this.ipsecPolicies = ipsecPolicies;
        this.localNetworkGateway2 = localNetworkGateway2;
        this.location = location;
        this.name = name;
        this.peer = peer;
        this.provisioningState = provisioningState;
        this.resourceGuid = resourceGuid;
        this.routingWeight = routingWeight;
        this.sharedKey = sharedKey;
        this.tags = tags;
        this.trafficSelectorPolicies = trafficSelectorPolicies;
        this.tunnelConnectionStatus = tunnelConnectionStatus;
        this.type = type;
        this.useLocalAzureIpAddress = useLocalAzureIpAddress;
        this.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
        this.virtualNetworkGateway1 = virtualNetworkGateway1;
        this.virtualNetworkGateway2 = virtualNetworkGateway2;
    }

    /**
     * @return The authorizationKey.
     * 
     */
    public Optional<String> authorizationKey() {
        return Optional.ofNullable(this.authorizationKey);
    }
    /**
     * @return The connection mode for this connection.
     * 
     */
    public Optional<String> connectionMode() {
        return Optional.ofNullable(this.connectionMode);
    }
    /**
     * @return Connection protocol used for this connection.
     * 
     */
    public Optional<String> connectionProtocol() {
        return Optional.ofNullable(this.connectionProtocol);
    }
    /**
     * @return Virtual Network Gateway connection status.
     * 
     */
    public String connectionStatus() {
        return this.connectionStatus;
    }
    /**
     * @return Gateway connection type.
     * 
     */
    public String connectionType() {
        return this.connectionType;
    }
    /**
     * @return The dead peer detection timeout of this connection in seconds.
     * 
     */
    public Optional<Integer> dpdTimeoutSeconds() {
        return Optional.ofNullable(this.dpdTimeoutSeconds);
    }
    /**
     * @return The egress bytes transferred in this connection.
     * 
     */
    public Double egressBytesTransferred() {
        return this.egressBytesTransferred;
    }
    /**
     * @return EnableBgp flag.
     * 
     */
    public Optional<Boolean> enableBgp() {
        return Optional.ofNullable(this.enableBgp);
    }
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Bypass ExpressRoute Gateway for data forwarding.
     * 
     */
    public Optional<Boolean> expressRouteGatewayBypass() {
        return Optional.ofNullable(this.expressRouteGatewayBypass);
    }
    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The ingress bytes transferred in this connection.
     * 
     */
    public Double ingressBytesTransferred() {
        return this.ingressBytesTransferred;
    }
    /**
     * @return The IPSec Policies to be considered by this connection.
     * 
     */
    public List<IpsecPolicyResponse> ipsecPolicies() {
        return this.ipsecPolicies == null ? List.of() : this.ipsecPolicies;
    }
    /**
     * @return The reference to local network gateway resource.
     * 
     */
    public Optional<LocalNetworkGatewayResponse> localNetworkGateway2() {
        return Optional.ofNullable(this.localNetworkGateway2);
    }
    /**
     * @return Resource location.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The reference to peerings resource.
     * 
     */
    public Optional<SubResourceResponse> peer() {
        return Optional.ofNullable(this.peer);
    }
    /**
     * @return The provisioning state of the virtual network gateway connection resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The resource GUID property of the virtual network gateway connection resource.
     * 
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }
    /**
     * @return The routing weight.
     * 
     */
    public Optional<Integer> routingWeight() {
        return Optional.ofNullable(this.routingWeight);
    }
    /**
     * @return The IPSec shared key.
     * 
     */
    public Optional<String> sharedKey() {
        return Optional.ofNullable(this.sharedKey);
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The Traffic Selector Policies to be considered by this connection.
     * 
     */
    public List<TrafficSelectorPolicyResponse> trafficSelectorPolicies() {
        return this.trafficSelectorPolicies == null ? List.of() : this.trafficSelectorPolicies;
    }
    /**
     * @return Collection of all tunnels&#39; connection health status.
     * 
     */
    public List<TunnelConnectionHealthResponse> tunnelConnectionStatus() {
        return this.tunnelConnectionStatus;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Use private local Azure IP for the connection.
     * 
     */
    public Optional<Boolean> useLocalAzureIpAddress() {
        return Optional.ofNullable(this.useLocalAzureIpAddress);
    }
    /**
     * @return Enable policy-based traffic selectors.
     * 
     */
    public Optional<Boolean> usePolicyBasedTrafficSelectors() {
        return Optional.ofNullable(this.usePolicyBasedTrafficSelectors);
    }
    /**
     * @return The reference to virtual network gateway resource.
     * 
     */
    public VirtualNetworkGatewayResponse virtualNetworkGateway1() {
        return this.virtualNetworkGateway1;
    }
    /**
     * @return The reference to virtual network gateway resource.
     * 
     */
    public Optional<VirtualNetworkGatewayResponse> virtualNetworkGateway2() {
        return Optional.ofNullable(this.virtualNetworkGateway2);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNetworkGatewayConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authorizationKey;
        private @Nullable String connectionMode;
        private @Nullable String connectionProtocol;
        private String connectionStatus;
        private String connectionType;
        private @Nullable Integer dpdTimeoutSeconds;
        private Double egressBytesTransferred;
        private @Nullable Boolean enableBgp;
        private String etag;
        private @Nullable Boolean expressRouteGatewayBypass;
        private @Nullable String id;
        private Double ingressBytesTransferred;
        private @Nullable List<IpsecPolicyResponse> ipsecPolicies;
        private @Nullable LocalNetworkGatewayResponse localNetworkGateway2;
        private @Nullable String location;
        private String name;
        private @Nullable SubResourceResponse peer;
        private String provisioningState;
        private String resourceGuid;
        private @Nullable Integer routingWeight;
        private @Nullable String sharedKey;
        private @Nullable Map<String,String> tags;
        private @Nullable List<TrafficSelectorPolicyResponse> trafficSelectorPolicies;
        private List<TunnelConnectionHealthResponse> tunnelConnectionStatus;
        private String type;
        private @Nullable Boolean useLocalAzureIpAddress;
        private @Nullable Boolean usePolicyBasedTrafficSelectors;
        private VirtualNetworkGatewayResponse virtualNetworkGateway1;
        private @Nullable VirtualNetworkGatewayResponse virtualNetworkGateway2;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualNetworkGatewayConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationKey = defaults.authorizationKey;
    	      this.connectionMode = defaults.connectionMode;
    	      this.connectionProtocol = defaults.connectionProtocol;
    	      this.connectionStatus = defaults.connectionStatus;
    	      this.connectionType = defaults.connectionType;
    	      this.dpdTimeoutSeconds = defaults.dpdTimeoutSeconds;
    	      this.egressBytesTransferred = defaults.egressBytesTransferred;
    	      this.enableBgp = defaults.enableBgp;
    	      this.etag = defaults.etag;
    	      this.expressRouteGatewayBypass = defaults.expressRouteGatewayBypass;
    	      this.id = defaults.id;
    	      this.ingressBytesTransferred = defaults.ingressBytesTransferred;
    	      this.ipsecPolicies = defaults.ipsecPolicies;
    	      this.localNetworkGateway2 = defaults.localNetworkGateway2;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.peer = defaults.peer;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.routingWeight = defaults.routingWeight;
    	      this.sharedKey = defaults.sharedKey;
    	      this.tags = defaults.tags;
    	      this.trafficSelectorPolicies = defaults.trafficSelectorPolicies;
    	      this.tunnelConnectionStatus = defaults.tunnelConnectionStatus;
    	      this.type = defaults.type;
    	      this.useLocalAzureIpAddress = defaults.useLocalAzureIpAddress;
    	      this.usePolicyBasedTrafficSelectors = defaults.usePolicyBasedTrafficSelectors;
    	      this.virtualNetworkGateway1 = defaults.virtualNetworkGateway1;
    	      this.virtualNetworkGateway2 = defaults.virtualNetworkGateway2;
        }

        public Builder authorizationKey(@Nullable String authorizationKey) {
            this.authorizationKey = authorizationKey;
            return this;
        }
        public Builder connectionMode(@Nullable String connectionMode) {
            this.connectionMode = connectionMode;
            return this;
        }
        public Builder connectionProtocol(@Nullable String connectionProtocol) {
            this.connectionProtocol = connectionProtocol;
            return this;
        }
        public Builder connectionStatus(String connectionStatus) {
            this.connectionStatus = Objects.requireNonNull(connectionStatus);
            return this;
        }
        public Builder connectionType(String connectionType) {
            this.connectionType = Objects.requireNonNull(connectionType);
            return this;
        }
        public Builder dpdTimeoutSeconds(@Nullable Integer dpdTimeoutSeconds) {
            this.dpdTimeoutSeconds = dpdTimeoutSeconds;
            return this;
        }
        public Builder egressBytesTransferred(Double egressBytesTransferred) {
            this.egressBytesTransferred = Objects.requireNonNull(egressBytesTransferred);
            return this;
        }
        public Builder enableBgp(@Nullable Boolean enableBgp) {
            this.enableBgp = enableBgp;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder expressRouteGatewayBypass(@Nullable Boolean expressRouteGatewayBypass) {
            this.expressRouteGatewayBypass = expressRouteGatewayBypass;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder ingressBytesTransferred(Double ingressBytesTransferred) {
            this.ingressBytesTransferred = Objects.requireNonNull(ingressBytesTransferred);
            return this;
        }
        public Builder ipsecPolicies(@Nullable List<IpsecPolicyResponse> ipsecPolicies) {
            this.ipsecPolicies = ipsecPolicies;
            return this;
        }
        public Builder ipsecPolicies(IpsecPolicyResponse... ipsecPolicies) {
            return ipsecPolicies(List.of(ipsecPolicies));
        }
        public Builder localNetworkGateway2(@Nullable LocalNetworkGatewayResponse localNetworkGateway2) {
            this.localNetworkGateway2 = localNetworkGateway2;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder peer(@Nullable SubResourceResponse peer) {
            this.peer = peer;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder resourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }
        public Builder routingWeight(@Nullable Integer routingWeight) {
            this.routingWeight = routingWeight;
            return this;
        }
        public Builder sharedKey(@Nullable String sharedKey) {
            this.sharedKey = sharedKey;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder trafficSelectorPolicies(@Nullable List<TrafficSelectorPolicyResponse> trafficSelectorPolicies) {
            this.trafficSelectorPolicies = trafficSelectorPolicies;
            return this;
        }
        public Builder trafficSelectorPolicies(TrafficSelectorPolicyResponse... trafficSelectorPolicies) {
            return trafficSelectorPolicies(List.of(trafficSelectorPolicies));
        }
        public Builder tunnelConnectionStatus(List<TunnelConnectionHealthResponse> tunnelConnectionStatus) {
            this.tunnelConnectionStatus = Objects.requireNonNull(tunnelConnectionStatus);
            return this;
        }
        public Builder tunnelConnectionStatus(TunnelConnectionHealthResponse... tunnelConnectionStatus) {
            return tunnelConnectionStatus(List.of(tunnelConnectionStatus));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder useLocalAzureIpAddress(@Nullable Boolean useLocalAzureIpAddress) {
            this.useLocalAzureIpAddress = useLocalAzureIpAddress;
            return this;
        }
        public Builder usePolicyBasedTrafficSelectors(@Nullable Boolean usePolicyBasedTrafficSelectors) {
            this.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
            return this;
        }
        public Builder virtualNetworkGateway1(VirtualNetworkGatewayResponse virtualNetworkGateway1) {
            this.virtualNetworkGateway1 = Objects.requireNonNull(virtualNetworkGateway1);
            return this;
        }
        public Builder virtualNetworkGateway2(@Nullable VirtualNetworkGatewayResponse virtualNetworkGateway2) {
            this.virtualNetworkGateway2 = virtualNetworkGateway2;
            return this;
        }        public GetVirtualNetworkGatewayConnectionResult build() {
            return new GetVirtualNetworkGatewayConnectionResult(authorizationKey, connectionMode, connectionProtocol, connectionStatus, connectionType, dpdTimeoutSeconds, egressBytesTransferred, enableBgp, etag, expressRouteGatewayBypass, id, ingressBytesTransferred, ipsecPolicies, localNetworkGateway2, location, name, peer, provisioningState, resourceGuid, routingWeight, sharedKey, tags, trafficSelectorPolicies, tunnelConnectionStatus, type, useLocalAzureIpAddress, usePolicyBasedTrafficSelectors, virtualNetworkGateway1, virtualNetworkGateway2);
        }
    }
}
