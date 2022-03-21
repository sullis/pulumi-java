// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The schedule of a recurring or one time event. The event's time span is specified by start_time and end_time. If the scheduled event's timespan is larger than the cron_spec + cron_job_duration, the event will be recurring. If only cron_spec + cron_job_duration are specified, the event is effective starting at the local time specified by cron_spec, and is recurring. ```start_time|-------[cron job]-------[cron job]-------[cron job]---|end_time cron job: cron spec start time + duration```
 * 
 */
public final class ScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduleArgs Empty = new ScheduleArgs();

    /**
     * The duration for the cron job event. The duration of the event is effective after the cron job's start time.
     * 
     */
    @Import(name="cronJobDuration")
      private final @Nullable Output<String> cronJobDuration;

    public Output<String> getCronJobDuration() {
        return this.cronJobDuration == null ? Output.empty() : this.cronJobDuration;
    }

    /**
     * The cron definition of the scheduled event. See https://en.wikipedia.org/wiki/Cron. Cron spec specifies the local time as defined by the realm.
     * 
     */
    @Import(name="cronSpec")
      private final @Nullable Output<String> cronSpec;

    public Output<String> getCronSpec() {
        return this.cronSpec == null ? Output.empty() : this.cronSpec;
    }

    /**
     * The end time of the event.
     * 
     */
    @Import(name="endTime")
      private final @Nullable Output<String> endTime;

    public Output<String> getEndTime() {
        return this.endTime == null ? Output.empty() : this.endTime;
    }

    /**
     * The start time of the event.
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime == null ? Output.empty() : this.startTime;
    }

    public ScheduleArgs(
        @Nullable Output<String> cronJobDuration,
        @Nullable Output<String> cronSpec,
        @Nullable Output<String> endTime,
        @Nullable Output<String> startTime) {
        this.cronJobDuration = cronJobDuration;
        this.cronSpec = cronSpec;
        this.endTime = endTime;
        this.startTime = startTime;
    }

    private ScheduleArgs() {
        this.cronJobDuration = Output.empty();
        this.cronSpec = Output.empty();
        this.endTime = Output.empty();
        this.startTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cronJobDuration;
        private @Nullable Output<String> cronSpec;
        private @Nullable Output<String> endTime;
        private @Nullable Output<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cronJobDuration = defaults.cronJobDuration;
    	      this.cronSpec = defaults.cronSpec;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder cronJobDuration(@Nullable Output<String> cronJobDuration) {
            this.cronJobDuration = cronJobDuration;
            return this;
        }
        public Builder cronJobDuration(@Nullable String cronJobDuration) {
            this.cronJobDuration = Output.ofNullable(cronJobDuration);
            return this;
        }
        public Builder cronSpec(@Nullable Output<String> cronSpec) {
            this.cronSpec = cronSpec;
            return this;
        }
        public Builder cronSpec(@Nullable String cronSpec) {
            this.cronSpec = Output.ofNullable(cronSpec);
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
        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = Output.ofNullable(startTime);
            return this;
        }        public ScheduleArgs build() {
            return new ScheduleArgs(cronJobDuration, cronSpec, endTime, startTime);
        }
    }
}
