// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.securityinsights.enums.AlertSeverity;
import io.pulumi.azurenative.securityinsights.enums.AttackTactic;
import io.pulumi.azurenative.securityinsights.enums.TriggerOperator;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScheduledAlertRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduledAlertRuleArgs Empty = new ScheduledAlertRuleArgs();

    /**
     * The Name of the alert rule template used to create this rule.
     * 
     */
    @Import(name="alertRuleTemplateName")
      private final @Nullable Output<String> alertRuleTemplateName;

    public Output<String> getAlertRuleTemplateName() {
        return this.alertRuleTemplateName == null ? Output.empty() : this.alertRuleTemplateName;
    }

    /**
     * The description of the alert rule.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The display name for alerts created by this alert rule.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Determines whether this alert rule is enabled or disabled.
     * 
     */
    @Import(name="enabled", required=true)
      private final Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled;
    }

    /**
     * The kind of the alert rule
     * Expected value is 'Scheduled'.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }

    /**
     * The query that creates alerts for this rule.
     * 
     */
    @Import(name="query", required=true)
      private final Output<String> query;

    public Output<String> getQuery() {
        return this.query;
    }

    /**
     * The frequency (in ISO 8601 duration format) for this alert rule to run.
     * 
     */
    @Import(name="queryFrequency", required=true)
      private final Output<String> queryFrequency;

    public Output<String> getQueryFrequency() {
        return this.queryFrequency;
    }

    /**
     * The period (in ISO 8601 duration format) that this alert rule looks at.
     * 
     */
    @Import(name="queryPeriod", required=true)
      private final Output<String> queryPeriod;

    public Output<String> getQueryPeriod() {
        return this.queryPeriod;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Alert rule ID
     * 
     */
    @Import(name="ruleId")
      private final @Nullable Output<String> ruleId;

    public Output<String> getRuleId() {
        return this.ruleId == null ? Output.empty() : this.ruleId;
    }

    /**
     * The severity for alerts created by this alert rule.
     * 
     */
    @Import(name="severity", required=true)
      private final Output<Either<String,AlertSeverity>> severity;

    public Output<Either<String,AlertSeverity>> getSeverity() {
        return this.severity;
    }

    /**
     * The suppression (in ISO 8601 duration format) to wait since last time this alert rule been triggered.
     * 
     */
    @Import(name="suppressionDuration", required=true)
      private final Output<String> suppressionDuration;

    public Output<String> getSuppressionDuration() {
        return this.suppressionDuration;
    }

    /**
     * Determines whether the suppression for this alert rule is enabled or disabled.
     * 
     */
    @Import(name="suppressionEnabled", required=true)
      private final Output<Boolean> suppressionEnabled;

    public Output<Boolean> getSuppressionEnabled() {
        return this.suppressionEnabled;
    }

    /**
     * The tactics of the alert rule
     * 
     */
    @Import(name="tactics")
      private final @Nullable Output<List<Either<String,AttackTactic>>> tactics;

    public Output<List<Either<String,AttackTactic>>> getTactics() {
        return this.tactics == null ? Output.empty() : this.tactics;
    }

    /**
     * The operation against the threshold that triggers alert rule.
     * 
     */
    @Import(name="triggerOperator", required=true)
      private final Output<TriggerOperator> triggerOperator;

    public Output<TriggerOperator> getTriggerOperator() {
        return this.triggerOperator;
    }

    /**
     * The threshold triggers this alert rule.
     * 
     */
    @Import(name="triggerThreshold", required=true)
      private final Output<Integer> triggerThreshold;

    public Output<Integer> getTriggerThreshold() {
        return this.triggerThreshold;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public ScheduledAlertRuleArgs(
        @Nullable Output<String> alertRuleTemplateName,
        @Nullable Output<String> description,
        Output<String> displayName,
        Output<Boolean> enabled,
        Output<String> kind,
        Output<String> query,
        Output<String> queryFrequency,
        Output<String> queryPeriod,
        Output<String> resourceGroupName,
        @Nullable Output<String> ruleId,
        Output<Either<String,AlertSeverity>> severity,
        Output<String> suppressionDuration,
        Output<Boolean> suppressionEnabled,
        @Nullable Output<List<Either<String,AttackTactic>>> tactics,
        Output<TriggerOperator> triggerOperator,
        Output<Integer> triggerThreshold,
        Output<String> workspaceName) {
        this.alertRuleTemplateName = alertRuleTemplateName;
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.query = Objects.requireNonNull(query, "expected parameter 'query' to be non-null");
        this.queryFrequency = Objects.requireNonNull(queryFrequency, "expected parameter 'queryFrequency' to be non-null");
        this.queryPeriod = Objects.requireNonNull(queryPeriod, "expected parameter 'queryPeriod' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleId = ruleId;
        this.severity = Objects.requireNonNull(severity, "expected parameter 'severity' to be non-null");
        this.suppressionDuration = Objects.requireNonNull(suppressionDuration, "expected parameter 'suppressionDuration' to be non-null");
        this.suppressionEnabled = Objects.requireNonNull(suppressionEnabled, "expected parameter 'suppressionEnabled' to be non-null");
        this.tactics = tactics;
        this.triggerOperator = Objects.requireNonNull(triggerOperator, "expected parameter 'triggerOperator' to be non-null");
        this.triggerThreshold = Objects.requireNonNull(triggerThreshold, "expected parameter 'triggerThreshold' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private ScheduledAlertRuleArgs() {
        this.alertRuleTemplateName = Output.empty();
        this.description = Output.empty();
        this.displayName = Output.empty();
        this.enabled = Output.empty();
        this.kind = Output.empty();
        this.query = Output.empty();
        this.queryFrequency = Output.empty();
        this.queryPeriod = Output.empty();
        this.resourceGroupName = Output.empty();
        this.ruleId = Output.empty();
        this.severity = Output.empty();
        this.suppressionDuration = Output.empty();
        this.suppressionEnabled = Output.empty();
        this.tactics = Output.empty();
        this.triggerOperator = Output.empty();
        this.triggerThreshold = Output.empty();
        this.workspaceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledAlertRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> alertRuleTemplateName;
        private @Nullable Output<String> description;
        private Output<String> displayName;
        private Output<Boolean> enabled;
        private Output<String> kind;
        private Output<String> query;
        private Output<String> queryFrequency;
        private Output<String> queryPeriod;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> ruleId;
        private Output<Either<String,AlertSeverity>> severity;
        private Output<String> suppressionDuration;
        private Output<Boolean> suppressionEnabled;
        private @Nullable Output<List<Either<String,AttackTactic>>> tactics;
        private Output<TriggerOperator> triggerOperator;
        private Output<Integer> triggerThreshold;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledAlertRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertRuleTemplateName = defaults.alertRuleTemplateName;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.enabled = defaults.enabled;
    	      this.kind = defaults.kind;
    	      this.query = defaults.query;
    	      this.queryFrequency = defaults.queryFrequency;
    	      this.queryPeriod = defaults.queryPeriod;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleId = defaults.ruleId;
    	      this.severity = defaults.severity;
    	      this.suppressionDuration = defaults.suppressionDuration;
    	      this.suppressionEnabled = defaults.suppressionEnabled;
    	      this.tactics = defaults.tactics;
    	      this.triggerOperator = defaults.triggerOperator;
    	      this.triggerThreshold = defaults.triggerThreshold;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder alertRuleTemplateName(@Nullable Output<String> alertRuleTemplateName) {
            this.alertRuleTemplateName = alertRuleTemplateName;
            return this;
        }
        public Builder alertRuleTemplateName(@Nullable String alertRuleTemplateName) {
            this.alertRuleTemplateName = Output.ofNullable(alertRuleTemplateName);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder enabled(Output<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Output.of(Objects.requireNonNull(enabled));
            return this;
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder query(Output<String> query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        public Builder query(String query) {
            this.query = Output.of(Objects.requireNonNull(query));
            return this;
        }
        public Builder queryFrequency(Output<String> queryFrequency) {
            this.queryFrequency = Objects.requireNonNull(queryFrequency);
            return this;
        }
        public Builder queryFrequency(String queryFrequency) {
            this.queryFrequency = Output.of(Objects.requireNonNull(queryFrequency));
            return this;
        }
        public Builder queryPeriod(Output<String> queryPeriod) {
            this.queryPeriod = Objects.requireNonNull(queryPeriod);
            return this;
        }
        public Builder queryPeriod(String queryPeriod) {
            this.queryPeriod = Output.of(Objects.requireNonNull(queryPeriod));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder ruleId(@Nullable Output<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Builder ruleId(@Nullable String ruleId) {
            this.ruleId = Output.ofNullable(ruleId);
            return this;
        }
        public Builder severity(Output<Either<String,AlertSeverity>> severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        public Builder severity(Either<String,AlertSeverity> severity) {
            this.severity = Output.of(Objects.requireNonNull(severity));
            return this;
        }
        public Builder suppressionDuration(Output<String> suppressionDuration) {
            this.suppressionDuration = Objects.requireNonNull(suppressionDuration);
            return this;
        }
        public Builder suppressionDuration(String suppressionDuration) {
            this.suppressionDuration = Output.of(Objects.requireNonNull(suppressionDuration));
            return this;
        }
        public Builder suppressionEnabled(Output<Boolean> suppressionEnabled) {
            this.suppressionEnabled = Objects.requireNonNull(suppressionEnabled);
            return this;
        }
        public Builder suppressionEnabled(Boolean suppressionEnabled) {
            this.suppressionEnabled = Output.of(Objects.requireNonNull(suppressionEnabled));
            return this;
        }
        public Builder tactics(@Nullable Output<List<Either<String,AttackTactic>>> tactics) {
            this.tactics = tactics;
            return this;
        }
        public Builder tactics(@Nullable List<Either<String,AttackTactic>> tactics) {
            this.tactics = Output.ofNullable(tactics);
            return this;
        }
        public Builder tactics(Either<String,AttackTactic>... tactics) {
            return tactics(List.of(tactics));
        }
        public Builder triggerOperator(Output<TriggerOperator> triggerOperator) {
            this.triggerOperator = Objects.requireNonNull(triggerOperator);
            return this;
        }
        public Builder triggerOperator(TriggerOperator triggerOperator) {
            this.triggerOperator = Output.of(Objects.requireNonNull(triggerOperator));
            return this;
        }
        public Builder triggerThreshold(Output<Integer> triggerThreshold) {
            this.triggerThreshold = Objects.requireNonNull(triggerThreshold);
            return this;
        }
        public Builder triggerThreshold(Integer triggerThreshold) {
            this.triggerThreshold = Output.of(Objects.requireNonNull(triggerThreshold));
            return this;
        }
        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }        public ScheduledAlertRuleArgs build() {
            return new ScheduledAlertRuleArgs(alertRuleTemplateName, description, displayName, enabled, kind, query, queryFrequency, queryPeriod, resourceGroupName, ruleId, severity, suppressionDuration, suppressionEnabled, tactics, triggerOperator, triggerThreshold, workspaceName);
        }
    }
}
