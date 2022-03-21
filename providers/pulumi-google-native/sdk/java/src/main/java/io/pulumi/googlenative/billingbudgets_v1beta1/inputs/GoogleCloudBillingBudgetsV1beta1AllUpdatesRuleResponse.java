// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * AllUpdatesRule defines notifications that are sent based on budget spend and thresholds.
 * 
 */
public final class GoogleCloudBillingBudgetsV1beta1AllUpdatesRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudBillingBudgetsV1beta1AllUpdatesRuleResponse Empty = new GoogleCloudBillingBudgetsV1beta1AllUpdatesRuleResponse();

    /**
     * Optional. When set to true, disables default notifications sent when a threshold is exceeded. Default notifications are sent to those with Billing Account Administrator and Billing Account User IAM roles for the target account.
     * 
     */
    @Import(name="disableDefaultIamRecipients", required=true)
      private final Boolean disableDefaultIamRecipients;

    public Boolean getDisableDefaultIamRecipients() {
        return this.disableDefaultIamRecipients;
    }

    /**
     * Optional. Targets to send notifications to when a threshold is exceeded. This is in addition to default recipients who have billing account IAM roles. The value is the full REST resource name of a monitoring notification channel with the form `projects/{project_id}/notificationChannels/{channel_id}`. A maximum of 5 channels are allowed. See https://cloud.google.com/billing/docs/how-to/budgets-notification-recipients for more details.
     * 
     */
    @Import(name="monitoringNotificationChannels", required=true)
      private final List<String> monitoringNotificationChannels;

    public List<String> getMonitoringNotificationChannels() {
        return this.monitoringNotificationChannels;
    }

    /**
     * Optional. The name of the Pub/Sub topic where budget related messages will be published, in the form `projects/{project_id}/topics/{topic_id}`. Updates are sent at regular intervals to the topic. The topic needs to be created before the budget is created; see https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications for more details. Caller is expected to have `pubsub.topics.setIamPolicy` permission on the topic when it's set for a budget, otherwise, the API call will fail with PERMISSION_DENIED. See https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications#permissions_required_for_this_task for more details on Pub/Sub roles and permissions.
     * 
     */
    @Import(name="pubsubTopic", required=true)
      private final String pubsubTopic;

    public String getPubsubTopic() {
        return this.pubsubTopic;
    }

    /**
     * Optional. Required when AllUpdatesRule.pubsub_topic is set. The schema version of the notification sent to AllUpdatesRule.pubsub_topic. Only "1.0" is accepted. It represents the JSON schema as defined in https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications#notification_format.
     * 
     */
    @Import(name="schemaVersion", required=true)
      private final String schemaVersion;

    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public GoogleCloudBillingBudgetsV1beta1AllUpdatesRuleResponse(
        Boolean disableDefaultIamRecipients,
        List<String> monitoringNotificationChannels,
        String pubsubTopic,
        String schemaVersion) {
        this.disableDefaultIamRecipients = Objects.requireNonNull(disableDefaultIamRecipients, "expected parameter 'disableDefaultIamRecipients' to be non-null");
        this.monitoringNotificationChannels = Objects.requireNonNull(monitoringNotificationChannels, "expected parameter 'monitoringNotificationChannels' to be non-null");
        this.pubsubTopic = Objects.requireNonNull(pubsubTopic, "expected parameter 'pubsubTopic' to be non-null");
        this.schemaVersion = Objects.requireNonNull(schemaVersion, "expected parameter 'schemaVersion' to be non-null");
    }

    private GoogleCloudBillingBudgetsV1beta1AllUpdatesRuleResponse() {
        this.disableDefaultIamRecipients = null;
        this.monitoringNotificationChannels = List.of();
        this.pubsubTopic = null;
        this.schemaVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudBillingBudgetsV1beta1AllUpdatesRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disableDefaultIamRecipients;
        private List<String> monitoringNotificationChannels;
        private String pubsubTopic;
        private String schemaVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudBillingBudgetsV1beta1AllUpdatesRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableDefaultIamRecipients = defaults.disableDefaultIamRecipients;
    	      this.monitoringNotificationChannels = defaults.monitoringNotificationChannels;
    	      this.pubsubTopic = defaults.pubsubTopic;
    	      this.schemaVersion = defaults.schemaVersion;
        }

        public Builder disableDefaultIamRecipients(Boolean disableDefaultIamRecipients) {
            this.disableDefaultIamRecipients = Objects.requireNonNull(disableDefaultIamRecipients);
            return this;
        }
        public Builder monitoringNotificationChannels(List<String> monitoringNotificationChannels) {
            this.monitoringNotificationChannels = Objects.requireNonNull(monitoringNotificationChannels);
            return this;
        }
        public Builder monitoringNotificationChannels(String... monitoringNotificationChannels) {
            return monitoringNotificationChannels(List.of(monitoringNotificationChannels));
        }
        public Builder pubsubTopic(String pubsubTopic) {
            this.pubsubTopic = Objects.requireNonNull(pubsubTopic);
            return this;
        }
        public Builder schemaVersion(String schemaVersion) {
            this.schemaVersion = Objects.requireNonNull(schemaVersion);
            return this;
        }        public GoogleCloudBillingBudgetsV1beta1AllUpdatesRuleResponse build() {
            return new GoogleCloudBillingBudgetsV1beta1AllUpdatesRuleResponse(disableDefaultIamRecipients, monitoringNotificationChannels, pubsubTopic, schemaVersion);
        }
    }
}
