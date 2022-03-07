// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.JobTargetGroupArgs;
import io.pulumi.azurenative.sql.outputs.JobTargetResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A group of job targets.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:JobTargetGroup targetGroup1 /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/group1/providers/Microsoft.Sql/servers/server1/jobAgents/agent1/targetGroups/targetGroup1 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:JobTargetGroup")
public class JobTargetGroup extends io.pulumi.resources.CustomResource {
    /**
     * Members of the target group.
     * 
     */
    @OutputExport(name="members", type=List.class, parameters={JobTargetResponse.class})
    private Output<List<JobTargetResponse>> members;

    /**
     * @return Members of the target group.
     * 
     */
    public Output<List<JobTargetResponse>> getMembers() {
        return this.members;
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
        public void apply(JobTargetGroupArgs.Builder a);
    }
    private static io.pulumi.azurenative.sql.JobTargetGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.sql.JobTargetGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public JobTargetGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public JobTargetGroup(String name) {
        this(name, JobTargetGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public JobTargetGroup(String name, JobTargetGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public JobTargetGroup(String name, JobTargetGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:JobTargetGroup", name, args == null ? JobTargetGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private JobTargetGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:JobTargetGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:sql/v20170301preview:JobTargetGroup").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200202preview:JobTargetGroup").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200801preview:JobTargetGroup").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20201101preview:JobTargetGroup").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210201preview:JobTargetGroup").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210501preview:JobTargetGroup").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210801preview:JobTargetGroup").build())
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
    public static JobTargetGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new JobTargetGroup(name, id, options);
    }
}