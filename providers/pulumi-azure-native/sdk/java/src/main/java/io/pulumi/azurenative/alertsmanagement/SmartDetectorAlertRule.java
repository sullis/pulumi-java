// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.alertsmanagement.SmartDetectorAlertRuleArgs;
import io.pulumi.azurenative.alertsmanagement.outputs.ActionGroupsInformationResponse;
import io.pulumi.azurenative.alertsmanagement.outputs.DetectorResponse;
import io.pulumi.azurenative.alertsmanagement.outputs.ThrottlingInformationResponse;
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
 * The alert rule information
 * API Version: 2019-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:alertsmanagement:SmartDetectorAlertRule MyAlertRule /subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/MyAlertRules/providers/microsoft.alertsManagement/smartDetectorAlertRules/MyAlertRule 
 * ```
 * 
 */
@ResourceType(type="azure-native:alertsmanagement:SmartDetectorAlertRule")
public class SmartDetectorAlertRule extends io.pulumi.resources.CustomResource {
    /**
     * The alert rule actions.
     * 
     */
    @OutputExport(name="actionGroups", type=ActionGroupsInformationResponse.class, parameters={})
    private Output<ActionGroupsInformationResponse> actionGroups;

    /**
     * @return The alert rule actions.
     * 
     */
    public Output<ActionGroupsInformationResponse> getActionGroups() {
        return this.actionGroups;
    }
    /**
     * The alert rule description.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The alert rule description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The alert rule's detector.
     * 
     */
    @OutputExport(name="detector", type=DetectorResponse.class, parameters={})
    private Output<DetectorResponse> detector;

    /**
     * @return The alert rule's detector.
     * 
     */
    public Output<DetectorResponse> getDetector() {
        return this.detector;
    }
    /**
     * The alert rule frequency in ISO8601 format. The time granularity must be in minutes and minimum value is 5 minutes.
     * 
     */
    @OutputExport(name="frequency", type=String.class, parameters={})
    private Output<String> frequency;

    /**
     * @return The alert rule frequency in ISO8601 format. The time granularity must be in minutes and minimum value is 5 minutes.
     * 
     */
    public Output<String> getFrequency() {
        return this.frequency;
    }
    /**
     * The resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The alert rule resources scope.
     * 
     */
    @OutputExport(name="scope", type=List.class, parameters={String.class})
    private Output<List<String>> scope;

    /**
     * @return The alert rule resources scope.
     * 
     */
    public Output<List<String>> getScope() {
        return this.scope;
    }
    /**
     * The alert rule severity.
     * 
     */
    @OutputExport(name="severity", type=String.class, parameters={})
    private Output<String> severity;

    /**
     * @return The alert rule severity.
     * 
     */
    public Output<String> getSeverity() {
        return this.severity;
    }
    /**
     * The alert rule state.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The alert rule state.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The alert rule throttling information.
     * 
     */
    @OutputExport(name="throttling", type=ThrottlingInformationResponse.class, parameters={})
    private Output</* @Nullable */ ThrottlingInformationResponse> throttling;

    /**
     * @return The alert rule throttling information.
     * 
     */
    public Output</* @Nullable */ ThrottlingInformationResponse> getThrottling() {
        return this.throttling;
    }
    /**
     * The resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(SmartDetectorAlertRuleArgs.Builder a);
    }
    private static io.pulumi.azurenative.alertsmanagement.SmartDetectorAlertRuleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.alertsmanagement.SmartDetectorAlertRuleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SmartDetectorAlertRule(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SmartDetectorAlertRule(String name) {
        this(name, SmartDetectorAlertRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SmartDetectorAlertRule(String name, SmartDetectorAlertRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SmartDetectorAlertRule(String name, SmartDetectorAlertRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:alertsmanagement:SmartDetectorAlertRule", name, args == null ? SmartDetectorAlertRuleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SmartDetectorAlertRule(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:alertsmanagement:SmartDetectorAlertRule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:alertsmanagement/v20190301:SmartDetectorAlertRule").build()),
                Input.of(Alias.builder().setType("azure-native:alertsmanagement/v20190601:SmartDetectorAlertRule").build()),
                Input.of(Alias.builder().setType("azure-native:alertsmanagement/v20210401:SmartDetectorAlertRule").build())
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
    public static SmartDetectorAlertRule get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SmartDetectorAlertRule(name, id, options);
    }
}