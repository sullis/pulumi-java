// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.enums.RecurrenceType;
import io.pulumi.azurenative.costmanagement.enums.StatusType;
import io.pulumi.azurenative.costmanagement.inputs.ReportRecurrencePeriodArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The schedule associated with a report.
 * 
 */
public final class ReportScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReportScheduleArgs Empty = new ReportScheduleArgs();

    /**
     * The schedule recurrence.
     * 
     */
    @InputImport(name="recurrence", required=true)
    private final Input<Either<String,RecurrenceType>> recurrence;

    public Input<Either<String,RecurrenceType>> getRecurrence() {
        return this.recurrence;
    }

    /**
     * Has start and end date of the recurrence. The start date must be in future. If present, the end date must be greater than start date.
     * 
     */
    @InputImport(name="recurrencePeriod")
    private final @Nullable Input<ReportRecurrencePeriodArgs> recurrencePeriod;

    public Input<ReportRecurrencePeriodArgs> getRecurrencePeriod() {
        return this.recurrencePeriod == null ? Input.empty() : this.recurrencePeriod;
    }

    /**
     * The status of the schedule. Whether active or not. If inactive, the report's scheduled execution is paused.
     * 
     */
    @InputImport(name="status")
    private final @Nullable Input<Either<String,StatusType>> status;

    public Input<Either<String,StatusType>> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public ReportScheduleArgs(
        Input<Either<String,RecurrenceType>> recurrence,
        @Nullable Input<ReportRecurrencePeriodArgs> recurrencePeriod,
        @Nullable Input<Either<String,StatusType>> status) {
        this.recurrence = Objects.requireNonNull(recurrence, "expected parameter 'recurrence' to be non-null");
        this.recurrencePeriod = recurrencePeriod;
        this.status = status;
    }

    private ReportScheduleArgs() {
        this.recurrence = Input.empty();
        this.recurrencePeriod = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,RecurrenceType>> recurrence;
        private @Nullable Input<ReportRecurrencePeriodArgs> recurrencePeriod;
        private @Nullable Input<Either<String,StatusType>> status;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recurrence = defaults.recurrence;
    	      this.recurrencePeriod = defaults.recurrencePeriod;
    	      this.status = defaults.status;
        }

        public Builder setRecurrence(Input<Either<String,RecurrenceType>> recurrence) {
            this.recurrence = Objects.requireNonNull(recurrence);
            return this;
        }

        public Builder setRecurrence(Either<String,RecurrenceType> recurrence) {
            this.recurrence = Input.of(Objects.requireNonNull(recurrence));
            return this;
        }

        public Builder setRecurrencePeriod(@Nullable Input<ReportRecurrencePeriodArgs> recurrencePeriod) {
            this.recurrencePeriod = recurrencePeriod;
            return this;
        }

        public Builder setRecurrencePeriod(@Nullable ReportRecurrencePeriodArgs recurrencePeriod) {
            this.recurrencePeriod = Input.ofNullable(recurrencePeriod);
            return this;
        }

        public Builder setStatus(@Nullable Input<Either<String,StatusType>> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable Either<String,StatusType> status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public ReportScheduleArgs build() {
            return new ReportScheduleArgs(recurrence, recurrencePeriod, status);
        }
    }
}
