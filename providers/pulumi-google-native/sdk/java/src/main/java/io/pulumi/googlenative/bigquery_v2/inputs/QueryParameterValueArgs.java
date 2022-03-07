// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueryParameterValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final QueryParameterValueArgs Empty = new QueryParameterValueArgs();

    /**
     * [Optional] The array values, if this is an array type.
     * 
     */
    @InputImport(name="arrayValues")
      private final @Nullable Input<List<QueryParameterValueArgs>> arrayValues;

    public Input<List<QueryParameterValueArgs>> getArrayValues() {
        return this.arrayValues == null ? Input.empty() : this.arrayValues;
    }

    /**
     * [Optional] The struct field values, in order of the struct type's declaration.
     * 
     */
    @InputImport(name="structValues")
      private final @Nullable Input<Map<String,String>> structValues;

    public Input<Map<String,String>> getStructValues() {
        return this.structValues == null ? Input.empty() : this.structValues;
    }

    /**
     * [Optional] The value of this value, if a simple scalar type.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public QueryParameterValueArgs(
        @Nullable Input<List<QueryParameterValueArgs>> arrayValues,
        @Nullable Input<Map<String,String>> structValues,
        @Nullable Input<String> value) {
        this.arrayValues = arrayValues;
        this.structValues = structValues;
        this.value = value;
    }

    private QueryParameterValueArgs() {
        this.arrayValues = Input.empty();
        this.structValues = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryParameterValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<QueryParameterValueArgs>> arrayValues;
        private @Nullable Input<Map<String,String>> structValues;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryParameterValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arrayValues = defaults.arrayValues;
    	      this.structValues = defaults.structValues;
    	      this.value = defaults.value;
        }

        public Builder setArrayValues(@Nullable Input<List<QueryParameterValueArgs>> arrayValues) {
            this.arrayValues = arrayValues;
            return this;
        }

        public Builder setArrayValues(@Nullable List<QueryParameterValueArgs> arrayValues) {
            this.arrayValues = Input.ofNullable(arrayValues);
            return this;
        }

        public Builder setStructValues(@Nullable Input<Map<String,String>> structValues) {
            this.structValues = structValues;
            return this;
        }

        public Builder setStructValues(@Nullable Map<String,String> structValues) {
            this.structValues = Input.ofNullable(structValues);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public QueryParameterValueArgs build() {
            return new QueryParameterValueArgs(arrayValues, structValues, value);
        }
    }
}