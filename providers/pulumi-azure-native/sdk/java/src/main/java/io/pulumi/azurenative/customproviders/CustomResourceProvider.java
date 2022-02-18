// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customproviders;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.customproviders.CustomResourceProviderArgs;
import io.pulumi.azurenative.customproviders.outputs.CustomRPActionRouteDefinitionResponse;
import io.pulumi.azurenative.customproviders.outputs.CustomRPResourceTypeRouteDefinitionResponse;
import io.pulumi.azurenative.customproviders.outputs.CustomRPValidationsResponse;
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
 * A manifest file that defines the custom resource provider resources.
 * API Version: 2018-09-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:customproviders:CustomResourceProvider newrp /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testRG/providers/Microsoft.CustomProviders/resourceProviders/newrp 
 * ```
 * 
 */
@ResourceType(type="azure-native:customproviders:CustomResourceProvider")
public class CustomResourceProvider extends io.pulumi.resources.CustomResource {
    /**
     * A list of actions that the custom resource provider implements.
     * 
     */
    @OutputExport(name="actions", type=List.class, parameters={CustomRPActionRouteDefinitionResponse.class})
    private Output</* @Nullable */ List<CustomRPActionRouteDefinitionResponse>> actions;

    /**
     * @return A list of actions that the custom resource provider implements.
     * 
     */
    public Output</* @Nullable */ List<CustomRPActionRouteDefinitionResponse>> getActions() {
        return this.actions;
    }
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
     * Resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The provisioning state of the resource provider.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the resource provider.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * A list of resource types that the custom resource provider implements.
     * 
     */
    @OutputExport(name="resourceTypes", type=List.class, parameters={CustomRPResourceTypeRouteDefinitionResponse.class})
    private Output</* @Nullable */ List<CustomRPResourceTypeRouteDefinitionResponse>> resourceTypes;

    /**
     * @return A list of resource types that the custom resource provider implements.
     * 
     */
    public Output</* @Nullable */ List<CustomRPResourceTypeRouteDefinitionResponse>> getResourceTypes() {
        return this.resourceTypes;
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
     * Resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * A list of validations to run on the custom resource provider's requests.
     * 
     */
    @OutputExport(name="validations", type=List.class, parameters={CustomRPValidationsResponse.class})
    private Output</* @Nullable */ List<CustomRPValidationsResponse>> validations;

    /**
     * @return A list of validations to run on the custom resource provider's requests.
     * 
     */
    public Output</* @Nullable */ List<CustomRPValidationsResponse>> getValidations() {
        return this.validations;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomResourceProvider(String name, CustomResourceProviderArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:customproviders:CustomResourceProvider", name, args == null ? CustomResourceProviderArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CustomResourceProvider(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:customproviders:CustomResourceProvider", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:customproviders/v20180901preview:CustomResourceProvider").build())
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
    public static CustomResourceProvider get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CustomResourceProvider(name, id, options);
    }
}
