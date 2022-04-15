// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew;

import io.pulumi.awsnative.databrew.inputs.RecipeStepArgs;
import io.pulumi.awsnative.databrew.inputs.RecipeTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RecipeArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecipeArgs Empty = new RecipeArgs();

    /**
     * Description of the recipe
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Recipe name
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="steps", required=true)
      private final Output<List<RecipeStepArgs>> steps;

    public Output<List<RecipeStepArgs>> steps() {
        return this.steps;
    }

    @Import(name="tags")
      private final @Nullable Output<List<RecipeTagArgs>> tags;

    public Output<List<RecipeTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public RecipeArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        Output<List<RecipeStepArgs>> steps,
        @Nullable Output<List<RecipeTagArgs>> tags) {
        this.description = description;
        this.name = name;
        this.steps = Objects.requireNonNull(steps, "expected parameter 'steps' to be non-null");
        this.tags = tags;
    }

    private RecipeArgs() {
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.steps = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecipeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private Output<List<RecipeStepArgs>> steps;
        private @Nullable Output<List<RecipeTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RecipeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.steps = defaults.steps;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder steps(Output<List<RecipeStepArgs>> steps) {
            this.steps = Objects.requireNonNull(steps);
            return this;
        }
        public Builder steps(List<RecipeStepArgs> steps) {
            this.steps = Output.of(Objects.requireNonNull(steps));
            return this;
        }
        public Builder steps(RecipeStepArgs... steps) {
            return steps(List.of(steps));
        }
        public Builder tags(@Nullable Output<List<RecipeTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<RecipeTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(RecipeTagArgs... tags) {
            return tags(List.of(tags));
        }        public RecipeArgs build() {
            return new RecipeArgs(description, name, steps, tags);
        }
    }
}
