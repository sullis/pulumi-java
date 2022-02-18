// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aadiam;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.aadiam.DiagnosticSettingArgs;
import io.pulumi.azurenative.aadiam.outputs.LogSettingsResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The diagnostic setting resource.
 * API Version: 2017-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:aadiam:DiagnosticSetting mysetting providers/microsoft.aadiam/diagnosticSettings/mysetting 
 * ```
 * 
 */
@ResourceType(type="azure-native:aadiam:DiagnosticSetting")
public class DiagnosticSetting extends io.pulumi.resources.CustomResource {
    /**
     * The resource Id for the event hub authorization rule.
     * 
     */
    @OutputExport(name="eventHubAuthorizationRuleId", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventHubAuthorizationRuleId;

    /**
     * @return The resource Id for the event hub authorization rule.
     * 
     */
    public Output</* @Nullable */ String> getEventHubAuthorizationRuleId() {
        return this.eventHubAuthorizationRuleId;
    }
    /**
     * The name of the event hub. If none is specified, the default event hub will be selected.
     * 
     */
    @OutputExport(name="eventHubName", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventHubName;

    /**
     * @return The name of the event hub. If none is specified, the default event hub will be selected.
     * 
     */
    public Output</* @Nullable */ String> getEventHubName() {
        return this.eventHubName;
    }
    /**
     * The list of logs settings.
     * 
     */
    @OutputExport(name="logs", type=List.class, parameters={LogSettingsResponse.class})
    private Output</* @Nullable */ List<LogSettingsResponse>> logs;

    /**
     * @return The list of logs settings.
     * 
     */
    public Output</* @Nullable */ List<LogSettingsResponse>> getLogs() {
        return this.logs;
    }
    /**
     * Azure resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The service bus rule Id of the diagnostic setting. This is here to maintain backwards compatibility.
     * 
     */
    @OutputExport(name="serviceBusRuleId", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceBusRuleId;

    /**
     * @return The service bus rule Id of the diagnostic setting. This is here to maintain backwards compatibility.
     * 
     */
    public Output</* @Nullable */ String> getServiceBusRuleId() {
        return this.serviceBusRuleId;
    }
    /**
     * The resource ID of the storage account to which you would like to send Diagnostic Logs.
     * 
     */
    @OutputExport(name="storageAccountId", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageAccountId;

    /**
     * @return The resource ID of the storage account to which you would like to send Diagnostic Logs.
     * 
     */
    public Output</* @Nullable */ String> getStorageAccountId() {
        return this.storageAccountId;
    }
    /**
     * Azure resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The workspace ID (resource ID of a Log Analytics workspace) for a Log Analytics workspace to which you would like to send Diagnostic Logs. Example: /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2
     * 
     */
    @OutputExport(name="workspaceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> workspaceId;

    /**
     * @return The workspace ID (resource ID of a Log Analytics workspace) for a Log Analytics workspace to which you would like to send Diagnostic Logs. Example: /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2
     * 
     */
    public Output</* @Nullable */ String> getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DiagnosticSetting(String name, @Nullable DiagnosticSettingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:aadiam:DiagnosticSetting", name, args == null ? DiagnosticSettingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DiagnosticSetting(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:aadiam:DiagnosticSetting", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:aadiam/v20170401:DiagnosticSetting").build()),
                Input.of(Alias.builder().setType("azure-native:aadiam/v20170401preview:DiagnosticSetting").build())
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
    public static DiagnosticSetting get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DiagnosticSetting(name, id, options);
    }
}
