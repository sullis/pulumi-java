// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterLoggingProperties extends io.pulumi.resources.InvokeArgs {

    public static final ClusterLoggingProperties Empty = new ClusterLoggingProperties();

    @Import(name="bucketName", required=true)
      private final String bucketName;

    public String bucketName() {
        return this.bucketName;
    }

    @Import(name="s3KeyPrefix")
      private final @Nullable String s3KeyPrefix;

    public Optional<String> s3KeyPrefix() {
        return this.s3KeyPrefix == null ? Optional.empty() : Optional.ofNullable(this.s3KeyPrefix);
    }

    public ClusterLoggingProperties(
        String bucketName,
        @Nullable String s3KeyPrefix) {
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.s3KeyPrefix = s3KeyPrefix;
    }

    private ClusterLoggingProperties() {
        this.bucketName = null;
        this.s3KeyPrefix = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLoggingProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private @Nullable String s3KeyPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterLoggingProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
        }

        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        public Builder s3KeyPrefix(@Nullable String s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }        public ClusterLoggingProperties build() {
            return new ClusterLoggingProperties(bucketName, s3KeyPrefix);
        }
    }
}
