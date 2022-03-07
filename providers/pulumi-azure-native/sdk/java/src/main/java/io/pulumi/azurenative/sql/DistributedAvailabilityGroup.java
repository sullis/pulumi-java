// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.DistributedAvailabilityGroupArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Distributed availability group between box and Sql Managed Instance.
 * API Version: 2021-05-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:DistributedAvailabilityGroup dag /subscriptions/f2669dff-5f08-45dd-b857-b2a60b72cdc9/resourceGroups/testrg/providers/Microsoft.Sql/managedInstances/testcl/distributedAvailabilityGroups/dag 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:DistributedAvailabilityGroup")
public class DistributedAvailabilityGroup extends io.pulumi.resources.CustomResource {
    /**
     * The distributed availability group id
     * 
     */
    @OutputExport(name="distributedAvailabilityGroupId", type=String.class, parameters={})
    private Output<String> distributedAvailabilityGroupId;

    /**
     * @return The distributed availability group id
     * 
     */
    public Output<String> getDistributedAvailabilityGroupId() {
        return this.distributedAvailabilityGroupId;
    }
    /**
     * The last hardened lsn
     * 
     */
    @OutputExport(name="lastHardenedLsn", type=String.class, parameters={})
    private Output<String> lastHardenedLsn;

    /**
     * @return The last hardened lsn
     * 
     */
    public Output<String> getLastHardenedLsn() {
        return this.lastHardenedLsn;
    }
    /**
     * The link state
     * 
     */
    @OutputExport(name="linkState", type=String.class, parameters={})
    private Output<String> linkState;

    /**
     * @return The link state
     * 
     */
    public Output<String> getLinkState() {
        return this.linkState;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The primary availability group name
     * 
     */
    @OutputExport(name="primaryAvailabilityGroupName", type=String.class, parameters={})
    private Output</* @Nullable */ String> primaryAvailabilityGroupName;

    /**
     * @return The primary availability group name
     * 
     */
    public Output</* @Nullable */ String> getPrimaryAvailabilityGroupName() {
        return this.primaryAvailabilityGroupName;
    }
    /**
     * The replication mode of a distributed availability group. Parameter will be ignored during link creation.
     * 
     */
    @OutputExport(name="replicationMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> replicationMode;

    /**
     * @return The replication mode of a distributed availability group. Parameter will be ignored during link creation.
     * 
     */
    public Output</* @Nullable */ String> getReplicationMode() {
        return this.replicationMode;
    }
    /**
     * The secondary availability group name
     * 
     */
    @OutputExport(name="secondaryAvailabilityGroupName", type=String.class, parameters={})
    private Output</* @Nullable */ String> secondaryAvailabilityGroupName;

    /**
     * @return The secondary availability group name
     * 
     */
    public Output</* @Nullable */ String> getSecondaryAvailabilityGroupName() {
        return this.secondaryAvailabilityGroupName;
    }
    /**
     * The source endpoint
     * 
     */
    @OutputExport(name="sourceEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceEndpoint;

    /**
     * @return The source endpoint
     * 
     */
    public Output</* @Nullable */ String> getSourceEndpoint() {
        return this.sourceEndpoint;
    }
    /**
     * The source replica id
     * 
     */
    @OutputExport(name="sourceReplicaId", type=String.class, parameters={})
    private Output<String> sourceReplicaId;

    /**
     * @return The source replica id
     * 
     */
    public Output<String> getSourceReplicaId() {
        return this.sourceReplicaId;
    }
    /**
     * The name of the target database
     * 
     */
    @OutputExport(name="targetDatabase", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetDatabase;

    /**
     * @return The name of the target database
     * 
     */
    public Output</* @Nullable */ String> getTargetDatabase() {
        return this.targetDatabase;
    }
    /**
     * The target replica id
     * 
     */
    @OutputExport(name="targetReplicaId", type=String.class, parameters={})
    private Output<String> targetReplicaId;

    /**
     * @return The target replica id
     * 
     */
    public Output<String> getTargetReplicaId() {
        return this.targetReplicaId;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(DistributedAvailabilityGroupArgs.Builder a);
    }
    private static io.pulumi.azurenative.sql.DistributedAvailabilityGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.sql.DistributedAvailabilityGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DistributedAvailabilityGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DistributedAvailabilityGroup(String name) {
        this(name, DistributedAvailabilityGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DistributedAvailabilityGroup(String name, DistributedAvailabilityGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DistributedAvailabilityGroup(String name, DistributedAvailabilityGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:DistributedAvailabilityGroup", name, args == null ? DistributedAvailabilityGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DistributedAvailabilityGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:DistributedAvailabilityGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:sql/v20210501preview:DistributedAvailabilityGroup").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210801preview:DistributedAvailabilityGroup").build())
            ))
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
    public static DistributedAvailabilityGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DistributedAvailabilityGroup(name, id, options);
    }
}