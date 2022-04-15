// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty.inputs;

import io.pulumi.aws.guardduty.inputs.FilterFindingCriteriaCriterionGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;


public final class FilterFindingCriteriaGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FilterFindingCriteriaGetArgs Empty = new FilterFindingCriteriaGetArgs();

    @Import(name="criterions", required=true)
      private final Output<List<FilterFindingCriteriaCriterionGetArgs>> criterions;

    public Output<List<FilterFindingCriteriaCriterionGetArgs>> criterions() {
        return this.criterions;
    }

    public FilterFindingCriteriaGetArgs(Output<List<FilterFindingCriteriaCriterionGetArgs>> criterions) {
        this.criterions = Objects.requireNonNull(criterions, "expected parameter 'criterions' to be non-null");
    }

    private FilterFindingCriteriaGetArgs() {
        this.criterions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterFindingCriteriaGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<FilterFindingCriteriaCriterionGetArgs>> criterions;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterFindingCriteriaGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criterions = defaults.criterions;
        }

        public Builder criterions(Output<List<FilterFindingCriteriaCriterionGetArgs>> criterions) {
            this.criterions = Objects.requireNonNull(criterions);
            return this;
        }
        public Builder criterions(List<FilterFindingCriteriaCriterionGetArgs> criterions) {
            this.criterions = Output.of(Objects.requireNonNull(criterions));
            return this;
        }
        public Builder criterions(FilterFindingCriteriaCriterionGetArgs... criterions) {
            return criterions(List.of(criterions));
        }        public FilterFindingCriteriaGetArgs build() {
            return new FilterFindingCriteriaGetArgs(criterions);
        }
    }
}
