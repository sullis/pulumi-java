// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;


/**
 * A confidence interval is a range of possible values for the experiment objective you are trying to measure.
 * 
 */
public final class GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalResponse Empty = new GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalResponse();

    /**
     * The confidence level used to construct the interval, i.e. there is X% chance that the true value is within this interval.
     * 
     */
    @InputImport(name="confidenceLevel", required=true)
      private final Double confidenceLevel;

    public Double getConfidenceLevel() {
        return this.confidenceLevel;
    }

    /**
     * Lower bound of the interval.
     * 
     */
    @InputImport(name="lowerBound", required=true)
      private final Double lowerBound;

    public Double getLowerBound() {
        return this.lowerBound;
    }

    /**
     * The percent change between an experiment metric's value and the value for its control.
     * 
     */
    @InputImport(name="ratio", required=true)
      private final Double ratio;

    public Double getRatio() {
        return this.ratio;
    }

    /**
     * Upper bound of the interval.
     * 
     */
    @InputImport(name="upperBound", required=true)
      private final Double upperBound;

    public Double getUpperBound() {
        return this.upperBound;
    }

    public GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalResponse(
        Double confidenceLevel,
        Double lowerBound,
        Double ratio,
        Double upperBound) {
        this.confidenceLevel = Objects.requireNonNull(confidenceLevel, "expected parameter 'confidenceLevel' to be non-null");
        this.lowerBound = Objects.requireNonNull(lowerBound, "expected parameter 'lowerBound' to be non-null");
        this.ratio = Objects.requireNonNull(ratio, "expected parameter 'ratio' to be non-null");
        this.upperBound = Objects.requireNonNull(upperBound, "expected parameter 'upperBound' to be non-null");
    }

    private GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalResponse() {
        this.confidenceLevel = null;
        this.lowerBound = null;
        this.ratio = null;
        this.upperBound = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double confidenceLevel;
        private Double lowerBound;
        private Double ratio;
        private Double upperBound;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confidenceLevel = defaults.confidenceLevel;
    	      this.lowerBound = defaults.lowerBound;
    	      this.ratio = defaults.ratio;
    	      this.upperBound = defaults.upperBound;
        }

        public Builder setConfidenceLevel(Double confidenceLevel) {
            this.confidenceLevel = Objects.requireNonNull(confidenceLevel);
            return this;
        }

        public Builder setLowerBound(Double lowerBound) {
            this.lowerBound = Objects.requireNonNull(lowerBound);
            return this;
        }

        public Builder setRatio(Double ratio) {
            this.ratio = Objects.requireNonNull(ratio);
            return this;
        }

        public Builder setUpperBound(Double upperBound) {
            this.upperBound = Objects.requireNonNull(upperBound);
            return this;
        }
        public GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalResponse build() {
            return new GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalResponse(confidenceLevel, lowerBound, ratio, upperBound);
        }
    }
}