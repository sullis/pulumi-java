// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.LocalGatewayRouteArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Describes a route for a local gateway route table.
 * 
 */
@ResourceType(type="aws-native:ec2:LocalGatewayRoute")
public class LocalGatewayRoute extends io.pulumi.resources.CustomResource {
    /**
     * The CIDR block used for destination matches.
     * 
     */
    @Export(name="destinationCidrBlock", type=String.class, parameters={})
    private Output<String> destinationCidrBlock;

    /**
     * @return The CIDR block used for destination matches.
     * 
     */
    public Output<String> destinationCidrBlock() {
        return this.destinationCidrBlock;
    }
    /**
     * The ID of the local gateway route table.
     * 
     */
    @Export(name="localGatewayRouteTableId", type=String.class, parameters={})
    private Output<String> localGatewayRouteTableId;

    /**
     * @return The ID of the local gateway route table.
     * 
     */
    public Output<String> localGatewayRouteTableId() {
        return this.localGatewayRouteTableId;
    }
    /**
     * The ID of the virtual interface group.
     * 
     */
    @Export(name="localGatewayVirtualInterfaceGroupId", type=String.class, parameters={})
    private Output<String> localGatewayVirtualInterfaceGroupId;

    /**
     * @return The ID of the virtual interface group.
     * 
     */
    public Output<String> localGatewayVirtualInterfaceGroupId() {
        return this.localGatewayVirtualInterfaceGroupId;
    }
    /**
     * The state of the route.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the route.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The route type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The route type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LocalGatewayRoute(String name) {
        this(name, LocalGatewayRouteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LocalGatewayRoute(String name, LocalGatewayRouteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LocalGatewayRoute(String name, LocalGatewayRouteArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:LocalGatewayRoute", name, args == null ? LocalGatewayRouteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LocalGatewayRoute(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:LocalGatewayRoute", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static LocalGatewayRoute get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LocalGatewayRoute(name, id, options);
    }
}
