// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PlatformImagePurchasePlanResponse {
    /**
     * Name of the purchase plan.
     * 
     */
    private final String planName;
    /**
     * Product of the purchase plan.
     * 
     */
    private final String planProduct;
    /**
     * Publisher of the purchase plan.
     * 
     */
    private final String planPublisher;

    @OutputCustomType.Constructor({"planName","planProduct","planPublisher"})
    private PlatformImagePurchasePlanResponse(
        String planName,
        String planProduct,
        String planPublisher) {
        this.planName = Objects.requireNonNull(planName);
        this.planProduct = Objects.requireNonNull(planProduct);
        this.planPublisher = Objects.requireNonNull(planPublisher);
    }

    /**
     * Name of the purchase plan.
     * 
     */
    public String getPlanName() {
        return this.planName;
    }
    /**
     * Product of the purchase plan.
     * 
     */
    public String getPlanProduct() {
        return this.planProduct;
    }
    /**
     * Publisher of the purchase plan.
     * 
     */
    public String getPlanPublisher() {
        return this.planPublisher;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlatformImagePurchasePlanResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String planName;
        private String planProduct;
        private String planPublisher;

        public Builder() {
    	      // Empty
        }

        public Builder(PlatformImagePurchasePlanResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.planName = defaults.planName;
    	      this.planProduct = defaults.planProduct;
    	      this.planPublisher = defaults.planPublisher;
        }

        public Builder setPlanName(String planName) {
            this.planName = Objects.requireNonNull(planName);
            return this;
        }

        public Builder setPlanProduct(String planProduct) {
            this.planProduct = Objects.requireNonNull(planProduct);
            return this;
        }

        public Builder setPlanPublisher(String planPublisher) {
            this.planPublisher = Objects.requireNonNull(planPublisher);
            return this;
        }

        public PlatformImagePurchasePlanResponse build() {
            return new PlatformImagePurchasePlanResponse(planName, planProduct, planPublisher);
        }
    }
}
