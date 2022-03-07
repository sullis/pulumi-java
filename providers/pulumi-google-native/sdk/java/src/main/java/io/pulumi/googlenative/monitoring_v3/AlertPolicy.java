// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.monitoring_v3.AlertPolicyArgs;
import io.pulumi.googlenative.monitoring_v3.outputs.AlertStrategyResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.ConditionResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.DocumentationResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.MutationRecordResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.StatusResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new alerting policy.
 * 
 */
@ResourceType(type="google-native:monitoring/v3:AlertPolicy")
public class AlertPolicy extends io.pulumi.resources.CustomResource {
    /**
     * Control over how this alert policy's notification channels are notified.
     * 
     */
    @OutputExport(name="alertStrategy", type=AlertStrategyResponse.class, parameters={})
    private Output<AlertStrategyResponse> alertStrategy;

    /**
     * @return Control over how this alert policy's notification channels are notified.
     * 
     */
    public Output<AlertStrategyResponse> getAlertStrategy() {
        return this.alertStrategy;
    }
    /**
     * How to combine the results of multiple conditions to determine if an incident should be opened. If condition_time_series_query_language is present, this must be COMBINE_UNSPECIFIED.
     * 
     */
    @OutputExport(name="combiner", type=String.class, parameters={})
    private Output<String> combiner;

    /**
     * @return How to combine the results of multiple conditions to determine if an incident should be opened. If condition_time_series_query_language is present, this must be COMBINE_UNSPECIFIED.
     * 
     */
    public Output<String> getCombiner() {
        return this.combiner;
    }
    /**
     * A list of conditions for the policy. The conditions are combined by AND or OR according to the combiner field. If the combined conditions evaluate to true, then an incident is created. A policy can have from one to six conditions. If condition_time_series_query_language is present, it must be the only condition.
     * 
     */
    @OutputExport(name="conditions", type=List.class, parameters={ConditionResponse.class})
    private Output<List<ConditionResponse>> conditions;

    /**
     * @return A list of conditions for the policy. The conditions are combined by AND or OR according to the combiner field. If the combined conditions evaluate to true, then an incident is created. A policy can have from one to six conditions. If condition_time_series_query_language is present, it must be the only condition.
     * 
     */
    public Output<List<ConditionResponse>> getConditions() {
        return this.conditions;
    }
    /**
     * A read-only record of the creation of the alerting policy. If provided in a call to create or update, this field will be ignored.
     * 
     */
    @OutputExport(name="creationRecord", type=MutationRecordResponse.class, parameters={})
    private Output<MutationRecordResponse> creationRecord;

    /**
     * @return A read-only record of the creation of the alerting policy. If provided in a call to create or update, this field will be ignored.
     * 
     */
    public Output<MutationRecordResponse> getCreationRecord() {
        return this.creationRecord;
    }
    /**
     * A short name or phrase used to identify the policy in dashboards, notifications, and incidents. To avoid confusion, don't use the same display name for multiple policies in the same project. The name is limited to 512 Unicode characters.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return A short name or phrase used to identify the policy in dashboards, notifications, and incidents. To avoid confusion, don't use the same display name for multiple policies in the same project. The name is limited to 512 Unicode characters.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Documentation that is included with notifications and incidents related to this policy. Best practice is for the documentation to include information to help responders understand, mitigate, escalate, and correct the underlying problems detected by the alerting policy. Notification channels that have limited capacity might not show this documentation.
     * 
     */
    @OutputExport(name="documentation", type=DocumentationResponse.class, parameters={})
    private Output<DocumentationResponse> documentation;

