// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appautoscaling.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs Empty = new PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs();

    /**
     * The metric type.
     * 
     */
    @Import(name="predefinedMetricType", required=true)
    private Output<String> predefinedMetricType;

    /**
     * @return The metric type.
     * 
     */
    public Output<String> predefinedMetricType() {
        return this.predefinedMetricType;
    }

    /**
     * Reserved for future use. Must be less than or equal to 1023 characters in length.
     * 
     */
    @Import(name="resourceLabel")
    private @Nullable Output<String> resourceLabel;

    /**
     * @return Reserved for future use. Must be less than or equal to 1023 characters in length.
     * 
     */
    public Optional<Output<String>> resourceLabel() {
        return Optional.ofNullable(this.resourceLabel);
    }

    private PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs() {}

    private PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs(PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs $) {
        this.predefinedMetricType = $.predefinedMetricType;
        this.resourceLabel = $.resourceLabel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs $;

        public Builder() {
            $ = new PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs();
        }

        public Builder(PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs defaults) {
            $ = new PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param predefinedMetricType The metric type.
         * 
         * @return builder
         * 
         */
        public Builder predefinedMetricType(Output<String> predefinedMetricType) {
            $.predefinedMetricType = predefinedMetricType;
            return this;
        }

        /**
         * @param predefinedMetricType The metric type.
         * 
         * @return builder
         * 
         */
        public Builder predefinedMetricType(String predefinedMetricType) {
            return predefinedMetricType(Output.of(predefinedMetricType));
        }

        /**
         * @param resourceLabel Reserved for future use. Must be less than or equal to 1023 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder resourceLabel(@Nullable Output<String> resourceLabel) {
            $.resourceLabel = resourceLabel;
            return this;
        }

        /**
         * @param resourceLabel Reserved for future use. Must be less than or equal to 1023 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder resourceLabel(String resourceLabel) {
            return resourceLabel(Output.of(resourceLabel));
        }

        public PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs build() {
            $.predefinedMetricType = Objects.requireNonNull($.predefinedMetricType, "expected parameter 'predefinedMetricType' to be non-null");
            return $;
        }
    }

}
