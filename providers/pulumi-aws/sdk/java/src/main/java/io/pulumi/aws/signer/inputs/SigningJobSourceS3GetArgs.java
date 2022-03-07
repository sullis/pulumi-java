// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class SigningJobSourceS3GetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SigningJobSourceS3GetArgs Empty = new SigningJobSourceS3GetArgs();

    /**
     * Name of the S3 bucket.
     * 
     */
    @InputImport(name="bucket", required=true)
      private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    /**
     * Key name of the bucket object that contains your unsigned code.
     * 
     */
    @InputImport(name="key", required=true)
      private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    /**
     * Version of your source image in your version enabled S3 bucket.
     * 
     */
    @InputImport(name="version", required=true)
      private final Input<String> version;

    public Input<String> getVersion() {
        return this.version;
    }

    public SigningJobSourceS3GetArgs(
        Input<String> bucket,
        Input<String> key,
        Input<String> version) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private SigningJobSourceS3GetArgs() {
        this.bucket = Input.empty();
        this.key = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningJobSourceS3GetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucket;
        private Input<String> key;
        private Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningJobSourceS3GetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.key = defaults.key;
    	      this.version = defaults.version;
        }

        public Builder setBucket(Input<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Input.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder setKey(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder setVersion(Input<String> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Input.of(Objects.requireNonNull(version));
            return this;
        }
        public SigningJobSourceS3GetArgs build() {
            return new SigningJobSourceS3GetArgs(bucket, key, version);
        }
    }
}