// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container for the expiration rule that describes when noncurrent objects are expired. If your bucket is versioning-enabled (or versioning is suspended), you can set this action to request that Amazon S3 expire noncurrent object versions at a specific period in the object's lifetime
 * 
 */
public final class BucketNoncurrentVersionExpiration extends io.pulumi.resources.InvokeArgs {

    public static final BucketNoncurrentVersionExpiration Empty = new BucketNoncurrentVersionExpiration();

    /**
     * Specified the number of newer noncurrent and current versions that must exists before performing the associated action
     * 
     */
    @Import(name="newerNoncurrentVersions")
      private final @Nullable Integer newerNoncurrentVersions;

    public Optional<Integer> newerNoncurrentVersions() {
        return this.newerNoncurrentVersions == null ? Optional.empty() : Optional.ofNullable(this.newerNoncurrentVersions);
    }

    /**
     * Specified the number of days an object is noncurrent before Amazon S3 can perform the associated action
     * 
     */
    @Import(name="noncurrentDays", required=true)
      private final Integer noncurrentDays;

    public Integer noncurrentDays() {
        return this.noncurrentDays;
    }

    public BucketNoncurrentVersionExpiration(
        @Nullable Integer newerNoncurrentVersions,
        Integer noncurrentDays) {
        this.newerNoncurrentVersions = newerNoncurrentVersions;
        this.noncurrentDays = Objects.requireNonNull(noncurrentDays, "expected parameter 'noncurrentDays' to be non-null");
    }

    private BucketNoncurrentVersionExpiration() {
        this.newerNoncurrentVersions = null;
        this.noncurrentDays = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketNoncurrentVersionExpiration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer newerNoncurrentVersions;
        private Integer noncurrentDays;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketNoncurrentVersionExpiration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.newerNoncurrentVersions = defaults.newerNoncurrentVersions;
    	      this.noncurrentDays = defaults.noncurrentDays;
        }

        public Builder newerNoncurrentVersions(@Nullable Integer newerNoncurrentVersions) {
            this.newerNoncurrentVersions = newerNoncurrentVersions;
            return this;
        }
        public Builder noncurrentDays(Integer noncurrentDays) {
            this.noncurrentDays = Objects.requireNonNull(noncurrentDays);
            return this;
        }        public BucketNoncurrentVersionExpiration build() {
            return new BucketNoncurrentVersionExpiration(newerNoncurrentVersions, noncurrentDays);
        }
    }
}
