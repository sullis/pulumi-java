// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.azurenative.servicefabricmesh.inputs.AutoScalingResourceMetricResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the average load trigger used for auto scaling.
 * 
 */
public final class AverageLoadScalingTriggerResponse extends io.pulumi.resources.InvokeArgs {

    public static final AverageLoadScalingTriggerResponse Empty = new AverageLoadScalingTriggerResponse();

    /**
     * Enumerates the triggers for auto scaling.
     * Expected value is 'AverageLoad'.
     * 
     */
    @InputImport(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * Lower load threshold (if average load is below this threshold, service will scale down).
     * 
     */
    @InputImport(name="lowerLoadThreshold", required=true)
      private final Double lowerLoadThreshold;

    public Double getLowerLoadThreshold() {
        return this.lowerLoadThreshold;
    }

    /**
     * Description of the metric that is used for scaling.
     * 
     */
    @InputImport(name="metric", required=true)
      private final AutoScalingResourceMetricResponse metric;

    public AutoScalingResourceMetricResponse getMetric() {
        return this.metric;
    }

    /**
     * Scale interval that indicates how often will this trigger be checked.
     * 
     */
    @InputImport(name="scaleIntervalInSeconds", required=true)
      private final Integer scaleIntervalInSeconds;

    public Integer getScaleIntervalInSeconds() {
        return this.scaleIntervalInSeconds;
    }

    /**
     * Upper load threshold (if average load is above this threshold, service will scale up).
     * 
     */
    @InputImport(name="upperLoadThreshold", required=true)
      private final Double upperLoadThreshold;

    public Double getUpperLoadThreshold() {
        return this.upperLoadThreshold;
    }

    public AverageLoadScalingTriggerResponse(
        String kind,
        Double lowerLoadThreshold,
        AutoScalingResourceMetricResponse metric,
        Integer scaleIntervalInSeconds,
        Double upperLoadThreshold) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.lowerLoadThreshold = Objects.requireNonNull(lowerLoadThreshold, "expected parameter 'lowerLoadThreshold' to be non-null");
        this.metric = Objects.requireNonNull(metric, "expected parameter 'metric' to be non-null");
        this.scaleIntervalInSeconds = Objects.requireNonNull(scaleIntervalInSeconds, "expected parameter 'scaleIntervalInSeconds' to be non-null");
        this.upperLoadThreshold = Objects.requireNonNull(upperLoadThreshold, "expected parameter 'upperLoadThreshold' to be non-null");
    }

    private AverageLoadScalingTriggerResponse() {
        this.kind = null;
        this.lowerLoadThreshold = null;
        this.metric = null;
        this.scaleIntervalInSeconds = null;
        this.upperLoadThreshold = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AverageLoadScalingTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private Double lowerLoadThreshold;
        private AutoScalingResourceMetricResponse metric;
        private Integer scaleIntervalInSeconds;
        private Double upperLoadThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(AverageLoadScalingTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.lowerLoadThreshold = defaults.lowerLoadThreshold;
    	      this.metric = defaults.metric;
    	      this.scaleIntervalInSeconds = defaults.scaleIntervalInSeconds;
    	      this.upperLoadThreshold = defaults.upperLoadThreshold;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLowerLoadThreshold(Double lowerLoadThreshold) {
            this.lowerLoadThreshold = Objects.requireNonNull(lowerLoadThreshold);
            return this;
        }

        public Builder setMetric(AutoScalingResourceMetricResponse metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }

        public Builder setScaleIntervalInSeconds(Integer scaleIntervalInSeconds) {
            this.scaleIntervalInSeconds = Objects.requireNonNull(scaleIntervalInSeconds);
            return this;
        }

        public Builder setUpperLoadThreshold(Double upperLoadThreshold) {
            this.upperLoadThreshold = Objects.requireNonNull(upperLoadThreshold);
            return this;
        }
        public AverageLoadScalingTriggerResponse build() {
            return new AverageLoadScalingTriggerResponse(kind, lowerLoadThreshold, metric, scaleIntervalInSeconds, upperLoadThreshold);
        }
    }
}