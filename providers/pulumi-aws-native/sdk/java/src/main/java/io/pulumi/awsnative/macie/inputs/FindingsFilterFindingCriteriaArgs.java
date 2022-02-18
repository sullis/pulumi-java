// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.macie.inputs;

import io.pulumi.awsnative.macie.inputs.FindingsFilterCriterionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FindingsFilterFindingCriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final FindingsFilterFindingCriteriaArgs Empty = new FindingsFilterFindingCriteriaArgs();

    @InputImport(name="criterion")
    private final @Nullable Input<FindingsFilterCriterionArgs> criterion;

    public Input<FindingsFilterCriterionArgs> getCriterion() {
        return this.criterion == null ? Input.empty() : this.criterion;
    }

    public FindingsFilterFindingCriteriaArgs(@Nullable Input<FindingsFilterCriterionArgs> criterion) {
        this.criterion = criterion;
    }

    private FindingsFilterFindingCriteriaArgs() {
        this.criterion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FindingsFilterFindingCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FindingsFilterCriterionArgs> criterion;

        public Builder() {
    	      // Empty
        }

        public Builder(FindingsFilterFindingCriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criterion = defaults.criterion;
        }

        public Builder setCriterion(@Nullable Input<FindingsFilterCriterionArgs> criterion) {
            this.criterion = criterion;
            return this;
        }

        public Builder setCriterion(@Nullable FindingsFilterCriterionArgs criterion) {
            this.criterion = Input.ofNullable(criterion);
            return this;
        }

        public FindingsFilterFindingCriteriaArgs build() {
            return new FindingsFilterFindingCriteriaArgs(criterion);
        }
    }
}
