// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.azure.monitoring.outputs.ActionRuleSuppressionConditionAlertContext;
import com.pulumi.azure.monitoring.outputs.ActionRuleSuppressionConditionAlertRuleId;
import com.pulumi.azure.monitoring.outputs.ActionRuleSuppressionConditionDescription;
import com.pulumi.azure.monitoring.outputs.ActionRuleSuppressionConditionMonitor;
import com.pulumi.azure.monitoring.outputs.ActionRuleSuppressionConditionMonitorService;
import com.pulumi.azure.monitoring.outputs.ActionRuleSuppressionConditionSeverity;
import com.pulumi.azure.monitoring.outputs.ActionRuleSuppressionConditionTargetResourceType;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ActionRuleSuppressionCondition {
    /**
     * @return A `alert_context` block as defined below.
     * 
     */
    private final @Nullable ActionRuleSuppressionConditionAlertContext alertContext;
    /**
     * @return A `alert_rule_id` block as defined below.
     * 
     */
    private final @Nullable ActionRuleSuppressionConditionAlertRuleId alertRuleId;
    /**
     * @return A `description` block as defined below.
     * 
     */
    private final @Nullable ActionRuleSuppressionConditionDescription description;
    /**
     * @return A `monitor` block as defined below.
     * 
     */
    private final @Nullable ActionRuleSuppressionConditionMonitor monitor;
    /**
     * @return A `monitor_service` as block defined below.
     * 
     */
    private final @Nullable ActionRuleSuppressionConditionMonitorService monitorService;
    /**
     * @return A `severity` block as defined below.
     * 
     */
    private final @Nullable ActionRuleSuppressionConditionSeverity severity;
    /**
     * @return A `target_resource_type` block as defined below.
     * 
     */
    private final @Nullable ActionRuleSuppressionConditionTargetResourceType targetResourceType;

    @CustomType.Constructor
    private ActionRuleSuppressionCondition(
        @CustomType.Parameter("alertContext") @Nullable ActionRuleSuppressionConditionAlertContext alertContext,
        @CustomType.Parameter("alertRuleId") @Nullable ActionRuleSuppressionConditionAlertRuleId alertRuleId,
        @CustomType.Parameter("description") @Nullable ActionRuleSuppressionConditionDescription description,
        @CustomType.Parameter("monitor") @Nullable ActionRuleSuppressionConditionMonitor monitor,
        @CustomType.Parameter("monitorService") @Nullable ActionRuleSuppressionConditionMonitorService monitorService,
        @CustomType.Parameter("severity") @Nullable ActionRuleSuppressionConditionSeverity severity,
        @CustomType.Parameter("targetResourceType") @Nullable ActionRuleSuppressionConditionTargetResourceType targetResourceType) {
        this.alertContext = alertContext;
        this.alertRuleId = alertRuleId;
        this.description = description;
        this.monitor = monitor;
        this.monitorService = monitorService;
        this.severity = severity;
        this.targetResourceType = targetResourceType;
    }

    /**
     * @return A `alert_context` block as defined below.
     * 
     */
    public Optional<ActionRuleSuppressionConditionAlertContext> alertContext() {
        return Optional.ofNullable(this.alertContext);
    }
    /**
     * @return A `alert_rule_id` block as defined below.
     * 
     */
    public Optional<ActionRuleSuppressionConditionAlertRuleId> alertRuleId() {
        return Optional.ofNullable(this.alertRuleId);
    }
    /**
     * @return A `description` block as defined below.
     * 
     */
    public Optional<ActionRuleSuppressionConditionDescription> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return A `monitor` block as defined below.
     * 
     */
    public Optional<ActionRuleSuppressionConditionMonitor> monitor() {
        return Optional.ofNullable(this.monitor);
    }
    /**
     * @return A `monitor_service` as block defined below.
     * 
     */
    public Optional<ActionRuleSuppressionConditionMonitorService> monitorService() {
        return Optional.ofNullable(this.monitorService);
    }
    /**
     * @return A `severity` block as defined below.
     * 
     */
    public Optional<ActionRuleSuppressionConditionSeverity> severity() {
        return Optional.ofNullable(this.severity);
    }
    /**
     * @return A `target_resource_type` block as defined below.
     * 
     */
    public Optional<ActionRuleSuppressionConditionTargetResourceType> targetResourceType() {
        return Optional.ofNullable(this.targetResourceType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionRuleSuppressionCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ActionRuleSuppressionConditionAlertContext alertContext;
        private @Nullable ActionRuleSuppressionConditionAlertRuleId alertRuleId;
        private @Nullable ActionRuleSuppressionConditionDescription description;
        private @Nullable ActionRuleSuppressionConditionMonitor monitor;
        private @Nullable ActionRuleSuppressionConditionMonitorService monitorService;
        private @Nullable ActionRuleSuppressionConditionSeverity severity;
        private @Nullable ActionRuleSuppressionConditionTargetResourceType targetResourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(ActionRuleSuppressionCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertContext = defaults.alertContext;
    	      this.alertRuleId = defaults.alertRuleId;
    	      this.description = defaults.description;
    	      this.monitor = defaults.monitor;
    	      this.monitorService = defaults.monitorService;
    	      this.severity = defaults.severity;
    	      this.targetResourceType = defaults.targetResourceType;
        }

        public Builder alertContext(@Nullable ActionRuleSuppressionConditionAlertContext alertContext) {
            this.alertContext = alertContext;
            return this;
        }
        public Builder alertRuleId(@Nullable ActionRuleSuppressionConditionAlertRuleId alertRuleId) {
            this.alertRuleId = alertRuleId;
            return this;
        }
        public Builder description(@Nullable ActionRuleSuppressionConditionDescription description) {
            this.description = description;
            return this;
        }
        public Builder monitor(@Nullable ActionRuleSuppressionConditionMonitor monitor) {
            this.monitor = monitor;
            return this;
        }
        public Builder monitorService(@Nullable ActionRuleSuppressionConditionMonitorService monitorService) {
            this.monitorService = monitorService;
            return this;
        }
        public Builder severity(@Nullable ActionRuleSuppressionConditionSeverity severity) {
            this.severity = severity;
            return this;
        }
        public Builder targetResourceType(@Nullable ActionRuleSuppressionConditionTargetResourceType targetResourceType) {
            this.targetResourceType = targetResourceType;
            return this;
        }        public ActionRuleSuppressionCondition build() {
            return new ActionRuleSuppressionCondition(alertContext, alertRuleId, description, monitor, monitorService, severity, targetResourceType);
        }
    }
}
