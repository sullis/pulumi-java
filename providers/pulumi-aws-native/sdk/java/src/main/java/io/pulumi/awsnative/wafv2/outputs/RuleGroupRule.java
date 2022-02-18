// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.outputs.RuleGroupCaptchaConfig;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupLabel;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupRuleAction;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupStatement;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupVisibilityConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupRule {
    private final @Nullable RuleGroupRuleAction action;
    private final @Nullable RuleGroupCaptchaConfig captchaConfig;
    private final String name;
    private final Integer priority;
    /**
     * Collection of Rule Labels.
     * 
     */
    private final @Nullable List<RuleGroupLabel> ruleLabels;
    private final RuleGroupStatement statement;
    private final RuleGroupVisibilityConfig visibilityConfig;

    @OutputCustomType.Constructor({"action","captchaConfig","name","priority","ruleLabels","statement","visibilityConfig"})
    private RuleGroupRule(
        @Nullable RuleGroupRuleAction action,
        @Nullable RuleGroupCaptchaConfig captchaConfig,
        String name,
        Integer priority,
        @Nullable List<RuleGroupLabel> ruleLabels,
        RuleGroupStatement statement,
        RuleGroupVisibilityConfig visibilityConfig) {
        this.action = action;
        this.captchaConfig = captchaConfig;
        this.name = Objects.requireNonNull(name);
        this.priority = Objects.requireNonNull(priority);
        this.ruleLabels = ruleLabels;
        this.statement = Objects.requireNonNull(statement);
        this.visibilityConfig = Objects.requireNonNull(visibilityConfig);
    }

    public Optional<RuleGroupRuleAction> getAction() {
        return Optional.ofNullable(this.action);
    }
    public Optional<RuleGroupCaptchaConfig> getCaptchaConfig() {
        return Optional.ofNullable(this.captchaConfig);
    }
    public String getName() {
        return this.name;
    }
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Collection of Rule Labels.
     * 
     */
    public List<RuleGroupLabel> getRuleLabels() {
        return this.ruleLabels == null ? List.of() : this.ruleLabels;
    }
    public RuleGroupStatement getStatement() {
        return this.statement;
    }
    public RuleGroupVisibilityConfig getVisibilityConfig() {
        return this.visibilityConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRuleAction action;
        private @Nullable RuleGroupCaptchaConfig captchaConfig;
        private String name;
        private Integer priority;
        private @Nullable List<RuleGroupLabel> ruleLabels;
        private RuleGroupStatement statement;
        private RuleGroupVisibilityConfig visibilityConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.captchaConfig = defaults.captchaConfig;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.ruleLabels = defaults.ruleLabels;
    	      this.statement = defaults.statement;
    	      this.visibilityConfig = defaults.visibilityConfig;
        }

        public Builder setAction(@Nullable RuleGroupRuleAction action) {
            this.action = action;
            return this;
        }

        public Builder setCaptchaConfig(@Nullable RuleGroupCaptchaConfig captchaConfig) {
            this.captchaConfig = captchaConfig;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setRuleLabels(@Nullable List<RuleGroupLabel> ruleLabels) {
            this.ruleLabels = ruleLabels;
            return this;
        }

        public Builder setStatement(RuleGroupStatement statement) {
            this.statement = Objects.requireNonNull(statement);
            return this;
        }

        public Builder setVisibilityConfig(RuleGroupVisibilityConfig visibilityConfig) {
            this.visibilityConfig = Objects.requireNonNull(visibilityConfig);
            return this;
        }

        public RuleGroupRule build() {
            return new RuleGroupRule(action, captchaConfig, name, priority, ruleLabels, statement, visibilityConfig);
        }
    }
}
