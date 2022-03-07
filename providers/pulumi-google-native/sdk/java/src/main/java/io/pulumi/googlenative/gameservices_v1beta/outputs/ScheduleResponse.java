// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ScheduleResponse {
    /**
     * The duration for the cron job event. The duration of the event is effective after the cron job's start time.
     * 
     */
    private final String cronJobDuration;
    /**
     * The cron definition of the scheduled event. See https://en.wikipedia.org/wiki/Cron. Cron spec specifies the local time as defined by the realm.
     * 
     */
    private final String cronSpec;
    /**
     * The end time of the event.
     * 
     */
    private final String endTime;
    /**
     * The start time of the event.
     * 
     */
    private final String startTime;

    @OutputCustomType.Constructor({"cronJobDuration","cronSpec","endTime","startTime"})
    private ScheduleResponse(
        String cronJobDuration,
        String cronSpec,
        String endTime,
        String startTime) {
        this.cronJobDuration = Objects.requireNonNull(cronJobDuration);
        this.cronSpec = Objects.requireNonNull(cronSpec);
        this.endTime = Objects.requireNonNull(endTime);
        this.startTime = Objects.requireNonNull(startTime);
    }

    /**
     * The duration for the cron job event. The duration of the event is effective after the cron job's start time.
     * 
    */
    public String getCronJobDuration() {
        return this.cronJobDuration;
    }
    /**
     * The cron definition of the scheduled event. See https://en.wikipedia.org/wiki/Cron. Cron spec specifies the local time as defined by the realm.
     * 
    */
    public String getCronSpec() {
        return this.cronSpec;
    }
    /**
     * The end time of the event.
     * 
    */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * The start time of the event.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cronJobDuration;
        private String cronSpec;
        private String endTime;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cronJobDuration = defaults.cronJobDuration;
    	      this.cronSpec = defaults.cronSpec;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder setCronJobDuration(String cronJobDuration) {
            this.cronJobDuration = Objects.requireNonNull(cronJobDuration);
            return this;
        }

        public Builder setCronSpec(String cronSpec) {
            this.cronSpec = Objects.requireNonNull(cronSpec);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public ScheduleResponse build() {
            return new ScheduleResponse(cronJobDuration, cronSpec, endTime, startTime);
        }
    }
}