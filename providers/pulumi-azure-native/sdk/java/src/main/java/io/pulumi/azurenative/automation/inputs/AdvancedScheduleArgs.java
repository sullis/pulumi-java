// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.azurenative.automation.inputs.AdvancedScheduleMonthlyOccurrenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties of the create Advanced Schedule.
 * 
 */
public final class AdvancedScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AdvancedScheduleArgs Empty = new AdvancedScheduleArgs();

    /**
     * Days of the month that the job should execute on. Must be between 1 and 31.
     * 
     */
    @InputImport(name="monthDays")
    private final @Nullable Input<List<Integer>> monthDays;

    public Input<List<Integer>> getMonthDays() {
        return this.monthDays == null ? Input.empty() : this.monthDays;
    }

    /**
     * Occurrences of days within a month.
     * 
     */
    @InputImport(name="monthlyOccurrences")
    private final @Nullable Input<List<AdvancedScheduleMonthlyOccurrenceArgs>> monthlyOccurrences;

    public Input<List<AdvancedScheduleMonthlyOccurrenceArgs>> getMonthlyOccurrences() {
        return this.monthlyOccurrences == null ? Input.empty() : this.monthlyOccurrences;
    }

    /**
     * Days of the week that the job should execute on.
     * 
     */
    @InputImport(name="weekDays")
    private final @Nullable Input<List<String>> weekDays;

    public Input<List<String>> getWeekDays() {
        return this.weekDays == null ? Input.empty() : this.weekDays;
    }

    public AdvancedScheduleArgs(
        @Nullable Input<List<Integer>> monthDays,
        @Nullable Input<List<AdvancedScheduleMonthlyOccurrenceArgs>> monthlyOccurrences,
        @Nullable Input<List<String>> weekDays) {
        this.monthDays = monthDays;
        this.monthlyOccurrences = monthlyOccurrences;
        this.weekDays = weekDays;
    }

    private AdvancedScheduleArgs() {
        this.monthDays = Input.empty();
        this.monthlyOccurrences = Input.empty();
        this.weekDays = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdvancedScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Integer>> monthDays;
        private @Nullable Input<List<AdvancedScheduleMonthlyOccurrenceArgs>> monthlyOccurrences;
        private @Nullable Input<List<String>> weekDays;

        public Builder() {
    	      // Empty
        }

        public Builder(AdvancedScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monthDays = defaults.monthDays;
    	      this.monthlyOccurrences = defaults.monthlyOccurrences;
    	      this.weekDays = defaults.weekDays;
        }

        public Builder setMonthDays(@Nullable Input<List<Integer>> monthDays) {
            this.monthDays = monthDays;
            return this;
        }

        public Builder setMonthDays(@Nullable List<Integer> monthDays) {
            this.monthDays = Input.ofNullable(monthDays);
            return this;
        }

        public Builder setMonthlyOccurrences(@Nullable Input<List<AdvancedScheduleMonthlyOccurrenceArgs>> monthlyOccurrences) {
            this.monthlyOccurrences = monthlyOccurrences;
            return this;
        }

        public Builder setMonthlyOccurrences(@Nullable List<AdvancedScheduleMonthlyOccurrenceArgs> monthlyOccurrences) {
            this.monthlyOccurrences = Input.ofNullable(monthlyOccurrences);
            return this;
        }

        public Builder setWeekDays(@Nullable Input<List<String>> weekDays) {
            this.weekDays = weekDays;
            return this;
        }

        public Builder setWeekDays(@Nullable List<String> weekDays) {
            this.weekDays = Input.ofNullable(weekDays);
            return this;
        }

        public AdvancedScheduleArgs build() {
            return new AdvancedScheduleArgs(monthDays, monthlyOccurrences, weekDays);
        }
    }
}
