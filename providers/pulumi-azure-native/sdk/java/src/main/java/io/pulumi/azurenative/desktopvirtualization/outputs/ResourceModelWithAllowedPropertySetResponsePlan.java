// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceModelWithAllowedPropertySetResponsePlan {
    /**
     * A user defined name of the 3rd Party Artifact that is being procured.
     * 
     */
    private final String name;
    /**
     * The 3rd Party artifact that is being procured. E.g. NewRelic. Product maps to the OfferID specified for the artifact at the time of Data Market onboarding.
     * 
     */
    private final String product;
    /**
     * A publisher provided promotion code as provisioned in Data Market for the said product/artifact.
     * 
     */
    private final @Nullable String promotionCode;
    /**
     * The publisher of the 3rd Party Artifact that is being bought. E.g. NewRelic
     * 
     */
    private final String publisher;
    /**
     * The version of the desired product/artifact.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor({"name","product","promotionCode","publisher","version"})
    private ResourceModelWithAllowedPropertySetResponsePlan(
        String name,
        String product,
        @Nullable String promotionCode,
        String publisher,
        @Nullable String version) {
        this.name = Objects.requireNonNull(name);
        this.product = Objects.requireNonNull(product);
        this.promotionCode = promotionCode;
        this.publisher = Objects.requireNonNull(publisher);
        this.version = version;
    }

    /**
     * A user defined name of the 3rd Party Artifact that is being procured.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The 3rd Party artifact that is being procured. E.g. NewRelic. Product maps to the OfferID specified for the artifact at the time of Data Market onboarding.
     * 
     */
    public String getProduct() {
        return this.product;
    }
    /**
     * A publisher provided promotion code as provisioned in Data Market for the said product/artifact.
     * 
     */
    public Optional<String> getPromotionCode() {
        return Optional.ofNullable(this.promotionCode);
    }
    /**
     * The publisher of the 3rd Party Artifact that is being bought. E.g. NewRelic
     * 
     */
    public String getPublisher() {
        return this.publisher;
    }
    /**
     * The version of the desired product/artifact.
     * 
     */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceModelWithAllowedPropertySetResponsePlan defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String product;
        private @Nullable String promotionCode;
        private String publisher;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceModelWithAllowedPropertySetResponsePlan defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.product = defaults.product;
    	      this.promotionCode = defaults.promotionCode;
    	      this.publisher = defaults.publisher;
    	      this.version = defaults.version;
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

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public ResourceModelWithAllowedPropertySetResponsePlan build() {
            return new ResourceModelWithAllowedPropertySetResponsePlan(name, product, promotionCode, publisher, version);
        }
    }
}
