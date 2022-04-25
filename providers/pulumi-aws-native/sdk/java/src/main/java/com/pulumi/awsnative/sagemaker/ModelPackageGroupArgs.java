// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker;

import com.pulumi.awsnative.sagemaker.inputs.ModelPackageGroupTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModelPackageGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelPackageGroupArgs Empty = new ModelPackageGroupArgs();

    @Import(name="modelPackageGroupDescription")
    private @Nullable Output<String> modelPackageGroupDescription;

    public Optional<Output<String>> modelPackageGroupDescription() {
        return Optional.ofNullable(this.modelPackageGroupDescription);
    }

    @Import(name="modelPackageGroupName")
    private @Nullable Output<String> modelPackageGroupName;

    public Optional<Output<String>> modelPackageGroupName() {
        return Optional.ofNullable(this.modelPackageGroupName);
    }

    @Import(name="modelPackageGroupPolicy")
    private @Nullable Output<Object> modelPackageGroupPolicy;

    public Optional<Output<Object>> modelPackageGroupPolicy() {
        return Optional.ofNullable(this.modelPackageGroupPolicy);
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<ModelPackageGroupTagArgs>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Optional<Output<List<ModelPackageGroupTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ModelPackageGroupArgs() {}

    private ModelPackageGroupArgs(ModelPackageGroupArgs $) {
        this.modelPackageGroupDescription = $.modelPackageGroupDescription;
        this.modelPackageGroupName = $.modelPackageGroupName;
        this.modelPackageGroupPolicy = $.modelPackageGroupPolicy;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelPackageGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelPackageGroupArgs $;

        public Builder() {
            $ = new ModelPackageGroupArgs();
        }

        public Builder(ModelPackageGroupArgs defaults) {
            $ = new ModelPackageGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder modelPackageGroupDescription(@Nullable Output<String> modelPackageGroupDescription) {
            $.modelPackageGroupDescription = modelPackageGroupDescription;
            return this;
        }

        public Builder modelPackageGroupDescription(String modelPackageGroupDescription) {
            return modelPackageGroupDescription(Output.of(modelPackageGroupDescription));
        }

        public Builder modelPackageGroupName(@Nullable Output<String> modelPackageGroupName) {
            $.modelPackageGroupName = modelPackageGroupName;
            return this;
        }

        public Builder modelPackageGroupName(String modelPackageGroupName) {
            return modelPackageGroupName(Output.of(modelPackageGroupName));
        }

        public Builder modelPackageGroupPolicy(@Nullable Output<Object> modelPackageGroupPolicy) {
            $.modelPackageGroupPolicy = modelPackageGroupPolicy;
            return this;
        }

        public Builder modelPackageGroupPolicy(Object modelPackageGroupPolicy) {
            return modelPackageGroupPolicy(Output.of(modelPackageGroupPolicy));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<ModelPackageGroupTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<ModelPackageGroupTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(ModelPackageGroupTagArgs... tags) {
            return tags(List.of(tags));
        }

        public ModelPackageGroupArgs build() {
            return $;
        }
    }

}
