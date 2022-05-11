// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.network.VirtualNetworkGatewayConnectionArgs;
import com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionState;
import com.pulumi.azure.network.outputs.VirtualNetworkGatewayConnectionIpsecPolicy;
import com.pulumi.azure.network.outputs.VirtualNetworkGatewayConnectionTrafficSelectorPolicy;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a connection in an existing Virtual Network Gateway.
 * 
 * ## Example Usage
 * ### Site-to-Site connection
 * 
 * The following example shows a connection between an Azure virtual network
 * and an on-premises VPN device and network.
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West US&#34;)
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .addressSpaces(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var exampleSubnet = new Subnet(&#34;exampleSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .virtualNetworkName(exampleVirtualNetwork.getName())
 *             .addressPrefixes(&#34;10.0.1.0/24&#34;)
 *             .build());
 * 
 *         var onpremiseLocalNetworkGateway = new LocalNetworkGateway(&#34;onpremiseLocalNetworkGateway&#34;, LocalNetworkGatewayArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .gatewayAddress(&#34;168.62.225.23&#34;)
 *             .addressSpaces(&#34;10.1.1.0/24&#34;)
 *             .build());
 * 
 *         var examplePublicIp = new PublicIp(&#34;examplePublicIp&#34;, PublicIpArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .allocationMethod(&#34;Dynamic&#34;)
 *             .build());
 * 
 *         var exampleVirtualNetworkGateway = new VirtualNetworkGateway(&#34;exampleVirtualNetworkGateway&#34;, VirtualNetworkGatewayArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .type(&#34;Vpn&#34;)
 *             .vpnType(&#34;RouteBased&#34;)
 *             .activeActive(false)
 *             .enableBgp(false)
 *             .sku(&#34;Basic&#34;)
 *             .ipConfigurations(VirtualNetworkGatewayIpConfiguration.builder()
 *                 .publicIpAddressId(examplePublicIp.getId())
 *                 .privateIpAddressAllocation(&#34;Dynamic&#34;)
 *                 .subnetId(exampleSubnet.getId())
 *                 .build())
 *             .build());
 * 
 *         var onpremiseVirtualNetworkGatewayConnection = new VirtualNetworkGatewayConnection(&#34;onpremiseVirtualNetworkGatewayConnection&#34;, VirtualNetworkGatewayConnectionArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .type(&#34;IPsec&#34;)
 *             .virtualNetworkGatewayId(exampleVirtualNetworkGateway.getId())
 *             .localNetworkGatewayId(onpremiseLocalNetworkGateway.getId())
 *             .sharedKey(&#34;4-v3ry-53cr37-1p53c-5h4r3d-k3y&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### VNet-to-VNet connection
 * 
 * The following example shows a connection between two Azure virtual network
 * in different locations/regions.
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var usResourceGroup = new ResourceGroup(&#34;usResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;East US&#34;)
 *             .build());
 * 
 *         var usVirtualNetwork = new VirtualNetwork(&#34;usVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .location(usResourceGroup.getLocation())
 *             .resourceGroupName(usResourceGroup.getName())
 *             .addressSpaces(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var usGateway = new Subnet(&#34;usGateway&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(usResourceGroup.getName())
 *             .virtualNetworkName(usVirtualNetwork.getName())
 *             .addressPrefixes(&#34;10.0.1.0/24&#34;)
 *             .build());
 * 
 *         var usPublicIp = new PublicIp(&#34;usPublicIp&#34;, PublicIpArgs.builder()        
 *             .location(usResourceGroup.getLocation())
 *             .resourceGroupName(usResourceGroup.getName())
 *             .allocationMethod(&#34;Dynamic&#34;)
 *             .build());
 * 
 *         var usVirtualNetworkGateway = new VirtualNetworkGateway(&#34;usVirtualNetworkGateway&#34;, VirtualNetworkGatewayArgs.builder()        
 *             .location(usResourceGroup.getLocation())
 *             .resourceGroupName(usResourceGroup.getName())
 *             .type(&#34;Vpn&#34;)
 *             .vpnType(&#34;RouteBased&#34;)
 *             .sku(&#34;Basic&#34;)
 *             .ipConfigurations(VirtualNetworkGatewayIpConfiguration.builder()
 *                 .publicIpAddressId(usPublicIp.getId())
 *                 .privateIpAddressAllocation(&#34;Dynamic&#34;)
 *                 .subnetId(usGateway.getId())
 *                 .build())
 *             .build());
 * 
 *         var europeResourceGroup = new ResourceGroup(&#34;europeResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var europeVirtualNetwork = new VirtualNetwork(&#34;europeVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .location(europeResourceGroup.getLocation())
 *             .resourceGroupName(europeResourceGroup.getName())
 *             .addressSpaces(&#34;10.1.0.0/16&#34;)
 *             .build());
 * 
 *         var europeGateway = new Subnet(&#34;europeGateway&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(europeResourceGroup.getName())
 *             .virtualNetworkName(europeVirtualNetwork.getName())
 *             .addressPrefixes(&#34;10.1.1.0/24&#34;)
 *             .build());
 * 
 *         var europePublicIp = new PublicIp(&#34;europePublicIp&#34;, PublicIpArgs.builder()        
 *             .location(europeResourceGroup.getLocation())
 *             .resourceGroupName(europeResourceGroup.getName())
 *             .allocationMethod(&#34;Dynamic&#34;)
 *             .build());
 * 
 *         var europeVirtualNetworkGateway = new VirtualNetworkGateway(&#34;europeVirtualNetworkGateway&#34;, VirtualNetworkGatewayArgs.builder()        
 *             .location(europeResourceGroup.getLocation())
 *             .resourceGroupName(europeResourceGroup.getName())
 *             .type(&#34;Vpn&#34;)
 *             .vpnType(&#34;RouteBased&#34;)
 *             .sku(&#34;Basic&#34;)
 *             .ipConfigurations(VirtualNetworkGatewayIpConfiguration.builder()
 *                 .publicIpAddressId(europePublicIp.getId())
 *                 .privateIpAddressAllocation(&#34;Dynamic&#34;)
 *                 .subnetId(europeGateway.getId())
 *                 .build())
 *             .build());
 * 
 *         var usToEurope = new VirtualNetworkGatewayConnection(&#34;usToEurope&#34;, VirtualNetworkGatewayConnectionArgs.builder()        
 *             .location(usResourceGroup.getLocation())
 *             .resourceGroupName(usResourceGroup.getName())
 *             .type(&#34;Vnet2Vnet&#34;)
 *             .virtualNetworkGatewayId(usVirtualNetworkGateway.getId())
 *             .peerVirtualNetworkGatewayId(europeVirtualNetworkGateway.getId())
 *             .sharedKey(&#34;4-v3ry-53cr37-1p53c-5h4r3d-k3y&#34;)
 *             .build());
 * 
 *         var europeToUs = new VirtualNetworkGatewayConnection(&#34;europeToUs&#34;, VirtualNetworkGatewayConnectionArgs.builder()        
 *             .location(europeResourceGroup.getLocation())
 *             .resourceGroupName(europeResourceGroup.getName())
 *             .type(&#34;Vnet2Vnet&#34;)
 *             .virtualNetworkGatewayId(europeVirtualNetworkGateway.getId())
 *             .peerVirtualNetworkGatewayId(usVirtualNetworkGateway.getId())
 *             .sharedKey(&#34;4-v3ry-53cr37-1p53c-5h4r3d-k3y&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Virtual Network Gateway Connections can be imported using their `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:network/virtualNetworkGatewayConnection:VirtualNetworkGatewayConnection exampleConnection /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myGroup1/providers/Microsoft.Network/connections/myConnection1
 * ```
 * 
 */
@ResourceType(type="azure:network/virtualNetworkGatewayConnection:VirtualNetworkGatewayConnection")
public class VirtualNetworkGatewayConnection extends com.pulumi.resources.CustomResource {
    /**
     * The authorization key associated with the
     * Express Route Circuit. This field is required only if the type is an
     * ExpressRoute connection.
     * 
     */
    @Export(name="authorizationKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> authorizationKey;

    /**
     * @return The authorization key associated with the
     * Express Route Circuit. This field is required only if the type is an
     * ExpressRoute connection.
     * 
     */
    public Output<Optional<String>> authorizationKey() {
        return Codegen.optional(this.authorizationKey);
    }
    /**
     * Connection mode to use. Possible
     * values are `Default`, `InitiatorOnly` and `ResponderOnly`. Defaults to `Default`.
     * Changing this value will force a resource to be created.
     * 
     */
    @Export(name="connectionMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> connectionMode;

    /**
     * @return Connection mode to use. Possible
     * values are `Default`, `InitiatorOnly` and `ResponderOnly`. Defaults to `Default`.
     * Changing this value will force a resource to be created.
     * 
     */
    public Output<Optional<String>> connectionMode() {
        return Codegen.optional(this.connectionMode);
    }
    /**
     * The IKE protocol version to use. Possible
     * values are `IKEv1` and `IKEv2`. Defaults to `IKEv2`.
     * Changing this value will force a resource to be created.
     * &gt; **Note:** Only valid for `IPSec` connections on virtual network gateways with SKU `VpnGw1`, `VpnGw2`, `VpnGw3`, `VpnGw1AZ`, `VpnGw2AZ` or `VpnGw3AZ`.
     * 
     */
    @Export(name="connectionProtocol", type=String.class, parameters={})
    private Output<String> connectionProtocol;

    /**
     * @return The IKE protocol version to use. Possible
     * values are `IKEv1` and `IKEv2`. Defaults to `IKEv2`.
     * Changing this value will force a resource to be created.
     * &gt; **Note:** Only valid for `IPSec` connections on virtual network gateways with SKU `VpnGw1`, `VpnGw2`, `VpnGw3`, `VpnGw1AZ`, `VpnGw2AZ` or `VpnGw3AZ`.
     * 
     */
    public Output<String> connectionProtocol() {
        return this.connectionProtocol;
    }
    /**
     * The dead peer detection timeout of this connection in seconds. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="dpdTimeoutSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> dpdTimeoutSeconds;

    /**
     * @return The dead peer detection timeout of this connection in seconds. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Integer>> dpdTimeoutSeconds() {
        return Codegen.optional(this.dpdTimeoutSeconds);
    }
    /**
     * If `true`, BGP (Border Gateway Protocol) is enabled
     * for this connection. Defaults to `false`.
     * 
     */
    @Export(name="enableBgp", type=Boolean.class, parameters={})
    private Output<Boolean> enableBgp;

    /**
     * @return If `true`, BGP (Border Gateway Protocol) is enabled
     * for this connection. Defaults to `false`.
     * 
     */
    public Output<Boolean> enableBgp() {
        return this.enableBgp;
    }
    /**
     * The ID of the Express Route Circuit
     * when creating an ExpressRoute connection (i.e. when `type` is `ExpressRoute`).
     * The Express Route Circuit can be in the same or in a different subscription.
     * 
     */
    @Export(name="expressRouteCircuitId", type=String.class, parameters={})
    private Output</* @Nullable */ String> expressRouteCircuitId;

    /**
     * @return The ID of the Express Route Circuit
     * when creating an ExpressRoute connection (i.e. when `type` is `ExpressRoute`).
     * The Express Route Circuit can be in the same or in a different subscription.
     * 
     */
    public Output<Optional<String>> expressRouteCircuitId() {
        return Codegen.optional(this.expressRouteCircuitId);
    }
    /**
     * If `true`, data packets will bypass ExpressRoute Gateway for data forwarding This is only valid for ExpressRoute connections.
     * 
     */
    @Export(name="expressRouteGatewayBypass", type=Boolean.class, parameters={})
    private Output<Boolean> expressRouteGatewayBypass;

    /**
     * @return If `true`, data packets will bypass ExpressRoute Gateway for data forwarding This is only valid for ExpressRoute connections.
     * 
     */
    public Output<Boolean> expressRouteGatewayBypass() {
        return this.expressRouteGatewayBypass;
    }
    /**
     * A `ipsec_policy` block which is documented below.
     * Only a single policy can be defined for a connection. For details on
     * custom policies refer to [the relevant section in the Azure documentation](https://docs.microsoft.com/en-us/azure/vpn-gateway/vpn-gateway-ipsecikepolicy-rm-powershell).
     * 
     */
    @Export(name="ipsecPolicy", type=VirtualNetworkGatewayConnectionIpsecPolicy.class, parameters={})
    private Output</* @Nullable */ VirtualNetworkGatewayConnectionIpsecPolicy> ipsecPolicy;

    /**
     * @return A `ipsec_policy` block which is documented below.
     * Only a single policy can be defined for a connection. For details on
     * custom policies refer to [the relevant section in the Azure documentation](https://docs.microsoft.com/en-us/azure/vpn-gateway/vpn-gateway-ipsecikepolicy-rm-powershell).
     * 
     */
    public Output<Optional<VirtualNetworkGatewayConnectionIpsecPolicy>> ipsecPolicy() {
        return Codegen.optional(this.ipsecPolicy);
    }
    /**
     * Use private local Azure IP for the connection. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="localAzureIpAddressEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> localAzureIpAddressEnabled;

    /**
     * @return Use private local Azure IP for the connection. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Boolean>> localAzureIpAddressEnabled() {
        return Codegen.optional(this.localAzureIpAddressEnabled);
    }
    /**
     * The ID of the local network gateway
     * when creating Site-to-Site connection (i.e. when `type` is `IPsec`).
     * 
     */
    @Export(name="localNetworkGatewayId", type=String.class, parameters={})
    private Output</* @Nullable */ String> localNetworkGatewayId;

    /**
     * @return The ID of the local network gateway
     * when creating Site-to-Site connection (i.e. when `type` is `IPsec`).
     * 
     */
    public Output<Optional<String>> localNetworkGatewayId() {
        return Codegen.optional(this.localNetworkGatewayId);
    }
    /**
     * The location/region where the connection is
     * located. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location/region where the connection is
     * located. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the connection. Changing the name forces a
     * new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the connection. Changing the name forces a
     * new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the peer virtual
     * network gateway when creating a VNet-to-VNet connection (i.e. when `type`
     * is `Vnet2Vnet`). The peer Virtual Network Gateway can be in the same or
     * in a different subscription.
     * 
     */
    @Export(name="peerVirtualNetworkGatewayId", type=String.class, parameters={})
    private Output</* @Nullable */ String> peerVirtualNetworkGatewayId;

    /**
     * @return The ID of the peer virtual
     * network gateway when creating a VNet-to-VNet connection (i.e. when `type`
     * is `Vnet2Vnet`). The peer Virtual Network Gateway can be in the same or
     * in a different subscription.
     * 
     */
    public Output<Optional<String>> peerVirtualNetworkGatewayId() {
        return Codegen.optional(this.peerVirtualNetworkGatewayId);
    }
    /**
     * The name of the resource group in which to
     * create the connection Changing the name forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to
     * create the connection Changing the name forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The routing weight. Defaults to `10`.
     * 
     */
    @Export(name="routingWeight", type=Integer.class, parameters={})
    private Output<Integer> routingWeight;

    /**
     * @return The routing weight. Defaults to `10`.
     * 
     */
    public Output<Integer> routingWeight() {
        return this.routingWeight;
    }
    /**
     * The shared IPSec key. A key could be provided if a
     * Site-to-Site, VNet-to-VNet or ExpressRoute connection is created.
     * 
     */
    @Export(name="sharedKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> sharedKey;

    /**
     * @return The shared IPSec key. A key could be provided if a
     * Site-to-Site, VNet-to-VNet or ExpressRoute connection is created.
     * 
     */
    public Output<Optional<String>> sharedKey() {
        return Codegen.optional(this.sharedKey);
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A `traffic_selector_policy` which allows to specify traffic selector policy proposal to be used in a virtual network gateway connection.
     * Only one block can be defined for a connection.
     * For details about traffic selectors refer to [the relevant section in the Azure documentation](https://docs.microsoft.com/en-us/azure/vpn-gateway/vpn-gateway-connect-multiple-policybased-rm-ps).
     * 
     */
    @Export(name="trafficSelectorPolicy", type=VirtualNetworkGatewayConnectionTrafficSelectorPolicy.class, parameters={})
    private Output</* @Nullable */ VirtualNetworkGatewayConnectionTrafficSelectorPolicy> trafficSelectorPolicy;

    /**
     * @return A `traffic_selector_policy` which allows to specify traffic selector policy proposal to be used in a virtual network gateway connection.
     * Only one block can be defined for a connection.
     * For details about traffic selectors refer to [the relevant section in the Azure documentation](https://docs.microsoft.com/en-us/azure/vpn-gateway/vpn-gateway-connect-multiple-policybased-rm-ps).
     * 
     */
    public Output<Optional<VirtualNetworkGatewayConnectionTrafficSelectorPolicy>> trafficSelectorPolicy() {
        return Codegen.optional(this.trafficSelectorPolicy);
    }
    /**
     * The type of connection. Valid options are `IPsec`
     * (Site-to-Site), `ExpressRoute` (ExpressRoute), and `Vnet2Vnet` (VNet-to-VNet).
     * Each connection type requires different mandatory arguments (refer to the
     * examples above). Changing the connection type will force a new connection
     * to be created.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of connection. Valid options are `IPsec`
     * (Site-to-Site), `ExpressRoute` (ExpressRoute), and `Vnet2Vnet` (VNet-to-VNet).
     * Each connection type requires different mandatory arguments (refer to the
     * examples above). Changing the connection type will force a new connection
     * to be created.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * If `true`, policy-based traffic
     * selectors are enabled for this connection. Enabling policy-based traffic
     * selectors requires an `ipsec_policy` block. Defaults to `false`.
     * 
     */
    @Export(name="usePolicyBasedTrafficSelectors", type=Boolean.class, parameters={})
    private Output<Boolean> usePolicyBasedTrafficSelectors;

    /**
     * @return If `true`, policy-based traffic
     * selectors are enabled for this connection. Enabling policy-based traffic
     * selectors requires an `ipsec_policy` block. Defaults to `false`.
     * 
     */
    public Output<Boolean> usePolicyBasedTrafficSelectors() {
        return this.usePolicyBasedTrafficSelectors;
    }
    /**
     * The ID of the Virtual Network Gateway
     * in which the connection will be created. Changing the gateway forces a new
     * resource to be created.
     * 
     */
    @Export(name="virtualNetworkGatewayId", type=String.class, parameters={})
    private Output<String> virtualNetworkGatewayId;

    /**
     * @return The ID of the Virtual Network Gateway
     * in which the connection will be created. Changing the gateway forces a new
     * resource to be created.
     * 
     */
    public Output<String> virtualNetworkGatewayId() {
        return this.virtualNetworkGatewayId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualNetworkGatewayConnection(String name) {
        this(name, VirtualNetworkGatewayConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualNetworkGatewayConnection(String name, VirtualNetworkGatewayConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualNetworkGatewayConnection(String name, VirtualNetworkGatewayConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/virtualNetworkGatewayConnection:VirtualNetworkGatewayConnection", name, args == null ? VirtualNetworkGatewayConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualNetworkGatewayConnection(String name, Output<String> id, @Nullable VirtualNetworkGatewayConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/virtualNetworkGatewayConnection:VirtualNetworkGatewayConnection", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static VirtualNetworkGatewayConnection get(String name, Output<String> id, @Nullable VirtualNetworkGatewayConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualNetworkGatewayConnection(name, id, state, options);
    }
}
