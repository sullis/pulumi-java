// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigtable;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.bigtable.InstanceArgs;
import io.pulumi.gcp.bigtable.inputs.InstanceState;
import io.pulumi.gcp.bigtable.outputs.InstanceCluster;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a Google Bigtable instance. For more information see:
 * 
 * * [API documentation](https://cloud.google.com/bigtable/docs/reference/admin/rest/v2/projects.instances.clusters)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/bigtable/docs)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Bigtable Instances can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:bigtable/instance:Instance default projects/{{project}}/instances/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigtable/instance:Instance default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigtable/instance:Instance default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:bigtable/instance:Instance")
public class Instance extends io.pulumi.resources.CustomResource {
    /**
     * A block of cluster configuration options. This can be specified at least once, and up to 4 times.
     * See structure below.
     * 
     */
    @OutputExport(name="clusters", type=List.class, parameters={InstanceCluster.class})
    private Output<List<InstanceCluster>> clusters;

    /**
     * @return A block of cluster configuration options. This can be specified at least once, and up to 4 times.
     * See structure below.
     * 
     */
    public Output<List<InstanceCluster>> getClusters() {
        return this.clusters;
    }
    /**
     * Whether or not to allow this provider to destroy the instance. Unless this field is set to false
     * in the statefile, a `pulumi destroy` or `pulumi up` that would delete the instance will fail.
     * 
     */
    @OutputExport(name="deletionProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deletionProtection;

    /**
     * @return Whether or not to allow this provider to destroy the instance. Unless this field is set to false
     * in the statefile, a `pulumi destroy` or `pulumi up` that would delete the instance will fail.
     * 
     */
    public Output</* @Nullable */ Boolean> getDeletionProtection() {
        return this.deletionProtection;
    }
    /**
     * The human-readable display name of the Bigtable instance. Defaults to the instance `name`.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human-readable display name of the Bigtable instance. Defaults to the instance `name`.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The instance type to create. One of `"DEVELOPMENT"` or `"PRODUCTION"`. Defaults to `"PRODUCTION"`.
     * It is recommended to leave this field unspecified since the distinction between `"DEVELOPMENT"` and `"PRODUCTION"` instances is going away,
     * and all instances will become `"PRODUCTION"` instances. This means that new and existing `"DEVELOPMENT"` instances will be converted to
     * `"PRODUCTION"` instances. It is recommended for users to use `"PRODUCTION"` instances in any case, since a 1-node `"PRODUCTION"` instance
     * is functionally identical to a `"DEVELOPMENT"` instance, but without the accompanying restrictions.
     * 
     * @Deprecated
     * It is recommended to leave this field unspecified since the distinction between "DEVELOPMENT" and "PRODUCTION" instances is going away, and all instances will become "PRODUCTION" instances. This means that new and existing "DEVELOPMENT" instances will be converted to "PRODUCTION" instances. It is recommended for users to use "PRODUCTION" instances in any case, since a 1-node "PRODUCTION" instance is functionally identical to a "DEVELOPMENT" instance, but without the accompanying restrictions.
     * 
     */
    @Deprecated /* It is recommended to leave this field unspecified since the distinction between ""DEVELOPMENT"" and ""PRODUCTION"" instances is going away, and all instances will become ""PRODUCTION"" instances. This means that new and existing ""DEVELOPMENT"" instances will be converted to ""PRODUCTION"" instances. It is recommended for users to use ""PRODUCTION"" instances in any case, since a 1-node ""PRODUCTION"" instance is functionally identical to a ""DEVELOPMENT"" instance, but without the accompanying restrictions. */
    @OutputExport(name="instanceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> instanceType;

    /**
     * @return The instance type to create. One of `"DEVELOPMENT"` or `"PRODUCTION"`. Defaults to `"PRODUCTION"`.
     * It is recommended to leave this field unspecified since the distinction between `"DEVELOPMENT"` and `"PRODUCTION"` instances is going away,
     * and all instances will become `"PRODUCTION"` instances. This means that new and existing `"DEVELOPMENT"` instances will be converted to
     * `"PRODUCTION"` instances. It is recommended for users to use `"PRODUCTION"` instances in any case, since a 1-node `"PRODUCTION"` instance
     * is functionally identical to a `"DEVELOPMENT"` instance, but without the accompanying restrictions.
     * 
     */
    public Output</* @Nullable */ String> getInstanceType() {
        return this.instanceType;
    }
    /**
     * A set of key/value label pairs to assign to the resource. Label keys must follow the requirements at https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return A set of key/value label pairs to assign to the resource. Label keys must follow the requirements at https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The name (also called Instance Id in the Cloud Console) of the Cloud Bigtable instance.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name (also called Instance Id in the Cloud Console) of the Cloud Bigtable instance.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable InstanceArgs.Builder a);
    }
    private static io.pulumi.gcp.bigtable.InstanceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.bigtable.InstanceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Instance(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, @Nullable InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, @Nullable InstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigtable/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Instance(String name, Input<String> id, @Nullable InstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigtable/instance:Instance", name, state, makeResourceOptions(options, id));
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
    public static Instance get(String name, Input<String> id, @Nullable InstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}