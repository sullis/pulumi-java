// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.labservices.EnvironmentSettingArgs;
import io.pulumi.azurenative.labservices.outputs.LatestOperationResultResponse;
import io.pulumi.azurenative.labservices.outputs.ResourceSettingsResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Represents settings of an environment, from which environment instances would be created
 * API Version: 2018-10-15.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:labservices:EnvironmentSetting myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.LabServices/labaccounts/{labAccountName}/labs/{labName}/environmentsettings/{environmentSettingName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:labservices:EnvironmentSetting")
public class EnvironmentSetting extends io.pulumi.resources.CustomResource {
    /**
     * Describes the user's progress in configuring their environment setting
     * 
     */
    @OutputExport(name="configurationState", type=String.class, parameters={})
    private Output</* @Nullable */ String> configurationState;

    /**
     * @return Describes the user's progress in configuring their environment setting
     * 
     */
    public Output</* @Nullable */ String> getConfigurationState() {
        return this.configurationState;
    }
    /**
     * Describes the environment and its resource settings
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Describes the environment and its resource settings
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Time when the template VM was last changed.
     * 
     */
    @OutputExport(name="lastChanged", type=String.class, parameters={})
    private Output<String> lastChanged;

    /**
     * @return Time when the template VM was last changed.
     * 
     */
    public Output<String> getLastChanged() {
        return this.lastChanged;
    }
    /**
     * Time when the template VM was last sent for publishing.
     * 
     */
    @OutputExport(name="lastPublished", type=String.class, parameters={})
    private Output<String> lastPublished;

    /**
     * @return Time when the template VM was last sent for publishing.
     * 
     */
    public Output<String> getLastPublished() {
        return this.lastPublished;
    }
    /**
     * The details of the latest operation. ex: status, error
     * 
     */
    @OutputExport(name="latestOperationResult", type=LatestOperationResultResponse.class, parameters={})
    private Output<LatestOperationResultResponse> latestOperationResult;

    /**
     * @return The details of the latest operation. ex: status, error
     * 
     */
    public Output<LatestOperationResultResponse> getLatestOperationResult() {
        return this.latestOperationResult;
    }
    /**
     * The location of the resource.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
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
     * The provisioning status of the resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return The provisioning status of the resource.
     * 
     */
    public Output</* @Nullable */ String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Describes the readiness of this environment setting
     * 
     */
    @OutputExport(name="publishingState", type=String.class, parameters={})
    private Output<String> publishingState;

    /**
     * @return Describes the readiness of this environment setting
     * 
     */
    public Output<String> getPublishingState() {
        return this.publishingState;
    }
    /**
     * The resource specific settings
     * 
     */
    @OutputExport(name="resourceSettings", type=ResourceSettingsResponse.class, parameters={})
    private Output<ResourceSettingsResponse> resourceSettings;

    /**
     * @return The resource specific settings
     * 
     */
    public Output<ResourceSettingsResponse> getResourceSettings() {
        return this.resourceSettings;
    }
    /**
     * The tags of the resource.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tags of the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Brief title describing the environment and its resource settings
     * 
     */
    @OutputExport(name="title", type=String.class, parameters={})
    private Output</* @Nullable */ String> title;

    /**
     * @return Brief title describing the environment and its resource settings
     * 
     */
    public Output</* @Nullable */ String> getTitle() {
        return this.title;
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
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    @OutputExport(name="uniqueIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> uniqueIdentifier;

    /**
     * @return The unique immutable identifier of a resource (Guid).
     * 
     */
    public Output</* @Nullable */ String> getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    public interface BuilderApplicator {
        public void apply(EnvironmentSettingArgs.Builder a);
    }
    private static io.pulumi.azurenative.labservices.EnvironmentSettingArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.labservices.EnvironmentSettingArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public EnvironmentSetting(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EnvironmentSetting(String name) {
        this(name, EnvironmentSettingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EnvironmentSetting(String name, EnvironmentSettingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EnvironmentSetting(String name, EnvironmentSettingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:labservices:EnvironmentSetting", name, args == null ? EnvironmentSettingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private EnvironmentSetting(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:labservices:EnvironmentSetting", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:labservices/v20181015:EnvironmentSetting").build())
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
    public static EnvironmentSetting get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EnvironmentSetting(name, id, options);
    }
}