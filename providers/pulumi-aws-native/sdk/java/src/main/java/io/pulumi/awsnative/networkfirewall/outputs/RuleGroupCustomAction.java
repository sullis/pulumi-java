// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.outputs;

import io.pulumi.awsnative.networkfirewall.outputs.RuleGroupActionDefinition;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RuleGroupCustomAction {
    private final RuleGroupActionDefinition actionDefinition;
    private final String actionName;

    @OutputCustomType.Constructor({"actionDefinition","actionName"})
    private RuleGroupCustomAction(
        RuleGroupActionDefinition actionDefinition,
        String actionName) {
        this.actionDefinition = Objects.requireNonNull(actionDefinition);
        this.actionName = Objects.requireNonNull(actionName);
    }

    public RuleGroupActionDefinition getActionDefinition() {
        return this.actionDefinition;
    }
    public String getActionName() {
        return this.actionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupCustomAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupActionDefinition actionDefinition;
        private String actionName;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupCustomAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionDefinition = defaults.actionDefinition;
    	      this.actionName = defaults.actionName;
        }

        public Builder setActionDefinition(RuleGroupActionDefinition actionDefinition) {
            this.actionDefinition = Objects.requireNonNull(actionDefinition);
            return this;
        }

        public Builder setActionName(String actionName) {
            this.actionName = Objects.requireNonNull(actionName);
            return this;
        }

        public RuleGroupCustomAction build() {
            return new RuleGroupCustomAction(actionDefinition, actionName);
        }
    }
}
