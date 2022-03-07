// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupMatchAttributes;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRuleDefinition extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupRuleDefinition Empty = new RuleGroupRuleDefinition();

    @InputImport(name="actions", required=true)
      private final List<String> actions;

    public List<String> getActions() {
        return this.actions;
    }

    @InputImport(name="matchAttributes", required=true)
      private final RuleGroupMatchAttributes matchAttributes;

    public RuleGroupMatchAttributes getMatchAttributes() {
        return this.matchAttributes;
    }

    public RuleGroupRuleDefinition(
        List<String> actions,
        RuleGroupMatchAttributes matchAttributes) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.matchAttributes = Objects.requireNonNull(matchAttributes, "expected parameter 'matchAttributes' to be non-null");
    }

    private RuleGroupRuleDefinition() {
        this.actions = List.of();
        this.matchAttributes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> actions;
        private RuleGroupMatchAttributes matchAttributes;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.matchAttributes = defaults.matchAttributes;
        }

        public Builder setActions(List<String> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }

        public Builder setMatchAttributes(RuleGroupMatchAttributes matchAttributes) {
            this.matchAttributes = Objects.requireNonNull(matchAttributes);
            return this;
        }
        public RuleGroupRuleDefinition build() {
            return new RuleGroupRuleDefinition(actions, matchAttributes);
        }
    }
}