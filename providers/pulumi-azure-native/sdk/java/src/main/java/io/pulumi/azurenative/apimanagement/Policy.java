// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.PolicyArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Policy Contract details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:Policy policy /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/policies/policy 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:Policy")
public class Policy extends io.pulumi.resources.CustomResource {
    /**
     * Format of the policyContent.
     * 
     */
    @OutputExport(name="format", type=String.class, parameters={})
    private Output</* @Nullable */ String> format;

    /**
     * @return Format of the policyContent.
     * 
     */
    public Output</* @Nullable */ String> getFormat() {
        return this.format;
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
     * Contents of the Policy as defined by the format.
     * 
     */
    @OutputExport(name="value", type=String.class, parameters={})
    private Output<String> value;

    /**
     * @return Contents of the Policy as defined by the format.
     * 
     */
    public Output<String> getValue() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Policy(String name, PolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:Policy", name, args == null ? PolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Policy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:Policy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20170301:Policy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180101:Policy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180601preview:Policy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20190101:Policy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201:Policy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201preview:Policy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20200601preview:Policy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20201201:Policy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210101preview:Policy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210401preview:Policy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210801:Policy").build())
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
    public static Policy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Policy(name, id, options);
    }
}
