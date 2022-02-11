// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.awsnative.iot.outputs.SecurityProfileMetricDimension;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SecurityProfileMetricToRetain {
    private final String metric;
    private final @Nullable SecurityProfileMetricDimension metricDimension;

    @OutputCustomType.Constructor({"metric","metricDimension"})
    private SecurityProfileMetricToRetain(
        String metric,
        @Nullable SecurityProfileMetricDimension metricDimension) {
        this.metric = Objects.requireNonNull(metric);
        this.metricDimension = metricDimension;
    }

    public String getMetric() {
        return this.metric;
    }
    public Optional<SecurityProfileMetricDimension> getMetricDimension() {
        return Optional.ofNullable(this.metricDimension);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityProfileMetricToRetain defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String metric;
        private @Nullable SecurityProfileMetricDimension metricDimension;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityProfileMetricToRetain defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metric = defaults.metric;
    	      this.metricDimension = defaults.metricDimension;
        }

        public Builder setMetric(String metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }

        public Builder setMetricDimension(@Nullable SecurityProfileMetricDimension metricDimension) {
            this.metricDimension = metricDimension;
            return this;
        }

        public SecurityProfileMetricToRetain build() {
            return new SecurityProfileMetricToRetain(metric, metricDimension);
        }
    }
}
