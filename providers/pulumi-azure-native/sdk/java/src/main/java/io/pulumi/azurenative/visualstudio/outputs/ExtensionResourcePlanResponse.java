// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.visualstudio.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExtensionResourcePlanResponse {
    /**
     * Name of the plan.
     * 
     */
    private final @Nullable String name;
    /**
     * Product name.
     * 
     */
    private final @Nullable String product;
    /**
     * Optional: the promotion code associated with the plan.
     * 
     */
    private final @Nullable String promotionCode;
    /**
     * Name of the extension publisher.
     * 
     */
    private final @Nullable String publisher;
    /**
     * A string that uniquely identifies the plan version.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor({"name","product","promotionCode","publisher","version"})
    private ExtensionResourcePlanResponse(
        @Nullable String name,
        @Nullable String product,
        @Nullable String promotionCode,
        @Nullable String publisher,
        @Nullable String version) {
        this.name = name;
        this.product = product;
        this.promotionCode = promotionCode;
        this.publisher = publisher;
        this.version = version;
    }

    /**
     * Name of the plan.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Product name.
     * 
    */
    public Optional<String> getProduct() {
        return Optional.ofNullable(this.product);
    }
    /**
     * Optional: the promotion code associated with the plan.
     * 
    */
    public Optional<String> getPromotionCode() {
        return Optional.ofNullable(this.promotionCode);
    }
    /**
     * Name of the extension publisher.
     * 
    */
    public Optional<String> getPublisher() {
        return Optional.ofNullable(this.publisher);
    }
    /**
     * A string that uniquely identifies the plan version.
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtensionResourcePlanResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String product;
        private @Nullable String promotionCode;
        private @Nullable String publisher;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtensionResourcePlanResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.product = defaults.product;
    	      this.promotionCode = defaults.promotionCode;
    	      this.publisher = defaults.publisher;
    	      this.version = defaults.version;
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

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public ExtensionResourcePlanResponse build() {
            return new ExtensionResourcePlanResponse(name, product, promotionCode, publisher, version);
        }
    }
}