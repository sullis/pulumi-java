// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.InternetGatewayArgs;
import io.pulumi.aws.ec2.inputs.InternetGatewayState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to create a VPC Internet Gateway.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Internet Gateways can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/internetGateway:InternetGateway gw igw-c0a643a9
 * ```
 * 
 */
@ResourceType(type="aws:ec2/internetGateway:InternetGateway")
public class InternetGateway extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the Internet Gateway.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the Internet Gateway.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The ID of the AWS account that owns the internet gateway.
     * 
     */
    @Export(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return The ID of the AWS account that owns the internet gateway.
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The VPC ID to create in.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpcId;

    /**
     * @return The VPC ID to create in.
     * 
     */
    public Output</* @Nullable */ String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InternetGateway(String name) {
        this(name, InternetGatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InternetGateway(String name, @Nullable InternetGatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InternetGateway(String name, @Nullable InternetGatewayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/internetGateway:InternetGateway", name, args == null ? InternetGatewayArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InternetGateway(String name, Output<String> id, @Nullable InternetGatewayState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/internetGateway:InternetGateway", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static InternetGateway get(String name, Output<String> id, @Nullable InternetGatewayState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new InternetGateway(name, id, state, options);
    }
}
