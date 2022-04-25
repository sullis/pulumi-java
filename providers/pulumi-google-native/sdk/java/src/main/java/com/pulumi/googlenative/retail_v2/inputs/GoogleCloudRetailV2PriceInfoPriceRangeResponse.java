// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.retail_v2.inputs.GoogleCloudRetailV2IntervalResponse;
import java.util.Objects;


/**
 * The price range of all variant Product having the same Product.primary_product_id.
 * 
 */
public final class GoogleCloudRetailV2PriceInfoPriceRangeResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2PriceInfoPriceRangeResponse Empty = new GoogleCloudRetailV2PriceInfoPriceRangeResponse();

    /**
     * The inclusive Product.pricing_info.original_price internal of all variant Product having the same Product.primary_product_id.
     * 
     */
    @Import(name="originalPrice", required=true)
    private GoogleCloudRetailV2IntervalResponse originalPrice;

    /**
     * @return The inclusive Product.pricing_info.original_price internal of all variant Product having the same Product.primary_product_id.
     * 
     */
    public GoogleCloudRetailV2IntervalResponse originalPrice() {
        return this.originalPrice;
    }

    /**
     * The inclusive Product.pricing_info.price interval of all variant Product having the same Product.primary_product_id.
     * 
     */
    @Import(name="price", required=true)
    private GoogleCloudRetailV2IntervalResponse price;

    /**
     * @return The inclusive Product.pricing_info.price interval of all variant Product having the same Product.primary_product_id.
     * 
     */
    public GoogleCloudRetailV2IntervalResponse price() {
        return this.price;
    }

    private GoogleCloudRetailV2PriceInfoPriceRangeResponse() {}

    private GoogleCloudRetailV2PriceInfoPriceRangeResponse(GoogleCloudRetailV2PriceInfoPriceRangeResponse $) {
        this.originalPrice = $.originalPrice;
        this.price = $.price;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRetailV2PriceInfoPriceRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2PriceInfoPriceRangeResponse $;

        public Builder() {
            $ = new GoogleCloudRetailV2PriceInfoPriceRangeResponse();
        }

        public Builder(GoogleCloudRetailV2PriceInfoPriceRangeResponse defaults) {
            $ = new GoogleCloudRetailV2PriceInfoPriceRangeResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param originalPrice The inclusive Product.pricing_info.original_price internal of all variant Product having the same Product.primary_product_id.
         * 
         * @return builder
         * 
         */
        public Builder originalPrice(GoogleCloudRetailV2IntervalResponse originalPrice) {
            $.originalPrice = originalPrice;
            return this;
        }

        /**
         * @param price The inclusive Product.pricing_info.price interval of all variant Product having the same Product.primary_product_id.
         * 
         * @return builder
         * 
         */
        public Builder price(GoogleCloudRetailV2IntervalResponse price) {
            $.price = price;
            return this;
        }

        public GoogleCloudRetailV2PriceInfoPriceRangeResponse build() {
            $.originalPrice = Objects.requireNonNull($.originalPrice, "expected parameter 'originalPrice' to be non-null");
            $.price = Objects.requireNonNull($.price, "expected parameter 'price' to be non-null");
            return $;
        }
    }

}
