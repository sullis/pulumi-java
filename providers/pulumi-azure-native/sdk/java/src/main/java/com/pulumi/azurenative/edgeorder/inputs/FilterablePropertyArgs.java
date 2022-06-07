// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.inputs;

import com.pulumi.azurenative.edgeorder.enums.SupportedFilterTypes;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Different types of filters supported and its values.
 * 
 */
public final class FilterablePropertyArgs extends com.pulumi.resources.ResourceArgs {

    public static final FilterablePropertyArgs Empty = new FilterablePropertyArgs();

    /**
     * Values to be filtered.
     * 
     */
    @Import(name="supportedValues", required=true)
    private Output<List<String>> supportedValues;

    /**
     * @return Values to be filtered.
     * 
     */
    public Output<List<String>> supportedValues() {
        return this.supportedValues;
    }

    /**
     * Type of product filter.
     * 
     */
    @Import(name="type", required=true)
    private Output<Either<String,SupportedFilterTypes>> type;

    /**
     * @return Type of product filter.
     * 
     */
    public Output<Either<String,SupportedFilterTypes>> type() {
        return this.type;
    }

    private FilterablePropertyArgs() {}

    private FilterablePropertyArgs(FilterablePropertyArgs $) {
        this.supportedValues = $.supportedValues;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FilterablePropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FilterablePropertyArgs $;

        public Builder() {
            $ = new FilterablePropertyArgs();
        }

        public Builder(FilterablePropertyArgs defaults) {
            $ = new FilterablePropertyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param supportedValues Values to be filtered.
         * 
         * @return builder
         * 
         */
        public Builder supportedValues(Output<List<String>> supportedValues) {
            $.supportedValues = supportedValues;
            return this;
        }

        /**
         * @param supportedValues Values to be filtered.
         * 
         * @return builder
         * 
         */
        public Builder supportedValues(List<String> supportedValues) {
            return supportedValues(Output.of(supportedValues));
        }

        /**
         * @param supportedValues Values to be filtered.
         * 
         * @return builder
         * 
         */
        public Builder supportedValues(String... supportedValues) {
            return supportedValues(List.of(supportedValues));
        }

        /**
         * @param type Type of product filter.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<Either<String,SupportedFilterTypes>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of product filter.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,SupportedFilterTypes> type) {
            return type(Output.of(type));
        }

        /**
         * @param type Type of product filter.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type Type of product filter.
         * 
         * @return builder
         * 
         */
        public Builder type(SupportedFilterTypes type) {
            return type(Either.ofRight(type));
        }

        public FilterablePropertyArgs build() {
            $.supportedValues = Objects.requireNonNull($.supportedValues, "expected parameter 'supportedValues' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
