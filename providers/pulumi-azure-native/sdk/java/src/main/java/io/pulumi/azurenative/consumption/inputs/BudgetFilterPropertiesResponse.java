// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.consumption.inputs;

import io.pulumi.azurenative.consumption.inputs.BudgetComparisonExpressionResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Dimensions or Tags to filter a budget by.
 * 
 */
public final class BudgetFilterPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final BudgetFilterPropertiesResponse Empty = new BudgetFilterPropertiesResponse();

    /**
     * Has comparison expression for a dimension
     * 
     */
    @InputImport(name="dimensions")
    private final @Nullable BudgetComparisonExpressionResponse dimensions;

    public Optional<BudgetComparisonExpressionResponse> getDimensions() {
        return this.dimensions == null ? Optional.empty() : Optional.ofNullable(this.dimensions);
    }

    /**
     * Has comparison expression for a tag
     * 
     */
    @InputImport(name="tags")
    private final @Nullable BudgetComparisonExpressionResponse tags;

    public Optional<BudgetComparisonExpressionResponse> getTags() {
        return this.tags == null ? Optional.empty() : Optional.ofNullable(this.tags);
    }

    public BudgetFilterPropertiesResponse(
        @Nullable BudgetComparisonExpressionResponse dimensions,
        @Nullable BudgetComparisonExpressionResponse tags) {
        this.dimensions = dimensions;
        this.tags = tags;
    }

    private BudgetFilterPropertiesResponse() {
        this.dimensions = null;
        this.tags = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetFilterPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BudgetComparisonExpressionResponse dimensions;
        private @Nullable BudgetComparisonExpressionResponse tags;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetFilterPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.tags = defaults.tags;
        }

        public Builder setDimensions(@Nullable BudgetComparisonExpressionResponse dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder setTags(@Nullable BudgetComparisonExpressionResponse tags) {
            this.tags = tags;
            return this;
        }

        public BudgetFilterPropertiesResponse build() {
            return new BudgetFilterPropertiesResponse(dimensions, tags);
        }
    }
}
