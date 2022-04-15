// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Input location
 * 
 */
public final class DatasetS3Location extends io.pulumi.resources.InvokeArgs {

    public static final DatasetS3Location Empty = new DatasetS3Location();

    @Import(name="bucket", required=true)
      private final String bucket;

    public String bucket() {
        return this.bucket;
    }

    @Import(name="key")
      private final @Nullable String key;

    public Optional<String> key() {
        return this.key == null ? Optional.empty() : Optional.ofNullable(this.key);
    }

    public DatasetS3Location(
        String bucket,
        @Nullable String key) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.key = key;
    }

    private DatasetS3Location() {
        this.bucket = null;
        this.key = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetS3Location defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable String key;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetS3Location defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.key = defaults.key;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }        public DatasetS3Location build() {
            return new DatasetS3Location(bucket, key);
        }
    }
}
