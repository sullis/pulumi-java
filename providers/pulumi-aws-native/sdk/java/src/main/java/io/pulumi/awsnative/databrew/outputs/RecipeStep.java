// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.awsnative.databrew.outputs.RecipeAction;
import io.pulumi.awsnative.databrew.outputs.RecipeConditionExpression;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class RecipeStep {
    private final RecipeAction action;
    /**
     * Condition expressions applied to the step action
     * 
     */
    private final @Nullable List<RecipeConditionExpression> conditionExpressions;

    @OutputCustomType.Constructor({"action","conditionExpressions"})
    private RecipeStep(
        RecipeAction action,
        @Nullable List<RecipeConditionExpression> conditionExpressions) {
        this.action = Objects.requireNonNull(action);
        this.conditionExpressions = conditionExpressions;
    }

    public RecipeAction getAction() {
        return this.action;
    }
    /**
     * Condition expressions applied to the step action
     * 
     */
    public List<RecipeConditionExpression> getConditionExpressions() {
        return this.conditionExpressions == null ? List.of() : this.conditionExpressions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecipeStep defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecipeAction action;
        private @Nullable List<RecipeConditionExpression> conditionExpressions;

        public Builder() {
    	      // Empty
        }

        public Builder(RecipeStep defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.conditionExpressions = defaults.conditionExpressions;
        }

        public Builder setAction(RecipeAction action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setConditionExpressions(@Nullable List<RecipeConditionExpression> conditionExpressions) {
            this.conditionExpressions = conditionExpressions;
            return this;
        }

        public RecipeStep build() {
            return new RecipeStep(action, conditionExpressions);
        }
    }
}
