// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.billing.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of the Azure plan.
 * 
 */
public final class AzurePlanResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzurePlanResponse Empty = new AzurePlanResponse();

    /**
     * The sku description.
     * 
     */
    @InputImport(name="skuDescription", required=true)
    private final String skuDescription;

    public String getSkuDescription() {
        return this.skuDescription;
    }

    /**
     * The sku id.
     * 
     */
    @InputImport(name="skuId")
    private final @Nullable String skuId;

    public Optional<String> getSkuId() {
        return this.skuId == null ? Optional.empty() : Optional.ofNullable(this.skuId);
    }

    public AzurePlanResponse(
        String skuDescription,
        @Nullable String skuId) {
        this.skuDescription = Objects.requireNonNull(skuDescription, "expected parameter 'skuDescription' to be non-null");
        this.skuId = skuId;
    }

    private AzurePlanResponse() {
        this.skuDescription = null;
        this.skuId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzurePlanResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String skuDescription;
        private @Nullable String skuId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzurePlanResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.skuDescription = defaults.skuDescription;
    	      this.skuId = defaults.skuId;
        }

        public Builder setSkuDescription(String skuDescription) {
            this.skuDescription = Objects.requireNonNull(skuDescription);
            return this;
        }

        public Builder setSkuId(@Nullable String skuId) {
            this.skuId = skuId;
            return this;
        }

        public AzurePlanResponse build() {
            return new AzurePlanResponse(skuDescription, skuId);
        }
    }
}
