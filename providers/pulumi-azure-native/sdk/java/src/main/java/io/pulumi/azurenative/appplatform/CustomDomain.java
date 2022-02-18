// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.appplatform.CustomDomainArgs;
import io.pulumi.azurenative.appplatform.outputs.CustomDomainPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Custom domain resource payload.
 * API Version: 2020-07-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:appplatform:CustomDomain mydomain.com /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.AppPlatform/Spring/myservice/apps/myapp/domains/mydomain.com 
 * ```
 * 
 */
@ResourceType(type="azure-native:appplatform:CustomDomain")
public class CustomDomain extends io.pulumi.resources.CustomResource {
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
     * Properties of the custom domain resource.
     * 
     */
    @OutputExport(name="properties", type=CustomDomainPropertiesResponse.class, parameters={})
    private Output<CustomDomainPropertiesResponse> properties;

    /**
     * @return Properties of the custom domain resource.
     * 
     */
    public Output<CustomDomainPropertiesResponse> getProperties() {
        return this.properties;
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
    public CustomDomain(String name, CustomDomainArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:appplatform:CustomDomain", name, args == null ? CustomDomainArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CustomDomain(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:appplatform:CustomDomain", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:appplatform/v20190501preview:CustomDomain").build()),
                Input.of(Alias.builder().setType("azure-native:appplatform/v20200701:CustomDomain").build()),
                Input.of(Alias.builder().setType("azure-native:appplatform/v20201101preview:CustomDomain").build()),
                Input.of(Alias.builder().setType("azure-native:appplatform/v20210601preview:CustomDomain").build()),
                Input.of(Alias.builder().setType("azure-native:appplatform/v20210901preview:CustomDomain").build()),
                Input.of(Alias.builder().setType("azure-native:appplatform/v20220101preview:CustomDomain").build())
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
    public static CustomDomain get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CustomDomain(name, id, options);
    }
}
