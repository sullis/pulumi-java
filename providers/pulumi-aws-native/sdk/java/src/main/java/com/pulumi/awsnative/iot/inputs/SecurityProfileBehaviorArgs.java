// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.awsnative.iot.inputs.SecurityProfileBehaviorCriteriaArgs;
import com.pulumi.awsnative.iot.inputs.SecurityProfileMetricDimensionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A security profile behavior.
 * 
 */
public final class SecurityProfileBehaviorArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityProfileBehaviorArgs Empty = new SecurityProfileBehaviorArgs();

    @Import(name="criteria")
    private @Nullable Output<SecurityProfileBehaviorCriteriaArgs> criteria;

    public Optional<Output<SecurityProfileBehaviorCriteriaArgs>> criteria() {
        return Optional.ofNullable(this.criteria);
    }

    /**
     * What is measured by the behavior.
     * 
     */
    @Import(name="metric")
    private @Nullable Output<String> metric;

    /**
     * @return What is measured by the behavior.
     * 
     */
    public Optional<Output<String>> metric() {
        return Optional.ofNullable(this.metric);
    }

    @Import(name="metricDimension")
    private @Nullable Output<SecurityProfileMetricDimensionArgs> metricDimension;

    public Optional<Output<SecurityProfileMetricDimensionArgs>> metricDimension() {
        return Optional.ofNullable(this.metricDimension);
    }

    /**
     * The name for the behavior.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name for the behavior.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Manage Detect alarm SNS notifications by setting behavior notification to on or suppressed. Detect will continue to performing device behavior evaluations. However, suppressed alarms wouldn&#39;t be forwarded for SNS notification.
     * 
     */
    @Import(name="suppressAlerts")
    private @Nullable Output<Boolean> suppressAlerts;

    /**
     * @return Manage Detect alarm SNS notifications by setting behavior notification to on or suppressed. Detect will continue to performing device behavior evaluations. However, suppressed alarms wouldn&#39;t be forwarded for SNS notification.
     * 
     */
    public Optional<Output<Boolean>> suppressAlerts() {
        return Optional.ofNullable(this.suppressAlerts);
    }

    private SecurityProfileBehaviorArgs() {}

    private SecurityProfileBehaviorArgs(SecurityProfileBehaviorArgs $) {
        this.criteria = $.criteria;
        this.metric = $.metric;
        this.metricDimension = $.metricDimension;
        this.name = $.name;
        this.suppressAlerts = $.suppressAlerts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityProfileBehaviorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityProfileBehaviorArgs $;

        public Builder() {
            $ = new SecurityProfileBehaviorArgs();
        }

        public Builder(SecurityProfileBehaviorArgs defaults) {
            $ = new SecurityProfileBehaviorArgs(Objects.requireNonNull(defaults));
        }

        public Builder criteria(@Nullable Output<SecurityProfileBehaviorCriteriaArgs> criteria) {
            $.criteria = criteria;
            return this;
        }

        public Builder criteria(SecurityProfileBehaviorCriteriaArgs criteria) {
            return criteria(Output.of(criteria));
        }

        /**
         * @param metric What is measured by the behavior.
         * 
         * @return builder
         * 
         */
        public Builder metric(@Nullable Output<String> metric) {
            $.metric = metric;
            return this;
        }

        /**
         * @param metric What is measured by the behavior.
         * 
         * @return builder
         * 
         */
        public Builder metric(String metric) {
            return metric(Output.of(metric));
        }

        public Builder metricDimension(@Nullable Output<SecurityProfileMetricDimensionArgs> metricDimension) {
            $.metricDimension = metricDimension;
            return this;
        }

        public Builder metricDimension(SecurityProfileMetricDimensionArgs metricDimension) {
            return metricDimension(Output.of(metricDimension));
        }

        /**
         * @param name The name for the behavior.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for the behavior.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param suppressAlerts Manage Detect alarm SNS notifications by setting behavior notification to on or suppressed. Detect will continue to performing device behavior evaluations. However, suppressed alarms wouldn&#39;t be forwarded for SNS notification.
         * 
         * @return builder
         * 
         */
        public Builder suppressAlerts(@Nullable Output<Boolean> suppressAlerts) {
            $.suppressAlerts = suppressAlerts;
            return this;
        }

        /**
         * @param suppressAlerts Manage Detect alarm SNS notifications by setting behavior notification to on or suppressed. Detect will continue to performing device behavior evaluations. However, suppressed alarms wouldn&#39;t be forwarded for SNS notification.
         * 
         * @return builder
         * 
         */
        public Builder suppressAlerts(Boolean suppressAlerts) {
            return suppressAlerts(Output.of(suppressAlerts));
        }

        public SecurityProfileBehaviorArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
