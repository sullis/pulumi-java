// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.outputs;

import io.pulumi.aws.networkfirewall.outputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinition;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRule {
    /**
     * A setting that indicates the order in which to run this rule relative to all of the rules that are defined for a stateless rule group. AWS Network Firewall evaluates the rules in a rule group starting with the lowest priority setting.
     * 
     */
    private final Integer priority;
    /**
     * A configuration block defining the stateless 5-tuple packet inspection criteria and the action to take on a packet that matches the criteria. See Rule Definition below for details.
     * 
     */
    private final RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinition ruleDefinition;

    @CustomType.Constructor
    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRule(
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("ruleDefinition") RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinition ruleDefinition) {
        this.priority = priority;
        this.ruleDefinition = ruleDefinition;
    }

    /**
     * A setting that indicates the order in which to run this rule relative to all of the rules that are defined for a stateless rule group. AWS Network Firewall evaluates the rules in a rule group starting with the lowest priority setting.
     * 
    */
    public Integer priority() {
        return this.priority;
    }
    /**
     * A configuration block defining the stateless 5-tuple packet inspection criteria and the action to take on a packet that matches the criteria. See Rule Definition below for details.
     * 
    */
    public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinition ruleDefinition() {
        return this.ruleDefinition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer priority;
        private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinition ruleDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.ruleDefinition = defaults.ruleDefinition;
        }

        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder ruleDefinition(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinition ruleDefinition) {
            this.ruleDefinition = Objects.requireNonNull(ruleDefinition);
            return this;
        }        public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRule build() {
            return new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRule(priority, ruleDefinition);
        }
    }
}
