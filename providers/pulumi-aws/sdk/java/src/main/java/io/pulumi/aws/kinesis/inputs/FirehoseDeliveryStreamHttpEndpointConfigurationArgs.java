// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptionsArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamHttpEndpointConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamHttpEndpointConfigurationArgs Empty = new FirehoseDeliveryStreamHttpEndpointConfigurationArgs();

    /**
     * The access key required for Kinesis Firehose to authenticate with the HTTP endpoint selected as the destination.
     * 
     */
    @Import(name="accessKey")
      private final @Nullable Output<String> accessKey;

    public Output<String> accessKey() {
        return this.accessKey == null ? Codegen.empty() : this.accessKey;
    }

    /**
     * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300 (5 minutes).
     * 
     */
    @Import(name="bufferingInterval")
      private final @Nullable Output<Integer> bufferingInterval;

    public Output<Integer> bufferingInterval() {
        return this.bufferingInterval == null ? Codegen.empty() : this.bufferingInterval;
    }

    /**
     * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5.
     * 
     */
    @Import(name="bufferingSize")
      private final @Nullable Output<Integer> bufferingSize;

    public Output<Integer> bufferingSize() {
        return this.bufferingSize == null ? Codegen.empty() : this.bufferingSize;
    }

    /**
     * The CloudWatch Logging Options for the delivery stream. More details are given below.
     * 
     */
    @Import(name="cloudwatchLoggingOptions")
      private final @Nullable Output<FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions;

    public Output<FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions() {
        return this.cloudwatchLoggingOptions == null ? Codegen.empty() : this.cloudwatchLoggingOptions;
    }

    /**
     * The HTTP endpoint name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The data processing configuration.  More details are given below.
     * 
     */
    @Import(name="processingConfiguration")
      private final @Nullable Output<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationArgs> processingConfiguration;

    public Output<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationArgs> processingConfiguration() {
        return this.processingConfiguration == null ? Codegen.empty() : this.processingConfiguration;
    }

    /**
     * The request configuration.  More details are given below.
     * 
     */
    @Import(name="requestConfiguration")
      private final @Nullable Output<FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs> requestConfiguration;

    public Output<FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs> requestConfiguration() {
        return this.requestConfiguration == null ? Codegen.empty() : this.requestConfiguration;
    }

    /**
     * Total amount of seconds Firehose spends on retries. This duration starts after the initial attempt fails, It does not include the time periods during which Firehose waits for acknowledgment from the specified destination after each attempt. Valid values between `0` and `7200`. Default is `300`.
     * 
     */
    @Import(name="retryDuration")
      private final @Nullable Output<Integer> retryDuration;

    public Output<Integer> retryDuration() {
        return this.retryDuration == null ? Codegen.empty() : this.retryDuration;
    }

    /**
     * Kinesis Data Firehose uses this IAM role for all the permissions that the delivery stream needs. The pattern needs to be `arn:.*`.
     * 
     */
    @Import(name="roleArn")
      private final @Nullable Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn == null ? Codegen.empty() : this.roleArn;
    }

    /**
     * Defines how documents should be delivered to Amazon S3.  Valid values are `FailedDataOnly` and `AllData`.  Default value is `FailedDataOnly`.
     * 
     */
    @Import(name="s3BackupMode")
      private final @Nullable Output<String> s3BackupMode;

    public Output<String> s3BackupMode() {
        return this.s3BackupMode == null ? Codegen.empty() : this.s3BackupMode;
    }

    /**
     * The HTTP endpoint URL to which Kinesis Firehose sends your data.
     * 
     */
    @Import(name="url", required=true)
      private final Output<String> url;

    public Output<String> url() {
        return this.url;
    }

    public FirehoseDeliveryStreamHttpEndpointConfigurationArgs(
        @Nullable Output<String> accessKey,
        @Nullable Output<Integer> bufferingInterval,
        @Nullable Output<Integer> bufferingSize,
        @Nullable Output<FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions,
        @Nullable Output<String> name,
        @Nullable Output<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationArgs> processingConfiguration,
        @Nullable Output<FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs> requestConfiguration,
        @Nullable Output<Integer> retryDuration,
        @Nullable Output<String> roleArn,
        @Nullable Output<String> s3BackupMode,
        Output<String> url) {
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
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private FirehoseDeliveryStreamHttpEndpointConfigurationArgs() {
        this.accessKey = Codegen.empty();
        this.bufferingInterval = Codegen.empty();
        this.bufferingSize = Codegen.empty();
        this.cloudwatchLoggingOptions = Codegen.empty();
        this.name = Codegen.empty();
        this.processingConfiguration = Codegen.empty();
        this.requestConfiguration = Codegen.empty();
        this.retryDuration = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.s3BackupMode = Codegen.empty();
        this.url = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamHttpEndpointConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accessKey;
        private @Nullable Output<Integer> bufferingInterval;
        private @Nullable Output<Integer> bufferingSize;
        private @Nullable Output<FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions;
        private @Nullable Output<String> name;
        private @Nullable Output<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationArgs> processingConfiguration;
        private @Nullable Output<FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs> requestConfiguration;
        private @Nullable Output<Integer> retryDuration;
        private @Nullable Output<String> roleArn;
        private @Nullable Output<String> s3BackupMode;
        private Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamHttpEndpointConfigurationArgs defaults) {
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

        public Builder accessKey(@Nullable Output<String> accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public Builder accessKey(@Nullable String accessKey) {
            this.accessKey = Codegen.ofNullable(accessKey);
            return this;
        }
        public Builder bufferingInterval(@Nullable Output<Integer> bufferingInterval) {
            this.bufferingInterval = bufferingInterval;
            return this;
        }
        public Builder bufferingInterval(@Nullable Integer bufferingInterval) {
            this.bufferingInterval = Codegen.ofNullable(bufferingInterval);
            return this;
        }
        public Builder bufferingSize(@Nullable Output<Integer> bufferingSize) {
            this.bufferingSize = bufferingSize;
            return this;
        }
        public Builder bufferingSize(@Nullable Integer bufferingSize) {
            this.bufferingSize = Codegen.ofNullable(bufferingSize);
            return this;
        }
        public Builder cloudwatchLoggingOptions(@Nullable Output<FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
            return this;
        }
        public Builder cloudwatchLoggingOptions(@Nullable FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptionsArgs cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = Codegen.ofNullable(cloudwatchLoggingOptions);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder processingConfiguration(@Nullable Output<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationArgs> processingConfiguration) {
            this.processingConfiguration = processingConfiguration;
            return this;
        }
        public Builder processingConfiguration(@Nullable FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationArgs processingConfiguration) {
            this.processingConfiguration = Codegen.ofNullable(processingConfiguration);
            return this;
        }
        public Builder requestConfiguration(@Nullable Output<FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs> requestConfiguration) {
            this.requestConfiguration = requestConfiguration;
            return this;
        }
        public Builder requestConfiguration(@Nullable FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs requestConfiguration) {
            this.requestConfiguration = Codegen.ofNullable(requestConfiguration);
            return this;
        }
        public Builder retryDuration(@Nullable Output<Integer> retryDuration) {
            this.retryDuration = retryDuration;
            return this;
        }
        public Builder retryDuration(@Nullable Integer retryDuration) {
            this.retryDuration = Codegen.ofNullable(retryDuration);
            return this;
        }
        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Codegen.ofNullable(roleArn);
            return this;
        }
        public Builder s3BackupMode(@Nullable Output<String> s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }
        public Builder s3BackupMode(@Nullable String s3BackupMode) {
            this.s3BackupMode = Codegen.ofNullable(s3BackupMode);
            return this;
        }
        public Builder url(Output<String> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder url(String url) {
            this.url = Output.of(Objects.requireNonNull(url));
            return this;
        }        public FirehoseDeliveryStreamHttpEndpointConfigurationArgs build() {
            return new FirehoseDeliveryStreamHttpEndpointConfigurationArgs(accessKey, bufferingInterval, bufferingSize, cloudwatchLoggingOptions, name, processingConfiguration, requestConfiguration, retryDuration, roleArn, s3BackupMode, url);
        }
    }
}
