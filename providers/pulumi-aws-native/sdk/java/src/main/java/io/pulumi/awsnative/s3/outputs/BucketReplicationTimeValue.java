// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class BucketReplicationTimeValue {
    private final Integer minutes;

    @CustomType.Constructor
    private BucketReplicationTimeValue(@CustomType.Parameter("minutes") Integer minutes) {
        this.minutes = minutes;
    }

    public Integer minutes() {
        return this.minutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationTimeValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer minutes;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationTimeValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minutes = defaults.minutes;
        }

        public Builder minutes(Integer minutes) {
            this.minutes = Objects.requireNonNull(minutes);
            return this;
        }        public BucketReplicationTimeValue build() {
            return new BucketReplicationTimeValue(minutes);
        }
    }
}
