// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectorS3LogDelivery {
    private final @Nullable String bucket;
    private final Boolean enabled;
    private final @Nullable String prefix;

    @OutputCustomType.Constructor({"bucket","enabled","prefix"})
    private ConnectorS3LogDelivery(
        @Nullable String bucket,
        Boolean enabled,
        @Nullable String prefix) {
        this.bucket = bucket;
        this.enabled = Objects.requireNonNull(enabled);
        this.prefix = prefix;
    }

    public Optional<String> getBucket() {
        return Optional.ofNullable(this.bucket);
    }
    public Boolean getEnabled() {
        return this.enabled;
    }
    public Optional<String> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorS3LogDelivery defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bucket;
        private Boolean enabled;
        private @Nullable String prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorS3LogDelivery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.enabled = defaults.enabled;
    	      this.prefix = defaults.prefix;
        }

        public Builder setBucket(@Nullable String bucket) {
            this.bucket = bucket;
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }

        public ConnectorS3LogDelivery build() {
            return new ConnectorS3LogDelivery(bucket, enabled, prefix);
        }
    }
}
