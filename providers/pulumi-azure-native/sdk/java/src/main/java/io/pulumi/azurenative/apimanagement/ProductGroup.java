// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.ProductGroupArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Contract details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:ProductGroup templateGroup /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/groups/templateGroup 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:ProductGroup")
public class ProductGroup extends io.pulumi.resources.CustomResource {
    /**
     * true if the group is one of the three system groups (Administrators, Developers, or Guests); otherwise false.
     * 
     */
    @OutputExport(name="builtIn", type=Boolean.class, parameters={})
    private Output<Boolean> builtIn;

    /**
     * @return true if the group is one of the three system groups (Administrators, Developers, or Guests); otherwise false.
     * 
     */
    public Output<Boolean> getBuiltIn() {
        return this.builtIn;
    }
    /**
     * Group description. Can contain HTML formatting tags.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Group description. Can contain HTML formatting tags.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Group name.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Group name.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * For external groups, this property contains the id of the group from the external identity provider, e.g. for Azure Active Directory `aad://<tenant>.onmicrosoft.com/groups/<group object id>`; otherwise the value is null.
     * 
     */
    @OutputExport(name="externalId", type=String.class, parameters={})
    private Output</* @Nullable */ String> externalId;

    /**
     * @return For external groups, this property contains the id of the group from the external identity provider, e.g. for Azure Active Directory `aad://<tenant>.onmicrosoft.com/groups/<group object id>`; otherwise the value is null.
     * 
     */
    public Output</* @Nullable */ String> getExternalId() {
        return this.externalId;
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
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProductGroup(String name, ProductGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ProductGroup", name, args == null ? ProductGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ProductGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ProductGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20170301:ProductGroup").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180101:ProductGroup").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180601preview:ProductGroup").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20190101:ProductGroup").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201:ProductGroup").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201preview:ProductGroup").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20200601preview:ProductGroup").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20201201:ProductGroup").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210101preview:ProductGroup").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210401preview:ProductGroup").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210801:ProductGroup").build())
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
    public static ProductGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ProductGroup(name, id, options);
    }
}
