// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketDefaultRetentionMode;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The default retention period that you want to apply to new objects placed in the specified bucket.
 * 
 */
public final class BucketDefaultRetentionArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketDefaultRetentionArgs Empty = new BucketDefaultRetentionArgs();

    @InputImport(name="days")
    private final @Nullable Input<Integer> days;

    public Input<Integer> getDays() {
        return this.days == null ? Input.empty() : this.days;
    }

    @InputImport(name="mode")
    private final @Nullable Input<BucketDefaultRetentionMode> mode;

    public Input<BucketDefaultRetentionMode> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    @InputImport(name="years")
    private final @Nullable Input<Integer> years;

    public Input<Integer> getYears() {
        return this.years == null ? Input.empty() : this.years;
    }

    public BucketDefaultRetentionArgs(
        @Nullable Input<Integer> days,
        @Nullable Input<BucketDefaultRetentionMode> mode,
        @Nullable Input<Integer> years) {
        this.days = days;
        this.mode = mode;
        this.years = years;
    }

    private BucketDefaultRetentionArgs() {
        this.days = Input.empty();
        this.mode = Input.empty();
        this.years = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketDefaultRetentionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> days;
        private @Nullable Input<BucketDefaultRetentionMode> mode;
        private @Nullable Input<Integer> years;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketDefaultRetentionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.mode = defaults.mode;
    	      this.years = defaults.years;
        }

        public Builder setDays(@Nullable Input<Integer> days) {
            this.days = days;
            return this;
        }

        public Builder setDays(@Nullable Integer days) {
            this.days = Input.ofNullable(days);
            return this;
        }

        public Builder setMode(@Nullable Input<BucketDefaultRetentionMode> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable BucketDefaultRetentionMode mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder setYears(@Nullable Input<Integer> years) {
            this.years = years;
            return this;
        }

        public Builder setYears(@Nullable Integer years) {
            this.years = Input.ofNullable(years);
            return this;
        }

        public BucketDefaultRetentionArgs build() {
            return new BucketDefaultRetentionArgs(days, mode, years);
        }
    }
}
