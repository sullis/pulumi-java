// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.consumption.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ForecastSpendResponse {
    /**
     * The forecasted cost for the total time period which is being tracked by the budget. This value is only provided if the budget contains a forecast alert type.
     * 
     */
    private final Double amount;
    /**
     * The unit of measure for the budget amount.
     * 
     */
    private final String unit;

    @OutputCustomType.Constructor({"amount","unit"})
    private ForecastSpendResponse(
        Double amount,
        String unit) {
        this.amount = Objects.requireNonNull(amount);
        this.unit = Objects.requireNonNull(unit);
    }

    /**
     * The forecasted cost for the total time period which is being tracked by the budget. This value is only provided if the budget contains a forecast alert type.
     * 
     */
    public Double getAmount() {
        return this.amount;
    }
    /**
     * The unit of measure for the budget amount.
     * 
     */
    public String getUnit() {
        return this.unit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ForecastSpendResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double amount;
        private String unit;

        public Builder() {
    	      // Empty
        }

        public Builder(ForecastSpendResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amount = defaults.amount;
    	      this.unit = defaults.unit;
        }

        public Builder setAmount(Double amount) {
            this.amount = Objects.requireNonNull(amount);
            return this;
        }

        public Builder setUnit(String unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }

        public ForecastSpendResponse build() {
            return new ForecastSpendResponse(amount, unit);
        }
    }
}
