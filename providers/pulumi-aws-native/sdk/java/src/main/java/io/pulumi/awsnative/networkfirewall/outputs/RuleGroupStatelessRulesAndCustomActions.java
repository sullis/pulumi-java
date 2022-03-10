// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.outputs;

import io.pulumi.awsnative.networkfirewall.outputs.RuleGroupCustomAction;
import io.pulumi.awsnative.networkfirewall.outputs.RuleGroupStatelessRule;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupStatelessRulesAndCustomActions {
    private final @Nullable List<RuleGroupCustomAction> customActions;
    private final List<RuleGroupStatelessRule> statelessRules;

    @OutputCustomType.Constructor
    private RuleGroupStatelessRulesAndCustomActions(
        @OutputCustomType.Parameter("customActions") @Nullable List<RuleGroupCustomAction> customActions,
        @OutputCustomType.Parameter("statelessRules") List<RuleGroupStatelessRule> statelessRules) {
        this.customActions = customActions;
        this.statelessRules = statelessRules;
    }

    public List<RuleGroupCustomAction> getCustomActions() {
        return this.customActions == null ? List.of() : this.customActions;
    }
    public List<RuleGroupStatelessRule> getStatelessRules() {
        return this.statelessRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupStatelessRulesAndCustomActions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<RuleGroupCustomAction> customActions;
        private List<RuleGroupStatelessRule> statelessRules;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupStatelessRulesAndCustomActions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customActions = defaults.customActions;
    	      this.statelessRules = defaults.statelessRules;
        }

        public Builder setCustomActions(@Nullable List<RuleGroupCustomAction> customActions) {
            this.customActions = customActions;
            return this;
        }

        public Builder setStatelessRules(List<RuleGroupStatelessRule> statelessRules) {
            this.statelessRules = Objects.requireNonNull(statelessRules);
            return this;
        }
        public RuleGroupStatelessRulesAndCustomActions build() {
            return new RuleGroupStatelessRulesAndCustomActions(customActions, statelessRules);
        }
    }
}
