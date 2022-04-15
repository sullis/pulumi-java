// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Output location
 * 
 */
public final class JobOutputLocation extends io.pulumi.resources.InvokeArgs {

    public static final JobOutputLocation Empty = new JobOutputLocation();

    @Import(name="bucket", required=true)
      private final String bucket;

    public String bucket() {
        return this.bucket;
    }

    @Import(name="bucketOwner")
      private final @Nullable String bucketOwner;

    public Optional<String> bucketOwner() {
        return this.bucketOwner == null ? Optional.empty() : Optional.ofNullable(this.bucketOwner);
    }

    @Import(name="key")
      private final @Nullable String key;

    public Optional<String> key() {
        return this.key == null ? Optional.empty() : Optional.ofNullable(this.key);
    }

    public JobOutputLocation(
        String bucket,
        @Nullable String bucketOwner,
        @Nullable String key) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.bucketOwner = bucketOwner;
        this.key = key;
    }

    private JobOutputLocation() {
        this.bucket = null;
        this.bucketOwner = null;
        this.key = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobOutputLocation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable String bucketOwner;
        private @Nullable String key;

        public Builder() {
    	      // Empty
        }

        public Builder(JobOutputLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.bucketOwner = defaults.bucketOwner;
    	      this.key = defaults.key;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder bucketOwner(@Nullable String bucketOwner) {
            this.bucketOwner = bucketOwner;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }        public JobOutputLocation build() {
            return new JobOutputLocation(bucket, bucketOwner, key);
        }
    }
}
