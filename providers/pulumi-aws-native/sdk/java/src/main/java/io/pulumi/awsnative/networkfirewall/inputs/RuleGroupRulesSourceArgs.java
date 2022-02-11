// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupRulesSourceListArgs;
import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupStatefulRuleArgs;
import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupStatelessRulesAndCustomActionsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRulesSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRulesSourceArgs Empty = new RuleGroupRulesSourceArgs();

    @InputImport(name="rulesSourceList")
    private final @Nullable Input<RuleGroupRulesSourceListArgs> rulesSourceList;

    public Input<RuleGroupRulesSourceListArgs> getRulesSourceList() {
        return this.rulesSourceList == null ? Input.empty() : this.rulesSourceList;
    }

    @InputImport(name="rulesString")
    private final @Nullable Input<String> rulesString;

    public Input<String> getRulesString() {
        return this.rulesString == null ? Input.empty() : this.rulesString;
    }

    @InputImport(name="statefulRules")
    private final @Nullable Input<List<RuleGroupStatefulRuleArgs>> statefulRules;

    public Input<List<RuleGroupStatefulRuleArgs>> getStatefulRules() {
        return this.statefulRules == null ? Input.empty() : this.statefulRules;
    }

    @InputImport(name="statelessRulesAndCustomActions")
    private final @Nullable Input<RuleGroupStatelessRulesAndCustomActionsArgs> statelessRulesAndCustomActions;

    public Input<RuleGroupStatelessRulesAndCustomActionsArgs> getStatelessRulesAndCustomActions() {
        return this.statelessRulesAndCustomActions == null ? Input.empty() : this.statelessRulesAndCustomActions;
    }

    public RuleGroupRulesSourceArgs(
        @Nullable Input<RuleGroupRulesSourceListArgs> rulesSourceList,
        @Nullable Input<String> rulesString,
        @Nullable Input<List<RuleGroupStatefulRuleArgs>> statefulRules,
        @Nullable Input<RuleGroupStatelessRulesAndCustomActionsArgs> statelessRulesAndCustomActions) {
        this.rulesSourceList = rulesSourceList;
        this.rulesString = rulesString;
        this.statefulRules = statefulRules;
        this.statelessRulesAndCustomActions = statelessRulesAndCustomActions;
    }

    private RuleGroupRulesSourceArgs() {
        this.rulesSourceList = Input.empty();
        this.rulesString = Input.empty();
        this.statefulRules = Input.empty();
        this.statelessRulesAndCustomActions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRulesSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RuleGroupRulesSourceListArgs> rulesSourceList;
        private @Nullable Input<String> rulesString;
        private @Nullable Input<List<RuleGroupStatefulRuleArgs>> statefulRules;
        private @Nullable Input<RuleGroupStatelessRulesAndCustomActionsArgs> statelessRulesAndCustomActions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRulesSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rulesSourceList = defaults.rulesSourceList;
    	      this.rulesString = defaults.rulesString;
    	      this.statefulRules = defaults.statefulRules;
    	      this.statelessRulesAndCustomActions = defaults.statelessRulesAndCustomActions;
        }

        public Builder setRulesSourceList(@Nullable Input<RuleGroupRulesSourceListArgs> rulesSourceList) {
            this.rulesSourceList = rulesSourceList;
            return this;
        }

        public Builder setRulesSourceList(@Nullable RuleGroupRulesSourceListArgs rulesSourceList) {
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

        public Builder setStatefulRules(@Nullable Input<List<RuleGroupStatefulRuleArgs>> statefulRules) {
            this.statefulRules = statefulRules;
            return this;
        }

        public Builder setStatefulRules(@Nullable List<RuleGroupStatefulRuleArgs> statefulRules) {
            this.statefulRules = Input.ofNullable(statefulRules);
            return this;
        }

        public Builder setStatelessRulesAndCustomActions(@Nullable Input<RuleGroupStatelessRulesAndCustomActionsArgs> statelessRulesAndCustomActions) {
            this.statelessRulesAndCustomActions = statelessRulesAndCustomActions;
            return this;
        }

        public Builder setStatelessRulesAndCustomActions(@Nullable RuleGroupStatelessRulesAndCustomActionsArgs statelessRulesAndCustomActions) {
            this.statelessRulesAndCustomActions = Input.ofNullable(statelessRulesAndCustomActions);
            return this;
        }

        public RuleGroupRulesSourceArgs build() {
            return new RuleGroupRulesSourceArgs(rulesSourceList, rulesString, statefulRules, statelessRulesAndCustomActions);
        }
    }
}
