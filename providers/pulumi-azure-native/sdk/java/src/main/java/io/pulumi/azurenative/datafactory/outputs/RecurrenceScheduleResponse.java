// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.RecurrenceScheduleOccurrenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class RecurrenceScheduleResponse {
    /**
     * The hours.
     * 
     */
    private final @Nullable List<Integer> hours;
    /**
     * The minutes.
     * 
     */
    private final @Nullable List<Integer> minutes;
    /**
     * The month days.
     * 
     */
    private final @Nullable List<Integer> monthDays;
    /**
     * The monthly occurrences.
     * 
     */
    private final @Nullable List<RecurrenceScheduleOccurrenceResponse> monthlyOccurrences;
    /**
     * The days of the week.
     * 
     */
    private final @Nullable List<String> weekDays;

    @OutputCustomType.Constructor({"hours","minutes","monthDays","monthlyOccurrences","weekDays"})
    private RecurrenceScheduleResponse(
        @Nullable List<Integer> hours,
        @Nullable List<Integer> minutes,
        @Nullable List<Integer> monthDays,
        @Nullable List<RecurrenceScheduleOccurrenceResponse> monthlyOccurrences,
        @Nullable List<String> weekDays) {
        this.hours = hours;
        this.minutes = minutes;
        this.monthDays = monthDays;
        this.monthlyOccurrences = monthlyOccurrences;
        this.weekDays = weekDays;
    }

    /**
     * The hours.
     * 
    */
    public List<Integer> getHours() {
        return this.hours == null ? List.of() : this.hours;
    }
    /**
     * The minutes.
     * 
    */
    public List<Integer> getMinutes() {
        return this.minutes == null ? List.of() : this.minutes;
    }
    /**
     * The month days.
     * 
    */
    public List<Integer> getMonthDays() {
        return this.monthDays == null ? List.of() : this.monthDays;
    }
    /**
     * The monthly occurrences.
     * 
    */
    public List<RecurrenceScheduleOccurrenceResponse> getMonthlyOccurrences() {
        return this.monthlyOccurrences == null ? List.of() : this.monthlyOccurrences;
    }
    /**
     * The days of the week.
     * 
    */
    public List<String> getWeekDays() {
        return this.weekDays == null ? List.of() : this.weekDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecurrenceScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Integer> hours;
        private @Nullable List<Integer> minutes;
        private @Nullable List<Integer> monthDays;
        private @Nullable List<RecurrenceScheduleOccurrenceResponse> monthlyOccurrences;
        private @Nullable List<String> weekDays;

        public Builder() {
    	      // Empty
        }

        public Builder(RecurrenceScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
    	      this.monthDays = defaults.monthDays;
    	      this.monthlyOccurrences = defaults.monthlyOccurrences;
    	      this.weekDays = defaults.weekDays;
        }

        public Builder setHours(@Nullable List<Integer> hours) {
            this.hours = hours;
            return this;
        }

        public Builder setMinutes(@Nullable List<Integer> minutes) {
            this.minutes = minutes;
            return this;
        }

        public Builder setMonthDays(@Nullable List<Integer> monthDays) {
            this.monthDays = monthDays;
            return this;
        }

        public Builder setMonthlyOccurrences(@Nullable List<RecurrenceScheduleOccurrenceResponse> monthlyOccurrences) {
            this.monthlyOccurrences = monthlyOccurrences;
            return this;
        }

        public Builder setWeekDays(@Nullable List<String> weekDays) {
            this.weekDays = weekDays;
            return this;
        }
        public RecurrenceScheduleResponse build() {
            return new RecurrenceScheduleResponse(hours, minutes, monthDays, monthlyOccurrences, weekDays);
        }
    }
}