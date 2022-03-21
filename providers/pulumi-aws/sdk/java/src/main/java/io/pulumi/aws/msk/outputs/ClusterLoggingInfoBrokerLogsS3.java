// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterLoggingInfoBrokerLogsS3 {
    /**
     * Name of the S3 bucket to deliver logs to.
     * 
     */
    private final @Nullable String bucket;
    /**
     * Indicates whether you want to enable or disable streaming broker logs to Cloudwatch Logs.
     * 
     */
    private final Boolean enabled;
    /**
     * Prefix to append to the folder name.
     * 
     */
    private final @Nullable String prefix;

    @CustomType.Constructor
    private ClusterLoggingInfoBrokerLogsS3(
        @CustomType.Parameter("bucket") @Nullable String bucket,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("prefix") @Nullable String prefix) {
        this.bucket = bucket;
        this.enabled = enabled;
        this.prefix = prefix;
    }

    /**
     * Name of the S3 bucket to deliver logs to.
     * 
    */
    public Optional<String> getBucket() {
        return Optional.ofNullable(this.bucket);
    }
    /**
     * Indicates whether you want to enable or disable streaming broker logs to Cloudwatch Logs.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * Prefix to append to the folder name.
     * 
    */
    public Optional<String> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLoggingInfoBrokerLogsS3 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bucket;
        private Boolean enabled;
        private @Nullable String prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterLoggingInfoBrokerLogsS3 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.enabled = defaults.enabled;
    	      this.prefix = defaults.prefix;
        }

        public Builder bucket(@Nullable String bucket) {
            this.bucket = bucket;
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }        public ClusterLoggingInfoBrokerLogsS3 build() {
            return new ClusterLoggingInfoBrokerLogsS3(bucket, enabled, prefix);
        }
    }
}
