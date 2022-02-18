// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketServerSideEncryptionByDefaultArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the default server-side encryption configuration.
 * 
 */
public final class BucketServerSideEncryptionRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketServerSideEncryptionRuleArgs Empty = new BucketServerSideEncryptionRuleArgs();

    /**
     * Specifies whether Amazon S3 should use an S3 Bucket Key with server-side encryption using KMS (SSE-KMS) for new objects in the bucket. Existing objects are not affected. Setting the BucketKeyEnabled element to true causes Amazon S3 to use an S3 Bucket Key. By default, S3 Bucket Key is not enabled.
     * 
     */
    @InputImport(name="bucketKeyEnabled")
    private final @Nullable Input<Boolean> bucketKeyEnabled;

    public Input<Boolean> getBucketKeyEnabled() {
        return this.bucketKeyEnabled == null ? Input.empty() : this.bucketKeyEnabled;
    }

    @InputImport(name="serverSideEncryptionByDefault")
    private final @Nullable Input<BucketServerSideEncryptionByDefaultArgs> serverSideEncryptionByDefault;

    public Input<BucketServerSideEncryptionByDefaultArgs> getServerSideEncryptionByDefault() {
        return this.serverSideEncryptionByDefault == null ? Input.empty() : this.serverSideEncryptionByDefault;
    }

    public BucketServerSideEncryptionRuleArgs(
        @Nullable Input<Boolean> bucketKeyEnabled,
        @Nullable Input<BucketServerSideEncryptionByDefaultArgs> serverSideEncryptionByDefault) {
        this.bucketKeyEnabled = bucketKeyEnabled;
        this.serverSideEncryptionByDefault = serverSideEncryptionByDefault;
    }

    private BucketServerSideEncryptionRuleArgs() {
        this.bucketKeyEnabled = Input.empty();
        this.serverSideEncryptionByDefault = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketServerSideEncryptionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> bucketKeyEnabled;
        private @Nullable Input<BucketServerSideEncryptionByDefaultArgs> serverSideEncryptionByDefault;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketServerSideEncryptionRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketKeyEnabled = defaults.bucketKeyEnabled;
    	      this.serverSideEncryptionByDefault = defaults.serverSideEncryptionByDefault;
        }

        public Builder setBucketKeyEnabled(@Nullable Input<Boolean> bucketKeyEnabled) {
            this.bucketKeyEnabled = bucketKeyEnabled;
            return this;
        }

        public Builder setBucketKeyEnabled(@Nullable Boolean bucketKeyEnabled) {
            this.bucketKeyEnabled = Input.ofNullable(bucketKeyEnabled);
            return this;
        }

        public Builder setServerSideEncryptionByDefault(@Nullable Input<BucketServerSideEncryptionByDefaultArgs> serverSideEncryptionByDefault) {
            this.serverSideEncryptionByDefault = serverSideEncryptionByDefault;
            return this;
        }

        public Builder setServerSideEncryptionByDefault(@Nullable BucketServerSideEncryptionByDefaultArgs serverSideEncryptionByDefault) {
            this.serverSideEncryptionByDefault = Input.ofNullable(serverSideEncryptionByDefault);
            return this;
        }

        public BucketServerSideEncryptionRuleArgs build() {
            return new BucketServerSideEncryptionRuleArgs(bucketKeyEnabled, serverSideEncryptionByDefault);
        }
    }
}
