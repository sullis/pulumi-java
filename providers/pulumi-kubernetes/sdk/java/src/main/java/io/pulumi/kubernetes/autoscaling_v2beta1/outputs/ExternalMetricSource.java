// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.meta_v1.outputs.LabelSelector;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExternalMetricSource {
    /**
     * metricName is the name of the metric in question.
     * 
     */
    private final String metricName;
    /**
     * metricSelector is used to identify a specific time series within a given metric.
     * 
     */
    private final @Nullable LabelSelector metricSelector;
    /**
     * targetAverageValue is the target per-pod value of global metric (as a quantity). Mutually exclusive with TargetValue.
     * 
     */
    private final @Nullable String targetAverageValue;
    /**
     * targetValue is the target value of the metric (as a quantity). Mutually exclusive with TargetAverageValue.
     * 
     */
    private final @Nullable String targetValue;

    @OutputCustomType.Constructor({"metricName","metricSelector","targetAverageValue","targetValue"})
    private ExternalMetricSource(
        String metricName,
        @Nullable LabelSelector metricSelector,
        @Nullable String targetAverageValue,
        @Nullable String targetValue) {
        this.metricName = Objects.requireNonNull(metricName);
        this.metricSelector = metricSelector;
        this.targetAverageValue = targetAverageValue;
        this.targetValue = targetValue;
    }

    /**
     * metricName is the name of the metric in question.
     * 
    */
    public String getMetricName() {
        return this.metricName;
    }
    /**
     * metricSelector is used to identify a specific time series within a given metric.
     * 
    */
    public Optional<LabelSelector> getMetricSelector() {
        return Optional.ofNullable(this.metricSelector);
    }
    /**
     * targetAverageValue is the target per-pod value of global metric (as a quantity). Mutually exclusive with TargetValue.
     * 
    */
    public Optional<String> getTargetAverageValue() {
        return Optional.ofNullable(this.targetAverageValue);
    }
    /**
     * targetValue is the target value of the metric (as a quantity). Mutually exclusive with TargetAverageValue.
     * 
    */
    public Optional<String> getTargetValue() {
        return Optional.ofNullable(this.targetValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalMetricSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String metricName;
        private @Nullable LabelSelector metricSelector;
        private @Nullable String targetAverageValue;
        private @Nullable String targetValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalMetricSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricName = defaults.metricName;
    	      this.metricSelector = defaults.metricSelector;
    	      this.targetAverageValue = defaults.targetAverageValue;
    	      this.targetValue = defaults.targetValue;
        }

        public Builder setMetricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder setMetricSelector(@Nullable LabelSelector metricSelector) {
            this.metricSelector = metricSelector;
            return this;
        }

        public Builder setTargetAverageValue(@Nullable String targetAverageValue) {
            this.targetAverageValue = targetAverageValue;
            return this;
        }

        public Builder setTargetValue(@Nullable String targetValue) {
            this.targetValue = targetValue;
            return this;
        }
        public ExternalMetricSource build() {
            return new ExternalMetricSource(metricName, metricSelector, targetAverageValue, targetValue);
        }
    }
}