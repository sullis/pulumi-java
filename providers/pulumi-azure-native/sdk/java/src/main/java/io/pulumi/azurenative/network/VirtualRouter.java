// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.VirtualRouterArgs;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * VirtualRouter Resource.
 * API Version: 2020-08-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:VirtualRouter virtualRouter /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualRouters/virtualRouter 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:VirtualRouter")
public class VirtualRouter extends io.pulumi.resources.CustomResource {
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
     * The Gateway on which VirtualRouter is hosted.
     * 
     */
    @OutputExport(name="hostedGateway", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> hostedGateway;

    /**
     * @return The Gateway on which VirtualRouter is hosted.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getHostedGateway() {
        return this.hostedGateway;
    }
    /**
     * The Subnet on which VirtualRouter is hosted.
     * 
     */
    @OutputExport(name="hostedSubnet", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> hostedSubnet;

    /**
     * @return The Subnet on which VirtualRouter is hosted.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getHostedSubnet() {
        return this.hostedSubnet;
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
     * List of references to VirtualRouterPeerings.
     * 
     */
    @OutputExport(name="peerings", type=List.class, parameters={SubResourceResponse.class})
    private Output<List<SubResourceResponse>> peerings;

    /**
     * @return List of references to VirtualRouterPeerings.
     * 
     */
    public Output<List<SubResourceResponse>> getPeerings() {
        return this.peerings;
    }
    /**
     * The provisioning state of the resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
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
     * VirtualRouter ASN.
     * 
     */
    @OutputExport(name="virtualRouterAsn", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> virtualRouterAsn;

    /**
     * @return VirtualRouter ASN.
     * 
     */
    public Output</* @Nullable */ Double> getVirtualRouterAsn() {
        return this.virtualRouterAsn;
    }
    /**
     * VirtualRouter IPs.
     * 
     */
    @OutputExport(name="virtualRouterIps", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> virtualRouterIps;

    /**
     * @return VirtualRouter IPs.
     * 
     */
    public Output</* @Nullable */ List<String>> getVirtualRouterIps() {
        return this.virtualRouterIps;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualRouter(String name, VirtualRouterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualRouter", name, args == null ? VirtualRouterArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VirtualRouter(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualRouter", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20190701:VirtualRouter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190801:VirtualRouter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190901:VirtualRouter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191101:VirtualRouter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191201:VirtualRouter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200301:VirtualRouter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:VirtualRouter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:VirtualRouter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:VirtualRouter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:VirtualRouter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:VirtualRouter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:VirtualRouter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:VirtualRouter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:VirtualRouter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:VirtualRouter").build())
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
    public static VirtualRouter get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualRouter(name, id, options);
    }
}
