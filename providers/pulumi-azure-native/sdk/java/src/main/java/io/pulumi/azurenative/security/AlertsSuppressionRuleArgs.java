// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.security.enums.RuleState;
import io.pulumi.azurenative.security.inputs.SuppressionAlertsScopeArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlertsSuppressionRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertsSuppressionRuleArgs Empty = new AlertsSuppressionRuleArgs();

    /**
     * Type of the alert to automatically suppress. For all alert types, use '*'
     * 
     */
    @Import(name="alertType", required=true)
      private final Output<String> alertType;

    public Output<String> getAlertType() {
        return this.alertType;
    }

    /**
     * The unique name of the suppression alert rule
     * 
     */
    @Import(name="alertsSuppressionRuleName")
      private final @Nullable Output<String> alertsSuppressionRuleName;

    public Output<String> getAlertsSuppressionRuleName() {
        return this.alertsSuppressionRuleName == null ? Output.empty() : this.alertsSuppressionRuleName;
    }

    /**
     * Any comment regarding the rule
     * 
     */
    @Import(name="comment")
      private final @Nullable Output<String> comment;

    public Output<String> getComment() {
        return this.comment == null ? Output.empty() : this.comment;
    }

    /**
     * Expiration date of the rule, if value is not provided or provided as null this field will default to the maximum allowed expiration date.
     * 
     */
    @Import(name="expirationDateUtc")
      private final @Nullable Output<String> expirationDateUtc;

    public Output<String> getExpirationDateUtc() {
        return this.expirationDateUtc == null ? Output.empty() : this.expirationDateUtc;
    }

    /**
     * The reason for dismissing the alert
     * 
     */
    @Import(name="reason", required=true)
      private final Output<String> reason;

    public Output<String> getReason() {
        return this.reason;
    }

    /**
     * Possible states of the rule
     * 
     */
    @Import(name="state", required=true)
      private final Output<Either<String,RuleState>> state;

    public Output<Either<String,RuleState>> getState() {
        return this.state;
    }

    /**
     * The suppression conditions
     * 
     */
    @Import(name="suppressionAlertsScope")
      private final @Nullable Output<SuppressionAlertsScopeArgs> suppressionAlertsScope;

    public Output<SuppressionAlertsScopeArgs> getSuppressionAlertsScope() {
        return this.suppressionAlertsScope == null ? Output.empty() : this.suppressionAlertsScope;
    }

    public AlertsSuppressionRuleArgs(
        Output<String> alertType,
        @Nullable Output<String> alertsSuppressionRuleName,
        @Nullable Output<String> comment,
        @Nullable Output<String> expirationDateUtc,
        Output<String> reason,
        Output<Either<String,RuleState>> state,
        @Nullable Output<SuppressionAlertsScopeArgs> suppressionAlertsScope) {
        this.alertType = Objects.requireNonNull(alertType, "expected parameter 'alertType' to be non-null");
        this.alertsSuppressionRuleName = alertsSuppressionRuleName;
        this.comment = comment;
        this.expirationDateUtc = expirationDateUtc;
        this.reason = Objects.requireNonNull(reason, "expected parameter 'reason' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.suppressionAlertsScope = suppressionAlertsScope;
    }

    private AlertsSuppressionRuleArgs() {
        this.alertType = Output.empty();
        this.alertsSuppressionRuleName = Output.empty();
        this.comment = Output.empty();
        this.expirationDateUtc = Output.empty();
        this.reason = Output.empty();
        this.state = Output.empty();
        this.suppressionAlertsScope = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertsSuppressionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> alertType;
        private @Nullable Output<String> alertsSuppressionRuleName;
        private @Nullable Output<String> comment;
        private @Nullable Output<String> expirationDateUtc;
        private Output<String> reason;
        private Output<Either<String,RuleState>> state;
        private @Nullable Output<SuppressionAlertsScopeArgs> suppressionAlertsScope;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertsSuppressionRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertType = defaults.alertType;
    	      this.alertsSuppressionRuleName = defaults.alertsSuppressionRuleName;
    	      this.comment = defaults.comment;
    	      this.expirationDateUtc = defaults.expirationDateUtc;
    	      this.reason = defaults.reason;
    	      this.state = defaults.state;
    	      this.suppressionAlertsScope = defaults.suppressionAlertsScope;
        }

        public Builder alertType(Output<String> alertType) {
            this.alertType = Objects.requireNonNull(alertType);
            return this;
        }
        public Builder alertType(String alertType) {
            this.alertType = Output.of(Objects.requireNonNull(alertType));
            return this;
        }
        public Builder alertsSuppressionRuleName(@Nullable Output<String> alertsSuppressionRuleName) {
            this.alertsSuppressionRuleName = alertsSuppressionRuleName;
            return this;
        }
        public Builder alertsSuppressionRuleName(@Nullable String alertsSuppressionRuleName) {
            this.alertsSuppressionRuleName = Output.ofNullable(alertsSuppressionRuleName);
            return this;
        }
        public Builder comment(@Nullable Output<String> comment) {
            this.comment = comment;
            return this;
        }
        public Builder comment(@Nullable String comment) {
            this.comment = Output.ofNullable(comment);
            return this;
        }
        public Builder expirationDateUtc(@Nullable Output<String> expirationDateUtc) {
            this.expirationDateUtc = expirationDateUtc;
            return this;
        }
        public Builder expirationDateUtc(@Nullable String expirationDateUtc) {
            this.expirationDateUtc = Output.ofNullable(expirationDateUtc);
            return this;
        }
        public Builder reason(Output<String> reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }
        public Builder reason(String reason) {
            this.reason = Output.of(Objects.requireNonNull(reason));
            return this;
        }
        public Builder state(Output<Either<String,RuleState>> state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder state(Either<String,RuleState> state) {
            this.state = Output.of(Objects.requireNonNull(state));
            return this;
        }
        public Builder suppressionAlertsScope(@Nullable Output<SuppressionAlertsScopeArgs> suppressionAlertsScope) {
            this.suppressionAlertsScope = suppressionAlertsScope;
            return this;
        }
        public Builder suppressionAlertsScope(@Nullable SuppressionAlertsScopeArgs suppressionAlertsScope) {
            this.suppressionAlertsScope = Output.ofNullable(suppressionAlertsScope);
            return this;
        }        public AlertsSuppressionRuleArgs build() {
            return new AlertsSuppressionRuleArgs(alertType, alertsSuppressionRuleName, comment, expirationDateUtc, reason, state, suppressionAlertsScope);
        }
    }
}
