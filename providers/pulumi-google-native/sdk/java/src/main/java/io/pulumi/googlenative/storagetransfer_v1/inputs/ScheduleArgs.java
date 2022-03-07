// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.storagetransfer_v1.inputs.DateArgs;
import io.pulumi.googlenative.storagetransfer_v1.inputs.TimeOfDayArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Transfers can be scheduled to recur or to run just once.
 * 
 */
public final class ScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduleArgs Empty = new ScheduleArgs();

    /**
     * The time in UTC that no further transfer operations are scheduled. Combined with schedule_end_date, `end_time_of_day` specifies the end date and time for starting new transfer operations. This field must be greater than or equal to the timestamp corresponding to the combintation of schedule_start_date and start_time_of_day, and is subject to the following: * If `end_time_of_day` is not set and `schedule_end_date` is set, then a default value of `23:59:59` is used for `end_time_of_day`. * If `end_time_of_day` is set and `schedule_end_date` is not set, then INVALID_ARGUMENT is returned.
     * 
     */
    @InputImport(name="endTimeOfDay")
      private final @Nullable Input<TimeOfDayArgs> endTimeOfDay;

    public Input<TimeOfDayArgs> getEndTimeOfDay() {
        return this.endTimeOfDay == null ? Input.empty() : this.endTimeOfDay;
    }

    /**
     * Interval between the start of each scheduled TransferOperation. If unspecified, the default value is 24 hours. This value may not be less than 1 hour.
     * 
     */
    @InputImport(name="repeatInterval")
      private final @Nullable Input<String> repeatInterval;

    public Input<String> getRepeatInterval() {
        return this.repeatInterval == null ? Input.empty() : this.repeatInterval;
    }

    /**
     * The last day a transfer runs. Date boundaries are determined relative to UTC time. A job runs once per 24 hours within the following guidelines: * If `schedule_end_date` and schedule_start_date are the same and in the future relative to UTC, the transfer is executed only one time. * If `schedule_end_date` is later than `schedule_start_date` and `schedule_end_date` is in the future relative to UTC, the job runs each day at start_time_of_day through `schedule_end_date`.
     * 
     */
    @InputImport(name="scheduleEndDate")
      private final @Nullable Input<DateArgs> scheduleEndDate;

    public Input<DateArgs> getScheduleEndDate() {
        return this.scheduleEndDate == null ? Input.empty() : this.scheduleEndDate;
    }

    /**
     * The start date of a transfer. Date boundaries are determined relative to UTC time. If `schedule_start_date` and start_time_of_day are in the past relative to the job's creation time, the transfer starts the day after you schedule the transfer request. **Note:** When starting jobs at or near midnight UTC it is possible that a job starts later than expected. For example, if you send an outbound request on June 1 one millisecond prior to midnight UTC and the Storage Transfer Service server receives the request on June 2, then it creates a TransferJob with `schedule_start_date` set to June 2 and a `start_time_of_day` set to midnight UTC. The first scheduled TransferOperation takes place on June 3 at midnight UTC.
     * 
     */
    @InputImport(name="scheduleStartDate", required=true)
      private final Input<DateArgs> scheduleStartDate;

    public Input<DateArgs> getScheduleStartDate() {
        return this.scheduleStartDate;
    }

    /**
     * The time in UTC that a transfer job is scheduled to run. Transfers may start later than this time. If `start_time_of_day` is not specified: * One-time transfers run immediately. * Recurring transfers run immediately, and each day at midnight UTC, through schedule_end_date. If `start_time_of_day` is specified: * One-time transfers run at the specified time. * Recurring transfers run at the specified time each day, through `schedule_end_date`.
     * 
     */
    @InputImport(name="startTimeOfDay")
      private final @Nullable Input<TimeOfDayArgs> startTimeOfDay;

    public Input<TimeOfDayArgs> getStartTimeOfDay() {
        return this.startTimeOfDay == null ? Input.empty() : this.startTimeOfDay;
    }

    public ScheduleArgs(
        @Nullable Input<TimeOfDayArgs> endTimeOfDay,
        @Nullable Input<String> repeatInterval,
        @Nullable Input<DateArgs> scheduleEndDate,
        Input<DateArgs> scheduleStartDate,
        @Nullable Input<TimeOfDayArgs> startTimeOfDay) {
        this.endTimeOfDay = endTimeOfDay;
        this.repeatInterval = repeatInterval;
        this.scheduleEndDate = scheduleEndDate;
        this.scheduleStartDate = Objects.requireNonNull(scheduleStartDate, "expected parameter 'scheduleStartDate' to be non-null");
        this.startTimeOfDay = startTimeOfDay;
    }

    private ScheduleArgs() {
        this.endTimeOfDay = Input.empty();
        this.repeatInterval = Input.empty();
        this.scheduleEndDate = Input.empty();
        this.scheduleStartDate = Input.empty();
        this.startTimeOfDay = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TimeOfDayArgs> endTimeOfDay;
        private @Nullable Input<String> repeatInterval;
        private @Nullable Input<DateArgs> scheduleEndDate;
        private Input<DateArgs> scheduleStartDate;
        private @Nullable Input<TimeOfDayArgs> startTimeOfDay;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTimeOfDay = defaults.endTimeOfDay;
    	      this.repeatInterval = defaults.repeatInterval;
    	      this.scheduleEndDate = defaults.scheduleEndDate;
    	      this.scheduleStartDate = defaults.scheduleStartDate;
    	      this.startTimeOfDay = defaults.startTimeOfDay;
        }

        public Builder setEndTimeOfDay(@Nullable Input<TimeOfDayArgs> endTimeOfDay) {
            this.endTimeOfDay = endTimeOfDay;
            return this;
        }

        public Builder setEndTimeOfDay(@Nullable TimeOfDayArgs endTimeOfDay) {
            this.endTimeOfDay = Input.ofNullable(endTimeOfDay);
            return this;
        }

        public Builder setRepeatInterval(@Nullable Input<String> repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }

        public Builder setRepeatInterval(@Nullable String repeatInterval) {
            this.repeatInterval = Input.ofNullable(repeatInterval);
            return this;
        }

        public Builder setScheduleEndDate(@Nullable Input<DateArgs> scheduleEndDate) {
            this.scheduleEndDate = scheduleEndDate;
            return this;
        }

        public Builder setScheduleEndDate(@Nullable DateArgs scheduleEndDate) {
            this.scheduleEndDate = Input.ofNullable(scheduleEndDate);
            return this;
        }

        public Builder setScheduleStartDate(Input<DateArgs> scheduleStartDate) {
            this.scheduleStartDate = Objects.requireNonNull(scheduleStartDate);
            return this;
        }

        public Builder setScheduleStartDate(DateArgs scheduleStartDate) {
            this.scheduleStartDate = Input.of(Objects.requireNonNull(scheduleStartDate));
            return this;
        }

        public Builder setStartTimeOfDay(@Nullable Input<TimeOfDayArgs> startTimeOfDay) {
            this.startTimeOfDay = startTimeOfDay;
            return this;
        }

        public Builder setStartTimeOfDay(@Nullable TimeOfDayArgs startTimeOfDay) {
            this.startTimeOfDay = Input.ofNullable(startTimeOfDay);
            return this;
        }
        public ScheduleArgs build() {
            return new ScheduleArgs(endTimeOfDay, repeatInterval, scheduleEndDate, scheduleStartDate, startTimeOfDay);
        }
    }
}