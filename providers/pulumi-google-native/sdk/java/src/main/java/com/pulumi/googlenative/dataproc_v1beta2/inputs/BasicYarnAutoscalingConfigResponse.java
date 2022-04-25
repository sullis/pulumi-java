// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Basic autoscaling configurations for YARN.
 * 
 */
public final class BasicYarnAutoscalingConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final BasicYarnAutoscalingConfigResponse Empty = new BasicYarnAutoscalingConfigResponse();

    /**
     * Timeout for YARN graceful decommissioning of Node Managers. Specifies the duration to wait for jobs to complete before forcefully removing workers (and potentially interrupting jobs). Only applicable to downscaling operations.Bounds: 0s, 1d.
     * 
     */
    @Import(name="gracefulDecommissionTimeout", required=true)
    private String gracefulDecommissionTimeout;

    /**
     * @return Timeout for YARN graceful decommissioning of Node Managers. Specifies the duration to wait for jobs to complete before forcefully removing workers (and potentially interrupting jobs). Only applicable to downscaling operations.Bounds: 0s, 1d.
     * 
     */
    public String gracefulDecommissionTimeout() {
        return this.gracefulDecommissionTimeout;
    }

    /**
     * Fraction of average YARN pending memory in the last cooldown period for which to remove workers. A scale-down factor of 1 will result in scaling down so that there is no available memory remaining after the update (more aggressive scaling). A scale-down factor of 0 disables removing workers, which can be beneficial for autoscaling a single job. See How autoscaling works for more information.Bounds: 0.0, 1.0.
     * 
     */
    @Import(name="scaleDownFactor", required=true)
    private Double scaleDownFactor;

    /**
     * @return Fraction of average YARN pending memory in the last cooldown period for which to remove workers. A scale-down factor of 1 will result in scaling down so that there is no available memory remaining after the update (more aggressive scaling). A scale-down factor of 0 disables removing workers, which can be beneficial for autoscaling a single job. See How autoscaling works for more information.Bounds: 0.0, 1.0.
     * 
     */
    public Double scaleDownFactor() {
        return this.scaleDownFactor;
    }

    /**
     * Optional. Minimum scale-down threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2 worker scale-down for the cluster to scale. A threshold of 0 means the autoscaler will scale down on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
     */
    @Import(name="scaleDownMinWorkerFraction", required=true)
    private Double scaleDownMinWorkerFraction;

    /**
     * @return Optional. Minimum scale-down threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2 worker scale-down for the cluster to scale. A threshold of 0 means the autoscaler will scale down on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
     */
    public Double scaleDownMinWorkerFraction() {
        return this.scaleDownMinWorkerFraction;
    }

    /**
     * Fraction of average YARN pending memory in the last cooldown period for which to add workers. A scale-up factor of 1.0 will result in scaling up so that there is no pending memory remaining after the update (more aggressive scaling). A scale-up factor closer to 0 will result in a smaller magnitude of scaling up (less aggressive scaling). See How autoscaling works for more information.Bounds: 0.0, 1.0.
     * 
     */
    @Import(name="scaleUpFactor", required=true)
    private Double scaleUpFactor;

    /**
     * @return Fraction of average YARN pending memory in the last cooldown period for which to add workers. A scale-up factor of 1.0 will result in scaling up so that there is no pending memory remaining after the update (more aggressive scaling). A scale-up factor closer to 0 will result in a smaller magnitude of scaling up (less aggressive scaling). See How autoscaling works for more information.Bounds: 0.0, 1.0.
     * 
     */
    public Double scaleUpFactor() {
        return this.scaleUpFactor;
    }

    /**
     * Optional. Minimum scale-up threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2-worker scale-up for the cluster to scale. A threshold of 0 means the autoscaler will scale up on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
     */
    @Import(name="scaleUpMinWorkerFraction", required=true)
    private Double scaleUpMinWorkerFraction;

    /**
     * @return Optional. Minimum scale-up threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2-worker scale-up for the cluster to scale. A threshold of 0 means the autoscaler will scale up on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
     */
    public Double scaleUpMinWorkerFraction() {
        return this.scaleUpMinWorkerFraction;
    }

    private BasicYarnAutoscalingConfigResponse() {}

    private BasicYarnAutoscalingConfigResponse(BasicYarnAutoscalingConfigResponse $) {
        this.gracefulDecommissionTimeout = $.gracefulDecommissionTimeout;
        this.scaleDownFactor = $.scaleDownFactor;
        this.scaleDownMinWorkerFraction = $.scaleDownMinWorkerFraction;
        this.scaleUpFactor = $.scaleUpFactor;
        this.scaleUpMinWorkerFraction = $.scaleUpMinWorkerFraction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BasicYarnAutoscalingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasicYarnAutoscalingConfigResponse $;

        public Builder() {
            $ = new BasicYarnAutoscalingConfigResponse();
        }

        public Builder(BasicYarnAutoscalingConfigResponse defaults) {
            $ = new BasicYarnAutoscalingConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param gracefulDecommissionTimeout Timeout for YARN graceful decommissioning of Node Managers. Specifies the duration to wait for jobs to complete before forcefully removing workers (and potentially interrupting jobs). Only applicable to downscaling operations.Bounds: 0s, 1d.
         * 
         * @return builder
         * 
         */
        public Builder gracefulDecommissionTimeout(String gracefulDecommissionTimeout) {
            $.gracefulDecommissionTimeout = gracefulDecommissionTimeout;
            return this;
        }

        /**
         * @param scaleDownFactor Fraction of average YARN pending memory in the last cooldown period for which to remove workers. A scale-down factor of 1 will result in scaling down so that there is no available memory remaining after the update (more aggressive scaling). A scale-down factor of 0 disables removing workers, which can be beneficial for autoscaling a single job. See How autoscaling works for more information.Bounds: 0.0, 1.0.
         * 
         * @return builder
         * 
         */
        public Builder scaleDownFactor(Double scaleDownFactor) {
            $.scaleDownFactor = scaleDownFactor;
            return this;
        }

        /**
         * @param scaleDownMinWorkerFraction Optional. Minimum scale-down threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2 worker scale-down for the cluster to scale. A threshold of 0 means the autoscaler will scale down on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
         * 
         * @return builder
         * 
         */
        public Builder scaleDownMinWorkerFraction(Double scaleDownMinWorkerFraction) {
            $.scaleDownMinWorkerFraction = scaleDownMinWorkerFraction;
            return this;
        }

        /**
         * @param scaleUpFactor Fraction of average YARN pending memory in the last cooldown period for which to add workers. A scale-up factor of 1.0 will result in scaling up so that there is no pending memory remaining after the update (more aggressive scaling). A scale-up factor closer to 0 will result in a smaller magnitude of scaling up (less aggressive scaling). See How autoscaling works for more information.Bounds: 0.0, 1.0.
         * 
         * @return builder
         * 
         */
        public Builder scaleUpFactor(Double scaleUpFactor) {
            $.scaleUpFactor = scaleUpFactor;
            return this;
        }

        /**
         * @param scaleUpMinWorkerFraction Optional. Minimum scale-up threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2-worker scale-up for the cluster to scale. A threshold of 0 means the autoscaler will scale up on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
         * 
         * @return builder
         * 
         */
        public Builder scaleUpMinWorkerFraction(Double scaleUpMinWorkerFraction) {
            $.scaleUpMinWorkerFraction = scaleUpMinWorkerFraction;
            return this;
        }

        public BasicYarnAutoscalingConfigResponse build() {
            $.gracefulDecommissionTimeout = Objects.requireNonNull($.gracefulDecommissionTimeout, "expected parameter 'gracefulDecommissionTimeout' to be non-null");
            $.scaleDownFactor = Objects.requireNonNull($.scaleDownFactor, "expected parameter 'scaleDownFactor' to be non-null");
            $.scaleDownMinWorkerFraction = Objects.requireNonNull($.scaleDownMinWorkerFraction, "expected parameter 'scaleDownMinWorkerFraction' to be non-null");
            $.scaleUpFactor = Objects.requireNonNull($.scaleUpFactor, "expected parameter 'scaleUpFactor' to be non-null");
            $.scaleUpMinWorkerFraction = Objects.requireNonNull($.scaleUpMinWorkerFraction, "expected parameter 'scaleUpMinWorkerFraction' to be non-null");
            return $;
        }
    }

}
