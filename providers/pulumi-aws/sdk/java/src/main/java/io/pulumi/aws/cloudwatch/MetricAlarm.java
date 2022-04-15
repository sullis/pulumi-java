// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudwatch.MetricAlarmArgs;
import io.pulumi.aws.cloudwatch.inputs.MetricAlarmState;
import io.pulumi.aws.cloudwatch.outputs.MetricAlarmMetricQuery;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a CloudWatch Metric Alarm resource.
 * 
 * ## Example Usage
 * ## Example in Conjunction with Scaling Policies
 * 
 * ## Example with an Expression
 * 
 * ## Example of monitoring Healthy Hosts on NLB using Target Group and NLB
 * 
 * > **NOTE:**  You cannot create a metric alarm consisting of both `statistic` and `extended_statistic` parameters.
 * You must choose one or the other
 * 
 * ## Import
 * 
 * CloudWatch Metric Alarm can be imported using the `alarm_name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cloudwatch/metricAlarm:MetricAlarm test alarm-12345
 * ```
 * 
 */
@ResourceType(type="aws:cloudwatch/metricAlarm:MetricAlarm")
public class MetricAlarm extends io.pulumi.resources.CustomResource {
    /**
     * Indicates whether or not actions should be executed during any changes to the alarm's state. Defaults to `true`.
     * 
     */
    @Export(name="actionsEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> actionsEnabled;

    /**
     * @return Indicates whether or not actions should be executed during any changes to the alarm's state. Defaults to `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> actionsEnabled() {
        return this.actionsEnabled;
    }
    /**
     * The list of actions to execute when this alarm transitions into an ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
     */
    @Export(name="alarmActions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> alarmActions;

    /**
     * @return The list of actions to execute when this alarm transitions into an ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
     */
    public Output</* @Nullable */ List<String>> alarmActions() {
        return this.alarmActions;
    }
    /**
     * The description for the alarm.
     * 
     */
    @Export(name="alarmDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> alarmDescription;

    /**
     * @return The description for the alarm.
     * 
     */
    public Output</* @Nullable */ String> alarmDescription() {
        return this.alarmDescription;
    }
    /**
     * The ARN of the CloudWatch Metric Alarm.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the CloudWatch Metric Alarm.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Either of the following is supported: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanThreshold`, `LessThanOrEqualToThreshold`. Additionally, the values  `LessThanLowerOrGreaterThanUpperThreshold`, `LessThanLowerThreshold`, and `GreaterThanUpperThreshold` are used only for alarms based on anomaly detection models.
     * 
     */
    @Export(name="comparisonOperator", type=String.class, parameters={})
    private Output<String> comparisonOperator;

    /**
     * @return The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Either of the following is supported: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanThreshold`, `LessThanOrEqualToThreshold`. Additionally, the values  `LessThanLowerOrGreaterThanUpperThreshold`, `LessThanLowerThreshold`, and `GreaterThanUpperThreshold` are used only for alarms based on anomaly detection models.
     * 
     */
    public Output<String> comparisonOperator() {
        return this.comparisonOperator;
    }
    /**
     * The number of datapoints that must be breaching to trigger the alarm.
     * 
     */
    @Export(name="datapointsToAlarm", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> datapointsToAlarm;

    /**
     * @return The number of datapoints that must be breaching to trigger the alarm.
     * 
     */
    public Output</* @Nullable */ Integer> datapointsToAlarm() {
        return this.datapointsToAlarm;
    }
    /**
     * The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    @Export(name="dimensions", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> dimensions;

    /**
     * @return The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    public Output</* @Nullable */ Map<String,String>> dimensions() {
        return this.dimensions;
    }
    /**
     * Used only for alarms
     * based on percentiles. If you specify `ignore`, the alarm state will not
     * change during periods with too few data points to be statistically significant.
     * If you specify `evaluate` or omit this parameter, the alarm will always be
     * evaluated and possibly change state no matter how many data points are available.
     * The following values are supported: `ignore`, and `evaluate`.
     * 
     */
    @Export(name="evaluateLowSampleCountPercentiles", type=String.class, parameters={})
    private Output<String> evaluateLowSampleCountPercentiles;

    /**
     * @return Used only for alarms
     * based on percentiles. If you specify `ignore`, the alarm state will not
     * change during periods with too few data points to be statistically significant.
     * If you specify `evaluate` or omit this parameter, the alarm will always be
     * evaluated and possibly change state no matter how many data points are available.
     * The following values are supported: `ignore`, and `evaluate`.
     * 
     */
    public Output<String> evaluateLowSampleCountPercentiles() {
        return this.evaluateLowSampleCountPercentiles;
    }
    /**
     * The number of periods over which data is compared to the specified threshold.
     * 
     */
    @Export(name="evaluationPeriods", type=Integer.class, parameters={})
    private Output<Integer> evaluationPeriods;

    /**
     * @return The number of periods over which data is compared to the specified threshold.
     * 
     */
    public Output<Integer> evaluationPeriods() {
        return this.evaluationPeriods;
    }
    /**
     * The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
     * 
     */
    @Export(name="extendedStatistic", type=String.class, parameters={})
    private Output</* @Nullable */ String> extendedStatistic;

    /**
     * @return The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
     * 
     */
    public Output</* @Nullable */ String> extendedStatistic() {
        return this.extendedStatistic;
    }
    /**
     * The list of actions to execute when this alarm transitions into an INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
     */
    @Export(name="insufficientDataActions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> insufficientDataActions;

    /**
     * @return The list of actions to execute when this alarm transitions into an INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
     */
    public Output</* @Nullable */ List<String>> insufficientDataActions() {
        return this.insufficientDataActions;
    }
    /**
     * The name for this metric.
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    @Export(name="metricName", type=String.class, parameters={})
    private Output</* @Nullable */ String> metricName;

    /**
     * @return The name for this metric.
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    public Output</* @Nullable */ String> metricName() {
        return this.metricName;
    }
    /**
     * Enables you to create an alarm based on a metric math expression. You may specify at most 20.
     * 
     */
    @Export(name="metricQueries", type=List.class, parameters={MetricAlarmMetricQuery.class})
    private Output</* @Nullable */ List<MetricAlarmMetricQuery>> metricQueries;

    /**
     * @return Enables you to create an alarm based on a metric math expression. You may specify at most 20.
     * 
     */
    public Output</* @Nullable */ List<MetricAlarmMetricQuery>> metricQueries() {
        return this.metricQueries;
    }
    /**
     * The descriptive name for the alarm. This name must be unique within the user's AWS account
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The descriptive name for the alarm. This name must be unique within the user's AWS account
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    @Export(name="namespace", type=String.class, parameters={})
    private Output</* @Nullable */ String> namespace;

    /**
     * @return The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    public Output</* @Nullable */ String> namespace() {
        return this.namespace;
    }
    /**
     * The list of actions to execute when this alarm transitions into an OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
     */
    @Export(name="okActions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> okActions;

    /**
     * @return The list of actions to execute when this alarm transitions into an OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
     */
    public Output</* @Nullable */ List<String>> okActions() {
        return this.okActions;
    }
    /**
     * The period in seconds over which the specified `stat` is applied.
     * 
     */
    @Export(name="period", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> period;

    /**
     * @return The period in seconds over which the specified `stat` is applied.
     * 
     */
    public Output</* @Nullable */ Integer> period() {
        return this.period;
    }
    /**
     * The statistic to apply to the alarm's associated metric.
     * Either of the following is supported: `SampleCount`, `Average`, `Sum`, `Minimum`, `Maximum`
     * 
     */
    @Export(name="statistic", type=String.class, parameters={})
    private Output</* @Nullable */ String> statistic;

    /**
     * @return The statistic to apply to the alarm's associated metric.
     * Either of the following is supported: `SampleCount`, `Average`, `Sum`, `Minimum`, `Maximum`
     * 
     */
    public Output</* @Nullable */ String> statistic() {
        return this.statistic;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The value against which the specified statistic is compared. This parameter is required for alarms based on static thresholds, but should not be used for alarms based on anomaly detection models.
     * 
     */
    @Export(name="threshold", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> threshold;

    /**
     * @return The value against which the specified statistic is compared. This parameter is required for alarms based on static thresholds, but should not be used for alarms based on anomaly detection models.
     * 
     */
    public Output</* @Nullable */ Double> threshold() {
        return this.threshold;
    }
    /**
     * If this is an alarm based on an anomaly detection model, make this value match the ID of the ANOMALY_DETECTION_BAND function.
     * 
     */
    @Export(name="thresholdMetricId", type=String.class, parameters={})
    private Output</* @Nullable */ String> thresholdMetricId;

    /**
     * @return If this is an alarm based on an anomaly detection model, make this value match the ID of the ANOMALY_DETECTION_BAND function.
     * 
     */
    public Output</* @Nullable */ String> thresholdMetricId() {
        return this.thresholdMetricId;
    }
    /**
     * Sets how this alarm is to handle missing data points. The following values are supported: `missing`, `ignore`, `breaching` and `notBreaching`. Defaults to `missing`.
     * 
     */
    @Export(name="treatMissingData", type=String.class, parameters={})
    private Output</* @Nullable */ String> treatMissingData;

    /**
     * @return Sets how this alarm is to handle missing data points. The following values are supported: `missing`, `ignore`, `breaching` and `notBreaching`. Defaults to `missing`.
     * 
     */
    public Output</* @Nullable */ String> treatMissingData() {
        return this.treatMissingData;
    }
    /**
     * The unit for this metric.
     * 
     */
    @Export(name="unit", type=String.class, parameters={})
    private Output</* @Nullable */ String> unit;

    /**
     * @return The unit for this metric.
     * 
     */
    public Output</* @Nullable */ String> unit() {
        return this.unit;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MetricAlarm(String name) {
        this(name, MetricAlarmArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MetricAlarm(String name, MetricAlarmArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MetricAlarm(String name, MetricAlarmArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/metricAlarm:MetricAlarm", name, args == null ? MetricAlarmArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MetricAlarm(String name, Output<String> id, @Nullable MetricAlarmState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/metricAlarm:MetricAlarm", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static MetricAlarm get(String name, Output<String> id, @Nullable MetricAlarmState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MetricAlarm(name, id, state, options);
    }
}
