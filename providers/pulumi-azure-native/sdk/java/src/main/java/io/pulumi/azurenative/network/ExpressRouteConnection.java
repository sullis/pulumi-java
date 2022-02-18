// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.ExpressRouteConnectionArgs;
import io.pulumi.azurenative.network.outputs.ExpressRouteCircuitPeeringIdResponse;
import io.pulumi.azurenative.network.outputs.RoutingConfigurationResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ExpressRouteConnection resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:ExpressRouteConnection connectionName /subscriptions/subid/resourceGroups/resourceGroupName/providers/Microsoft.Network/expressRouteGateways/gateway-2/expressRouteConnections/connectionName 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:ExpressRouteConnection")
public class ExpressRouteConnection extends io.pulumi.resources.CustomResource {
    /**
     * Authorization key to establish the connection.
     * 
     */
    @OutputExport(name="authorizationKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> authorizationKey;

    /**
     * @return Authorization key to establish the connection.
     * 
     */
    public Output</* @Nullable */ String> getAuthorizationKey() {
        return this.authorizationKey;
    }
    /**
     * Enable internet security.
     * 
     */
    @OutputExport(name="enableInternetSecurity", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableInternetSecurity;

    /**
     * @return Enable internet security.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableInternetSecurity() {
        return this.enableInternetSecurity;
    }
    /**
     * The ExpressRoute circuit peering.
     * 
     */
    @OutputExport(name="expressRouteCircuitPeering", type=ExpressRouteCircuitPeeringIdResponse.class, parameters={})
    private Output<ExpressRouteCircuitPeeringIdResponse> expressRouteCircuitPeering;

    /**
     * @return The ExpressRoute circuit peering.
     * 
     */
    public Output<ExpressRouteCircuitPeeringIdResponse> getExpressRouteCircuitPeering() {
        return this.expressRouteCircuitPeering;
    }
    /**
     * Enable FastPath to vWan Firewall hub.
     * 
     */
    @OutputExport(name="expressRouteGatewayBypass", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> expressRouteGatewayBypass;

    /**
     * @return Enable FastPath to vWan Firewall hub.
     * 
     */
    public Output</* @Nullable */ Boolean> getExpressRouteGatewayBypass() {
        return this.expressRouteGatewayBypass;
    }
    /**
     * The name of the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The provisioning state of the express route connection resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the express route connection resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
     */
    @OutputExport(name="routingConfiguration", type=RoutingConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ RoutingConfigurationResponse> routingConfiguration;

    /**
     * @return The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
     */
    public Output</* @Nullable */ RoutingConfigurationResponse> getRoutingConfiguration() {
        return this.routingConfiguration;
    }
    /**
     * The routing weight associated to the connection.
     * 
     */
    @OutputExport(name="routingWeight", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> routingWeight;

    /**
     * @return The routing weight associated to the connection.
     * 
     */
    public Output</* @Nullable */ Integer> getRoutingWeight() {
        return this.routingWeight;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExpressRouteConnection(String name, ExpressRouteConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:ExpressRouteConnection", name, args == null ? ExpressRouteConnectionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ExpressRouteConnection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:ExpressRouteConnection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20180801:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181001:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181101:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181201:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190201:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190401:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190601:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190701:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190801:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190901:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191101:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191201:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200301:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:ExpressRouteConnection").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ExpressRouteConnection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ExpressRouteConnection(name, id, options);
    }
}
