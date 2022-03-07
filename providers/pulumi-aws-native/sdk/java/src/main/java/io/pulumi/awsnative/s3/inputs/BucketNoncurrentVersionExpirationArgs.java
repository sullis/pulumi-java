// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container for the expiration rule that describes when noncurrent objects are expired. If your bucket is versioning-enabled (or versioning is suspended), you can set this action to request that Amazon S3 expire noncurrent object versions at a specific period in the object's lifetime
 * 
 */
public final class BucketNoncurrentVersionExpirationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketNoncurrentVersionExpirationArgs Empty = new BucketNoncurrentVersionExpirationArgs();

    /**
     * Specified the number of newer noncurrent and current versions that must exists before performing the associated action
     * 
     */
    @InputImport(name="newerNoncurrentVersions")
      private final @Nullable Input<Integer> newerNoncurrentVersions;

    public Input<Integer> getNewerNoncurrentVersions() {
        return this.newerNoncurrentVersions == null ? Input.empty() : this.newerNoncurrentVersions;
    }

    /**
     * Specified the number of days an object is noncurrent before Amazon S3 can perform the associated action
     * 
     */
    @InputImport(name="noncurrentDays", required=true)
      private final Input<Integer> noncurrentDays;

    public Input<Integer> getNoncurrentDays() {
        return this.noncurrentDays;
    }

    public BucketNoncurrentVersionExpirationArgs(
        @Nullable Input<Integer> newerNoncurrentVersions,
        Input<Integer> noncurrentDays) {
        this.newerNoncurrentVersions = newerNoncurrentVersions;
        this.noncurrentDays = Objects.requireNonNull(noncurrentDays, "expected parameter 'noncurrentDays' to be non-null");
    }

    private BucketNoncurrentVersionExpirationArgs() {
        this.newerNoncurrentVersions = Input.empty();
        this.noncurrentDays = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketNoncurrentVersionExpirationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> newerNoncurrentVersions;
        private Input<Integer> noncurrentDays;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketNoncurrentVersionExpirationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.newerNoncurrentVersions = defaults.newerNoncurrentVersions;
    	      this.noncurrentDays = defaults.noncurrentDays;
        }

        public Builder setNewerNoncurrentVersions(@Nullable Input<Integer> newerNoncurrentVersions) {
            this.newerNoncurrentVersions = newerNoncurrentVersions;
            return this;
        }

        public Builder setNewerNoncurrentVersions(@Nullable Integer newerNoncurrentVersions) {
            this.newerNoncurrentVersions = Input.ofNullable(newerNoncurrentVersions);
            return this;
        }

        public Builder setNoncurrentDays(Input<Integer> noncurrentDays) {
            this.noncurrentDays = Objects.requireNonNull(noncurrentDays);
            return this;
        }

        public Builder setNoncurrentDays(Integer noncurrentDays) {
            this.noncurrentDays = Input.of(Objects.requireNonNull(noncurrentDays));
            return this;
        }
        public BucketNoncurrentVersionExpirationArgs build() {
            return new BucketNoncurrentVersionExpirationArgs(newerNoncurrentVersions, noncurrentDays);
        }
    }
}