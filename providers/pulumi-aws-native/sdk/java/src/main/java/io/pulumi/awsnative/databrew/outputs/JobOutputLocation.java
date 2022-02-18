// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobOutputLocation {
    private final String bucket;
    private final @Nullable String bucketOwner;
    private final @Nullable String key;

    @OutputCustomType.Constructor({"bucket","bucketOwner","key"})
    private JobOutputLocation(
        String bucket,
        @Nullable String bucketOwner,
        @Nullable String key) {
        this.bucket = Objects.requireNonNull(bucket);
        this.bucketOwner = bucketOwner;
        this.key = key;
    }

    public String getBucket() {
        return this.bucket;
    }
    public Optional<String> getBucketOwner() {
        return Optional.ofNullable(this.bucketOwner);
    }
    public Optional<String> getKey() {
        return Optional.ofNullable(this.key);
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

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setBucketOwner(@Nullable String bucketOwner) {
            this.bucketOwner = bucketOwner;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }

        public JobOutputLocation build() {
            return new JobOutputLocation(bucket, bucketOwner, key);
        }
    }
}
