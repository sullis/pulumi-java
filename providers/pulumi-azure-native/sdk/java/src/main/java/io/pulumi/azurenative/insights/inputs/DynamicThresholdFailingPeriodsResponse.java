// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;


/**
 * The minimum number of violations required within the selected lookback time window required to raise an alert.
 * 
 */
public final class DynamicThresholdFailingPeriodsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DynamicThresholdFailingPeriodsResponse Empty = new DynamicThresholdFailingPeriodsResponse();

    /**
     * The number of violations to trigger an alert. Should be smaller or equal to numberOfEvaluationPeriods.
     * 
     */
    @InputImport(name="minFailingPeriodsToAlert", required=true)
    private final Double minFailingPeriodsToAlert;

    public Double getMinFailingPeriodsToAlert() {
        return this.minFailingPeriodsToAlert;
    }

    /**
     * The number of aggregated lookback points. The lookback time window is calculated based on the aggregation granularity (windowSize) and the selected number of aggregated points.
     * 
     */
    @InputImport(name="numberOfEvaluationPeriods", required=true)
    private final Double numberOfEvaluationPeriods;

    public Double getNumberOfEvaluationPeriods() {
        return this.numberOfEvaluationPeriods;
    }

    public DynamicThresholdFailingPeriodsResponse(
        Double minFailingPeriodsToAlert,
        Double numberOfEvaluationPeriods) {
        this.minFailingPeriodsToAlert = Objects.requireNonNull(minFailingPeriodsToAlert, "expected parameter 'minFailingPeriodsToAlert' to be non-null");
        this.numberOfEvaluationPeriods = Objects.requireNonNull(numberOfEvaluationPeriods, "expected parameter 'numberOfEvaluationPeriods' to be non-null");
    }

    private DynamicThresholdFailingPeriodsResponse() {
        this.minFailingPeriodsToAlert = null;
        this.numberOfEvaluationPeriods = null;
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
