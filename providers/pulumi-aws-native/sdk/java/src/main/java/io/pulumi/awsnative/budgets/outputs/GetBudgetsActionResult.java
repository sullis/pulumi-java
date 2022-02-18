// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.budgets.outputs;

import io.pulumi.awsnative.budgets.enums.BudgetsActionApprovalModel;
import io.pulumi.awsnative.budgets.enums.BudgetsActionNotificationType;
import io.pulumi.awsnative.budgets.outputs.BudgetsActionActionThreshold;
import io.pulumi.awsnative.budgets.outputs.BudgetsActionDefinition;
import io.pulumi.awsnative.budgets.outputs.BudgetsActionSubscriber;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetBudgetsActionResult {
    private final @Nullable String actionId;
    private final @Nullable BudgetsActionActionThreshold actionThreshold;
    private final @Nullable BudgetsActionApprovalModel approvalModel;
    private final @Nullable BudgetsActionDefinition definition;
    private final @Nullable String executionRoleArn;
    private final @Nullable BudgetsActionNotificationType notificationType;
    private final @Nullable List<BudgetsActionSubscriber> subscribers;

    @OutputCustomType.Constructor({"actionId","actionThreshold","approvalModel","definition","executionRoleArn","notificationType","subscribers"})
    private GetBudgetsActionResult(
        @Nullable String actionId,
        @Nullable BudgetsActionActionThreshold actionThreshold,
        @Nullable BudgetsActionApprovalModel approvalModel,
        @Nullable BudgetsActionDefinition definition,
        @Nullable String executionRoleArn,
        @Nullable BudgetsActionNotificationType notificationType,
        @Nullable List<BudgetsActionSubscriber> subscribers) {
        this.actionId = actionId;
        this.actionThreshold = actionThreshold;
        this.approvalModel = approvalModel;
        this.definition = definition;
        this.executionRoleArn = executionRoleArn;
        this.notificationType = notificationType;
        this.subscribers = subscribers;
    }

    public Optional<String> getActionId() {
        return Optional.ofNullable(this.actionId);
    }
    public Optional<BudgetsActionActionThreshold> getActionThreshold() {
        return Optional.ofNullable(this.actionThreshold);
    }
    public Optional<BudgetsActionApprovalModel> getApprovalModel() {
        return Optional.ofNullable(this.approvalModel);
    }
    public Optional<BudgetsActionDefinition> getDefinition() {
        return Optional.ofNullable(this.definition);
    }
    public Optional<String> getExecutionRoleArn() {
        return Optional.ofNullable(this.executionRoleArn);
    }
    public Optional<BudgetsActionNotificationType> getNotificationType() {
        return Optional.ofNullable(this.notificationType);
    }
    public List<BudgetsActionSubscriber> getSubscribers() {
        return this.subscribers == null ? List.of() : this.subscribers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBudgetsActionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionId;
        private @Nullable BudgetsActionActionThreshold actionThreshold;
        private @Nullable BudgetsActionApprovalModel approvalModel;
        private @Nullable BudgetsActionDefinition definition;
        private @Nullable String executionRoleArn;
        private @Nullable BudgetsActionNotificationType notificationType;
        private @Nullable List<BudgetsActionSubscriber> subscribers;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBudgetsActionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionId = defaults.actionId;
    	      this.actionThreshold = defaults.actionThreshold;
    	      this.approvalModel = defaults.approvalModel;
    	      this.definition = defaults.definition;
    	      this.executionRoleArn = defaults.executionRoleArn;
    	      this.notificationType = defaults.notificationType;
    	      this.subscribers = defaults.subscribers;
        }

        public Builder setActionId(@Nullable String actionId) {
            this.actionId = actionId;
            return this;
        }

        public Builder setActionThreshold(@Nullable BudgetsActionActionThreshold actionThreshold) {
            this.actionThreshold = actionThreshold;
            return this;
        }

        public Builder setApprovalModel(@Nullable BudgetsActionApprovalModel approvalModel) {
            this.approvalModel = approvalModel;
            return this;
        }

        public Builder setDefinition(@Nullable BudgetsActionDefinition definition) {
            this.definition = definition;
            return this;
        }

        public Builder setExecutionRoleArn(@Nullable String executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }

        public Builder setNotificationType(@Nullable BudgetsActionNotificationType notificationType) {
            this.notificationType = notificationType;
            return this;
        }

        public Builder setSubscribers(@Nullable List<BudgetsActionSubscriber> subscribers) {
            this.subscribers = subscribers;
            return this;
        }

        public GetBudgetsActionResult build() {
            return new GetBudgetsActionResult(actionId, actionThreshold, approvalModel, definition, executionRoleArn, notificationType, subscribers);
        }
    }
}
