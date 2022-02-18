// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamCloudWatchLoggingOptions extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryStreamCloudWatchLoggingOptions Empty = new DeliveryStreamCloudWatchLoggingOptions();

    @InputImport(name="enabled")
    private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    @InputImport(name="logGroupName")
    private final @Nullable String logGroupName;

    public Optional<String> getLogGroupName() {
        return this.logGroupName == null ? Optional.empty() : Optional.ofNullable(this.logGroupName);
    }

    @InputImport(name="logStreamName")
    private final @Nullable String logStreamName;

    public Optional<String> getLogStreamName() {
        return this.logStreamName == null ? Optional.empty() : Optional.ofNullable(this.logStreamName);
    }

    public DeliveryStreamCloudWatchLoggingOptions(
        @Nullable Boolean enabled,
        @Nullable String logGroupName,
        @Nullable String logStreamName) {
        this.enabled = enabled;
        this.logGroupName = logGroupName;
        this.logStreamName = logStreamName;
    }

    private DeliveryStreamCloudWatchLoggingOptions() {
        this.enabled = null;
        this.logGroupName = null;
        this.logStreamName = null;
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
