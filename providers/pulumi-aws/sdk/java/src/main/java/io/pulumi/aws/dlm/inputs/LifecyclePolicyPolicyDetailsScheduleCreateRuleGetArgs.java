// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dlm.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LifecyclePolicyPolicyDetailsScheduleCreateRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final LifecyclePolicyPolicyDetailsScheduleCreateRuleGetArgs Empty = new LifecyclePolicyPolicyDetailsScheduleCreateRuleGetArgs();

    /**
     * The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     * 
     */
    @Import(name="interval", required=true)
      private final Output<Integer> interval;

    public Output<Integer> getInterval() {
        return this.interval;
    }

    /**
     * The unit of time for time-based retention. Valid values: `DAYS`, `WEEKS`, `MONTHS`, or `YEARS`.
     * 
     */
    @Import(name="intervalUnit")
      private final @Nullable Output<String> intervalUnit;

    public Output<String> getIntervalUnit() {
        return this.intervalUnit == null ? Output.empty() : this.intervalUnit;
    }

    /**
     * A list of times in 24 hour clock format that sets when the lifecycle policy should be evaluated. Max of 1.
     * 
     */
    @Import(name="times")
      private final @Nullable Output<String> times;

    public Output<String> getTimes() {
        return this.times == null ? Output.empty() : this.times;
    }

    public LifecyclePolicyPolicyDetailsScheduleCreateRuleGetArgs(
        Output<Integer> interval,
        @Nullable Output<String> intervalUnit,
        @Nullable Output<String> times) {
        this.interval = Objects.requireNonNull(interval, "expected parameter 'interval' to be non-null");
        this.intervalUnit = intervalUnit;
        this.times = times;
    }

    private LifecyclePolicyPolicyDetailsScheduleCreateRuleGetArgs() {
        this.interval = Output.empty();
        this.intervalUnit = Output.empty();
        this.times = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecyclePolicyPolicyDetailsScheduleCreateRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> interval;
        private @Nullable Output<String> intervalUnit;
        private @Nullable Output<String> times;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecyclePolicyPolicyDetailsScheduleCreateRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interval = defaults.interval;
    	      this.intervalUnit = defaults.intervalUnit;
    	      this.times = defaults.times;
        }

        public Builder interval(Output<Integer> interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }
        public Builder interval(Integer interval) {
            this.interval = Output.of(Objects.requireNonNull(interval));
            return this;
        }
        public Builder intervalUnit(@Nullable Output<String> intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }
        public Builder intervalUnit(@Nullable String intervalUnit) {
            this.intervalUnit = Output.ofNullable(intervalUnit);
            return this;
        }
        public Builder times(@Nullable Output<String> times) {
            this.times = times;
            return this;
        }
        public Builder times(@Nullable String times) {
            this.times = Output.ofNullable(times);
            return this;
        }        public LifecyclePolicyPolicyDetailsScheduleCreateRuleGetArgs build() {
            return new LifecyclePolicyPolicyDetailsScheduleCreateRuleGetArgs(interval, intervalUnit, times);
        }
    }
}
