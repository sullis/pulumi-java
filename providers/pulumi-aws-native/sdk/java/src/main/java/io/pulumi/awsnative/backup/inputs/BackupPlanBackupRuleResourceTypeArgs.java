// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.inputs;

import io.pulumi.awsnative.backup.inputs.BackupPlanCopyActionResourceTypeArgs;
import io.pulumi.awsnative.backup.inputs.BackupPlanLifecycleResourceTypeArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupPlanBackupRuleResourceTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupPlanBackupRuleResourceTypeArgs Empty = new BackupPlanBackupRuleResourceTypeArgs();

    @InputImport(name="completionWindowMinutes")
    private final @Nullable Input<Double> completionWindowMinutes;

    public Input<Double> getCompletionWindowMinutes() {
        return this.completionWindowMinutes == null ? Input.empty() : this.completionWindowMinutes;
    }

    @InputImport(name="copyActions")
    private final @Nullable Input<List<BackupPlanCopyActionResourceTypeArgs>> copyActions;

    public Input<List<BackupPlanCopyActionResourceTypeArgs>> getCopyActions() {
        return this.copyActions == null ? Input.empty() : this.copyActions;
    }

    @InputImport(name="enableContinuousBackup")
    private final @Nullable Input<Boolean> enableContinuousBackup;

    public Input<Boolean> getEnableContinuousBackup() {
        return this.enableContinuousBackup == null ? Input.empty() : this.enableContinuousBackup;
    }

    @InputImport(name="lifecycle")
    private final @Nullable Input<BackupPlanLifecycleResourceTypeArgs> lifecycle;

    public Input<BackupPlanLifecycleResourceTypeArgs> getLifecycle() {
        return this.lifecycle == null ? Input.empty() : this.lifecycle;
    }

    @InputImport(name="recoveryPointTags")
    private final @Nullable Input<Object> recoveryPointTags;

    public Input<Object> getRecoveryPointTags() {
        return this.recoveryPointTags == null ? Input.empty() : this.recoveryPointTags;
    }

    @InputImport(name="ruleName", required=true)
    private final Input<String> ruleName;

    public Input<String> getRuleName() {
        return this.ruleName;
    }

    @InputImport(name="scheduleExpression")
    private final @Nullable Input<String> scheduleExpression;

    public Input<String> getScheduleExpression() {
        return this.scheduleExpression == null ? Input.empty() : this.scheduleExpression;
    }

    @InputImport(name="startWindowMinutes")
    private final @Nullable Input<Double> startWindowMinutes;

    public Input<Double> getStartWindowMinutes() {
        return this.startWindowMinutes == null ? Input.empty() : this.startWindowMinutes;
    }

    @InputImport(name="targetBackupVault", required=true)
    private final Input<String> targetBackupVault;

    public Input<String> getTargetBackupVault() {
        return this.targetBackupVault;
    }

    public BackupPlanBackupRuleResourceTypeArgs(
        @Nullable Input<Double> completionWindowMinutes,
        @Nullable Input<List<BackupPlanCopyActionResourceTypeArgs>> copyActions,
        @Nullable Input<Boolean> enableContinuousBackup,
        @Nullable Input<BackupPlanLifecycleResourceTypeArgs> lifecycle,
        @Nullable Input<Object> recoveryPointTags,
        Input<String> ruleName,
        @Nullable Input<String> scheduleExpression,
        @Nullable Input<Double> startWindowMinutes,
        Input<String> targetBackupVault) {
        this.completionWindowMinutes = completionWindowMinutes;
        this.copyActions = copyActions;
        this.enableContinuousBackup = enableContinuousBackup;
        this.lifecycle = lifecycle;
        this.recoveryPointTags = recoveryPointTags;
        this.ruleName = Objects.requireNonNull(ruleName, "expected parameter 'ruleName' to be non-null");
        this.scheduleExpression = scheduleExpression;
        this.startWindowMinutes = startWindowMinutes;
        this.targetBackupVault = Objects.requireNonNull(targetBackupVault, "expected parameter 'targetBackupVault' to be non-null");
    }

    private BackupPlanBackupRuleResourceTypeArgs() {
        this.completionWindowMinutes = Input.empty();
        this.copyActions = Input.empty();
        this.enableContinuousBackup = Input.empty();
        this.lifecycle = Input.empty();
        this.recoveryPointTags = Input.empty();
        this.ruleName = Input.empty();
        this.scheduleExpression = Input.empty();
        this.startWindowMinutes = Input.empty();
        this.targetBackupVault = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPlanBackupRuleResourceTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> completionWindowMinutes;
        private @Nullable Input<List<BackupPlanCopyActionResourceTypeArgs>> copyActions;
        private @Nullable Input<Boolean> enableContinuousBackup;
        private @Nullable Input<BackupPlanLifecycleResourceTypeArgs> lifecycle;
        private @Nullable Input<Object> recoveryPointTags;
        private Input<String> ruleName;
        private @Nullable Input<String> scheduleExpression;
        private @Nullable Input<Double> startWindowMinutes;
        private Input<String> targetBackupVault;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupPlanBackupRuleResourceTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completionWindowMinutes = defaults.completionWindowMinutes;
    	      this.copyActions = defaults.copyActions;
    	      this.enableContinuousBackup = defaults.enableContinuousBackup;
    	      this.lifecycle = defaults.lifecycle;
    	      this.recoveryPointTags = defaults.recoveryPointTags;
    	      this.ruleName = defaults.ruleName;
    	      this.scheduleExpression = defaults.scheduleExpression;
    	      this.startWindowMinutes = defaults.startWindowMinutes;
    	      this.targetBackupVault = defaults.targetBackupVault;
        }

        public Builder setCompletionWindowMinutes(@Nullable Input<Double> completionWindowMinutes) {
            this.completionWindowMinutes = completionWindowMinutes;
            return this;
        }

        public Builder setCompletionWindowMinutes(@Nullable Double completionWindowMinutes) {
            this.completionWindowMinutes = Input.ofNullable(completionWindowMinutes);
            return this;
        }

        public Builder setCopyActions(@Nullable Input<List<BackupPlanCopyActionResourceTypeArgs>> copyActions) {
            this.copyActions = copyActions;
            return this;
        }

        public Builder setCopyActions(@Nullable List<BackupPlanCopyActionResourceTypeArgs> copyActions) {
            this.copyActions = Input.ofNullable(copyActions);
            return this;
        }

        public Builder setEnableContinuousBackup(@Nullable Input<Boolean> enableContinuousBackup) {
            this.enableContinuousBackup = enableContinuousBackup;
            return this;
        }

        public Builder setEnableContinuousBackup(@Nullable Boolean enableContinuousBackup) {
            this.enableContinuousBackup = Input.ofNullable(enableContinuousBackup);
            return this;
        }

        public Builder setLifecycle(@Nullable Input<BackupPlanLifecycleResourceTypeArgs> lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        public Builder setLifecycle(@Nullable BackupPlanLifecycleResourceTypeArgs lifecycle) {
            this.lifecycle = Input.ofNullable(lifecycle);
            return this;
        }

        public Builder setRecoveryPointTags(@Nullable Input<Object> recoveryPointTags) {
            this.recoveryPointTags = recoveryPointTags;
            return this;
        }

        public Builder setRecoveryPointTags(@Nullable Object recoveryPointTags) {
            this.recoveryPointTags = Input.ofNullable(recoveryPointTags);
            return this;
        }

        public Builder setRuleName(Input<String> ruleName) {
            this.ruleName = Objects.requireNonNull(ruleName);
            return this;
        }

        public Builder setRuleName(String ruleName) {
            this.ruleName = Input.of(Objects.requireNonNull(ruleName));
            return this;
        }

        public Builder setScheduleExpression(@Nullable Input<String> scheduleExpression) {
            this.scheduleExpression = scheduleExpression;
            return this;
        }

        public Builder setScheduleExpression(@Nullable String scheduleExpression) {
            this.scheduleExpression = Input.ofNullable(scheduleExpression);
            return this;
        }

        public Builder setStartWindowMinutes(@Nullable Input<Double> startWindowMinutes) {
            this.startWindowMinutes = startWindowMinutes;
            return this;
        }

        public Builder setStartWindowMinutes(@Nullable Double startWindowMinutes) {
            this.startWindowMinutes = Input.ofNullable(startWindowMinutes);
            return this;
        }

        public Builder setTargetBackupVault(Input<String> targetBackupVault) {
            this.targetBackupVault = Objects.requireNonNull(targetBackupVault);
            return this;
        }

        public Builder setTargetBackupVault(String targetBackupVault) {
            this.targetBackupVault = Input.of(Objects.requireNonNull(targetBackupVault));
            return this;
        }

        public BackupPlanBackupRuleResourceTypeArgs build() {
            return new BackupPlanBackupRuleResourceTypeArgs(completionWindowMinutes, copyActions, enableContinuousBackup, lifecycle, recoveryPointTags, ruleName, scheduleExpression, startWindowMinutes, targetBackupVault);
        }
    }
}
