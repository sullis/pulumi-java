// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TopicRuleCloudwatchMetric {
    /**
     * @return The CloudWatch metric name.
     * 
     */
    private final String metricName;
    /**
     * @return The CloudWatch metric namespace name.
     * 
     */
    private final String metricNamespace;
    /**
     * @return An optional Unix timestamp (http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp).
     * 
     */
    private final @Nullable String metricTimestamp;
    /**
     * @return The metric unit (supported units can be found here: http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit)
     * 
     */
    private final String metricUnit;
    /**
     * @return The CloudWatch metric value.
     * 
     */
    private final String metricValue;
    /**
     * @return The IAM role ARN that allows access to the CloudWatch metric.
     * 
     */
    private final String roleArn;

    @CustomType.Constructor
    private TopicRuleCloudwatchMetric(
        @CustomType.Parameter("metricName") String metricName,
        @CustomType.Parameter("metricNamespace") String metricNamespace,
        @CustomType.Parameter("metricTimestamp") @Nullable String metricTimestamp,
        @CustomType.Parameter("metricUnit") String metricUnit,
        @CustomType.Parameter("metricValue") String metricValue,
        @CustomType.Parameter("roleArn") String roleArn) {
        this.metricName = metricName;
        this.metricNamespace = metricNamespace;
        this.metricTimestamp = metricTimestamp;
        this.metricUnit = metricUnit;
        this.metricValue = metricValue;
        this.roleArn = roleArn;
    }

    /**
     * @return The CloudWatch metric name.
     * 
     */
    public String metricName() {
        return this.metricName;
    }
    /**
     * @return The CloudWatch metric namespace name.
     * 
     */
    public String metricNamespace() {
        return this.metricNamespace;
    }
    /**
     * @return An optional Unix timestamp (http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp).
     * 
     */
    public Optional<String> metricTimestamp() {
        return Optional.ofNullable(this.metricTimestamp);
    }
    /**
     * @return The metric unit (supported units can be found here: http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit)
     * 
     */
    public String metricUnit() {
        return this.metricUnit;
    }
    /**
     * @return The CloudWatch metric value.
     * 
     */
    public String metricValue() {
        return this.metricValue;
    }
    /**
     * @return The IAM role ARN that allows access to the CloudWatch metric.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleCloudwatchMetric defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String metricName;
        private String metricNamespace;
        private @Nullable String metricTimestamp;
        private String metricUnit;
        private String metricValue;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleCloudwatchMetric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricName = defaults.metricName;
    	      this.metricNamespace = defaults.metricNamespace;
    	      this.metricTimestamp = defaults.metricTimestamp;
    	      this.metricUnit = defaults.metricUnit;
    	      this.metricValue = defaults.metricValue;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        public Builder metricNamespace(String metricNamespace) {
            this.metricNamespace = Objects.requireNonNull(metricNamespace);
            return this;
        }
        public Builder metricTimestamp(@Nullable String metricTimestamp) {
            this.metricTimestamp = metricTimestamp;
            return this;
        }
        public Builder metricUnit(String metricUnit) {
            this.metricUnit = Objects.requireNonNull(metricUnit);
            return this;
        }
        public Builder metricValue(String metricValue) {
            this.metricValue = Objects.requireNonNull(metricValue);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }        public TopicRuleCloudwatchMetric build() {
            return new TopicRuleCloudwatchMetric(metricName, metricNamespace, metricTimestamp, metricUnit, metricValue, roleArn);
        }
    }
}
