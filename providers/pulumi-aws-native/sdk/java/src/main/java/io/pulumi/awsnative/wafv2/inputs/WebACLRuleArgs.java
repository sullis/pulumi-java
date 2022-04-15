// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.WebACLCaptchaConfigArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLLabelArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLOverrideActionArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLRuleActionArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLVisibilityConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Rule of WebACL that contains condition and action.
 * 
 */
public final class WebACLRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLRuleArgs Empty = new WebACLRuleArgs();

    @Import(name="action")
      private final @Nullable Output<WebACLRuleActionArgs> action;

    public Output<WebACLRuleActionArgs> action() {
        return this.action == null ? Codegen.empty() : this.action;
    }

    @Import(name="captchaConfig")
      private final @Nullable Output<WebACLCaptchaConfigArgs> captchaConfig;

    public Output<WebACLCaptchaConfigArgs> captchaConfig() {
        return this.captchaConfig == null ? Codegen.empty() : this.captchaConfig;
    }

    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="overrideAction")
      private final @Nullable Output<WebACLOverrideActionArgs> overrideAction;

    public Output<WebACLOverrideActionArgs> overrideAction() {
        return this.overrideAction == null ? Codegen.empty() : this.overrideAction;
    }

    @Import(name="priority", required=true)
      private final Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority;
    }

    /**
     * Collection of Rule Labels.
     * 
     */
    @Import(name="ruleLabels")
      private final @Nullable Output<List<WebACLLabelArgs>> ruleLabels;

    public Output<List<WebACLLabelArgs>> ruleLabels() {
        return this.ruleLabels == null ? Codegen.empty() : this.ruleLabels;
    }

    @Import(name="statement", required=true)
      private final Output<WebACLStatementArgs> statement;

    public Output<WebACLStatementArgs> statement() {
        return this.statement;
    }

    @Import(name="visibilityConfig", required=true)
      private final Output<WebACLVisibilityConfigArgs> visibilityConfig;

    public Output<WebACLVisibilityConfigArgs> visibilityConfig() {
        return this.visibilityConfig;
    }

    public WebACLRuleArgs(
        @Nullable Output<WebACLRuleActionArgs> action,
        @Nullable Output<WebACLCaptchaConfigArgs> captchaConfig,
        Output<String> name,
        @Nullable Output<WebACLOverrideActionArgs> overrideAction,
        Output<Integer> priority,
        @Nullable Output<List<WebACLLabelArgs>> ruleLabels,
        Output<WebACLStatementArgs> statement,
        Output<WebACLVisibilityConfigArgs> visibilityConfig) {
        this.action = action;
        this.captchaConfig = captchaConfig;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.overrideAction = overrideAction;
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.ruleLabels = ruleLabels;
        this.statement = Objects.requireNonNull(statement, "expected parameter 'statement' to be non-null");
        this.visibilityConfig = Objects.requireNonNull(visibilityConfig, "expected parameter 'visibilityConfig' to be non-null");
    }

    private WebACLRuleArgs() {
        this.action = Codegen.empty();
        this.captchaConfig = Codegen.empty();
        this.name = Codegen.empty();
        this.overrideAction = Codegen.empty();
        this.priority = Codegen.empty();
        this.ruleLabels = Codegen.empty();
        this.statement = Codegen.empty();
        this.visibilityConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebACLRuleActionArgs> action;
        private @Nullable Output<WebACLCaptchaConfigArgs> captchaConfig;
        private Output<String> name;
        private @Nullable Output<WebACLOverrideActionArgs> overrideAction;
        private Output<Integer> priority;
        private @Nullable Output<List<WebACLLabelArgs>> ruleLabels;
        private Output<WebACLStatementArgs> statement;
        private Output<WebACLVisibilityConfigArgs> visibilityConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLRuleArgs defaults) {
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

        public Builder action(@Nullable Output<WebACLRuleActionArgs> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable WebACLRuleActionArgs action) {
            this.action = Codegen.ofNullable(action);
            return this;
        }
        public Builder captchaConfig(@Nullable Output<WebACLCaptchaConfigArgs> captchaConfig) {
            this.captchaConfig = captchaConfig;
            return this;
        }
        public Builder captchaConfig(@Nullable WebACLCaptchaConfigArgs captchaConfig) {
            this.captchaConfig = Codegen.ofNullable(captchaConfig);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder overrideAction(@Nullable Output<WebACLOverrideActionArgs> overrideAction) {
            this.overrideAction = overrideAction;
            return this;
        }
        public Builder overrideAction(@Nullable WebACLOverrideActionArgs overrideAction) {
            this.overrideAction = Codegen.ofNullable(overrideAction);
            return this;
        }
        public Builder priority(Output<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Output.of(Objects.requireNonNull(priority));
            return this;
        }
        public Builder ruleLabels(@Nullable Output<List<WebACLLabelArgs>> ruleLabels) {
            this.ruleLabels = ruleLabels;
            return this;
        }
        public Builder ruleLabels(@Nullable List<WebACLLabelArgs> ruleLabels) {
            this.ruleLabels = Codegen.ofNullable(ruleLabels);
            return this;
        }
        public Builder ruleLabels(WebACLLabelArgs... ruleLabels) {
            return ruleLabels(List.of(ruleLabels));
        }
        public Builder statement(Output<WebACLStatementArgs> statement) {
            this.statement = Objects.requireNonNull(statement);
            return this;
        }
        public Builder statement(WebACLStatementArgs statement) {
            this.statement = Output.of(Objects.requireNonNull(statement));
            return this;
        }
        public Builder visibilityConfig(Output<WebACLVisibilityConfigArgs> visibilityConfig) {
            this.visibilityConfig = Objects.requireNonNull(visibilityConfig);
            return this;
        }
        public Builder visibilityConfig(WebACLVisibilityConfigArgs visibilityConfig) {
            this.visibilityConfig = Output.of(Objects.requireNonNull(visibilityConfig));
            return this;
        }        public WebACLRuleArgs build() {
            return new WebACLRuleArgs(action, captchaConfig, name, overrideAction, priority, ruleLabels, statement, visibilityConfig);
        }
    }
}
