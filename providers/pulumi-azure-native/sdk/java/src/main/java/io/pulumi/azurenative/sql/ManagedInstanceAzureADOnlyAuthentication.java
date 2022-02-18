// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.ManagedInstanceAzureADOnlyAuthenticationArgs;
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
 * Azure Active Directory only authentication.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:ManagedInstanceAzureADOnlyAuthentication Default /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/azureADOnlyAuthentications/providers/Microsoft.Sql/managedInstances/managedInstance/azureadonlyauthentications/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:ManagedInstanceAzureADOnlyAuthentication")
public class ManagedInstanceAzureADOnlyAuthentication extends io.pulumi.resources.CustomResource {
    /**
     * Azure Active Directory only Authentication enabled.
     * 
     */
    @OutputExport(name="azureADOnlyAuthentication", type=Boolean.class, parameters={})
    private Output<Boolean> azureADOnlyAuthentication;

    /**
     * @return Azure Active Directory only Authentication enabled.
     * 
     */
    public Output<Boolean> getAzureADOnlyAuthentication() {
        return this.azureADOnlyAuthentication;
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
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
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
    public ManagedInstanceAzureADOnlyAuthentication(String name, ManagedInstanceAzureADOnlyAuthenticationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ManagedInstanceAzureADOnlyAuthentication", name, args == null ? ManagedInstanceAzureADOnlyAuthenticationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ManagedInstanceAzureADOnlyAuthentication(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ManagedInstanceAzureADOnlyAuthentication", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:sql/v20200202preview:ManagedInstanceAzureADOnlyAuthentication").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200801preview:ManagedInstanceAzureADOnlyAuthentication").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20201101preview:ManagedInstanceAzureADOnlyAuthentication").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210201preview:ManagedInstanceAzureADOnlyAuthentication").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210501preview:ManagedInstanceAzureADOnlyAuthentication").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210801preview:ManagedInstanceAzureADOnlyAuthentication").build())
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
    public static ManagedInstanceAzureADOnlyAuthentication get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ManagedInstanceAzureADOnlyAuthentication(name, id, options);
    }
}
