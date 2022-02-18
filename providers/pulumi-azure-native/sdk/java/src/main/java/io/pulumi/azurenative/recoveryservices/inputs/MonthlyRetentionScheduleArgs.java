// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.RetentionScheduleFormat;
import io.pulumi.azurenative.recoveryservices.inputs.DailyRetentionFormatArgs;
import io.pulumi.azurenative.recoveryservices.inputs.RetentionDurationArgs;
import io.pulumi.azurenative.recoveryservices.inputs.WeeklyRetentionFormatArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Monthly retention schedule.
 * 
 */
public final class MonthlyRetentionScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonthlyRetentionScheduleArgs Empty = new MonthlyRetentionScheduleArgs();

    /**
     * Retention duration of retention Policy.
     * 
     */
    @InputImport(name="retentionDuration")
    private final @Nullable Input<RetentionDurationArgs> retentionDuration;

    public Input<RetentionDurationArgs> getRetentionDuration() {
        return this.retentionDuration == null ? Input.empty() : this.retentionDuration;
    }

    /**
     * Daily retention format for monthly retention policy.
     * 
     */
    @InputImport(name="retentionScheduleDaily")
    private final @Nullable Input<DailyRetentionFormatArgs> retentionScheduleDaily;

    public Input<DailyRetentionFormatArgs> getRetentionScheduleDaily() {
        return this.retentionScheduleDaily == null ? Input.empty() : this.retentionScheduleDaily;
    }

    /**
     * Retention schedule format type for monthly retention policy.
     * 
     */
    @InputImport(name="retentionScheduleFormatType")
    private final @Nullable Input<Either<String,RetentionScheduleFormat>> retentionScheduleFormatType;

    public Input<Either<String,RetentionScheduleFormat>> getRetentionScheduleFormatType() {
        return this.retentionScheduleFormatType == null ? Input.empty() : this.retentionScheduleFormatType;
    }

    /**
     * Weekly retention format for monthly retention policy.
     * 
     */
    @InputImport(name="retentionScheduleWeekly")
    private final @Nullable Input<WeeklyRetentionFormatArgs> retentionScheduleWeekly;

    public Input<WeeklyRetentionFormatArgs> getRetentionScheduleWeekly() {
        return this.retentionScheduleWeekly == null ? Input.empty() : this.retentionScheduleWeekly;
    }

    /**
     * Retention times of retention policy.
     * 
     */
    @InputImport(name="retentionTimes")
    private final @Nullable Input<List<String>> retentionTimes;

    public Input<List<String>> getRetentionTimes() {
        return this.retentionTimes == null ? Input.empty() : this.retentionTimes;
    }

    public MonthlyRetentionScheduleArgs(
        @Nullable Input<RetentionDurationArgs> retentionDuration,
        @Nullable Input<DailyRetentionFormatArgs> retentionScheduleDaily,
        @Nullable Input<Either<String,RetentionScheduleFormat>> retentionScheduleFormatType,
        @Nullable Input<WeeklyRetentionFormatArgs> retentionScheduleWeekly,
        @Nullable Input<List<String>> retentionTimes) {
        this.retentionDuration = retentionDuration;
        this.retentionScheduleDaily = retentionScheduleDaily;
        this.retentionScheduleFormatType = retentionScheduleFormatType;
        this.retentionScheduleWeekly = retentionScheduleWeekly;
        this.retentionTimes = retentionTimes;
    }

    private MonthlyRetentionScheduleArgs() {
        this.retentionDuration = Input.empty();
        this.retentionScheduleDaily = Input.empty();
        this.retentionScheduleFormatType = Input.empty();
        this.retentionScheduleWeekly = Input.empty();
        this.retentionTimes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonthlyRetentionScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RetentionDurationArgs> retentionDuration;
        private @Nullable Input<DailyRetentionFormatArgs> retentionScheduleDaily;
        private @Nullable Input<Either<String,RetentionScheduleFormat>> retentionScheduleFormatType;
        private @Nullable Input<WeeklyRetentionFormatArgs> retentionScheduleWeekly;
        private @Nullable Input<List<String>> retentionTimes;

        public Builder() {
    	      // Empty
        }

        public Builder(MonthlyRetentionScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retentionDuration = defaults.retentionDuration;
    	      this.retentionScheduleDaily = defaults.retentionScheduleDaily;
    	      this.retentionScheduleFormatType = defaults.retentionScheduleFormatType;
    	      this.retentionScheduleWeekly = defaults.retentionScheduleWeekly;
    	      this.retentionTimes = defaults.retentionTimes;
        }

        public Builder setRetentionDuration(@Nullable Input<RetentionDurationArgs> retentionDuration) {
            this.retentionDuration = retentionDuration;
            return this;
        }

        public Builder setRetentionDuration(@Nullable RetentionDurationArgs retentionDuration) {
            this.retentionDuration = Input.ofNullable(retentionDuration);
            return this;
        }

        public Builder setRetentionScheduleDaily(@Nullable Input<DailyRetentionFormatArgs> retentionScheduleDaily) {
            this.retentionScheduleDaily = retentionScheduleDaily;
            return this;
        }

        public Builder setRetentionScheduleDaily(@Nullable DailyRetentionFormatArgs retentionScheduleDaily) {
            this.retentionScheduleDaily = Input.ofNullable(retentionScheduleDaily);
            return this;
        }

        public Builder setRetentionScheduleFormatType(@Nullable Input<Either<String,RetentionScheduleFormat>> retentionScheduleFormatType) {
            this.retentionScheduleFormatType = retentionScheduleFormatType;
            return this;
        }

        public Builder setRetentionScheduleFormatType(@Nullable Either<String,RetentionScheduleFormat> retentionScheduleFormatType) {
            this.retentionScheduleFormatType = Input.ofNullable(retentionScheduleFormatType);
            return this;
        }

        public Builder setRetentionScheduleWeekly(@Nullable Input<WeeklyRetentionFormatArgs> retentionScheduleWeekly) {
            this.retentionScheduleWeekly = retentionScheduleWeekly;
            return this;
        }

        public Builder setRetentionScheduleWeekly(@Nullable WeeklyRetentionFormatArgs retentionScheduleWeekly) {
            this.retentionScheduleWeekly = Input.ofNullable(retentionScheduleWeekly);
            return this;
        }

        public Builder setRetentionTimes(@Nullable Input<List<String>> retentionTimes) {
            this.retentionTimes = retentionTimes;
            return this;
        }

        public Builder setRetentionTimes(@Nullable List<String> retentionTimes) {
            this.retentionTimes = Input.ofNullable(retentionTimes);
            return this;
        }

        public MonthlyRetentionScheduleArgs build() {
            return new MonthlyRetentionScheduleArgs(retentionDuration, retentionScheduleDaily, retentionScheduleFormatType, retentionScheduleWeekly, retentionTimes);
        }
    }
}
