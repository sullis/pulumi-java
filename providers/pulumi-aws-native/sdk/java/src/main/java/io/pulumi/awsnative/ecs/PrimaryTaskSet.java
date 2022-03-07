// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ecs.PrimaryTaskSetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A pseudo-resource that manages which of your ECS task sets is primary.
 * 
 */
@ResourceType(type="aws-native:ecs:PrimaryTaskSet")
public class PrimaryTaskSet extends io.pulumi.resources.CustomResource {
    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to create the task set in.
     * 
     */
    @OutputExport(name="cluster", type=String.class, parameters={})
    private Output<String> cluster;

    /**
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to create the task set in.
     * 
     */
    public Output<String> getCluster() {
        return this.cluster;
    }
    /**
     * The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
     * 
     */
    @OutputExport(name="service", type=String.class, parameters={})
    private Output<String> service;

    /**
     * @return The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
     * 
     */
    public Output<String> getService() {
        return this.service;
    }
    /**
     * The ID or full Amazon Resource Name (ARN) of the task set.
     * 
     */
    @OutputExport(name="taskSetId", type=String.class, parameters={})
    private Output<String> taskSetId;

    /**
     * @return The ID or full Amazon Resource Name (ARN) of the task set.
     * 
     */
    public Output<String> getTaskSetId() {
        return this.taskSetId;
    }

    public interface BuilderApplicator {
        public void apply(PrimaryTaskSetArgs.Builder a);
    }
    private static io.pulumi.awsnative.ecs.PrimaryTaskSetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.ecs.PrimaryTaskSetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public PrimaryTaskSet(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrimaryTaskSet(String name) {
        this(name, PrimaryTaskSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrimaryTaskSet(String name, PrimaryTaskSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrimaryTaskSet(String name, PrimaryTaskSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ecs:PrimaryTaskSet", name, args == null ? PrimaryTaskSetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PrimaryTaskSet(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ecs:PrimaryTaskSet", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PrimaryTaskSet get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrimaryTaskSet(name, id, options);
    }
}