// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketLifecycleConfigurationRuleExpirationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleConfigurationRuleExpirationArgs Empty = new BucketLifecycleConfigurationRuleExpirationArgs();

    /**
     * Date the object is to be deleted. Should be in `YYYY-MM-DD` date format, e.g., `2020-09-30`.
     * 
     */
    @Import(name="date")
      private final @Nullable Output<String> date;

    public Output<String> date() {
        return this.date == null ? Codegen.empty() : this.date;
    }

    /**
     * Number of days before the object is to be deleted.
     * 
     */
    @Import(name="days")
      private final @Nullable Output<Integer> days;

    public Output<Integer> days() {
        return this.days == null ? Codegen.empty() : this.days;
    }

    /**
     * Enable to remove a delete marker with no noncurrent versions. Cannot be specified with `date` or `days`.
     * 
     */
    @Import(name="expiredObjectDeleteMarker")
      private final @Nullable Output<Boolean> expiredObjectDeleteMarker;

    public Output<Boolean> expiredObjectDeleteMarker() {
        return this.expiredObjectDeleteMarker == null ? Codegen.empty() : this.expiredObjectDeleteMarker;
    }

    public BucketLifecycleConfigurationRuleExpirationArgs(
        @Nullable Output<String> date,
        @Nullable Output<Integer> days,
        @Nullable Output<Boolean> expiredObjectDeleteMarker) {
        this.date = date;
        this.days = days;
        this.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
    }

    private BucketLifecycleConfigurationRuleExpirationArgs() {
        this.date = Codegen.empty();
        this.days = Codegen.empty();
        this.expiredObjectDeleteMarker = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleConfigurationRuleExpirationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> date;
        private @Nullable Output<Integer> days;
        private @Nullable Output<Boolean> expiredObjectDeleteMarker;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleConfigurationRuleExpirationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.date = defaults.date;
    	      this.days = defaults.days;
    	      this.expiredObjectDeleteMarker = defaults.expiredObjectDeleteMarker;
        }

        public Builder date(@Nullable Output<String> date) {
            this.date = date;
            return this;
        }
        public Builder date(@Nullable String date) {
            this.date = Codegen.ofNullable(date);
            return this;
        }
        public Builder days(@Nullable Output<Integer> days) {
            this.days = days;
            return this;
        }
        public Builder days(@Nullable Integer days) {
            this.days = Codegen.ofNullable(days);
            return this;
        }
        public Builder expiredObjectDeleteMarker(@Nullable Output<Boolean> expiredObjectDeleteMarker) {
            this.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
            return this;
        }
        public Builder expiredObjectDeleteMarker(@Nullable Boolean expiredObjectDeleteMarker) {
            this.expiredObjectDeleteMarker = Codegen.ofNullable(expiredObjectDeleteMarker);
            return this;
        }        public BucketLifecycleConfigurationRuleExpirationArgs build() {
            return new BucketLifecycleConfigurationRuleExpirationArgs(date, days, expiredObjectDeleteMarker);
        }
    }
}
