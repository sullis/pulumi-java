// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.ContentTypeArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Content type contract details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:ContentType page /contentTypes/page 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:ContentType")
public class ContentType extends io.pulumi.resources.CustomResource {
    /**
     * Content type description.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Content type description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
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
     * Content type schema.
     * 
     */
    @OutputExport(name="schema", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> schema;

    /**
     * @return Content type schema.
     * 
     */
    public Output</* @Nullable */ Object> getSchema() {
        return this.schema;
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Content type version.
     * 
     */
    @OutputExport(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    /**
     * @return Content type version.
     * 
     */
    public Output</* @Nullable */ String> getVersion() {
        return this.version;
    }

    public interface BuilderApplicator {
        public void apply(ContentTypeArgs.Builder a);
    }
    private static io.pulumi.azurenative.apimanagement.ContentTypeArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.apimanagement.ContentTypeArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ContentType(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ContentType(String name) {
        this(name, ContentTypeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ContentType(String name, ContentTypeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContentType(String name, ContentTypeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ContentType", name, args == null ? ContentTypeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ContentType(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ContentType", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201:ContentType").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20200601preview:ContentType").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20201201:ContentType").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210101preview:ContentType").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210401preview:ContentType").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210801:ContentType").build())
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
    public static ContentType get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ContentType(name, id, options);
    }
}