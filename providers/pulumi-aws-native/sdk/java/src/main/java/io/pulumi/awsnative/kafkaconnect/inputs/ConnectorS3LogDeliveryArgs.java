// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details about delivering logs to Amazon S3.
 * 
 */
public final class ConnectorS3LogDeliveryArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorS3LogDeliveryArgs Empty = new ConnectorS3LogDeliveryArgs();

    /**
     * The name of the S3 bucket that is the destination for log delivery.
     * 
     */
    @Import(name="bucket")
      private final @Nullable Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket == null ? Output.empty() : this.bucket;
    }

    /**
     * Specifies whether the logs get sent to the specified Amazon S3 destination.
     * 
     */
    @Import(name="enabled", required=true)
      private final Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled;
    }

    /**
     * The S3 prefix that is the destination for log delivery.
     * 
     */
    @Import(name="prefix")
      private final @Nullable Output<String> prefix;

    public Output<String> getPrefix() {
        return this.prefix == null ? Output.empty() : this.prefix;
    }

    public ConnectorS3LogDeliveryArgs(
        @Nullable Output<String> bucket,
        Output<Boolean> enabled,
        @Nullable Output<String> prefix) {
        this.bucket = bucket;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.prefix = prefix;
    }

    private ConnectorS3LogDeliveryArgs() {
        this.bucket = Output.empty();
        this.enabled = Output.empty();
        this.prefix = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorS3LogDeliveryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucket;
        private Output<Boolean> enabled;
        private @Nullable Output<String> prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorS3LogDeliveryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.enabled = defaults.enabled;
    	      this.prefix = defaults.prefix;
        }

        public Builder bucket(@Nullable Output<String> bucket) {
            this.bucket = bucket;
            return this;
        }
        public Builder bucket(@Nullable String bucket) {
            this.bucket = Output.ofNullable(bucket);
            return this;
        }
        public Builder enabled(Output<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Output.of(Objects.requireNonNull(enabled));
            return this;
        }
        public Builder prefix(@Nullable Output<String> prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = Output.ofNullable(prefix);
            return this;
        }        public ConnectorS3LogDeliveryArgs build() {
            return new ConnectorS3LogDeliveryArgs(bucket, enabled, prefix);
        }
    }
}
