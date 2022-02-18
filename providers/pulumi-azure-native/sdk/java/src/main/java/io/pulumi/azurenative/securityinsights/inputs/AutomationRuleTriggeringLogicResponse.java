// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.inputs.AutomationRulePropertyValuesConditionResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes automation rule triggering logic
 * 
 */
public final class AutomationRuleTriggeringLogicResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutomationRuleTriggeringLogicResponse Empty = new AutomationRuleTriggeringLogicResponse();

    /**
     * The conditions to evaluate to determine if the automation rule should be triggered on a given object
     * 
     */
    @InputImport(name="conditions")
    private final @Nullable List<AutomationRulePropertyValuesConditionResponse> conditions;

    public List<AutomationRulePropertyValuesConditionResponse> getConditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }

    /**
     * Determines when the automation rule should automatically expire and be disabled.
     * 
     */
    @InputImport(name="expirationTimeUtc")
    private final @Nullable String expirationTimeUtc;

    public Optional<String> getExpirationTimeUtc() {
        return this.expirationTimeUtc == null ? Optional.empty() : Optional.ofNullable(this.expirationTimeUtc);
    }

    /**
     * Determines whether the automation rule is enabled or disabled.
     * 
     */
    @InputImport(name="isEnabled", required=true)
    private final Boolean isEnabled;

    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * The type of object the automation rule triggers on
     * 
     */
    @InputImport(name="triggersOn", required=true)
    private final String triggersOn;

    public String getTriggersOn() {
        return this.triggersOn;
    }

    /**
     * The type of event the automation rule triggers on
     * 
     */
    @InputImport(name="triggersWhen", required=true)
    private final String triggersWhen;

    public String getTriggersWhen() {
        return this.triggersWhen;
    }

    public AutomationRuleTriggeringLogicResponse(
        @Nullable List<AutomationRulePropertyValuesConditionResponse> conditions,
        @Nullable String expirationTimeUtc,
        Boolean isEnabled,
        String triggersOn,
        String triggersWhen) {
        this.conditions = conditions;
        this.expirationTimeUtc = expirationTimeUtc;
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.triggersOn = Objects.requireNonNull(triggersOn, "expected parameter 'triggersOn' to be non-null");
        this.triggersWhen = Objects.requireNonNull(triggersWhen, "expected parameter 'triggersWhen' to be non-null");
    }

    private AutomationRuleTriggeringLogicResponse() {
        this.conditions = List.of();
        this.expirationTimeUtc = null;
        this.isEnabled = null;
        this.triggersOn = null;
        this.triggersWhen = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationRuleTriggeringLogicResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AutomationRulePropertyValuesConditionResponse> conditions;
        private @Nullable String expirationTimeUtc;
        private Boolean isEnabled;
        private String triggersOn;
        private String triggersWhen;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationRuleTriggeringLogicResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.expirationTimeUtc = defaults.expirationTimeUtc;
    	      this.isEnabled = defaults.isEnabled;
    	      this.triggersOn = defaults.triggersOn;
    	      this.triggersWhen = defaults.triggersWhen;
        }

        public Builder setConditions(@Nullable List<AutomationRulePropertyValuesConditionResponse> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setExpirationTimeUtc(@Nullable String expirationTimeUtc) {
            this.expirationTimeUtc = expirationTimeUtc;
            return this;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder setTriggersOn(String triggersOn) {
            this.triggersOn = Objects.requireNonNull(triggersOn);
            return this;
        }

        public Builder setTriggersWhen(String triggersWhen) {
            this.triggersWhen = Objects.requireNonNull(triggersWhen);
            return this;
        }

        public AutomationRuleTriggeringLogicResponse build() {
            return new AutomationRuleTriggeringLogicResponse(conditions, expirationTimeUtc, isEnabled, triggersOn, triggersWhen);
        }
    }
}
