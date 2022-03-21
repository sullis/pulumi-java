// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.FrontDoorManagedRuleOverrideResponse;
import io.pulumi.azurenative.network.outputs.ManagedRuleExclusionResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class FrontDoorManagedRuleGroupOverrideResponse {
    /**
     * Describes the exclusions that are applied to all rules in the group.
     * 
     */
    private final @Nullable List<ManagedRuleExclusionResponse> exclusions;
    /**
     * Describes the managed rule group to override.
     * 
     */
    private final String ruleGroupName;
    /**
     * List of rules that will be disabled. If none specified, all rules in the group will be disabled.
     * 
     */
    private final @Nullable List<FrontDoorManagedRuleOverrideResponse> rules;

    @CustomType.Constructor
    private FrontDoorManagedRuleGroupOverrideResponse(
        @CustomType.Parameter("exclusions") @Nullable List<ManagedRuleExclusionResponse> exclusions,
        @CustomType.Parameter("ruleGroupName") String ruleGroupName,
        @CustomType.Parameter("rules") @Nullable List<FrontDoorManagedRuleOverrideResponse> rules) {
        this.exclusions = exclusions;
        this.ruleGroupName = ruleGroupName;
        this.rules = rules;
    }

    /**
     * Describes the exclusions that are applied to all rules in the group.
     * 
    */
    public List<ManagedRuleExclusionResponse> getExclusions() {
        return this.exclusions == null ? List.of() : this.exclusions;
    }
    /**
     * Describes the managed rule group to override.
     * 
    */
    public String getRuleGroupName() {
        return this.ruleGroupName;
    }
    /**
     * List of rules that will be disabled. If none specified, all rules in the group will be disabled.
     * 
    */
    public List<FrontDoorManagedRuleOverrideResponse> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontDoorManagedRuleGroupOverrideResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ManagedRuleExclusionResponse> exclusions;
        private String ruleGroupName;
        private @Nullable List<FrontDoorManagedRuleOverrideResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(FrontDoorManagedRuleGroupOverrideResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exclusions = defaults.exclusions;
    	      this.ruleGroupName = defaults.ruleGroupName;
    	      this.rules = defaults.rules;
        }

        public Builder exclusions(@Nullable List<ManagedRuleExclusionResponse> exclusions) {
            this.exclusions = exclusions;
            return this;
        }
        public Builder exclusions(ManagedRuleExclusionResponse... exclusions) {
            return exclusions(List.of(exclusions));
        }
        public Builder ruleGroupName(String ruleGroupName) {
            this.ruleGroupName = Objects.requireNonNull(ruleGroupName);
            return this;
        }
        public Builder rules(@Nullable List<FrontDoorManagedRuleOverrideResponse> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(FrontDoorManagedRuleOverrideResponse... rules) {
            return rules(List.of(rules));
        }        public FrontDoorManagedRuleGroupOverrideResponse build() {
            return new FrontDoorManagedRuleGroupOverrideResponse(exclusions, ruleGroupName, rules);
        }
    }
}
