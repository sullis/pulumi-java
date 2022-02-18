// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TimeWindowCustomAlertRuleResponse {
    /**
     * The description of the custom alert.
     * 
     */
    private final String description;
    /**
     * The display name of the custom alert.
     * 
     */
    private final String displayName;
    /**
     * Status of the custom alert.
     * 
     */
    private final Boolean isEnabled;
    /**
     * The maximum threshold.
     * 
     */
    private final Integer maxThreshold;
    /**
     * The minimum threshold.
     * 
     */
    private final Integer minThreshold;
    /**
     * The type of the custom alert rule.
     * Expected value is 'TimeWindowCustomAlertRule'.
     * 
     */
    private final String ruleType;
    /**
     * The time window size in iso8601 format.
     * 
     */
    private final String timeWindowSize;

    @OutputCustomType.Constructor({"description","displayName","isEnabled","maxThreshold","minThreshold","ruleType","timeWindowSize"})
    private TimeWindowCustomAlertRuleResponse(
        String description,
        String displayName,
        Boolean isEnabled,
        Integer maxThreshold,
        Integer minThreshold,
        String ruleType,
        String timeWindowSize) {
        this.description = Objects.requireNonNull(description);
        this.displayName = Objects.requireNonNull(displayName);
        this.isEnabled = Objects.requireNonNull(isEnabled);
        this.maxThreshold = Objects.requireNonNull(maxThreshold);
        this.minThreshold = Objects.requireNonNull(minThreshold);
        this.ruleType = Objects.requireNonNull(ruleType);
        this.timeWindowSize = Objects.requireNonNull(timeWindowSize);
    }

    /**
     * The description of the custom alert.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * The display name of the custom alert.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Status of the custom alert.
     * 
     */
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * The maximum threshold.
     * 
     */
    public Integer getMaxThreshold() {
        return this.maxThreshold;
    }
    /**
     * The minimum threshold.
     * 
     */
    public Integer getMinThreshold() {
        return this.minThreshold;
    }
    /**
     * The type of the custom alert rule.
     * Expected value is 'TimeWindowCustomAlertRule'.
     * 
     */
    public String getRuleType() {
        return this.ruleType;
    }
    /**
     * The time window size in iso8601 format.
     * 
     */
    public String getTimeWindowSize() {
        return this.timeWindowSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeWindowCustomAlertRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String displayName;
        private Boolean isEnabled;
        private Integer maxThreshold;
        private Integer minThreshold;
        private String ruleType;
        private String timeWindowSize;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeWindowCustomAlertRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.isEnabled = defaults.isEnabled;
    	      this.maxThreshold = defaults.maxThreshold;
    	      this.minThreshold = defaults.minThreshold;
    	      this.ruleType = defaults.ruleType;
    	      this.timeWindowSize = defaults.timeWindowSize;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder setMaxThreshold(Integer maxThreshold) {
            this.maxThreshold = Objects.requireNonNull(maxThreshold);
            return this;
        }

        public Builder setMinThreshold(Integer minThreshold) {
            this.minThreshold = Objects.requireNonNull(minThreshold);
            return this;
        }

        public Builder setRuleType(String ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }

        public Builder setTimeWindowSize(String timeWindowSize) {
            this.timeWindowSize = Objects.requireNonNull(timeWindowSize);
            return this;
        }

        public TimeWindowCustomAlertRuleResponse build() {
            return new TimeWindowCustomAlertRuleResponse(description, displayName, isEnabled, maxThreshold, minThreshold, ruleType, timeWindowSize);
        }
    }
}
