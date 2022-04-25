// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.billing.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of the Azure plan.
 * 
 */
public final class AzurePlanResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzurePlanResponse Empty = new AzurePlanResponse();

    /**
     * The sku description.
     * 
     */
    @Import(name="skuDescription", required=true)
    private String skuDescription;

    /**
     * @return The sku description.
     * 
     */
    public String skuDescription() {
        return this.skuDescription;
    }

    /**
     * The sku id.
     * 
     */
    @Import(name="skuId")
    private @Nullable String skuId;

    /**
     * @return The sku id.
     * 
     */
    public Optional<String> skuId() {
        return Optional.ofNullable(this.skuId);
    }

    private AzurePlanResponse() {}

    private AzurePlanResponse(AzurePlanResponse $) {
        this.skuDescription = $.skuDescription;
        this.skuId = $.skuId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzurePlanResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzurePlanResponse $;

        public Builder() {
            $ = new AzurePlanResponse();
        }

        public Builder(AzurePlanResponse defaults) {
            $ = new AzurePlanResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param skuDescription The sku description.
         * 
         * @return builder
         * 
         */
        public Builder skuDescription(String skuDescription) {
            $.skuDescription = skuDescription;
            return this;
        }

        /**
         * @param skuId The sku id.
         * 
         * @return builder
         * 
         */
        public Builder skuId(@Nullable String skuId) {
            $.skuId = skuId;
            return this;
        }

        public AzurePlanResponse build() {
            $.skuDescription = Objects.requireNonNull($.skuDescription, "expected parameter 'skuDescription' to be non-null");
            return $;
        }
    }

}
