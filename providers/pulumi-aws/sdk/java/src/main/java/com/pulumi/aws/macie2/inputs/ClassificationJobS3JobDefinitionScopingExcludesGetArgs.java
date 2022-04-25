// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie2.inputs;

import com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingExcludesAndGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClassificationJobS3JobDefinitionScopingExcludesGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClassificationJobS3JobDefinitionScopingExcludesGetArgs Empty = new ClassificationJobS3JobDefinitionScopingExcludesGetArgs();

    /**
     * An array of conditions, one for each condition that determines which objects to include or exclude from the job. (documented below)
     * 
     */
    @Import(name="ands")
    private @Nullable Output<List<ClassificationJobS3JobDefinitionScopingExcludesAndGetArgs>> ands;

    /**
     * @return An array of conditions, one for each condition that determines which objects to include or exclude from the job. (documented below)
     * 
     */
    public Optional<Output<List<ClassificationJobS3JobDefinitionScopingExcludesAndGetArgs>>> ands() {
        return Optional.ofNullable(this.ands);
    }

    private ClassificationJobS3JobDefinitionScopingExcludesGetArgs() {}

    private ClassificationJobS3JobDefinitionScopingExcludesGetArgs(ClassificationJobS3JobDefinitionScopingExcludesGetArgs $) {
        this.ands = $.ands;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClassificationJobS3JobDefinitionScopingExcludesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClassificationJobS3JobDefinitionScopingExcludesGetArgs $;

        public Builder() {
            $ = new ClassificationJobS3JobDefinitionScopingExcludesGetArgs();
        }

        public Builder(ClassificationJobS3JobDefinitionScopingExcludesGetArgs defaults) {
            $ = new ClassificationJobS3JobDefinitionScopingExcludesGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ands An array of conditions, one for each condition that determines which objects to include or exclude from the job. (documented below)
         * 
         * @return builder
         * 
         */
        public Builder ands(@Nullable Output<List<ClassificationJobS3JobDefinitionScopingExcludesAndGetArgs>> ands) {
            $.ands = ands;
            return this;
        }

        /**
         * @param ands An array of conditions, one for each condition that determines which objects to include or exclude from the job. (documented below)
         * 
         * @return builder
         * 
         */
        public Builder ands(List<ClassificationJobS3JobDefinitionScopingExcludesAndGetArgs> ands) {
            return ands(Output.of(ands));
        }

        /**
         * @param ands An array of conditions, one for each condition that determines which objects to include or exclude from the job. (documented below)
         * 
         * @return builder
         * 
         */
        public Builder ands(ClassificationJobS3JobDefinitionScopingExcludesAndGetArgs... ands) {
            return ands(List.of(ands));
        }

        public ClassificationJobS3JobDefinitionScopingExcludesGetArgs build() {
            return $;
        }
    }

}
