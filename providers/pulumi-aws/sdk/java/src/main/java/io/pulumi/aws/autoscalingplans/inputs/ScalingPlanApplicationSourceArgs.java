// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscalingplans.inputs;

import io.pulumi.aws.autoscalingplans.inputs.ScalingPlanApplicationSourceTagFilterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScalingPlanApplicationSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScalingPlanApplicationSourceArgs Empty = new ScalingPlanApplicationSourceArgs();

    /**
     * The Amazon Resource Name (ARN) of a AWS CloudFormation stack.
     * 
     */
    @InputImport(name="cloudformationStackArn")
      private final @Nullable Input<String> cloudformationStackArn;

    public Input<String> getCloudformationStackArn() {
        return this.cloudformationStackArn == null ? Input.empty() : this.cloudformationStackArn;
    }

    /**
     * A set of tags.
     * 
     */
    @InputImport(name="tagFilters")
      private final @Nullable Input<List<ScalingPlanApplicationSourceTagFilterArgs>> tagFilters;

    public Input<List<ScalingPlanApplicationSourceTagFilterArgs>> getTagFilters() {
        return this.tagFilters == null ? Input.empty() : this.tagFilters;
    }

    public ScalingPlanApplicationSourceArgs(
        @Nullable Input<String> cloudformationStackArn,
        @Nullable Input<List<ScalingPlanApplicationSourceTagFilterArgs>> tagFilters) {
        this.cloudformationStackArn = cloudformationStackArn;
        this.tagFilters = tagFilters;
    }

    private ScalingPlanApplicationSourceArgs() {
        this.cloudformationStackArn = Input.empty();
        this.tagFilters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingPlanApplicationSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cloudformationStackArn;
        private @Nullable Input<List<ScalingPlanApplicationSourceTagFilterArgs>> tagFilters;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalingPlanApplicationSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudformationStackArn = defaults.cloudformationStackArn;
    	      this.tagFilters = defaults.tagFilters;
        }

        public Builder setCloudformationStackArn(@Nullable Input<String> cloudformationStackArn) {
            this.cloudformationStackArn = cloudformationStackArn;
            return this;
        }

        public Builder setCloudformationStackArn(@Nullable String cloudformationStackArn) {
            this.cloudformationStackArn = Input.ofNullable(cloudformationStackArn);
            return this;
        }

        public Builder setTagFilters(@Nullable Input<List<ScalingPlanApplicationSourceTagFilterArgs>> tagFilters) {
            this.tagFilters = tagFilters;
            return this;
        }

        public Builder setTagFilters(@Nullable List<ScalingPlanApplicationSourceTagFilterArgs> tagFilters) {
            this.tagFilters = Input.ofNullable(tagFilters);
            return this;
        }
        public ScalingPlanApplicationSourceArgs build() {
            return new ScalingPlanApplicationSourceArgs(cloudformationStackArn, tagFilters);
        }
    }
}