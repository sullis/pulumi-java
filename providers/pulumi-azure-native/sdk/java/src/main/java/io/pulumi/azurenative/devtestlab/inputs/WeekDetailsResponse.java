// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a weekly schedule.
 * 
 */
public final class WeekDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final WeekDetailsResponse Empty = new WeekDetailsResponse();

    /**
     * The time of the day the schedule will occur.
     * 
     */
    @InputImport(name="time")
      private final @Nullable String time;

    public Optional<String> getTime() {
        return this.time == null ? Optional.empty() : Optional.ofNullable(this.time);
    }

    /**
     * The days of the week for which the schedule is set (e.g. Sunday, Monday, Tuesday, etc.).
     * 
     */
    @InputImport(name="weekdays")
      private final @Nullable List<String> weekdays;

    public List<String> getWeekdays() {
        return this.weekdays == null ? List.of() : this.weekdays;
    }

    public WeekDetailsResponse(
        @Nullable String time,
        @Nullable List<String> weekdays) {
        this.time = time;
        this.weekdays = weekdays;
    }

    private WeekDetailsResponse() {
        this.time = null;
        this.weekdays = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WeekDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String time;
        private @Nullable List<String> weekdays;

        public Builder() {
    	      // Empty
        }

        public Builder(WeekDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.time = defaults.time;
    	      this.weekdays = defaults.weekdays;
        }

        public Builder setTime(@Nullable String time) {
            this.time = time;
            return this;
        }

        public Builder setWeekdays(@Nullable List<String> weekdays) {
            this.weekdays = weekdays;
            return this;
        }
        public WeekDetailsResponse build() {
            return new WeekDetailsResponse(time, weekdays);
        }
    }
}