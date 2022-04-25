// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift.inputs;

import com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScheduledActionState extends com.pulumi.resources.ResourceArgs {

    public static final ScheduledActionState Empty = new ScheduledActionState();

    /**
     * The description of the scheduled action.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the scheduled action.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether to enable the scheduled action. Default is `true` .
     * 
     */
    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    /**
     * @return Whether to enable the scheduled action. Default is `true` .
     * 
     */
    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    /**
     * The end time in UTC when the schedule is active, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    /**
     * @return The end time in UTC when the schedule is active, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
     * 
     */
    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * The IAM role to assume to run the scheduled action.
     * 
     */
    @Import(name="iamRole")
    private @Nullable Output<String> iamRole;

    /**
     * @return The IAM role to assume to run the scheduled action.
     * 
     */
    public Optional<Output<String>> iamRole() {
        return Optional.ofNullable(this.iamRole);
    }

    /**
     * The scheduled action name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The scheduled action name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The schedule of action. The schedule is defined format of &#34;at expression&#34; or &#34;cron expression&#34;, for example `at(2016-03-04T17:27:00)` or `cron(0 10 ? * MON *)`. See [Scheduled Action](https://docs.aws.amazon.com/redshift/latest/APIReference/API_ScheduledAction.html) for more information.
     * 
     */
    @Import(name="schedule")
    private @Nullable Output<String> schedule;

    /**
     * @return The schedule of action. The schedule is defined format of &#34;at expression&#34; or &#34;cron expression&#34;, for example `at(2016-03-04T17:27:00)` or `cron(0 10 ? * MON *)`. See [Scheduled Action](https://docs.aws.amazon.com/redshift/latest/APIReference/API_ScheduledAction.html) for more information.
     * 
     */
    public Optional<Output<String>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    /**
     * The start time in UTC when the schedule is active, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return The start time in UTC when the schedule is active, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * Target action. Documented below.
     * 
     */
    @Import(name="targetAction")
    private @Nullable Output<ScheduledActionTargetActionGetArgs> targetAction;

    /**
     * @return Target action. Documented below.
     * 
     */
    public Optional<Output<ScheduledActionTargetActionGetArgs>> targetAction() {
        return Optional.ofNullable(this.targetAction);
    }

    private ScheduledActionState() {}

    private ScheduledActionState(ScheduledActionState $) {
        this.description = $.description;
        this.enable = $.enable;
        this.endTime = $.endTime;
        this.iamRole = $.iamRole;
        this.name = $.name;
        this.schedule = $.schedule;
        this.startTime = $.startTime;
        this.targetAction = $.targetAction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduledActionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduledActionState $;

        public Builder() {
            $ = new ScheduledActionState();
        }

        public Builder(ScheduledActionState defaults) {
            $ = new ScheduledActionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the scheduled action.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the scheduled action.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enable Whether to enable the scheduled action. Default is `true` .
         * 
         * @return builder
         * 
         */
        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enable Whether to enable the scheduled action. Default is `true` .
         * 
         * @return builder
         * 
         */
        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        /**
         * @param endTime The end time in UTC when the schedule is active, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
         * 
         * @return builder
         * 
         */
        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param endTime The end time in UTC when the schedule is active, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
         * 
         * @return builder
         * 
         */
        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        /**
         * @param iamRole The IAM role to assume to run the scheduled action.
         * 
         * @return builder
         * 
         */
        public Builder iamRole(@Nullable Output<String> iamRole) {
            $.iamRole = iamRole;
            return this;
        }

        /**
         * @param iamRole The IAM role to assume to run the scheduled action.
         * 
         * @return builder
         * 
         */
        public Builder iamRole(String iamRole) {
            return iamRole(Output.of(iamRole));
        }

        /**
         * @param name The scheduled action name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The scheduled action name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param schedule The schedule of action. The schedule is defined format of &#34;at expression&#34; or &#34;cron expression&#34;, for example `at(2016-03-04T17:27:00)` or `cron(0 10 ? * MON *)`. See [Scheduled Action](https://docs.aws.amazon.com/redshift/latest/APIReference/API_ScheduledAction.html) for more information.
         * 
         * @return builder
         * 
         */
        public Builder schedule(@Nullable Output<String> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule The schedule of action. The schedule is defined format of &#34;at expression&#34; or &#34;cron expression&#34;, for example `at(2016-03-04T17:27:00)` or `cron(0 10 ? * MON *)`. See [Scheduled Action](https://docs.aws.amazon.com/redshift/latest/APIReference/API_ScheduledAction.html) for more information.
         * 
         * @return builder
         * 
         */
        public Builder schedule(String schedule) {
            return schedule(Output.of(schedule));
        }

        /**
         * @param startTime The start time in UTC when the schedule is active, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime The start time in UTC when the schedule is active, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        /**
         * @param targetAction Target action. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder targetAction(@Nullable Output<ScheduledActionTargetActionGetArgs> targetAction) {
            $.targetAction = targetAction;
            return this;
        }

        /**
         * @param targetAction Target action. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder targetAction(ScheduledActionTargetActionGetArgs targetAction) {
            return targetAction(Output.of(targetAction));
        }

        public ScheduledActionState build() {
            return $;
        }
    }

}
