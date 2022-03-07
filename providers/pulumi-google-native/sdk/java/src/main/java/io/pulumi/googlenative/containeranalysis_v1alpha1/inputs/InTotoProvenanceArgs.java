// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.BuilderConfigArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.MetadataArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.RecipeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InTotoProvenanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InTotoProvenanceArgs Empty = new InTotoProvenanceArgs();

    /**
     * required
     * 
     */
    @InputImport(name="builderConfig")
      private final @Nullable Input<BuilderConfigArgs> builderConfig;

    public Input<BuilderConfigArgs> getBuilderConfig() {
        return this.builderConfig == null ? Input.empty() : this.builderConfig;
    }

    /**
     * The collection of artifacts that influenced the build including sources, dependencies, build tools, base images, and so on. This is considered to be incomplete unless metadata.completeness.materials is true. Unset or null is equivalent to empty.
     * 
     */
    @InputImport(name="materials")
      private final @Nullable Input<List<String>> materials;

    public Input<List<String>> getMaterials() {
        return this.materials == null ? Input.empty() : this.materials;
    }

    @InputImport(name="metadata")
      private final @Nullable Input<MetadataArgs> metadata;

    public Input<MetadataArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * Identifies the configuration used for the build. When combined with materials, this SHOULD fully describe the build, such that re-running this recipe results in bit-for-bit identical output (if the build is reproducible). required
     * 
     */
    @InputImport(name="recipe")
      private final @Nullable Input<RecipeArgs> recipe;

    public Input<RecipeArgs> getRecipe() {
        return this.recipe == null ? Input.empty() : this.recipe;
    }

    public InTotoProvenanceArgs(
        @Nullable Input<BuilderConfigArgs> builderConfig,
        @Nullable Input<List<String>> materials,
        @Nullable Input<MetadataArgs> metadata,
        @Nullable Input<RecipeArgs> recipe) {
        this.builderConfig = builderConfig;
        this.materials = materials;
        this.metadata = metadata;
        this.recipe = recipe;
    }

    private InTotoProvenanceArgs() {
        this.builderConfig = Input.empty();
        this.materials = Input.empty();
        this.metadata = Input.empty();
        this.recipe = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InTotoProvenanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BuilderConfigArgs> builderConfig;
        private @Nullable Input<List<String>> materials;
        private @Nullable Input<MetadataArgs> metadata;
        private @Nullable Input<RecipeArgs> recipe;

        public Builder() {
    	      // Empty
        }

        public Builder(InTotoProvenanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.builderConfig = defaults.builderConfig;
    	      this.materials = defaults.materials;
    	      this.metadata = defaults.metadata;
    	      this.recipe = defaults.recipe;
        }

        public Builder setBuilderConfig(@Nullable Input<BuilderConfigArgs> builderConfig) {
            this.builderConfig = builderConfig;
            return this;
        }

        public Builder setBuilderConfig(@Nullable BuilderConfigArgs builderConfig) {
            this.builderConfig = Input.ofNullable(builderConfig);
            return this;
        }

        public Builder setMaterials(@Nullable Input<List<String>> materials) {
            this.materials = materials;
            return this;
        }

        public Builder setMaterials(@Nullable List<String> materials) {
            this.materials = Input.ofNullable(materials);
            return this;
        }

        public Builder setMetadata(@Nullable Input<MetadataArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable MetadataArgs metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setRecipe(@Nullable Input<RecipeArgs> recipe) {
            this.recipe = recipe;
            return this;
        }

        public Builder setRecipe(@Nullable RecipeArgs recipe) {
            this.recipe = Input.ofNullable(recipe);
            return this;
        }
        public InTotoProvenanceArgs build() {
            return new InTotoProvenanceArgs(builderConfig, materials, metadata, recipe);
        }
    }
}