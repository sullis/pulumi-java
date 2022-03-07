// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.awsnative.databrew.outputs.DatasetFilterValue;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DatasetFilterExpression {
    /**
     * Filtering expression for a parameter
     * 
     */
    private final String expression;
    private final List<DatasetFilterValue> valuesMap;

    @OutputCustomType.Constructor({"expression","valuesMap"})
    private DatasetFilterExpression(
        String expression,
        List<DatasetFilterValue> valuesMap) {
        this.expression = Objects.requireNonNull(expression);
        this.valuesMap = Objects.requireNonNull(valuesMap);
    }

    /**
     * Filtering expression for a parameter
     * 
    */
    public String getExpression() {
        return this.expression;
    }
    public List<DatasetFilterValue> getValuesMap() {
        return this.valuesMap;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetFilterExpression defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expression;
        private List<DatasetFilterValue> valuesMap;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetFilterExpression defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.valuesMap = defaults.valuesMap;
        }

        public Builder setExpression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder setValuesMap(List<DatasetFilterValue> valuesMap) {
            this.valuesMap = Objects.requireNonNull(valuesMap);
            return this;
        }
        public DatasetFilterExpression build() {
            return new DatasetFilterExpression(expression, valuesMap);
        }
    }
}