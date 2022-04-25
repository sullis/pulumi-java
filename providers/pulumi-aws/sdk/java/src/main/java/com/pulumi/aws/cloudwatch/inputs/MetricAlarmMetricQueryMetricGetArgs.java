// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetricAlarmMetricQueryMetricGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricAlarmMetricQueryMetricGetArgs Empty = new MetricAlarmMetricQueryMetricGetArgs();

    /**
     * The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    @Import(name="dimensions")
    private @Nullable Output<Map<String,String>> dimensions;

    /**
     * @return The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    public Optional<Output<Map<String,String>>> dimensions() {
        return Optional.ofNullable(this.dimensions);
    }

    /**
     * The name for this metric.
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    @Import(name="metricName", required=true)
    private Output<String> metricName;

    /**
     * @return The name for this metric.
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    public Output<String> metricName() {
        return this.metricName;
    }

    /**
     * The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * The period in seconds over which the specified `stat` is applied.
     * 
     */
    @Import(name="period", required=true)
    private Output<Integer> period;

    /**
     * @return The period in seconds over which the specified `stat` is applied.
     * 
     */
    public Output<Integer> period() {
        return this.period;
    }

    /**
     * The statistic to apply to this metric.
     * See docs for [supported statistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html).
     * 
     */
    @Import(name="stat", required=true)
    private Output<String> stat;

    /**
     * @return The statistic to apply to this metric.
     * See docs for [supported statistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html).
     * 
     */
    public Output<String> stat() {
        return this.stat;
    }

    /**
     * The unit for this metric.
     * 
     */
    @Import(name="unit")
    private @Nullable Output<String> unit;

    /**
     * @return The unit for this metric.
     * 
     */
    public Optional<Output<String>> unit() {
        return Optional.ofNullable(this.unit);
    }

    private MetricAlarmMetricQueryMetricGetArgs() {}

    private MetricAlarmMetricQueryMetricGetArgs(MetricAlarmMetricQueryMetricGetArgs $) {
        this.dimensions = $.dimensions;
        this.metricName = $.metricName;
        this.namespace = $.namespace;
        this.period = $.period;
        this.stat = $.stat;
        this.unit = $.unit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricAlarmMetricQueryMetricGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricAlarmMetricQueryMetricGetArgs $;

        public Builder() {
            $ = new MetricAlarmMetricQueryMetricGetArgs();
        }

        public Builder(MetricAlarmMetricQueryMetricGetArgs defaults) {
            $ = new MetricAlarmMetricQueryMetricGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dimensions The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
         * 
         * @return builder
         * 
         */
        public Builder dimensions(@Nullable Output<Map<String,String>> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        /**
         * @param dimensions The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
         * 
         * @return builder
         * 
         */
        public Builder dimensions(Map<String,String> dimensions) {
            return dimensions(Output.of(dimensions));
        }

        /**
         * @param metricName The name for this metric.
         * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
         * 
         * @return builder
         * 
         */
        public Builder metricName(Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        /**
         * @param metricName The name for this metric.
         * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
         * 
         * @return builder
         * 
         */
        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        /**
         * @param namespace The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
         * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
         * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param period The period in seconds over which the specified `stat` is applied.
         * 
         * @return builder
         * 
         */
        public Builder period(Output<Integer> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period The period in seconds over which the specified `stat` is applied.
         * 
         * @return builder
         * 
         */
        public Builder period(Integer period) {
            return period(Output.of(period));
        }

        /**
         * @param stat The statistic to apply to this metric.
         * See docs for [supported statistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html).
         * 
         * @return builder
         * 
         */
        public Builder stat(Output<String> stat) {
            $.stat = stat;
            return this;
        }

        /**
         * @param stat The statistic to apply to this metric.
         * See docs for [supported statistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html).
         * 
         * @return builder
         * 
         */
        public Builder stat(String stat) {
            return stat(Output.of(stat));
        }

        /**
         * @param unit The unit for this metric.
         * 
         * @return builder
         * 
         */
        public Builder unit(@Nullable Output<String> unit) {
            $.unit = unit;
            return this;
        }

        /**
         * @param unit The unit for this metric.
         * 
         * @return builder
         * 
         */
        public Builder unit(String unit) {
            return unit(Output.of(unit));
        }

        public MetricAlarmMetricQueryMetricGetArgs build() {
            $.metricName = Objects.requireNonNull($.metricName, "expected parameter 'metricName' to be non-null");
            $.period = Objects.requireNonNull($.period, "expected parameter 'period' to be non-null");
            $.stat = Objects.requireNonNull($.stat, "expected parameter 'stat' to be non-null");
            return $;
        }
    }

}
