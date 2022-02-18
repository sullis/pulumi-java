// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.connectedvmwarevsphere.GuestAgentArgs;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.GuestCredentialResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.HttpProxyConfigurationResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.ResourceStatusResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Defines the GuestAgent.
 * API Version: 2020-10-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:connectedvmwarevsphere:GuestAgent default /subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.ConnectedVMwarevSphere/VitualMachines/ContosoVm/guestAgents/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:connectedvmwarevsphere:GuestAgent")
public class GuestAgent extends io.pulumi.resources.CustomResource {
    /**
     * Username / Password Credentials to provision guest agent.
     * 
     */
    @OutputExport(name="credentials", type=GuestCredentialResponse.class, parameters={})
    private Output</* @Nullable */ GuestCredentialResponse> credentials;

    /**
     * @return Username / Password Credentials to provision guest agent.
     * 
     */
    public Output</* @Nullable */ GuestCredentialResponse> getCredentials() {
        return this.credentials;
    }
    /**
     * Gets the name of the corresponding resource in Kubernetes.
     * 
     */
    @OutputExport(name="customResourceName", type=String.class, parameters={})
    private Output<String> customResourceName;

    /**
     * @return Gets the name of the corresponding resource in Kubernetes.
     * 
     */
    public Output<String> getCustomResourceName() {
        return this.customResourceName;
    }
    /**
     * HTTP Proxy configuration for the VM.
     * 
     */
    @OutputExport(name="httpProxyConfig", type=HttpProxyConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ HttpProxyConfigurationResponse> httpProxyConfig;

    /**
     * @return HTTP Proxy configuration for the VM.
     * 
     */
    public Output</* @Nullable */ HttpProxyConfigurationResponse> getHttpProxyConfig() {
        return this.httpProxyConfig;
    }
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
     * Gets or sets the guest agent provisioning action.
     * 
     */
    @OutputExport(name="provisioningAction", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningAction;

    /**
     * @return Gets or sets the guest agent provisioning action.
     * 
     */
    public Output</* @Nullable */ String> getProvisioningAction() {
        return this.provisioningAction;
    }
    /**
     * Gets or sets the provisioning state.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Gets or sets the provisioning state.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Gets or sets the guest agent status.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Gets or sets the guest agent status.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * The resource status information.
     * 
     */
    @OutputExport(name="statuses", type=List.class, parameters={ResourceStatusResponse.class})
    private Output<List<ResourceStatusResponse>> statuses;

    /**
     * @return The resource status information.
     * 
     */
    public Output<List<ResourceStatusResponse>> getStatuses() {
        return this.statuses;
    }
    /**
     * The system data.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system data.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
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
     * Gets or sets a unique identifier for this resource.
     * 
     */
    @OutputExport(name="uuid", type=String.class, parameters={})
    private Output<String> uuid;

    /**
     * @return Gets or sets a unique identifier for this resource.
     * 
     */
    public Output<String> getUuid() {
        return this.uuid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GuestAgent(String name, GuestAgentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:connectedvmwarevsphere:GuestAgent", name, args == null ? GuestAgentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private GuestAgent(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:connectedvmwarevsphere:GuestAgent", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:connectedvmwarevsphere/v20201001preview:GuestAgent").build())
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
    public static GuestAgent get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GuestAgent(name, id, options);
    }
}
