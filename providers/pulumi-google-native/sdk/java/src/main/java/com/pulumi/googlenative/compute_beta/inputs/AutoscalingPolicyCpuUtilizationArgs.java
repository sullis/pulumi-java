// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.enums.AutoscalingPolicyCpuUtilizationPredictiveMethod;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * CPU utilization policy.
 * 
 */
public final class AutoscalingPolicyCpuUtilizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoscalingPolicyCpuUtilizationArgs Empty = new AutoscalingPolicyCpuUtilizationArgs();

    /**
     * Indicates whether predictive autoscaling based on CPU metric is enabled. Valid values are: * NONE (default). No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics. * OPTIMIZE_AVAILABILITY. Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
     * 
     */
    @Import(name="predictiveMethod")
    private @Nullable Output<AutoscalingPolicyCpuUtilizationPredictiveMethod> predictiveMethod;

    /**
     * @return Indicates whether predictive autoscaling based on CPU metric is enabled. Valid values are: * NONE (default). No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics. * OPTIMIZE_AVAILABILITY. Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
     * 
     */
    public Optional<Output<AutoscalingPolicyCpuUtilizationPredictiveMethod>> predictiveMethod() {
        return Optional.ofNullable(this.predictiveMethod);
    }

    /**
     * The target CPU utilization that the autoscaler maintains. Must be a float value in the range (0, 1]. If not specified, the default is 0.6. If the CPU level is below the target utilization, the autoscaler scales in the number of instances until it reaches the minimum number of instances you specified or until the average CPU of your instances reaches the target utilization. If the average CPU is above the target utilization, the autoscaler scales out until it reaches the maximum number of instances you specified or until the average utilization reaches the target utilization.
     * 
     */
    @Import(name="utilizationTarget")
    private @Nullable Output<Double> utilizationTarget;

    /**
     * @return The target CPU utilization that the autoscaler maintains. Must be a float value in the range (0, 1]. If not specified, the default is 0.6. If the CPU level is below the target utilization, the autoscaler scales in the number of instances until it reaches the minimum number of instances you specified or until the average CPU of your instances reaches the target utilization. If the average CPU is above the target utilization, the autoscaler scales out until it reaches the maximum number of instances you specified or until the average utilization reaches the target utilization.
     * 
     */
    public Optional<Output<Double>> utilizationTarget() {
        return Optional.ofNullable(this.utilizationTarget);
    }

    private AutoscalingPolicyCpuUtilizationArgs() {}

    private AutoscalingPolicyCpuUtilizationArgs(AutoscalingPolicyCpuUtilizationArgs $) {
        this.predictiveMethod = $.predictiveMethod;
        this.utilizationTarget = $.utilizationTarget;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoscalingPolicyCpuUtilizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscalingPolicyCpuUtilizationArgs $;

        public Builder() {
            $ = new AutoscalingPolicyCpuUtilizationArgs();
        }

        public Builder(AutoscalingPolicyCpuUtilizationArgs defaults) {
            $ = new AutoscalingPolicyCpuUtilizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param predictiveMethod Indicates whether predictive autoscaling based on CPU metric is enabled. Valid values are: * NONE (default). No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics. * OPTIMIZE_AVAILABILITY. Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
         * 
         * @return builder
         * 
         */
        public Builder predictiveMethod(@Nullable Output<AutoscalingPolicyCpuUtilizationPredictiveMethod> predictiveMethod) {
            $.predictiveMethod = predictiveMethod;
            return this;
        }

        /**
         * @param predictiveMethod Indicates whether predictive autoscaling based on CPU metric is enabled. Valid values are: * NONE (default). No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics. * OPTIMIZE_AVAILABILITY. Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
         * 
         * @return builder
         * 
         */
        public Builder predictiveMethod(AutoscalingPolicyCpuUtilizationPredictiveMethod predictiveMethod) {
            return predictiveMethod(Output.of(predictiveMethod));
        }

        /**
         * @param utilizationTarget The target CPU utilization that the autoscaler maintains. Must be a float value in the range (0, 1]. If not specified, the default is 0.6. If the CPU level is below the target utilization, the autoscaler scales in the number of instances until it reaches the minimum number of instances you specified or until the average CPU of your instances reaches the target utilization. If the average CPU is above the target utilization, the autoscaler scales out until it reaches the maximum number of instances you specified or until the average utilization reaches the target utilization.
         * 
         * @return builder
         * 
         */
        public Builder utilizationTarget(@Nullable Output<Double> utilizationTarget) {
            $.utilizationTarget = utilizationTarget;
            return this;
        }

        /**
         * @param utilizationTarget The target CPU utilization that the autoscaler maintains. Must be a float value in the range (0, 1]. If not specified, the default is 0.6. If the CPU level is below the target utilization, the autoscaler scales in the number of instances until it reaches the minimum number of instances you specified or until the average CPU of your instances reaches the target utilization. If the average CPU is above the target utilization, the autoscaler scales out until it reaches the maximum number of instances you specified or until the average utilization reaches the target utilization.
         * 
         * @return builder
         * 
         */
        public Builder utilizationTarget(Double utilizationTarget) {
            return utilizationTarget(Output.of(utilizationTarget));
        }

        public AutoscalingPolicyCpuUtilizationArgs build() {
            return $;
        }
    }

}
