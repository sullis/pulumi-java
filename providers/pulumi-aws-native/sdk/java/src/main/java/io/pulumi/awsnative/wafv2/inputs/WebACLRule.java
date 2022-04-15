// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.WebACLCaptchaConfig;
import io.pulumi.awsnative.wafv2.inputs.WebACLLabel;
import io.pulumi.awsnative.wafv2.inputs.WebACLOverrideAction;
import io.pulumi.awsnative.wafv2.inputs.WebACLRuleAction;
import io.pulumi.awsnative.wafv2.inputs.WebACLStatement;
import io.pulumi.awsnative.wafv2.inputs.WebACLVisibilityConfig;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Rule of WebACL that contains condition and action.
 * 
 */
public final class WebACLRule extends io.pulumi.resources.InvokeArgs {

    public static final WebACLRule Empty = new WebACLRule();

    @Import(name="action")
      private final @Nullable WebACLRuleAction action;

    public Optional<WebACLRuleAction> action() {
        return this.action == null ? Optional.empty() : Optional.ofNullable(this.action);
    }

    @Import(name="captchaConfig")
      private final @Nullable WebACLCaptchaConfig captchaConfig;

    public Optional<WebACLCaptchaConfig> captchaConfig() {
        return this.captchaConfig == null ? Optional.empty() : Optional.ofNullable(this.captchaConfig);
    }

    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    @Import(name="overrideAction")
      private final @Nullable WebACLOverrideAction overrideAction;

    public Optional<WebACLOverrideAction> overrideAction() {
        return this.overrideAction == null ? Optional.empty() : Optional.ofNullable(this.overrideAction);
    }

    @Import(name="priority", required=true)
      private final Integer priority;

    public Integer priority() {
        return this.priority;
    }

    /**
     * Collection of Rule Labels.
     * 
     */
    @Import(name="ruleLabels")
      private final @Nullable List<WebACLLabel> ruleLabels;

    public List<WebACLLabel> ruleLabels() {
        return this.ruleLabels == null ? List.of() : this.ruleLabels;
    }

    @Import(name="statement", required=true)
      private final WebACLStatement statement;

    public WebACLStatement statement() {
        return this.statement;
    }

    @Import(name="visibilityConfig", required=true)
      private final WebACLVisibilityConfig visibilityConfig;

    public WebACLVisibilityConfig visibilityConfig() {
        return this.visibilityConfig;
    }

    public WebACLRule(
        @Nullable WebACLRuleAction action,
        @Nullable WebACLCaptchaConfig captchaConfig,
        String name,
        @Nullable WebACLOverrideAction overrideAction,
        Integer priority,
        @Nullable List<WebACLLabel> ruleLabels,
        WebACLStatement statement,
        WebACLVisibilityConfig visibilityConfig) {
        this.action = action;
        this.captchaConfig = captchaConfig;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.overrideAction = overrideAction;
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.ruleLabels = ruleLabels;
        this.statement = Objects.requireNonNull(statement, "expected parameter 'statement' to be non-null");
        this.visibilityConfig = Objects.requireNonNull(visibilityConfig, "expected parameter 'visibilityConfig' to be non-null");
    }

    private WebACLRule() {
        this.action = null;
        this.captchaConfig = null;
        this.name = null;
        this.overrideAction = null;
        this.priority = null;
        this.ruleLabels = List.of();
        this.statement = null;
        this.visibilityConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebACLRuleAction action;
        private @Nullable WebACLCaptchaConfig captchaConfig;
        private String name;
        private @Nullable WebACLOverrideAction overrideAction;
        private Integer priority;
        private @Nullable List<WebACLLabel> ruleLabels;
        private WebACLStatement statement;
        private WebACLVisibilityConfig visibilityConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.captchaConfig = defaults.captchaConfig;
    	      this.name = defaults.name;
    	      this.overrideAction = defaults.overrideAction;
    	      this.priority = defaults.priority;
    	      this.ruleLabels = defaults.ruleLabels;
    	      this.statement = defaults.statement;
    	      this.visibilityConfig = defaults.visibilityConfig;
        }

        public Builder action(@Nullable WebACLRuleAction action) {
            this.action = action;
            return this;
        }
        public Builder captchaConfig(@Nullable WebACLCaptchaConfig captchaConfig) {
            this.captchaConfig = captchaConfig;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder overrideAction(@Nullable WebACLOverrideAction overrideAction) {
            this.overrideAction = overrideAction;
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder ruleLabels(@Nullable List<WebACLLabel> ruleLabels) {
            this.ruleLabels = ruleLabels;
            return this;
        }
        public Builder ruleLabels(WebACLLabel... ruleLabels) {
            return ruleLabels(List.of(ruleLabels));
        }
        public Builder statement(WebACLStatement statement) {
            this.statement = Objects.requireNonNull(statement);
            return this;
        }
        public Builder visibilityConfig(WebACLVisibilityConfig visibilityConfig) {
            this.visibilityConfig = Objects.requireNonNull(visibilityConfig);
            return this;
        }        public WebACLRule build() {
            return new WebACLRule(action, captchaConfig, name, overrideAction, priority, ruleLabels, statement, visibilityConfig);
        }
    }
}
