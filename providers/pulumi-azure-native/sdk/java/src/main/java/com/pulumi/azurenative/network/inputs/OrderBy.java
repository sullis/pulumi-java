// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a column to sort
 * 
 */
public final class OrderBy extends com.pulumi.resources.InvokeArgs {

    public static final OrderBy Empty = new OrderBy();

    /**
     * Describes the actual column name to sort by
     * 
     */
    @Import(name="field")
    private @Nullable String field;

    /**
     * @return Describes the actual column name to sort by
     * 
     */
    public Optional<String> field() {
        return Optional.ofNullable(this.field);
    }

    /**
     * Describes if results should be in ascending/descending order
     * 
     */
    @Import(name="order")
    private @Nullable String order;

    /**
     * @return Describes if results should be in ascending/descending order
     * 
     */
    public Optional<String> order() {
        return Optional.ofNullable(this.order);
    }

    private OrderBy() {}

    private OrderBy(OrderBy $) {
        this.field = $.field;
        this.order = $.order;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrderBy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrderBy $;

        public Builder() {
            $ = new OrderBy();
        }

        public Builder(OrderBy defaults) {
            $ = new OrderBy(Objects.requireNonNull(defaults));
        }

        /**
         * @param field Describes the actual column name to sort by
         * 
         * @return builder
         * 
         */
        public Builder field(@Nullable String field) {
            $.field = field;
            return this;
        }

        /**
         * @param order Describes if results should be in ascending/descending order
         * 
         * @return builder
         * 
         */
        public Builder order(@Nullable String order) {
            $.order = order;
            return this;
        }

        public OrderBy build() {
            return $;
        }
    }

}
