// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.DatasetFilterValueArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DatasetFilterExpressionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetFilterExpressionArgs Empty = new DatasetFilterExpressionArgs();

    /**
     * Filtering expression for a parameter
     * 
     */
    @InputImport(name="expression", required=true)
      private final Input<String> expression;

    public Input<String> getExpression() {
        return this.expression;
    }

    @InputImport(name="valuesMap", required=true)
      private final Input<List<DatasetFilterValueArgs>> valuesMap;

    public Input<List<DatasetFilterValueArgs>> getValuesMap() {
        return this.valuesMap;
    }

    public DatasetFilterExpressionArgs(
        Input<String> expression,
        Input<List<DatasetFilterValueArgs>> valuesMap) {
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
        this.valuesMap = Objects.requireNonNull(valuesMap, "expected parameter 'valuesMap' to be non-null");
    }

    private DatasetFilterExpressionArgs() {
        this.expression = Input.empty();
        this.valuesMap = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetFilterExpressionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> expression;
        private Input<List<DatasetFilterValueArgs>> valuesMap;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetFilterExpressionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.valuesMap = defaults.valuesMap;
        }

        public Builder setExpression(Input<String> expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder setExpression(String expression) {
            this.expression = Input.of(Objects.requireNonNull(expression));
            return this;
        }

        public Builder setValuesMap(Input<List<DatasetFilterValueArgs>> valuesMap) {
            this.valuesMap = Objects.requireNonNull(valuesMap);
            return this;
        }

        public Builder setValuesMap(List<DatasetFilterValueArgs> valuesMap) {
            this.valuesMap = Input.of(Objects.requireNonNull(valuesMap));
            return this;
        }
        public DatasetFilterExpressionArgs build() {
            return new DatasetFilterExpressionArgs(expression, valuesMap);
        }
    }
}