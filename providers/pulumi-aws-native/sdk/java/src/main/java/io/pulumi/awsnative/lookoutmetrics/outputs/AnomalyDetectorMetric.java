// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.outputs;

import io.pulumi.awsnative.lookoutmetrics.enums.AnomalyDetectorMetricAggregationFunction;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AnomalyDetectorMetric {
    /**
     * Operator used to aggregate metric values
     * 
     */
    private final AnomalyDetectorMetricAggregationFunction aggregationFunction;
    private final String metricName;
    private final @Nullable String namespace;

    @CustomType.Constructor
    private AnomalyDetectorMetric(
        @CustomType.Parameter("aggregationFunction") AnomalyDetectorMetricAggregationFunction aggregationFunction,
        @CustomType.Parameter("metricName") String metricName,
        @CustomType.Parameter("namespace") @Nullable String namespace) {
        this.aggregationFunction = aggregationFunction;
        this.metricName = metricName;
        this.namespace = namespace;
    }

    /**
     * Operator used to aggregate metric values
     * 
    */
    public AnomalyDetectorMetricAggregationFunction aggregationFunction() {
        return this.aggregationFunction;
    }
    public String metricName() {
        return this.metricName;
    }
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorMetric defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnomalyDetectorMetricAggregationFunction aggregationFunction;
        private String metricName;
        private @Nullable String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorMetric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationFunction = defaults.aggregationFunction;
    	      this.metricName = defaults.metricName;
    	      this.namespace = defaults.namespace;
        }

        public Builder aggregationFunction(AnomalyDetectorMetricAggregationFunction aggregationFunction) {
            this.aggregationFunction = Objects.requireNonNull(aggregationFunction);
            return this;
        }
        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }        public AnomalyDetectorMetric build() {
            return new AnomalyDetectorMetric(aggregationFunction, metricName, namespace);
        }
    }
}
