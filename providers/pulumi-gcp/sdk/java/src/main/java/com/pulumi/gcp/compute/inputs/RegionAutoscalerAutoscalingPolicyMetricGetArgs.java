// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionAutoscalerAutoscalingPolicyMetricGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionAutoscalerAutoscalingPolicyMetricGetArgs Empty = new RegionAutoscalerAutoscalingPolicyMetricGetArgs();

    /**
     * A filter string to be used as the filter string for
     * a Stackdriver Monitoring TimeSeries.list API call.
     * This filter is used to select a specific TimeSeries for
     * the purpose of autoscaling and to determine whether the metric
     * is exporting per-instance or per-group data.
     * You can only use the AND operator for joining selectors.
     * You can only use direct equality comparison operator (=) without
     * any functions for each selector.
     * You can specify the metric in both the filter string and in the
     * metric field. However, if specified in both places, the metric must
     * be identical.
     * The monitored resource type determines what kind of values are
     * expected for the metric. If it is a gce_instance, the autoscaler
     * expects the metric to include a separate TimeSeries for each
     * instance in a group. In such a case, you cannot filter on resource
     * labels.
     * If the resource type is any other value, the autoscaler expects
     * this metric to contain values that apply to the entire autoscaled
     * instance group and resource label filtering can be performed to
     * point autoscaler at the correct TimeSeries to scale upon.
     * This is called a per-group metric for the purpose of autoscaling.
     * If not specified, the type defaults to gce_instance.
     * You should provide a filter that is selective enough to pick just
     * one TimeSeries for the autoscaled group or for each of the instances
     * (if you are using gce_instance resource type). If multiple
     * TimeSeries are returned upon the query execution, the autoscaler
     * will sum their respective values to obtain its scaling value.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<String> filter;

    /**
     * @return A filter string to be used as the filter string for
     * a Stackdriver Monitoring TimeSeries.list API call.
     * This filter is used to select a specific TimeSeries for
     * the purpose of autoscaling and to determine whether the metric
     * is exporting per-instance or per-group data.
     * You can only use the AND operator for joining selectors.
     * You can only use direct equality comparison operator (=) without
     * any functions for each selector.
     * You can specify the metric in both the filter string and in the
     * metric field. However, if specified in both places, the metric must
     * be identical.
     * The monitored resource type determines what kind of values are
     * expected for the metric. If it is a gce_instance, the autoscaler
     * expects the metric to include a separate TimeSeries for each
     * instance in a group. In such a case, you cannot filter on resource
     * labels.
     * If the resource type is any other value, the autoscaler expects
     * this metric to contain values that apply to the entire autoscaled
     * instance group and resource label filtering can be performed to
     * point autoscaler at the correct TimeSeries to scale upon.
     * This is called a per-group metric for the purpose of autoscaling.
     * If not specified, the type defaults to gce_instance.
     * You should provide a filter that is selective enough to pick just
     * one TimeSeries for the autoscaled group or for each of the instances
     * (if you are using gce_instance resource type). If multiple
     * TimeSeries are returned upon the query execution, the autoscaler
     * will sum their respective values to obtain its scaling value.
     * 
     */
    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * If scaling is based on a per-group metric value that represents the
     * total amount of work to be done or resource usage, set this value to
     * an amount assigned for a single instance of the scaled group.
     * The autoscaler will keep the number of instances proportional to the
     * value of this metric, the metric itself should not change value due
     * to group resizing.
     * For example, a good metric to use with the target is
     * `pubsub.googleapis.com/subscription/num_undelivered_messages`
     * or a custom metric exporting the total number of requests coming to
     * your instances.
     * A bad example would be a metric exporting an average or median
     * latency, since this value can&#39;t include a chunk assignable to a
     * single instance, it could be better used with utilization_target
     * instead.
     * 
     */
    @Import(name="singleInstanceAssignment")
    private @Nullable Output<Double> singleInstanceAssignment;

    /**
     * @return If scaling is based on a per-group metric value that represents the
     * total amount of work to be done or resource usage, set this value to
     * an amount assigned for a single instance of the scaled group.
     * The autoscaler will keep the number of instances proportional to the
     * value of this metric, the metric itself should not change value due
     * to group resizing.
     * For example, a good metric to use with the target is
     * `pubsub.googleapis.com/subscription/num_undelivered_messages`
     * or a custom metric exporting the total number of requests coming to
     * your instances.
     * A bad example would be a metric exporting an average or median
     * latency, since this value can&#39;t include a chunk assignable to a
     * single instance, it could be better used with utilization_target
     * instead.
     * 
     */
    public Optional<Output<Double>> singleInstanceAssignment() {
        return Optional.ofNullable(this.singleInstanceAssignment);
    }

    /**
     * Fraction of backend capacity utilization (set in HTTP(s) load
     * balancing configuration) that autoscaler should maintain. Must
     * be a positive float value. If not defined, the default is 0.8.
     * 
     */
    @Import(name="target")
    private @Nullable Output<Double> target;

    /**
     * @return Fraction of backend capacity utilization (set in HTTP(s) load
     * balancing configuration) that autoscaler should maintain. Must
     * be a positive float value. If not defined, the default is 0.8.
     * 
     */
    public Optional<Output<Double>> target() {
        return Optional.ofNullable(this.target);
    }

    /**
     * Defines how target utilization value is expressed for a
     * Stackdriver Monitoring metric.
     * Possible values are `GAUGE`, `DELTA_PER_SECOND`, and `DELTA_PER_MINUTE`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Defines how target utilization value is expressed for a
     * Stackdriver Monitoring metric.
     * Possible values are `GAUGE`, `DELTA_PER_SECOND`, and `DELTA_PER_MINUTE`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private RegionAutoscalerAutoscalingPolicyMetricGetArgs() {}

    private RegionAutoscalerAutoscalingPolicyMetricGetArgs(RegionAutoscalerAutoscalingPolicyMetricGetArgs $) {
        this.filter = $.filter;
        this.name = $.name;
        this.singleInstanceAssignment = $.singleInstanceAssignment;
        this.target = $.target;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionAutoscalerAutoscalingPolicyMetricGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionAutoscalerAutoscalingPolicyMetricGetArgs $;

        public Builder() {
            $ = new RegionAutoscalerAutoscalingPolicyMetricGetArgs();
        }

        public Builder(RegionAutoscalerAutoscalingPolicyMetricGetArgs defaults) {
            $ = new RegionAutoscalerAutoscalingPolicyMetricGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filter A filter string to be used as the filter string for
         * a Stackdriver Monitoring TimeSeries.list API call.
         * This filter is used to select a specific TimeSeries for
         * the purpose of autoscaling and to determine whether the metric
         * is exporting per-instance or per-group data.
         * You can only use the AND operator for joining selectors.
         * You can only use direct equality comparison operator (=) without
         * any functions for each selector.
         * You can specify the metric in both the filter string and in the
         * metric field. However, if specified in both places, the metric must
         * be identical.
         * The monitored resource type determines what kind of values are
         * expected for the metric. If it is a gce_instance, the autoscaler
         * expects the metric to include a separate TimeSeries for each
         * instance in a group. In such a case, you cannot filter on resource
         * labels.
         * If the resource type is any other value, the autoscaler expects
         * this metric to contain values that apply to the entire autoscaled
         * instance group and resource label filtering can be performed to
         * point autoscaler at the correct TimeSeries to scale upon.
         * This is called a per-group metric for the purpose of autoscaling.
         * If not specified, the type defaults to gce_instance.
         * You should provide a filter that is selective enough to pick just
         * one TimeSeries for the autoscaled group or for each of the instances
         * (if you are using gce_instance resource type). If multiple
         * TimeSeries are returned upon the query execution, the autoscaler
         * will sum their respective values to obtain its scaling value.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter A filter string to be used as the filter string for
         * a Stackdriver Monitoring TimeSeries.list API call.
         * This filter is used to select a specific TimeSeries for
         * the purpose of autoscaling and to determine whether the metric
         * is exporting per-instance or per-group data.
         * You can only use the AND operator for joining selectors.
         * You can only use direct equality comparison operator (=) without
         * any functions for each selector.
         * You can specify the metric in both the filter string and in the
         * metric field. However, if specified in both places, the metric must
         * be identical.
         * The monitored resource type determines what kind of values are
         * expected for the metric. If it is a gce_instance, the autoscaler
         * expects the metric to include a separate TimeSeries for each
         * instance in a group. In such a case, you cannot filter on resource
         * labels.
         * If the resource type is any other value, the autoscaler expects
         * this metric to contain values that apply to the entire autoscaled
         * instance group and resource label filtering can be performed to
         * point autoscaler at the correct TimeSeries to scale upon.
         * This is called a per-group metric for the purpose of autoscaling.
         * If not specified, the type defaults to gce_instance.
         * You should provide a filter that is selective enough to pick just
         * one TimeSeries for the autoscaled group or for each of the instances
         * (if you are using gce_instance resource type). If multiple
         * TimeSeries are returned upon the query execution, the autoscaler
         * will sum their respective values to obtain its scaling value.
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param name The identifier for this object. Format specified above.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The identifier for this object. Format specified above.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param singleInstanceAssignment If scaling is based on a per-group metric value that represents the
         * total amount of work to be done or resource usage, set this value to
         * an amount assigned for a single instance of the scaled group.
         * The autoscaler will keep the number of instances proportional to the
         * value of this metric, the metric itself should not change value due
         * to group resizing.
         * For example, a good metric to use with the target is
         * `pubsub.googleapis.com/subscription/num_undelivered_messages`
         * or a custom metric exporting the total number of requests coming to
         * your instances.
         * A bad example would be a metric exporting an average or median
         * latency, since this value can&#39;t include a chunk assignable to a
         * single instance, it could be better used with utilization_target
         * instead.
         * 
         * @return builder
         * 
         */
        public Builder singleInstanceAssignment(@Nullable Output<Double> singleInstanceAssignment) {
            $.singleInstanceAssignment = singleInstanceAssignment;
            return this;
        }

        /**
         * @param singleInstanceAssignment If scaling is based on a per-group metric value that represents the
         * total amount of work to be done or resource usage, set this value to
         * an amount assigned for a single instance of the scaled group.
         * The autoscaler will keep the number of instances proportional to the
         * value of this metric, the metric itself should not change value due
         * to group resizing.
         * For example, a good metric to use with the target is
         * `pubsub.googleapis.com/subscription/num_undelivered_messages`
         * or a custom metric exporting the total number of requests coming to
         * your instances.
         * A bad example would be a metric exporting an average or median
         * latency, since this value can&#39;t include a chunk assignable to a
         * single instance, it could be better used with utilization_target
         * instead.
         * 
         * @return builder
         * 
         */
        public Builder singleInstanceAssignment(Double singleInstanceAssignment) {
            return singleInstanceAssignment(Output.of(singleInstanceAssignment));
        }

        /**
         * @param target Fraction of backend capacity utilization (set in HTTP(s) load
         * balancing configuration) that autoscaler should maintain. Must
         * be a positive float value. If not defined, the default is 0.8.
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable Output<Double> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target Fraction of backend capacity utilization (set in HTTP(s) load
         * balancing configuration) that autoscaler should maintain. Must
         * be a positive float value. If not defined, the default is 0.8.
         * 
         * @return builder
         * 
         */
        public Builder target(Double target) {
            return target(Output.of(target));
        }

        /**
         * @param type Defines how target utilization value is expressed for a
         * Stackdriver Monitoring metric.
         * Possible values are `GAUGE`, `DELTA_PER_SECOND`, and `DELTA_PER_MINUTE`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Defines how target utilization value is expressed for a
         * Stackdriver Monitoring metric.
         * Possible values are `GAUGE`, `DELTA_PER_SECOND`, and `DELTA_PER_MINUTE`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public RegionAutoscalerAutoscalingPolicyMetricGetArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
