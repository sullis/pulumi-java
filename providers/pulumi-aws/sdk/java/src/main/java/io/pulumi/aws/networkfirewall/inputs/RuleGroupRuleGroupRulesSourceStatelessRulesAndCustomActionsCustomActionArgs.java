// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionArgs Empty = new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionArgs();

    /**
     * A configuration block describing the custom action associated with the `action_name`. See Action Definition below for details.
     * 
     */
    @Import(name="actionDefinition", required=true)
      private final Output<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionArgs> actionDefinition;

    public Output<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionArgs> actionDefinition() {
        return this.actionDefinition;
    }

    /**
     * A friendly name of the custom action.
     * 
     */
    @Import(name="actionName", required=true)
      private final Output<String> actionName;

    public Output<String> actionName() {
        return this.actionName;
    }

    public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionArgs(
        Output<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionArgs> actionDefinition,
        Output<String> actionName) {
        this.actionDefinition = Objects.requireNonNull(actionDefinition, "expected parameter 'actionDefinition' to be non-null");
        this.actionName = Objects.requireNonNull(actionName, "expected parameter 'actionName' to be non-null");
    }

    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionArgs() {
        this.actionDefinition = Codegen.empty();
        this.actionName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionArgs> actionDefinition;
        private Output<String> actionName;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionDefinition = defaults.actionDefinition;
    	      this.actionName = defaults.actionName;
        }

        public Builder actionDefinition(Output<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionArgs> actionDefinition) {
            this.actionDefinition = Objects.requireNonNull(actionDefinition);
            return this;
        }
        public Builder actionDefinition(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionArgs actionDefinition) {
            this.actionDefinition = Output.of(Objects.requireNonNull(actionDefinition));
            return this;
        }
        public Builder actionName(Output<String> actionName) {
            this.actionName = Objects.requireNonNull(actionName);
            return this;
        }
        public Builder actionName(String actionName) {
            this.actionName = Output.of(Objects.requireNonNull(actionName));
            return this;
        }        public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionArgs build() {
            return new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionArgs(actionDefinition, actionName);
        }
    }
}
