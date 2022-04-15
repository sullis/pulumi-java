// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.logs;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.logs.QueryDefinitionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The resource schema for AWSLogs QueryDefinition
 * 
 */
@ResourceType(type="aws-native:logs:QueryDefinition")
public class QueryDefinition extends io.pulumi.resources.CustomResource {
    /**
     * Optionally define specific log groups as part of your query definition
     * 
     */
    @Export(name="logGroupNames", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> logGroupNames;

    /**
     * @return Optionally define specific log groups as part of your query definition
     * 
     */
    public Output</* @Nullable */ List<String>> logGroupNames() {
        return this.logGroupNames;
    }
    /**
     * A name for the saved query definition
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A name for the saved query definition
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Unique identifier of a query definition
     * 
     */
    @Export(name="queryDefinitionId", type=String.class, parameters={})
    private Output<String> queryDefinitionId;

    /**
     * @return Unique identifier of a query definition
     * 
     */
    public Output<String> queryDefinitionId() {
        return this.queryDefinitionId;
    }
    /**
     * The query string to use for this definition
     * 
     */
    @Export(name="queryString", type=String.class, parameters={})
    private Output<String> queryString;

    /**
     * @return The query string to use for this definition
     * 
     */
    public Output<String> queryString() {
        return this.queryString;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public QueryDefinition(String name) {
        this(name, QueryDefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public QueryDefinition(String name, QueryDefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public QueryDefinition(String name, QueryDefinitionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:logs:QueryDefinition", name, args == null ? QueryDefinitionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private QueryDefinition(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:logs:QueryDefinition", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static QueryDefinition get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new QueryDefinition(name, id, options);
    }
}
