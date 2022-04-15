// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamRedshiftDestinationConfigurationS3BackupMode;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamCloudWatchLoggingOptions;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamCopyCommand;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamProcessingConfiguration;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamRedshiftRetryOptions;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamS3DestinationConfiguration;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamRedshiftDestinationConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryStreamRedshiftDestinationConfiguration Empty = new DeliveryStreamRedshiftDestinationConfiguration();

    @Import(name="cloudWatchLoggingOptions")
      private final @Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions;

    public Optional<DeliveryStreamCloudWatchLoggingOptions> cloudWatchLoggingOptions() {
        return this.cloudWatchLoggingOptions == null ? Optional.empty() : Optional.ofNullable(this.cloudWatchLoggingOptions);
    }

    @Import(name="clusterJDBCURL", required=true)
      private final String clusterJDBCURL;

    public String clusterJDBCURL() {
        return this.clusterJDBCURL;
    }

    @Import(name="copyCommand", required=true)
      private final DeliveryStreamCopyCommand copyCommand;

    public DeliveryStreamCopyCommand copyCommand() {
        return this.copyCommand;
    }

    @Import(name="password", required=true)
      private final String password;

    public String password() {
        return this.password;
    }

    @Import(name="processingConfiguration")
      private final @Nullable DeliveryStreamProcessingConfiguration processingConfiguration;

    public Optional<DeliveryStreamProcessingConfiguration> processingConfiguration() {
        return this.processingConfiguration == null ? Optional.empty() : Optional.ofNullable(this.processingConfiguration);
    }

    @Import(name="retryOptions")
      private final @Nullable DeliveryStreamRedshiftRetryOptions retryOptions;

    public Optional<DeliveryStreamRedshiftRetryOptions> retryOptions() {
        return this.retryOptions == null ? Optional.empty() : Optional.ofNullable(this.retryOptions);
    }

    @Import(name="roleARN", required=true)
      private final String roleARN;

    public String roleARN() {
        return this.roleARN;
    }

    @Import(name="s3BackupConfiguration")
      private final @Nullable DeliveryStreamS3DestinationConfiguration s3BackupConfiguration;

    public Optional<DeliveryStreamS3DestinationConfiguration> s3BackupConfiguration() {
        return this.s3BackupConfiguration == null ? Optional.empty() : Optional.ofNullable(this.s3BackupConfiguration);
    }

    @Import(name="s3BackupMode")
      private final @Nullable DeliveryStreamRedshiftDestinationConfigurationS3BackupMode s3BackupMode;

    public Optional<DeliveryStreamRedshiftDestinationConfigurationS3BackupMode> s3BackupMode() {
        return this.s3BackupMode == null ? Optional.empty() : Optional.ofNullable(this.s3BackupMode);
    }

    @Import(name="s3Configuration", required=true)
      private final DeliveryStreamS3DestinationConfiguration s3Configuration;

    public DeliveryStreamS3DestinationConfiguration s3Configuration() {
        return this.s3Configuration;
    }

    @Import(name="username", required=true)
      private final String username;

    public String username() {
        return this.username;
    }

    public DeliveryStreamRedshiftDestinationConfiguration(
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
        this.clusterJDBCURL = Objects.requireNonNull(clusterJDBCURL, "expected parameter 'clusterJDBCURL' to be non-null");
        this.copyCommand = Objects.requireNonNull(copyCommand, "expected parameter 'copyCommand' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.processingConfiguration = processingConfiguration;
        this.retryOptions = retryOptions;
        this.roleARN = Objects.requireNonNull(roleARN, "expected parameter 'roleARN' to be non-null");
        this.s3BackupConfiguration = s3BackupConfiguration;
        this.s3BackupMode = s3BackupMode;
        this.s3Configuration = Objects.requireNonNull(s3Configuration, "expected parameter 's3Configuration' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private DeliveryStreamRedshiftDestinationConfiguration() {
        this.cloudWatchLoggingOptions = null;
        this.clusterJDBCURL = null;
        this.copyCommand = null;
        this.password = null;
        this.processingConfiguration = null;
        this.retryOptions = null;
        this.roleARN = null;
        this.s3BackupConfiguration = null;
        this.s3BackupMode = null;
        this.s3Configuration = null;
        this.username = null;
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

        public Builder cloudWatchLoggingOptions(@Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions) {
            this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
            return this;
        }
        public Builder clusterJDBCURL(String clusterJDBCURL) {
            this.clusterJDBCURL = Objects.requireNonNull(clusterJDBCURL);
            return this;
        }
        public Builder copyCommand(DeliveryStreamCopyCommand copyCommand) {
            this.copyCommand = Objects.requireNonNull(copyCommand);
            return this;
        }
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder processingConfiguration(@Nullable DeliveryStreamProcessingConfiguration processingConfiguration) {
            this.processingConfiguration = processingConfiguration;
            return this;
        }
        public Builder retryOptions(@Nullable DeliveryStreamRedshiftRetryOptions retryOptions) {
            this.retryOptions = retryOptions;
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
        public Builder s3BackupMode(@Nullable DeliveryStreamRedshiftDestinationConfigurationS3BackupMode s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }
        public Builder s3Configuration(DeliveryStreamS3DestinationConfiguration s3Configuration) {
            this.s3Configuration = Objects.requireNonNull(s3Configuration);
            return this;
        }
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }        public DeliveryStreamRedshiftDestinationConfiguration build() {
            return new DeliveryStreamRedshiftDestinationConfiguration(cloudWatchLoggingOptions, clusterJDBCURL, copyCommand, password, processingConfiguration, retryOptions, roleARN, s3BackupConfiguration, s3BackupMode, s3Configuration, username);
        }
    }
}
