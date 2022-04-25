// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration parameters of autoscaling based on load balancing.
 * 
 */
public final class AutoscalingPolicyLoadBalancingUtilizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoscalingPolicyLoadBalancingUtilizationArgs Empty = new AutoscalingPolicyLoadBalancingUtilizationArgs();

    /**
     * Fraction of backend capacity utilization (set in HTTP(S) load balancing configuration) that the autoscaler maintains. Must be a positive float value. If not defined, the default is 0.8.
     * 
     */
    @Import(name="utilizationTarget")
    private @Nullable Output<Double> utilizationTarget;

    /**
     * @return Fraction of backend capacity utilization (set in HTTP(S) load balancing configuration) that the autoscaler maintains. Must be a positive float value. If not defined, the default is 0.8.
     * 
     */
    public Optional<Output<Double>> utilizationTarget() {
        return Optional.ofNullable(this.utilizationTarget);
    }

    private AutoscalingPolicyLoadBalancingUtilizationArgs() {}

    private AutoscalingPolicyLoadBalancingUtilizationArgs(AutoscalingPolicyLoadBalancingUtilizationArgs $) {
        this.utilizationTarget = $.utilizationTarget;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoscalingPolicyLoadBalancingUtilizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscalingPolicyLoadBalancingUtilizationArgs $;

        public Builder() {
            $ = new AutoscalingPolicyLoadBalancingUtilizationArgs();
        }

        public Builder(AutoscalingPolicyLoadBalancingUtilizationArgs defaults) {
            $ = new AutoscalingPolicyLoadBalancingUtilizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param utilizationTarget Fraction of backend capacity utilization (set in HTTP(S) load balancing configuration) that the autoscaler maintains. Must be a positive float value. If not defined, the default is 0.8.
         * 
         * @return builder
         * 
         */
        public Builder utilizationTarget(@Nullable Output<Double> utilizationTarget) {
            $.utilizationTarget = utilizationTarget;
            return this;
        }

        /**
         * @param utilizationTarget Fraction of backend capacity utilization (set in HTTP(S) load balancing configuration) that the autoscaler maintains. Must be a positive float value. If not defined, the default is 0.8.
         * 
         * @return builder
         * 
         */
        public Builder utilizationTarget(Double utilizationTarget) {
            return utilizationTarget(Output.of(utilizationTarget));
        }

        public AutoscalingPolicyLoadBalancingUtilizationArgs build() {
            return $;
        }
    }

}
