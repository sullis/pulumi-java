// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.autoscaling_v2.outputs.MetricIdentifier;
import io.pulumi.kubernetes.autoscaling_v2.outputs.MetricValueStatus;
import java.util.Objects;

@OutputCustomType
public final class PodsMetricStatus {
    /**
     * current contains the current value for the given metric
     * 
     */
    private final MetricValueStatus current;
    /**
     * metric identifies the target metric by name and selector
     * 
     */
    private final MetricIdentifier metric;

    @OutputCustomType.Constructor({"current","metric"})
    private PodsMetricStatus(
        MetricValueStatus current,
        MetricIdentifier metric) {
        this.current = Objects.requireNonNull(current);
        this.metric = Objects.requireNonNull(metric);
    }

    /**
     * current contains the current value for the given metric
     * 
    */
    public MetricValueStatus getCurrent() {
        return this.current;
    }
    /**
     * metric identifies the target metric by name and selector
     * 
    */
    public MetricIdentifier getMetric() {
        return this.metric;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodsMetricStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricValueStatus current;
        private MetricIdentifier metric;

        public Builder() {
    	      // Empty
        }

        public Builder(PodsMetricStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.current = defaults.current;
    	      this.metric = defaults.metric;
        }

        public Builder setCurrent(MetricValueStatus current) {
            this.current = Objects.requireNonNull(current);
            return this;
        }

        public Builder setMetric(MetricIdentifier metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }
        public PodsMetricStatus build() {
            return new PodsMetricStatus(current, metric);
        }
    }
}