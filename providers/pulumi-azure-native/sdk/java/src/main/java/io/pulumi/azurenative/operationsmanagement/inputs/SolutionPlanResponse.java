// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationsmanagement.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Plan for solution object supported by the OperationsManagement resource provider.
 * 
 */
public final class SolutionPlanResponse extends io.pulumi.resources.InvokeArgs {

    public static final SolutionPlanResponse Empty = new SolutionPlanResponse();

    /**
     * name of the solution to be created. For Microsoft published solution it should be in the format of solutionType(workspaceName). SolutionType part is case sensitive. For third party solution, it can be anything.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * name of the solution to enabled/add. For Microsoft published gallery solution it should be in the format of OMSGallery/<solutionType>. This is case sensitive
     * 
     */
    @InputImport(name="product")
    private final @Nullable String product;

    public Optional<String> getProduct() {
        return this.product == null ? Optional.empty() : Optional.ofNullable(this.product);
    }

    /**
     * promotionCode, Not really used now, can you left as empty
     * 
     */
    @InputImport(name="promotionCode")
    private final @Nullable String promotionCode;

    public Optional<String> getPromotionCode() {
        return this.promotionCode == null ? Optional.empty() : Optional.ofNullable(this.promotionCode);
    }

    /**
     * Publisher name. For gallery solution, it is Microsoft.
     * 
     */
    @InputImport(name="publisher")
    private final @Nullable String publisher;

    public Optional<String> getPublisher() {
        return this.publisher == null ? Optional.empty() : Optional.ofNullable(this.publisher);
    }

    public SolutionPlanResponse(
        @Nullable String name,
        @Nullable String product,
        @Nullable String promotionCode,
        @Nullable String publisher) {
        this.name = name;
        this.product = product;
        this.promotionCode = promotionCode;
        this.publisher = publisher;
    }

    private SolutionPlanResponse() {
        this.name = null;
        this.product = null;
        this.promotionCode = null;
        this.publisher = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SolutionPlanResponse defaults) {
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

        public Builder(SolutionPlanResponse defaults) {
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

        public SolutionPlanResponse build() {
            return new SolutionPlanResponse(name, product, promotionCode, publisher);
        }
    }
}
