// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class QueryParameterValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final QueryParameterValueArgs Empty = new QueryParameterValueArgs();

    /**
     * [Optional] The array values, if this is an array type.
     * 
     */
    @Import(name="arrayValues")
    private @Nullable Output<List<QueryParameterValueArgs>> arrayValues;

    /**
     * @return [Optional] The array values, if this is an array type.
     * 
     */
    public Optional<Output<List<QueryParameterValueArgs>>> arrayValues() {
        return Optional.ofNullable(this.arrayValues);
    }

    /**
     * [Optional] The struct field values, in order of the struct type&#39;s declaration.
     * 
     */
    @Import(name="structValues")
    private @Nullable Output<Map<String,String>> structValues;

    /**
     * @return [Optional] The struct field values, in order of the struct type&#39;s declaration.
     * 
     */
    public Optional<Output<Map<String,String>>> structValues() {
        return Optional.ofNullable(this.structValues);
    }

    /**
     * [Optional] The value of this value, if a simple scalar type.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return [Optional] The value of this value, if a simple scalar type.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private QueryParameterValueArgs() {}

    private QueryParameterValueArgs(QueryParameterValueArgs $) {
        this.arrayValues = $.arrayValues;
        this.structValues = $.structValues;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QueryParameterValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueryParameterValueArgs $;

        public Builder() {
            $ = new QueryParameterValueArgs();
        }

        public Builder(QueryParameterValueArgs defaults) {
            $ = new QueryParameterValueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arrayValues [Optional] The array values, if this is an array type.
         * 
         * @return builder
         * 
         */
        public Builder arrayValues(@Nullable Output<List<QueryParameterValueArgs>> arrayValues) {
            $.arrayValues = arrayValues;
            return this;
        }

        /**
         * @param arrayValues [Optional] The array values, if this is an array type.
         * 
         * @return builder
         * 
         */
        public Builder arrayValues(List<QueryParameterValueArgs> arrayValues) {
            return arrayValues(Output.of(arrayValues));
        }

        /**
         * @param arrayValues [Optional] The array values, if this is an array type.
         * 
         * @return builder
         * 
         */
        public Builder arrayValues(QueryParameterValueArgs... arrayValues) {
            return arrayValues(List.of(arrayValues));
        }

        /**
         * @param structValues [Optional] The struct field values, in order of the struct type&#39;s declaration.
         * 
         * @return builder
         * 
         */
        public Builder structValues(@Nullable Output<Map<String,String>> structValues) {
            $.structValues = structValues;
            return this;
        }

        /**
         * @param structValues [Optional] The struct field values, in order of the struct type&#39;s declaration.
         * 
         * @return builder
         * 
         */
        public Builder structValues(Map<String,String> structValues) {
            return structValues(Output.of(structValues));
        }

        /**
         * @param value [Optional] The value of this value, if a simple scalar type.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value [Optional] The value of this value, if a simple scalar type.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public QueryParameterValueArgs build() {
            return $;
        }
    }

}
