// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.RecurrenceFrequency;
import com.pulumi.azurenative.datafactory.inputs.RecurrenceScheduleArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The workflow trigger recurrence.
 * 
 */
public final class ScheduleTriggerRecurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduleTriggerRecurrenceArgs Empty = new ScheduleTriggerRecurrenceArgs();

    /**
     * The end time.
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    /**
     * @return The end time.
     * 
     */
    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * The frequency.
     * 
     */
    @Import(name="frequency")
    private @Nullable Output<Either<String,RecurrenceFrequency>> frequency;

    /**
     * @return The frequency.
     * 
     */
    public Optional<Output<Either<String,RecurrenceFrequency>>> frequency() {
        return Optional.ofNullable(this.frequency);
    }

    /**
     * The interval.
     * 
     */
    @Import(name="interval")
    private @Nullable Output<Integer> interval;

    /**
     * @return The interval.
     * 
     */
    public Optional<Output<Integer>> interval() {
        return Optional.ofNullable(this.interval);
    }

    /**
     * The recurrence schedule.
     * 
     */
    @Import(name="schedule")
    private @Nullable Output<RecurrenceScheduleArgs> schedule;

    /**
     * @return The recurrence schedule.
     * 
     */
    public Optional<Output<RecurrenceScheduleArgs>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    /**
     * The start time.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return The start time.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * The time zone.
     * 
     */
    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    /**
     * @return The time zone.
     * 
     */
    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    private ScheduleTriggerRecurrenceArgs() {}

    private ScheduleTriggerRecurrenceArgs(ScheduleTriggerRecurrenceArgs $) {
        this.endTime = $.endTime;
        this.frequency = $.frequency;
        this.interval = $.interval;
        this.schedule = $.schedule;
        this.startTime = $.startTime;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduleTriggerRecurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduleTriggerRecurrenceArgs $;

        public Builder() {
            $ = new ScheduleTriggerRecurrenceArgs();
        }

        public Builder(ScheduleTriggerRecurrenceArgs defaults) {
            $ = new ScheduleTriggerRecurrenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endTime The end time.
         * 
         * @return builder
         * 
         */
        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param endTime The end time.
         * 
         * @return builder
         * 
         */
        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        /**
         * @param frequency The frequency.
         * 
         * @return builder
         * 
         */
        public Builder frequency(@Nullable Output<Either<String,RecurrenceFrequency>> frequency) {
            $.frequency = frequency;
            return this;
        }

        /**
         * @param frequency The frequency.
         * 
         * @return builder
         * 
         */
        public Builder frequency(Either<String,RecurrenceFrequency> frequency) {
            return frequency(Output.of(frequency));
        }

        /**
         * @param frequency The frequency.
         * 
         * @return builder
         * 
         */
        public Builder frequency(String frequency) {
            return frequency(Either.ofLeft(frequency));
        }

        /**
         * @param frequency The frequency.
         * 
         * @return builder
         * 
         */
        public Builder frequency(RecurrenceFrequency frequency) {
            return frequency(Either.ofRight(frequency));
        }

        /**
         * @param interval The interval.
         * 
         * @return builder
         * 
         */
        public Builder interval(@Nullable Output<Integer> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval The interval.
         * 
         * @return builder
         * 
         */
        public Builder interval(Integer interval) {
            return interval(Output.of(interval));
        }

        /**
         * @param schedule The recurrence schedule.
         * 
         * @return builder
         * 
         */
        public Builder schedule(@Nullable Output<RecurrenceScheduleArgs> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule The recurrence schedule.
         * 
         * @return builder
         * 
         */
        public Builder schedule(RecurrenceScheduleArgs schedule) {
            return schedule(Output.of(schedule));
        }

        /**
         * @param startTime The start time.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime The start time.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        /**
         * @param timeZone The time zone.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone The time zone.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public ScheduleTriggerRecurrenceArgs build() {
            return $;
        }
    }

}
