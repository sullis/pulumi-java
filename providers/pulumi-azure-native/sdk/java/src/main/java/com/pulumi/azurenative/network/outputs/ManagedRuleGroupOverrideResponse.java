// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.ManagedRuleOverrideResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ManagedRuleGroupOverrideResponse {
    /**
     * @return The managed rule group to override.
     * 
     */
    private final String ruleGroupName;
    /**
     * @return List of rules that will be disabled. If none specified, all rules in the group will be disabled.
     * 
     */
    private final @Nullable List<ManagedRuleOverrideResponse> rules;

    @CustomType.Constructor
    private ManagedRuleGroupOverrideResponse(
        @CustomType.Parameter("ruleGroupName") String ruleGroupName,
        @CustomType.Parameter("rules") @Nullable List<ManagedRuleOverrideResponse> rules) {
        this.ruleGroupName = ruleGroupName;
        this.rules = rules;
    }

    /**
     * @return The managed rule group to override.
     * 
     */
    public String ruleGroupName() {
        return this.ruleGroupName;
    }
    /**
     * @return List of rules that will be disabled. If none specified, all rules in the group will be disabled.
     * 
     */
    public List<ManagedRuleOverrideResponse> rules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedRuleGroupOverrideResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ruleGroupName;
        private @Nullable List<ManagedRuleOverrideResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedRuleGroupOverrideResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleGroupName = defaults.ruleGroupName;
    	      this.rules = defaults.rules;
        }

        public Builder ruleGroupName(String ruleGroupName) {
            this.ruleGroupName = Objects.requireNonNull(ruleGroupName);
            return this;
        }
        public Builder rules(@Nullable List<ManagedRuleOverrideResponse> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(ManagedRuleOverrideResponse... rules) {
            return rules(List.of(rules));
        }        public ManagedRuleGroupOverrideResponse build() {
            return new ManagedRuleGroupOverrideResponse(ruleGroupName, rules);
        }
    }
}
