// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.enums.ActionType;
import io.pulumi.azurenative.cdn.enums.CustomRuleEnabledState;
import io.pulumi.azurenative.cdn.inputs.MatchConditionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines a rate limiting rule that can be included in a waf policy
 * 
 */
public final class RateLimitRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RateLimitRuleArgs Empty = new RateLimitRuleArgs();

    /**
     * Describes what action to be applied when rule matches
     * 
     */
    @Import(name="action", required=true)
      private final Output<Either<String,ActionType>> action;

    public Output<Either<String,ActionType>> getAction() {
        return this.action;
    }

    /**
     * Describes if the custom rule is in enabled or disabled state. Defaults to Enabled if not specified.
     * 
     */
    @Import(name="enabledState")
      private final @Nullable Output<Either<String,CustomRuleEnabledState>> enabledState;

    public Output<Either<String,CustomRuleEnabledState>> getEnabledState() {
        return this.enabledState == null ? Output.empty() : this.enabledState;
    }

    /**
     * List of match conditions.
     * 
     */
    @Import(name="matchConditions", required=true)
      private final Output<List<MatchConditionArgs>> matchConditions;

    public Output<List<MatchConditionArgs>> getMatchConditions() {
        return this.matchConditions;
    }

    /**
     * Defines the name of the custom rule
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Defines in what order this rule be evaluated in the overall list of custom rules
     * 
     */
    @Import(name="priority", required=true)
      private final Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority;
    }

    /**
     * Defines rate limit duration. Default is 1 minute.
     * 
     */
    @Import(name="rateLimitDurationInMinutes", required=true)
      private final Output<Integer> rateLimitDurationInMinutes;

    public Output<Integer> getRateLimitDurationInMinutes() {
        return this.rateLimitDurationInMinutes;
    }

    /**
     * Defines rate limit threshold.
     * 
     */
    @Import(name="rateLimitThreshold", required=true)
      private final Output<Integer> rateLimitThreshold;

    public Output<Integer> getRateLimitThreshold() {
        return this.rateLimitThreshold;
    }

    public RateLimitRuleArgs(
        Output<Either<String,ActionType>> action,
        @Nullable Output<Either<String,CustomRuleEnabledState>> enabledState,
        Output<List<MatchConditionArgs>> matchConditions,
        Output<String> name,
        Output<Integer> priority,
        Output<Integer> rateLimitDurationInMinutes,
        Output<Integer> rateLimitThreshold) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.enabledState = enabledState;
        this.matchConditions = Objects.requireNonNull(matchConditions, "expected parameter 'matchConditions' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.rateLimitDurationInMinutes = Objects.requireNonNull(rateLimitDurationInMinutes, "expected parameter 'rateLimitDurationInMinutes' to be non-null");
        this.rateLimitThreshold = Objects.requireNonNull(rateLimitThreshold, "expected parameter 'rateLimitThreshold' to be non-null");
    }

    private RateLimitRuleArgs() {
        this.action = Output.empty();
        this.enabledState = Output.empty();
        this.matchConditions = Output.empty();
        this.name = Output.empty();
        this.priority = Output.empty();
        this.rateLimitDurationInMinutes = Output.empty();
        this.rateLimitThreshold = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RateLimitRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,ActionType>> action;
        private @Nullable Output<Either<String,CustomRuleEnabledState>> enabledState;
        private Output<List<MatchConditionArgs>> matchConditions;
        private Output<String> name;
        private Output<Integer> priority;
        private Output<Integer> rateLimitDurationInMinutes;
        private Output<Integer> rateLimitThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(RateLimitRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.enabledState = defaults.enabledState;
    	      this.matchConditions = defaults.matchConditions;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.rateLimitDurationInMinutes = defaults.rateLimitDurationInMinutes;
    	      this.rateLimitThreshold = defaults.rateLimitThreshold;
        }

        public Builder action(Output<Either<String,ActionType>> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(Either<String,ActionType> action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder enabledState(@Nullable Output<Either<String,CustomRuleEnabledState>> enabledState) {
            this.enabledState = enabledState;
            return this;
        }
        public Builder enabledState(@Nullable Either<String,CustomRuleEnabledState> enabledState) {
            this.enabledState = Output.ofNullable(enabledState);
            return this;
        }
        public Builder matchConditions(Output<List<MatchConditionArgs>> matchConditions) {
            this.matchConditions = Objects.requireNonNull(matchConditions);
            return this;
        }
        public Builder matchConditions(List<MatchConditionArgs> matchConditions) {
            this.matchConditions = Output.of(Objects.requireNonNull(matchConditions));
            return this;
        }
        public Builder matchConditions(MatchConditionArgs... matchConditions) {
            return matchConditions(List.of(matchConditions));
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder priority(Output<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Output.of(Objects.requireNonNull(priority));
            return this;
        }
        public Builder rateLimitDurationInMinutes(Output<Integer> rateLimitDurationInMinutes) {
            this.rateLimitDurationInMinutes = Objects.requireNonNull(rateLimitDurationInMinutes);
            return this;
        }
        public Builder rateLimitDurationInMinutes(Integer rateLimitDurationInMinutes) {
            this.rateLimitDurationInMinutes = Output.of(Objects.requireNonNull(rateLimitDurationInMinutes));
            return this;
        }
        public Builder rateLimitThreshold(Output<Integer> rateLimitThreshold) {
            this.rateLimitThreshold = Objects.requireNonNull(rateLimitThreshold);
            return this;
        }
        public Builder rateLimitThreshold(Integer rateLimitThreshold) {
            this.rateLimitThreshold = Output.of(Objects.requireNonNull(rateLimitThreshold));
            return this;
        }        public RateLimitRuleArgs build() {
            return new RateLimitRuleArgs(action, enabledState, matchConditions, name, priority, rateLimitDurationInMinutes, rateLimitThreshold);
        }
    }
}
