// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AllowlistCustomAlertRuleResponse {
    /**
     * The values to allow. The format of the values depends on the rule type.
     * 
     */
    private final List<String> allowlistValues;
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
     * The type of the custom alert rule.
     * Expected value is 'AllowlistCustomAlertRule'.
     * 
     */
    private final String ruleType;
    /**
     * The value type of the items in the list.
     * 
     */
    private final String valueType;

    @OutputCustomType.Constructor({"allowlistValues","description","displayName","isEnabled","ruleType","valueType"})
    private AllowlistCustomAlertRuleResponse(
        List<String> allowlistValues,
        String description,
        String displayName,
        Boolean isEnabled,
        String ruleType,
        String valueType) {
        this.allowlistValues = Objects.requireNonNull(allowlistValues);
        this.description = Objects.requireNonNull(description);
        this.displayName = Objects.requireNonNull(displayName);
        this.isEnabled = Objects.requireNonNull(isEnabled);
        this.ruleType = Objects.requireNonNull(ruleType);
        this.valueType = Objects.requireNonNull(valueType);
    }

    /**
     * The values to allow. The format of the values depends on the rule type.
     * 
     */
    public List<String> getAllowlistValues() {
        return this.allowlistValues;
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
     * The type of the custom alert rule.
     * Expected value is 'AllowlistCustomAlertRule'.
     * 
     */
    public String getRuleType() {
        return this.ruleType;
    }
    /**
     * The value type of the items in the list.
     * 
     */
    public String getValueType() {
        return this.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllowlistCustomAlertRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowlistValues;
        private String description;
        private String displayName;
        private Boolean isEnabled;
        private String ruleType;
        private String valueType;

        public Builder() {
    	      // Empty
        }

        public Builder(AllowlistCustomAlertRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowlistValues = defaults.allowlistValues;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.isEnabled = defaults.isEnabled;
    	      this.ruleType = defaults.ruleType;
    	      this.valueType = defaults.valueType;
        }

        public Builder setAllowlistValues(List<String> allowlistValues) {
            this.allowlistValues = Objects.requireNonNull(allowlistValues);
            return this;
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

        public Builder setRuleType(String ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }

        public Builder setValueType(String valueType) {
            this.valueType = Objects.requireNonNull(valueType);
            return this;
        }

        public AllowlistCustomAlertRuleResponse build() {
            return new AllowlistCustomAlertRuleResponse(allowlistValues, description, displayName, isEnabled, ruleType, valueType);
        }
    }
}
