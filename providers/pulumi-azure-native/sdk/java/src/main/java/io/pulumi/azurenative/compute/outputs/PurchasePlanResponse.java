// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PurchasePlanResponse {
    /**
     * The plan ID.
     * 
     */
    private final String name;
    /**
     * Specifies the product of the image from the marketplace. This is the same value as Offer under the imageReference element.
     * 
     */
    private final String product;
    /**
     * The Offer Promotion Code.
     * 
     */
    private final @Nullable String promotionCode;
    /**
     * The publisher ID.
     * 
     */
    private final String publisher;

    @OutputCustomType.Constructor({"name","product","promotionCode","publisher"})
    private PurchasePlanResponse(
        String name,
        String product,
        @Nullable String promotionCode,
        String publisher) {
        this.name = Objects.requireNonNull(name);
        this.product = Objects.requireNonNull(product);
        this.promotionCode = promotionCode;
        this.publisher = Objects.requireNonNull(publisher);
    }

    /**
     * The plan ID.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Specifies the product of the image from the marketplace. This is the same value as Offer under the imageReference element.
     * 
     */
    public String getProduct() {
        return this.product;
    }
    /**
     * The Offer Promotion Code.
     * 
     */
    public Optional<String> getPromotionCode() {
        return Optional.ofNullable(this.promotionCode);
    }
    /**
     * The publisher ID.
     * 
     */
    public String getPublisher() {
        return this.publisher;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PurchasePlanResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String product;
        private @Nullable String promotionCode;
        private String publisher;

        public Builder() {
    	      // Empty
        }

        public Builder(PurchasePlanResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.product = defaults.product;
    	      this.promotionCode = defaults.promotionCode;
    	      this.publisher = defaults.publisher;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProduct(String product) {
            this.product = Objects.requireNonNull(product);
            return this;
        }

        public Builder setPromotionCode(@Nullable String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
        }

        public Builder setPublisher(String publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }

        public PurchasePlanResponse build() {
            return new PurchasePlanResponse(name, product, promotionCode, publisher);
        }
    }
}
