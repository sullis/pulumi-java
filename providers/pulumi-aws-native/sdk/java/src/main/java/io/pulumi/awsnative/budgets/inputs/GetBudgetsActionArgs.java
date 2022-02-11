// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.budgets.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetBudgetsActionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBudgetsActionArgs Empty = new GetBudgetsActionArgs();

    @InputImport(name="actionId", required=true)
    private final String actionId;

    public String getActionId() {
        return this.actionId;
    }

    @InputImport(name="budgetName", required=true)
    private final String budgetName;

    public String getBudgetName() {
        return this.budgetName;
    }

    public GetBudgetsActionArgs(
        String actionId,
        String budgetName) {
        this.actionId = Objects.requireNonNull(actionId, "expected parameter 'actionId' to be non-null");
        this.budgetName = Objects.requireNonNull(budgetName, "expected parameter 'budgetName' to be non-null");
    }

    private GetBudgetsActionArgs() {
        this.actionId = null;
        this.budgetName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBudgetsActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionId;
        private String budgetName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBudgetsActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionId = defaults.actionId;
    	      this.budgetName = defaults.budgetName;
        }

        public Builder setActionId(String actionId) {
            this.actionId = Objects.requireNonNull(actionId);
            return this;
        }

        public Builder setBudgetName(String budgetName) {
            this.budgetName = Objects.requireNonNull(budgetName);
            return this;
        }

        public GetBudgetsActionArgs build() {
            return new GetBudgetsActionArgs(actionId, budgetName);
        }
    }
}
