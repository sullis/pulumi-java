// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalResponse;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Metric and corresponding confidence intervals.
 * 
 */
public final class GoogleCloudDialogflowCxV3ExperimentResultMetricResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3ExperimentResultMetricResponse Empty = new GoogleCloudDialogflowCxV3ExperimentResultMetricResponse();

    /**
     * The probability that the treatment is better than all other treatments in the experiment
     * 
     */
    @InputImport(name="confidenceInterval", required=true)
      private final GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalResponse confidenceInterval;

    public GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalResponse getConfidenceInterval() {
        return this.confidenceInterval;
    }

    /**
     * Count value of a metric.
     * 
     */
    @InputImport(name="count", required=true)
      private final Double count;

    public Double getCount() {
        return this.count;
    }

    /**
     * Count-based metric type. Only one of type or count_type is specified in each Metric.
     * 
     */
    @InputImport(name="countType", required=true)
      private final String countType;

    public String getCountType() {
        return this.countType;
    }

    /**
     * Ratio value of a metric.
     * 
     */
    @InputImport(name="ratio", required=true)
      private final Double ratio;

    public Double getRatio() {
        return this.ratio;
    }

    /**
     * Ratio-based metric type. Only one of type or count_type is specified in each Metric.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public GoogleCloudDialogflowCxV3ExperimentResultMetricResponse(
        GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalResponse confidenceInterval,
        Double count,
        String countType,
        Double ratio,
        String type) {
        this.confidenceInterval = Objects.requireNonNull(confidenceInterval, "expected parameter 'confidenceInterval' to be non-null");
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.countType = Objects.requireNonNull(countType, "expected parameter 'countType' to be non-null");
        this.ratio = Objects.requireNonNull(ratio, "expected parameter 'ratio' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GoogleCloudDialogflowCxV3ExperimentResultMetricResponse() {
        this.confidenceInterval = null;
        this.count = null;
        this.countType = null;
        this.ratio = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ExperimentResultMetricResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalResponse confidenceInterval;
        private Double count;
        private String countType;
        private Double ratio;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ExperimentResultMetricResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confidenceInterval = defaults.confidenceInterval;
    	      this.count = defaults.count;
    	      this.countType = defaults.countType;
    	      this.ratio = defaults.ratio;
    	      this.type = defaults.type;
        }

        public Builder setConfidenceInterval(GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalResponse confidenceInterval) {
            this.confidenceInterval = Objects.requireNonNull(confidenceInterval);
            return this;
        }

        public Builder setCount(Double count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setCountType(String countType) {
            this.countType = Objects.requireNonNull(countType);
            return this;
        }

        public Builder setRatio(Double ratio) {
            this.ratio = Objects.requireNonNull(ratio);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GoogleCloudDialogflowCxV3ExperimentResultMetricResponse build() {
            return new GoogleCloudDialogflowCxV3ExperimentResultMetricResponse(confidenceInterval, count, countType, ratio, type);
        }
    }
}