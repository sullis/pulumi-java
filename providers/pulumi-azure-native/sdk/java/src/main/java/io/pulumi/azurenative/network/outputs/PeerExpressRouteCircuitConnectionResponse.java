// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PeerExpressRouteCircuitConnectionResponse {
    /**
     * /29 IP address space to carve out Customer addresses for tunnels.
     * 
     */
    private final @Nullable String addressPrefix;
    /**
     * The resource guid of the authorization used for the express route circuit connection.
     * 
     */
    private final @Nullable String authResourceGuid;
    /**
     * Express Route Circuit connection state.
     * 
     */
    private final String circuitConnectionStatus;
    /**
     * The name of the express route circuit connection resource.
     * 
     */
    private final @Nullable String connectionName;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Reference to Express Route Circuit Private Peering Resource of the circuit.
     * 
     */
    private final @Nullable SubResourceResponse expressRouteCircuitPeering;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * Reference to Express Route Circuit Private Peering Resource of the peered circuit.
     * 
     */
    private final @Nullable SubResourceResponse peerExpressRouteCircuitPeering;
    /**
     * The provisioning state of the peer express route circuit connection resource.
     * 
     */
    private final String provisioningState;
    /**
     * Type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"addressPrefix","authResourceGuid","circuitConnectionStatus","connectionName","etag","expressRouteCircuitPeering","id","name","peerExpressRouteCircuitPeering","provisioningState","type"})
    private PeerExpressRouteCircuitConnectionResponse(
        @Nullable String addressPrefix,
        @Nullable String authResourceGuid,
        String circuitConnectionStatus,
        @Nullable String connectionName,
        String etag,
        @Nullable SubResourceResponse expressRouteCircuitPeering,
        @Nullable String id,
        @Nullable String name,
        @Nullable SubResourceResponse peerExpressRouteCircuitPeering,
        String provisioningState,
        String type) {
        this.addressPrefix = addressPrefix;
        this.authResourceGuid = authResourceGuid;
        this.circuitConnectionStatus = Objects.requireNonNull(circuitConnectionStatus);
        this.connectionName = connectionName;
        this.etag = Objects.requireNonNull(etag);
        this.expressRouteCircuitPeering = expressRouteCircuitPeering;
        this.id = id;
        this.name = name;
        this.peerExpressRouteCircuitPeering = peerExpressRouteCircuitPeering;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * /29 IP address space to carve out Customer addresses for tunnels.
     * 
     */
    public Optional<String> getAddressPrefix() {
        return Optional.ofNullable(this.addressPrefix);
    }
    /**
     * The resource guid of the authorization used for the express route circuit connection.
     * 
     */
    public Optional<String> getAuthResourceGuid() {
        return Optional.ofNullable(this.authResourceGuid);
    }
    /**
     * Express Route Circuit connection state.
     * 
     */
    public String getCircuitConnectionStatus() {
        return this.circuitConnectionStatus;
    }
    /**
     * The name of the express route circuit connection resource.
     * 
     */
    public Optional<String> getConnectionName() {
        return Optional.ofNullable(this.connectionName);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Reference to Express Route Circuit Private Peering Resource of the circuit.
     * 
     */
    public Optional<SubResourceResponse> getExpressRouteCircuitPeering() {
        return Optional.ofNullable(this.expressRouteCircuitPeering);
    }
    /**
     * Resource ID.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Reference to Express Route Circuit Private Peering Resource of the peered circuit.
     * 
     */
    public Optional<SubResourceResponse> getPeerExpressRouteCircuitPeering() {
        return Optional.ofNullable(this.peerExpressRouteCircuitPeering);
    }
    /**
     * The provisioning state of the peer express route circuit connection resource.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Type of the resource.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeerExpressRouteCircuitConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addressPrefix;
        private @Nullable String authResourceGuid;
        private String circuitConnectionStatus;
        private @Nullable String connectionName;
        private String etag;
        private @Nullable SubResourceResponse expressRouteCircuitPeering;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable SubResourceResponse peerExpressRouteCircuitPeering;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PeerExpressRouteCircuitConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
    	      this.authResourceGuid = defaults.authResourceGuid;
    	      this.circuitConnectionStatus = defaults.circuitConnectionStatus;
    	      this.connectionName = defaults.connectionName;
    	      this.etag = defaults.etag;
    	      this.expressRouteCircuitPeering = defaults.expressRouteCircuitPeering;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.peerExpressRouteCircuitPeering = defaults.peerExpressRouteCircuitPeering;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder setAddressPrefix(@Nullable String addressPrefix) {
            this.addressPrefix = addressPrefix;
            return this;
        }

        public Builder setAuthResourceGuid(@Nullable String authResourceGuid) {
            this.authResourceGuid = authResourceGuid;
            return this;
        }

        public Builder setCircuitConnectionStatus(String circuitConnectionStatus) {
            this.circuitConnectionStatus = Objects.requireNonNull(circuitConnectionStatus);
            return this;
        }

        public Builder setConnectionName(@Nullable String connectionName) {
            this.connectionName = connectionName;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setExpressRouteCircuitPeering(@Nullable SubResourceResponse expressRouteCircuitPeering) {
            this.expressRouteCircuitPeering = expressRouteCircuitPeering;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPeerExpressRouteCircuitPeering(@Nullable SubResourceResponse peerExpressRouteCircuitPeering) {
            this.peerExpressRouteCircuitPeering = peerExpressRouteCircuitPeering;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public PeerExpressRouteCircuitConnectionResponse build() {
            return new PeerExpressRouteCircuitConnectionResponse(addressPrefix, authResourceGuid, circuitConnectionStatus, connectionName, etag, expressRouteCircuitPeering, id, name, peerExpressRouteCircuitPeering, provisioningState, type);
        }
    }
}
