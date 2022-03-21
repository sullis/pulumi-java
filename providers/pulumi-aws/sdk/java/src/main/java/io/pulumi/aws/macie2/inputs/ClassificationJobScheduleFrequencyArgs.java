// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClassificationJobScheduleFrequencyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClassificationJobScheduleFrequencyArgs Empty = new ClassificationJobScheduleFrequencyArgs();

    /**
     * Specifies a daily recurrence pattern for running the job.
     * 
     */
    @Import(name="dailySchedule")
      private final @Nullable Output<Boolean> dailySchedule;

    public Output<Boolean> getDailySchedule() {
        return this.dailySchedule == null ? Output.empty() : this.dailySchedule;
    }

    /**
     * Specifies a monthly recurrence pattern for running the job.
     * 
     */
    @Import(name="monthlySchedule")
      private final @Nullable Output<Integer> monthlySchedule;

    public Output<Integer> getMonthlySchedule() {
        return this.monthlySchedule == null ? Output.empty() : this.monthlySchedule;
    }

    /**
     * Specifies a weekly recurrence pattern for running the job.
     * 
     */
    @Import(name="weeklySchedule")
      private final @Nullable Output<String> weeklySchedule;

    public Output<String> getWeeklySchedule() {
        return this.weeklySchedule == null ? Output.empty() : this.weeklySchedule;
    }

    public ClassificationJobScheduleFrequencyArgs(
        @Nullable Output<Boolean> dailySchedule,
        @Nullable Output<Integer> monthlySchedule,
        @Nullable Output<String> weeklySchedule) {
        this.dailySchedule = dailySchedule;
        this.monthlySchedule = monthlySchedule;
        this.weeklySchedule = weeklySchedule;
    }

    private ClassificationJobScheduleFrequencyArgs() {
        this.dailySchedule = Output.empty();
        this.monthlySchedule = Output.empty();
        this.weeklySchedule = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobScheduleFrequencyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> dailySchedule;
        private @Nullable Output<Integer> monthlySchedule;
        private @Nullable Output<String> weeklySchedule;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobScheduleFrequencyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailySchedule = defaults.dailySchedule;
    	      this.monthlySchedule = defaults.monthlySchedule;
    	      this.weeklySchedule = defaults.weeklySchedule;
        }

        public Builder dailySchedule(@Nullable Output<Boolean> dailySchedule) {
            this.dailySchedule = dailySchedule;
            return this;
        }
        public Builder dailySchedule(@Nullable Boolean dailySchedule) {
            this.dailySchedule = Output.ofNullable(dailySchedule);
            return this;
        }
        public Builder monthlySchedule(@Nullable Output<Integer> monthlySchedule) {
            this.monthlySchedule = monthlySchedule;
            return this;
        }
        public Builder monthlySchedule(@Nullable Integer monthlySchedule) {
            this.monthlySchedule = Output.ofNullable(monthlySchedule);
            return this;
        }
        public Builder weeklySchedule(@Nullable Output<String> weeklySchedule) {
            this.weeklySchedule = weeklySchedule;
            return this;
        }
        public Builder weeklySchedule(@Nullable String weeklySchedule) {
            this.weeklySchedule = Output.ofNullable(weeklySchedule);
            return this;
        }        public ClassificationJobScheduleFrequencyArgs build() {
            return new ClassificationJobScheduleFrequencyArgs(dailySchedule, monthlySchedule, weeklySchedule);
        }
    }
}
