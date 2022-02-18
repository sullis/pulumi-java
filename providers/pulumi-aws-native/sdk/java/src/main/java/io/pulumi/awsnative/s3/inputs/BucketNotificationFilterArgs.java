// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketS3KeyFilterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * Specifies object key name filtering rules.
 * 
 */
public final class BucketNotificationFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketNotificationFilterArgs Empty = new BucketNotificationFilterArgs();

    @InputImport(name="s3Key", required=true)
    private final Input<BucketS3KeyFilterArgs> s3Key;

    public Input<BucketS3KeyFilterArgs> getS3Key() {
        return this.s3Key;
    }

    public BucketNotificationFilterArgs(Input<BucketS3KeyFilterArgs> s3Key) {
        this.s3Key = Objects.requireNonNull(s3Key, "expected parameter 's3Key' to be non-null");
    }

    private BucketNotificationFilterArgs() {
        this.s3Key = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketNotificationFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<BucketS3KeyFilterArgs> s3Key;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketNotificationFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Key = defaults.s3Key;
        }

        public Builder setS3Key(Input<BucketS3KeyFilterArgs> s3Key) {
            this.s3Key = Objects.requireNonNull(s3Key);
            return this;
        }

        public Builder setS3Key(BucketS3KeyFilterArgs s3Key) {
            this.s3Key = Input.of(Objects.requireNonNull(s3Key));
            return this;
        }

        public BucketNotificationFilterArgs build() {
            return new BucketNotificationFilterArgs(s3Key);
        }
    }
}
