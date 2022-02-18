// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.outputs.BucketServerSideEncryptionByDefault;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketServerSideEncryptionRule {
    /**
     * Specifies whether Amazon S3 should use an S3 Bucket Key with server-side encryption using KMS (SSE-KMS) for new objects in the bucket. Existing objects are not affected. Setting the BucketKeyEnabled element to true causes Amazon S3 to use an S3 Bucket Key. By default, S3 Bucket Key is not enabled.
     * 
     */
    private final @Nullable Boolean bucketKeyEnabled;
    private final @Nullable BucketServerSideEncryptionByDefault serverSideEncryptionByDefault;

    @OutputCustomType.Constructor({"bucketKeyEnabled","serverSideEncryptionByDefault"})
    private BucketServerSideEncryptionRule(
        @Nullable Boolean bucketKeyEnabled,
        @Nullable BucketServerSideEncryptionByDefault serverSideEncryptionByDefault) {
        this.bucketKeyEnabled = bucketKeyEnabled;
        this.serverSideEncryptionByDefault = serverSideEncryptionByDefault;
    }

    /**
     * Specifies whether Amazon S3 should use an S3 Bucket Key with server-side encryption using KMS (SSE-KMS) for new objects in the bucket. Existing objects are not affected. Setting the BucketKeyEnabled element to true causes Amazon S3 to use an S3 Bucket Key. By default, S3 Bucket Key is not enabled.
     * 
     */
    public Optional<Boolean> getBucketKeyEnabled() {
        return Optional.ofNullable(this.bucketKeyEnabled);
    }
    public Optional<BucketServerSideEncryptionByDefault> getServerSideEncryptionByDefault() {
        return Optional.ofNullable(this.serverSideEncryptionByDefault);
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

        public Builder setBucketKeyEnabled(@Nullable Boolean bucketKeyEnabled) {
            this.bucketKeyEnabled = bucketKeyEnabled;
            return this;
        }

        public Builder setServerSideEncryptionByDefault(@Nullable BucketServerSideEncryptionByDefault serverSideEncryptionByDefault) {
            this.serverSideEncryptionByDefault = serverSideEncryptionByDefault;
            return this;
        }

        public BucketServerSideEncryptionRule build() {
            return new BucketServerSideEncryptionRule(bucketKeyEnabled, serverSideEncryptionByDefault);
        }
    }
}
