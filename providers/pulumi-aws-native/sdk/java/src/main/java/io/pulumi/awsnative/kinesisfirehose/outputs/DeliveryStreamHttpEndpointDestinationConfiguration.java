// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.outputs;

import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamBufferingHints;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamCloudWatchLoggingOptions;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamHttpEndpointConfiguration;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamHttpEndpointRequestConfiguration;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamProcessingConfiguration;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamRetryOptions;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamS3DestinationConfiguration;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeliveryStreamHttpEndpointDestinationConfiguration {
    private final @Nullable DeliveryStreamBufferingHints bufferingHints;
    private final @Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions;
    private final DeliveryStreamHttpEndpointConfiguration endpointConfiguration;
    private final @Nullable DeliveryStreamProcessingConfiguration processingConfiguration;
    private final @Nullable DeliveryStreamHttpEndpointRequestConfiguration requestConfiguration;
    private final @Nullable DeliveryStreamRetryOptions retryOptions;
    private final @Nullable String roleARN;
    private final @Nullable String s3BackupMode;
    private final DeliveryStreamS3DestinationConfiguration s3Configuration;

    @OutputCustomType.Constructor({"bufferingHints","cloudWatchLoggingOptions","endpointConfiguration","processingConfiguration","requestConfiguration","retryOptions","roleARN","s3BackupMode","s3Configuration"})
    private DeliveryStreamHttpEndpointDestinationConfiguration(
        @Nullable DeliveryStreamBufferingHints bufferingHints,
        @Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions,
        DeliveryStreamHttpEndpointConfiguration endpointConfiguration,
        @Nullable DeliveryStreamProcessingConfiguration processingConfiguration,
        @Nullable DeliveryStreamHttpEndpointRequestConfiguration requestConfiguration,
        @Nullable DeliveryStreamRetryOptions retryOptions,
        @Nullable String roleARN,
        @Nullable String s3BackupMode,
        DeliveryStreamS3DestinationConfiguration s3Configuration) {
        this.bufferingHints = bufferingHints;
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
        this.endpointConfiguration = Objects.requireNonNull(endpointConfiguration);
        this.processingConfiguration = processingConfiguration;
        this.requestConfiguration = requestConfiguration;
        this.retryOptions = retryOptions;
        this.roleARN = roleARN;
        this.s3BackupMode = s3BackupMode;
        this.s3Configuration = Objects.requireNonNull(s3Configuration);
    }

    public Optional<DeliveryStreamBufferingHints> getBufferingHints() {
        return Optional.ofNullable(this.bufferingHints);
    }
    public Optional<DeliveryStreamCloudWatchLoggingOptions> getCloudWatchLoggingOptions() {
        return Optional.ofNullable(this.cloudWatchLoggingOptions);
    }
    public DeliveryStreamHttpEndpointConfiguration getEndpointConfiguration() {
        return this.endpointConfiguration;
    }
    public Optional<DeliveryStreamProcessingConfiguration> getProcessingConfiguration() {
        return Optional.ofNullable(this.processingConfiguration);
    }
    public Optional<DeliveryStreamHttpEndpointRequestConfiguration> getRequestConfiguration() {
        return Optional.ofNullable(this.requestConfiguration);
    }
    public Optional<DeliveryStreamRetryOptions> getRetryOptions() {
        return Optional.ofNullable(this.retryOptions);
    }
    public Optional<String> getRoleARN() {
        return Optional.ofNullable(this.roleARN);
    }
    public Optional<String> getS3BackupMode() {
        return Optional.ofNullable(this.s3BackupMode);
    }
    public DeliveryStreamS3DestinationConfiguration getS3Configuration() {
        return this.s3Configuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamHttpEndpointDestinationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DeliveryStreamBufferingHints bufferingHints;
        private @Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions;
        private DeliveryStreamHttpEndpointConfiguration endpointConfiguration;
        private @Nullable DeliveryStreamProcessingConfiguration processingConfiguration;
        private @Nullable DeliveryStreamHttpEndpointRequestConfiguration requestConfiguration;
        private @Nullable DeliveryStreamRetryOptions retryOptions;
        private @Nullable String roleARN;
        private @Nullable String s3BackupMode;
        private DeliveryStreamS3DestinationConfiguration s3Configuration;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamHttpEndpointDestinationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bufferingHints = defaults.bufferingHints;
    	      this.cloudWatchLoggingOptions = defaults.cloudWatchLoggingOptions;
    	      this.endpointConfiguration = defaults.endpointConfiguration;
    	      this.processingConfiguration = defaults.processingConfiguration;
    	      this.requestConfiguration = defaults.requestConfiguration;
    	      this.retryOptions = defaults.retryOptions;
    	      this.roleARN = defaults.roleARN;
    	      this.s3BackupMode = defaults.s3BackupMode;
    	      this.s3Configuration = defaults.s3Configuration;
        }

        public Builder setBufferingHints(@Nullable DeliveryStreamBufferingHints bufferingHints) {
            this.bufferingHints = bufferingHints;
            return this;
        }

        public Builder setCloudWatchLoggingOptions(@Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions) {
            this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
            return this;
        }

        public Builder setEndpointConfiguration(DeliveryStreamHttpEndpointConfiguration endpointConfiguration) {
            this.endpointConfiguration = Objects.requireNonNull(endpointConfiguration);
            return this;
        }

        public Builder setProcessingConfiguration(@Nullable DeliveryStreamProcessingConfiguration processingConfiguration) {
            this.processingConfiguration = processingConfiguration;
            return this;
        }

        public Builder setRequestConfiguration(@Nullable DeliveryStreamHttpEndpointRequestConfiguration requestConfiguration) {
            this.requestConfiguration = requestConfiguration;
            return this;
        }

        public Builder setRetryOptions(@Nullable DeliveryStreamRetryOptions retryOptions) {
            this.retryOptions = retryOptions;
            return this;
        }

        public Builder setRoleARN(@Nullable String roleARN) {
            this.roleARN = roleARN;
            return this;
        }

        public Builder setS3BackupMode(@Nullable String s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }

        public Builder setS3Configuration(DeliveryStreamS3DestinationConfiguration s3Configuration) {
            this.s3Configuration = Objects.requireNonNull(s3Configuration);
            return this;
        }

        public DeliveryStreamHttpEndpointDestinationConfiguration build() {
            return new DeliveryStreamHttpEndpointDestinationConfiguration(bufferingHints, cloudWatchLoggingOptions, endpointConfiguration, processingConfiguration, requestConfiguration, retryOptions, roleARN, s3BackupMode, s3Configuration);
        }
    }
}
