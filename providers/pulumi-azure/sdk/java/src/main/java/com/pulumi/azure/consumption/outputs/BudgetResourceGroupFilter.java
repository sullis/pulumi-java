// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.consumption.outputs;

import com.pulumi.azure.consumption.outputs.BudgetResourceGroupFilterDimension;
import com.pulumi.azure.consumption.outputs.BudgetResourceGroupFilterNot;
import com.pulumi.azure.consumption.outputs.BudgetResourceGroupFilterTag;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BudgetResourceGroupFilter {
    /**
     * @return One or more `dimension` blocks as defined below to filter the budget on.
     * 
     */
    private final @Nullable List<BudgetResourceGroupFilterDimension> dimensions;
    /**
     * @return A `not` block as defined below to filter the budget on.
     * 
     */
    private final @Nullable BudgetResourceGroupFilterNot not;
    /**
     * @return One or more `tag` blocks as defined below to filter the budget on.
     * 
     */
    private final @Nullable List<BudgetResourceGroupFilterTag> tags;

    @CustomType.Constructor
    private BudgetResourceGroupFilter(
        @CustomType.Parameter("dimensions") @Nullable List<BudgetResourceGroupFilterDimension> dimensions,
        @CustomType.Parameter("not") @Nullable BudgetResourceGroupFilterNot not,
        @CustomType.Parameter("tags") @Nullable List<BudgetResourceGroupFilterTag> tags) {
        this.dimensions = dimensions;
        this.not = not;
        this.tags = tags;
    }

    /**
     * @return One or more `dimension` blocks as defined below to filter the budget on.
     * 
     */
    public List<BudgetResourceGroupFilterDimension> dimensions() {
        return this.dimensions == null ? List.of() : this.dimensions;
    }
    /**
     * @return A `not` block as defined below to filter the budget on.
     * 
     */
    public Optional<BudgetResourceGroupFilterNot> not() {
        return Optional.ofNullable(this.not);
    }
    /**
     * @return One or more `tag` blocks as defined below to filter the budget on.
     * 
     */
    public List<BudgetResourceGroupFilterTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetResourceGroupFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<BudgetResourceGroupFilterDimension> dimensions;
        private @Nullable BudgetResourceGroupFilterNot not;
        private @Nullable List<BudgetResourceGroupFilterTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetResourceGroupFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.not = defaults.not;
    	      this.tags = defaults.tags;
        }

        public Builder dimensions(@Nullable List<BudgetResourceGroupFilterDimension> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public Builder dimensions(BudgetResourceGroupFilterDimension... dimensions) {
            return dimensions(List.of(dimensions));
        }
        public Builder not(@Nullable BudgetResourceGroupFilterNot not) {
            this.not = not;
            return this;
        }
        public Builder tags(@Nullable List<BudgetResourceGroupFilterTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(BudgetResourceGroupFilterTag... tags) {
            return tags(List.of(tags));
        }        public BudgetResourceGroupFilter build() {
            return new BudgetResourceGroupFilter(dimensions, not, tags);
        }
    }
}
