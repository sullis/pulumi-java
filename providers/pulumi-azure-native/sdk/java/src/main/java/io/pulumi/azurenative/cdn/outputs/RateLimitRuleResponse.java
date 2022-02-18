// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.MatchConditionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RateLimitRuleResponse {
    /**
     * Describes what action to be applied when rule matches
     * 
     */
    private final String action;
    /**
     * Describes if the custom rule is in enabled or disabled state. Defaults to Enabled if not specified.
     * 
     */
    private final @Nullable String enabledState;
    /**
     * List of match conditions.
     * 
     */
    private final List<MatchConditionResponse> matchConditions;
    /**
     * Defines the name of the custom rule
     * 
     */
    private final String name;
    /**
     * Defines in what order this rule be evaluated in the overall list of custom rules
     * 
     */
    private final Integer priority;
    /**
     * Defines rate limit duration. Default is 1 minute.
     * 
     */
    private final Integer rateLimitDurationInMinutes;
    /**
     * Defines rate limit threshold.
     * 
     */
    private final Integer rateLimitThreshold;

    @OutputCustomType.Constructor({"action","enabledState","matchConditions","name","priority","rateLimitDurationInMinutes","rateLimitThreshold"})
    private RateLimitRuleResponse(
        String action,
        @Nullable String enabledState,
        List<MatchConditionResponse> matchConditions,
        String name,
        Integer priority,
        Integer rateLimitDurationInMinutes,
        Integer rateLimitThreshold) {
        this.action = Objects.requireNonNull(action);
        this.enabledState = enabledState;
        this.matchConditions = Objects.requireNonNull(matchConditions);
        this.name = Objects.requireNonNull(name);
        this.priority = Objects.requireNonNull(priority);
        this.rateLimitDurationInMinutes = Objects.requireNonNull(rateLimitDurationInMinutes);
        this.rateLimitThreshold = Objects.requireNonNull(rateLimitThreshold);
    }

    /**
     * Describes what action to be applied when rule matches
     * 
     */
    public String getAction() {
        return this.action;
    }
    /**
     * Describes if the custom rule is in enabled or disabled state. Defaults to Enabled if not specified.
     * 
     */
    public Optional<String> getEnabledState() {
        return Optional.ofNullable(this.enabledState);
    }
    /**
     * List of match conditions.
     * 
     */
    public List<MatchConditionResponse> getMatchConditions() {
        return this.matchConditions;
    }
    /**
     * Defines the name of the custom rule
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Defines in what order this rule be evaluated in the overall list of custom rules
     * 
     */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Defines rate limit duration. Default is 1 minute.
     * 
     */
    public Integer getRateLimitDurationInMinutes() {
        return this.rateLimitDurationInMinutes;
    }
    /**
     * Defines rate limit threshold.
     * 
     */
    public Integer getRateLimitThreshold() {
        return this.rateLimitThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RateLimitRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private @Nullable String enabledState;
        private List<MatchConditionResponse> matchConditions;
        private String name;
        private Integer priority;
        private Integer rateLimitDurationInMinutes;
        private Integer rateLimitThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(RateLimitRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.enabledState = defaults.enabledState;
    	      this.matchConditions = defaults.matchConditions;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.rateLimitDurationInMinutes = defaults.rateLimitDurationInMinutes;
    	      this.rateLimitThreshold = defaults.rateLimitThreshold;
        }

        public Builder setAction(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setEnabledState(@Nullable String enabledState) {
            this.enabledState = enabledState;
            return this;
        }

        public Builder setMatchConditions(List<MatchConditionResponse> matchConditions) {
            this.matchConditions = Objects.requireNonNull(matchConditions);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setRateLimitDurationInMinutes(Integer rateLimitDurationInMinutes) {
            this.rateLimitDurationInMinutes = Objects.requireNonNull(rateLimitDurationInMinutes);
            return this;
        }

        public Builder setRateLimitThreshold(Integer rateLimitThreshold) {
            this.rateLimitThreshold = Objects.requireNonNull(rateLimitThreshold);
            return this;
        }

        public RateLimitRuleResponse build() {
            return new RateLimitRuleResponse(action, enabledState, matchConditions, name, priority, rateLimitDurationInMinutes, rateLimitThreshold);
        }
    }
}
