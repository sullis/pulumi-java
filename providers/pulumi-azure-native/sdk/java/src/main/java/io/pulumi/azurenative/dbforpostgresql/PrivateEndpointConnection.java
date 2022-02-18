// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.dbforpostgresql.PrivateEndpointConnectionArgs;
import io.pulumi.azurenative.dbforpostgresql.outputs.PrivateEndpointPropertyResponse;
import io.pulumi.azurenative.dbforpostgresql.outputs.PrivateLinkServiceConnectionStatePropertyResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A private endpoint connection
 * API Version: 2018-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:dbforpostgresql:PrivateEndpointConnection private-endpoint-connection-name /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default/providers/Microsoft.DBforPostgreSQL/servers/test-svr/privateEndpointConnections/private-endpoint-connection-name 
 * ```
 * 
 */
@ResourceType(type="azure-native:dbforpostgresql:PrivateEndpointConnection")
public class PrivateEndpointConnection extends io.pulumi.resources.CustomResource {
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
     * Private endpoint which the connection belongs to.
     * 
     */
    @OutputExport(name="privateEndpoint", type=PrivateEndpointPropertyResponse.class, parameters={})
    private Output</* @Nullable */ PrivateEndpointPropertyResponse> privateEndpoint;

    /**
     * @return Private endpoint which the connection belongs to.
     * 
     */
    public Output</* @Nullable */ PrivateEndpointPropertyResponse> getPrivateEndpoint() {
        return this.privateEndpoint;
    }
    /**
     * Connection state of the private endpoint connection.
     * 
     */
    @OutputExport(name="privateLinkServiceConnectionState", type=PrivateLinkServiceConnectionStatePropertyResponse.class, parameters={})
    private Output</* @Nullable */ PrivateLinkServiceConnectionStatePropertyResponse> privateLinkServiceConnectionState;

    /**
     * @return Connection state of the private endpoint connection.
     * 
     */
    public Output</* @Nullable */ PrivateLinkServiceConnectionStatePropertyResponse> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }
    /**
     * State of the private endpoint connection.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return State of the private endpoint connection.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
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
    public PrivateEndpointConnection(String name, PrivateEndpointConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbforpostgresql:PrivateEndpointConnection", name, args == null ? PrivateEndpointConnectionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PrivateEndpointConnection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbforpostgresql:PrivateEndpointConnection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:dbforpostgresql/v20180601:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:dbforpostgresql/v20180601privatepreview:PrivateEndpointConnection").build())
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
    public static PrivateEndpointConnection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateEndpointConnection(name, id, options);
    }
}
