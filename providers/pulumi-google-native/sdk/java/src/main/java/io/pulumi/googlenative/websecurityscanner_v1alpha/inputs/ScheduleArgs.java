// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Scan schedule configuration.
 * 
 */
public final class ScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduleArgs Empty = new ScheduleArgs();

    /**
     * The duration of time between executions in days.
     * 
     */
    @InputImport(name="intervalDurationDays", required=true)
      private final Input<Integer> intervalDurationDays;

    public Input<Integer> getIntervalDurationDays() {
        return this.intervalDurationDays;
    }

    /**
     * A timestamp indicates when the next run will be scheduled. The value is refreshed by the server after each run. If unspecified, it will default to current server time, which means the scan will be scheduled to start immediately.
     * 
     */
    @InputImport(name="scheduleTime")
      private final @Nullable Input<String> scheduleTime;

    public Input<String> getScheduleTime() {
        return this.scheduleTime == null ? Input.empty() : this.scheduleTime;
    }

    public ScheduleArgs(
        Input<Integer> intervalDurationDays,
        @Nullable Input<String> scheduleTime) {
        this.intervalDurationDays = Objects.requireNonNull(intervalDurationDays, "expected parameter 'intervalDurationDays' to be non-null");
        this.scheduleTime = scheduleTime;
    }

    private ScheduleArgs() {
        this.intervalDurationDays = Input.empty();
        this.scheduleTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> intervalDurationDays;
        private @Nullable Input<String> scheduleTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intervalDurationDays = defaults.intervalDurationDays;
    	      this.scheduleTime = defaults.scheduleTime;
        }

        public Builder setIntervalDurationDays(Input<Integer> intervalDurationDays) {
            this.intervalDurationDays = Objects.requireNonNull(intervalDurationDays);
            return this;
        }

        public Builder setIntervalDurationDays(Integer intervalDurationDays) {
            this.intervalDurationDays = Input.of(Objects.requireNonNull(intervalDurationDays));
            return this;
        }

        public Builder setScheduleTime(@Nullable Input<String> scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }

        public Builder setScheduleTime(@Nullable String scheduleTime) {
            this.scheduleTime = Input.ofNullable(scheduleTime);
            return this;
        }
        public ScheduleArgs build() {
            return new ScheduleArgs(intervalDurationDays, scheduleTime);
        }
    }
}