// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RecipeS3Location extends io.pulumi.resources.InvokeArgs {

    public static final RecipeS3Location Empty = new RecipeS3Location();

    @InputImport(name="bucket", required=true)
    private final String bucket;

    public String getBucket() {
        return this.bucket;
    }

    @InputImport(name="key")
    private final @Nullable String key;

    public Optional<String> getKey() {
        return this.key == null ? Optional.empty() : Optional.ofNullable(this.key);
    }

    public RecipeS3Location(
        String bucket,
        @Nullable String key) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.key = key;
    }

    private RecipeS3Location() {
        this.bucket = null;
        this.key = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecipeS3Location defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable String key;

        public Builder() {
    	      // Empty
        }

        public Builder(RecipeS3Location defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.key = defaults.key;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }

        public RecipeS3Location build() {
            return new RecipeS3Location(bucket, key);
        }
    }
}
