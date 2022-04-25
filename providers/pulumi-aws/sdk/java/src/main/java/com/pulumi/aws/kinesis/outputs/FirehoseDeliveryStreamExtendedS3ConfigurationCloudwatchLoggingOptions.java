// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions {
    /**
     * @return Enables or disables the logging. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * @return The CloudWatch group name for logging. This value is required if `enabled` is true.
     * 
     */
    private final @Nullable String logGroupName;
    /**
     * @return The CloudWatch log stream name for logging. This value is required if `enabled` is true.
     * 
     */
    private final @Nullable String logStreamName;

    @CustomType.Constructor
    private FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("logGroupName") @Nullable String logGroupName,
        @CustomType.Parameter("logStreamName") @Nullable String logStreamName) {
        this.enabled = enabled;
        this.logGroupName = logGroupName;
        this.logStreamName = logStreamName;
    }

    /**
     * @return Enables or disables the logging. Defaults to `false`.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The CloudWatch group name for logging. This value is required if `enabled` is true.
     * 
     */
    public Optional<String> logGroupName() {
        return Optional.ofNullable(this.logGroupName);
    }
    /**
     * @return The CloudWatch log stream name for logging. This value is required if `enabled` is true.
     * 
     */
    public Optional<String> logStreamName() {
        return Optional.ofNullable(this.logStreamName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String logGroupName;
        private @Nullable String logStreamName;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.logGroupName = defaults.logGroupName;
    	      this.logStreamName = defaults.logStreamName;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder logGroupName(@Nullable String logGroupName) {
            this.logGroupName = logGroupName;
            return this;
        }
        public Builder logStreamName(@Nullable String logStreamName) {
            this.logStreamName = logStreamName;
            return this;
        }        public FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions build() {
            return new FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions(enabled, logGroupName, logStreamName);
        }
    }
}
