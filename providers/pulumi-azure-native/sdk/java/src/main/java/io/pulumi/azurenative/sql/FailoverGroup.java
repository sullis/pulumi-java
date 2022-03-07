// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.FailoverGroupArgs;
import io.pulumi.azurenative.sql.outputs.FailoverGroupReadOnlyEndpointResponse;
import io.pulumi.azurenative.sql.outputs.FailoverGroupReadWriteEndpointResponse;
import io.pulumi.azurenative.sql.outputs.PartnerInfoResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A failover group.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:FailoverGroup failover-group-test-3 /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default/providers/Microsoft.Sql/servers/failover-group-primary-server/failoverGroups/failover-group-test-3 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:FailoverGroup")
public class FailoverGroup extends io.pulumi.resources.CustomResource {
    /**
     * List of databases in the failover group.
     * 
     */
    @OutputExport(name="databases", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> databases;

    /**
     * @return List of databases in the failover group.
     * 
     */
    public Output</* @Nullable */ List<String>> getDatabases() {
        return this.databases;
    }
    /**
     * Resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
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
     * List of partner server information for the failover group.
     * 
     */
    @OutputExport(name="partnerServers", type=List.class, parameters={PartnerInfoResponse.class})
    private Output<List<PartnerInfoResponse>> partnerServers;

    /**
     * @return List of partner server information for the failover group.
     * 
     */
    public Output<List<PartnerInfoResponse>> getPartnerServers() {
        return this.partnerServers;
    }
    /**
     * Read-only endpoint of the failover group instance.
     * 
     */
    @OutputExport(name="readOnlyEndpoint", type=FailoverGroupReadOnlyEndpointResponse.class, parameters={})
    private Output</* @Nullable */ FailoverGroupReadOnlyEndpointResponse> readOnlyEndpoint;

    /**
     * @return Read-only endpoint of the failover group instance.
     * 
     */
    public Output</* @Nullable */ FailoverGroupReadOnlyEndpointResponse> getReadOnlyEndpoint() {
        return this.readOnlyEndpoint;
    }
    /**
     * Read-write endpoint of the failover group instance.
     * 
     */
    @OutputExport(name="readWriteEndpoint", type=FailoverGroupReadWriteEndpointResponse.class, parameters={})
    private Output<FailoverGroupReadWriteEndpointResponse> readWriteEndpoint;

    /**
     * @return Read-write endpoint of the failover group instance.
     * 
     */
    public Output<FailoverGroupReadWriteEndpointResponse> getReadWriteEndpoint() {
        return this.readWriteEndpoint;
    }
    /**
     * Local replication role of the failover group instance.
     * 
     */
    @OutputExport(name="replicationRole", type=String.class, parameters={})
    private Output<String> replicationRole;

    /**
     * @return Local replication role of the failover group instance.
     * 
     */
    public Output<String> getReplicationRole() {
        return this.replicationRole;
    }
    /**
     * Replication state of the failover group instance.
     * 
     */
    @OutputExport(name="replicationState", type=String.class, parameters={})
    private Output<String> replicationState;

    /**
     * @return Replication state of the failover group instance.
     * 
     */
    public Output<String> getReplicationState() {
        return this.replicationState;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
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
        public void apply(FailoverGroupArgs.Builder a);
    }
    private static io.pulumi.azurenative.sql.FailoverGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.sql.FailoverGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public FailoverGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FailoverGroup(String name) {
        this(name, FailoverGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FailoverGroup(String name, FailoverGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FailoverGroup(String name, FailoverGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:FailoverGroup", name, args == null ? FailoverGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FailoverGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:FailoverGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:sql/v20150501preview:FailoverGroup").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200202preview:FailoverGroup").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200801preview:FailoverGroup").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20201101preview:FailoverGroup").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210201preview:FailoverGroup").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210501preview:FailoverGroup").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210801preview:FailoverGroup").build())
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
    public static FailoverGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FailoverGroup(name, id, options);
    }
}