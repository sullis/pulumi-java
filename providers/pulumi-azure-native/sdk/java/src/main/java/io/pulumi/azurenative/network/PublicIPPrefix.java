// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.PublicIPPrefixArgs;
import io.pulumi.azurenative.network.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.network.outputs.IpTagResponse;
import io.pulumi.azurenative.network.outputs.NatGatewayResponse;
import io.pulumi.azurenative.network.outputs.PublicIPPrefixSkuResponse;
import io.pulumi.azurenative.network.outputs.ReferencedPublicIpAddressResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Public IP prefix resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:PublicIPPrefix test-ipprefix /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/publicIPPrefixes/test-ipprefix 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:PublicIPPrefix")
public class PublicIPPrefix extends io.pulumi.resources.CustomResource {
    /**
     * The customIpPrefix that this prefix is associated with.
     * 
     */
    @OutputExport(name="customIPPrefix", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> customIPPrefix;

    /**
     * @return The customIpPrefix that this prefix is associated with.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getCustomIPPrefix() {
        return this.customIPPrefix;
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
     * The extended location of the public ip address.
     * 
     */
    @OutputExport(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return The extended location of the public ip address.
     * 
     */
    public Output</* @Nullable */ ExtendedLocationResponse> getExtendedLocation() {
        return this.extendedLocation;
    }
    /**
     * The allocated Prefix.
     * 
     */
    @OutputExport(name="ipPrefix", type=String.class, parameters={})
    private Output<String> ipPrefix;

    /**
     * @return The allocated Prefix.
     * 
     */
    public Output<String> getIpPrefix() {
        return this.ipPrefix;
    }
    /**
     * The list of tags associated with the public IP prefix.
     * 
     */
    @OutputExport(name="ipTags", type=List.class, parameters={IpTagResponse.class})
    private Output</* @Nullable */ List<IpTagResponse>> ipTags;

    /**
     * @return The list of tags associated with the public IP prefix.
     * 
     */
    public Output</* @Nullable */ List<IpTagResponse>> getIpTags() {
        return this.ipTags;
    }
    /**
     * The reference to load balancer frontend IP configuration associated with the public IP prefix.
     * 
     */
    @OutputExport(name="loadBalancerFrontendIpConfiguration", type=SubResourceResponse.class, parameters={})
    private Output<SubResourceResponse> loadBalancerFrontendIpConfiguration;

    /**
     * @return The reference to load balancer frontend IP configuration associated with the public IP prefix.
     * 
     */
    public Output<SubResourceResponse> getLoadBalancerFrontendIpConfiguration() {
        return this.loadBalancerFrontendIpConfiguration;
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
     * NatGateway of Public IP Prefix.
     * 
     */
    @OutputExport(name="natGateway", type=NatGatewayResponse.class, parameters={})
    private Output</* @Nullable */ NatGatewayResponse> natGateway;

    /**
     * @return NatGateway of Public IP Prefix.
     * 
     */
    public Output</* @Nullable */ NatGatewayResponse> getNatGateway() {
        return this.natGateway;
    }
    /**
     * The Length of the Public IP Prefix.
     * 
     */
    @OutputExport(name="prefixLength", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> prefixLength;

    /**
     * @return The Length of the Public IP Prefix.
     * 
     */
    public Output</* @Nullable */ Integer> getPrefixLength() {
        return this.prefixLength;
    }
    /**
     * The provisioning state of the public IP prefix resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the public IP prefix resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The public IP address version.
     * 
     */
    @OutputExport(name="publicIPAddressVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicIPAddressVersion;

    /**
     * @return The public IP address version.
     * 
     */
    public Output</* @Nullable */ String> getPublicIPAddressVersion() {
        return this.publicIPAddressVersion;
    }
    /**
     * The list of all referenced PublicIPAddresses.
     * 
     */
    @OutputExport(name="publicIPAddresses", type=List.class, parameters={ReferencedPublicIpAddressResponse.class})
    private Output<List<ReferencedPublicIpAddressResponse>> publicIPAddresses;

    /**
     * @return The list of all referenced PublicIPAddresses.
     * 
     */
    public Output<List<ReferencedPublicIpAddressResponse>> getPublicIPAddresses() {
        return this.publicIPAddresses;
    }
    /**
     * The resource GUID property of the public IP prefix resource.
     * 
     */
    @OutputExport(name="resourceGuid", type=String.class, parameters={})
    private Output<String> resourceGuid;

    /**
     * @return The resource GUID property of the public IP prefix resource.
     * 
     */
    public Output<String> getResourceGuid() {
        return this.resourceGuid;
    }
    /**
     * The public IP prefix SKU.
     * 
     */
    @OutputExport(name="sku", type=PublicIPPrefixSkuResponse.class, parameters={})
    private Output</* @Nullable */ PublicIPPrefixSkuResponse> sku;

    /**
     * @return The public IP prefix SKU.
     * 
     */
    public Output</* @Nullable */ PublicIPPrefixSkuResponse> getSku() {
        return this.sku;
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
     * A list of availability zones denoting the IP allocated for the resource needs to come from.
     * 
     */
    @OutputExport(name="zones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return A list of availability zones denoting the IP allocated for the resource needs to come from.
     * 
     */
    public Output</* @Nullable */ List<String>> getZones() {
        return this.zones;
    }

    public interface BuilderApplicator {
        public void apply(PublicIPPrefixArgs.Builder a);
    }
    private static io.pulumi.azurenative.network.PublicIPPrefixArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.network.PublicIPPrefixArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public PublicIPPrefix(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PublicIPPrefix(String name) {
        this(name, PublicIPPrefixArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PublicIPPrefix(String name, PublicIPPrefixArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PublicIPPrefix(String name, PublicIPPrefixArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:PublicIPPrefix", name, args == null ? PublicIPPrefixArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PublicIPPrefix(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:PublicIPPrefix", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20180701:PublicIPPrefix").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180801:PublicIPPrefix").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181001:PublicIPPrefix").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181101:PublicIPPrefix").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181201:PublicIPPrefix").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190201:PublicIPPrefix").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190401:PublicIPPrefix").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190601:PublicIPPrefix").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190701:PublicIPPrefix").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190801:PublicIPPrefix").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190901:PublicIPPrefix").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191101:PublicIPPrefix").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191201:PublicIPPrefix").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200301:PublicIPPrefix").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:PublicIPPrefix").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:PublicIPPrefix").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:PublicIPPrefix").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:PublicIPPrefix").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:PublicIPPrefix").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:PublicIPPrefix").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:PublicIPPrefix").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:PublicIPPrefix").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:PublicIPPrefix").build())
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
    public static PublicIPPrefix get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PublicIPPrefix(name, id, options);
    }
}