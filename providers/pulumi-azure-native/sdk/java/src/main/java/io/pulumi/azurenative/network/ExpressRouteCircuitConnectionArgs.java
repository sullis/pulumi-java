// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.Ipv6CircuitConnectionConfigArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExpressRouteCircuitConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExpressRouteCircuitConnectionArgs Empty = new ExpressRouteCircuitConnectionArgs();

    /**
     * /29 IP address space to carve out Customer addresses for tunnels.
     * 
     */
    @InputImport(name="addressPrefix")
    private final @Nullable Input<String> addressPrefix;

    public Input<String> getAddressPrefix() {
        return this.addressPrefix == null ? Input.empty() : this.addressPrefix;
    }

    /**
     * The authorization key.
     * 
     */
    @InputImport(name="authorizationKey")
    private final @Nullable Input<String> authorizationKey;

    public Input<String> getAuthorizationKey() {
        return this.authorizationKey == null ? Input.empty() : this.authorizationKey;
    }

    /**
     * The name of the express route circuit.
     * 
     */
    @InputImport(name="circuitName", required=true)
    private final Input<String> circuitName;

    public Input<String> getCircuitName() {
        return this.circuitName;
    }

    /**
     * The name of the express route circuit connection.
     * 
     */
    @InputImport(name="connectionName")
    private final @Nullable Input<String> connectionName;

    public Input<String> getConnectionName() {
        return this.connectionName == null ? Input.empty() : this.connectionName;
    }

    /**
     * Reference to Express Route Circuit Private Peering Resource of the circuit initiating connection.
     * 
     */
    @InputImport(name="expressRouteCircuitPeering")
    private final @Nullable Input<SubResourceArgs> expressRouteCircuitPeering;

    public Input<SubResourceArgs> getExpressRouteCircuitPeering() {
        return this.expressRouteCircuitPeering == null ? Input.empty() : this.expressRouteCircuitPeering;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * IPv6 Address PrefixProperties of the express route circuit connection.
     * 
     */
    @InputImport(name="ipv6CircuitConnectionConfig")
    private final @Nullable Input<Ipv6CircuitConnectionConfigArgs> ipv6CircuitConnectionConfig;

    public Input<Ipv6CircuitConnectionConfigArgs> getIpv6CircuitConnectionConfig() {
        return this.ipv6CircuitConnectionConfig == null ? Input.empty() : this.ipv6CircuitConnectionConfig;
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Reference to Express Route Circuit Private Peering Resource of the peered circuit.
     * 
     */
    @InputImport(name="peerExpressRouteCircuitPeering")
    private final @Nullable Input<SubResourceArgs> peerExpressRouteCircuitPeering;

    public Input<SubResourceArgs> getPeerExpressRouteCircuitPeering() {
        return this.peerExpressRouteCircuitPeering == null ? Input.empty() : this.peerExpressRouteCircuitPeering;
    }

    /**
     * The name of the peering.
     * 
     */
    @InputImport(name="peeringName", required=true)
    private final Input<String> peeringName;

    public Input<String> getPeeringName() {
        return this.peeringName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ExpressRouteCircuitConnectionArgs(
        @Nullable Input<String> addressPrefix,
        @Nullable Input<String> authorizationKey,
        Input<String> circuitName,
        @Nullable Input<String> connectionName,
        @Nullable Input<SubResourceArgs> expressRouteCircuitPeering,
        @Nullable Input<String> id,
        @Nullable Input<Ipv6CircuitConnectionConfigArgs> ipv6CircuitConnectionConfig,
        @Nullable Input<String> name,
        @Nullable Input<SubResourceArgs> peerExpressRouteCircuitPeering,
        Input<String> peeringName,
        Input<String> resourceGroupName) {
        this.addressPrefix = addressPrefix;
        this.authorizationKey = authorizationKey;
        this.circuitName = Objects.requireNonNull(circuitName, "expected parameter 'circuitName' to be non-null");
        this.connectionName = connectionName;
        this.expressRouteCircuitPeering = expressRouteCircuitPeering;
        this.id = id;
        this.ipv6CircuitConnectionConfig = ipv6CircuitConnectionConfig;
        this.name = name;
        this.peerExpressRouteCircuitPeering = peerExpressRouteCircuitPeering;
        this.peeringName = Objects.requireNonNull(peeringName, "expected parameter 'peeringName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ExpressRouteCircuitConnectionArgs() {
        this.addressPrefix = Input.empty();
        this.authorizationKey = Input.empty();
        this.circuitName = Input.empty();
        this.connectionName = Input.empty();
        this.expressRouteCircuitPeering = Input.empty();
        this.id = Input.empty();
        this.ipv6CircuitConnectionConfig = Input.empty();
        this.name = Input.empty();
        this.peerExpressRouteCircuitPeering = Input.empty();
        this.peeringName = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteCircuitConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> addressPrefix;
        private @Nullable Input<String> authorizationKey;
        private Input<String> circuitName;
        private @Nullable Input<String> connectionName;
        private @Nullable Input<SubResourceArgs> expressRouteCircuitPeering;
        private @Nullable Input<String> id;
        private @Nullable Input<Ipv6CircuitConnectionConfigArgs> ipv6CircuitConnectionConfig;
        private @Nullable Input<String> name;
        private @Nullable Input<SubResourceArgs> peerExpressRouteCircuitPeering;
        private Input<String> peeringName;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteCircuitConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
    	      this.authorizationKey = defaults.authorizationKey;
    	      this.circuitName = defaults.circuitName;
    	      this.connectionName = defaults.connectionName;
    	      this.expressRouteCircuitPeering = defaults.expressRouteCircuitPeering;
    	      this.id = defaults.id;
    	      this.ipv6CircuitConnectionConfig = defaults.ipv6CircuitConnectionConfig;
    	      this.name = defaults.name;
    	      this.peerExpressRouteCircuitPeering = defaults.peerExpressRouteCircuitPeering;
    	      this.peeringName = defaults.peeringName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAddressPrefix(@Nullable Input<String> addressPrefix) {
            this.addressPrefix = addressPrefix;
            return this;
        }

        public Builder setAddressPrefix(@Nullable String addressPrefix) {
            this.addressPrefix = Input.ofNullable(addressPrefix);
            return this;
        }

        public Builder setAuthorizationKey(@Nullable Input<String> authorizationKey) {
            this.authorizationKey = authorizationKey;
            return this;
        }

        public Builder setAuthorizationKey(@Nullable String authorizationKey) {
            this.authorizationKey = Input.ofNullable(authorizationKey);
            return this;
        }

        public Builder setCircuitName(Input<String> circuitName) {
            this.circuitName = Objects.requireNonNull(circuitName);
            return this;
        }

        public Builder setCircuitName(String circuitName) {
            this.circuitName = Input.of(Objects.requireNonNull(circuitName));
            return this;
        }

        public Builder setConnectionName(@Nullable Input<String> connectionName) {
            this.connectionName = connectionName;
            return this;
        }

        public Builder setConnectionName(@Nullable String connectionName) {
            this.connectionName = Input.ofNullable(connectionName);
            return this;
        }

        public Builder setExpressRouteCircuitPeering(@Nullable Input<SubResourceArgs> expressRouteCircuitPeering) {
            this.expressRouteCircuitPeering = expressRouteCircuitPeering;
            return this;
        }

        public Builder setExpressRouteCircuitPeering(@Nullable SubResourceArgs expressRouteCircuitPeering) {
            this.expressRouteCircuitPeering = Input.ofNullable(expressRouteCircuitPeering);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setIpv6CircuitConnectionConfig(@Nullable Input<Ipv6CircuitConnectionConfigArgs> ipv6CircuitConnectionConfig) {
            this.ipv6CircuitConnectionConfig = ipv6CircuitConnectionConfig;
            return this;
        }

        public Builder setIpv6CircuitConnectionConfig(@Nullable Ipv6CircuitConnectionConfigArgs ipv6CircuitConnectionConfig) {
            this.ipv6CircuitConnectionConfig = Input.ofNullable(ipv6CircuitConnectionConfig);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPeerExpressRouteCircuitPeering(@Nullable Input<SubResourceArgs> peerExpressRouteCircuitPeering) {
            this.peerExpressRouteCircuitPeering = peerExpressRouteCircuitPeering;
            return this;
        }

        public Builder setPeerExpressRouteCircuitPeering(@Nullable SubResourceArgs peerExpressRouteCircuitPeering) {
            this.peerExpressRouteCircuitPeering = Input.ofNullable(peerExpressRouteCircuitPeering);
            return this;
        }

        public Builder setPeeringName(Input<String> peeringName) {
            this.peeringName = Objects.requireNonNull(peeringName);
            return this;
        }

        public Builder setPeeringName(String peeringName) {
            this.peeringName = Input.of(Objects.requireNonNull(peeringName));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public ExpressRouteCircuitConnectionArgs build() {
            return new ExpressRouteCircuitConnectionArgs(addressPrefix, authorizationKey, circuitName, connectionName, expressRouteCircuitPeering, id, ipv6CircuitConnectionConfig, name, peerExpressRouteCircuitPeering, peeringName, resourceGroupName);
        }
    }
}
