// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.AutoscalingPolicyCpuUtilizationPredictiveMethod;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CPU utilization policy.
 * 
 */
public final class AutoscalingPolicyCpuUtilizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalingPolicyCpuUtilizationArgs Empty = new AutoscalingPolicyCpuUtilizationArgs();

    /**
     * Indicates whether predictive autoscaling based on CPU metric is enabled. Valid values are: * NONE (default). No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics. * OPTIMIZE_AVAILABILITY. Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
     * 
     */
    @InputImport(name="predictiveMethod")
      private final @Nullable Input<AutoscalingPolicyCpuUtilizationPredictiveMethod> predictiveMethod;

    public Input<AutoscalingPolicyCpuUtilizationPredictiveMethod> getPredictiveMethod() {
        return this.predictiveMethod == null ? Input.empty() : this.predictiveMethod;
    }

    /**
     * The target CPU utilization that the autoscaler maintains. Must be a float value in the range (0, 1]. If not specified, the default is 0.6. If the CPU level is below the target utilization, the autoscaler scales in the number of instances until it reaches the minimum number of instances you specified or until the average CPU of your instances reaches the target utilization. If the average CPU is above the target utilization, the autoscaler scales out until it reaches the maximum number of instances you specified or until the average utilization reaches the target utilization.
     * 
     */
    @InputImport(name="utilizationTarget")
      private final @Nullable Input<Double> utilizationTarget;

    public Input<Double> getUtilizationTarget() {
        return this.utilizationTarget == null ? Input.empty() : this.utilizationTarget;
    }

    public AutoscalingPolicyCpuUtilizationArgs(
        @Nullable Input<AutoscalingPolicyCpuUtilizationPredictiveMethod> predictiveMethod,
        @Nullable Input<Double> utilizationTarget) {
        this.predictiveMethod = predictiveMethod;
        this.utilizationTarget = utilizationTarget;
    }

    private AutoscalingPolicyCpuUtilizationArgs() {
        this.predictiveMethod = Input.empty();
        this.utilizationTarget = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicyCpuUtilizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AutoscalingPolicyCpuUtilizationPredictiveMethod> predictiveMethod;
        private @Nullable Input<Double> utilizationTarget;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicyCpuUtilizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.predictiveMethod = defaults.predictiveMethod;
    	      this.utilizationTarget = defaults.utilizationTarget;
        }

        public Builder setPredictiveMethod(@Nullable Input<AutoscalingPolicyCpuUtilizationPredictiveMethod> predictiveMethod) {
            this.predictiveMethod = predictiveMethod;
            return this;
        }

        public Builder setPredictiveMethod(@Nullable AutoscalingPolicyCpuUtilizationPredictiveMethod predictiveMethod) {
            this.predictiveMethod = Input.ofNullable(predictiveMethod);
            return this;
        }

        public Builder setUtilizationTarget(@Nullable Input<Double> utilizationTarget) {
            this.utilizationTarget = utilizationTarget;
            return this;
        }

        public Builder setUtilizationTarget(@Nullable Double utilizationTarget) {
            this.utilizationTarget = Input.ofNullable(utilizationTarget);
            return this;
        }
        public AutoscalingPolicyCpuUtilizationArgs build() {
            return new AutoscalingPolicyCpuUtilizationArgs(predictiveMethod, utilizationTarget);
        }
    }
}