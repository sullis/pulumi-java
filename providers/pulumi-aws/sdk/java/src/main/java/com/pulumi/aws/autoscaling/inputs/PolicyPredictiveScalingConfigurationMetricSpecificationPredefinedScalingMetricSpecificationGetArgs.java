// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationGetArgs Empty = new PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationGetArgs();

    /**
     * Describes a scaling metric for a predictive scaling policy. Valid values are `ASGAverageCPUUtilization`, `ASGAverageNetworkIn`, `ASGAverageNetworkOut`, or `ALBRequestCountPerTarget`.
     * 
     */
    @Import(name="predefinedMetricType", required=true)
    private Output<String> predefinedMetricType;

    /**
     * @return Describes a scaling metric for a predictive scaling policy. Valid values are `ASGAverageCPUUtilization`, `ASGAverageNetworkIn`, `ASGAverageNetworkOut`, or `ALBRequestCountPerTarget`.
     * 
     */
    public Output<String> predefinedMetricType() {
        return this.predefinedMetricType;
    }

    /**
     * A label that uniquely identifies a specific Application Load Balancer target group from which to determine the request count served by your Auto Scaling group.
     * 
     */
    @Import(name="resourceLabel", required=true)
    private Output<String> resourceLabel;

    /**
     * @return A label that uniquely identifies a specific Application Load Balancer target group from which to determine the request count served by your Auto Scaling group.
     * 
     */
    public Output<String> resourceLabel() {
        return this.resourceLabel;
    }

    private PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationGetArgs() {}

    private PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationGetArgs(PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationGetArgs $) {
        this.predefinedMetricType = $.predefinedMetricType;
        this.resourceLabel = $.resourceLabel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationGetArgs $;

        public Builder() {
            $ = new PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationGetArgs();
        }

        public Builder(PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationGetArgs defaults) {
            $ = new PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param predefinedMetricType Describes a scaling metric for a predictive scaling policy. Valid values are `ASGAverageCPUUtilization`, `ASGAverageNetworkIn`, `ASGAverageNetworkOut`, or `ALBRequestCountPerTarget`.
         * 
         * @return builder
         * 
         */
        public Builder predefinedMetricType(Output<String> predefinedMetricType) {
            $.predefinedMetricType = predefinedMetricType;
            return this;
        }

        /**
         * @param predefinedMetricType Describes a scaling metric for a predictive scaling policy. Valid values are `ASGAverageCPUUtilization`, `ASGAverageNetworkIn`, `ASGAverageNetworkOut`, or `ALBRequestCountPerTarget`.
         * 
         * @return builder
         * 
         */
        public Builder predefinedMetricType(String predefinedMetricType) {
            return predefinedMetricType(Output.of(predefinedMetricType));
        }

        /**
         * @param resourceLabel A label that uniquely identifies a specific Application Load Balancer target group from which to determine the request count served by your Auto Scaling group.
         * 
         * @return builder
         * 
         */
        public Builder resourceLabel(Output<String> resourceLabel) {
            $.resourceLabel = resourceLabel;
            return this;
        }

        /**
         * @param resourceLabel A label that uniquely identifies a specific Application Load Balancer target group from which to determine the request count served by your Auto Scaling group.
         * 
         * @return builder
         * 
         */
        public Builder resourceLabel(String resourceLabel) {
            return resourceLabel(Output.of(resourceLabel));
        }

        public PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationGetArgs build() {
            $.predefinedMetricType = Objects.requireNonNull($.predefinedMetricType, "expected parameter 'predefinedMetricType' to be non-null");
            $.resourceLabel = Objects.requireNonNull($.resourceLabel, "expected parameter 'resourceLabel' to be non-null");
            return $;
        }
    }

}
