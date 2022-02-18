// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.MatchProcessingBehavior;
import io.pulumi.azurenative.network.inputs.RulesEngineActionArgs;
import io.pulumi.azurenative.network.inputs.RulesEngineMatchConditionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains a list of match conditions, and an action on how to modify the request/response. If multiple rules match, the actions from one rule that conflict with a previous rule overwrite for a singular action, or append in the case of headers manipulation.
 * 
 */
public final class RulesEngineRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RulesEngineRuleArgs Empty = new RulesEngineRuleArgs();

    /**
     * Actions to perform on the request and response if all of the match conditions are met.
     * 
     */
    @InputImport(name="action", required=true)
    private final Input<RulesEngineActionArgs> action;

    public Input<RulesEngineActionArgs> getAction() {
        return this.action;
    }

    /**
     * A list of match conditions that must meet in order for the actions of this rule to run. Having no match conditions means the actions will always run.
     * 
     */
    @InputImport(name="matchConditions")
    private final @Nullable Input<List<RulesEngineMatchConditionArgs>> matchConditions;

    public Input<List<RulesEngineMatchConditionArgs>> getMatchConditions() {
        return this.matchConditions == null ? Input.empty() : this.matchConditions;
    }

    /**
     * If this rule is a match should the rules engine continue running the remaining rules or stop. If not present, defaults to Continue.
     * 
     */
    @InputImport(name="matchProcessingBehavior")
    private final @Nullable Input<Either<String,MatchProcessingBehavior>> matchProcessingBehavior;

    public Input<Either<String,MatchProcessingBehavior>> getMatchProcessingBehavior() {
        return this.matchProcessingBehavior == null ? Input.empty() : this.matchProcessingBehavior;
    }

    /**
     * A name to refer to this specific rule.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * A priority assigned to this rule.
     * 
     */
    @InputImport(name="priority", required=true)
    private final Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority;
    }

    public RulesEngineRuleArgs(
        Input<RulesEngineActionArgs> action,
        @Nullable Input<List<RulesEngineMatchConditionArgs>> matchConditions,
        @Nullable Input<Either<String,MatchProcessingBehavior>> matchProcessingBehavior,
        Input<String> name,
        Input<Integer> priority) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.matchConditions = matchConditions;
        this.matchProcessingBehavior = matchProcessingBehavior;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
    }

    private RulesEngineRuleArgs() {
        this.action = Input.empty();
        this.matchConditions = Input.empty();
        this.matchProcessingBehavior = Input.empty();
        this.name = Input.empty();
        this.priority = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesEngineRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<RulesEngineActionArgs> action;
        private @Nullable Input<List<RulesEngineMatchConditionArgs>> matchConditions;
        private @Nullable Input<Either<String,MatchProcessingBehavior>> matchProcessingBehavior;
        private Input<String> name;
        private Input<Integer> priority;

        public Builder() {
    	      // Empty
        }

        public Builder(RulesEngineRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.matchConditions = defaults.matchConditions;
    	      this.matchProcessingBehavior = defaults.matchProcessingBehavior;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
        }

        public Builder setAction(Input<RulesEngineActionArgs> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setAction(RulesEngineActionArgs action) {
            this.action = Input.of(Objects.requireNonNull(action));
            return this;
        }

        public Builder setMatchConditions(@Nullable Input<List<RulesEngineMatchConditionArgs>> matchConditions) {
            this.matchConditions = matchConditions;
            return this;
        }

        public Builder setMatchConditions(@Nullable List<RulesEngineMatchConditionArgs> matchConditions) {
            this.matchConditions = Input.ofNullable(matchConditions);
            return this;
        }

        public Builder setMatchProcessingBehavior(@Nullable Input<Either<String,MatchProcessingBehavior>> matchProcessingBehavior) {
            this.matchProcessingBehavior = matchProcessingBehavior;
            return this;
        }

        public Builder setMatchProcessingBehavior(@Nullable Either<String,MatchProcessingBehavior> matchProcessingBehavior) {
            this.matchProcessingBehavior = Input.ofNullable(matchProcessingBehavior);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPriority(Input<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Input.of(Objects.requireNonNull(priority));
            return this;
        }

        public RulesEngineRuleArgs build() {
            return new RulesEngineRuleArgs(action, matchConditions, matchProcessingBehavior, name, priority);
        }
    }
}
