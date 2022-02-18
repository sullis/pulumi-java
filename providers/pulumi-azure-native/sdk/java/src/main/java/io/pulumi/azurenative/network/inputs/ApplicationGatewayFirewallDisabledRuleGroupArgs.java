// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Allows to disable rules within a rule group or an entire rule group.
 * 
 */
public final class ApplicationGatewayFirewallDisabledRuleGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayFirewallDisabledRuleGroupArgs Empty = new ApplicationGatewayFirewallDisabledRuleGroupArgs();

    /**
     * The name of the rule group that will be disabled.
     * 
     */
    @InputImport(name="ruleGroupName", required=true)
    private final Input<String> ruleGroupName;

    public Input<String> getRuleGroupName() {
        return this.ruleGroupName;
    }

    /**
     * The list of rules that will be disabled. If null, all rules of the rule group will be disabled.
     * 
     */
    @InputImport(name="rules")
    private final @Nullable Input<List<Integer>> rules;

    public Input<List<Integer>> getRules() {
        return this.rules == null ? Input.empty() : this.rules;
    }

    public ApplicationGatewayFirewallDisabledRuleGroupArgs(
        Input<String> ruleGroupName,
        @Nullable Input<List<Integer>> rules) {
        this.ruleGroupName = Objects.requireNonNull(ruleGroupName, "expected parameter 'ruleGroupName' to be non-null");
        this.rules = rules;
    }

    private ApplicationGatewayFirewallDisabledRuleGroupArgs() {
        this.ruleGroupName = Input.empty();
        this.rules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayFirewallDisabledRuleGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> ruleGroupName;
        private @Nullable Input<List<Integer>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayFirewallDisabledRuleGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleGroupName = defaults.ruleGroupName;
    	      this.rules = defaults.rules;
        }

        public Builder setRuleGroupName(Input<String> ruleGroupName) {
            this.ruleGroupName = Objects.requireNonNull(ruleGroupName);
            return this;
        }

        public Builder setRuleGroupName(String ruleGroupName) {
            this.ruleGroupName = Input.of(Objects.requireNonNull(ruleGroupName));
            return this;
        }

        public Builder setRules(@Nullable Input<List<Integer>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setRules(@Nullable List<Integer> rules) {
            this.rules = Input.ofNullable(rules);
            return this;
        }

        public ApplicationGatewayFirewallDisabledRuleGroupArgs build() {
            return new ApplicationGatewayFirewallDisabledRuleGroupArgs(ruleGroupName, rules);
        }
    }
}
