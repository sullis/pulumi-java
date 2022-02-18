// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.redis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs Empty = new InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs();

    /**
     * Hours of day in 24 hour format. Should be from 0 to 23.
     * An API may choose to allow the value "24:00:00" for scenarios like business closing time.
     * 
     */
    @InputImport(name="hours")
    private final @Nullable Input<Integer> hours;

    public Input<Integer> getHours() {
        return this.hours == null ? Input.empty() : this.hours;
    }

    /**
     * Minutes of hour of day. Must be from 0 to 59.
     * 
     */
    @InputImport(name="minutes")
    private final @Nullable Input<Integer> minutes;

    public Input<Integer> getMinutes() {
        return this.minutes == null ? Input.empty() : this.minutes;
    }

    /**
     * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
     * 
     */
    @InputImport(name="nanos")
    private final @Nullable Input<Integer> nanos;

    public Input<Integer> getNanos() {
        return this.nanos == null ? Input.empty() : this.nanos;
    }

    /**
     * Seconds of minutes of the time. Must normally be from 0 to 59.
     * An API may allow the value 60 if it allows leap-seconds.
     * 
     */
    @InputImport(name="seconds")
    private final @Nullable Input<Integer> seconds;

    public Input<Integer> getSeconds() {
        return this.seconds == null ? Input.empty() : this.seconds;
    }

    public InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs(
        @Nullable Input<Integer> hours,
        @Nullable Input<Integer> minutes,
        @Nullable Input<Integer> nanos,
        @Nullable Input<Integer> seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.nanos = nanos;
        this.seconds = seconds;
    }

    private InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs() {
        this.hours = Input.empty();
        this.minutes = Input.empty();
        this.nanos = Input.empty();
        this.seconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> hours;
        private @Nullable Input<Integer> minutes;
        private @Nullable Input<Integer> nanos;
        private @Nullable Input<Integer> seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        public Builder setHours(@Nullable Input<Integer> hours) {
            this.hours = hours;
            return this;
        }

        public Builder setHours(@Nullable Integer hours) {
            this.hours = Input.ofNullable(hours);
            return this;
        }

        public Builder setMinutes(@Nullable Input<Integer> minutes) {
            this.minutes = minutes;
            return this;
        }

        public Builder setMinutes(@Nullable Integer minutes) {
            this.minutes = Input.ofNullable(minutes);
            return this;
        }

        public Builder setNanos(@Nullable Input<Integer> nanos) {
            this.nanos = nanos;
            return this;
        }

        public Builder setNanos(@Nullable Integer nanos) {
            this.nanos = Input.ofNullable(nanos);
            return this;
        }

        public Builder setSeconds(@Nullable Input<Integer> seconds) {
            this.seconds = seconds;
            return this;
        }

        public Builder setSeconds(@Nullable Integer seconds) {
            this.seconds = Input.ofNullable(seconds);
            return this;
        }

        public InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs build() {
            return new InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs(hours, minutes, nanos, seconds);
        }
    }
}
