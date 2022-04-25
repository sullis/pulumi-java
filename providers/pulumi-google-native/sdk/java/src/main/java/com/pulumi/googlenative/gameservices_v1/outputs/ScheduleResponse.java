// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ScheduleResponse {
    /**
     * @return The duration for the cron job event. The duration of the event is effective after the cron job&#39;s start time.
     * 
     */
    private final String cronJobDuration;
    /**
     * @return The cron definition of the scheduled event. See https://en.wikipedia.org/wiki/Cron. Cron spec specifies the local time as defined by the realm.
     * 
     */
    private final String cronSpec;
    /**
     * @return The end time of the event.
     * 
     */
    private final String endTime;
    /**
     * @return The start time of the event.
     * 
     */
    private final String startTime;

    @CustomType.Constructor
    private ScheduleResponse(
        @CustomType.Parameter("cronJobDuration") String cronJobDuration,
        @CustomType.Parameter("cronSpec") String cronSpec,
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("startTime") String startTime) {
        this.cronJobDuration = cronJobDuration;
        this.cronSpec = cronSpec;
        this.endTime = endTime;
        this.startTime = startTime;
    }

    /**
     * @return The duration for the cron job event. The duration of the event is effective after the cron job&#39;s start time.
     * 
     */
    public String cronJobDuration() {
        return this.cronJobDuration;
    }
    /**
     * @return The cron definition of the scheduled event. See https://en.wikipedia.org/wiki/Cron. Cron spec specifies the local time as defined by the realm.
     * 
     */
    public String cronSpec() {
        return this.cronSpec;
    }
    /**
     * @return The end time of the event.
     * 
     */
    public String endTime() {
        return this.endTime;
    }
    /**
     * @return The start time of the event.
     * 
     */
    public String startTime() {
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

        public Builder cronJobDuration(String cronJobDuration) {
            this.cronJobDuration = Objects.requireNonNull(cronJobDuration);
            return this;
        }
        public Builder cronSpec(String cronSpec) {
            this.cronSpec = Objects.requireNonNull(cronSpec);
            return this;
        }
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }        public ScheduleResponse build() {
            return new ScheduleResponse(cronJobDuration, cronSpec, endTime, startTime);
        }
    }
}
