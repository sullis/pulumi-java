// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * S3 location of bot definitions zip file, if it's not defined inline in CloudFormation.
 * 
 */
public final class BotS3LocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotS3LocationArgs Empty = new BotS3LocationArgs();

    /**
     * An Amazon S3 bucket in the same AWS Region as your function. The bucket can be in a different AWS account.
     * 
     */
    @InputImport(name="s3Bucket", required=true)
    private final Input<String> s3Bucket;

    public Input<String> getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * The Amazon S3 key of the deployment package.
     * 
     */
    @InputImport(name="s3ObjectKey", required=true)
    private final Input<String> s3ObjectKey;

    public Input<String> getS3ObjectKey() {
        return this.s3ObjectKey;
    }

    /**
     * For versioned objects, the version of the deployment package object to use. If not specified, the current object version will be used.
     * 
     */
    @InputImport(name="s3ObjectVersion")
    private final @Nullable Input<String> s3ObjectVersion;

    public Input<String> getS3ObjectVersion() {
        return this.s3ObjectVersion == null ? Input.empty() : this.s3ObjectVersion;
    }

    public BotS3LocationArgs(
        Input<String> s3Bucket,
        Input<String> s3ObjectKey,
        @Nullable Input<String> s3ObjectVersion) {
        this.s3Bucket = Objects.requireNonNull(s3Bucket, "expected parameter 's3Bucket' to be non-null");
        this.s3ObjectKey = Objects.requireNonNull(s3ObjectKey, "expected parameter 's3ObjectKey' to be non-null");
        this.s3ObjectVersion = s3ObjectVersion;
    }

    private BotS3LocationArgs() {
        this.s3Bucket = Input.empty();
        this.s3ObjectKey = Input.empty();
        this.s3ObjectVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotS3LocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> s3Bucket;
        private Input<String> s3ObjectKey;
        private @Nullable Input<String> s3ObjectVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(BotS3LocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Bucket = defaults.s3Bucket;
    	      this.s3ObjectKey = defaults.s3ObjectKey;
    	      this.s3ObjectVersion = defaults.s3ObjectVersion;
        }

        public Builder setS3Bucket(Input<String> s3Bucket) {
            this.s3Bucket = Objects.requireNonNull(s3Bucket);
            return this;
        }

        public Builder setS3Bucket(String s3Bucket) {
            this.s3Bucket = Input.of(Objects.requireNonNull(s3Bucket));
            return this;
        }

        public Builder setS3ObjectKey(Input<String> s3ObjectKey) {
            this.s3ObjectKey = Objects.requireNonNull(s3ObjectKey);
            return this;
        }

        public Builder setS3ObjectKey(String s3ObjectKey) {
            this.s3ObjectKey = Input.of(Objects.requireNonNull(s3ObjectKey));
            return this;
        }

        public Builder setS3ObjectVersion(@Nullable Input<String> s3ObjectVersion) {
            this.s3ObjectVersion = s3ObjectVersion;
            return this;
        }

        public Builder setS3ObjectVersion(@Nullable String s3ObjectVersion) {
            this.s3ObjectVersion = Input.ofNullable(s3ObjectVersion);
            return this;
        }

        public BotS3LocationArgs build() {
            return new BotS3LocationArgs(s3Bucket, s3ObjectKey, s3ObjectVersion);
        }
    }
}
