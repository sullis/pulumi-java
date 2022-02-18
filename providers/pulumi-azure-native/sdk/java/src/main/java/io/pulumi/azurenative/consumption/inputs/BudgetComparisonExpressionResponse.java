// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.consumption.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The comparison expression to be used in the budgets.
 * 
 */
public final class BudgetComparisonExpressionResponse extends io.pulumi.resources.InvokeArgs {

    public static final BudgetComparisonExpressionResponse Empty = new BudgetComparisonExpressionResponse();

    /**
     * The name of the column to use in comparison.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The operator to use for comparison.
     * 
     */
    @InputImport(name="operator", required=true)
    private final String operator;

    public String getOperator() {
        return this.operator;
    }

    /**
     * Array of values to use for comparison
     * 
     */
    @InputImport(name="values", required=true)
    private final List<String> values;

    public List<String> getValues() {
        return this.values;
    }

    public BudgetComparisonExpressionResponse(
        String name,
        String operator,
        List<String> values) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private BudgetComparisonExpressionResponse() {
        this.name = null;
        this.operator = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetComparisonExpressionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String operator;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetComparisonExpressionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOperator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public BudgetComparisonExpressionResponse build() {
            return new BudgetComparisonExpressionResponse(name, operator, values);
        }
    }
}
