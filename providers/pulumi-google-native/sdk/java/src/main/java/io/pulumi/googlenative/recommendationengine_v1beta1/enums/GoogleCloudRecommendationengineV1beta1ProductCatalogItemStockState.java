// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recommendationengine_v1beta1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. Online stock state of the catalog item. Default is `IN_STOCK`.
     * 
     */
    @EnumType
    public enum GoogleCloudRecommendationengineV1beta1ProductCatalogItemStockState {
        /**
         * Default item stock status. Should never be used.
         * 
         */
        StockStateUnspecified("STOCK_STATE_UNSPECIFIED"),
        /**
         * Item in stock.
         * 
         */
        InStock("IN_STOCK"),
        /**
         * Item out of stock.
         * 
         */
        OutOfStock("OUT_OF_STOCK"),
        /**
         * Item that is in pre-order state.
         * 
         */
        Preorder("PREORDER"),
        /**
         * Item that is back-ordered (i.e. temporarily out of stock).
         * 
         */
        Backorder("BACKORDER");

        private final String value;

        GoogleCloudRecommendationengineV1beta1ProductCatalogItemStockState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudRecommendationengineV1beta1ProductCatalogItemStockState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }