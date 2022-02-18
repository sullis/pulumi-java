// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.inputs.ReportComparisonExpressionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The filter expression to be used in the report.
 * 
 */
public final class ReportFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReportFilterArgs Empty = new ReportFilterArgs();

    /**
     * The logical "AND" expression. Must have at least 2 items.
     * 
     */
    @InputImport(name="and")
    private final @Nullable Input<List<ReportFilterArgs>> and;

    public Input<List<ReportFilterArgs>> getAnd() {
        return this.and == null ? Input.empty() : this.and;
    }

    /**
     * Has comparison expression for a dimension
     * 
     */
    @InputImport(name="dimension")
    private final @Nullable Input<ReportComparisonExpressionArgs> dimension;

    public Input<ReportComparisonExpressionArgs> getDimension() {
        return this.dimension == null ? Input.empty() : this.dimension;
    }

    /**
     * The logical "NOT" expression.
     * 
     */
    @InputImport(name="not")
    private final @Nullable Input<ReportFilterArgs> not;

    public Input<ReportFilterArgs> getNot() {
        return this.not == null ? Input.empty() : this.not;
    }

    /**
     * The logical "OR" expression. Must have at least 2 items.
     * 
     */
    @InputImport(name="or")
    private final @Nullable Input<List<ReportFilterArgs>> or;

    public Input<List<ReportFilterArgs>> getOr() {
        return this.or == null ? Input.empty() : this.or;
    }

    /**
     * Has comparison expression for a tag
     * 
     */
    @InputImport(name="tag")
    private final @Nullable Input<ReportComparisonExpressionArgs> tag;

    public Input<ReportComparisonExpressionArgs> getTag() {
        return this.tag == null ? Input.empty() : this.tag;
    }

    public ReportFilterArgs(
        @Nullable Input<List<ReportFilterArgs>> and,
        @Nullable Input<ReportComparisonExpressionArgs> dimension,
        @Nullable Input<ReportFilterArgs> not,
        @Nullable Input<List<ReportFilterArgs>> or,
        @Nullable Input<ReportComparisonExpressionArgs> tag) {
        this.and = and;
        this.dimension = dimension;
        this.not = not;
        this.or = or;
        this.tag = tag;
    }

    private ReportFilterArgs() {
        this.and = Input.empty();
        this.dimension = Input.empty();
        this.not = Input.empty();
        this.or = Input.empty();
        this.tag = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ReportFilterArgs>> and;
        private @Nullable Input<ReportComparisonExpressionArgs> dimension;
        private @Nullable Input<ReportFilterArgs> not;
        private @Nullable Input<List<ReportFilterArgs>> or;
        private @Nullable Input<ReportComparisonExpressionArgs> tag;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.and = defaults.and;
    	      this.dimension = defaults.dimension;
    	      this.not = defaults.not;
    	      this.or = defaults.or;
    	      this.tag = defaults.tag;
        }

        public Builder setAnd(@Nullable Input<List<ReportFilterArgs>> and) {
            this.and = and;
            return this;
        }

        public Builder setAnd(@Nullable List<ReportFilterArgs> and) {
            this.and = Input.ofNullable(and);
            return this;
        }

        public Builder setDimension(@Nullable Input<ReportComparisonExpressionArgs> dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setDimension(@Nullable ReportComparisonExpressionArgs dimension) {
            this.dimension = Input.ofNullable(dimension);
            return this;
        }

        public Builder setNot(@Nullable Input<ReportFilterArgs> not) {
            this.not = not;
            return this;
        }

        public Builder setNot(@Nullable ReportFilterArgs not) {
            this.not = Input.ofNullable(not);
            return this;
        }

        public Builder setOr(@Nullable Input<List<ReportFilterArgs>> or) {
            this.or = or;
            return this;
        }

        public Builder setOr(@Nullable List<ReportFilterArgs> or) {
            this.or = Input.ofNullable(or);
            return this;
        }

        public Builder setTag(@Nullable Input<ReportComparisonExpressionArgs> tag) {
            this.tag = tag;
            return this;
        }

        public Builder setTag(@Nullable ReportComparisonExpressionArgs tag) {
            this.tag = Input.ofNullable(tag);
            return this;
        }

        public ReportFilterArgs build() {
            return new ReportFilterArgs(and, dimension, not, or, tag);
        }
    }
}
