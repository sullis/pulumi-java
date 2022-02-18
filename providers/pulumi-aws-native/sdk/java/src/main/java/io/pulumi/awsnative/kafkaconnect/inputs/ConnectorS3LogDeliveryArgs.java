// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="bucket")
    private final @Nullable Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket == null ? Input.empty() : this.bucket;
    }

    /**
     * Specifies whether the logs get sent to the specified Amazon S3 destination.
     * 
     */
    @InputImport(name="enabled", required=true)
    private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
    }

    /**
     * The S3 prefix that is the destination for log delivery.
     * 
     */
    @InputImport(name="prefix")
    private final @Nullable Input<String> prefix;

    public Input<String> getPrefix() {
        return this.prefix == null ? Input.empty() : this.prefix;
    }

    public ConnectorS3LogDeliveryArgs(
        @Nullable Input<String> bucket,
        Input<Boolean> enabled,
        @Nullable Input<String> prefix) {
        this.bucket = bucket;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.prefix = prefix;
    }

    private ConnectorS3LogDeliveryArgs() {
        this.bucket = Input.empty();
        this.enabled = Input.empty();
        this.prefix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorS3LogDeliveryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bucket;
        private Input<Boolean> enabled;
        private @Nullable Input<String> prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorS3LogDeliveryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.enabled = defaults.enabled;
    	      this.prefix = defaults.prefix;
        }

        public Builder setBucket(@Nullable Input<String> bucket) {
            this.bucket = bucket;
            return this;
        }

        public Builder setBucket(@Nullable String bucket) {
            this.bucket = Input.ofNullable(bucket);
            return this;
        }

        public Builder setEnabled(Input<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Input.of(Objects.requireNonNull(enabled));
            return this;
        }

        public Builder setPrefix(@Nullable Input<String> prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = Input.ofNullable(prefix);
            return this;
        }

        public ConnectorS3LogDeliveryArgs build() {
            return new ConnectorS3LogDeliveryArgs(bucket, enabled, prefix);
        }
    }
}
