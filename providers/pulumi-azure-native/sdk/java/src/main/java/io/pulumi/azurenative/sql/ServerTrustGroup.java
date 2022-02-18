// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.ServerTrustGroupArgs;
import io.pulumi.azurenative.sql.outputs.ServerInfoResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A server trust group.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:ServerTrustGroup server-trust-group-test /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default/providers/Microsoft.Sql/locations/Japan East/serverTrustGroups/server-trust-group-test 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:ServerTrustGroup")
public class ServerTrustGroup extends io.pulumi.resources.CustomResource {
    /**
     * Group members information for the server trust group.
     * 
     */
    @OutputExport(name="groupMembers", type=List.class, parameters={ServerInfoResponse.class})
    private Output<List<ServerInfoResponse>> groupMembers;

    /**
     * @return Group members information for the server trust group.
     * 
     */
    public Output<List<ServerInfoResponse>> getGroupMembers() {
        return this.groupMembers;
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
     * Trust scope of the server trust group.
     * 
     */
    @OutputExport(name="trustScopes", type=List.class, parameters={String.class})
    private Output<List<String>> trustScopes;

    /**
     * @return Trust scope of the server trust group.
     * 
     */
    public Output<List<String>> getTrustScopes() {
        return this.trustScopes;
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
    public ServerTrustGroup(String name, ServerTrustGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ServerTrustGroup", name, args == null ? ServerTrustGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ServerTrustGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ServerTrustGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:sql/v20200202preview:ServerTrustGroup").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200801preview:ServerTrustGroup").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20201101preview:ServerTrustGroup").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210201preview:ServerTrustGroup").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210501preview:ServerTrustGroup").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210801preview:ServerTrustGroup").build())
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
    public static ServerTrustGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServerTrustGroup(name, id, options);
    }
}
