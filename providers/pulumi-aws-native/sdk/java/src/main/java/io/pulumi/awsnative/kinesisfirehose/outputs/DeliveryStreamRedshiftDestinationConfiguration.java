// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.outputs;

import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamRedshiftDestinationConfigurationS3BackupMode;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamCloudWatchLoggingOptions;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamCopyCommand;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamProcessingConfiguration;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamRedshiftRetryOptions;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamS3DestinationConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeliveryStreamRedshiftDestinationConfiguration {
    private final @Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions;
    private final String clusterJDBCURL;
    private final DeliveryStreamCopyCommand copyCommand;
    private final String password;
    private final @Nullable DeliveryStreamProcessingConfiguration processingConfiguration;
    private final @Nullable DeliveryStreamRedshiftRetryOptions retryOptions;
    private final String roleARN;
    private final @Nullable DeliveryStreamS3DestinationConfiguration s3BackupConfiguration;
    private final @Nullable DeliveryStreamRedshiftDestinationConfigurationS3BackupMode s3BackupMode;
    private final DeliveryStreamS3DestinationConfiguration s3Configuration;
    private final String username;

    @OutputCustomType.Constructor({"cloudWatchLoggingOptions","clusterJDBCURL","copyCommand","password","processingConfiguration","retryOptions","roleARN","s3BackupConfiguration","s3BackupMode","s3Configuration","username"})
    private DeliveryStreamRedshiftDestinationConfiguration(
        @Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions,
        String clusterJDBCURL,
        DeliveryStreamCopyCommand copyCommand,
        String password,
        @Nullable DeliveryStreamProcessingConfiguration processingConfiguration,
        @Nullable DeliveryStreamRedshiftRetryOptions retryOptions,
        String roleARN,
        @Nullable DeliveryStreamS3DestinationConfiguration s3BackupConfiguration,
        @Nullable DeliveryStreamRedshiftDestinationConfigurationS3BackupMode s3BackupMode,
        DeliveryStreamS3DestinationConfiguration s3Configuration,
        String username) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
        this.clusterJDBCURL = Objects.requireNonNull(clusterJDBCURL);
        this.copyCommand = Objects.requireNonNull(copyCommand);
        this.password = Objects.requireNonNull(password);
        this.processingConfiguration = processingConfiguration;
        this.retryOptions = retryOptions;
        this.roleARN = Objects.requireNonNull(roleARN);
        this.s3BackupConfiguration = s3BackupConfiguration;
        this.s3BackupMode = s3BackupMode;
        this.s3Configuration = Objects.requireNonNull(s3Configuration);
        this.username = Objects.requireNonNull(username);
    }

    public Optional<DeliveryStreamCloudWatchLoggingOptions> getCloudWatchLoggingOptions() {
        return Optional.ofNullable(this.cloudWatchLoggingOptions);
    }
    public String getClusterJDBCURL() {
        return this.clusterJDBCURL;
    }
    public DeliveryStreamCopyCommand getCopyCommand() {
        return this.copyCommand;
    }
    public String getPassword() {
        return this.password;
    }
    public Optional<DeliveryStreamProcessingConfiguration> getProcessingConfiguration() {
        return Optional.ofNullable(this.processingConfiguration);
    }
    public Optional<DeliveryStreamRedshiftRetryOptions> getRetryOptions() {
        return Optional.ofNullable(this.retryOptions);
    }
    public String getRoleARN() {
        return this.roleARN;
    }
    public Optional<DeliveryStreamS3DestinationConfiguration> getS3BackupConfiguration() {
        return Optional.ofNullable(this.s3BackupConfiguration);
    }
    public Optional<DeliveryStreamRedshiftDestinationConfigurationS3BackupMode> getS3BackupMode() {
        return Optional.ofNullable(this.s3BackupMode);
    }
    public DeliveryStreamS3DestinationConfiguration getS3Configuration() {
        return this.s3Configuration;
    }
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamRedshiftDestinationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions;
        private String clusterJDBCURL;
        private DeliveryStreamCopyCommand copyCommand;
        private String password;
        private @Nullable DeliveryStreamProcessingConfiguration processingConfiguration;
        private @Nullable DeliveryStreamRedshiftRetryOptions retryOptions;
        private String roleARN;
        private @Nullable DeliveryStreamS3DestinationConfiguration s3BackupConfiguration;
        private @Nullable DeliveryStreamRedshiftDestinationConfigurationS3BackupMode s3BackupMode;
        private DeliveryStreamS3DestinationConfiguration s3Configuration;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamRedshiftDestinationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchLoggingOptions = defaults.cloudWatchLoggingOptions;
    	      this.clusterJDBCURL = defaults.clusterJDBCURL;
    	      this.copyCommand = defaults.copyCommand;
    	      this.password = defaults.password;
    	      this.processingConfiguration = defaults.processingConfiguration;
    	      this.retryOptions = defaults.retryOptions;
    	      this.roleARN = defaults.roleARN;
    	      this.s3BackupConfiguration = defaults.s3BackupConfiguration;
    	      this.s3BackupMode = defaults.s3BackupMode;
    	      this.s3Configuration = defaults.s3Configuration;
    	      this.username = defaults.username;
        }

        public Builder setCloudWatchLoggingOptions(@Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions) {
            this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
            return this;
        }

        public Builder setClusterJDBCURL(String clusterJDBCURL) {
            this.clusterJDBCURL = Objects.requireNonNull(clusterJDBCURL);
            return this;
        }

        public Builder setCopyCommand(DeliveryStreamCopyCommand copyCommand) {
            this.copyCommand = Objects.requireNonNull(copyCommand);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setProcessingConfiguration(@Nullable DeliveryStreamProcessingConfiguration processingConfiguration) {
            this.processingConfiguration = processingConfiguration;
            return this;
        }

        public Builder setRetryOptions(@Nullable DeliveryStreamRedshiftRetryOptions retryOptions) {
            this.retryOptions = retryOptions;
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

        public Builder setS3BackupMode(@Nullable DeliveryStreamRedshiftDestinationConfigurationS3BackupMode s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }

        public Builder setS3Configuration(DeliveryStreamS3DestinationConfiguration s3Configuration) {
            this.s3Configuration = Objects.requireNonNull(s3Configuration);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public DeliveryStreamRedshiftDestinationConfiguration build() {
            return new DeliveryStreamRedshiftDestinationConfiguration(cloudWatchLoggingOptions, clusterJDBCURL, copyCommand, password, processingConfiguration, retryOptions, roleARN, s3BackupConfiguration, s3BackupMode, s3Configuration, username);
        }
    }
}
