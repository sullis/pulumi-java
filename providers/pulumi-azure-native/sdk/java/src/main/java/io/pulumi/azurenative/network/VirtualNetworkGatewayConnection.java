// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.VirtualNetworkGatewayConnectionArgs;
import io.pulumi.azurenative.network.outputs.IpsecPolicyResponse;
import io.pulumi.azurenative.network.outputs.LocalNetworkGatewayResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.TrafficSelectorPolicyResponse;
import io.pulumi.azurenative.network.outputs.TunnelConnectionHealthResponse;
import io.pulumi.azurenative.network.outputs.VirtualNetworkGatewayResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A common class for general resource information.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:VirtualNetworkGatewayConnection connS2S /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/connections/connS2S 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:VirtualNetworkGatewayConnection")
public class VirtualNetworkGatewayConnection extends io.pulumi.resources.CustomResource {
    /**
     * The authorizationKey.
     * 
     */
    @OutputExport(name="authorizationKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> authorizationKey;

    /**
     * @return The authorizationKey.
     * 
     */
    public Output</* @Nullable */ String> getAuthorizationKey() {
        return this.authorizationKey;
    }
    /**
     * The connection mode for this connection.
     * 
     */
    @OutputExport(name="connectionMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> connectionMode;

    /**
     * @return The connection mode for this connection.
     * 
     */
    public Output</* @Nullable */ String> getConnectionMode() {
        return this.connectionMode;
    }
    /**
     * Connection protocol used for this connection.
     * 
     */
    @OutputExport(name="connectionProtocol", type=String.class, parameters={})
    private Output</* @Nullable */ String> connectionProtocol;

    /**
     * @return Connection protocol used for this connection.
     * 
     */
    public Output</* @Nullable */ String> getConnectionProtocol() {
        return this.connectionProtocol;
    }
    /**
     * Virtual Network Gateway connection status.
     * 
     */
    @OutputExport(name="connectionStatus", type=String.class, parameters={})
    private Output<String> connectionStatus;

    /**
     * @return Virtual Network Gateway connection status.
     * 
     */
    public Output<String> getConnectionStatus() {
        return this.connectionStatus;
    }
    /**
     * Gateway connection type.
     * 
     */
    @OutputExport(name="connectionType", type=String.class, parameters={})
    private Output<String> connectionType;

    /**
     * @return Gateway connection type.
     * 
     */
    public Output<String> getConnectionType() {
        return this.connectionType;
    }
    /**
     * The dead peer detection timeout of this connection in seconds.
     * 
     */
    @OutputExport(name="dpdTimeoutSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> dpdTimeoutSeconds;

    /**
     * @return The dead peer detection timeout of this connection in seconds.
     * 
     */
    public Output</* @Nullable */ Integer> getDpdTimeoutSeconds() {
        return this.dpdTimeoutSeconds;
    }
    /**
     * The egress bytes transferred in this connection.
     * 
     */
    @OutputExport(name="egressBytesTransferred", type=Double.class, parameters={})
    private Output<Double> egressBytesTransferred;

    /**
     * @return The egress bytes transferred in this connection.
     * 
     */
    public Output<Double> getEgressBytesTransferred() {
        return this.egressBytesTransferred;
    }
    /**
     * EnableBgp flag.
     * 
     */
    @OutputExport(name="enableBgp", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableBgp;

    /**
     * @return EnableBgp flag.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableBgp() {
        return this.enableBgp;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Bypass ExpressRoute Gateway for data forwarding.
     * 
     */
    @OutputExport(name="expressRouteGatewayBypass", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> expressRouteGatewayBypass;

    /**
     * @return Bypass ExpressRoute Gateway for data forwarding.
     * 
     */
    public Output</* @Nullable */ Boolean> getExpressRouteGatewayBypass() {
        return this.expressRouteGatewayBypass;
    }
    /**
     * The ingress bytes transferred in this connection.
     * 
     */
    @OutputExport(name="ingressBytesTransferred", type=Double.class, parameters={})
    private Output<Double> ingressBytesTransferred;

    /**
     * @return The ingress bytes transferred in this connection.
     * 
     */
    public Output<Double> getIngressBytesTransferred() {
        return this.ingressBytesTransferred;
    }
    /**
     * The IPSec Policies to be considered by this connection.
     * 
     */
    @OutputExport(name="ipsecPolicies", type=List.class, parameters={IpsecPolicyResponse.class})
    private Output</* @Nullable */ List<IpsecPolicyResponse>> ipsecPolicies;

    /**
     * @return The IPSec Policies to be considered by this connection.
     * 
     */
    public Output</* @Nullable */ List<IpsecPolicyResponse>> getIpsecPolicies() {
        return this.ipsecPolicies;
    }
    /**
     * The reference to local network gateway resource.
     * 
     */
    @OutputExport(name="localNetworkGateway2", type=LocalNetworkGatewayResponse.class, parameters={})
    private Output</* @Nullable */ LocalNetworkGatewayResponse> localNetworkGateway2;

    /**
     * @return The reference to local network gateway resource.
     * 
     */
    public Output</* @Nullable */ LocalNetworkGatewayResponse> getLocalNetworkGateway2() {
        return this.localNetworkGateway2;
    }
    /**
     * Resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The reference to peerings resource.
     * 
     */
    @OutputExport(name="peer", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> peer;

    /**
     * @return The reference to peerings resource.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getPeer() {
        return this.peer;
    }
    /**
     * The provisioning state of the virtual network gateway connection resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the virtual network gateway connection resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource GUID property of the virtual network gateway connection resource.
     * 
     */
    @OutputExport(name="resourceGuid", type=String.class, parameters={})
    private Output<String> resourceGuid;

    /**
     * @return The resource GUID property of the virtual network gateway connection resource.
     * 
     */
    public Output<String> getResourceGuid() {
        return this.resourceGuid;
    }
    /**
     * The routing weight.
     * 
     */
    @OutputExport(name="routingWeight", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> routingWeight;

    /**
     * @return The routing weight.
     * 
     */
    public Output</* @Nullable */ Integer> getRoutingWeight() {
        return this.routingWeight;
    }
    /**
     * The IPSec shared key.
     * 
     */
    @OutputExport(name="sharedKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> sharedKey;

    /**
     * @return The IPSec shared key.
     * 
     */
    public Output</* @Nullable */ String> getSharedKey() {
        return this.sharedKey;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The Traffic Selector Policies to be considered by this connection.
     * 
     */
    @OutputExport(name="trafficSelectorPolicies", type=List.class, parameters={TrafficSelectorPolicyResponse.class})
    private Output</* @Nullable */ List<TrafficSelectorPolicyResponse>> trafficSelectorPolicies;

    /**
     * @return The Traffic Selector Policies to be considered by this connection.
     * 
     */
    public Output</* @Nullable */ List<TrafficSelectorPolicyResponse>> getTrafficSelectorPolicies() {
        return this.trafficSelectorPolicies;
    }
    /**
     * Collection of all tunnels' connection health status.
     * 
     */
    @OutputExport(name="tunnelConnectionStatus", type=List.class, parameters={TunnelConnectionHealthResponse.class})
    private Output<List<TunnelConnectionHealthResponse>> tunnelConnectionStatus;

    /**
     * @return Collection of all tunnels' connection health status.
     * 
     */
    public Output<List<TunnelConnectionHealthResponse>> getTunnelConnectionStatus() {
        return this.tunnelConnectionStatus;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Use private local Azure IP for the connection.
     * 
     */
    @OutputExport(name="useLocalAzureIpAddress", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> useLocalAzureIpAddress;

    /**
     * @return Use private local Azure IP for the connection.
     * 
     */
    public Output</* @Nullable */ Boolean> getUseLocalAzureIpAddress() {
        return this.useLocalAzureIpAddress;
    }
    /**
     * Enable policy-based traffic selectors.
     * 
     */
    @OutputExport(name="usePolicyBasedTrafficSelectors", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> usePolicyBasedTrafficSelectors;

    /**
     * @return Enable policy-based traffic selectors.
     * 
     */
    public Output</* @Nullable */ Boolean> getUsePolicyBasedTrafficSelectors() {
        return this.usePolicyBasedTrafficSelectors;
    }
    /**
     * The reference to virtual network gateway resource.
     * 
     */
    @OutputExport(name="virtualNetworkGateway1", type=VirtualNetworkGatewayResponse.class, parameters={})
    private Output<VirtualNetworkGatewayResponse> virtualNetworkGateway1;

    /**
     * @return The reference to virtual network gateway resource.
     * 
     */
    public Output<VirtualNetworkGatewayResponse> getVirtualNetworkGateway1() {
        return this.virtualNetworkGateway1;
    }
    /**
     * The reference to virtual network gateway resource.
     * 
     */
    @OutputExport(name="virtualNetworkGateway2", type=VirtualNetworkGatewayResponse.class, parameters={})
    private Output</* @Nullable */ VirtualNetworkGatewayResponse> virtualNetworkGateway2;

    /**
     * @return The reference to virtual network gateway resource.
     * 
     */
    public Output</* @Nullable */ VirtualNetworkGatewayResponse> getVirtualNetworkGateway2() {
        return this.virtualNetworkGateway2;
    }

    public interface BuilderApplicator {
        public void apply(VirtualNetworkGatewayConnectionArgs.Builder a);
    }
    private static io.pulumi.azurenative.network.VirtualNetworkGatewayConnectionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.network.VirtualNetworkGatewayConnectionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VirtualNetworkGatewayConnection(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
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
    public VirtualNetworkGatewayConnection(String name, VirtualNetworkGatewayConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualNetworkGatewayConnection", name, args == null ? VirtualNetworkGatewayConnectionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VirtualNetworkGatewayConnection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualNetworkGatewayConnection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20150615:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20160330:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20160601:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20160901:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20161201:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20170301:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20170601:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20170801:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20170901:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20171001:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20171101:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180101:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180201:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180401:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180601:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180701:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180801:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181001:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181101:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181201:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190201:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190401:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190601:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190701:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190801:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190901:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191101:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191201:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200301:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:VirtualNetworkGatewayConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:VirtualNetworkGatewayConnection").build())
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
    public static VirtualNetworkGatewayConnection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualNetworkGatewayConnection(name, id, options);
    }
}