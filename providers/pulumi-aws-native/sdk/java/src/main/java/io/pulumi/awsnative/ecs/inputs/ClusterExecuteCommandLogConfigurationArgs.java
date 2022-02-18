// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The session logging configuration for ExecuteCommand.
 * 
 */
public final class ClusterExecuteCommandLogConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterExecuteCommandLogConfigurationArgs Empty = new ClusterExecuteCommandLogConfigurationArgs();

    @InputImport(name="cloudWatchEncryptionEnabled")
    private final @Nullable Input<Boolean> cloudWatchEncryptionEnabled;

    public Input<Boolean> getCloudWatchEncryptionEnabled() {
        return this.cloudWatchEncryptionEnabled == null ? Input.empty() : this.cloudWatchEncryptionEnabled;
    }

    @InputImport(name="cloudWatchLogGroupName")
    private final @Nullable Input<String> cloudWatchLogGroupName;

    public Input<String> getCloudWatchLogGroupName() {
        return this.cloudWatchLogGroupName == null ? Input.empty() : this.cloudWatchLogGroupName;
    }

    @InputImport(name="s3BucketName")
    private final @Nullable Input<String> s3BucketName;

    public Input<String> getS3BucketName() {
        return this.s3BucketName == null ? Input.empty() : this.s3BucketName;
    }

    @InputImport(name="s3EncryptionEnabled")
    private final @Nullable Input<Boolean> s3EncryptionEnabled;

    public Input<Boolean> getS3EncryptionEnabled() {
        return this.s3EncryptionEnabled == null ? Input.empty() : this.s3EncryptionEnabled;
    }

    @InputImport(name="s3KeyPrefix")
    private final @Nullable Input<String> s3KeyPrefix;

    public Input<String> getS3KeyPrefix() {
        return this.s3KeyPrefix == null ? Input.empty() : this.s3KeyPrefix;
    }

    public ClusterExecuteCommandLogConfigurationArgs(
        @Nullable Input<Boolean> cloudWatchEncryptionEnabled,
        @Nullable Input<String> cloudWatchLogGroupName,
        @Nullable Input<String> s3BucketName,
        @Nullable Input<Boolean> s3EncryptionEnabled,
        @Nullable Input<String> s3KeyPrefix) {
        this.cloudWatchEncryptionEnabled = cloudWatchEncryptionEnabled;
        this.cloudWatchLogGroupName = cloudWatchLogGroupName;
        this.s3BucketName = s3BucketName;
        this.s3EncryptionEnabled = s3EncryptionEnabled;
        this.s3KeyPrefix = s3KeyPrefix;
    }

    private ClusterExecuteCommandLogConfigurationArgs() {
        this.cloudWatchEncryptionEnabled = Input.empty();
        this.cloudWatchLogGroupName = Input.empty();
        this.s3BucketName = Input.empty();
        this.s3EncryptionEnabled = Input.empty();
        this.s3KeyPrefix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterExecuteCommandLogConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> cloudWatchEncryptionEnabled;
        private @Nullable Input<String> cloudWatchLogGroupName;
        private @Nullable Input<String> s3BucketName;
        private @Nullable Input<Boolean> s3EncryptionEnabled;
        private @Nullable Input<String> s3KeyPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterExecuteCommandLogConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchEncryptionEnabled = defaults.cloudWatchEncryptionEnabled;
    	      this.cloudWatchLogGroupName = defaults.cloudWatchLogGroupName;
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3EncryptionEnabled = defaults.s3EncryptionEnabled;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
        }

        public Builder setCloudWatchEncryptionEnabled(@Nullable Input<Boolean> cloudWatchEncryptionEnabled) {
            this.cloudWatchEncryptionEnabled = cloudWatchEncryptionEnabled;
            return this;
        }

        public Builder setCloudWatchEncryptionEnabled(@Nullable Boolean cloudWatchEncryptionEnabled) {
            this.cloudWatchEncryptionEnabled = Input.ofNullable(cloudWatchEncryptionEnabled);
            return this;
        }

        public Builder setCloudWatchLogGroupName(@Nullable Input<String> cloudWatchLogGroupName) {
            this.cloudWatchLogGroupName = cloudWatchLogGroupName;
            return this;
        }

        public Builder setCloudWatchLogGroupName(@Nullable String cloudWatchLogGroupName) {
            this.cloudWatchLogGroupName = Input.ofNullable(cloudWatchLogGroupName);
            return this;
        }

        public Builder setS3BucketName(@Nullable Input<String> s3BucketName) {
            this.s3BucketName = s3BucketName;
            return this;
        }

        public Builder setS3BucketName(@Nullable String s3BucketName) {
            this.s3BucketName = Input.ofNullable(s3BucketName);
            return this;
        }

        public Builder setS3EncryptionEnabled(@Nullable Input<Boolean> s3EncryptionEnabled) {
            this.s3EncryptionEnabled = s3EncryptionEnabled;
            return this;
        }

        public Builder setS3EncryptionEnabled(@Nullable Boolean s3EncryptionEnabled) {
            this.s3EncryptionEnabled = Input.ofNullable(s3EncryptionEnabled);
            return this;
        }

        public Builder setS3KeyPrefix(@Nullable Input<String> s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }

        public Builder setS3KeyPrefix(@Nullable String s3KeyPrefix) {
            this.s3KeyPrefix = Input.ofNullable(s3KeyPrefix);
            return this;
        }

        public ClusterExecuteCommandLogConfigurationArgs build() {
            return new ClusterExecuteCommandLogConfigurationArgs(cloudWatchEncryptionEnabled, cloudWatchLogGroupName, s3BucketName, s3EncryptionEnabled, s3KeyPrefix);
        }
    }
}
