// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.outputs;

import io.pulumi.awsnative.networkfirewall.outputs.RuleGroupRuleDefinition;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class RuleGroupStatelessRule {
    private final Integer priority;
    private final RuleGroupRuleDefinition ruleDefinition;

    @OutputCustomType.Constructor({"priority","ruleDefinition"})
    private RuleGroupStatelessRule(
        Integer priority,
        RuleGroupRuleDefinition ruleDefinition) {
        this.priority = Objects.requireNonNull(priority);
        this.ruleDefinition = Objects.requireNonNull(ruleDefinition);
    }

    public Integer getPriority() {
        return this.priority;
    }
    public RuleGroupRuleDefinition getRuleDefinition() {
        return this.ruleDefinition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupStatelessRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer priority;
        private RuleGroupRuleDefinition ruleDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupStatelessRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.ruleDefinition = defaults.ruleDefinition;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setRuleDefinition(RuleGroupRuleDefinition ruleDefinition) {
            this.ruleDefinition = Objects.requireNonNull(ruleDefinition);
            return this;
        }

        public RuleGroupStatelessRule build() {
            return new RuleGroupStatelessRule(priority, ruleDefinition);
        }
    }
}
