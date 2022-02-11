// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.outputs;

import io.pulumi.awsnative.networkfirewall.outputs.RuleGroupRuleVariables;
import io.pulumi.awsnative.networkfirewall.outputs.RuleGroupRulesSource;
import io.pulumi.awsnative.networkfirewall.outputs.RuleGroupStatefulRuleOptions;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroup {
    private final @Nullable RuleGroupRuleVariables ruleVariables;
    private final RuleGroupRulesSource rulesSource;
    private final @Nullable RuleGroupStatefulRuleOptions statefulRuleOptions;

    @OutputCustomType.Constructor({"ruleVariables","rulesSource","statefulRuleOptions"})
    private RuleGroup(
        @Nullable RuleGroupRuleVariables ruleVariables,
        RuleGroupRulesSource rulesSource,
        @Nullable RuleGroupStatefulRuleOptions statefulRuleOptions) {
        this.ruleVariables = ruleVariables;
        this.rulesSource = Objects.requireNonNull(rulesSource);
        this.statefulRuleOptions = statefulRuleOptions;
    }

    public Optional<RuleGroupRuleVariables> getRuleVariables() {
        return Optional.ofNullable(this.ruleVariables);
    }
    public RuleGroupRulesSource getRulesSource() {
        return this.rulesSource;
    }
    public Optional<RuleGroupStatefulRuleOptions> getStatefulRuleOptions() {
        return Optional.ofNullable(this.statefulRuleOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRuleVariables ruleVariables;
        private RuleGroupRulesSource rulesSource;
        private @Nullable RuleGroupStatefulRuleOptions statefulRuleOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleVariables = defaults.ruleVariables;
    	      this.rulesSource = defaults.rulesSource;
    	      this.statefulRuleOptions = defaults.statefulRuleOptions;
        }

        public Builder setRuleVariables(@Nullable RuleGroupRuleVariables ruleVariables) {
            this.ruleVariables = ruleVariables;
            return this;
        }

        public Builder setRulesSource(RuleGroupRulesSource rulesSource) {
            this.rulesSource = Objects.requireNonNull(rulesSource);
            return this;
        }

        public Builder setStatefulRuleOptions(@Nullable RuleGroupStatefulRuleOptions statefulRuleOptions) {
            this.statefulRuleOptions = statefulRuleOptions;
            return this;
        }

        public RuleGroup build() {
            return new RuleGroup(ruleVariables, rulesSource, statefulRuleOptions);
        }
    }
}
