// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaIntervalResponse;
import java.util.Objects;


/**
 * The price range of all variant Product having the same Product.primary_product_id.
 * 
 */
public final class GoogleCloudRetailV2betaPriceInfoPriceRangeResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2betaPriceInfoPriceRangeResponse Empty = new GoogleCloudRetailV2betaPriceInfoPriceRangeResponse();

    /**
     * The inclusive Product.pricing_info.original_price internal of all variant Product having the same Product.primary_product_id.
     * 
     */
    @InputImport(name="originalPrice", required=true)
      private final GoogleCloudRetailV2betaIntervalResponse originalPrice;

    public GoogleCloudRetailV2betaIntervalResponse getOriginalPrice() {
        return this.originalPrice;
    }

    /**
     * The inclusive Product.pricing_info.price interval of all variant Product having the same Product.primary_product_id.
     * 
     */
    @InputImport(name="price", required=true)
      private final GoogleCloudRetailV2betaIntervalResponse price;

    public GoogleCloudRetailV2betaIntervalResponse getPrice() {
        return this.price;
    }

    public GoogleCloudRetailV2betaPriceInfoPriceRangeResponse(
        GoogleCloudRetailV2betaIntervalResponse originalPrice,
        GoogleCloudRetailV2betaIntervalResponse price) {
        this.originalPrice = Objects.requireNonNull(originalPrice, "expected parameter 'originalPrice' to be non-null");
        this.price = Objects.requireNonNull(price, "expected parameter 'price' to be non-null");
    }

    private GoogleCloudRetailV2betaPriceInfoPriceRangeResponse() {
        this.originalPrice = null;
        this.price = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaPriceInfoPriceRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2betaIntervalResponse originalPrice;
        private GoogleCloudRetailV2betaIntervalResponse price;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaPriceInfoPriceRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.originalPrice = defaults.originalPrice;
    	      this.price = defaults.price;
        }

        public Builder setOriginalPrice(GoogleCloudRetailV2betaIntervalResponse originalPrice) {
            this.originalPrice = Objects.requireNonNull(originalPrice);
            return this;
        }

        public Builder setPrice(GoogleCloudRetailV2betaIntervalResponse price) {
            this.price = Objects.requireNonNull(price);
            return this;
        }
        public GoogleCloudRetailV2betaPriceInfoPriceRangeResponse build() {
            return new GoogleCloudRetailV2betaPriceInfoPriceRangeResponse(originalPrice, price);
        }
    }
}