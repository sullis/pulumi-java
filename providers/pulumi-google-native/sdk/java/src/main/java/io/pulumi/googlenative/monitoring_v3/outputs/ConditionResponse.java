// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.monitoring_v3.outputs.LogMatchResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.MetricAbsenceResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.MetricThresholdResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.MonitoringQueryLanguageConditionResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConditionResponse {
    /**
     * A condition that checks that a time series continues to receive new data points.
     * 
     */
    private final MetricAbsenceResponse conditionAbsent;
    /**
     * A condition that checks for log messages matching given constraints. If set, no other conditions can be present.
     * 
     */
    private final LogMatchResponse conditionMatchedLog;
    /**
     * A condition that uses the Monitoring Query Language to define alerts.
     * 
     */
    private final MonitoringQueryLanguageConditionResponse conditionMonitoringQueryLanguage;
    /**
     * A condition that compares a time series against a threshold.
     * 
     */
    private final MetricThresholdResponse conditionThreshold;
    /**
     * A short name or phrase used to identify the condition in dashboards, notifications, and incidents. To avoid confusion, don't use the same display name for multiple conditions in the same policy.
     * 
     */
    private final String displayName;
    /**
     * Required if the condition exists. The unique resource name for this condition. Its format is: projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[POLICY_ID]/conditions/[CONDITION_ID] [CONDITION_ID] is assigned by Stackdriver Monitoring when the condition is created as part of a new or updated alerting policy.When calling the alertPolicies.create method, do not include the name field in the conditions of the requested alerting policy. Stackdriver Monitoring creates the condition identifiers and includes them in the new policy.When calling the alertPolicies.update method to update a policy, including a condition name causes the existing condition to be updated. Conditions without names are added to the updated policy. Existing conditions are deleted if they are not updated.Best practice is to preserve [CONDITION_ID] if you make only small changes, such as those to condition thresholds, durations, or trigger values. Otherwise, treat the change as a new condition and let the existing condition be deleted.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"conditionAbsent","conditionMatchedLog","conditionMonitoringQueryLanguage","conditionThreshold","displayName","name"})
    private ConditionResponse(
        MetricAbsenceResponse conditionAbsent,
        LogMatchResponse conditionMatchedLog,
        MonitoringQueryLanguageConditionResponse conditionMonitoringQueryLanguage,
        MetricThresholdResponse conditionThreshold,
        String displayName,
        String name) {
        this.conditionAbsent = Objects.requireNonNull(conditionAbsent);
        this.conditionMatchedLog = Objects.requireNonNull(conditionMatchedLog);
        this.conditionMonitoringQueryLanguage = Objects.requireNonNull(conditionMonitoringQueryLanguage);
        this.conditionThreshold = Objects.requireNonNull(conditionThreshold);
        this.displayName = Objects.requireNonNull(displayName);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * A condition that checks that a time series continues to receive new data points.
     * 
    */
    public MetricAbsenceResponse getConditionAbsent() {
        return this.conditionAbsent;
    }
    /**
     * A condition that checks for log messages matching given constraints. If set, no other conditions can be present.
     * 
    */
    public LogMatchResponse getConditionMatchedLog() {
        return this.conditionMatchedLog;
    }
    /**
     * A condition that uses the Monitoring Query Language to define alerts.
     * 
    */
    public MonitoringQueryLanguageConditionResponse getConditionMonitoringQueryLanguage() {
        return this.conditionMonitoringQueryLanguage;
    }
    /**
     * A condition that compares a time series against a threshold.
     * 
    */
    public MetricThresholdResponse getConditionThreshold() {
        return this.conditionThreshold;
    }
    /**
     * A short name or phrase used to identify the condition in dashboards, notifications, and incidents. To avoid confusion, don't use the same display name for multiple conditions in the same policy.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Required if the condition exists. The unique resource name for this condition. Its format is: projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[POLICY_ID]/conditions/[CONDITION_ID] [CONDITION_ID] is assigned by Stackdriver Monitoring when the condition is created as part of a new or updated alerting policy.When calling the alertPolicies.create method, do not include the name field in the conditions of the requested alerting policy. Stackdriver Monitoring creates the condition identifiers and includes them in the new policy.When calling the alertPolicies.update method to update a policy, including a condition name causes the existing condition to be updated. Conditions without names are added to the updated policy. Existing conditions are deleted if they are not updated.Best practice is to preserve [CONDITION_ID] if you make only small changes, such as those to condition thresholds, durations, or trigger values. Otherwise, treat the change as a new condition and let the existing condition be deleted.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricAbsenceResponse conditionAbsent;
        private LogMatchResponse conditionMatchedLog;
        private MonitoringQueryLanguageConditionResponse conditionMonitoringQueryLanguage;
        private MetricThresholdResponse conditionThreshold;
        private String displayName;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionAbsent = defaults.conditionAbsent;
    	      this.conditionMatchedLog = defaults.conditionMatchedLog;
    	      this.conditionMonitoringQueryLanguage = defaults.conditionMonitoringQueryLanguage;
    	      this.conditionThreshold = defaults.conditionThreshold;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
        }

        public Builder setConditionAbsent(MetricAbsenceResponse conditionAbsent) {
            this.conditionAbsent = Objects.requireNonNull(conditionAbsent);
            return this;
        }

        public Builder setConditionMatchedLog(LogMatchResponse conditionMatchedLog) {
            this.conditionMatchedLog = Objects.requireNonNull(conditionMatchedLog);
            return this;
        }

        public Builder setConditionMonitoringQueryLanguage(MonitoringQueryLanguageConditionResponse conditionMonitoringQueryLanguage) {
            this.conditionMonitoringQueryLanguage = Objects.requireNonNull(conditionMonitoringQueryLanguage);
            return this;
        }

        public Builder setConditionThreshold(MetricThresholdResponse conditionThreshold) {
            this.conditionThreshold = Objects.requireNonNull(conditionThreshold);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public ConditionResponse build() {
            return new ConditionResponse(conditionAbsent, conditionMatchedLog, conditionMonitoringQueryLanguage, conditionThreshold, displayName, name);
        }
    }
}