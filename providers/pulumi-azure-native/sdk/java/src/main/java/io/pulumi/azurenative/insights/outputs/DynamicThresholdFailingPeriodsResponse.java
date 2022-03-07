// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;

@OutputCustomType
public final class DynamicThresholdFailingPeriodsResponse {
    /**
     * The number of violations to trigger an alert. Should be smaller or equal to numberOfEvaluationPeriods.
     * 
     */
    private final Double minFailingPeriodsToAlert;
    /**
     * The number of aggregated lookback points. The lookback time window is calculated based on the aggregation granularity (windowSize) and the selected number of aggregated points.
     * 
     */
    private final Double numberOfEvaluationPeriods;

    @OutputCustomType.Constructor({"minFailingPeriodsToAlert","numberOfEvaluationPeriods"})
    private DynamicThresholdFailingPeriodsResponse(
        Double minFailingPeriodsToAlert,
        Double numberOfEvaluationPeriods) {
        this.minFailingPeriodsToAlert = Objects.requireNonNull(minFailingPeriodsToAlert);
        this.numberOfEvaluationPeriods = Objects.requireNonNull(numberOfEvaluationPeriods);
    }

    /**
     * The number of violations to trigger an alert. Should be smaller or equal to numberOfEvaluationPeriods.
     * 
    */
    public Double getMinFailingPeriodsToAlert() {
        return this.minFailingPeriodsToAlert;
    }
    /**
     * The number of aggregated lookback points. The lookback time window is calculated based on the aggregation granularity (windowSize) and the selected number of aggregated points.
     * 
    */
    public Double getNumberOfEvaluationPeriods() {
        return this.numberOfEvaluationPeriods;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DynamicThresholdFailingPeriodsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double minFailingPeriodsToAlert;
        private Double numberOfEvaluationPeriods;

        public Builder() {
    	      // Empty
        }

        public Builder(DynamicThresholdFailingPeriodsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minFailingPeriodsToAlert = defaults.minFailingPeriodsToAlert;
    	      this.numberOfEvaluationPeriods = defaults.numberOfEvaluationPeriods;
        }

        public Builder setMinFailingPeriodsToAlert(Double minFailingPeriodsToAlert) {
            this.minFailingPeriodsToAlert = Objects.requireNonNull(minFailingPeriodsToAlert);
            return this;
        }

        public Builder setNumberOfEvaluationPeriods(Double numberOfEvaluationPeriods) {
            this.numberOfEvaluationPeriods = Objects.requireNonNull(numberOfEvaluationPeriods);
            return this;
        }
        public DynamicThresholdFailingPeriodsResponse build() {
            return new DynamicThresholdFailingPeriodsResponse(minFailingPeriodsToAlert, numberOfEvaluationPeriods);
        }
    }
}