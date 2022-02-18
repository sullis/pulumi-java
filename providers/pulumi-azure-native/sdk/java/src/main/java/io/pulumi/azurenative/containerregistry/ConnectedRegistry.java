// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerregistry.ConnectedRegistryArgs;
import io.pulumi.azurenative.containerregistry.outputs.ActivationPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.LoggingPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.LoginServerPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.ParentPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.StatusDetailPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An object that represents a connected registry for a container registry.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:containerregistry:ConnectedRegistry myConnectedRegistry /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.ContainerRegistry/registries/myRegistry/connectedRegistries/myConnectedRegistry 
 * ```
 * 
 */
@ResourceType(type="azure-native:containerregistry:ConnectedRegistry")
public class ConnectedRegistry extends io.pulumi.resources.CustomResource {
    /**
     * The activation properties of the connected registry.
     * 
     */
    @OutputExport(name="activation", type=ActivationPropertiesResponse.class, parameters={})
    private Output<ActivationPropertiesResponse> activation;

    /**
     * @return The activation properties of the connected registry.
     * 
     */
    public Output<ActivationPropertiesResponse> getActivation() {
        return this.activation;
    }
    /**
     * The list of the ACR token resource IDs used to authenticate clients to the connected registry.
     * 
     */
    @OutputExport(name="clientTokenIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> clientTokenIds;

    /**
     * @return The list of the ACR token resource IDs used to authenticate clients to the connected registry.
     * 
     */
    public Output</* @Nullable */ List<String>> getClientTokenIds() {
        return this.clientTokenIds;
    }
    /**
     * The current connection state of the connected registry.
     * 
     */
    @OutputExport(name="connectionState", type=String.class, parameters={})
    private Output<String> connectionState;

    /**
     * @return The current connection state of the connected registry.
     * 
     */
    public Output<String> getConnectionState() {
        return this.connectionState;
    }
    /**
     * The last activity time of the connected registry.
     * 
     */
    @OutputExport(name="lastActivityTime", type=String.class, parameters={})
    private Output<String> lastActivityTime;

    /**
     * @return The last activity time of the connected registry.
     * 
     */
    public Output<String> getLastActivityTime() {
        return this.lastActivityTime;
    }
    /**
     * The logging properties of the connected registry.
     * 
     */
    @OutputExport(name="logging", type=LoggingPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ LoggingPropertiesResponse> logging;

    /**
     * @return The logging properties of the connected registry.
     * 
     */
    public Output</* @Nullable */ LoggingPropertiesResponse> getLogging() {
        return this.logging;
    }
    /**
     * The login server properties of the connected registry.
     * 
     */
    @OutputExport(name="loginServer", type=LoginServerPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ LoginServerPropertiesResponse> loginServer;

    /**
     * @return The login server properties of the connected registry.
     * 
     */
    public Output</* @Nullable */ LoginServerPropertiesResponse> getLoginServer() {
        return this.loginServer;
    }
    /**
     * The mode of the connected registry resource that indicates the permissions of the registry.
     * 
     */
    @OutputExport(name="mode", type=String.class, parameters={})
    private Output<String> mode;

    /**
     * @return The mode of the connected registry resource that indicates the permissions of the registry.
     * 
     */
    public Output<String> getMode() {
        return this.mode;
    }
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
     * The parent of the connected registry.
     * 
     */
    @OutputExport(name="parent", type=ParentPropertiesResponse.class, parameters={})
    private Output<ParentPropertiesResponse> parent;

    /**
     * @return The parent of the connected registry.
     * 
     */
    public Output<ParentPropertiesResponse> getParent() {
        return this.parent;
    }
    /**
     * Provisioning state of the resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The list of current statuses of the connected registry.
     * 
     */
    @OutputExport(name="statusDetails", type=List.class, parameters={StatusDetailPropertiesResponse.class})
    private Output<List<StatusDetailPropertiesResponse>> statusDetails;

    /**
     * @return The list of current statuses of the connected registry.
     * 
     */
    public Output<List<StatusDetailPropertiesResponse>> getStatusDetails() {
        return this.statusDetails;
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
     * The current version of ACR runtime on the connected registry.
     * 
     */
    @OutputExport(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return The current version of ACR runtime on the connected registry.
     * 
     */
    public Output<String> getVersion() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectedRegistry(String name, ConnectedRegistryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:containerregistry:ConnectedRegistry", name, args == null ? ConnectedRegistryArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ConnectedRegistry(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:containerregistry:ConnectedRegistry", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20201101preview:ConnectedRegistry").build()),
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20210601preview:ConnectedRegistry").build()),
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20210801preview:ConnectedRegistry").build()),
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20211201preview:ConnectedRegistry").build())
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
    public static ConnectedRegistry get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ConnectedRegistry(name, id, options);
    }
}
