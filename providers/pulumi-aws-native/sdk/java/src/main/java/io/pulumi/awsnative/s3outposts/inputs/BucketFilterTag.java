// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3outposts.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Tag used to identify a subset of objects for an Amazon S3Outposts bucket.
 * 
 */
public final class BucketFilterTag extends io.pulumi.resources.InvokeArgs {

    public static final BucketFilterTag Empty = new BucketFilterTag();

    @Import(name="key", required=true)
      private final String key;

    public String key() {
        return this.key;
    }

    @Import(name="value", required=true)
      private final String value;

    public String value() {
        return this.value;
    }

    public BucketFilterTag(
        String key,
        String value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private BucketFilterTag() {
        this.key = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketFilterTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketFilterTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public BucketFilterTag build() {
            return new BucketFilterTag(key, value);
        }
    }
}
