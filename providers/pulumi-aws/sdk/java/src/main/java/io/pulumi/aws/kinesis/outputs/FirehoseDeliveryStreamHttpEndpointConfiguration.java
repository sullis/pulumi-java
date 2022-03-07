// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptions;
import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration;
import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirehoseDeliveryStreamHttpEndpointConfiguration {
    /**
     * The access key required for Kinesis Firehose to authenticate with the HTTP endpoint selected as the destination.
     * 
     */
    private final @Nullable String accessKey;
    /**
     * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300 (5 minutes).
     * 
     */
    private final @Nullable Integer bufferingInterval;
    /**
     * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5.
     * 
     */
    private final @Nullable Integer bufferingSize;
    /**
     * The CloudWatch Logging Options for the delivery stream. More details are given below.
     * 
     */
    private final @Nullable FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions;
    /**
     * The HTTP endpoint name.
     * 
     */
    private final @Nullable String name;
    /**
     * The data processing configuration.  More details are given below.
     * 
     */
    private final @Nullable FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration processingConfiguration;
    /**
     * The request configuration.  More details are given below.
     * 
     */
    private final @Nullable FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration requestConfiguration;
    /**
     * Total amount of seconds Firehose spends on retries. This duration starts after the initial attempt fails, It does not include the time periods during which Firehose waits for acknowledgment from the specified destination after each attempt. Valid values between `0` and `7200`. Default is `300`.
     * 
     */
    private final @Nullable Integer retryDuration;
    /**
     * Kinesis Data Firehose uses this IAM role for all the permissions that the delivery stream needs. The pattern needs to be `arn:.*`.
     * 
     */
    private final @Nullable String roleArn;
    /**
     * Defines how documents should be delivered to Amazon S3.  Valid values are `FailedDataOnly` and `AllData`.  Default value is `FailedDataOnly`.
     * 
     */
    private final @Nullable String s3BackupMode;
    /**
     * The HTTP endpoint URL to which Kinesis Firehose sends your data.
     * 
     */
    private final String url;

    @OutputCustomType.Constructor({"accessKey","bufferingInterval","bufferingSize","cloudwatchLoggingOptions","name","processingConfiguration","requestConfiguration","retryDuration","roleArn","s3BackupMode","url"})
    private FirehoseDeliveryStreamHttpEndpointConfiguration(
        @Nullable String accessKey,
        @Nullable Integer bufferingInterval,
        @Nullable Integer bufferingSize,
        @Nullable FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions,
        @Nullable String name,
        @Nullable FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration processingConfiguration,
        @Nullable FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration requestConfiguration,
        @Nullable Integer retryDuration,
        @Nullable String roleArn,
        @Nullable String s3BackupMode,
        String url) {
        this.accessKey = accessKey;
        this.bufferingInterval = bufferingInterval;
        this.bufferingSize = bufferingSize;
        this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
        this.name = name;
        this.processingConfiguration = processingConfiguration;
        this.requestConfiguration = requestConfiguration;
        this.retryDuration = retryDuration;
        this.roleArn = roleArn;
        this.s3BackupMode = s3BackupMode;
        this.url = Objects.requireNonNull(url);
    }

    /**
     * The access key required for Kinesis Firehose to authenticate with the HTTP endpoint selected as the destination.
     * 
    */
    public Optional<String> getAccessKey() {
        return Optional.ofNullable(this.accessKey);
    }
    /**
     * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300 (5 minutes).
     * 
    */
    public Optional<Integer> getBufferingInterval() {
        return Optional.ofNullable(this.bufferingInterval);
    }
    /**
     * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5.
     * 
    */
    public Optional<Integer> getBufferingSize() {
        return Optional.ofNullable(this.bufferingSize);
    }
    /**
     * The CloudWatch Logging Options for the delivery stream. More details are given below.
     * 
    */
    public Optional<FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptions> getCloudwatchLoggingOptions() {
        return Optional.ofNullable(this.cloudwatchLoggingOptions);
    }
    /**
     * The HTTP endpoint name.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The data processing configuration.  More details are given below.
     * 
    */
    public Optional<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration> getProcessingConfiguration() {
        return Optional.ofNullable(this.processingConfiguration);
    }
    /**
     * The request configuration.  More details are given below.
     * 
    */
    public Optional<FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration> getRequestConfiguration() {
        return Optional.ofNullable(this.requestConfiguration);
    }
    /**
     * Total amount of seconds Firehose spends on retries. This duration starts after the initial attempt fails, It does not include the time periods during which Firehose waits for acknowledgment from the specified destination after each attempt. Valid values between `0` and `7200`. Default is `300`.
     * 
    */
    public Optional<Integer> getRetryDuration() {
        return Optional.ofNullable(this.retryDuration);
    }
    /**
     * Kinesis Data Firehose uses this IAM role for all the permissions that the delivery stream needs. The pattern needs to be `arn:.*`.
     * 
    */
    public Optional<String> getRoleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    /**
     * Defines how documents should be delivered to Amazon S3.  Valid values are `FailedDataOnly` and `AllData`.  Default value is `FailedDataOnly`.
     * 
    */
    public Optional<String> getS3BackupMode() {
        return Optional.ofNullable(this.s3BackupMode);
    }
    /**
     * The HTTP endpoint URL to which Kinesis Firehose sends your data.
     * 
    */
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamHttpEndpointConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessKey;
        private @Nullable Integer bufferingInterval;
        private @Nullable Integer bufferingSize;
        private @Nullable FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions;
        private @Nullable String name;
        private @Nullable FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration processingConfiguration;
        private @Nullable FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration requestConfiguration;
        private @Nullable Integer retryDuration;
        private @Nullable String roleArn;
        private @Nullable String s3BackupMode;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamHttpEndpointConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.bufferingInterval = defaults.bufferingInterval;
    	      this.bufferingSize = defaults.bufferingSize;
    	      this.cloudwatchLoggingOptions = defaults.cloudwatchLoggingOptions;
    	      this.name = defaults.name;
    	      this.processingConfiguration = defaults.processingConfiguration;
    	      this.requestConfiguration = defaults.requestConfiguration;
    	      this.retryDuration = defaults.retryDuration;
    	      this.roleArn = defaults.roleArn;
    	      this.s3BackupMode = defaults.s3BackupMode;
    	      this.url = defaults.url;
        }

        public Builder setAccessKey(@Nullable String accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        public Builder setBufferingInterval(@Nullable Integer bufferingInterval) {
            this.bufferingInterval = bufferingInterval;
            return this;
        }

        public Builder setBufferingSize(@Nullable Integer bufferingSize) {
            this.bufferingSize = bufferingSize;
            return this;
        }

        public Builder setCloudwatchLoggingOptions(@Nullable FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProcessingConfiguration(@Nullable FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration processingConfiguration) {
            this.processingConfiguration = processingConfiguration;
            return this;
        }

        public Builder setRequestConfiguration(@Nullable FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration requestConfiguration) {
            this.requestConfiguration = requestConfiguration;
            return this;
        }

        public Builder setRetryDuration(@Nullable Integer retryDuration) {
            this.retryDuration = retryDuration;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder setS3BackupMode(@Nullable String s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public FirehoseDeliveryStreamHttpEndpointConfiguration build() {
            return new FirehoseDeliveryStreamHttpEndpointConfiguration(accessKey, bufferingInterval, bufferingSize, cloudwatchLoggingOptions, name, processingConfiguration, requestConfiguration, retryDuration, roleArn, s3BackupMode, url);
        }
    }
}