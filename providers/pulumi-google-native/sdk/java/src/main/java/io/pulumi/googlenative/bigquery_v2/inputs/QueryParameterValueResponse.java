// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class QueryParameterValueResponse extends io.pulumi.resources.InvokeArgs {

    public static final QueryParameterValueResponse Empty = new QueryParameterValueResponse();

    /**
     * [Optional] The array values, if this is an array type.
     * 
     */
    @InputImport(name="arrayValues", required=true)
      private final List<QueryParameterValueResponse> arrayValues;

    public List<QueryParameterValueResponse> getArrayValues() {
        return this.arrayValues;
    }

    /**
     * [Optional] The struct field values, in order of the struct type's declaration.
     * 
     */
    @InputImport(name="structValues", required=true)
      private final Map<String,String> structValues;

    public Map<String,String> getStructValues() {
        return this.structValues;
    }

    /**
     * [Optional] The value of this value, if a simple scalar type.
     * 
     */
    @InputImport(name="value", required=true)
      private final String value;

    public String getValue() {
        return this.value;
    }

    public QueryParameterValueResponse(
        List<QueryParameterValueResponse> arrayValues,
        Map<String,String> structValues,
        String value) {
        this.arrayValues = Objects.requireNonNull(arrayValues, "expected parameter 'arrayValues' to be non-null");
        this.structValues = Objects.requireNonNull(structValues, "expected parameter 'structValues' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private QueryParameterValueResponse() {
        this.arrayValues = List.of();
        this.structValues = Map.of();
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryParameterValueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<QueryParameterValueResponse> arrayValues;
        private Map<String,String> structValues;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryParameterValueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arrayValues = defaults.arrayValues;
    	      this.structValues = defaults.structValues;
    	      this.value = defaults.value;
        }

        public Builder setArrayValues(List<QueryParameterValueResponse> arrayValues) {
            this.arrayValues = Objects.requireNonNull(arrayValues);
            return this;
        }

        public Builder setStructValues(Map<String,String> structValues) {
            this.structValues = Objects.requireNonNull(structValues);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public QueryParameterValueResponse build() {
            return new QueryParameterValueResponse(arrayValues, structValues, value);
        }
    }
}