// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.migrate.MoveCollectionArgs;
import io.pulumi.azurenative.migrate.outputs.IdentityResponse;
import io.pulumi.azurenative.migrate.outputs.MoveCollectionPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Define the move collection.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:migrate:MoveCollection movecollection1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Migrate/MoveCollections/movecollection1 
 * ```
 * 
 */
@ResourceType(type="azure-native:migrate:MoveCollection")
public class MoveCollection extends io.pulumi.resources.CustomResource {
    /**
     * The etag of the resource.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return The etag of the resource.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Defines the MSI properties of the Move Collection.
     * 
     */
    @OutputExport(name="identity", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> identity;

    /**
     * @return Defines the MSI properties of the Move Collection.
     * 
     */
    public Output</* @Nullable */ IdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * The geo-location where the resource lives.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The geo-location where the resource lives.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Defines the move collection properties.
     * 
     */
    @OutputExport(name="properties", type=MoveCollectionPropertiesResponse.class, parameters={})
    private Output<MoveCollectionPropertiesResponse> properties;

    /**
     * @return Defines the move collection properties.
     * 
     */
    public Output<MoveCollectionPropertiesResponse> getProperties() {
        return this.properties;
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
     * The type of the resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MoveCollection(String name, MoveCollectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:migrate:MoveCollection", name, args == null ? MoveCollectionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private MoveCollection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:migrate:MoveCollection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:migrate/v20191001preview:MoveCollection").build()),
                Input.of(Alias.builder().setType("azure-native:migrate/v20210101:MoveCollection").build()),
                Input.of(Alias.builder().setType("azure-native:migrate/v20210801:MoveCollection").build())
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
    public static MoveCollection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MoveCollection(name, id, options);
    }
}
