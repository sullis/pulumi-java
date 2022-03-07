// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.operationalinsights.QueryPackArgs;
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
 * An Log Analytics QueryPack definition.
 * API Version: 2019-09-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:operationalinsights:QueryPack my-querypack /subscriptions/86dc51d3-92ed-4d7e-947a-775ea79b4919/resourceGroups/my-resource-group/providers/microsoft.operationalinsights/queryPacks/my-querypack 
 * ```
 * 
 */
@ResourceType(type="azure-native:operationalinsights:QueryPack")
public class QueryPack extends io.pulumi.resources.CustomResource {
    /**
     * Resource location
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Azure resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Current state of this QueryPack: whether or not is has been provisioned within the resource group it is defined. Users cannot change this value but are able to read from it. Values will include Succeeded, Deploying, Canceled, and Failed.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Current state of this QueryPack: whether or not is has been provisioned within the resource group it is defined. Users cannot change this value but are able to read from it. Values will include Succeeded, Deploying, Canceled, and Failed.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The unique ID of your application. This field cannot be changed.
     * 
     */
    @OutputExport(name="queryPackId", type=String.class, parameters={})
    private Output<String> queryPackId;

    /**
     * @return The unique ID of your application. This field cannot be changed.
     * 
     */
    public Output<String> getQueryPackId() {
        return this.queryPackId;
    }
    /**
     * Resource tags
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Creation Date for the Log Analytics QueryPack, in ISO 8601 format.
     * 
     */
    @OutputExport(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return Creation Date for the Log Analytics QueryPack, in ISO 8601 format.
     * 
     */
    public Output<String> getTimeCreated() {
        return this.timeCreated;
    }
    /**
     * Last modified date of the Log Analytics QueryPack, in ISO 8601 format.
     * 
     */
    @OutputExport(name="timeModified", type=String.class, parameters={})
    private Output<String> timeModified;

    /**
     * @return Last modified date of the Log Analytics QueryPack, in ISO 8601 format.
     * 
     */
    public Output<String> getTimeModified() {
        return this.timeModified;
    }
    /**
     * Azure resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(QueryPackArgs.Builder a);
    }
    private static io.pulumi.azurenative.operationalinsights.QueryPackArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.operationalinsights.QueryPackArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public QueryPack(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public QueryPack(String name) {
        this(name, QueryPackArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public QueryPack(String name, QueryPackArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public QueryPack(String name, QueryPackArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:operationalinsights:QueryPack", name, args == null ? QueryPackArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private QueryPack(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:operationalinsights:QueryPack", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:operationalinsights/v20190901preview:QueryPack").build())
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
    public static QueryPack get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new QueryPack(name, id, options);
    }
}