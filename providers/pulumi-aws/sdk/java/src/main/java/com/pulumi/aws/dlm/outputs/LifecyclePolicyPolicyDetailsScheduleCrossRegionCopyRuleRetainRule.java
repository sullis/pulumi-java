// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dlm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRule {
    /**
     * @return The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     * 
     */
    private final Integer interval;
    /**
     * @return The unit of time for time-based retention. Valid values: `DAYS`, `WEEKS`, `MONTHS`, or `YEARS`.
     * 
     */
    private final String intervalUnit;

    @CustomType.Constructor
    private LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRule(
        @CustomType.Parameter("interval") Integer interval,
        @CustomType.Parameter("intervalUnit") String intervalUnit) {
        this.interval = interval;
        this.intervalUnit = intervalUnit;
    }

    /**
     * @return The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     * 
     */
    public Integer interval() {
        return this.interval;
    }
    /**
     * @return The unit of time for time-based retention. Valid values: `DAYS`, `WEEKS`, `MONTHS`, or `YEARS`.
     * 
     */
    public String intervalUnit() {
        return this.intervalUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer interval;
        private String intervalUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interval = defaults.interval;
    	      this.intervalUnit = defaults.intervalUnit;
        }

        public Builder interval(Integer interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }
        public Builder intervalUnit(String intervalUnit) {
            this.intervalUnit = Objects.requireNonNull(intervalUnit);
            return this;
        }        public LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRule build() {
            return new LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRule(interval, intervalUnit);
        }
    }
}
