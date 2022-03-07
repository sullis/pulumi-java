// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.resources.AzureCliScriptArgs;
import io.pulumi.azurenative.resources.outputs.ContainerConfigurationResponse;
import io.pulumi.azurenative.resources.outputs.EnvironmentVariableResponse;
import io.pulumi.azurenative.resources.outputs.ManagedServiceIdentityResponse;
import io.pulumi.azurenative.resources.outputs.ScriptStatusResponse;
import io.pulumi.azurenative.resources.outputs.StorageAccountConfigurationResponse;
import io.pulumi.azurenative.resources.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Object model for the Azure CLI script.
 * API Version: 2020-10-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:resources:AzureCliScript myresource1 /subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.Resources/deploymentScripts/{scriptName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:resources:AzureCliScript")
public class AzureCliScript extends io.pulumi.resources.CustomResource {
    /**
     * Command line arguments to pass to the script. Arguments are separated by spaces. ex: -Name blue* -Location 'West US 2'
     * 
     */
    @OutputExport(name="arguments", type=String.class, parameters={})
    private Output</* @Nullable */ String> arguments;

    /**
     * @return Command line arguments to pass to the script. Arguments are separated by spaces. ex: -Name blue* -Location 'West US 2'
     * 
     */
    public Output</* @Nullable */ String> getArguments() {
        return this.arguments;
    }
    /**
     * Azure CLI module version to be used.
     * 
     */
    @OutputExport(name="azCliVersion", type=String.class, parameters={})
    private Output<String> azCliVersion;

    /**
     * @return Azure CLI module version to be used.
     * 
     */
    public Output<String> getAzCliVersion() {
        return this.azCliVersion;
    }
    /**
     * The clean up preference when the script execution gets in a terminal state. Default setting is 'Always'.
     * 
     */
    @OutputExport(name="cleanupPreference", type=String.class, parameters={})
    private Output</* @Nullable */ String> cleanupPreference;

    /**
     * @return The clean up preference when the script execution gets in a terminal state. Default setting is 'Always'.
     * 
     */
    public Output</* @Nullable */ String> getCleanupPreference() {
        return this.cleanupPreference;
    }
    /**
     * Container settings.
     * 
     */
    @OutputExport(name="containerSettings", type=ContainerConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ ContainerConfigurationResponse> containerSettings;

    /**
     * @return Container settings.
     * 
     */
    public Output</* @Nullable */ ContainerConfigurationResponse> getContainerSettings() {
        return this.containerSettings;
    }
    /**
     * The environment variables to pass over to the script.
     * 
     */
    @OutputExport(name="environmentVariables", type=List.class, parameters={EnvironmentVariableResponse.class})
    private Output</* @Nullable */ List<EnvironmentVariableResponse>> environmentVariables;

    /**
     * @return The environment variables to pass over to the script.
     * 
     */
    public Output</* @Nullable */ List<EnvironmentVariableResponse>> getEnvironmentVariables() {
        return this.environmentVariables;
    }
    /**
     * Gets or sets how the deployment script should be forced to execute even if the script resource has not changed. Can be current time stamp or a GUID.
     * 
     */
    @OutputExport(name="forceUpdateTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> forceUpdateTag;

    /**
     * @return Gets or sets how the deployment script should be forced to execute even if the script resource has not changed. Can be current time stamp or a GUID.
     * 
     */
    public Output</* @Nullable */ String> getForceUpdateTag() {
        return this.forceUpdateTag;
    }
    /**
     * Optional property. Managed identity to be used for this deployment script. Currently, only user-assigned MSI is supported.
     * 
     */
    @OutputExport(name="identity", type=ManagedServiceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ManagedServiceIdentityResponse> identity;

    /**
     * @return Optional property. Managed identity to be used for this deployment script. Currently, only user-assigned MSI is supported.
     * 
     */
    public Output</* @Nullable */ ManagedServiceIdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * Type of the script.
     * Expected value is 'AzureCLI'.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the script.
     * Expected value is 'AzureCLI'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The location of the ACI and the storage account for the deployment script.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the ACI and the storage account for the deployment script.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Name of this resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of this resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * List of script outputs.
     * 
     */
    @OutputExport(name="outputs", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> outputs;

    /**
     * @return List of script outputs.
     * 
     */
    public Output<Map<String,Object>> getOutputs() {
        return this.outputs;
    }
    /**
     * Uri for the script. This is the entry point for the external script.
     * 
     */
    @OutputExport(name="primaryScriptUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> primaryScriptUri;

    /**
     * @return Uri for the script. This is the entry point for the external script.
     * 
     */
    public Output</* @Nullable */ String> getPrimaryScriptUri() {
        return this.primaryScriptUri;
    }
    /**
     * State of the script execution. This only appears in the response.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return State of the script execution. This only appears in the response.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Interval for which the service retains the script resource after it reaches a terminal state. Resource will be deleted when this duration expires. Duration is based on ISO 8601 pattern (for example P1D means one day).
     * 
     */
    @OutputExport(name="retentionInterval", type=String.class, parameters={})
    private Output<String> retentionInterval;

    /**
     * @return Interval for which the service retains the script resource after it reaches a terminal state. Resource will be deleted when this duration expires. Duration is based on ISO 8601 pattern (for example P1D means one day).
     * 
     */
    public Output<String> getRetentionInterval() {
        return this.retentionInterval;
    }
    /**
     * Script body.
     * 
     */
    @OutputExport(name="scriptContent", type=String.class, parameters={})
    private Output</* @Nullable */ String> scriptContent;

    /**
     * @return Script body.
     * 
     */
    public Output</* @Nullable */ String> getScriptContent() {
        return this.scriptContent;
    }
    /**
     * Contains the results of script execution.
     * 
     */
    @OutputExport(name="status", type=ScriptStatusResponse.class, parameters={})
    private Output<ScriptStatusResponse> status;

    /**
     * @return Contains the results of script execution.
     * 
     */
    public Output<ScriptStatusResponse> getStatus() {
        return this.status;
    }
    /**
     * Storage Account settings.
     * 
     */
    @OutputExport(name="storageAccountSettings", type=StorageAccountConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ StorageAccountConfigurationResponse> storageAccountSettings;

    /**
     * @return Storage Account settings.
     * 
     */
    public Output</* @Nullable */ StorageAccountConfigurationResponse> getStorageAccountSettings() {
        return this.storageAccountSettings;
    }
    /**
     * Supporting files for the external script.
     * 
     */
    @OutputExport(name="supportingScriptUris", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> supportingScriptUris;

    /**
     * @return Supporting files for the external script.
     * 
     */
    public Output</* @Nullable */ List<String>> getSupportingScriptUris() {
        return this.supportingScriptUris;
    }
    /**
     * The system metadata related to this resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata related to this resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Maximum allowed script execution time specified in ISO 8601 format. Default value is P1D
     * 
     */
    @OutputExport(name="timeout", type=String.class, parameters={})
    private Output</* @Nullable */ String> timeout;

    /**
     * @return Maximum allowed script execution time specified in ISO 8601 format. Default value is P1D
     * 
     */
    public Output</* @Nullable */ String> getTimeout() {
        return this.timeout;
    }
    /**
     * Type of this resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of this resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(AzureCliScriptArgs.Builder a);
    }
    private static io.pulumi.azurenative.resources.AzureCliScriptArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.resources.AzureCliScriptArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AzureCliScript(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AzureCliScript(String name) {
        this(name, AzureCliScriptArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AzureCliScript(String name, AzureCliScriptArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AzureCliScript(String name, AzureCliScriptArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:resources:AzureCliScript", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private AzureCliScript(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:resources:AzureCliScript", name, null, makeResourceOptions(options, id));
    }

    private static AzureCliScriptArgs makeArgs(AzureCliScriptArgs args) {
        var builder = args == null ? AzureCliScriptArgs.builder() : AzureCliScriptArgs.builder(args);
        return builder
            .setKind("AzureCLI")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:resources/v20191001preview:AzureCliScript").build()),
                Input.of(Alias.builder().setType("azure-native:resources/v20201001:AzureCliScript").build())
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
    public static AzureCliScript get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AzureCliScript(name, id, options);
    }
}