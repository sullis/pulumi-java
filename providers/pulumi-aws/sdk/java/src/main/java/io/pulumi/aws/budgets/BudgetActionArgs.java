// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.budgets;

import io.pulumi.aws.budgets.inputs.BudgetActionActionThresholdArgs;
import io.pulumi.aws.budgets.inputs.BudgetActionDefinitionArgs;
import io.pulumi.aws.budgets.inputs.BudgetActionSubscriberArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BudgetActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetActionArgs Empty = new BudgetActionArgs();

    /**
     * The ID of the target account for budget. Will use current user's account_id by default if omitted.
     * 
     */
    @Import(name="accountId")
      private final @Nullable Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId == null ? Codegen.empty() : this.accountId;
    }

    /**
     * The trigger threshold of the action. See Action Threshold.
     * 
     */
    @Import(name="actionThreshold", required=true)
      private final Output<BudgetActionActionThresholdArgs> actionThreshold;

    public Output<BudgetActionActionThresholdArgs> actionThreshold() {
        return this.actionThreshold;
    }

    /**
     * The type of action. This defines the type of tasks that can be carried out by this action. This field also determines the format for definition. Valid values are `APPLY_IAM_POLICY`, `APPLY_SCP_POLICY`, and `RUN_SSM_DOCUMENTS`.
     * 
     */
    @Import(name="actionType", required=true)
      private final Output<String> actionType;

    public Output<String> actionType() {
        return this.actionType;
    }

    /**
     * This specifies if the action needs manual or automatic approval. Valid values are `AUTOMATIC` and `MANUAL`.
     * 
     */
    @Import(name="approvalModel", required=true)
      private final Output<String> approvalModel;

    public Output<String> approvalModel() {
        return this.approvalModel;
    }

    /**
     * The name of a budget.
     * 
     */
    @Import(name="budgetName", required=true)
      private final Output<String> budgetName;

    public Output<String> budgetName() {
        return this.budgetName;
    }

    /**
     * Specifies all of the type-specific parameters. See Definition.
     * 
     */
    @Import(name="definition", required=true)
      private final Output<BudgetActionDefinitionArgs> definition;

    public Output<BudgetActionDefinitionArgs> definition() {
        return this.definition;
    }

    /**
     * The role passed for action execution and reversion. Roles and actions must be in the same account.
     * 
     */
    @Import(name="executionRoleArn", required=true)
      private final Output<String> executionRoleArn;

    public Output<String> executionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * The type of a notification. Valid values are `ACTUAL` or `FORECASTED`.
     * 
     */
    @Import(name="notificationType", required=true)
      private final Output<String> notificationType;

    public Output<String> notificationType() {
        return this.notificationType;
    }

    /**
     * A list of subscribers. See Subscriber.
     * 
     */
    @Import(name="subscribers", required=true)
      private final Output<List<BudgetActionSubscriberArgs>> subscribers;

    public Output<List<BudgetActionSubscriberArgs>> subscribers() {
        return this.subscribers;
    }

    public BudgetActionArgs(
        @Nullable Output<String> accountId,
        Output<BudgetActionActionThresholdArgs> actionThreshold,
        Output<String> actionType,
        Output<String> approvalModel,
        Output<String> budgetName,
        Output<BudgetActionDefinitionArgs> definition,
        Output<String> executionRoleArn,
        Output<String> notificationType,
        Output<List<BudgetActionSubscriberArgs>> subscribers) {
        this.accountId = accountId;
        this.actionThreshold = Objects.requireNonNull(actionThreshold, "expected parameter 'actionThreshold' to be non-null");
        this.actionType = Objects.requireNonNull(actionType, "expected parameter 'actionType' to be non-null");
        this.approvalModel = Objects.requireNonNull(approvalModel, "expected parameter 'approvalModel' to be non-null");
        this.budgetName = Objects.requireNonNull(budgetName, "expected parameter 'budgetName' to be non-null");
        this.definition = Objects.requireNonNull(definition, "expected parameter 'definition' to be non-null");
        this.executionRoleArn = Objects.requireNonNull(executionRoleArn, "expected parameter 'executionRoleArn' to be non-null");
        this.notificationType = Objects.requireNonNull(notificationType, "expected parameter 'notificationType' to be non-null");
        this.subscribers = Objects.requireNonNull(subscribers, "expected parameter 'subscribers' to be non-null");
    }

    private BudgetActionArgs() {
        this.accountId = Codegen.empty();
        this.actionThreshold = Codegen.empty();
        this.actionType = Codegen.empty();
        this.approvalModel = Codegen.empty();
        this.budgetName = Codegen.empty();
        this.definition = Codegen.empty();
        this.executionRoleArn = Codegen.empty();
        this.notificationType = Codegen.empty();
        this.subscribers = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountId;
        private Output<BudgetActionActionThresholdArgs> actionThreshold;
        private Output<String> actionType;
        private Output<String> approvalModel;
        private Output<String> budgetName;
        private Output<BudgetActionDefinitionArgs> definition;
        private Output<String> executionRoleArn;
        private Output<String> notificationType;
        private Output<List<BudgetActionSubscriberArgs>> subscribers;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.actionThreshold = defaults.actionThreshold;
    	      this.actionType = defaults.actionType;
    	      this.approvalModel = defaults.approvalModel;
    	      this.budgetName = defaults.budgetName;
    	      this.definition = defaults.definition;
    	      this.executionRoleArn = defaults.executionRoleArn;
    	      this.notificationType = defaults.notificationType;
    	      this.subscribers = defaults.subscribers;
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            this.accountId = accountId;
            return this;
        }
        public Builder accountId(@Nullable String accountId) {
            this.accountId = Codegen.ofNullable(accountId);
            return this;
        }
        public Builder actionThreshold(Output<BudgetActionActionThresholdArgs> actionThreshold) {
            this.actionThreshold = Objects.requireNonNull(actionThreshold);
            return this;
        }
        public Builder actionThreshold(BudgetActionActionThresholdArgs actionThreshold) {
            this.actionThreshold = Output.of(Objects.requireNonNull(actionThreshold));
            return this;
        }
        public Builder actionType(Output<String> actionType) {
            this.actionType = Objects.requireNonNull(actionType);
            return this;
        }
        public Builder actionType(String actionType) {
            this.actionType = Output.of(Objects.requireNonNull(actionType));
            return this;
        }
        public Builder approvalModel(Output<String> approvalModel) {
            this.approvalModel = Objects.requireNonNull(approvalModel);
            return this;
        }
        public Builder approvalModel(String approvalModel) {
            this.approvalModel = Output.of(Objects.requireNonNull(approvalModel));
            return this;
        }
        public Builder budgetName(Output<String> budgetName) {
            this.budgetName = Objects.requireNonNull(budgetName);
            return this;
        }
        public Builder budgetName(String budgetName) {
            this.budgetName = Output.of(Objects.requireNonNull(budgetName));
            return this;
        }
        public Builder definition(Output<BudgetActionDefinitionArgs> definition) {
            this.definition = Objects.requireNonNull(definition);
            return this;
        }
        public Builder definition(BudgetActionDefinitionArgs definition) {
            this.definition = Output.of(Objects.requireNonNull(definition));
            return this;
        }
        public Builder executionRoleArn(Output<String> executionRoleArn) {
            this.executionRoleArn = Objects.requireNonNull(executionRoleArn);
            return this;
        }
        public Builder executionRoleArn(String executionRoleArn) {
            this.executionRoleArn = Output.of(Objects.requireNonNull(executionRoleArn));
            return this;
        }
        public Builder notificationType(Output<String> notificationType) {
            this.notificationType = Objects.requireNonNull(notificationType);
            return this;
        }
        public Builder notificationType(String notificationType) {
            this.notificationType = Output.of(Objects.requireNonNull(notificationType));
            return this;
        }
        public Builder subscribers(Output<List<BudgetActionSubscriberArgs>> subscribers) {
            this.subscribers = Objects.requireNonNull(subscribers);
            return this;
        }
        public Builder subscribers(List<BudgetActionSubscriberArgs> subscribers) {
            this.subscribers = Output.of(Objects.requireNonNull(subscribers));
            return this;
        }
        public Builder subscribers(BudgetActionSubscriberArgs... subscribers) {
            return subscribers(List.of(subscribers));
        }        public BudgetActionArgs build() {
            return new BudgetActionArgs(accountId, actionThreshold, actionType, approvalModel, budgetName, definition, executionRoleArn, notificationType, subscribers);
        }
    }
}
