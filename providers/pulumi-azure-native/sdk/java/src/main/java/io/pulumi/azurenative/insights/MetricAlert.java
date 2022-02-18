// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.MetricAlertArgs;
import io.pulumi.azurenative.insights.outputs.MetricAlertActionResponse;
import io.pulumi.azurenative.insights.outputs.MetricAlertMultipleResourceMultipleMetricCriteriaResponse;
import io.pulumi.azurenative.insights.outputs.MetricAlertSingleResourceMultipleMetricCriteriaResponse;
import io.pulumi.azurenative.insights.outputs.WebtestLocationAvailabilityCriteriaResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The metric alert resource.
 * API Version: 2018-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:insights:MetricAlert webtest-name-example /subscriptions/14ddf0c5-77c5-4b53-84f6-e1fa43ad68f7/resourceGroups/gigtest/providers/providers/microsoft.insights/metricalerts/MetricAlertWithDimensions 
 * ```
 * 
 */
@ResourceType(type="azure-native:insights:MetricAlert")
public class MetricAlert extends io.pulumi.resources.CustomResource {
    /**
     * the array of actions that are performed when the alert rule becomes active, and when an alert condition is resolved.
     * 
     */
    @OutputExport(name="actions", type=List.class, parameters={MetricAlertActionResponse.class})
    private Output</* @Nullable */ List<MetricAlertActionResponse>> actions;

    /**
     * @return the array of actions that are performed when the alert rule becomes active, and when an alert condition is resolved.
     * 
     */
    public Output</* @Nullable */ List<MetricAlertActionResponse>> getActions() {
        return this.actions;
    }
    /**
     * the flag that indicates whether the alert should be auto resolved or not. The default is true.
     * 
     */
    @OutputExport(name="autoMitigate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoMitigate;

    /**
     * @return the flag that indicates whether the alert should be auto resolved or not. The default is true.
     * 
     */
    public Output</* @Nullable */ Boolean> getAutoMitigate() {
        return this.autoMitigate;
    }
    /**
     * defines the specific alert criteria information.
     * 
     */
    @OutputExport(name="criteria", type=Object.class, parameters={})
    private Output<Object> criteria;

    /**
     * @return defines the specific alert criteria information.
     * 
     */
    public Output<Object> getCriteria() {
        return this.criteria;
    }
    /**
     * the description of the metric alert that will be included in the alert email.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return the description of the metric alert that will be included in the alert email.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * the flag that indicates whether the metric alert is enabled.
     * 
     */
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output<Boolean> enabled;

    /**
     * @return the flag that indicates whether the metric alert is enabled.
     * 
     */
    public Output<Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * how often the metric alert is evaluated represented in ISO 8601 duration format.
     * 
     */
    @OutputExport(name="evaluationFrequency", type=String.class, parameters={})
    private Output<String> evaluationFrequency;

    /**
     * @return how often the metric alert is evaluated represented in ISO 8601 duration format.
     * 
     */
    public Output<String> getEvaluationFrequency() {
        return this.evaluationFrequency;
    }
    /**
     * the value indicating whether this alert rule is migrated.
     * 
     */
    @OutputExport(name="isMigrated", type=Boolean.class, parameters={})
    private Output<Boolean> isMigrated;

    /**
     * @return the value indicating whether this alert rule is migrated.
     * 
     */
    public Output<Boolean> getIsMigrated() {
        return this.isMigrated;
    }
    /**
     * Last time the rule was updated in ISO8601 format.
     * 
     */
    @OutputExport(name="lastUpdatedTime", type=String.class, parameters={})
    private Output<String> lastUpdatedTime;

    /**
     * @return Last time the rule was updated in ISO8601 format.
     * 
     */
    public Output<String> getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    /**
     * Resource location
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> getLocation() {
        return this.location;
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
     * the list of resource id's that this metric alert is scoped to.
     * 
     */
    @OutputExport(name="scopes", type=List.class, parameters={String.class})
    private Output<List<String>> scopes;

    /**
     * @return the list of resource id's that this metric alert is scoped to.
     * 
     */
    public Output<List<String>> getScopes() {
        return this.scopes;
    }
    /**
     * Alert severity {0, 1, 2, 3, 4}
     * 
     */
    @OutputExport(name="severity", type=Integer.class, parameters={})
    private Output<Integer> severity;

    /**
     * @return Alert severity {0, 1, 2, 3, 4}
     * 
     */
    public Output<Integer> getSeverity() {
        return this.severity;
    }
    /**
     * Resource tags
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * the region of the target resource(s) on which the alert is created/updated. Mandatory if the scope contains a subscription, resource group, or more than one resource.
     * 
     */
    @OutputExport(name="targetResourceRegion", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetResourceRegion;

    /**
     * @return the region of the target resource(s) on which the alert is created/updated. Mandatory if the scope contains a subscription, resource group, or more than one resource.
     * 
     */
    public Output</* @Nullable */ String> getTargetResourceRegion() {
        return this.targetResourceRegion;
    }
    /**
     * the resource type of the target resource(s) on which the alert is created/updated. Mandatory if the scope contains a subscription, resource group, or more than one resource.
     * 
     */
    @OutputExport(name="targetResourceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetResourceType;

    /**
     * @return the resource type of the target resource(s) on which the alert is created/updated. Mandatory if the scope contains a subscription, resource group, or more than one resource.
     * 
     */
    public Output</* @Nullable */ String> getTargetResourceType() {
        return this.targetResourceType;
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
     * the period of time (in ISO 8601 duration format) that is used to monitor alert activity based on the threshold.
     * 
     */
    @OutputExport(name="windowSize", type=String.class, parameters={})
    private Output<String> windowSize;

    /**
     * @return the period of time (in ISO 8601 duration format) that is used to monitor alert activity based on the threshold.
     * 
     */
    public Output<String> getWindowSize() {
        return this.windowSize;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MetricAlert(String name, MetricAlertArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:MetricAlert", name, args == null ? MetricAlertArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private MetricAlert(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:MetricAlert", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:insights/v20180301:MetricAlert").build())
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
    public static MetricAlert get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MetricAlert(name, id, options);
    }
}
