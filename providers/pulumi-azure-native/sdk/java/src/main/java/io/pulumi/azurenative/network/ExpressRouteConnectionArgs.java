// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.ExpressRouteCircuitPeeringIdArgs;
import io.pulumi.azurenative.network.inputs.RoutingConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExpressRouteConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExpressRouteConnectionArgs Empty = new ExpressRouteConnectionArgs();

    /**
     * Authorization key to establish the connection.
     * 
     */
    @Import(name="authorizationKey")
      private final @Nullable Output<String> authorizationKey;

    public Output<String> getAuthorizationKey() {
        return this.authorizationKey == null ? Output.empty() : this.authorizationKey;
    }

    /**
     * The name of the connection subresource.
     * 
     */
    @Import(name="connectionName")
      private final @Nullable Output<String> connectionName;

    public Output<String> getConnectionName() {
        return this.connectionName == null ? Output.empty() : this.connectionName;
    }

    /**
     * Enable internet security.
     * 
     */
    @Import(name="enableInternetSecurity")
      private final @Nullable Output<Boolean> enableInternetSecurity;

    public Output<Boolean> getEnableInternetSecurity() {
        return this.enableInternetSecurity == null ? Output.empty() : this.enableInternetSecurity;
    }

    /**
     * The ExpressRoute circuit peering.
     * 
     */
    @Import(name="expressRouteCircuitPeering", required=true)
      private final Output<ExpressRouteCircuitPeeringIdArgs> expressRouteCircuitPeering;

    public Output<ExpressRouteCircuitPeeringIdArgs> getExpressRouteCircuitPeering() {
        return this.expressRouteCircuitPeering;
    }

    /**
     * Enable FastPath to vWan Firewall hub.
     * 
     */
    @Import(name="expressRouteGatewayBypass")
      private final @Nullable Output<Boolean> expressRouteGatewayBypass;

    public Output<Boolean> getExpressRouteGatewayBypass() {
        return this.expressRouteGatewayBypass == null ? Output.empty() : this.expressRouteGatewayBypass;
    }

    /**
     * The name of the ExpressRoute gateway.
     * 
     */
    @Import(name="expressRouteGatewayName", required=true)
      private final Output<String> expressRouteGatewayName;

    public Output<String> getExpressRouteGatewayName() {
        return this.expressRouteGatewayName;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
     */
    @Import(name="routingConfiguration")
      private final @Nullable Output<RoutingConfigurationArgs> routingConfiguration;

    public Output<RoutingConfigurationArgs> getRoutingConfiguration() {
        return this.routingConfiguration == null ? Output.empty() : this.routingConfiguration;
    }

    /**
     * The routing weight associated to the connection.
     * 
     */
    @Import(name="routingWeight")
      private final @Nullable Output<Integer> routingWeight;

    public Output<Integer> getRoutingWeight() {
        return this.routingWeight == null ? Output.empty() : this.routingWeight;
    }

    public ExpressRouteConnectionArgs(
        @Nullable Output<String> authorizationKey,
        @Nullable Output<String> connectionName,
        @Nullable Output<Boolean> enableInternetSecurity,
        Output<ExpressRouteCircuitPeeringIdArgs> expressRouteCircuitPeering,
        @Nullable Output<Boolean> expressRouteGatewayBypass,
        Output<String> expressRouteGatewayName,
        @Nullable Output<String> id,
        Output<String> name,
        Output<String> resourceGroupName,
        @Nullable Output<RoutingConfigurationArgs> routingConfiguration,
        @Nullable Output<Integer> routingWeight) {
        this.authorizationKey = authorizationKey;
        this.connectionName = connectionName;
        this.enableInternetSecurity = enableInternetSecurity;
        this.expressRouteCircuitPeering = Objects.requireNonNull(expressRouteCircuitPeering, "expected parameter 'expressRouteCircuitPeering' to be non-null");
        this.expressRouteGatewayBypass = expressRouteGatewayBypass;
        this.expressRouteGatewayName = Objects.requireNonNull(expressRouteGatewayName, "expected parameter 'expressRouteGatewayName' to be non-null");
        this.id = id;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.routingConfiguration = routingConfiguration;
        this.routingWeight = routingWeight;
    }

    private ExpressRouteConnectionArgs() {
        this.authorizationKey = Output.empty();
        this.connectionName = Output.empty();
        this.enableInternetSecurity = Output.empty();
        this.expressRouteCircuitPeering = Output.empty();
        this.expressRouteGatewayBypass = Output.empty();
        this.expressRouteGatewayName = Output.empty();
        this.id = Output.empty();
        this.name = Output.empty();
        this.resourceGroupName = Output.empty();
        this.routingConfiguration = Output.empty();
        this.routingWeight = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> authorizationKey;
        private @Nullable Output<String> connectionName;
        private @Nullable Output<Boolean> enableInternetSecurity;
        private Output<ExpressRouteCircuitPeeringIdArgs> expressRouteCircuitPeering;
        private @Nullable Output<Boolean> expressRouteGatewayBypass;
        private Output<String> expressRouteGatewayName;
        private @Nullable Output<String> id;
        private Output<String> name;
        private Output<String> resourceGroupName;
        private @Nullable Output<RoutingConfigurationArgs> routingConfiguration;
        private @Nullable Output<Integer> routingWeight;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationKey = defaults.authorizationKey;
    	      this.connectionName = defaults.connectionName;
    	      this.enableInternetSecurity = defaults.enableInternetSecurity;
    	      this.expressRouteCircuitPeering = defaults.expressRouteCircuitPeering;
    	      this.expressRouteGatewayBypass = defaults.expressRouteGatewayBypass;
    	      this.expressRouteGatewayName = defaults.expressRouteGatewayName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.routingConfiguration = defaults.routingConfiguration;
    	      this.routingWeight = defaults.routingWeight;
        }

        public Builder authorizationKey(@Nullable Output<String> authorizationKey) {
            this.authorizationKey = authorizationKey;
            return this;
        }
        public Builder authorizationKey(@Nullable String authorizationKey) {
            this.authorizationKey = Output.ofNullable(authorizationKey);
            return this;
        }
        public Builder connectionName(@Nullable Output<String> connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        public Builder connectionName(@Nullable String connectionName) {
            this.connectionName = Output.ofNullable(connectionName);
            return this;
        }
        public Builder enableInternetSecurity(@Nullable Output<Boolean> enableInternetSecurity) {
            this.enableInternetSecurity = enableInternetSecurity;
            return this;
        }
        public Builder enableInternetSecurity(@Nullable Boolean enableInternetSecurity) {
            this.enableInternetSecurity = Output.ofNullable(enableInternetSecurity);
            return this;
        }
        public Builder expressRouteCircuitPeering(Output<ExpressRouteCircuitPeeringIdArgs> expressRouteCircuitPeering) {
            this.expressRouteCircuitPeering = Objects.requireNonNull(expressRouteCircuitPeering);
            return this;
        }
        public Builder expressRouteCircuitPeering(ExpressRouteCircuitPeeringIdArgs expressRouteCircuitPeering) {
            this.expressRouteCircuitPeering = Output.of(Objects.requireNonNull(expressRouteCircuitPeering));
            return this;
        }
        public Builder expressRouteGatewayBypass(@Nullable Output<Boolean> expressRouteGatewayBypass) {
            this.expressRouteGatewayBypass = expressRouteGatewayBypass;
            return this;
        }
        public Builder expressRouteGatewayBypass(@Nullable Boolean expressRouteGatewayBypass) {
            this.expressRouteGatewayBypass = Output.ofNullable(expressRouteGatewayBypass);
            return this;
        }
        public Builder expressRouteGatewayName(Output<String> expressRouteGatewayName) {
            this.expressRouteGatewayName = Objects.requireNonNull(expressRouteGatewayName);
            return this;
        }
        public Builder expressRouteGatewayName(String expressRouteGatewayName) {
            this.expressRouteGatewayName = Output.of(Objects.requireNonNull(expressRouteGatewayName));
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder routingConfiguration(@Nullable Output<RoutingConfigurationArgs> routingConfiguration) {
            this.routingConfiguration = routingConfiguration;
            return this;
        }
        public Builder routingConfiguration(@Nullable RoutingConfigurationArgs routingConfiguration) {
            this.routingConfiguration = Output.ofNullable(routingConfiguration);
            return this;
        }
        public Builder routingWeight(@Nullable Output<Integer> routingWeight) {
            this.routingWeight = routingWeight;
            return this;
        }
        public Builder routingWeight(@Nullable Integer routingWeight) {
            this.routingWeight = Output.ofNullable(routingWeight);
            return this;
        }        public ExpressRouteConnectionArgs build() {
            return new ExpressRouteConnectionArgs(authorizationKey, connectionName, enableInternetSecurity, expressRouteCircuitPeering, expressRouteGatewayBypass, expressRouteGatewayName, id, name, resourceGroupName, routingConfiguration, routingWeight);
        }
    }
}
