// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PlanResponse {
    /**
     * The plan ID.
     * 
     */
    private final @Nullable String name;
    /**
     * Specifies the product of the image from the marketplace. This is the same value as Offer under the imageReference element.
     * 
     */
    private final @Nullable String product;
    /**
     * The promotion code.
     * 
     */
    private final @Nullable String promotionCode;
    /**
     * The publisher ID.
     * 
     */
    private final @Nullable String publisher;

    @OutputCustomType.Constructor({"name","product","promotionCode","publisher"})
    private PlanResponse(
        @Nullable String name,
        @Nullable String product,
        @Nullable String promotionCode,
        @Nullable String publisher) {
        this.name = name;
        this.product = product;
        this.promotionCode = promotionCode;
        this.publisher = publisher;
    }

    /**
     * The plan ID.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Specifies the product of the image from the marketplace. This is the same value as Offer under the imageReference element.
     * 
     */
    public Optional<String> getProduct() {
        return Optional.ofNullable(this.product);
    }
    /**
     * The promotion code.
     * 
     */
    public Optional<String> getPromotionCode() {
        return Optional.ofNullable(this.promotionCode);
    }
    /**
     * The publisher ID.
     * 
     */
    public Optional<String> getPublisher() {
        return Optional.ofNullable(this.publisher);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlanResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String product;
        private @Nullable String promotionCode;
        private @Nullable String publisher;

        public Builder() {
    	      // Empty
        }

        public Builder(PlanResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.product = defaults.product;
    	      this.promotionCode = defaults.promotionCode;
    	      this.publisher = defaults.publisher;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProduct(@Nullable String product) {
            this.product = product;
            return this;
        }

        public Builder setPromotionCode(@Nullable String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
        }

        public Builder setPublisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }

        public PlanResponse build() {
            return new PlanResponse(name, product, promotionCode, publisher);
        }
    }
}
