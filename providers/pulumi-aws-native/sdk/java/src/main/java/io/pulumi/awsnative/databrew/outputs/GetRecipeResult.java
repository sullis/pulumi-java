// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.awsnative.databrew.outputs.RecipeStep;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRecipeResult {
    private final @Nullable String description;
    private final @Nullable List<RecipeStep> steps;

    @OutputCustomType.Constructor({"description","steps"})
    private GetRecipeResult(
        @Nullable String description,
        @Nullable List<RecipeStep> steps) {
        this.description = description;
        this.steps = steps;
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public List<RecipeStep> getSteps() {
        return this.steps == null ? List.of() : this.steps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRecipeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<RecipeStep> steps;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRecipeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.steps = defaults.steps;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setSteps(@Nullable List<RecipeStep> steps) {
            this.steps = steps;
            return this;
        }

        public GetRecipeResult build() {
            return new GetRecipeResult(description, steps);
        }
    }
}
