// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.RuleGroupRuleAction;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleRuleLabel;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleVisibilityConfig;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRule {
    /**
     * The action that AWS WAF should take on a web request when it matches the rule's statement. Settings at the `aws.wafv2.WebAcl` level can override the rule action setting. See Action below for details.
     * 
     */
    private final RuleGroupRuleAction action;
    /**
     * A friendly name of the rule.
     * 
     */
    private final String name;
    /**
     * If you define more than one Rule in a WebACL, AWS WAF evaluates each request against the `rules` in order based on the value of `priority`. AWS WAF processes rules with lower priority first.
     * 
     */
    private final Integer priority;
    /**
     * Labels to apply to web requests that match the rule match statement. See Rule Label below for details.
     * 
     */
    private final @Nullable List<RuleGroupRuleRuleLabel> ruleLabels;
    /**
     * The AWS WAF processing statement for the rule, for example `byte_match_statement` or `geo_match_statement`. See Statement below for details.
     * 
     */
    private final RuleGroupRuleStatement statement;
    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * 
     */
    private final RuleGroupRuleVisibilityConfig visibilityConfig;

    @CustomType.Constructor
    private RuleGroupRule(
        @CustomType.Parameter("action") RuleGroupRuleAction action,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("ruleLabels") @Nullable List<RuleGroupRuleRuleLabel> ruleLabels,
        @CustomType.Parameter("statement") RuleGroupRuleStatement statement,
        @CustomType.Parameter("visibilityConfig") RuleGroupRuleVisibilityConfig visibilityConfig) {
        this.action = action;
        this.name = name;
        this.priority = priority;
        this.ruleLabels = ruleLabels;
        this.statement = statement;
        this.visibilityConfig = visibilityConfig;
    }

    /**
     * The action that AWS WAF should take on a web request when it matches the rule's statement. Settings at the `aws.wafv2.WebAcl` level can override the rule action setting. See Action below for details.
     * 
    */
    public RuleGroupRuleAction action() {
        return this.action;
    }
    /**
     * A friendly name of the rule.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * If you define more than one Rule in a WebACL, AWS WAF evaluates each request against the `rules` in order based on the value of `priority`. AWS WAF processes rules with lower priority first.
     * 
    */
    public Integer priority() {
        return this.priority;
    }
    /**
     * Labels to apply to web requests that match the rule match statement. See Rule Label below for details.
     * 
    */
    public List<RuleGroupRuleRuleLabel> ruleLabels() {
        return this.ruleLabels == null ? List.of() : this.ruleLabels;
    }
    /**
     * The AWS WAF processing statement for the rule, for example `byte_match_statement` or `geo_match_statement`. See Statement below for details.
     * 
    */
    public RuleGroupRuleStatement statement() {
        return this.statement;
    }
    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * 
    */
    public RuleGroupRuleVisibilityConfig visibilityConfig() {
        return this.visibilityConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleAction action;
        private String name;
        private Integer priority;
        private @Nullable List<RuleGroupRuleRuleLabel> ruleLabels;
        private RuleGroupRuleStatement statement;
        private RuleGroupRuleVisibilityConfig visibilityConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.ruleLabels = defaults.ruleLabels;
    	      this.statement = defaults.statement;
    	      this.visibilityConfig = defaults.visibilityConfig;
        }

        public Builder action(RuleGroupRuleAction action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder ruleLabels(@Nullable List<RuleGroupRuleRuleLabel> ruleLabels) {
            this.ruleLabels = ruleLabels;
            return this;
        }
        public Builder ruleLabels(RuleGroupRuleRuleLabel... ruleLabels) {
            return ruleLabels(List.of(ruleLabels));
        }
        public Builder statement(RuleGroupRuleStatement statement) {
            this.statement = Objects.requireNonNull(statement);
            return this;
        }
        public Builder visibilityConfig(RuleGroupRuleVisibilityConfig visibilityConfig) {
            this.visibilityConfig = Objects.requireNonNull(visibilityConfig);
            return this;
        }        public RuleGroupRule build() {
            return new RuleGroupRule(action, name, priority, ruleLabels, statement, visibilityConfig);
        }
    }
}
