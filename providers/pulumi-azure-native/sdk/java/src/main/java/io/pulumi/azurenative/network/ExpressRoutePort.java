// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.ExpressRoutePortArgs;
import io.pulumi.azurenative.network.outputs.ExpressRouteLinkResponse;
import io.pulumi.azurenative.network.outputs.ManagedServiceIdentityResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * ExpressRoutePort resource definition.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:ExpressRoutePort portName /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/expressRoutePorts/portName 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:ExpressRoutePort")
public class ExpressRoutePort extends io.pulumi.resources.CustomResource {
    /**
     * Date of the physical port allocation to be used in Letter of Authorization.
     * 
     */
    @OutputExport(name="allocationDate", type=String.class, parameters={})
    private Output<String> allocationDate;

    /**
     * @return Date of the physical port allocation to be used in Letter of Authorization.
     * 
     */
    public Output<String> getAllocationDate() {
        return this.allocationDate;
    }
    /**
     * Bandwidth of procured ports in Gbps.
     * 
     */
    @OutputExport(name="bandwidthInGbps", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> bandwidthInGbps;

    /**
     * @return Bandwidth of procured ports in Gbps.
     * 
     */
    public Output</* @Nullable */ Integer> getBandwidthInGbps() {
        return this.bandwidthInGbps;
    }
    /**
     * Reference the ExpressRoute circuit(s) that are provisioned on this ExpressRoutePort resource.
     * 
     */
    @OutputExport(name="circuits", type=List.class, parameters={SubResourceResponse.class})
    private Output<List<SubResourceResponse>> circuits;

    /**
     * @return Reference the ExpressRoute circuit(s) that are provisioned on this ExpressRoutePort resource.
     * 
     */
    public Output<List<SubResourceResponse>> getCircuits() {
        return this.circuits;
    }
    /**
     * Encapsulation method on physical ports.
     * 
     */
    @OutputExport(name="encapsulation", type=String.class, parameters={})
    private Output</* @Nullable */ String> encapsulation;

    /**
     * @return Encapsulation method on physical ports.
     * 
     */
    public Output</* @Nullable */ String> getEncapsulation() {
        return this.encapsulation;
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
     * Ether type of the physical port.
     * 
     */
    @OutputExport(name="etherType", type=String.class, parameters={})
    private Output<String> etherType;

    /**
     * @return Ether type of the physical port.
     * 
     */
    public Output<String> getEtherType() {
        return this.etherType;
    }
    /**
     * The identity of ExpressRoutePort, if configured.
     * 
     */
    @OutputExport(name="identity", type=ManagedServiceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ManagedServiceIdentityResponse> identity;

    /**
     * @return The identity of ExpressRoutePort, if configured.
     * 
     */
    public Output</* @Nullable */ ManagedServiceIdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * The set of physical links of the ExpressRoutePort resource.
     * 
     */
    @OutputExport(name="links", type=List.class, parameters={ExpressRouteLinkResponse.class})
    private Output</* @Nullable */ List<ExpressRouteLinkResponse>> links;

    /**
     * @return The set of physical links of the ExpressRoutePort resource.
     * 
     */
    public Output</* @Nullable */ List<ExpressRouteLinkResponse>> getLinks() {
        return this.links;
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
     * Maximum transmission unit of the physical port pair(s).
     * 
     */
    @OutputExport(name="mtu", type=String.class, parameters={})
    private Output<String> mtu;

    /**
     * @return Maximum transmission unit of the physical port pair(s).
     * 
     */
    public Output<String> getMtu() {
        return this.mtu;
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
     * The name of the peering location that the ExpressRoutePort is mapped to physically.
     * 
     */
    @OutputExport(name="peeringLocation", type=String.class, parameters={})
    private Output</* @Nullable */ String> peeringLocation;

    /**
     * @return The name of the peering location that the ExpressRoutePort is mapped to physically.
     * 
     */
    public Output</* @Nullable */ String> getPeeringLocation() {
        return this.peeringLocation;
    }
    /**
     * Aggregate Gbps of associated circuit bandwidths.
     * 
     */
    @OutputExport(name="provisionedBandwidthInGbps", type=Double.class, parameters={})
    private Output<Double> provisionedBandwidthInGbps;

    /**
     * @return Aggregate Gbps of associated circuit bandwidths.
     * 
     */
    public Output<Double> getProvisionedBandwidthInGbps() {
        return this.provisionedBandwidthInGbps;
    }
    /**
     * The provisioning state of the express route port resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the express route port resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource GUID property of the express route port resource.
     * 
     */
    @OutputExport(name="resourceGuid", type=String.class, parameters={})
    private Output<String> resourceGuid;

    /**
     * @return The resource GUID property of the express route port resource.
     * 
     */
    public Output<String> getResourceGuid() {
        return this.resourceGuid;
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

    public interface BuilderApplicator {
        public void apply(ExpressRoutePortArgs.Builder a);
    }
    private static io.pulumi.azurenative.network.ExpressRoutePortArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.network.ExpressRoutePortArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ExpressRoutePort(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ExpressRoutePort(String name) {
        this(name, ExpressRoutePortArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExpressRoutePort(String name, ExpressRoutePortArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExpressRoutePort(String name, ExpressRoutePortArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:ExpressRoutePort", name, args == null ? ExpressRoutePortArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ExpressRoutePort(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:ExpressRoutePort", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20180801:ExpressRoutePort").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181001:ExpressRoutePort").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181101:ExpressRoutePort").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181201:ExpressRoutePort").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190201:ExpressRoutePort").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190401:ExpressRoutePort").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190601:ExpressRoutePort").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190701:ExpressRoutePort").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190801:ExpressRoutePort").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190901:ExpressRoutePort").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191101:ExpressRoutePort").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191201:ExpressRoutePort").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200301:ExpressRoutePort").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:ExpressRoutePort").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:ExpressRoutePort").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:ExpressRoutePort").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:ExpressRoutePort").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:ExpressRoutePort").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:ExpressRoutePort").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:ExpressRoutePort").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:ExpressRoutePort").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:ExpressRoutePort").build())
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
    public static ExpressRoutePort get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ExpressRoutePort(name, id, options);
    }
}