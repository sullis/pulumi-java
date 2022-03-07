// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.TrafficMirrorTargetArgs;
import io.pulumi.aws.ec2.inputs.TrafficMirrorTargetState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Traffic mirror target.\
 * Read [limits and considerations](https://docs.aws.amazon.com/vpc/latest/mirroring/traffic-mirroring-considerations.html) for traffic mirroring
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Traffic mirror targets can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/trafficMirrorTarget:TrafficMirrorTarget target tmt-0c13a005422b86606
 * ```
 * 
 */
@ResourceType(type="aws:ec2/trafficMirrorTarget:TrafficMirrorTarget")
public class TrafficMirrorTarget extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the traffic mirror target.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the traffic mirror target.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A description of the traffic mirror session.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the traffic mirror session.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The network interface ID that is associated with the target.
     * 
     */
    @OutputExport(name="networkInterfaceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> networkInterfaceId;

    /**
     * @return The network interface ID that is associated with the target.
     * 
     */
    public Output</* @Nullable */ String> getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
     * 
     */
    @OutputExport(name="networkLoadBalancerArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> networkLoadBalancerArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
     * 
     */
    public Output</* @Nullable */ String> getNetworkLoadBalancerArn() {
        return this.networkLoadBalancerArn;
    }
    /**
     * The ID of the AWS account that owns the traffic mirror target.
     * 
     */
    @OutputExport(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return The ID of the AWS account that owns the traffic mirror target.
     * 
     */
    public Output<String> getOwnerId() {
        return this.ownerId;
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable TrafficMirrorTargetArgs.Builder a);
    }
    private static io.pulumi.aws.ec2.TrafficMirrorTargetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ec2.TrafficMirrorTargetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public TrafficMirrorTarget(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TrafficMirrorTarget(String name) {
        this(name, TrafficMirrorTargetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TrafficMirrorTarget(String name, @Nullable TrafficMirrorTargetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TrafficMirrorTarget(String name, @Nullable TrafficMirrorTargetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/trafficMirrorTarget:TrafficMirrorTarget", name, args == null ? TrafficMirrorTargetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TrafficMirrorTarget(String name, Input<String> id, @Nullable TrafficMirrorTargetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/trafficMirrorTarget:TrafficMirrorTarget", name, state, makeResourceOptions(options, id));
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
    public static TrafficMirrorTarget get(String name, Input<String> id, @Nullable TrafficMirrorTargetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TrafficMirrorTarget(name, id, state, options);
    }
}