// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceRulesSourceListArgs;
import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatefulRuleArgs;
import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleGroupRulesSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRulesSourceArgs Empty = new RuleGroupRuleGroupRulesSourceArgs();

    /**
     * A configuration block containing **stateful** inspection criteria for a domain list rule group. See Rules Source List below for details.
     * 
     */
    @InputImport(name="rulesSourceList")
      private final @Nullable Input<RuleGroupRuleGroupRulesSourceRulesSourceListArgs> rulesSourceList;

    public Input<RuleGroupRuleGroupRulesSourceRulesSourceListArgs> getRulesSourceList() {
        return this.rulesSourceList == null ? Input.empty() : this.rulesSourceList;
    }

    /**
     * The fully qualified name of a file in an S3 bucket that contains Suricata compatible intrusion preventions system (IPS) rules or the Suricata rules as a string. These rules contain **stateful** inspection criteria and the action to take for traffic that matches the criteria.
     * 
     */
    @InputImport(name="rulesString")
      private final @Nullable Input<String> rulesString;

    public Input<String> getRulesString() {
        return this.rulesString == null ? Input.empty() : this.rulesString;
    }

    /**
     * Set of configuration blocks containing **stateful** inspection criteria for 5-tuple rules to be used together in a rule group. See Stateful Rule below for details.
     * 
     */
    @InputImport(name="statefulRules")
      private final @Nullable Input<List<RuleGroupRuleGroupRulesSourceStatefulRuleArgs>> statefulRules;

    public Input<List<RuleGroupRuleGroupRulesSourceStatefulRuleArgs>> getStatefulRules() {
        return this.statefulRules == null ? Input.empty() : this.statefulRules;
    }

    /**
     * A configuration block containing **stateless** inspection criteria for a stateless rule group. See Stateless Rules and Custom Actions below for details.
     * 
     */
    @InputImport(name="statelessRulesAndCustomActions")
      private final @Nullable Input<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsArgs> statelessRulesAndCustomActions;

    public Input<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsArgs> getStatelessRulesAndCustomActions() {
        return this.statelessRulesAndCustomActions == null ? Input.empty() : this.statelessRulesAndCustomActions;
    }

    public RuleGroupRuleGroupRulesSourceArgs(
        @Nullable Input<RuleGroupRuleGroupRulesSourceRulesSourceListArgs> rulesSourceList,
        @Nullable Input<String> rulesString,
        @Nullable Input<List<RuleGroupRuleGroupRulesSourceStatefulRuleArgs>> statefulRules,
        @Nullable Input<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsArgs> statelessRulesAndCustomActions) {
        this.rulesSourceList = rulesSourceList;
        this.rulesString = rulesString;
        this.statefulRules = statefulRules;
        this.statelessRulesAndCustomActions = statelessRulesAndCustomActions;
    }

    private RuleGroupRuleGroupRulesSourceArgs() {
        this.rulesSourceList = Input.empty();
        this.rulesString = Input.empty();
        this.statefulRules = Input.empty();
        this.statelessRulesAndCustomActions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RuleGroupRuleGroupRulesSourceRulesSourceListArgs> rulesSourceList;
        private @Nullable Input<String> rulesString;
        private @Nullable Input<List<RuleGroupRuleGroupRulesSourceStatefulRuleArgs>> statefulRules;
        private @Nullable Input<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsArgs> statelessRulesAndCustomActions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rulesSourceList = defaults.rulesSourceList;
    	      this.rulesString = defaults.rulesString;
    	      this.statefulRules = defaults.statefulRules;
    	      this.statelessRulesAndCustomActions = defaults.statelessRulesAndCustomActions;
        }

        public Builder setRulesSourceList(@Nullable Input<RuleGroupRuleGroupRulesSourceRulesSourceListArgs> rulesSourceList) {
            this.rulesSourceList = rulesSourceList;
            return this;
        }

        public Builder setRulesSourceList(@Nullable RuleGroupRuleGroupRulesSourceRulesSourceListArgs rulesSourceList) {
            this.rulesSourceList = Input.ofNullable(rulesSourceList);
            return this;
        }

        public Builder setRulesString(@Nullable Input<String> rulesString) {
            this.rulesString = rulesString;
            return this;
        }

        public Builder setRulesString(@Nullable String rulesString) {
            this.rulesString = Input.ofNullable(rulesString);
            return this;
        }

        public Builder setStatefulRules(@Nullable Input<List<RuleGroupRuleGroupRulesSourceStatefulRuleArgs>> statefulRules) {
            this.statefulRules = statefulRules;
            return this;
        }

        public Builder setStatefulRules(@Nullable List<RuleGroupRuleGroupRulesSourceStatefulRuleArgs> statefulRules) {
            this.statefulRules = Input.ofNullable(statefulRules);
            return this;
        }

        public Builder setStatelessRulesAndCustomActions(@Nullable Input<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsArgs> statelessRulesAndCustomActions) {
            this.statelessRulesAndCustomActions = statelessRulesAndCustomActions;
            return this;
        }

        public Builder setStatelessRulesAndCustomActions(@Nullable RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsArgs statelessRulesAndCustomActions) {
            this.statelessRulesAndCustomActions = Input.ofNullable(statelessRulesAndCustomActions);
            return this;
        }
        public RuleGroupRuleGroupRulesSourceArgs build() {
            return new RuleGroupRuleGroupRulesSourceArgs(rulesSourceList, rulesString, statefulRules, statelessRulesAndCustomActions);
        }
    }
}