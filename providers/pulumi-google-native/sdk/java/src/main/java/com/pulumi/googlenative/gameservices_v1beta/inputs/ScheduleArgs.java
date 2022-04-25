// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The schedule of a recurring or one time event. The event&#39;s time span is specified by start_time and end_time. If the scheduled event&#39;s timespan is larger than the cron_spec + cron_job_duration, the event will be recurring. If only cron_spec + cron_job_duration are specified, the event is effective starting at the local time specified by cron_spec, and is recurring. ```start_time|-------[cron job]-------[cron job]-------[cron job]---|end_time cron job: cron spec start time + duration```
 * 
 */
public final class ScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduleArgs Empty = new ScheduleArgs();

    /**
     * The duration for the cron job event. The duration of the event is effective after the cron job&#39;s start time.
     * 
     */
    @Import(name="cronJobDuration")
    private @Nullable Output<String> cronJobDuration;

    /**
     * @return The duration for the cron job event. The duration of the event is effective after the cron job&#39;s start time.
     * 
     */
    public Optional<Output<String>> cronJobDuration() {
        return Optional.ofNullable(this.cronJobDuration);
    }

    /**
     * The cron definition of the scheduled event. See https://en.wikipedia.org/wiki/Cron. Cron spec specifies the local time as defined by the realm.
     * 
     */
    @Import(name="cronSpec")
    private @Nullable Output<String> cronSpec;

    /**
     * @return The cron definition of the scheduled event. See https://en.wikipedia.org/wiki/Cron. Cron spec specifies the local time as defined by the realm.
     * 
     */
    public Optional<Output<String>> cronSpec() {
        return Optional.ofNullable(this.cronSpec);
    }

    /**
     * The end time of the event.
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    /**
     * @return The end time of the event.
     * 
     */
    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * The start time of the event.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return The start time of the event.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    private ScheduleArgs() {}

    private ScheduleArgs(ScheduleArgs $) {
        this.cronJobDuration = $.cronJobDuration;
        this.cronSpec = $.cronSpec;
        this.endTime = $.endTime;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduleArgs $;

        public Builder() {
            $ = new ScheduleArgs();
        }

        public Builder(ScheduleArgs defaults) {
            $ = new ScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cronJobDuration The duration for the cron job event. The duration of the event is effective after the cron job&#39;s start time.
         * 
         * @return builder
         * 
         */
        public Builder cronJobDuration(@Nullable Output<String> cronJobDuration) {
            $.cronJobDuration = cronJobDuration;
            return this;
        }

        /**
         * @param cronJobDuration The duration for the cron job event. The duration of the event is effective after the cron job&#39;s start time.
         * 
         * @return builder
         * 
         */
        public Builder cronJobDuration(String cronJobDuration) {
            return cronJobDuration(Output.of(cronJobDuration));
        }

        /**
         * @param cronSpec The cron definition of the scheduled event. See https://en.wikipedia.org/wiki/Cron. Cron spec specifies the local time as defined by the realm.
         * 
         * @return builder
         * 
         */
        public Builder cronSpec(@Nullable Output<String> cronSpec) {
            $.cronSpec = cronSpec;
            return this;
        }

        /**
         * @param cronSpec The cron definition of the scheduled event. See https://en.wikipedia.org/wiki/Cron. Cron spec specifies the local time as defined by the realm.
         * 
         * @return builder
         * 
         */
        public Builder cronSpec(String cronSpec) {
            return cronSpec(Output.of(cronSpec));
        }

        /**
         * @param endTime The end time of the event.
         * 
         * @return builder
         * 
         */
        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param endTime The end time of the event.
         * 
         * @return builder
         * 
         */
        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        /**
         * @param startTime The start time of the event.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime The start time of the event.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public ScheduleArgs build() {
            return $;
        }
    }

}
