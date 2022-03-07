// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.bigtableadmin_v2.InstanceArgs;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Create an instance within a project. Note that exactly one of Cluster.serve_nodes and Cluster.cluster_config.cluster_autoscaling_config can be set. If serve_nodes is set to non-zero, then the cluster is manually scaled. If cluster_config.cluster_autoscaling_config is non-empty, then autoscaling is enabled.
 * 
 */
@ResourceType(type="google-native:bigtableadmin/v2:Instance")
public class Instance extends io.pulumi.resources.CustomResource {
    /**
     * A server-assigned timestamp representing when this Instance was created. For instances created before this field was added (August 2021), this value is `seconds: 0, nanos: 1`.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return A server-assigned timestamp representing when this Instance was created. For instances created before this field was added (August 2021), this value is `seconds: 0, nanos: 1`.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The descriptive name for this instance as it appears in UIs. Can be changed at any time, but should be kept globally unique to avoid confusion.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The descriptive name for this instance as it appears in UIs. Can be changed at any time, but should be kept globally unique to avoid confusion.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Labels are a flexible and lightweight mechanism for organizing cloud resources into groups that reflect a customer's organizational needs and deployment strategies. They can be used to filter resources and aggregate metrics. * Label keys must be between 1 and 63 characters long and must conform to the regular expression: `\p{Ll}\p{Lo}{0,62}`. * Label values must be between 0 and 63 characters long and must conform to the regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}`. * No more than 64 labels can be associated with a given resource. * Keys and values must both be under 128 bytes.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels are a flexible and lightweight mechanism for organizing cloud resources into groups that reflect a customer's organizational needs and deployment strategies. They can be used to filter resources and aggregate metrics. * Label keys must be between 1 and 63 characters long and must conform to the regular expression: `\p{Ll}\p{Lo}{0,62}`. * Label values must be between 0 and 63 characters long and must conform to the regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}`. * No more than 64 labels can be associated with a given resource. * Keys and values must both be under 128 bytes.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The unique name of the instance. Values are of the form `projects/{project}/instances/a-z+[a-z0-9]`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique name of the instance. Values are of the form `projects/{project}/instances/a-z+[a-z0-9]`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The current state of the instance.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the instance.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The type of the instance. Defaults to `PRODUCTION`.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the instance. Defaults to `PRODUCTION`.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(InstanceArgs.Builder a);
    }
    private static io.pulumi.googlenative.bigtableadmin_v2.InstanceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.bigtableadmin_v2.InstanceArgs.builder();
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
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigtableadmin/v2:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Instance(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigtableadmin/v2:Instance", name, null, makeResourceOptions(options, id));
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
    public static Instance get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, options);
    }
}