// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicRuleErrorActionCloudwatchMetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final TopicRuleErrorActionCloudwatchMetricArgs Empty = new TopicRuleErrorActionCloudwatchMetricArgs();

    /**
     * The CloudWatch metric name.
     * 
     */
    @Import(name="metricName", required=true)
    private Output<String> metricName;

    /**
     * @return The CloudWatch metric name.
     * 
     */
    public Output<String> metricName() {
        return this.metricName;
    }

    /**
     * The CloudWatch metric namespace name.
     * 
     */
    @Import(name="metricNamespace", required=true)
    private Output<String> metricNamespace;

    /**
     * @return The CloudWatch metric namespace name.
     * 
     */
    public Output<String> metricNamespace() {
        return this.metricNamespace;
    }

    /**
     * An optional Unix timestamp (http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp).
     * 
     */
    @Import(name="metricTimestamp")
    private @Nullable Output<String> metricTimestamp;

    /**
     * @return An optional Unix timestamp (http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp).
     * 
     */
    public Optional<Output<String>> metricTimestamp() {
        return Optional.ofNullable(this.metricTimestamp);
    }

    /**
     * The metric unit (supported units can be found here: http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit)
     * 
     */
    @Import(name="metricUnit", required=true)
    private Output<String> metricUnit;

    /**
     * @return The metric unit (supported units can be found here: http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit)
     * 
     */
    public Output<String> metricUnit() {
        return this.metricUnit;
    }

    /**
     * The CloudWatch metric value.
     * 
     */
    @Import(name="metricValue", required=true)
    private Output<String> metricValue;

    /**
     * @return The CloudWatch metric value.
     * 
     */
    public Output<String> metricValue() {
        return this.metricValue;
    }

    /**
     * The IAM role ARN that allows access to the CloudWatch metric.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    /**
     * @return The IAM role ARN that allows access to the CloudWatch metric.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    private TopicRuleErrorActionCloudwatchMetricArgs() {}

    private TopicRuleErrorActionCloudwatchMetricArgs(TopicRuleErrorActionCloudwatchMetricArgs $) {
        this.metricName = $.metricName;
        this.metricNamespace = $.metricNamespace;
        this.metricTimestamp = $.metricTimestamp;
        this.metricUnit = $.metricUnit;
        this.metricValue = $.metricValue;
        this.roleArn = $.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicRuleErrorActionCloudwatchMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicRuleErrorActionCloudwatchMetricArgs $;

        public Builder() {
            $ = new TopicRuleErrorActionCloudwatchMetricArgs();
        }

        public Builder(TopicRuleErrorActionCloudwatchMetricArgs defaults) {
            $ = new TopicRuleErrorActionCloudwatchMetricArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metricName The CloudWatch metric name.
         * 
         * @return builder
         * 
         */
        public Builder metricName(Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        /**
         * @param metricName The CloudWatch metric name.
         * 
         * @return builder
         * 
         */
        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        /**
         * @param metricNamespace The CloudWatch metric namespace name.
         * 
         * @return builder
         * 
         */
        public Builder metricNamespace(Output<String> metricNamespace) {
            $.metricNamespace = metricNamespace;
            return this;
        }

        /**
         * @param metricNamespace The CloudWatch metric namespace name.
         * 
         * @return builder
         * 
         */
        public Builder metricNamespace(String metricNamespace) {
            return metricNamespace(Output.of(metricNamespace));
        }

        /**
         * @param metricTimestamp An optional Unix timestamp (http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp).
         * 
         * @return builder
         * 
         */
        public Builder metricTimestamp(@Nullable Output<String> metricTimestamp) {
            $.metricTimestamp = metricTimestamp;
            return this;
        }

        /**
         * @param metricTimestamp An optional Unix timestamp (http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp).
         * 
         * @return builder
         * 
         */
        public Builder metricTimestamp(String metricTimestamp) {
            return metricTimestamp(Output.of(metricTimestamp));
        }

        /**
         * @param metricUnit The metric unit (supported units can be found here: http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit)
         * 
         * @return builder
         * 
         */
        public Builder metricUnit(Output<String> metricUnit) {
            $.metricUnit = metricUnit;
            return this;
        }

        /**
         * @param metricUnit The metric unit (supported units can be found here: http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit)
         * 
         * @return builder
         * 
         */
        public Builder metricUnit(String metricUnit) {
            return metricUnit(Output.of(metricUnit));
        }

        /**
         * @param metricValue The CloudWatch metric value.
         * 
         * @return builder
         * 
         */
        public Builder metricValue(Output<String> metricValue) {
            $.metricValue = metricValue;
            return this;
        }

        /**
         * @param metricValue The CloudWatch metric value.
         * 
         * @return builder
         * 
         */
        public Builder metricValue(String metricValue) {
            return metricValue(Output.of(metricValue));
        }

        /**
         * @param roleArn The IAM role ARN that allows access to the CloudWatch metric.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The IAM role ARN that allows access to the CloudWatch metric.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public TopicRuleErrorActionCloudwatchMetricArgs build() {
            $.metricName = Objects.requireNonNull($.metricName, "expected parameter 'metricName' to be non-null");
            $.metricNamespace = Objects.requireNonNull($.metricNamespace, "expected parameter 'metricNamespace' to be non-null");
            $.metricUnit = Objects.requireNonNull($.metricUnit, "expected parameter 'metricUnit' to be non-null");
            $.metricValue = Objects.requireNonNull($.metricValue, "expected parameter 'metricValue' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}
