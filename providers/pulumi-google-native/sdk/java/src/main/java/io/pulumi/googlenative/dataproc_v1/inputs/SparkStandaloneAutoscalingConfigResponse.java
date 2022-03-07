// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Basic autoscaling configurations for Spark Standalone.
 * 
 */
public final class SparkStandaloneAutoscalingConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final SparkStandaloneAutoscalingConfigResponse Empty = new SparkStandaloneAutoscalingConfigResponse();

    /**
     * Timeout for Spark graceful decommissioning of spark workers. Specifies the duration to wait for spark worker to complete spark decomissioning tasks before forcefully removing workers. Only applicable to downscaling operations.Bounds: 0s, 1d.
     * 
     */
    @InputImport(name="gracefulDecommissionTimeout", required=true)
      private final String gracefulDecommissionTimeout;

    public String getGracefulDecommissionTimeout() {
        return this.gracefulDecommissionTimeout;
    }

    /**
     * Fraction of required executors to remove from Spark Serverless clusters. A scale-down factor of 1.0 will result in scaling down so that there are no more executors for the Spark Job.(more aggressive scaling). A scale-down factor closer to 0 will result in a smaller magnitude of scaling donw (less aggressive scaling).Bounds: 0.0, 1.0.
     * 
     */
    @InputImport(name="scaleDownFactor", required=true)
      private final Double scaleDownFactor;

    public Double getScaleDownFactor() {
        return this.scaleDownFactor;
    }

    /**
     * Optional. Minimum scale-down threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2 worker scale-down for the cluster to scale. A threshold of 0 means the autoscaler will scale down on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
     */
    @InputImport(name="scaleDownMinWorkerFraction", required=true)
      private final Double scaleDownMinWorkerFraction;

    public Double getScaleDownMinWorkerFraction() {
        return this.scaleDownMinWorkerFraction;
    }

    /**
     * Fraction of required workers to add to Spark Standalone clusters. A scale-up factor of 1.0 will result in scaling up so that there are no more required workers for the Spark Job (more aggressive scaling). A scale-up factor closer to 0 will result in a smaller magnitude of scaling up (less aggressive scaling).Bounds: 0.0, 1.0.
     * 
     */
    @InputImport(name="scaleUpFactor", required=true)
      private final Double scaleUpFactor;

    public Double getScaleUpFactor() {
        return this.scaleUpFactor;
    }

    /**
     * Optional. Minimum scale-up threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2-worker scale-up for the cluster to scale. A threshold of 0 means the autoscaler will scale up on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
     */
    @InputImport(name="scaleUpMinWorkerFraction", required=true)
      private final Double scaleUpMinWorkerFraction;

    public Double getScaleUpMinWorkerFraction() {
        return this.scaleUpMinWorkerFraction;
    }

    public SparkStandaloneAutoscalingConfigResponse(
        String gracefulDecommissionTimeout,
        Double scaleDownFactor,
        Double scaleDownMinWorkerFraction,
        Double scaleUpFactor,
        Double scaleUpMinWorkerFraction) {
        this.gracefulDecommissionTimeout = Objects.requireNonNull(gracefulDecommissionTimeout, "expected parameter 'gracefulDecommissionTimeout' to be non-null");
        this.scaleDownFactor = Objects.requireNonNull(scaleDownFactor, "expected parameter 'scaleDownFactor' to be non-null");
        this.scaleDownMinWorkerFraction = Objects.requireNonNull(scaleDownMinWorkerFraction, "expected parameter 'scaleDownMinWorkerFraction' to be non-null");
        this.scaleUpFactor = Objects.requireNonNull(scaleUpFactor, "expected parameter 'scaleUpFactor' to be non-null");
        this.scaleUpMinWorkerFraction = Objects.requireNonNull(scaleUpMinWorkerFraction, "expected parameter 'scaleUpMinWorkerFraction' to be non-null");
    }

    private SparkStandaloneAutoscalingConfigResponse() {
        this.gracefulDecommissionTimeout = null;
        this.scaleDownFactor = null;
        this.scaleDownMinWorkerFraction = null;
        this.scaleUpFactor = null;
        this.scaleUpMinWorkerFraction = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkStandaloneAutoscalingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gracefulDecommissionTimeout;
        private Double scaleDownFactor;
        private Double scaleDownMinWorkerFraction;
        private Double scaleUpFactor;
        private Double scaleUpMinWorkerFraction;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkStandaloneAutoscalingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gracefulDecommissionTimeout = defaults.gracefulDecommissionTimeout;
    	      this.scaleDownFactor = defaults.scaleDownFactor;
    	      this.scaleDownMinWorkerFraction = defaults.scaleDownMinWorkerFraction;
    	      this.scaleUpFactor = defaults.scaleUpFactor;
    	      this.scaleUpMinWorkerFraction = defaults.scaleUpMinWorkerFraction;
        }

        public Builder setGracefulDecommissionTimeout(String gracefulDecommissionTimeout) {
            this.gracefulDecommissionTimeout = Objects.requireNonNull(gracefulDecommissionTimeout);
            return this;
        }

        public Builder setScaleDownFactor(Double scaleDownFactor) {
            this.scaleDownFactor = Objects.requireNonNull(scaleDownFactor);
            return this;
        }

        public Builder setScaleDownMinWorkerFraction(Double scaleDownMinWorkerFraction) {
            this.scaleDownMinWorkerFraction = Objects.requireNonNull(scaleDownMinWorkerFraction);
            return this;
        }

        public Builder setScaleUpFactor(Double scaleUpFactor) {
            this.scaleUpFactor = Objects.requireNonNull(scaleUpFactor);
            return this;
        }

        public Builder setScaleUpMinWorkerFraction(Double scaleUpMinWorkerFraction) {
            this.scaleUpMinWorkerFraction = Objects.requireNonNull(scaleUpMinWorkerFraction);
            return this;
        }
        public SparkStandaloneAutoscalingConfigResponse build() {
            return new SparkStandaloneAutoscalingConfigResponse(gracefulDecommissionTimeout, scaleDownFactor, scaleDownMinWorkerFraction, scaleUpFactor, scaleUpMinWorkerFraction);
        }
    }
}