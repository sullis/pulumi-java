// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeliveryStreamCloudWatchLoggingOptions {
    private final @Nullable Boolean enabled;
    private final @Nullable String logGroupName;
    private final @Nullable String logStreamName;

    @OutputCustomType.Constructor
    private DeliveryStreamCloudWatchLoggingOptions(
        @OutputCustomType.Parameter("enabled") @Nullable Boolean enabled,
        @OutputCustomType.Parameter("logGroupName") @Nullable String logGroupName,
        @OutputCustomType.Parameter("logStreamName") @Nullable String logStreamName) {
        this.enabled = enabled;
        this.logGroupName = logGroupName;
        this.logStreamName = logStreamName;
    }

    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<String> getLogGroupName() {
        return Optional.ofNullable(this.logGroupName);
    }
    public Optional<String> getLogStreamName() {
        return Optional.ofNullable(this.logStreamName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamCloudWatchLoggingOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String logGroupName;
        private @Nullable String logStreamName;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamCloudWatchLoggingOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.logGroupName = defaults.logGroupName;
    	      this.logStreamName = defaults.logStreamName;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setLogGroupName(@Nullable String logGroupName) {
            this.logGroupName = logGroupName;
            return this;
        }

        public Builder setLogStreamName(@Nullable String logStreamName) {
            this.logStreamName = logStreamName;
            return this;
        }
        public DeliveryStreamCloudWatchLoggingOptions build() {
            return new DeliveryStreamCloudWatchLoggingOptions(enabled, logGroupName, logStreamName);
        }
    }
}
