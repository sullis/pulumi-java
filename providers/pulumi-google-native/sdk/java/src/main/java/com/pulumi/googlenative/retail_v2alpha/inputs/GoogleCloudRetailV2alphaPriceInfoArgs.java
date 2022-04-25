// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The price information of a Product.
 * 
 */
public final class GoogleCloudRetailV2alphaPriceInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2alphaPriceInfoArgs Empty = new GoogleCloudRetailV2alphaPriceInfoArgs();

    /**
     * The costs associated with the sale of a particular product. Used for gross profit reporting. * Profit = price - cost Google Merchant Center property [cost_of_goods_sold](https://support.google.com/merchants/answer/9017895).
     * 
     */
    @Import(name="cost")
    private @Nullable Output<Double> cost;

    /**
     * @return The costs associated with the sale of a particular product. Used for gross profit reporting. * Profit = price - cost Google Merchant Center property [cost_of_goods_sold](https://support.google.com/merchants/answer/9017895).
     * 
     */
    public Optional<Output<Double>> cost() {
        return Optional.ofNullable(this.cost);
    }

    /**
     * The 3-letter currency code defined in [ISO 4217](https://www.iso.org/iso-4217-currency-codes.html). If this field is an unrecognizable currency code, an INVALID_ARGUMENT error is returned. The Product.Type.VARIANT Products with the same Product.primary_product_id must share the same currency_code. Otherwise, a FAILED_PRECONDITION error is returned.
     * 
     */
    @Import(name="currencyCode")
    private @Nullable Output<String> currencyCode;

    /**
     * @return The 3-letter currency code defined in [ISO 4217](https://www.iso.org/iso-4217-currency-codes.html). If this field is an unrecognizable currency code, an INVALID_ARGUMENT error is returned. The Product.Type.VARIANT Products with the same Product.primary_product_id must share the same currency_code. Otherwise, a FAILED_PRECONDITION error is returned.
     * 
     */
    public Optional<Output<String>> currencyCode() {
        return Optional.ofNullable(this.currencyCode);
    }

    /**
     * Price of the product without any discount. If zero, by default set to be the price.
     * 
     */
    @Import(name="originalPrice")
    private @Nullable Output<Double> originalPrice;

    /**
     * @return Price of the product without any discount. If zero, by default set to be the price.
     * 
     */
    public Optional<Output<Double>> originalPrice() {
        return Optional.ofNullable(this.originalPrice);
    }

    /**
     * Price of the product. Google Merchant Center property [price](https://support.google.com/merchants/answer/6324371). Schema.org property [Offer.price](https://schema.org/price).
     * 
     */
    @Import(name="price")
    private @Nullable Output<Double> price;

    /**
     * @return Price of the product. Google Merchant Center property [price](https://support.google.com/merchants/answer/6324371). Schema.org property [Offer.price](https://schema.org/price).
     * 
     */
    public Optional<Output<Double>> price() {
        return Optional.ofNullable(this.price);
    }

    /**
     * The timestamp when the price starts to be effective. This can be set as a future timestamp, and the price is only used for search after price_effective_time. If so, the original_price must be set and original_price is used before price_effective_time. Do not set if price is always effective because it will cause additional latency during search.
     * 
     */
    @Import(name="priceEffectiveTime")
    private @Nullable Output<String> priceEffectiveTime;

    /**
     * @return The timestamp when the price starts to be effective. This can be set as a future timestamp, and the price is only used for search after price_effective_time. If so, the original_price must be set and original_price is used before price_effective_time. Do not set if price is always effective because it will cause additional latency during search.
     * 
     */
    public Optional<Output<String>> priceEffectiveTime() {
        return Optional.ofNullable(this.priceEffectiveTime);
    }

    /**
     * The timestamp when the price stops to be effective. The price is used for search before price_expire_time. If this field is set, the original_price must be set and original_price is used after price_expire_time. Do not set if price is always effective because it will cause additional latency during search.
     * 
     */
    @Import(name="priceExpireTime")
    private @Nullable Output<String> priceExpireTime;

    /**
     * @return The timestamp when the price stops to be effective. The price is used for search before price_expire_time. If this field is set, the original_price must be set and original_price is used after price_expire_time. Do not set if price is always effective because it will cause additional latency during search.
     * 
     */
    public Optional<Output<String>> priceExpireTime() {
        return Optional.ofNullable(this.priceExpireTime);
    }

    private GoogleCloudRetailV2alphaPriceInfoArgs() {}

    private GoogleCloudRetailV2alphaPriceInfoArgs(GoogleCloudRetailV2alphaPriceInfoArgs $) {
        this.cost = $.cost;
        this.currencyCode = $.currencyCode;
        this.originalPrice = $.originalPrice;
        this.price = $.price;
        this.priceEffectiveTime = $.priceEffectiveTime;
        this.priceExpireTime = $.priceExpireTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRetailV2alphaPriceInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2alphaPriceInfoArgs $;

        public Builder() {
            $ = new GoogleCloudRetailV2alphaPriceInfoArgs();
        }

        public Builder(GoogleCloudRetailV2alphaPriceInfoArgs defaults) {
            $ = new GoogleCloudRetailV2alphaPriceInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cost The costs associated with the sale of a particular product. Used for gross profit reporting. * Profit = price - cost Google Merchant Center property [cost_of_goods_sold](https://support.google.com/merchants/answer/9017895).
         * 
         * @return builder
         * 
         */
        public Builder cost(@Nullable Output<Double> cost) {
            $.cost = cost;
            return this;
        }

        /**
         * @param cost The costs associated with the sale of a particular product. Used for gross profit reporting. * Profit = price - cost Google Merchant Center property [cost_of_goods_sold](https://support.google.com/merchants/answer/9017895).
         * 
         * @return builder
         * 
         */
        public Builder cost(Double cost) {
            return cost(Output.of(cost));
        }

        /**
         * @param currencyCode The 3-letter currency code defined in [ISO 4217](https://www.iso.org/iso-4217-currency-codes.html). If this field is an unrecognizable currency code, an INVALID_ARGUMENT error is returned. The Product.Type.VARIANT Products with the same Product.primary_product_id must share the same currency_code. Otherwise, a FAILED_PRECONDITION error is returned.
         * 
         * @return builder
         * 
         */
        public Builder currencyCode(@Nullable Output<String> currencyCode) {
            $.currencyCode = currencyCode;
            return this;
        }

        /**
         * @param currencyCode The 3-letter currency code defined in [ISO 4217](https://www.iso.org/iso-4217-currency-codes.html). If this field is an unrecognizable currency code, an INVALID_ARGUMENT error is returned. The Product.Type.VARIANT Products with the same Product.primary_product_id must share the same currency_code. Otherwise, a FAILED_PRECONDITION error is returned.
         * 
         * @return builder
         * 
         */
        public Builder currencyCode(String currencyCode) {
            return currencyCode(Output.of(currencyCode));
        }

        /**
         * @param originalPrice Price of the product without any discount. If zero, by default set to be the price.
         * 
         * @return builder
         * 
         */
        public Builder originalPrice(@Nullable Output<Double> originalPrice) {
            $.originalPrice = originalPrice;
            return this;
        }

        /**
         * @param originalPrice Price of the product without any discount. If zero, by default set to be the price.
         * 
         * @return builder
         * 
         */
        public Builder originalPrice(Double originalPrice) {
            return originalPrice(Output.of(originalPrice));
        }

        /**
         * @param price Price of the product. Google Merchant Center property [price](https://support.google.com/merchants/answer/6324371). Schema.org property [Offer.price](https://schema.org/price).
         * 
         * @return builder
         * 
         */
        public Builder price(@Nullable Output<Double> price) {
            $.price = price;
            return this;
        }

        /**
         * @param price Price of the product. Google Merchant Center property [price](https://support.google.com/merchants/answer/6324371). Schema.org property [Offer.price](https://schema.org/price).
         * 
         * @return builder
         * 
         */
        public Builder price(Double price) {
            return price(Output.of(price));
        }

        /**
         * @param priceEffectiveTime The timestamp when the price starts to be effective. This can be set as a future timestamp, and the price is only used for search after price_effective_time. If so, the original_price must be set and original_price is used before price_effective_time. Do not set if price is always effective because it will cause additional latency during search.
         * 
         * @return builder
         * 
         */
        public Builder priceEffectiveTime(@Nullable Output<String> priceEffectiveTime) {
            $.priceEffectiveTime = priceEffectiveTime;
            return this;
        }

        /**
         * @param priceEffectiveTime The timestamp when the price starts to be effective. This can be set as a future timestamp, and the price is only used for search after price_effective_time. If so, the original_price must be set and original_price is used before price_effective_time. Do not set if price is always effective because it will cause additional latency during search.
         * 
         * @return builder
         * 
         */
        public Builder priceEffectiveTime(String priceEffectiveTime) {
            return priceEffectiveTime(Output.of(priceEffectiveTime));
        }

        /**
         * @param priceExpireTime The timestamp when the price stops to be effective. The price is used for search before price_expire_time. If this field is set, the original_price must be set and original_price is used after price_expire_time. Do not set if price is always effective because it will cause additional latency during search.
         * 
         * @return builder
         * 
         */
        public Builder priceExpireTime(@Nullable Output<String> priceExpireTime) {
            $.priceExpireTime = priceExpireTime;
            return this;
        }

        /**
         * @param priceExpireTime The timestamp when the price stops to be effective. The price is used for search before price_expire_time. If this field is set, the original_price must be set and original_price is used after price_expire_time. Do not set if price is always effective because it will cause additional latency during search.
         * 
         * @return builder
         * 
         */
        public Builder priceExpireTime(String priceExpireTime) {
            return priceExpireTime(Output.of(priceExpireTime));
        }

        public GoogleCloudRetailV2alphaPriceInfoArgs build() {
            return $;
        }
    }

}
