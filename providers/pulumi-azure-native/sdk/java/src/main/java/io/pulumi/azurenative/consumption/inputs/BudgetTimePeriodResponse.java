// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.consumption.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The start and end date for a budget.
 * 
 */
public final class BudgetTimePeriodResponse extends io.pulumi.resources.InvokeArgs {

    public static final BudgetTimePeriodResponse Empty = new BudgetTimePeriodResponse();

    /**
     * The end date for the budget. If not provided, we default this to 10 years from the start date.
     * 
     */
    @InputImport(name="endDate")
      private final @Nullable String endDate;

    public Optional<String> getEndDate() {
        return this.endDate == null ? Optional.empty() : Optional.ofNullable(this.endDate);
    }

    /**
     * The start date for the budget.
     * 
     */
    @InputImport(name="startDate", required=true)
      private final String startDate;

    public String getStartDate() {
        return this.startDate;
    }

    public BudgetTimePeriodResponse(
        @Nullable String endDate,
        String startDate) {
        this.endDate = endDate;
        this.startDate = Objects.requireNonNull(startDate, "expected parameter 'startDate' to be non-null");
    }

    private BudgetTimePeriodResponse() {
        this.endDate = null;
        this.startDate = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetTimePeriodResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endDate;
        private String startDate;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetTimePeriodResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endDate = defaults.endDate;
    	      this.startDate = defaults.startDate;
        }

        public Builder setEndDate(@Nullable String endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder setStartDate(String startDate) {
            this.startDate = Objects.requireNonNull(startDate);
            return this;
        }
        public BudgetTimePeriodResponse build() {
            return new BudgetTimePeriodResponse(endDate, startDate);
        }
    }
}