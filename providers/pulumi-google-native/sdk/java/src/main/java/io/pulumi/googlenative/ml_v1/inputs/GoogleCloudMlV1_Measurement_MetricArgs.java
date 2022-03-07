// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * A message representing a metric in the measurement.
 * 
 */
public final class GoogleCloudMlV1_Measurement_MetricArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1_Measurement_MetricArgs Empty = new GoogleCloudMlV1_Measurement_MetricArgs();

    /**
     * Metric name.
     * 
     */
    @InputImport(name="metric", required=true)
      private final Input<String> metric;

    public Input<String> getMetric() {
        return this.metric;
    }

    /**
     * The value for this metric.
     * 
     */
    @InputImport(name="value", required=true)
      private final Input<Double> value;

    public Input<Double> getValue() {
        return this.value;
    }

    public GoogleCloudMlV1_Measurement_MetricArgs(
        Input<String> metric,
        Input<Double> value) {
        this.metric = Objects.requireNonNull(metric, "expected parameter 'metric' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private GoogleCloudMlV1_Measurement_MetricArgs() {
        this.metric = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_Measurement_MetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> metric;
        private Input<Double> value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_Measurement_MetricArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metric = defaults.metric;
    	      this.value = defaults.value;
        }

        public Builder setMetric(Input<String> metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }

        public Builder setMetric(String metric) {
            this.metric = Input.of(Objects.requireNonNull(metric));
            return this;
        }

        public Builder setValue(Input<Double> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(Double value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public GoogleCloudMlV1_Measurement_MetricArgs build() {
            return new GoogleCloudMlV1_Measurement_MetricArgs(metric, value);
        }
    }
}