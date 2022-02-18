// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.HaVpnGatewayArgs;
import io.pulumi.gcp.compute.inputs.HaVpnGatewayState;
import io.pulumi.gcp.compute.outputs.HaVpnGatewayVpnInterface;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents a VPN gateway running in GCP. This virtual device is managed
 * by Google, but used only by you. This type of VPN Gateway allows for the creation
 * of VPN solutions with higher availability than classic Target VPN Gateways.
 * 
 * To get more information about HaVpnGateway, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/vpnGateways)
 * * How-to Guides
 *     * [Choosing a VPN](https://cloud.google.com/vpn/docs/how-to/choosing-a-vpn)
 *     * [Cloud VPN Overview](https://cloud.google.com/vpn/docs/concepts/overview)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * HaVpnGateway can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/haVpnGateway:HaVpnGateway default projects/{{project}}/regions/{{region}}/vpnGateways/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/haVpnGateway:HaVpnGateway default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/haVpnGateway:HaVpnGateway default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/haVpnGateway:HaVpnGateway default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/haVpnGateway:HaVpnGateway")
public class HaVpnGateway extends io.pulumi.resources.CustomResource {
    /**
     * An optional description of this resource.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The network this VPN gateway is accepting traffic for.
     * 
     */
    @OutputExport(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return The network this VPN gateway is accepting traffic for.
     * 
     */
    public Output<String> getNetwork() {
        return this.network;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The region this gateway should sit in.
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The region this gateway should sit in.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * A list of interfaces on this VPN gateway.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="vpnInterfaces", type=List.class, parameters={HaVpnGatewayVpnInterface.class})
    private Output<List<HaVpnGatewayVpnInterface>> vpnInterfaces;

    /**
     * @return A list of interfaces on this VPN gateway.
     * Structure is documented below.
     * 
     */
    public Output<List<HaVpnGatewayVpnInterface>> getVpnInterfaces() {
        return this.vpnInterfaces;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HaVpnGateway(String name, HaVpnGatewayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/haVpnGateway:HaVpnGateway", name, args == null ? HaVpnGatewayArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private HaVpnGateway(String name, Input<String> id, @Nullable HaVpnGatewayState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/haVpnGateway:HaVpnGateway", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static HaVpnGateway get(String name, Input<String> id, @Nullable HaVpnGatewayState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HaVpnGateway(name, id, state, options);
    }
}
