// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.memorydb;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.memorydb.SnapshotArgs;
import io.pulumi.aws.memorydb.inputs.SnapshotState;
import io.pulumi.aws.memorydb.outputs.SnapshotClusterConfiguration;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a MemoryDB Snapshot.
 * 
 * More information about snapshot and restore can be found in the [MemoryDB User Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/snapshots.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Use the `name` to import a snapshot. For example
 * 
 * ```sh
 *  $ pulumi import aws:memorydb/snapshot:Snapshot example my-snapshot
 * ```
 * 
 */
@ResourceType(type="aws:memorydb/snapshot:Snapshot")
public class Snapshot extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the snapshot.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the snapshot.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The configuration of the cluster from which the snapshot was taken.
     * 
     */
    @Export(name="clusterConfigurations", type=List.class, parameters={SnapshotClusterConfiguration.class})
    private Output<List<SnapshotClusterConfiguration>> clusterConfigurations;

    /**
     * @return The configuration of the cluster from which the snapshot was taken.
     * 
     */
    public Output<List<SnapshotClusterConfiguration>> clusterConfigurations() {
        return this.clusterConfigurations;
    }
    /**
     * Name of the MemoryDB cluster to take a snapshot of.
     * 
     */
    @Export(name="clusterName", type=String.class, parameters={})
    private Output<String> clusterName;

    /**
     * @return Name of the MemoryDB cluster to take a snapshot of.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }
    /**
     * ARN of the KMS key used to encrypt the snapshot at rest.
     * 
     */
    @Export(name="kmsKeyArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyArn;

    /**
     * @return ARN of the KMS key used to encrypt the snapshot at rest.
     * 
     */
    public Output</* @Nullable */ String> kmsKeyArn() {
        return this.kmsKeyArn;
    }
    /**
     * Name of the cluster.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the cluster.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Output<String> namePrefix() {
        return this.namePrefix;
    }
    /**
     * Indicates whether the snapshot is from an automatic backup (`automated`) or was created manually (`manual`).
     * 
     */
    @Export(name="source", type=String.class, parameters={})
    private Output<String> source;

    /**
     * @return Indicates whether the snapshot is from an automatic backup (`automated`) or was created manually (`manual`).
     * 
     */
    public Output<String> source() {
        return this.source;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Snapshot(String name) {
        this(name, SnapshotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Snapshot(String name, SnapshotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Snapshot(String name, SnapshotArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:memorydb/snapshot:Snapshot", name, args == null ? SnapshotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Snapshot(String name, Output<String> id, @Nullable SnapshotState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:memorydb/snapshot:Snapshot", name, state, makeResourceOptions(options, id));
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
    public static Snapshot get(String name, Output<String> id, @Nullable SnapshotState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Snapshot(name, id, state, options);
    }
}
