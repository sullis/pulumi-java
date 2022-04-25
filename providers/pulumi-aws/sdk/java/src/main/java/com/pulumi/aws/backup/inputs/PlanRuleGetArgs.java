// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup.inputs;

import com.pulumi.aws.backup.inputs.PlanRuleCopyActionGetArgs;
import com.pulumi.aws.backup.inputs.PlanRuleLifecycleGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PlanRuleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PlanRuleGetArgs Empty = new PlanRuleGetArgs();

    /**
     * The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
     * 
     */
    @Import(name="completionWindow")
    private @Nullable Output<Integer> completionWindow;

    /**
     * @return The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
     * 
     */
    public Optional<Output<Integer>> completionWindow() {
        return Optional.ofNullable(this.completionWindow);
    }

    /**
     * Configuration block(s) with copy operation settings. Detailed below.
     * 
     */
    @Import(name="copyActions")
    private @Nullable Output<List<PlanRuleCopyActionGetArgs>> copyActions;

    /**
     * @return Configuration block(s) with copy operation settings. Detailed below.
     * 
     */
    public Optional<Output<List<PlanRuleCopyActionGetArgs>>> copyActions() {
        return Optional.ofNullable(this.copyActions);
    }

    /**
     * Enable continuous backups for supported resources.
     * 
     */
    @Import(name="enableContinuousBackup")
    private @Nullable Output<Boolean> enableContinuousBackup;

    /**
     * @return Enable continuous backups for supported resources.
     * 
     */
    public Optional<Output<Boolean>> enableContinuousBackup() {
        return Optional.ofNullable(this.enableContinuousBackup);
    }

    /**
     * The lifecycle defines when a protected resource is copied over to a backup vault and when it expires.  Fields documented above.
     * 
     */
    @Import(name="lifecycle")
    private @Nullable Output<PlanRuleLifecycleGetArgs> lifecycle;

    /**
     * @return The lifecycle defines when a protected resource is copied over to a backup vault and when it expires.  Fields documented above.
     * 
     */
    public Optional<Output<PlanRuleLifecycleGetArgs>> lifecycle() {
        return Optional.ofNullable(this.lifecycle);
    }

    /**
     * Metadata that you can assign to help organize the resources that you create.
     * 
     */
    @Import(name="recoveryPointTags")
    private @Nullable Output<Map<String,String>> recoveryPointTags;

    /**
     * @return Metadata that you can assign to help organize the resources that you create.
     * 
     */
    public Optional<Output<Map<String,String>>> recoveryPointTags() {
        return Optional.ofNullable(this.recoveryPointTags);
    }

    /**
     * An display name for a backup rule.
     * 
     */
    @Import(name="ruleName", required=true)
    private Output<String> ruleName;

    /**
     * @return An display name for a backup rule.
     * 
     */
    public Output<String> ruleName() {
        return this.ruleName;
    }

    /**
     * A CRON expression specifying when AWS Backup initiates a backup job.
     * 
     */
    @Import(name="schedule")
    private @Nullable Output<String> schedule;

    /**
     * @return A CRON expression specifying when AWS Backup initiates a backup job.
     * 
     */
    public Optional<Output<String>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    /**
     * The amount of time in minutes before beginning a backup.
     * 
     */
    @Import(name="startWindow")
    private @Nullable Output<Integer> startWindow;

    /**
     * @return The amount of time in minutes before beginning a backup.
     * 
     */
    public Optional<Output<Integer>> startWindow() {
        return Optional.ofNullable(this.startWindow);
    }

    /**
     * The name of a logical container where backups are stored.
     * 
     */
    @Import(name="targetVaultName", required=true)
    private Output<String> targetVaultName;

    /**
     * @return The name of a logical container where backups are stored.
     * 
     */
    public Output<String> targetVaultName() {
        return this.targetVaultName;
    }

    private PlanRuleGetArgs() {}

    private PlanRuleGetArgs(PlanRuleGetArgs $) {
        this.completionWindow = $.completionWindow;
        this.copyActions = $.copyActions;
        this.enableContinuousBackup = $.enableContinuousBackup;
        this.lifecycle = $.lifecycle;
        this.recoveryPointTags = $.recoveryPointTags;
        this.ruleName = $.ruleName;
        this.schedule = $.schedule;
        this.startWindow = $.startWindow;
        this.targetVaultName = $.targetVaultName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PlanRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PlanRuleGetArgs $;

        public Builder() {
            $ = new PlanRuleGetArgs();
        }

        public Builder(PlanRuleGetArgs defaults) {
            $ = new PlanRuleGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param completionWindow The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
         * 
         * @return builder
         * 
         */
        public Builder completionWindow(@Nullable Output<Integer> completionWindow) {
            $.completionWindow = completionWindow;
            return this;
        }

        /**
         * @param completionWindow The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
         * 
         * @return builder
         * 
         */
        public Builder completionWindow(Integer completionWindow) {
            return completionWindow(Output.of(completionWindow));
        }

        /**
         * @param copyActions Configuration block(s) with copy operation settings. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder copyActions(@Nullable Output<List<PlanRuleCopyActionGetArgs>> copyActions) {
            $.copyActions = copyActions;
            return this;
        }

        /**
         * @param copyActions Configuration block(s) with copy operation settings. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder copyActions(List<PlanRuleCopyActionGetArgs> copyActions) {
            return copyActions(Output.of(copyActions));
        }

        /**
         * @param copyActions Configuration block(s) with copy operation settings. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder copyActions(PlanRuleCopyActionGetArgs... copyActions) {
            return copyActions(List.of(copyActions));
        }

        /**
         * @param enableContinuousBackup Enable continuous backups for supported resources.
         * 
         * @return builder
         * 
         */
        public Builder enableContinuousBackup(@Nullable Output<Boolean> enableContinuousBackup) {
            $.enableContinuousBackup = enableContinuousBackup;
            return this;
        }

        /**
         * @param enableContinuousBackup Enable continuous backups for supported resources.
         * 
         * @return builder
         * 
         */
        public Builder enableContinuousBackup(Boolean enableContinuousBackup) {
            return enableContinuousBackup(Output.of(enableContinuousBackup));
        }

        /**
         * @param lifecycle The lifecycle defines when a protected resource is copied over to a backup vault and when it expires.  Fields documented above.
         * 
         * @return builder
         * 
         */
        public Builder lifecycle(@Nullable Output<PlanRuleLifecycleGetArgs> lifecycle) {
            $.lifecycle = lifecycle;
            return this;
        }

        /**
         * @param lifecycle The lifecycle defines when a protected resource is copied over to a backup vault and when it expires.  Fields documented above.
         * 
         * @return builder
         * 
         */
        public Builder lifecycle(PlanRuleLifecycleGetArgs lifecycle) {
            return lifecycle(Output.of(lifecycle));
        }

        /**
         * @param recoveryPointTags Metadata that you can assign to help organize the resources that you create.
         * 
         * @return builder
         * 
         */
        public Builder recoveryPointTags(@Nullable Output<Map<String,String>> recoveryPointTags) {
            $.recoveryPointTags = recoveryPointTags;
            return this;
        }

        /**
         * @param recoveryPointTags Metadata that you can assign to help organize the resources that you create.
         * 
         * @return builder
         * 
         */
        public Builder recoveryPointTags(Map<String,String> recoveryPointTags) {
            return recoveryPointTags(Output.of(recoveryPointTags));
        }

        /**
         * @param ruleName An display name for a backup rule.
         * 
         * @return builder
         * 
         */
        public Builder ruleName(Output<String> ruleName) {
            $.ruleName = ruleName;
            return this;
        }

        /**
         * @param ruleName An display name for a backup rule.
         * 
         * @return builder
         * 
         */
        public Builder ruleName(String ruleName) {
            return ruleName(Output.of(ruleName));
        }

        /**
         * @param schedule A CRON expression specifying when AWS Backup initiates a backup job.
         * 
         * @return builder
         * 
         */
        public Builder schedule(@Nullable Output<String> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule A CRON expression specifying when AWS Backup initiates a backup job.
         * 
         * @return builder
         * 
         */
        public Builder schedule(String schedule) {
            return schedule(Output.of(schedule));
        }

        /**
         * @param startWindow The amount of time in minutes before beginning a backup.
         * 
         * @return builder
         * 
         */
        public Builder startWindow(@Nullable Output<Integer> startWindow) {
            $.startWindow = startWindow;
            return this;
        }

        /**
         * @param startWindow The amount of time in minutes before beginning a backup.
         * 
         * @return builder
         * 
         */
        public Builder startWindow(Integer startWindow) {
            return startWindow(Output.of(startWindow));
        }

        /**
         * @param targetVaultName The name of a logical container where backups are stored.
         * 
         * @return builder
         * 
         */
        public Builder targetVaultName(Output<String> targetVaultName) {
            $.targetVaultName = targetVaultName;
            return this;
        }

        /**
         * @param targetVaultName The name of a logical container where backups are stored.
         * 
         * @return builder
         * 
         */
        public Builder targetVaultName(String targetVaultName) {
            return targetVaultName(Output.of(targetVaultName));
        }

        public PlanRuleGetArgs build() {
            $.ruleName = Objects.requireNonNull($.ruleName, "expected parameter 'ruleName' to be non-null");
            $.targetVaultName = Objects.requireNonNull($.targetVaultName, "expected parameter 'targetVaultName' to be non-null");
            return $;
        }
    }

}
