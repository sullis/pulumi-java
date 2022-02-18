// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.softwareplan;

import io.pulumi.azurenative.softwareplan.inputs.SkuArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HybridUseBenefitArgs extends io.pulumi.resources.ResourceArgs {

    public static final HybridUseBenefitArgs Empty = new HybridUseBenefitArgs();

    /**
     * This is a unique identifier for a plan. Should be a guid.
     * 
     */
    @InputImport(name="planId")
    private final @Nullable Input<String> planId;

    public Input<String> getPlanId() {
        return this.planId == null ? Input.empty() : this.planId;
    }

    /**
     * The scope at which the operation is performed. This is limited to Microsoft.Compute/virtualMachines and Microsoft.Compute/hostGroups/hosts for now
     * 
     */
    @InputImport(name="scope", required=true)
    private final Input<String> scope;

    public Input<String> getScope() {
        return this.scope;
    }

    /**
     * Hybrid use benefit SKU
     * 
     */
    @InputImport(name="sku", required=true)
    private final Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku;
    }

    public HybridUseBenefitArgs(
        @Nullable Input<String> planId,
        Input<String> scope,
        Input<SkuArgs> sku) {
        this.planId = planId;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
    }

    private HybridUseBenefitArgs() {
        this.planId = Input.empty();
        this.scope = Input.empty();
        this.sku = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HybridUseBenefitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> planId;
        private Input<String> scope;
        private Input<SkuArgs> sku;

        public Builder() {
    	      // Empty
        }

        public Builder(HybridUseBenefitArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.planId = defaults.planId;
    	      this.scope = defaults.scope;
    	      this.sku = defaults.sku;
        }

        public Builder setPlanId(@Nullable Input<String> planId) {
            this.planId = planId;
            return this;
        }

        public Builder setPlanId(@Nullable String planId) {
            this.planId = Input.ofNullable(planId);
            return this;
        }

        public Builder setScope(Input<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Input.of(Objects.requireNonNull(scope));
            return this;
        }

        public Builder setSku(Input<SkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setSku(SkuArgs sku) {
            this.sku = Input.of(Objects.requireNonNull(sku));
            return this;
        }

        public HybridUseBenefitArgs build() {
            return new HybridUseBenefitArgs(planId, scope, sku);
        }
    }
}
