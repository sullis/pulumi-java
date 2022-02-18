// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logic.IntegrationServiceEnvironmentArgs;
import io.pulumi.azurenative.logic.outputs.IntegrationServiceEnvironmentPropertiesResponse;
import io.pulumi.azurenative.logic.outputs.IntegrationServiceEnvironmentSkuResponse;
import io.pulumi.azurenative.logic.outputs.ManagedServiceIdentityResponse;
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
 * The integration service environment.
 * API Version: 2019-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:logic:IntegrationServiceEnvironment testIntegrationServiceEnvironment /subscriptions/f34b22a3-2202-4fb1-b040-1332bd928c84/resourceGroups/testResourceGroup/providers/Microsoft.Logic/integrationServiceEnvironments/testIntegrationServiceEnvironment 
 * ```
 * 
 */
@ResourceType(type="azure-native:logic:IntegrationServiceEnvironment")
public class IntegrationServiceEnvironment extends io.pulumi.resources.CustomResource {
    /**
     * Managed service identity properties.
     * 
     */
    @OutputExport(name="identity", type=ManagedServiceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ManagedServiceIdentityResponse> identity;

    /**
     * @return Managed service identity properties.
     * 
     */
    public Output</* @Nullable */ ManagedServiceIdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * The resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Gets the resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Gets the resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The integration service environment properties.
     * 
     */
    @OutputExport(name="properties", type=IntegrationServiceEnvironmentPropertiesResponse.class, parameters={})
    private Output<IntegrationServiceEnvironmentPropertiesResponse> properties;

    /**
     * @return The integration service environment properties.
     * 
     */
    public Output<IntegrationServiceEnvironmentPropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * The sku.
     * 
     */
    @OutputExport(name="sku", type=IntegrationServiceEnvironmentSkuResponse.class, parameters={})
    private Output</* @Nullable */ IntegrationServiceEnvironmentSkuResponse> sku;

    /**
     * @return The sku.
     * 
     */
    public Output</* @Nullable */ IntegrationServiceEnvironmentSkuResponse> getSku() {
        return this.sku;
    }
    /**
     * The resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Gets the resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Gets the resource type.
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
    public IntegrationServiceEnvironment(String name, IntegrationServiceEnvironmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:IntegrationServiceEnvironment", name, args == null ? IntegrationServiceEnvironmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IntegrationServiceEnvironment(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:IntegrationServiceEnvironment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:logic/v20190501:IntegrationServiceEnvironment").build())
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
    public static IntegrationServiceEnvironment get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationServiceEnvironment(name, id, options);
    }
}
