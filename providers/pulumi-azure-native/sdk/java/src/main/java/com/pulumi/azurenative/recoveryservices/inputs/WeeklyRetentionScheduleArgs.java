// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.enums.DayOfWeek;
import com.pulumi.azurenative.recoveryservices.inputs.RetentionDurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Weekly retention schedule.
 * 
 */
public final class WeeklyRetentionScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final WeeklyRetentionScheduleArgs Empty = new WeeklyRetentionScheduleArgs();

    /**
     * List of days of week for weekly retention policy.
     * 
     */
    @Import(name="daysOfTheWeek")
    private @Nullable Output<List<DayOfWeek>> daysOfTheWeek;

    /**
     * @return List of days of week for weekly retention policy.
     * 
     */
    public Optional<Output<List<DayOfWeek>>> daysOfTheWeek() {
        return Optional.ofNullable(this.daysOfTheWeek);
    }

    /**
     * Retention duration of retention Policy.
     * 
     */
    @Import(name="retentionDuration")
    private @Nullable Output<RetentionDurationArgs> retentionDuration;

    /**
     * @return Retention duration of retention Policy.
     * 
     */
    public Optional<Output<RetentionDurationArgs>> retentionDuration() {
        return Optional.ofNullable(this.retentionDuration);
    }

    /**
     * Retention times of retention policy.
     * 
     */
    @Import(name="retentionTimes")
    private @Nullable Output<List<String>> retentionTimes;

    /**
     * @return Retention times of retention policy.
     * 
     */
    public Optional<Output<List<String>>> retentionTimes() {
        return Optional.ofNullable(this.retentionTimes);
    }

    private WeeklyRetentionScheduleArgs() {}

    private WeeklyRetentionScheduleArgs(WeeklyRetentionScheduleArgs $) {
        this.daysOfTheWeek = $.daysOfTheWeek;
        this.retentionDuration = $.retentionDuration;
        this.retentionTimes = $.retentionTimes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WeeklyRetentionScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WeeklyRetentionScheduleArgs $;

        public Builder() {
            $ = new WeeklyRetentionScheduleArgs();
        }

        public Builder(WeeklyRetentionScheduleArgs defaults) {
            $ = new WeeklyRetentionScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param daysOfTheWeek List of days of week for weekly retention policy.
         * 
         * @return builder
         * 
         */
        public Builder daysOfTheWeek(@Nullable Output<List<DayOfWeek>> daysOfTheWeek) {
            $.daysOfTheWeek = daysOfTheWeek;
            return this;
        }

        /**
         * @param daysOfTheWeek List of days of week for weekly retention policy.
         * 
         * @return builder
         * 
         */
        public Builder daysOfTheWeek(List<DayOfWeek> daysOfTheWeek) {
            return daysOfTheWeek(Output.of(daysOfTheWeek));
        }

        /**
         * @param daysOfTheWeek List of days of week for weekly retention policy.
         * 
         * @return builder
         * 
         */
        public Builder daysOfTheWeek(DayOfWeek... daysOfTheWeek) {
            return daysOfTheWeek(List.of(daysOfTheWeek));
        }

        /**
         * @param retentionDuration Retention duration of retention Policy.
         * 
         * @return builder
         * 
         */
        public Builder retentionDuration(@Nullable Output<RetentionDurationArgs> retentionDuration) {
            $.retentionDuration = retentionDuration;
            return this;
        }

        /**
         * @param retentionDuration Retention duration of retention Policy.
         * 
         * @return builder
         * 
         */
        public Builder retentionDuration(RetentionDurationArgs retentionDuration) {
            return retentionDuration(Output.of(retentionDuration));
        }

        /**
         * @param retentionTimes Retention times of retention policy.
         * 
         * @return builder
         * 
         */
        public Builder retentionTimes(@Nullable Output<List<String>> retentionTimes) {
            $.retentionTimes = retentionTimes;
            return this;
        }

        /**
         * @param retentionTimes Retention times of retention policy.
         * 
         * @return builder
         * 
         */
        public Builder retentionTimes(List<String> retentionTimes) {
            return retentionTimes(Output.of(retentionTimes));
        }

        /**
         * @param retentionTimes Retention times of retention policy.
         * 
         * @return builder
         * 
         */
        public Builder retentionTimes(String... retentionTimes) {
            return retentionTimes(List.of(retentionTimes));
        }

        public WeeklyRetentionScheduleArgs build() {
            return $;
        }
    }

}
