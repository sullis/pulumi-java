// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PatchDeploymentRecurringScheduleTimeOfDay {
    /**
     * Hours of day in 24 hour format. Should be from 0 to 23.
     * An API may choose to allow the value "24:00:00" for scenarios like business closing time.
     * 
     */
    private final @Nullable Integer hours;
    /**
     * Minutes of hour of day. Must be from 0 to 59.
     * 
     */
    private final @Nullable Integer minutes;
    /**
     * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
     * 
     */
    private final @Nullable Integer nanos;
    /**
     * Seconds of minutes of the time. Must normally be from 0 to 59. An API may allow the value 60 if it allows leap-seconds.
     * 
     */
    private final @Nullable Integer seconds;

    @OutputCustomType.Constructor({"hours","minutes","nanos","seconds"})
    private PatchDeploymentRecurringScheduleTimeOfDay(
        @Nullable Integer hours,
        @Nullable Integer minutes,
        @Nullable Integer nanos,
        @Nullable Integer seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.nanos = nanos;
        this.seconds = seconds;
    }

    /**
     * Hours of day in 24 hour format. Should be from 0 to 23.
     * An API may choose to allow the value "24:00:00" for scenarios like business closing time.
     * 
    */
    public Optional<Integer> getHours() {
        return Optional.ofNullable(this.hours);
    }
    /**
     * Minutes of hour of day. Must be from 0 to 59.
     * 
    */
    public Optional<Integer> getMinutes() {
        return Optional.ofNullable(this.minutes);
    }
    /**
     * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
     * 
    */
    public Optional<Integer> getNanos() {
        return Optional.ofNullable(this.nanos);
    }
    /**
     * Seconds of minutes of the time. Must normally be from 0 to 59. An API may allow the value 60 if it allows leap-seconds.
     * 
    */
    public Optional<Integer> getSeconds() {
        return Optional.ofNullable(this.seconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentRecurringScheduleTimeOfDay defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer hours;
        private @Nullable Integer minutes;
        private @Nullable Integer nanos;
        private @Nullable Integer seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentRecurringScheduleTimeOfDay defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        public Builder setHours(@Nullable Integer hours) {
            this.hours = hours;
            return this;
        }

        public Builder setMinutes(@Nullable Integer minutes) {
            this.minutes = minutes;
            return this;
        }

        public Builder setNanos(@Nullable Integer nanos) {
            this.nanos = nanos;
            return this;
        }

        public Builder setSeconds(@Nullable Integer seconds) {
            this.seconds = seconds;
            return this;
        }
        public PatchDeploymentRecurringScheduleTimeOfDay build() {
            return new PatchDeploymentRecurringScheduleTimeOfDay(hours, minutes, nanos, seconds);
        }
    }
}