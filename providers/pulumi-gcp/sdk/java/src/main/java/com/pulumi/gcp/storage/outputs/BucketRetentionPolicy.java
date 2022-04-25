// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketRetentionPolicy {
    /**
     * @return If set to `true`, the bucket will be [locked](https://cloud.google.com/storage/docs/using-bucket-lock#lock-bucket) and permanently restrict edits to the bucket&#39;s retention policy.  Caution: Locking a bucket is an irreversible action.
     * 
     */
    private final @Nullable Boolean isLocked;
    /**
     * @return The period of time, in seconds, that objects in the bucket must be retained and cannot be deleted, overwritten, or archived. The value must be less than 2,147,483,647 seconds.
     * 
     */
    private final Integer retentionPeriod;

    @CustomType.Constructor
    private BucketRetentionPolicy(
        @CustomType.Parameter("isLocked") @Nullable Boolean isLocked,
        @CustomType.Parameter("retentionPeriod") Integer retentionPeriod) {
        this.isLocked = isLocked;
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * @return If set to `true`, the bucket will be [locked](https://cloud.google.com/storage/docs/using-bucket-lock#lock-bucket) and permanently restrict edits to the bucket&#39;s retention policy.  Caution: Locking a bucket is an irreversible action.
     * 
     */
    public Optional<Boolean> isLocked() {
        return Optional.ofNullable(this.isLocked);
    }
    /**
     * @return The period of time, in seconds, that objects in the bucket must be retained and cannot be deleted, overwritten, or archived. The value must be less than 2,147,483,647 seconds.
     * 
     */
    public Integer retentionPeriod() {
        return this.retentionPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketRetentionPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isLocked;
        private Integer retentionPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketRetentionPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isLocked = defaults.isLocked;
    	      this.retentionPeriod = defaults.retentionPeriod;
        }

        public Builder isLocked(@Nullable Boolean isLocked) {
            this.isLocked = isLocked;
            return this;
        }
        public Builder retentionPeriod(Integer retentionPeriod) {
            this.retentionPeriod = Objects.requireNonNull(retentionPeriod);
            return this;
        }        public BucketRetentionPolicy build() {
            return new BucketRetentionPolicy(isLocked, retentionPeriod);
        }
    }
}
