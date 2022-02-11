// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.outputs;

import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamExtendedS3DestinationConfigurationCompressionFormat;
import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamExtendedS3DestinationConfigurationS3BackupMode;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamBufferingHints;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamCloudWatchLoggingOptions;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamDataFormatConversionConfiguration;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamDynamicPartitioningConfiguration;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamEncryptionConfiguration;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamProcessingConfiguration;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamS3DestinationConfiguration;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeliveryStreamExtendedS3DestinationConfiguration {
    private final String bucketARN;
    private final @Nullable DeliveryStreamBufferingHints bufferingHints;
    private final @Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions;
    private final @Nullable DeliveryStreamExtendedS3DestinationConfigurationCompressionFormat compressionFormat;
    private final @Nullable DeliveryStreamDataFormatConversionConfiguration dataFormatConversionConfiguration;
    private final @Nullable DeliveryStreamDynamicPartitioningConfiguration dynamicPartitioningConfiguration;
    private final @Nullable DeliveryStreamEncryptionConfiguration encryptionConfiguration;
    private final @Nullable String errorOutputPrefix;
    private final @Nullable String prefix;
    private final @Nullable DeliveryStreamProcessingConfiguration processingConfiguration;
    private final String roleARN;
    private final @Nullable DeliveryStreamS3DestinationConfiguration s3BackupConfiguration;
    private final @Nullable DeliveryStreamExtendedS3DestinationConfigurationS3BackupMode s3BackupMode;

    @OutputCustomType.Constructor({"bucketARN","bufferingHints","cloudWatchLoggingOptions","compressionFormat","dataFormatConversionConfiguration","dynamicPartitioningConfiguration","encryptionConfiguration","errorOutputPrefix","prefix","processingConfiguration","roleARN","s3BackupConfiguration","s3BackupMode"})
    private DeliveryStreamExtendedS3DestinationConfiguration(
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
        this.bucketARN = Objects.requireNonNull(bucketARN);
        this.bufferingHints = bufferingHints;
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
        this.compressionFormat = compressionFormat;
        this.dataFormatConversionConfiguration = dataFormatConversionConfiguration;
        this.dynamicPartitioningConfiguration = dynamicPartitioningConfiguration;
        this.encryptionConfiguration = encryptionConfiguration;
        this.errorOutputPrefix = errorOutputPrefix;
        this.prefix = prefix;
        this.processingConfiguration = processingConfiguration;
        this.roleARN = Objects.requireNonNull(roleARN);
        this.s3BackupConfiguration = s3BackupConfiguration;
        this.s3BackupMode = s3BackupMode;
    }

    public String getBucketARN() {
        return this.bucketARN;
    }
    public Optional<DeliveryStreamBufferingHints> getBufferingHints() {
        return Optional.ofNullable(this.bufferingHints);
    }
    public Optional<DeliveryStreamCloudWatchLoggingOptions> getCloudWatchLoggingOptions() {
        return Optional.ofNullable(this.cloudWatchLoggingOptions);
    }
    public Optional<DeliveryStreamExtendedS3DestinationConfigurationCompressionFormat> getCompressionFormat() {
        return Optional.ofNullable(this.compressionFormat);
    }
    public Optional<DeliveryStreamDataFormatConversionConfiguration> getDataFormatConversionConfiguration() {
        return Optional.ofNullable(this.dataFormatConversionConfiguration);
    }
    public Optional<DeliveryStreamDynamicPartitioningConfiguration> getDynamicPartitioningConfiguration() {
        return Optional.ofNullable(this.dynamicPartitioningConfiguration);
    }
    public Optional<DeliveryStreamEncryptionConfiguration> getEncryptionConfiguration() {
        return Optional.ofNullable(this.encryptionConfiguration);
    }
    public Optional<String> getErrorOutputPrefix() {
        return Optional.ofNullable(this.errorOutputPrefix);
    }
    public Optional<String> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }
    public Optional<DeliveryStreamProcessingConfiguration> getProcessingConfiguration() {
        return Optional.ofNullable(this.processingConfiguration);
    }
    public String getRoleARN() {
        return this.roleARN;
    }
    public Optional<DeliveryStreamS3DestinationConfiguration> getS3BackupConfiguration() {
        return Optional.ofNullable(this.s3BackupConfiguration);
    }
    public Optional<DeliveryStreamExtendedS3DestinationConfigurationS3BackupMode> getS3BackupMode() {
        return Optional.ofNullable(this.s3BackupMode);
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

        public Builder setBucketARN(String bucketARN) {
            this.bucketARN = Objects.requireNonNull(bucketARN);
            return this;
        }

        public Builder setBufferingHints(@Nullable DeliveryStreamBufferingHints bufferingHints) {
            this.bufferingHints = bufferingHints;
            return this;
        }

        public Builder setCloudWatchLoggingOptions(@Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions) {
            this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
            return this;
        }

        public Builder setCompressionFormat(@Nullable DeliveryStreamExtendedS3DestinationConfigurationCompressionFormat compressionFormat) {
            this.compressionFormat = compressionFormat;
            return this;
        }

        public Builder setDataFormatConversionConfiguration(@Nullable DeliveryStreamDataFormatConversionConfiguration dataFormatConversionConfiguration) {
            this.dataFormatConversionConfiguration = dataFormatConversionConfiguration;
            return this;
        }

        public Builder setDynamicPartitioningConfiguration(@Nullable DeliveryStreamDynamicPartitioningConfiguration dynamicPartitioningConfiguration) {
            this.dynamicPartitioningConfiguration = dynamicPartitioningConfiguration;
            return this;
        }

        public Builder setEncryptionConfiguration(@Nullable DeliveryStreamEncryptionConfiguration encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        public Builder setErrorOutputPrefix(@Nullable String errorOutputPrefix) {
            this.errorOutputPrefix = errorOutputPrefix;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setProcessingConfiguration(@Nullable DeliveryStreamProcessingConfiguration processingConfiguration) {
            this.processingConfiguration = processingConfiguration;
            return this;
        }

        public Builder setRoleARN(String roleARN) {
            this.roleARN = Objects.requireNonNull(roleARN);
            return this;
        }

        public Builder setS3BackupConfiguration(@Nullable DeliveryStreamS3DestinationConfiguration s3BackupConfiguration) {
            this.s3BackupConfiguration = s3BackupConfiguration;
            return this;
        }

        public Builder setS3BackupMode(@Nullable DeliveryStreamExtendedS3DestinationConfigurationS3BackupMode s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }

        public DeliveryStreamExtendedS3DestinationConfiguration build() {
            return new DeliveryStreamExtendedS3DestinationConfiguration(bucketARN, bufferingHints, cloudWatchLoggingOptions, compressionFormat, dataFormatConversionConfiguration, dynamicPartitioningConfiguration, encryptionConfiguration, errorOutputPrefix, prefix, processingConfiguration, roleARN, s3BackupConfiguration, s3BackupMode);
        }
    }
}
