// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobOutputLocation {
    private final String bucket;
    private final @Nullable String bucketOwner;
    private final @Nullable String key;

    @CustomType.Constructor
    private JobOutputLocation(
        @CustomType.Parameter("bucket") String bucket,
        @CustomType.Parameter("bucketOwner") @Nullable String bucketOwner,
        @CustomType.Parameter("key") @Nullable String key) {
        this.bucket = bucket;
        this.bucketOwner = bucketOwner;
        this.key = key;
    }

    public String bucket() {
        return this.bucket;
    }
    public Optional<String> bucketOwner() {
        return Optional.ofNullable(this.bucketOwner);
    }
    public Optional<String> key() {
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
