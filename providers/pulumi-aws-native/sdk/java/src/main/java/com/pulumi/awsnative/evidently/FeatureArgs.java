// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.evidently;

import com.pulumi.awsnative.evidently.enums.FeatureEvaluationStrategy;
import com.pulumi.awsnative.evidently.inputs.FeatureEntityOverrideArgs;
import com.pulumi.awsnative.evidently.inputs.FeatureTagArgs;
import com.pulumi.awsnative.evidently.inputs.FeatureVariationObjectArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FeatureArgs extends com.pulumi.resources.ResourceArgs {

    public static final FeatureArgs Empty = new FeatureArgs();

    @Import(name="defaultVariation")
    private @Nullable Output<String> defaultVariation;

    public Optional<Output<String>> defaultVariation() {
        return Optional.ofNullable(this.defaultVariation);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="entityOverrides")
    private @Nullable Output<List<FeatureEntityOverrideArgs>> entityOverrides;

    public Optional<Output<List<FeatureEntityOverrideArgs>>> entityOverrides() {
        return Optional.ofNullable(this.entityOverrides);
    }

    @Import(name="evaluationStrategy")
    private @Nullable Output<FeatureEvaluationStrategy> evaluationStrategy;

    public Optional<Output<FeatureEvaluationStrategy>> evaluationStrategy() {
        return Optional.ofNullable(this.evaluationStrategy);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project", required=true)
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<FeatureTagArgs>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Optional<Output<List<FeatureTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="variations", required=true)
    private Output<List<FeatureVariationObjectArgs>> variations;

    public Output<List<FeatureVariationObjectArgs>> variations() {
        return this.variations;
    }

    private FeatureArgs() {}

    private FeatureArgs(FeatureArgs $) {
        this.defaultVariation = $.defaultVariation;
        this.description = $.description;
        this.entityOverrides = $.entityOverrides;
        this.evaluationStrategy = $.evaluationStrategy;
        this.name = $.name;
        this.project = $.project;
        this.tags = $.tags;
        this.variations = $.variations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FeatureArgs $;

        public Builder() {
            $ = new FeatureArgs();
        }

        public Builder(FeatureArgs defaults) {
            $ = new FeatureArgs(Objects.requireNonNull(defaults));
        }

        public Builder defaultVariation(@Nullable Output<String> defaultVariation) {
            $.defaultVariation = defaultVariation;
            return this;
        }

        public Builder defaultVariation(String defaultVariation) {
            return defaultVariation(Output.of(defaultVariation));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder entityOverrides(@Nullable Output<List<FeatureEntityOverrideArgs>> entityOverrides) {
            $.entityOverrides = entityOverrides;
            return this;
        }

        public Builder entityOverrides(List<FeatureEntityOverrideArgs> entityOverrides) {
            return entityOverrides(Output.of(entityOverrides));
        }

        public Builder entityOverrides(FeatureEntityOverrideArgs... entityOverrides) {
            return entityOverrides(List.of(entityOverrides));
        }

        public Builder evaluationStrategy(@Nullable Output<FeatureEvaluationStrategy> evaluationStrategy) {
            $.evaluationStrategy = evaluationStrategy;
            return this;
        }

        public Builder evaluationStrategy(FeatureEvaluationStrategy evaluationStrategy) {
            return evaluationStrategy(Output.of(evaluationStrategy));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<FeatureTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<FeatureTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(FeatureTagArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder variations(Output<List<FeatureVariationObjectArgs>> variations) {
            $.variations = variations;
            return this;
        }

        public Builder variations(List<FeatureVariationObjectArgs> variations) {
            return variations(Output.of(variations));
        }

        public Builder variations(FeatureVariationObjectArgs... variations) {
            return variations(List.of(variations));
        }

        public FeatureArgs build() {
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            $.variations = Objects.requireNonNull($.variations, "expected parameter 'variations' to be non-null");
            return $;
        }
    }

}
