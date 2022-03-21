// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class S3LocationS3Config {
    /**
     * Amazon Resource Names (ARN) of the IAM Role used to connect to the S3 Bucket.
     * 
     */
    private final String bucketAccessRoleArn;

    @CustomType.Constructor
    private S3LocationS3Config(@CustomType.Parameter("bucketAccessRoleArn") String bucketAccessRoleArn) {
        this.bucketAccessRoleArn = bucketAccessRoleArn;
    }

    /**
     * Amazon Resource Names (ARN) of the IAM Role used to connect to the S3 Bucket.
     * 
    */
    public String getBucketAccessRoleArn() {
        return this.bucketAccessRoleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(S3LocationS3Config defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketAccessRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(S3LocationS3Config defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketAccessRoleArn = defaults.bucketAccessRoleArn;
        }

        public Builder bucketAccessRoleArn(String bucketAccessRoleArn) {
            this.bucketAccessRoleArn = Objects.requireNonNull(bucketAccessRoleArn);
            return this;
        }        public S3LocationS3Config build() {
            return new S3LocationS3Config(bucketAccessRoleArn);
        }
    }
}
