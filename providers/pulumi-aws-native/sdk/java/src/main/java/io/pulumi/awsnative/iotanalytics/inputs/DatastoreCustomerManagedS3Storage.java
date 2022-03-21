// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatastoreCustomerManagedS3Storage extends io.pulumi.resources.InvokeArgs {

    public static final DatastoreCustomerManagedS3Storage Empty = new DatastoreCustomerManagedS3Storage();

    @Import(name="bucket", required=true)
      private final String bucket;

    public String getBucket() {
        return this.bucket;
    }

    @Import(name="keyPrefix")
      private final @Nullable String keyPrefix;

    public Optional<String> getKeyPrefix() {
        return this.keyPrefix == null ? Optional.empty() : Optional.ofNullable(this.keyPrefix);
    }

    public DatastoreCustomerManagedS3Storage(
        String bucket,
        @Nullable String keyPrefix) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.keyPrefix = keyPrefix;
    }

    private DatastoreCustomerManagedS3Storage() {
        this.bucket = null;
        this.keyPrefix = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastoreCustomerManagedS3Storage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable String keyPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(DatastoreCustomerManagedS3Storage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.keyPrefix = defaults.keyPrefix;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder keyPrefix(@Nullable String keyPrefix) {
            this.keyPrefix = keyPrefix;
            return this;
        }        public DatastoreCustomerManagedS3Storage build() {
            return new DatastoreCustomerManagedS3Storage(bucket, keyPrefix);
        }
    }
}
