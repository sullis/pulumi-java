// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.NatRuleArgs;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.VpnNatRuleMappingResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * VpnGatewayNatRule Resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:NatRule natRule1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/vpnGateways/gateway1/natRules/natRule1 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:NatRule")
public class NatRule extends io.pulumi.resources.CustomResource {
    /**
     * List of egress VpnSiteLinkConnections.
     * 
     */
    @OutputExport(name="egressVpnSiteLinkConnections", type=List.class, parameters={SubResourceResponse.class})
    private Output<List<SubResourceResponse>> egressVpnSiteLinkConnections;

    /**
     * @return List of egress VpnSiteLinkConnections.
     * 
     */
    public Output<List<SubResourceResponse>> getEgressVpnSiteLinkConnections() {
        return this.egressVpnSiteLinkConnections;
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
     * The private IP address external mapping for NAT.
     * 
     */
    @OutputExport(name="externalMappings", type=List.class, parameters={VpnNatRuleMappingResponse.class})
    private Output</* @Nullable */ List<VpnNatRuleMappingResponse>> externalMappings;

    /**
     * @return The private IP address external mapping for NAT.
     * 
     */
    public Output</* @Nullable */ List<VpnNatRuleMappingResponse>> getExternalMappings() {
        return this.externalMappings;
    }
    /**
     * List of ingress VpnSiteLinkConnections.
     * 
     */
    @OutputExport(name="ingressVpnSiteLinkConnections", type=List.class, parameters={SubResourceResponse.class})
    private Output<List<SubResourceResponse>> ingressVpnSiteLinkConnections;

    /**
     * @return List of ingress VpnSiteLinkConnections.
     * 
     */
    public Output<List<SubResourceResponse>> getIngressVpnSiteLinkConnections() {
        return this.ingressVpnSiteLinkConnections;
    }
    /**
     * The private IP address internal mapping for NAT.
     * 
     */
    @OutputExport(name="internalMappings", type=List.class, parameters={VpnNatRuleMappingResponse.class})
    private Output</* @Nullable */ List<VpnNatRuleMappingResponse>> internalMappings;

    /**
     * @return The private IP address internal mapping for NAT.
     * 
     */
    public Output</* @Nullable */ List<VpnNatRuleMappingResponse>> getInternalMappings() {
        return this.internalMappings;
    }
    /**
     * The IP Configuration ID this NAT rule applies to.
     * 
     */
    @OutputExport(name="ipConfigurationId", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipConfigurationId;

    /**
     * @return The IP Configuration ID this NAT rule applies to.
     * 
     */
    public Output</* @Nullable */ String> getIpConfigurationId() {
        return this.ipConfigurationId;
    }
    /**
     * The Source NAT direction of a VPN NAT.
     * 
     */
    @OutputExport(name="mode", type=String.class, parameters={})
    private Output</* @Nullable */ String> mode;

    /**
     * @return The Source NAT direction of a VPN NAT.
     * 
     */
    public Output</* @Nullable */ String> getMode() {
        return this.mode;
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * The provisioning state of the NAT Rule resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the NAT Rule resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
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
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NatRule(String name, NatRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:NatRule", name, args == null ? NatRuleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NatRule(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:NatRule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20200801:NatRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:NatRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:NatRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:NatRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:NatRule").build())
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
    public static NatRule get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NatRule(name, id, options);
    }
}
