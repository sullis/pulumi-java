// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.azurenative.sql.enums.JobScheduleType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Scheduling properties of a job.
 * 
 */
public final class JobScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobScheduleArgs Empty = new JobScheduleArgs();

    /**
     * Whether or not the schedule is enabled.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Schedule end time.
     * 
     */
    @InputImport(name="endTime")
    private final @Nullable Input<String> endTime;

    public Input<String> getEndTime() {
        return this.endTime == null ? Input.empty() : this.endTime;
    }

    /**
     * Value of the schedule's recurring interval, if the ScheduleType is recurring. ISO8601 duration format.
     * 
     */
    @InputImport(name="interval")
    private final @Nullable Input<String> interval;

    public Input<String> getInterval() {
        return this.interval == null ? Input.empty() : this.interval;
    }

    /**
     * Schedule start time.
     * 
     */
    @InputImport(name="startTime")
    private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    /**
     * Schedule interval type
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<JobScheduleType> type;

    public Input<JobScheduleType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public JobScheduleArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> endTime,
        @Nullable Input<String> interval,
        @Nullable Input<String> startTime,
        @Nullable Input<JobScheduleType> type) {
        this.enabled = enabled;
        this.endTime = endTime == null ? Input.ofNullable("9999-12-31T11:59:59+00:00") : endTime;
        this.interval = interval;
        this.startTime = startTime == null ? Input.ofNullable("0001-01-01T00:00:00+00:00") : startTime;
        this.type = type == null ? Input.ofNullable(io.pulumi.azurenative.sql.enums.JobScheduleType.Once) : type;
    }

    private JobScheduleArgs() {
        this.enabled = Input.empty();
        this.endTime = Input.empty();
        this.interval = Input.empty();
        this.startTime = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> endTime;
        private @Nullable Input<String> interval;
        private @Nullable Input<String> startTime;
        private @Nullable Input<JobScheduleType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(JobScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.endTime = defaults.endTime;
    	      this.interval = defaults.interval;
    	      this.startTime = defaults.startTime;
    	      this.type = defaults.type;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setEndTime(@Nullable Input<String> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = Input.ofNullable(endTime);
            return this;
        }

        public Builder setInterval(@Nullable Input<String> interval) {
            this.interval = interval;
            return this;
        }

        public Builder setInterval(@Nullable String interval) {
            this.interval = Input.ofNullable(interval);
            return this;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public Builder setType(@Nullable Input<JobScheduleType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable JobScheduleType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public JobScheduleArgs build() {
            return new JobScheduleArgs(enabled, endTime, interval, startTime, type);
        }
    }
}
