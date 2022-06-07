// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.FirewallPolicyIDPSQuerySortOrder;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a column to sort
 * 
 */
public final class OrderByArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrderByArgs Empty = new OrderByArgs();

    /**
     * Describes the actual column name to sort by
     * 
     */
    @Import(name="field")
    private @Nullable Output<String> field;

    /**
     * @return Describes the actual column name to sort by
     * 
     */
    public Optional<Output<String>> field() {
        return Optional.ofNullable(this.field);
    }

    /**
     * Describes if results should be in ascending/descending order
     * 
     */
    @Import(name="order")
    private @Nullable Output<Either<String,FirewallPolicyIDPSQuerySortOrder>> order;

    /**
     * @return Describes if results should be in ascending/descending order
     * 
     */
    public Optional<Output<Either<String,FirewallPolicyIDPSQuerySortOrder>>> order() {
        return Optional.ofNullable(this.order);
    }

    private OrderByArgs() {}

    private OrderByArgs(OrderByArgs $) {
        this.field = $.field;
        this.order = $.order;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrderByArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrderByArgs $;

        public Builder() {
            $ = new OrderByArgs();
        }

        public Builder(OrderByArgs defaults) {
            $ = new OrderByArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param field Describes the actual column name to sort by
         * 
         * @return builder
         * 
         */
        public Builder field(@Nullable Output<String> field) {
            $.field = field;
            return this;
        }

        /**
         * @param field Describes the actual column name to sort by
         * 
         * @return builder
         * 
         */
        public Builder field(String field) {
            return field(Output.of(field));
        }

        /**
         * @param order Describes if results should be in ascending/descending order
         * 
         * @return builder
         * 
         */
        public Builder order(@Nullable Output<Either<String,FirewallPolicyIDPSQuerySortOrder>> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order Describes if results should be in ascending/descending order
         * 
         * @return builder
         * 
         */
        public Builder order(Either<String,FirewallPolicyIDPSQuerySortOrder> order) {
            return order(Output.of(order));
        }

        /**
         * @param order Describes if results should be in ascending/descending order
         * 
         * @return builder
         * 
         */
        public Builder order(String order) {
            return order(Either.ofLeft(order));
        }

        /**
         * @param order Describes if results should be in ascending/descending order
         * 
         * @return builder
         * 
         */
        public Builder order(FirewallPolicyIDPSQuerySortOrder order) {
            return order(Either.ofRight(order));
        }

        public OrderByArgs build() {
            return $;
        }
    }

}
