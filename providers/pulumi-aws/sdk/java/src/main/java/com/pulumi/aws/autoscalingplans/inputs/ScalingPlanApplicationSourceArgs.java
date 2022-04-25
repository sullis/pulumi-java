// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscalingplans.inputs;

import com.pulumi.aws.autoscalingplans.inputs.ScalingPlanApplicationSourceTagFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScalingPlanApplicationSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScalingPlanApplicationSourceArgs Empty = new ScalingPlanApplicationSourceArgs();

    /**
     * The Amazon Resource Name (ARN) of a AWS CloudFormation stack.
     * 
     */
    @Import(name="cloudformationStackArn")
    private @Nullable Output<String> cloudformationStackArn;

    /**
     * @return The Amazon Resource Name (ARN) of a AWS CloudFormation stack.
     * 
     */
    public Optional<Output<String>> cloudformationStackArn() {
        return Optional.ofNullable(this.cloudformationStackArn);
    }

    /**
     * A set of tags.
     * 
     */
    @Import(name="tagFilters")
    private @Nullable Output<List<ScalingPlanApplicationSourceTagFilterArgs>> tagFilters;

    /**
     * @return A set of tags.
     * 
     */
    public Optional<Output<List<ScalingPlanApplicationSourceTagFilterArgs>>> tagFilters() {
        return Optional.ofNullable(this.tagFilters);
    }

    private ScalingPlanApplicationSourceArgs() {}

    private ScalingPlanApplicationSourceArgs(ScalingPlanApplicationSourceArgs $) {
        this.cloudformationStackArn = $.cloudformationStackArn;
        this.tagFilters = $.tagFilters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScalingPlanApplicationSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScalingPlanApplicationSourceArgs $;

        public Builder() {
            $ = new ScalingPlanApplicationSourceArgs();
        }

        public Builder(ScalingPlanApplicationSourceArgs defaults) {
            $ = new ScalingPlanApplicationSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudformationStackArn The Amazon Resource Name (ARN) of a AWS CloudFormation stack.
         * 
         * @return builder
         * 
         */
        public Builder cloudformationStackArn(@Nullable Output<String> cloudformationStackArn) {
            $.cloudformationStackArn = cloudformationStackArn;
            return this;
        }

        /**
         * @param cloudformationStackArn The Amazon Resource Name (ARN) of a AWS CloudFormation stack.
         * 
         * @return builder
         * 
         */
        public Builder cloudformationStackArn(String cloudformationStackArn) {
            return cloudformationStackArn(Output.of(cloudformationStackArn));
        }

        /**
         * @param tagFilters A set of tags.
         * 
         * @return builder
         * 
         */
        public Builder tagFilters(@Nullable Output<List<ScalingPlanApplicationSourceTagFilterArgs>> tagFilters) {
            $.tagFilters = tagFilters;
            return this;
        }

        /**
         * @param tagFilters A set of tags.
         * 
         * @return builder
         * 
         */
        public Builder tagFilters(List<ScalingPlanApplicationSourceTagFilterArgs> tagFilters) {
            return tagFilters(Output.of(tagFilters));
        }

        /**
         * @param tagFilters A set of tags.
         * 
         * @return builder
         * 
         */
        public Builder tagFilters(ScalingPlanApplicationSourceTagFilterArgs... tagFilters) {
            return tagFilters(List.of(tagFilters));
        }

        public ScalingPlanApplicationSourceArgs build() {
            return $;
        }
    }

}
