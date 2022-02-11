// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DataSourceS3Path extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceS3Path Empty = new DataSourceS3Path();

    @InputImport(name="bucket", required=true)
    private final String bucket;

    public String getBucket() {
        return this.bucket;
    }

    @InputImport(name="key", required=true)
    private final String key;

    public String getKey() {
        return this.key;
    }

    public DataSourceS3Path(
        String bucket,
        String key) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
    }

    private DataSourceS3Path() {
        this.bucket = null;
        this.key = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceS3Path defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String key;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceS3Path defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.key = defaults.key;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public DataSourceS3Path build() {
            return new DataSourceS3Path(bucket, key);
        }
    }
}
