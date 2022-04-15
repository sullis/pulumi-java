// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketServerSideEncryptionByDefault;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the default server-side encryption configuration.
 * 
 */
public final class BucketServerSideEncryptionRule extends io.pulumi.resources.InvokeArgs {

    public static final BucketServerSideEncryptionRule Empty = new BucketServerSideEncryptionRule();

    /**
     * Specifies whether Amazon S3 should use an S3 Bucket Key with server-side encryption using KMS (SSE-KMS) for new objects in the bucket. Existing objects are not affected. Setting the BucketKeyEnabled element to true causes Amazon S3 to use an S3 Bucket Key. By default, S3 Bucket Key is not enabled.
     * 
     */
    @Import(name="bucketKeyEnabled")
      private final @Nullable Boolean bucketKeyEnabled;

    public Optional<Boolean> bucketKeyEnabled() {
        return this.bucketKeyEnabled == null ? Optional.empty() : Optional.ofNullable(this.bucketKeyEnabled);
    }

    @Import(name="serverSideEncryptionByDefault")
      private final @Nullable BucketServerSideEncryptionByDefault serverSideEncryptionByDefault;

    public Optional<BucketServerSideEncryptionByDefault> serverSideEncryptionByDefault() {
        return this.serverSideEncryptionByDefault == null ? Optional.empty() : Optional.ofNullable(this.serverSideEncryptionByDefault);
    }

    public BucketServerSideEncryptionRule(
        @Nullable Boolean bucketKeyEnabled,
        @Nullable BucketServerSideEncryptionByDefault serverSideEncryptionByDefault) {
        this.bucketKeyEnabled = bucketKeyEnabled;
        this.serverSideEncryptionByDefault = serverSideEncryptionByDefault;
    }

    private BucketServerSideEncryptionRule() {
        this.bucketKeyEnabled = null;
        this.serverSideEncryptionByDefault = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketServerSideEncryptionRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean bucketKeyEnabled;
        private @Nullable BucketServerSideEncryptionByDefault serverSideEncryptionByDefault;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketServerSideEncryptionRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketKeyEnabled = defaults.bucketKeyEnabled;
    	      this.serverSideEncryptionByDefault = defaults.serverSideEncryptionByDefault;
        }

        public Builder bucketKeyEnabled(@Nullable Boolean bucketKeyEnabled) {
            this.bucketKeyEnabled = bucketKeyEnabled;
            return this;
        }
        public Builder serverSideEncryptionByDefault(@Nullable BucketServerSideEncryptionByDefault serverSideEncryptionByDefault) {
            this.serverSideEncryptionByDefault = serverSideEncryptionByDefault;
            return this;
        }        public BucketServerSideEncryptionRule build() {
            return new BucketServerSideEncryptionRule(bucketKeyEnabled, serverSideEncryptionByDefault);
        }
    }
}
