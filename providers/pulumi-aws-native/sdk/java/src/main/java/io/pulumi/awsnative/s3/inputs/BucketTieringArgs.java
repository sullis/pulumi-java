// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketTieringAccessTier;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class BucketTieringArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketTieringArgs Empty = new BucketTieringArgs();

    /**
     * S3 Intelligent-Tiering access tier. See Storage class for automatically optimizing frequently and infrequently accessed objects for a list of access tiers in the S3 Intelligent-Tiering storage class.
     * 
     */
    @InputImport(name="accessTier", required=true)
    private final Input<BucketTieringAccessTier> accessTier;

    public Input<BucketTieringAccessTier> getAccessTier() {
        return this.accessTier;
    }

    /**
     * The number of consecutive days of no access after which an object will be eligible to be transitioned to the corresponding tier. The minimum number of days specified for Archive Access tier must be at least 90 days and Deep Archive Access tier must be at least 180 days. The maximum can be up to 2 years (730 days).
     * 
     */
    @InputImport(name="days", required=true)
    private final Input<Integer> days;

    public Input<Integer> getDays() {
        return this.days;
    }

    public BucketTieringArgs(
        Input<BucketTieringAccessTier> accessTier,
        Input<Integer> days) {
        this.accessTier = Objects.requireNonNull(accessTier, "expected parameter 'accessTier' to be non-null");
        this.days = Objects.requireNonNull(days, "expected parameter 'days' to be non-null");
    }

    private BucketTieringArgs() {
        this.accessTier = Input.empty();
        this.days = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketTieringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<BucketTieringAccessTier> accessTier;
        private Input<Integer> days;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketTieringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessTier = defaults.accessTier;
    	      this.days = defaults.days;
        }

        public Builder setAccessTier(Input<BucketTieringAccessTier> accessTier) {
            this.accessTier = Objects.requireNonNull(accessTier);
            return this;
        }

        public Builder setAccessTier(BucketTieringAccessTier accessTier) {
            this.accessTier = Input.of(Objects.requireNonNull(accessTier));
            return this;
        }

        public Builder setDays(Input<Integer> days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }

        public Builder setDays(Integer days) {
            this.days = Input.of(Objects.requireNonNull(days));
            return this;
        }

        public BucketTieringArgs build() {
            return new BucketTieringArgs(accessTier, days);
        }
    }
}
