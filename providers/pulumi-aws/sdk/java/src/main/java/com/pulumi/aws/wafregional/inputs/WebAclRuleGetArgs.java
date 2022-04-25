// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional.inputs;

import com.pulumi.aws.wafregional.inputs.WebAclRuleActionGetArgs;
import com.pulumi.aws.wafregional.inputs.WebAclRuleOverrideActionGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleGetArgs Empty = new WebAclRuleGetArgs();

    /**
     * Configuration block of the action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule.  Not used if `type` is `GROUP`. Detailed below.
     * 
     */
    @Import(name="action")
    private @Nullable Output<WebAclRuleActionGetArgs> action;

    /**
     * @return Configuration block of the action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule.  Not used if `type` is `GROUP`. Detailed below.
     * 
     */
    public Optional<Output<WebAclRuleActionGetArgs>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * Configuration block of the override the action that a group requests CloudFront or AWS WAF takes when a web request matches the conditions in the rule.  Only used if `type` is `GROUP`. Detailed below.
     * 
     */
    @Import(name="overrideAction")
    private @Nullable Output<WebAclRuleOverrideActionGetArgs> overrideAction;

    /**
     * @return Configuration block of the override the action that a group requests CloudFront or AWS WAF takes when a web request matches the conditions in the rule.  Only used if `type` is `GROUP`. Detailed below.
     * 
     */
    public Optional<Output<WebAclRuleOverrideActionGetArgs>> overrideAction() {
        return Optional.ofNullable(this.overrideAction);
    }

    /**
     * Specifies the order in which the rules in a WebACL are evaluated.
     * Rules with a lower value are evaluated before rules with a higher value.
     * 
     */
    @Import(name="priority", required=true)
    private Output<Integer> priority;

    /**
     * @return Specifies the order in which the rules in a WebACL are evaluated.
     * Rules with a lower value are evaluated before rules with a higher value.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }

    /**
     * ID of the associated WAF (Regional) rule (e.g. `aws.wafregional.Rule`). WAF (Global) rules cannot be used.
     * 
     */
    @Import(name="ruleId", required=true)
    private Output<String> ruleId;

    /**
     * @return ID of the associated WAF (Regional) rule (e.g. `aws.wafregional.Rule`). WAF (Global) rules cannot be used.
     * 
     */
    public Output<String> ruleId() {
        return this.ruleId;
    }

    /**
     * Specifies how you want AWS WAF Regional to respond to requests that match the settings in a rule. Valid values for `action` are `ALLOW`, `BLOCK` or `COUNT`. Valid values for `override_action` are `COUNT` and `NONE`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Specifies how you want AWS WAF Regional to respond to requests that match the settings in a rule. Valid values for `action` are `ALLOW`, `BLOCK` or `COUNT`. Valid values for `override_action` are `COUNT` and `NONE`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private WebAclRuleGetArgs() {}

    private WebAclRuleGetArgs(WebAclRuleGetArgs $) {
        this.action = $.action;
        this.overrideAction = $.overrideAction;
        this.priority = $.priority;
        this.ruleId = $.ruleId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleGetArgs $;

        public Builder() {
            $ = new WebAclRuleGetArgs();
        }

        public Builder(WebAclRuleGetArgs defaults) {
            $ = new WebAclRuleGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Configuration block of the action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule.  Not used if `type` is `GROUP`. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<WebAclRuleActionGetArgs> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Configuration block of the action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule.  Not used if `type` is `GROUP`. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder action(WebAclRuleActionGetArgs action) {
            return action(Output.of(action));
        }

        /**
         * @param overrideAction Configuration block of the override the action that a group requests CloudFront or AWS WAF takes when a web request matches the conditions in the rule.  Only used if `type` is `GROUP`. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder overrideAction(@Nullable Output<WebAclRuleOverrideActionGetArgs> overrideAction) {
            $.overrideAction = overrideAction;
            return this;
        }

        /**
         * @param overrideAction Configuration block of the override the action that a group requests CloudFront or AWS WAF takes when a web request matches the conditions in the rule.  Only used if `type` is `GROUP`. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder overrideAction(WebAclRuleOverrideActionGetArgs overrideAction) {
            return overrideAction(Output.of(overrideAction));
        }

        /**
         * @param priority Specifies the order in which the rules in a WebACL are evaluated.
         * Rules with a lower value are evaluated before rules with a higher value.
         * 
         * @return builder
         * 
         */
        public Builder priority(Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Specifies the order in which the rules in a WebACL are evaluated.
         * Rules with a lower value are evaluated before rules with a higher value.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param ruleId ID of the associated WAF (Regional) rule (e.g. `aws.wafregional.Rule`). WAF (Global) rules cannot be used.
         * 
         * @return builder
         * 
         */
        public Builder ruleId(Output<String> ruleId) {
            $.ruleId = ruleId;
            return this;
        }

        /**
         * @param ruleId ID of the associated WAF (Regional) rule (e.g. `aws.wafregional.Rule`). WAF (Global) rules cannot be used.
         * 
         * @return builder
         * 
         */
        public Builder ruleId(String ruleId) {
            return ruleId(Output.of(ruleId));
        }

        /**
         * @param type Specifies how you want AWS WAF Regional to respond to requests that match the settings in a rule. Valid values for `action` are `ALLOW`, `BLOCK` or `COUNT`. Valid values for `override_action` are `COUNT` and `NONE`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies how you want AWS WAF Regional to respond to requests that match the settings in a rule. Valid values for `action` are `ALLOW`, `BLOCK` or `COUNT`. Valid values for `override_action` are `COUNT` and `NONE`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public WebAclRuleGetArgs build() {
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            $.ruleId = Objects.requireNonNull($.ruleId, "expected parameter 'ruleId' to be non-null");
            return $;
        }
    }

}
