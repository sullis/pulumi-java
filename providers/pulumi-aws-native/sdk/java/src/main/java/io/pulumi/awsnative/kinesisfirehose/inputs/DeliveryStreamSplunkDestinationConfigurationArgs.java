// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamSplunkDestinationConfigurationHECEndpointType;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamCloudWatchLoggingOptionsArgs;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamProcessingConfigurationArgs;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamS3DestinationConfigurationArgs;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamSplunkRetryOptionsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamSplunkDestinationConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamSplunkDestinationConfigurationArgs Empty = new DeliveryStreamSplunkDestinationConfigurationArgs();

    @Import(name="cloudWatchLoggingOptions")
      private final @Nullable Output<DeliveryStreamCloudWatchLoggingOptionsArgs> cloudWatchLoggingOptions;

    public Output<DeliveryStreamCloudWatchLoggingOptionsArgs> cloudWatchLoggingOptions() {
        return this.cloudWatchLoggingOptions == null ? Codegen.empty() : this.cloudWatchLoggingOptions;
    }

    @Import(name="hECAcknowledgmentTimeoutInSeconds")
      private final @Nullable Output<Integer> hECAcknowledgmentTimeoutInSeconds;

    public Output<Integer> hECAcknowledgmentTimeoutInSeconds() {
        return this.hECAcknowledgmentTimeoutInSeconds == null ? Codegen.empty() : this.hECAcknowledgmentTimeoutInSeconds;
    }

    @Import(name="hECEndpoint", required=true)
      private final Output<String> hECEndpoint;

    public Output<String> hECEndpoint() {
        return this.hECEndpoint;
    }

    @Import(name="hECEndpointType", required=true)
      private final Output<DeliveryStreamSplunkDestinationConfigurationHECEndpointType> hECEndpointType;

    public Output<DeliveryStreamSplunkDestinationConfigurationHECEndpointType> hECEndpointType() {
        return this.hECEndpointType;
    }

    @Import(name="hECToken", required=true)
      private final Output<String> hECToken;

    public Output<String> hECToken() {
        return this.hECToken;
    }

    @Import(name="processingConfiguration")
      private final @Nullable Output<DeliveryStreamProcessingConfigurationArgs> processingConfiguration;

    public Output<DeliveryStreamProcessingConfigurationArgs> processingConfiguration() {
        return this.processingConfiguration == null ? Codegen.empty() : this.processingConfiguration;
    }

    @Import(name="retryOptions")
      private final @Nullable Output<DeliveryStreamSplunkRetryOptionsArgs> retryOptions;

    public Output<DeliveryStreamSplunkRetryOptionsArgs> retryOptions() {
        return this.retryOptions == null ? Codegen.empty() : this.retryOptions;
    }

    @Import(name="s3BackupMode")
      private final @Nullable Output<String> s3BackupMode;

    public Output<String> s3BackupMode() {
        return this.s3BackupMode == null ? Codegen.empty() : this.s3BackupMode;
    }

    @Import(name="s3Configuration", required=true)
      private final Output<DeliveryStreamS3DestinationConfigurationArgs> s3Configuration;

    public Output<DeliveryStreamS3DestinationConfigurationArgs> s3Configuration() {
        return this.s3Configuration;
    }

    public DeliveryStreamSplunkDestinationConfigurationArgs(
        @Nullable Output<DeliveryStreamCloudWatchLoggingOptionsArgs> cloudWatchLoggingOptions,
        @Nullable Output<Integer> hECAcknowledgmentTimeoutInSeconds,
        Output<String> hECEndpoint,
        Output<DeliveryStreamSplunkDestinationConfigurationHECEndpointType> hECEndpointType,
        Output<String> hECToken,
        @Nullable Output<DeliveryStreamProcessingConfigurationArgs> processingConfiguration,
        @Nullable Output<DeliveryStreamSplunkRetryOptionsArgs> retryOptions,
        @Nullable Output<String> s3BackupMode,
        Output<DeliveryStreamS3DestinationConfigurationArgs> s3Configuration) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
        this.hECAcknowledgmentTimeoutInSeconds = hECAcknowledgmentTimeoutInSeconds;
        this.hECEndpoint = Objects.requireNonNull(hECEndpoint, "expected parameter 'hECEndpoint' to be non-null");
        this.hECEndpointType = Objects.requireNonNull(hECEndpointType, "expected parameter 'hECEndpointType' to be non-null");
        this.hECToken = Objects.requireNonNull(hECToken, "expected parameter 'hECToken' to be non-null");
        this.processingConfiguration = processingConfiguration;
        this.retryOptions = retryOptions;
        this.s3BackupMode = s3BackupMode;
        this.s3Configuration = Objects.requireNonNull(s3Configuration, "expected parameter 's3Configuration' to be non-null");
    }

    private DeliveryStreamSplunkDestinationConfigurationArgs() {
        this.cloudWatchLoggingOptions = Codegen.empty();
        this.hECAcknowledgmentTimeoutInSeconds = Codegen.empty();
        this.hECEndpoint = Codegen.empty();
        this.hECEndpointType = Codegen.empty();
        this.hECToken = Codegen.empty();
        this.processingConfiguration = Codegen.empty();
        this.retryOptions = Codegen.empty();
        this.s3BackupMode = Codegen.empty();
        this.s3Configuration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamSplunkDestinationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DeliveryStreamCloudWatchLoggingOptionsArgs> cloudWatchLoggingOptions;
        private @Nullable Output<Integer> hECAcknowledgmentTimeoutInSeconds;
        private Output<String> hECEndpoint;
        private Output<DeliveryStreamSplunkDestinationConfigurationHECEndpointType> hECEndpointType;
        private Output<String> hECToken;
        private @Nullable Output<DeliveryStreamProcessingConfigurationArgs> processingConfiguration;
        private @Nullable Output<DeliveryStreamSplunkRetryOptionsArgs> retryOptions;
        private @Nullable Output<String> s3BackupMode;
        private Output<DeliveryStreamS3DestinationConfigurationArgs> s3Configuration;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamSplunkDestinationConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchLoggingOptions = defaults.cloudWatchLoggingOptions;
    	      this.hECAcknowledgmentTimeoutInSeconds = defaults.hECAcknowledgmentTimeoutInSeconds;
    	      this.hECEndpoint = defaults.hECEndpoint;
    	      this.hECEndpointType = defaults.hECEndpointType;
    	      this.hECToken = defaults.hECToken;
    	      this.processingConfiguration = defaults.processingConfiguration;
    	      this.retryOptions = defaults.retryOptions;
    	      this.s3BackupMode = defaults.s3BackupMode;
    	      this.s3Configuration = defaults.s3Configuration;
        }

        public Builder cloudWatchLoggingOptions(@Nullable Output<DeliveryStreamCloudWatchLoggingOptionsArgs> cloudWatchLoggingOptions) {
            this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
            return this;
        }
        public Builder cloudWatchLoggingOptions(@Nullable DeliveryStreamCloudWatchLoggingOptionsArgs cloudWatchLoggingOptions) {
            this.cloudWatchLoggingOptions = Codegen.ofNullable(cloudWatchLoggingOptions);
            return this;
        }
        public Builder hECAcknowledgmentTimeoutInSeconds(@Nullable Output<Integer> hECAcknowledgmentTimeoutInSeconds) {
            this.hECAcknowledgmentTimeoutInSeconds = hECAcknowledgmentTimeoutInSeconds;
            return this;
        }
        public Builder hECAcknowledgmentTimeoutInSeconds(@Nullable Integer hECAcknowledgmentTimeoutInSeconds) {
            this.hECAcknowledgmentTimeoutInSeconds = Codegen.ofNullable(hECAcknowledgmentTimeoutInSeconds);
            return this;
        }
        public Builder hECEndpoint(Output<String> hECEndpoint) {
            this.hECEndpoint = Objects.requireNonNull(hECEndpoint);
            return this;
        }
        public Builder hECEndpoint(String hECEndpoint) {
            this.hECEndpoint = Output.of(Objects.requireNonNull(hECEndpoint));
            return this;
        }
        public Builder hECEndpointType(Output<DeliveryStreamSplunkDestinationConfigurationHECEndpointType> hECEndpointType) {
            this.hECEndpointType = Objects.requireNonNull(hECEndpointType);
            return this;
        }
        public Builder hECEndpointType(DeliveryStreamSplunkDestinationConfigurationHECEndpointType hECEndpointType) {
            this.hECEndpointType = Output.of(Objects.requireNonNull(hECEndpointType));
            return this;
        }
        public Builder hECToken(Output<String> hECToken) {
            this.hECToken = Objects.requireNonNull(hECToken);
            return this;
        }
        public Builder hECToken(String hECToken) {
            this.hECToken = Output.of(Objects.requireNonNull(hECToken));
            return this;
        }
        public Builder processingConfiguration(@Nullable Output<DeliveryStreamProcessingConfigurationArgs> processingConfiguration) {
            this.processingConfiguration = processingConfiguration;
            return this;
        }
        public Builder processingConfiguration(@Nullable DeliveryStreamProcessingConfigurationArgs processingConfiguration) {
            this.processingConfiguration = Codegen.ofNullable(processingConfiguration);
            return this;
        }
        public Builder retryOptions(@Nullable Output<DeliveryStreamSplunkRetryOptionsArgs> retryOptions) {
            this.retryOptions = retryOptions;
            return this;
        }
        public Builder retryOptions(@Nullable DeliveryStreamSplunkRetryOptionsArgs retryOptions) {
            this.retryOptions = Codegen.ofNullable(retryOptions);
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
        public Builder s3Configuration(Output<DeliveryStreamS3DestinationConfigurationArgs> s3Configuration) {
            this.s3Configuration = Objects.requireNonNull(s3Configuration);
            return this;
        }
        public Builder s3Configuration(DeliveryStreamS3DestinationConfigurationArgs s3Configuration) {
            this.s3Configuration = Output.of(Objects.requireNonNull(s3Configuration));
            return this;
        }        public DeliveryStreamSplunkDestinationConfigurationArgs build() {
            return new DeliveryStreamSplunkDestinationConfigurationArgs(cloudWatchLoggingOptions, hECAcknowledgmentTimeoutInSeconds, hECEndpoint, hECEndpointType, hECToken, processingConfiguration, retryOptions, s3BackupMode, s3Configuration);
        }
    }
}