    /**
     * @return Documentation that is included with notifications and incidents related to this policy. Best practice is for the documentation to include information to help responders understand, mitigate, escalate, and correct the underlying problems detected by the alerting policy. Notification channels that have limited capacity might not show this documentation.
     * 
     */
    public Output<DocumentationResponse> getDocumentation() {
        return this.documentation;
    }
    /**
     * Whether or not the policy is enabled. On write, the default interpretation if unset is that the policy is enabled. On read, clients should not make any assumption about the state if it has not been populated. The field should always be populated on List and Get operations, unless a field projection has been specified that strips it out.
     * 
     */
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output<Boolean> enabled;

    /**
     * @return Whether or not the policy is enabled. On write, the default interpretation if unset is that the policy is enabled. On read, clients should not make any assumption about the state if it has not been populated. The field should always be populated on List and Get operations, unless a field projection has been specified that strips it out.
     * 
     */
    public Output<Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * A read-only record of the most recent change to the alerting policy. If provided in a call to create or update, this field will be ignored.
     * 
     */
    @OutputExport(name="mutationRecord", type=MutationRecordResponse.class, parameters={})
    private Output<MutationRecordResponse> mutationRecord;

    /**
     * @return A read-only record of the most recent change to the alerting policy. If provided in a call to create or update, this field will be ignored.
     * 
     */
    public Output<MutationRecordResponse> getMutationRecord() {
        return this.mutationRecord;
    }
    /**
     * Required if the policy exists. The resource name for this policy. The format is: projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[ALERT_POLICY_ID] [ALERT_POLICY_ID] is assigned by Stackdriver Monitoring when the policy is created. When calling the alertPolicies.create method, do not include the name field in the alerting policy passed as part of the request.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Required if the policy exists. The resource name for this policy. The format is: projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[ALERT_POLICY_ID] [ALERT_POLICY_ID] is assigned by Stackdriver Monitoring when the policy is created. When calling the alertPolicies.create method, do not include the name field in the alerting policy passed as part of the request.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Identifies the notification channels to which notifications should be sent when incidents are opened or closed or when new violations occur on an already opened incident. Each element of this array corresponds to the name field in each of the NotificationChannel objects that are returned from the ListNotificationChannels method. The format of the entries in this field is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID]
     * 
     */
    @OutputExport(name="notificationChannels", type=List.class, parameters={String.class})
    private Output<List<String>> notificationChannels;

    /**
     * @return Identifies the notification channels to which notifications should be sent when incidents are opened or closed or when new violations occur on an already opened incident. Each element of this array corresponds to the name field in each of the NotificationChannel objects that are returned from the ListNotificationChannels method. The format of the entries in this field is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID]
     * 
     */
    public Output<List<String>> getNotificationChannels() {
        return this.notificationChannels;
    }
    /**
     * User-supplied key/value data to be used for organizing and identifying the AlertPolicy objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
     * 
     */
    @OutputExport(name="userLabels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> userLabels;

    /**
     * @return User-supplied key/value data to be used for organizing and identifying the AlertPolicy objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
     * 
     */
    public Output<Map<String,String>> getUserLabels() {
        return this.userLabels;
    }
    /**
     * Read-only description of how the alert policy is invalid. OK if the alert policy is valid. If not OK, the alert policy will not generate incidents.
     * 
     */
    @OutputExport(name="validity", type=StatusResponse.class, parameters={})
    private Output<StatusResponse> validity;

    /**
     * @return Read-only description of how the alert policy is invalid. OK if the alert policy is valid. If not OK, the alert policy will not generate incidents.
     * 
     */
    public Output<StatusResponse> getValidity() {
        return this.validity;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable AlertPolicyArgs.Builder a);
    }
    private static io.pulumi.googlenative.monitoring_v3.AlertPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.monitoring_v3.AlertPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AlertPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AlertPolicy(String name) {
        this(name, AlertPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AlertPolicy(String name, @Nullable AlertPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AlertPolicy(String name, @Nullable AlertPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:monitoring/v3:AlertPolicy", name, args == null ? AlertPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AlertPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:monitoring/v3:AlertPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static AlertPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AlertPolicy(name, id, options);
    }
}