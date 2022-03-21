// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamExtendedS3DestinationConfigurationCompressionFormat;
import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamExtendedS3DestinationConfigurationS3BackupMode;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamBufferingHints;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamCloudWatchLoggingOptions;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamDataFormatConversionConfiguration;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamDynamicPartitioningConfiguration;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamEncryptionConfiguration;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamProcessingConfiguration;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamS3DestinationConfiguration;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamExtendedS3DestinationConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryStreamExtendedS3DestinationConfiguration Empty = new DeliveryStreamExtendedS3DestinationConfiguration();

    @Import(name="bucketARN", required=true)
      private final String bucketARN;

    public String getBucketARN() {
        return this.bucketARN;
    }

    @Import(name="bufferingHints")
      private final @Nullable DeliveryStreamBufferingHints bufferingHints;

    public Optional<DeliveryStreamBufferingHints> getBufferingHints() {
        return this.bufferingHints == null ? Optional.empty() : Optional.ofNullable(this.bufferingHints);
    }

    @Import(name="cloudWatchLoggingOptions")
      private final @Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions;

    public Optional<DeliveryStreamCloudWatchLoggingOptions> getCloudWatchLoggingOptions() {
        return this.cloudWatchLoggingOptions == null ? Optional.empty() : Optional.ofNullable(this.cloudWatchLoggingOptions);
    }

    @Import(name="compressionFormat")
      private final @Nullable DeliveryStreamExtendedS3DestinationConfigurationCompressionFormat compressionFormat;

    public Optional<DeliveryStreamExtendedS3DestinationConfigurationCompressionFormat> getCompressionFormat() {
        return this.compressionFormat == null ? Optional.empty() : Optional.ofNullable(this.compressionFormat);
    }

    @Import(name="dataFormatConversionConfiguration")
      private final @Nullable DeliveryStreamDataFormatConversionConfiguration dataFormatConversionConfiguration;

    public Optional<DeliveryStreamDataFormatConversionConfiguration> getDataFormatConversionConfiguration() {
        return this.dataFormatConversionConfiguration == null ? Optional.empty() : Optional.ofNullable(this.dataFormatConversionConfiguration);
    }

    @Import(name="dynamicPartitioningConfiguration")
      private final @Nullable DeliveryStreamDynamicPartitioningConfiguration dynamicPartitioningConfiguration;

    public Optional<DeliveryStreamDynamicPartitioningConfiguration> getDynamicPartitioningConfiguration() {
        return this.dynamicPartitioningConfiguration == null ? Optional.empty() : Optional.ofNullable(this.dynamicPartitioningConfiguration);
    }

    @Import(name="encryptionConfiguration")
      private final @Nullable DeliveryStreamEncryptionConfiguration encryptionConfiguration;

    public Optional<DeliveryStreamEncryptionConfiguration> getEncryptionConfiguration() {
        return this.encryptionConfiguration == null ? Optional.empty() : Optional.ofNullable(this.encryptionConfiguration);
    }

    @Import(name="errorOutputPrefix")
      private final @Nullable String errorOutputPrefix;

    public Optional<String> getErrorOutputPrefix() {
        return this.errorOutputPrefix == null ? Optional.empty() : Optional.ofNullable(this.errorOutputPrefix);
    }

    @Import(name="prefix")
      private final @Nullable String prefix;

    public Optional<String> getPrefix() {
        return this.prefix == null ? Optional.empty() : Optional.ofNullable(this.prefix);
    }

    @Import(name="processingConfiguration")
      private final @Nullable DeliveryStreamProcessingConfiguration processingConfiguration;

    public Optional<DeliveryStreamProcessingConfiguration> getProcessingConfiguration() {
        return this.processingConfiguration == null ? Optional.empty() : Optional.ofNullable(this.processingConfiguration);
    }

    @Import(name="roleARN", required=true)
      private final String roleARN;

    public String getRoleARN() {
        return this.roleARN;
    }

    @Import(name="s3BackupConfiguration")
      private final @Nullable DeliveryStreamS3DestinationConfiguration s3BackupConfiguration;

    public Optional<DeliveryStreamS3DestinationConfiguration> getS3BackupConfiguration() {
        return this.s3BackupConfiguration == null ? Optional.empty() : Optional.ofNullable(this.s3BackupConfiguration);
    }

    @Import(name="s3BackupMode")
      private final @Nullable DeliveryStreamExtendedS3DestinationConfigurationS3BackupMode s3BackupMode;

    public Optional<DeliveryStreamExtendedS3DestinationConfigurationS3BackupMode> getS3BackupMode() {
        return this.s3BackupMode == null ? Optional.empty() : Optional.ofNullable(this.s3BackupMode);
    }

    public DeliveryStreamExtendedS3DestinationConfiguration(
        String bucketARN,
        @Nullable DeliveryStreamBufferingHints bufferingHints,
        @Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions,
        @Nullable DeliveryStreamExtendedS3DestinationConfigurationCompressionFormat compressionFormat,
        @Nullable DeliveryStreamDataFormatConversionConfiguration dataFormatConversionConfiguration,
        @Nullable DeliveryStreamDynamicPartitioningConfiguration dynamicPartitioningConfiguration,
        @Nullable DeliveryStreamEncryptionConfiguration encryptionConfiguration,
        @Nullable String errorOutputPrefix,
        @Nullable String prefix,
        @Nullable DeliveryStreamProcessingConfiguration processingConfiguration,
        String roleARN,
        @Nullable DeliveryStreamS3DestinationConfiguration s3BackupConfiguration,
        @Nullable DeliveryStreamExtendedS3DestinationConfigurationS3BackupMode s3BackupMode) {
        this.bucketARN = Objects.requireNonNull(bucketARN, "expected parameter 'bucketARN' to be non-null");
        this.bufferingHints = bufferingHints;
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
        this.compressionFormat = compressionFormat;
        this.dataFormatConversionConfiguration = dataFormatConversionConfiguration;
        this.dynamicPartitioningConfiguration = dynamicPartitioningConfiguration;
        this.encryptionConfiguration = encryptionConfiguration;
        this.errorOutputPrefix = errorOutputPrefix;
        this.prefix = prefix;
        this.processingConfiguration = processingConfiguration;
        this.roleARN = Objects.requireNonNull(roleARN, "expected parameter 'roleARN' to be non-null");
        this.s3BackupConfiguration = s3BackupConfiguration;
        this.s3BackupMode = s3BackupMode;
    }

    private DeliveryStreamExtendedS3DestinationConfiguration() {
        this.bucketARN = null;
        this.bufferingHints = null;
        this.cloudWatchLoggingOptions = null;
        this.compressionFormat = null;
        this.dataFormatConversionConfiguration = null;
        this.dynamicPartitioningConfiguration = null;
        this.encryptionConfiguration = null;
        this.errorOutputPrefix = null;
        this.prefix = null;
        this.processingConfiguration = null;
        this.roleARN = null;
        this.s3BackupConfiguration = null;
        this.s3BackupMode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamExtendedS3DestinationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketARN;
        private @Nullable DeliveryStreamBufferingHints bufferingHints;
        private @Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions;
        private @Nullable DeliveryStreamExtendedS3DestinationConfigurationCompressionFormat compressionFormat;
        private @Nullable DeliveryStreamDataFormatConversionConfiguration dataFormatConversionConfiguration;
        private @Nullable DeliveryStreamDynamicPartitioningConfiguration dynamicPartitioningConfiguration;
        private @Nullable DeliveryStreamEncryptionConfiguration encryptionConfiguration;
        private @Nullable String errorOutputPrefix;
        private @Nullable String prefix;
        private @Nullable DeliveryStreamProcessingConfiguration processingConfiguration;
        private String roleARN;
        private @Nullable DeliveryStreamS3DestinationConfiguration s3BackupConfiguration;
        private @Nullable DeliveryStreamExtendedS3DestinationConfigurationS3BackupMode s3BackupMode;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamExtendedS3DestinationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketARN = defaults.bucketARN;
    	      this.bufferingHints = defaults.bufferingHints;
    	      this.cloudWatchLoggingOptions = defaults.cloudWatchLoggingOptions;
    	      this.compressionFormat = defaults.compressionFormat;
    	      this.dataFormatConversionConfiguration = defaults.dataFormatConversionConfiguration;
    	      this.dynamicPartitioningConfiguration = defaults.dynamicPartitioningConfiguration;
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.errorOutputPrefix = defaults.errorOutputPrefix;
    	      this.prefix = defaults.prefix;
    	      this.processingConfiguration = defaults.processingConfiguration;
    	      this.roleARN = defaults.roleARN;
    	      this.s3BackupConfiguration = defaults.s3BackupConfiguration;
    	      this.s3BackupMode = defaults.s3BackupMode;
        }

        public Builder bucketARN(String bucketARN) {
            this.bucketARN = Objects.requireNonNull(bucketARN);
            return this;
        }
        public Builder bufferingHints(@Nullable DeliveryStreamBufferingHints bufferingHints) {
            this.bufferingHints = bufferingHints;
            return this;
        }
        public Builder cloudWatchLoggingOptions(@Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions) {
            this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
            return this;
        }
        public Builder compressionFormat(@Nullable DeliveryStreamExtendedS3DestinationConfigurationCompressionFormat compressionFormat) {
            this.compressionFormat = compressionFormat;
            return this;
        }
        public Builder dataFormatConversionConfiguration(@Nullable DeliveryStreamDataFormatConversionConfiguration dataFormatConversionConfiguration) {
            this.dataFormatConversionConfiguration = dataFormatConversionConfiguration;
            return this;
        }
        public Builder dynamicPartitioningConfiguration(@Nullable DeliveryStreamDynamicPartitioningConfiguration dynamicPartitioningConfiguration) {
            this.dynamicPartitioningConfiguration = dynamicPartitioningConfiguration;
            return this;
        }
        public Builder encryptionConfiguration(@Nullable DeliveryStreamEncryptionConfiguration encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }
        public Builder errorOutputPrefix(@Nullable String errorOutputPrefix) {
            this.errorOutputPrefix = errorOutputPrefix;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder processingConfiguration(@Nullable DeliveryStreamProcessingConfiguration processingConfiguration) {
            this.processingConfiguration = processingConfiguration;
            return this;
        }
        public Builder roleARN(String roleARN) {
            this.roleARN = Objects.requireNonNull(roleARN);
            return this;
        }
        public Builder s3BackupConfiguration(@Nullable DeliveryStreamS3DestinationConfiguration s3BackupConfiguration) {
            this.s3BackupConfiguration = s3BackupConfiguration;
            return this;
        }
        public Builder s3BackupMode(@Nullable DeliveryStreamExtendedS3DestinationConfigurationS3BackupMode s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }        public DeliveryStreamExtendedS3DestinationConfiguration build() {
            return new DeliveryStreamExtendedS3DestinationConfiguration(bucketARN, bufferingHints, cloudWatchLoggingOptions, compressionFormat, dataFormatConversionConfiguration, dynamicPartitioningConfiguration, encryptionConfiguration, errorOutputPrefix, prefix, processingConfiguration, roleARN, s3BackupConfiguration, s3BackupMode);
        }
    }
}
