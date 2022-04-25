// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class BucketReplicationConfigRuleDestinationMetricsEventThreshold {
    /**
     * @return Time in minutes. Valid values: `15`.
     * 
     */
    private final Integer minutes;

    @CustomType.Constructor
    private BucketReplicationConfigRuleDestinationMetricsEventThreshold(@CustomType.Parameter("minutes") Integer minutes) {
        this.minutes = minutes;
    }

    /**
     * @return Time in minutes. Valid values: `15`.
     * 
     */
    public Integer minutes() {
        return this.minutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleDestinationMetricsEventThreshold defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer minutes;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleDestinationMetricsEventThreshold defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minutes = defaults.minutes;
        }

        public Builder minutes(Integer minutes) {
            this.minutes = Objects.requireNonNull(minutes);
            return this;
        }        public BucketReplicationConfigRuleDestinationMetricsEventThreshold build() {
            return new BucketReplicationConfigRuleDestinationMetricsEventThreshold(minutes);
        }
    }
}
