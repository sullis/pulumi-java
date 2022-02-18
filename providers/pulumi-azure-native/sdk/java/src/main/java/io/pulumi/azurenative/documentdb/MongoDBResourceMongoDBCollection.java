// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.documentdb.MongoDBResourceMongoDBCollectionArgs;
import io.pulumi.azurenative.documentdb.outputs.MongoDBCollectionGetPropertiesResponseOptions;
import io.pulumi.azurenative.documentdb.outputs.MongoDBCollectionGetPropertiesResponseResource;
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
 * An Azure Cosmos DB MongoDB collection.
 * API Version: 2021-03-15.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:documentdb:MongoDBResourceMongoDBCollection collectionName /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.DocumentDB/databaseAccounts/ddb1/mongodbDatabases/databaseName/mongodbCollections/collectionName 
 * ```
 * 
 */
@ResourceType(type="azure-native:documentdb:MongoDBResourceMongoDBCollection")
public class MongoDBResourceMongoDBCollection extends io.pulumi.resources.CustomResource {
    /**
     * The location of the resource group to which the resource belongs.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the resource group to which the resource belongs.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The name of the ARM resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the ARM resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="options", type=MongoDBCollectionGetPropertiesResponseOptions.class, parameters={})
    private Output</* @Nullable */ MongoDBCollectionGetPropertiesResponseOptions> options;

    public Output</* @Nullable */ MongoDBCollectionGetPropertiesResponseOptions> getOptions() {
        return this.options;
    }
    @OutputExport(name="resource", type=MongoDBCollectionGetPropertiesResponseResource.class, parameters={})
    private Output</* @Nullable */ MongoDBCollectionGetPropertiesResponseResource> resource;

    public Output</* @Nullable */ MongoDBCollectionGetPropertiesResponseResource> getResource() {
        return this.resource;
    }
    /**
     * Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with "defaultExperience": "Cassandra". Current "defaultExperience" values also include "Table", "Graph", "DocumentDB", and "MongoDB".
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with "defaultExperience": "Cassandra". Current "defaultExperience" values also include "Table", "Graph", "DocumentDB", and "MongoDB".
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of Azure resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of Azure resource.
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
    public MongoDBResourceMongoDBCollection(String name, MongoDBResourceMongoDBCollectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:MongoDBResourceMongoDBCollection", name, args == null ? MongoDBResourceMongoDBCollectionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private MongoDBResourceMongoDBCollection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:MongoDBResourceMongoDBCollection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:documentdb/v20150401:MongoDBResourceMongoDBCollection").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20150408:MongoDBResourceMongoDBCollection").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20151106:MongoDBResourceMongoDBCollection").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20160319:MongoDBResourceMongoDBCollection").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20160331:MongoDBResourceMongoDBCollection").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20190801:MongoDBResourceMongoDBCollection").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20191212:MongoDBResourceMongoDBCollection").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200301:MongoDBResourceMongoDBCollection").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200401:MongoDBResourceMongoDBCollection").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200601preview:MongoDBResourceMongoDBCollection").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200901:MongoDBResourceMongoDBCollection").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210115:MongoDBResourceMongoDBCollection").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210301preview:MongoDBResourceMongoDBCollection").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210315:MongoDBResourceMongoDBCollection").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210401preview:MongoDBResourceMongoDBCollection").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210415:MongoDBResourceMongoDBCollection").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210515:MongoDBResourceMongoDBCollection").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210615:MongoDBResourceMongoDBCollection").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210701preview:MongoDBResourceMongoDBCollection").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20211015:MongoDBResourceMongoDBCollection").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20211015preview:MongoDBResourceMongoDBCollection").build())
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
    public static MongoDBResourceMongoDBCollection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MongoDBResourceMongoDBCollection(name, id, options);
    }
}
