// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.SubResourceResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Peer Express Route Circuit Connection in an ExpressRouteCircuitPeering resource.
 * 
 */
public final class PeerExpressRouteCircuitConnectionResponse extends com.pulumi.resources.InvokeArgs {

    public static final PeerExpressRouteCircuitConnectionResponse Empty = new PeerExpressRouteCircuitConnectionResponse();

    /**
     * /29 IP address space to carve out Customer addresses for tunnels.
     * 
     */
    @Import(name="addressPrefix")
    private @Nullable String addressPrefix;

    /**
     * @return /29 IP address space to carve out Customer addresses for tunnels.
     * 
     */
    public Optional<String> addressPrefix() {
        return Optional.ofNullable(this.addressPrefix);
    }

    /**
     * The resource guid of the authorization used for the express route circuit connection.
     * 
     */
    @Import(name="authResourceGuid")
    private @Nullable String authResourceGuid;

    /**
     * @return The resource guid of the authorization used for the express route circuit connection.
     * 
     */
    public Optional<String> authResourceGuid() {
        return Optional.ofNullable(this.authResourceGuid);
    }

    /**
     * Express Route Circuit connection state.
     * 
     */
    @Import(name="circuitConnectionStatus", required=true)
    private String circuitConnectionStatus;

    /**
     * @return Express Route Circuit connection state.
     * 
     */
    public String circuitConnectionStatus() {
        return this.circuitConnectionStatus;
    }

    /**
     * The name of the express route circuit connection resource.
     * 
     */
    @Import(name="connectionName")
    private @Nullable String connectionName;

    /**
     * @return The name of the express route circuit connection resource.
     * 
     */
    public Optional<String> connectionName() {
        return Optional.ofNullable(this.connectionName);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
    private String etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Reference to Express Route Circuit Private Peering Resource of the circuit.
     * 
     */
    @Import(name="expressRouteCircuitPeering")
    private @Nullable SubResourceResponse expressRouteCircuitPeering;

    /**
     * @return Reference to Express Route Circuit Private Peering Resource of the circuit.
     * 
     */
    public Optional<SubResourceResponse> expressRouteCircuitPeering() {
        return Optional.ofNullable(this.expressRouteCircuitPeering);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Reference to Express Route Circuit Private Peering Resource of the peered circuit.
     * 
     */
    @Import(name="peerExpressRouteCircuitPeering")
    private @Nullable SubResourceResponse peerExpressRouteCircuitPeering;

    /**
     * @return Reference to Express Route Circuit Private Peering Resource of the peered circuit.
     * 
     */
    public Optional<SubResourceResponse> peerExpressRouteCircuitPeering() {
        return Optional.ofNullable(this.peerExpressRouteCircuitPeering);
    }

    /**
     * The provisioning state of the peer express route circuit connection resource.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    /**
     * @return The provisioning state of the peer express route circuit connection resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Type of the resource.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Type of the resource.
     * 
     */
    public String type() {
        return this.type;
    }

    private PeerExpressRouteCircuitConnectionResponse() {}

    private PeerExpressRouteCircuitConnectionResponse(PeerExpressRouteCircuitConnectionResponse $) {
        this.addressPrefix = $.addressPrefix;
        this.authResourceGuid = $.authResourceGuid;
        this.circuitConnectionStatus = $.circuitConnectionStatus;
        this.connectionName = $.connectionName;
        this.etag = $.etag;
        this.expressRouteCircuitPeering = $.expressRouteCircuitPeering;
        this.id = $.id;
        this.name = $.name;
        this.peerExpressRouteCircuitPeering = $.peerExpressRouteCircuitPeering;
        this.provisioningState = $.provisioningState;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PeerExpressRouteCircuitConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PeerExpressRouteCircuitConnectionResponse $;

        public Builder() {
            $ = new PeerExpressRouteCircuitConnectionResponse();
        }

        public Builder(PeerExpressRouteCircuitConnectionResponse defaults) {
            $ = new PeerExpressRouteCircuitConnectionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressPrefix /29 IP address space to carve out Customer addresses for tunnels.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefix(@Nullable String addressPrefix) {
            $.addressPrefix = addressPrefix;
            return this;
        }

        /**
         * @param authResourceGuid The resource guid of the authorization used for the express route circuit connection.
         * 
         * @return builder
         * 
         */
        public Builder authResourceGuid(@Nullable String authResourceGuid) {
            $.authResourceGuid = authResourceGuid;
            return this;
        }

        /**
         * @param circuitConnectionStatus Express Route Circuit connection state.
         * 
         * @return builder
         * 
         */
        public Builder circuitConnectionStatus(String circuitConnectionStatus) {
            $.circuitConnectionStatus = circuitConnectionStatus;
            return this;
        }

        /**
         * @param connectionName The name of the express route circuit connection resource.
         * 
         * @return builder
         * 
         */
        public Builder connectionName(@Nullable String connectionName) {
            $.connectionName = connectionName;
            return this;
        }

        /**
         * @param etag A unique read-only string that changes whenever the resource is updated.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param expressRouteCircuitPeering Reference to Express Route Circuit Private Peering Resource of the circuit.
         * 
         * @return builder
         * 
         */
        public Builder expressRouteCircuitPeering(@Nullable SubResourceResponse expressRouteCircuitPeering) {
            $.expressRouteCircuitPeering = expressRouteCircuitPeering;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param peerExpressRouteCircuitPeering Reference to Express Route Circuit Private Peering Resource of the peered circuit.
         * 
         * @return builder
         * 
         */
        public Builder peerExpressRouteCircuitPeering(@Nullable SubResourceResponse peerExpressRouteCircuitPeering) {
            $.peerExpressRouteCircuitPeering = peerExpressRouteCircuitPeering;
            return this;
        }

        /**
         * @param provisioningState The provisioning state of the peer express route circuit connection resource.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param type Type of the resource.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public PeerExpressRouteCircuitConnectionResponse build() {
            $.circuitConnectionStatus = Objects.requireNonNull($.circuitConnectionStatus, "expected parameter 'circuitConnectionStatus' to be non-null");
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
