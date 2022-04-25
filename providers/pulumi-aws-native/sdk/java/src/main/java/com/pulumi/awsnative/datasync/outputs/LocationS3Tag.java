// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LocationS3Tag {
    /**
     * @return The key for an AWS resource tag.
     * 
     */
    private final String key;
    /**
     * @return The value for an AWS resource tag.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private LocationS3Tag(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("value") String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * @return The key for an AWS resource tag.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The value for an AWS resource tag.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationS3Tag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationS3Tag defaults) {
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
        }        public LocationS3Tag build() {
            return new LocationS3Tag(key, value);
        }
    }
}
