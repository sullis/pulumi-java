// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maps;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.maps.AccountArgs;
import io.pulumi.azurenative.maps.outputs.MapsAccountPropertiesResponse;
import io.pulumi.azurenative.maps.outputs.SkuResponse;
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
 * An Azure resource which represents access to a suite of Maps REST APIs.
 * API Version: 2018-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:maps:Account myMapsAccount /subscriptions/21a9967a-e8a9-4656-a70b-96ff1c4d05a0/resourceGroups/myResourceGroup/providers/Microsoft.Maps/accounts/myMapsAccount 
 * ```
 * 
 */
@ResourceType(type="azure-native:maps:Account")
public class Account extends io.pulumi.resources.CustomResource {
    /**
     * The location of the resource.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name of the Maps Account, which is unique within a Resource Group.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Maps Account, which is unique within a Resource Group.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The map account properties.
     * 
     */
    @OutputExport(name="properties", type=MapsAccountPropertiesResponse.class, parameters={})
    private Output<MapsAccountPropertiesResponse> properties;

    /**
     * @return The map account properties.
     * 
     */
    public Output<MapsAccountPropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * The SKU of this account.
     * 
     */
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output<SkuResponse> sku;

    /**
     * @return The SKU of this account.
     * 
     */
    public Output<SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Gets a list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tags;

    /**
     * @return Gets a list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters.
     * 
     */
    public Output<Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Azure resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type.
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
    public Account(String name, AccountArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:maps:Account", name, args == null ? AccountArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Account(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:maps:Account", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:maps/v20170101preview:Account").build()),
                Input.of(Alias.builder().setType("azure-native:maps/v20180501:Account").build()),
                Input.of(Alias.builder().setType("azure-native:maps/v20200201preview:Account").build()),
                Input.of(Alias.builder().setType("azure-native:maps/v20210201:Account").build()),
                Input.of(Alias.builder().setType("azure-native:maps/v20210701preview:Account").build()),
                Input.of(Alias.builder().setType("azure-native:maps/v20211201preview:Account").build())
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
    public static Account get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Account(name, id, options);
    }
}
