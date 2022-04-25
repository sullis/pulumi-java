// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appautoscaling.inputs;

import com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationGetArgs;
import com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyTargetTrackingScalingPolicyConfigurationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyTargetTrackingScalingPolicyConfigurationGetArgs Empty = new PolicyTargetTrackingScalingPolicyConfigurationGetArgs();

    /**
     * A custom CloudWatch metric. Documentation can be found  at: [AWS Customized Metric Specification](https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_CustomizedMetricSpecification.html). See supported fields below.
     * 
     */
    @Import(name="customizedMetricSpecification")
    private @Nullable Output<PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationGetArgs> customizedMetricSpecification;

    /**
     * @return A custom CloudWatch metric. Documentation can be found  at: [AWS Customized Metric Specification](https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_CustomizedMetricSpecification.html). See supported fields below.
     * 
     */
    public Optional<Output<PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationGetArgs>> customizedMetricSpecification() {
        return Optional.ofNullable(this.customizedMetricSpecification);
    }

    /**
     * Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled and the target tracking policy won&#39;t remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking policy can remove capacity from the scalable resource. The default value is `false`.
     * 
     */
    @Import(name="disableScaleIn")
    private @Nullable Output<Boolean> disableScaleIn;

    /**
     * @return Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled and the target tracking policy won&#39;t remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking policy can remove capacity from the scalable resource. The default value is `false`.
     * 
     */
    public Optional<Output<Boolean>> disableScaleIn() {
        return Optional.ofNullable(this.disableScaleIn);
    }

    /**
     * A predefined metric. See supported fields below.
     * 
     */
    @Import(name="predefinedMetricSpecification")
    private @Nullable Output<PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationGetArgs> predefinedMetricSpecification;

    /**
     * @return A predefined metric. See supported fields below.
     * 
     */
    public Optional<Output<PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationGetArgs>> predefinedMetricSpecification() {
        return Optional.ofNullable(this.predefinedMetricSpecification);
    }

    /**
     * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start.
     * 
     */
    @Import(name="scaleInCooldown")
    private @Nullable Output<Integer> scaleInCooldown;

    /**
     * @return The amount of time, in seconds, after a scale in activity completes before another scale in activity can start.
     * 
     */
    public Optional<Output<Integer>> scaleInCooldown() {
        return Optional.ofNullable(this.scaleInCooldown);
    }

    /**
     * The amount of time, in seconds, after a scale out activity completes before another scale out activity can start.
     * 
     */
    @Import(name="scaleOutCooldown")
    private @Nullable Output<Integer> scaleOutCooldown;

    /**
     * @return The amount of time, in seconds, after a scale out activity completes before another scale out activity can start.
     * 
     */
    public Optional<Output<Integer>> scaleOutCooldown() {
        return Optional.ofNullable(this.scaleOutCooldown);
    }

    /**
     * The target value for the metric.
     * 
     */
    @Import(name="targetValue", required=true)
    private Output<Double> targetValue;

    /**
     * @return The target value for the metric.
     * 
     */
    public Output<Double> targetValue() {
        return this.targetValue;
    }

    private PolicyTargetTrackingScalingPolicyConfigurationGetArgs() {}

    private PolicyTargetTrackingScalingPolicyConfigurationGetArgs(PolicyTargetTrackingScalingPolicyConfigurationGetArgs $) {
        this.customizedMetricSpecification = $.customizedMetricSpecification;
        this.disableScaleIn = $.disableScaleIn;
        this.predefinedMetricSpecification = $.predefinedMetricSpecification;
        this.scaleInCooldown = $.scaleInCooldown;
        this.scaleOutCooldown = $.scaleOutCooldown;
        this.targetValue = $.targetValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyTargetTrackingScalingPolicyConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyTargetTrackingScalingPolicyConfigurationGetArgs $;

        public Builder() {
            $ = new PolicyTargetTrackingScalingPolicyConfigurationGetArgs();
        }

        public Builder(PolicyTargetTrackingScalingPolicyConfigurationGetArgs defaults) {
            $ = new PolicyTargetTrackingScalingPolicyConfigurationGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customizedMetricSpecification A custom CloudWatch metric. Documentation can be found  at: [AWS Customized Metric Specification](https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_CustomizedMetricSpecification.html). See supported fields below.
         * 
         * @return builder
         * 
         */
        public Builder customizedMetricSpecification(@Nullable Output<PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationGetArgs> customizedMetricSpecification) {
            $.customizedMetricSpecification = customizedMetricSpecification;
            return this;
        }

        /**
         * @param customizedMetricSpecification A custom CloudWatch metric. Documentation can be found  at: [AWS Customized Metric Specification](https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_CustomizedMetricSpecification.html). See supported fields below.
         * 
         * @return builder
         * 
         */
        public Builder customizedMetricSpecification(PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationGetArgs customizedMetricSpecification) {
            return customizedMetricSpecification(Output.of(customizedMetricSpecification));
        }

        /**
         * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled and the target tracking policy won&#39;t remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking policy can remove capacity from the scalable resource. The default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder disableScaleIn(@Nullable Output<Boolean> disableScaleIn) {
            $.disableScaleIn = disableScaleIn;
            return this;
        }

        /**
         * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled and the target tracking policy won&#39;t remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking policy can remove capacity from the scalable resource. The default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder disableScaleIn(Boolean disableScaleIn) {
            return disableScaleIn(Output.of(disableScaleIn));
        }

        /**
         * @param predefinedMetricSpecification A predefined metric. See supported fields below.
         * 
         * @return builder
         * 
         */
        public Builder predefinedMetricSpecification(@Nullable Output<PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationGetArgs> predefinedMetricSpecification) {
            $.predefinedMetricSpecification = predefinedMetricSpecification;
            return this;
        }

        /**
         * @param predefinedMetricSpecification A predefined metric. See supported fields below.
         * 
         * @return builder
         * 
         */
        public Builder predefinedMetricSpecification(PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationGetArgs predefinedMetricSpecification) {
            return predefinedMetricSpecification(Output.of(predefinedMetricSpecification));
        }

        /**
         * @param scaleInCooldown The amount of time, in seconds, after a scale in activity completes before another scale in activity can start.
         * 
         * @return builder
         * 
         */
        public Builder scaleInCooldown(@Nullable Output<Integer> scaleInCooldown) {
            $.scaleInCooldown = scaleInCooldown;
            return this;
        }

        /**
         * @param scaleInCooldown The amount of time, in seconds, after a scale in activity completes before another scale in activity can start.
         * 
         * @return builder
         * 
         */
        public Builder scaleInCooldown(Integer scaleInCooldown) {
            return scaleInCooldown(Output.of(scaleInCooldown));
        }

        /**
         * @param scaleOutCooldown The amount of time, in seconds, after a scale out activity completes before another scale out activity can start.
         * 
         * @return builder
         * 
         */
        public Builder scaleOutCooldown(@Nullable Output<Integer> scaleOutCooldown) {
            $.scaleOutCooldown = scaleOutCooldown;
            return this;
        }

        /**
         * @param scaleOutCooldown The amount of time, in seconds, after a scale out activity completes before another scale out activity can start.
         * 
         * @return builder
         * 
         */
        public Builder scaleOutCooldown(Integer scaleOutCooldown) {
            return scaleOutCooldown(Output.of(scaleOutCooldown));
        }

        /**
         * @param targetValue The target value for the metric.
         * 
         * @return builder
         * 
         */
        public Builder targetValue(Output<Double> targetValue) {
            $.targetValue = targetValue;
            return this;
        }

        /**
         * @param targetValue The target value for the metric.
         * 
         * @return builder
         * 
         */
        public Builder targetValue(Double targetValue) {
            return targetValue(Output.of(targetValue));
        }

        public PolicyTargetTrackingScalingPolicyConfigurationGetArgs build() {
            $.targetValue = Objects.requireNonNull($.targetValue, "expected parameter 'targetValue' to be non-null");
            return $;
        }
    }

}
