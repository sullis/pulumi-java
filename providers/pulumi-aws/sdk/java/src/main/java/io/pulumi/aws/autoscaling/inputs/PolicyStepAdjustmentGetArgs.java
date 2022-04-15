// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyStepAdjustmentGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyStepAdjustmentGetArgs Empty = new PolicyStepAdjustmentGetArgs();

    /**
     * The lower bound for the
     * difference between the alarm threshold and the CloudWatch metric.
     * Without a value, AWS will treat this bound as infinity.
     * 
     */
    @Import(name="metricIntervalLowerBound")
      private final @Nullable Output<String> metricIntervalLowerBound;

    public Output<String> metricIntervalLowerBound() {
        return this.metricIntervalLowerBound == null ? Codegen.empty() : this.metricIntervalLowerBound;
    }

    /**
     * The upper bound for the
     * difference between the alarm threshold and the CloudWatch metric.
     * Without a value, AWS will treat this bound as infinity. The upper bound
     * must be greater than the lower bound.
     * 
     */
    @Import(name="metricIntervalUpperBound")
      private final @Nullable Output<String> metricIntervalUpperBound;

    public Output<String> metricIntervalUpperBound() {
        return this.metricIntervalUpperBound == null ? Codegen.empty() : this.metricIntervalUpperBound;
    }

    /**
     * The number of members by which to
     * scale, when the adjustment bounds are breached. A positive value scales
     * up. A negative value scales down.
     * 
     */
    @Import(name="scalingAdjustment", required=true)
      private final Output<Integer> scalingAdjustment;

    public Output<Integer> scalingAdjustment() {
        return this.scalingAdjustment;
    }

    public PolicyStepAdjustmentGetArgs(
        @Nullable Output<String> metricIntervalLowerBound,
        @Nullable Output<String> metricIntervalUpperBound,
        Output<Integer> scalingAdjustment) {
        this.metricIntervalLowerBound = metricIntervalLowerBound;
        this.metricIntervalUpperBound = metricIntervalUpperBound;
        this.scalingAdjustment = Objects.requireNonNull(scalingAdjustment, "expected parameter 'scalingAdjustment' to be non-null");
    }

    private PolicyStepAdjustmentGetArgs() {
        this.metricIntervalLowerBound = Codegen.empty();
        this.metricIntervalUpperBound = Codegen.empty();
        this.scalingAdjustment = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyStepAdjustmentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> metricIntervalLowerBound;
        private @Nullable Output<String> metricIntervalUpperBound;
        private Output<Integer> scalingAdjustment;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyStepAdjustmentGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricIntervalLowerBound = defaults.metricIntervalLowerBound;
    	      this.metricIntervalUpperBound = defaults.metricIntervalUpperBound;
    	      this.scalingAdjustment = defaults.scalingAdjustment;
        }

        public Builder metricIntervalLowerBound(@Nullable Output<String> metricIntervalLowerBound) {
            this.metricIntervalLowerBound = metricIntervalLowerBound;
            return this;
        }
        public Builder metricIntervalLowerBound(@Nullable String metricIntervalLowerBound) {
            this.metricIntervalLowerBound = Codegen.ofNullable(metricIntervalLowerBound);
            return this;
        }
        public Builder metricIntervalUpperBound(@Nullable Output<String> metricIntervalUpperBound) {
            this.metricIntervalUpperBound = metricIntervalUpperBound;
            return this;
        }
        public Builder metricIntervalUpperBound(@Nullable String metricIntervalUpperBound) {
            this.metricIntervalUpperBound = Codegen.ofNullable(metricIntervalUpperBound);
            return this;
        }
        public Builder scalingAdjustment(Output<Integer> scalingAdjustment) {
            this.scalingAdjustment = Objects.requireNonNull(scalingAdjustment);
            return this;
        }
        public Builder scalingAdjustment(Integer scalingAdjustment) {
            this.scalingAdjustment = Output.of(Objects.requireNonNull(scalingAdjustment));
            return this;
        }        public PolicyStepAdjustmentGetArgs build() {
            return new PolicyStepAdjustmentGetArgs(metricIntervalLowerBound, metricIntervalUpperBound, scalingAdjustment);
        }
    }
}
