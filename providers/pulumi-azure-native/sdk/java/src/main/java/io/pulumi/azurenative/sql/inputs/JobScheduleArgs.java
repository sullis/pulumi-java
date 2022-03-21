// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.azurenative.sql.enums.JobScheduleType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * Schedule end time.
     * 
     */
    @Import(name="endTime")
      private final @Nullable Output<String> endTime;

    public Output<String> getEndTime() {
        return this.endTime == null ? Output.empty() : this.endTime;
    }

    /**
     * Value of the schedule's recurring interval, if the ScheduleType is recurring. ISO8601 duration format.
     * 
     */
    @Import(name="interval")
      private final @Nullable Output<String> interval;

    public Output<String> getInterval() {
        return this.interval == null ? Output.empty() : this.interval;
    }

    /**
     * Schedule start time.
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime == null ? Output.empty() : this.startTime;
    }

    /**
     * Schedule interval type
     * 
     */
    @Import(name="type")
      private final @Nullable Output<JobScheduleType> type;

    public Output<JobScheduleType> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public JobScheduleArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> endTime,
        @Nullable Output<String> interval,
        @Nullable Output<String> startTime,
        @Nullable Output<JobScheduleType> type) {
        this.enabled = enabled;
        this.endTime = endTime == null ? Output.ofNullable("9999-12-31T11:59:59+00:00") : endTime;
        this.interval = interval;
        this.startTime = startTime == null ? Output.ofNullable("0001-01-01T00:00:00+00:00") : startTime;
        this.type = type == null ? Output.ofNullable(io.pulumi.azurenative.sql.enums.JobScheduleType.Once) : type;
    }

    private JobScheduleArgs() {
        this.enabled = Output.empty();
        this.endTime = Output.empty();
        this.interval = Output.empty();
        this.startTime = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> endTime;
        private @Nullable Output<String> interval;
        private @Nullable Output<String> startTime;
        private @Nullable Output<JobScheduleType> type;

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

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public Builder endTime(@Nullable Output<String> endTime) {
            this.endTime = endTime;
            return this;
        }
        public Builder endTime(@Nullable String endTime) {
            this.endTime = Output.ofNullable(endTime);
            return this;
        }
        public Builder interval(@Nullable Output<String> interval) {
            this.interval = interval;
            return this;
        }
        public Builder interval(@Nullable String interval) {
            this.interval = Output.ofNullable(interval);
            return this;
        }
        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = Output.ofNullable(startTime);
            return this;
        }
        public Builder type(@Nullable Output<JobScheduleType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable JobScheduleType type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public JobScheduleArgs build() {
            return new JobScheduleArgs(enabled, endTime, interval, startTime, type);
        }
    }
}
