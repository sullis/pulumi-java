// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The bucket&#39;s retention policy. The retention policy enforces a minimum retention time for all objects contained in the bucket, based on their creation time. Any attempt to overwrite or delete objects younger than the retention period will result in a PERMISSION_DENIED error. An unlocked retention policy can be modified or removed from the bucket via a storage.buckets.update operation. A locked retention policy cannot be removed or shortened in duration for the lifetime of the bucket. Attempting to remove or decrease period of a locked retention policy will result in a PERMISSION_DENIED error.
 * 
 */
public final class BucketRetentionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketRetentionPolicyArgs Empty = new BucketRetentionPolicyArgs();

    /**
     * Server-determined value that indicates the time from which policy was enforced and effective. This value is in RFC 3339 format.
     * 
     */
    @Import(name="effectiveTime")
    private @Nullable Output<String> effectiveTime;

    /**
     * @return Server-determined value that indicates the time from which policy was enforced and effective. This value is in RFC 3339 format.
     * 
     */
    public Optional<Output<String>> effectiveTime() {
        return Optional.ofNullable(this.effectiveTime);
    }

    /**
     * Once locked, an object retention policy cannot be modified.
     * 
     */
    @Import(name="isLocked")
    private @Nullable Output<Boolean> isLocked;

    /**
     * @return Once locked, an object retention policy cannot be modified.
     * 
     */
    public Optional<Output<Boolean>> isLocked() {
        return Optional.ofNullable(this.isLocked);
    }

    /**
     * The duration in seconds that objects need to be retained. Retention duration must be greater than zero and less than 100 years. Note that enforcement of retention periods less than a day is not guaranteed. Such periods should only be used for testing purposes.
     * 
     */
    @Import(name="retentionPeriod")
    private @Nullable Output<String> retentionPeriod;

    /**
     * @return The duration in seconds that objects need to be retained. Retention duration must be greater than zero and less than 100 years. Note that enforcement of retention periods less than a day is not guaranteed. Such periods should only be used for testing purposes.
     * 
     */
    public Optional<Output<String>> retentionPeriod() {
        return Optional.ofNullable(this.retentionPeriod);
    }

    private BucketRetentionPolicyArgs() {}

    private BucketRetentionPolicyArgs(BucketRetentionPolicyArgs $) {
        this.effectiveTime = $.effectiveTime;
        this.isLocked = $.isLocked;
        this.retentionPeriod = $.retentionPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketRetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketRetentionPolicyArgs $;

        public Builder() {
            $ = new BucketRetentionPolicyArgs();
        }

        public Builder(BucketRetentionPolicyArgs defaults) {
            $ = new BucketRetentionPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param effectiveTime Server-determined value that indicates the time from which policy was enforced and effective. This value is in RFC 3339 format.
         * 
         * @return builder
         * 
         */
        public Builder effectiveTime(@Nullable Output<String> effectiveTime) {
            $.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * @param effectiveTime Server-determined value that indicates the time from which policy was enforced and effective. This value is in RFC 3339 format.
         * 
         * @return builder
         * 
         */
        public Builder effectiveTime(String effectiveTime) {
            return effectiveTime(Output.of(effectiveTime));
        }

        /**
         * @param isLocked Once locked, an object retention policy cannot be modified.
         * 
         * @return builder
         * 
         */
        public Builder isLocked(@Nullable Output<Boolean> isLocked) {
            $.isLocked = isLocked;
            return this;
        }

        /**
         * @param isLocked Once locked, an object retention policy cannot be modified.
         * 
         * @return builder
         * 
         */
        public Builder isLocked(Boolean isLocked) {
            return isLocked(Output.of(isLocked));
        }

        /**
         * @param retentionPeriod The duration in seconds that objects need to be retained. Retention duration must be greater than zero and less than 100 years. Note that enforcement of retention periods less than a day is not guaranteed. Such periods should only be used for testing purposes.
         * 
         * @return builder
         * 
         */
        public Builder retentionPeriod(@Nullable Output<String> retentionPeriod) {
            $.retentionPeriod = retentionPeriod;
            return this;
        }

        /**
         * @param retentionPeriod The duration in seconds that objects need to be retained. Retention duration must be greater than zero and less than 100 years. Note that enforcement of retention periods less than a day is not guaranteed. Such periods should only be used for testing purposes.
         * 
         * @return builder
         * 
         */
        public Builder retentionPeriod(String retentionPeriod) {
            return retentionPeriod(Output.of(retentionPeriod));
        }

        public BucketRetentionPolicyArgs build() {
            return $;
        }
    }

}
