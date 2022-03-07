// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleAction;
import io.pulumi.aws.wafv2.outputs.WebAclRuleOverrideAction;
import io.pulumi.aws.wafv2.outputs.WebAclRuleRuleLabel;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleVisibilityConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclRule {
    /**
     * The action that AWS WAF should take on a web request when it matches the rule's statement. This is used only for rules whose **statements do not reference a rule group**. See Action below for details.
     * 
     */
    private final @Nullable WebAclRuleAction action;
    /**
     * A friendly name of the rule.
     * 
     */
    private final String name;
    /**
     * The override action to apply to the rules in a rule group. Used only for rule **statements that reference a rule group**, like `rule_group_reference_statement` and `managed_rule_group_statement`. See Override Action below for details.
     * 
     */
    private final @Nullable WebAclRuleOverrideAction overrideAction;
    /**
     * If you define more than one Rule in a WebACL, AWS WAF evaluates each request against the `rules` in order based on the value of `priority`. AWS WAF processes rules with lower priority first.
     * 
     */
    private final Integer priority;
    /**
     * Labels to apply to web requests that match the rule match statement. See Rule Label below for details.
     * 
     */
    private final @Nullable List<WebAclRuleRuleLabel> ruleLabels;
    /**
     * The AWS WAF processing statement for the rule, for example `byte_match_statement` or `geo_match_statement`. See Statement below for details.
     * 
     */
    private final WebAclRuleStatement statement;
    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * 
     */
    private final WebAclRuleVisibilityConfig visibilityConfig;

    @OutputCustomType.Constructor({"action","name","overrideAction","priority","ruleLabels","statement","visibilityConfig"})
    private WebAclRule(
        @Nullable WebAclRuleAction action,
        String name,
        @Nullable WebAclRuleOverrideAction overrideAction,
        Integer priority,
        @Nullable List<WebAclRuleRuleLabel> ruleLabels,
        WebAclRuleStatement statement,
        WebAclRuleVisibilityConfig visibilityConfig) {
        this.action = action;
        this.name = Objects.requireNonNull(name);
        this.overrideAction = overrideAction;
        this.priority = Objects.requireNonNull(priority);
        this.ruleLabels = ruleLabels;
        this.statement = Objects.requireNonNull(statement);
        this.visibilityConfig = Objects.requireNonNull(visibilityConfig);
    }

    /**
     * The action that AWS WAF should take on a web request when it matches the rule's statement. This is used only for rules whose **statements do not reference a rule group**. See Action below for details.
     * 
    */
    public Optional<WebAclRuleAction> getAction() {
        return Optional.ofNullable(this.action);
    }
    /**
     * A friendly name of the rule.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The override action to apply to the rules in a rule group. Used only for rule **statements that reference a rule group**, like `rule_group_reference_statement` and `managed_rule_group_statement`. See Override Action below for details.
     * 
    */
    public Optional<WebAclRuleOverrideAction> getOverrideAction() {
        return Optional.ofNullable(this.overrideAction);
    }
    /**
     * If you define more than one Rule in a WebACL, AWS WAF evaluates each request against the `rules` in order based on the value of `priority`. AWS WAF processes rules with lower priority first.
     * 
    */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Labels to apply to web requests that match the rule match statement. See Rule Label below for details.
     * 
    */
    public List<WebAclRuleRuleLabel> getRuleLabels() {
        return this.ruleLabels == null ? List.of() : this.ruleLabels;
    }
    /**
     * The AWS WAF processing statement for the rule, for example `byte_match_statement` or `geo_match_statement`. See Statement below for details.
     * 
    */
    public WebAclRuleStatement getStatement() {
        return this.statement;
    }
    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * 
    */
    public WebAclRuleVisibilityConfig getVisibilityConfig() {
        return this.visibilityConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleAction action;
        private String name;
        private @Nullable WebAclRuleOverrideAction overrideAction;
        private Integer priority;
        private @Nullable List<WebAclRuleRuleLabel> ruleLabels;
        private WebAclRuleStatement statement;
        private WebAclRuleVisibilityConfig visibilityConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.name = defaults.name;
    	      this.overrideAction = defaults.overrideAction;
    	      this.priority = defaults.priority;
    	      this.ruleLabels = defaults.ruleLabels;
    	      this.statement = defaults.statement;
    	      this.visibilityConfig = defaults.visibilityConfig;
        }

        public Builder setAction(@Nullable WebAclRuleAction action) {
            this.action = action;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOverrideAction(@Nullable WebAclRuleOverrideAction overrideAction) {
            this.overrideAction = overrideAction;
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setRuleLabels(@Nullable List<WebAclRuleRuleLabel> ruleLabels) {
            this.ruleLabels = ruleLabels;
            return this;
        }

        public Builder setStatement(WebAclRuleStatement statement) {
            this.statement = Objects.requireNonNull(statement);
            return this;
        }

        public Builder setVisibilityConfig(WebAclRuleVisibilityConfig visibilityConfig) {
            this.visibilityConfig = Objects.requireNonNull(visibilityConfig);
            return this;
        }
        public WebAclRule build() {
            return new WebAclRule(action, name, overrideAction, priority, ruleLabels, statement, visibilityConfig);
        }
    }
}