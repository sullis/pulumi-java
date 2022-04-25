// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.RecurrenceScheduleResponse;
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
public final class ScheduleTriggerRecurrenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final ScheduleTriggerRecurrenceResponse Empty = new ScheduleTriggerRecurrenceResponse();

    /**
     * The end time.
     * 
     */
    @Import(name="endTime")
    private @Nullable String endTime;

    /**
     * @return The end time.
     * 
     */
    public Optional<String> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * The frequency.
     * 
     */
    @Import(name="frequency")
    private @Nullable String frequency;

    /**
     * @return The frequency.
     * 
     */
    public Optional<String> frequency() {
        return Optional.ofNullable(this.frequency);
    }

    /**
     * The interval.
     * 
     */
    @Import(name="interval")
    private @Nullable Integer interval;

    /**
     * @return The interval.
     * 
     */
    public Optional<Integer> interval() {
        return Optional.ofNullable(this.interval);
    }

    /**
     * The recurrence schedule.
     * 
     */
    @Import(name="schedule")
    private @Nullable RecurrenceScheduleResponse schedule;

    /**
     * @return The recurrence schedule.
     * 
     */
    public Optional<RecurrenceScheduleResponse> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    /**
     * The start time.
     * 
     */
    @Import(name="startTime")
    private @Nullable String startTime;

    /**
     * @return The start time.
     * 
     */
    public Optional<String> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * The time zone.
     * 
     */
    @Import(name="timeZone")
    private @Nullable String timeZone;

    /**
     * @return The time zone.
     * 
     */
    public Optional<String> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    private ScheduleTriggerRecurrenceResponse() {}

    private ScheduleTriggerRecurrenceResponse(ScheduleTriggerRecurrenceResponse $) {
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
    public static Builder builder(ScheduleTriggerRecurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduleTriggerRecurrenceResponse $;

        public Builder() {
            $ = new ScheduleTriggerRecurrenceResponse();
        }

        public Builder(ScheduleTriggerRecurrenceResponse defaults) {
            $ = new ScheduleTriggerRecurrenceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param endTime The end time.
         * 
         * @return builder
         * 
         */
        public Builder endTime(@Nullable String endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param frequency The frequency.
         * 
         * @return builder
         * 
         */
        public Builder frequency(@Nullable String frequency) {
            $.frequency = frequency;
            return this;
        }

        /**
         * @param interval The interval.
         * 
         * @return builder
         * 
         */
        public Builder interval(@Nullable Integer interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param schedule The recurrence schedule.
         * 
         * @return builder
         * 
         */
        public Builder schedule(@Nullable RecurrenceScheduleResponse schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param startTime The start time.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable String startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param timeZone The time zone.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(@Nullable String timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        public ScheduleTriggerRecurrenceResponse build() {
            return $;
        }
    }

}
