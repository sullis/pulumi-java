// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.autoscaling_v2beta1.outputs.CrossVersionObjectReference;
import io.pulumi.kubernetes.meta_v1.outputs.LabelSelector;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ObjectMetricSource {
    /**
     * averageValue is the target value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    private final @Nullable String averageValue;
    /**
     * metricName is the name of the metric in question.
     * 
     */
    private final String metricName;
    /**
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
     * 
     */
    private final @Nullable LabelSelector selector;
    /**
     * target is the described Kubernetes object.
     * 
     */
    private final CrossVersionObjectReference target;
    /**
     * targetValue is the target value of the metric (as a quantity).
     * 
     */
    private final String targetValue;

    @OutputCustomType.Constructor
    private ObjectMetricSource(
        @OutputCustomType.Parameter("averageValue") @Nullable String averageValue,
        @OutputCustomType.Parameter("metricName") String metricName,
        @OutputCustomType.Parameter("selector") @Nullable LabelSelector selector,
        @OutputCustomType.Parameter("target") CrossVersionObjectReference target,
        @OutputCustomType.Parameter("targetValue") String targetValue) {
        this.averageValue = averageValue;
        this.metricName = metricName;
        this.selector = selector;
        this.target = target;
        this.targetValue = targetValue;
    }

    /**
     * averageValue is the target value of the average of the metric across all relevant pods (as a quantity)
     * 
    */
    public Optional<String> getAverageValue() {
        return Optional.ofNullable(this.averageValue);
    }
    /**
     * metricName is the name of the metric in question.
     * 
    */
    public String getMetricName() {
        return this.metricName;
    }
    /**
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
     * 
    */
    public Optional<LabelSelector> getSelector() {
        return Optional.ofNullable(this.selector);
    }
    /**
     * target is the described Kubernetes object.
     * 
    */
    public CrossVersionObjectReference getTarget() {
        return this.target;
    }
    /**
     * targetValue is the target value of the metric (as a quantity).
     * 
    */
    public String getTargetValue() {
        return this.targetValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectMetricSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String averageValue;
        private String metricName;
        private @Nullable LabelSelector selector;
        private CrossVersionObjectReference target;
        private String targetValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectMetricSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.averageValue = defaults.averageValue;
    	      this.metricName = defaults.metricName;
    	      this.selector = defaults.selector;
    	      this.target = defaults.target;
    	      this.targetValue = defaults.targetValue;
        }

        public Builder setAverageValue(@Nullable String averageValue) {
            this.averageValue = averageValue;
            return this;
        }

        public Builder setMetricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder setSelector(@Nullable LabelSelector selector) {
            this.selector = selector;
            return this;
        }

        public Builder setTarget(CrossVersionObjectReference target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder setTargetValue(String targetValue) {
            this.targetValue = Objects.requireNonNull(targetValue);
            return this;
        }
        public ObjectMetricSource build() {
            return new ObjectMetricSource(averageValue, metricName, selector, target, targetValue);
        }
    }
}
