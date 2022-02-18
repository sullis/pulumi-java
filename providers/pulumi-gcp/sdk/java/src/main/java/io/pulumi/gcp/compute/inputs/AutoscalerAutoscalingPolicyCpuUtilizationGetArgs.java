// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscalerAutoscalingPolicyCpuUtilizationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalerAutoscalingPolicyCpuUtilizationGetArgs Empty = new AutoscalerAutoscalingPolicyCpuUtilizationGetArgs();

    /**
     * Indicates whether predictive autoscaling based on CPU metric is enabled. Valid values are:
     * - NONE (default). No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics.
     * - OPTIMIZE_AVAILABILITY. Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
     * 
     */
    @InputImport(name="predictiveMethod")
    private final @Nullable Input<String> predictiveMethod;

    public Input<String> getPredictiveMethod() {
        return this.predictiveMethod == null ? Input.empty() : this.predictiveMethod;
    }

    /**
     * Fraction of backend capacity utilization (set in HTTP(s) load
     * balancing configuration) that autoscaler should maintain. Must
     * be a positive float value. If not defined, the default is 0.8.
     * 
     */
    @InputImport(name="target", required=true)
    private final Input<Double> target;

    public Input<Double> getTarget() {
        return this.target;
    }

    public AutoscalerAutoscalingPolicyCpuUtilizationGetArgs(
        @Nullable Input<String> predictiveMethod,
        Input<Double> target) {
        this.predictiveMethod = predictiveMethod;
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private AutoscalerAutoscalingPolicyCpuUtilizationGetArgs() {
        this.predictiveMethod = Input.empty();
        this.target = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalerAutoscalingPolicyCpuUtilizationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> predictiveMethod;
        private Input<Double> target;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalerAutoscalingPolicyCpuUtilizationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.predictiveMethod = defaults.predictiveMethod;
    	      this.target = defaults.target;
        }

        public Builder setPredictiveMethod(@Nullable Input<String> predictiveMethod) {
            this.predictiveMethod = predictiveMethod;
            return this;
        }

        public Builder setPredictiveMethod(@Nullable String predictiveMethod) {
            this.predictiveMethod = Input.ofNullable(predictiveMethod);
            return this;
        }

        public Builder setTarget(Input<Double> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder setTarget(Double target) {
            this.target = Input.of(Objects.requireNonNull(target));
            return this;
        }

        public AutoscalerAutoscalingPolicyCpuUtilizationGetArgs build() {
            return new AutoscalerAutoscalingPolicyCpuUtilizationGetArgs(predictiveMethod, target);
        }
    }
}
