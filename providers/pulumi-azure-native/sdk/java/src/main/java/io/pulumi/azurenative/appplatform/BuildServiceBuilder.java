// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.appplatform.BuildServiceBuilderArgs;
import io.pulumi.azurenative.appplatform.outputs.BuilderPropertiesResponse;
import io.pulumi.azurenative.appplatform.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * KPack Builder resource
 * API Version: 2022-01-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:appplatform:BuildServiceBuilder mybuilder /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.AppPlatform/Spring/myservice/buildServices/default/builders/mybuilder 
 * ```
 * 
 */
@ResourceType(type="azure-native:appplatform:BuildServiceBuilder")
public class BuildServiceBuilder extends io.pulumi.resources.CustomResource {
    /**
     * The name of the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Property of the Builder resource.
     * 
     */
    @OutputExport(name="properties", type=BuilderPropertiesResponse.class, parameters={})
    private Output<BuilderPropertiesResponse> properties;

    /**
     * @return Property of the Builder resource.
     * 
     */
    public Output<BuilderPropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
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
    public BuildServiceBuilder(String name, BuildServiceBuilderArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:appplatform:BuildServiceBuilder", name, args == null ? BuildServiceBuilderArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BuildServiceBuilder(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:appplatform:BuildServiceBuilder", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:appplatform/v20220101preview:BuildServiceBuilder").build())
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
    public static BuildServiceBuilder get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BuildServiceBuilder(name, id, options);
    }
}
