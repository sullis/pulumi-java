// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.networkmanager.TransitGatewayRegistrationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * The AWS::NetworkManager::TransitGatewayRegistration type registers a transit gateway in your global network. The transit gateway can be in any AWS Region, but it must be owned by the same AWS account that owns the global network. You cannot register a transit gateway in more than one global network.
 * 
 */
@ResourceType(type="aws-native:networkmanager:TransitGatewayRegistration")
public class TransitGatewayRegistration extends io.pulumi.resources.CustomResource {
    /**
     * The ID of the global network.
     * 
     */
    @Export(name="globalNetworkId", type=String.class, parameters={})
    private Output<String> globalNetworkId;

    /**
     * @return The ID of the global network.
     * 
     */
    public Output<String> globalNetworkId() {
        return this.globalNetworkId;
    }
    /**
     * The Amazon Resource Name (ARN) of the transit gateway.
     * 
     */
    @Export(name="transitGatewayArn", type=String.class, parameters={})
    private Output<String> transitGatewayArn;

    /**
     * @return The Amazon Resource Name (ARN) of the transit gateway.
     * 
     */
    public Output<String> transitGatewayArn() {
        return this.transitGatewayArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitGatewayRegistration(String name) {
        this(name, TransitGatewayRegistrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitGatewayRegistration(String name, TransitGatewayRegistrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitGatewayRegistration(String name, TransitGatewayRegistrationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkmanager:TransitGatewayRegistration", name, args == null ? TransitGatewayRegistrationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TransitGatewayRegistration(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkmanager:TransitGatewayRegistration", name, null, makeResourceOptions(options, id));
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
    public static TransitGatewayRegistration get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TransitGatewayRegistration(name, id, options);
    }
}
