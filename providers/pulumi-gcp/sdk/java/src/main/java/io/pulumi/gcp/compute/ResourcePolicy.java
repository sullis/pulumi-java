// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.ResourcePolicyArgs;
import io.pulumi.gcp.compute.inputs.ResourcePolicyState;
import io.pulumi.gcp.compute.outputs.ResourcePolicyGroupPlacementPolicy;
import io.pulumi.gcp.compute.outputs.ResourcePolicyInstanceSchedulePolicy;
import io.pulumi.gcp.compute.outputs.ResourcePolicySnapshotSchedulePolicy;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A policy that can be attached to a resource to specify or schedule actions on that resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ResourcePolicy can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/resourcePolicy:ResourcePolicy default projects/{{project}}/regions/{{region}}/resourcePolicies/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/resourcePolicy:ResourcePolicy default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/resourcePolicy:ResourcePolicy default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/resourcePolicy:ResourcePolicy default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/resourcePolicy:ResourcePolicy")
public class ResourcePolicy extends io.pulumi.resources.CustomResource {
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Resource policy for instances used for placement configuration.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="groupPlacementPolicy", type=ResourcePolicyGroupPlacementPolicy.class, parameters={})
    private Output</* @Nullable */ ResourcePolicyGroupPlacementPolicy> groupPlacementPolicy;

    /**
     * @return Resource policy for instances used for placement configuration.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ ResourcePolicyGroupPlacementPolicy> getGroupPlacementPolicy() {
        return this.groupPlacementPolicy;
    }
    /**
     * Resource policy for scheduling instance operations.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="instanceSchedulePolicy", type=ResourcePolicyInstanceSchedulePolicy.class, parameters={})
    private Output</* @Nullable */ ResourcePolicyInstanceSchedulePolicy> instanceSchedulePolicy;

    /**
     * @return Resource policy for scheduling instance operations.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ ResourcePolicyInstanceSchedulePolicy> getInstanceSchedulePolicy() {
        return this.instanceSchedulePolicy;
    }
    /**
     * The name of the resource, provided by the client when initially creating
     * the resource. The resource name must be 1-63 characters long, and comply
     * with RFC1035. Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z`? which means the
     * first character must be a lowercase letter, and all following characters
     * must be a dash, lowercase letter, or digit, except the last character,
     * which cannot be a dash.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource, provided by the client when initially creating
     * the resource. The resource name must be 1-63 characters long, and comply
     * with RFC1035. Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z`? which means the
     * first character must be a lowercase letter, and all following characters
     * must be a dash, lowercase letter, or digit, except the last character,
     * which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
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
     * Region where resource policy resides.
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return Region where resource policy resides.
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
     * Policy for creating snapshots of persistent disks.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="snapshotSchedulePolicy", type=ResourcePolicySnapshotSchedulePolicy.class, parameters={})
    private Output</* @Nullable */ ResourcePolicySnapshotSchedulePolicy> snapshotSchedulePolicy;

    /**
     * @return Policy for creating snapshots of persistent disks.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ ResourcePolicySnapshotSchedulePolicy> getSnapshotSchedulePolicy() {
        return this.snapshotSchedulePolicy;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ResourcePolicyArgs.Builder a);
    }
    private static io.pulumi.gcp.compute.ResourcePolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.compute.ResourcePolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ResourcePolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourcePolicy(String name) {
        this(name, ResourcePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourcePolicy(String name, @Nullable ResourcePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourcePolicy(String name, @Nullable ResourcePolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/resourcePolicy:ResourcePolicy", name, args == null ? ResourcePolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResourcePolicy(String name, Input<String> id, @Nullable ResourcePolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/resourcePolicy:ResourcePolicy", name, state, makeResourceOptions(options, id));
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
    public static ResourcePolicy get(String name, Input<String> id, @Nullable ResourcePolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResourcePolicy(name, id, state, options);
    }
}