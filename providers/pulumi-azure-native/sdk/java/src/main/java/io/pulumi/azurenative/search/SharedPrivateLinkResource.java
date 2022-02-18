// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.search.SharedPrivateLinkResourceArgs;
import io.pulumi.azurenative.search.outputs.SharedPrivateLinkResourcePropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Describes a Shared Private Link Resource managed by the Azure Cognitive Search service.
 * API Version: 2020-08-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:search:SharedPrivateLinkResource testResource /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Search/searchServices/mysearchservice/sharedPrivateLinkResources/testResource 
 * ```
 * 
 */
@ResourceType(type="azure-native:search:SharedPrivateLinkResource")
public class SharedPrivateLinkResource extends io.pulumi.resources.CustomResource {
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
     * Describes the properties of a Shared Private Link Resource managed by the Azure Cognitive Search service.
     * 
     */
    @OutputExport(name="properties", type=SharedPrivateLinkResourcePropertiesResponse.class, parameters={})
    private Output<SharedPrivateLinkResourcePropertiesResponse> properties;

    /**
     * @return Describes the properties of a Shared Private Link Resource managed by the Azure Cognitive Search service.
     * 
     */
    public Output<SharedPrivateLinkResourcePropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
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
    public SharedPrivateLinkResource(String name, SharedPrivateLinkResourceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:search:SharedPrivateLinkResource", name, args == null ? SharedPrivateLinkResourceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SharedPrivateLinkResource(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:search:SharedPrivateLinkResource", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:search/v20200801:SharedPrivateLinkResource").build()),
                Input.of(Alias.builder().setType("azure-native:search/v20200801preview:SharedPrivateLinkResource").build()),
                Input.of(Alias.builder().setType("azure-native:search/v20210401preview:SharedPrivateLinkResource").build())
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
    public static SharedPrivateLinkResource get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SharedPrivateLinkResource(name, id, options);
    }
}
