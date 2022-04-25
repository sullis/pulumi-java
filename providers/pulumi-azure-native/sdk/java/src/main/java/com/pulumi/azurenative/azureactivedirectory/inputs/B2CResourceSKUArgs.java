// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azureactivedirectory.inputs;

import com.pulumi.azurenative.azureactivedirectory.enums.B2CResourceSKUName;
import com.pulumi.azurenative.azureactivedirectory.enums.B2CResourceSKUTier;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SKU properties of the Azure AD B2C tenant. Learn more about Azure AD B2C billing at [aka.ms/b2cBilling](https://aka.ms/b2cBilling).
 * 
 */
public final class B2CResourceSKUArgs extends com.pulumi.resources.ResourceArgs {

    public static final B2CResourceSKUArgs Empty = new B2CResourceSKUArgs();

    /**
     * The name of the SKU for the tenant.
     * 
     */
    @Import(name="name")
    private @Nullable Output<B2CResourceSKUName> name;

    /**
     * @return The name of the SKU for the tenant.
     * 
     */
    public Optional<Output<B2CResourceSKUName>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The tier of the tenant.
     * 
     */
    @Import(name="tier")
    private @Nullable Output<B2CResourceSKUTier> tier;

    /**
     * @return The tier of the tenant.
     * 
     */
    public Optional<Output<B2CResourceSKUTier>> tier() {
        return Optional.ofNullable(this.tier);
    }

    private B2CResourceSKUArgs() {}

    private B2CResourceSKUArgs(B2CResourceSKUArgs $) {
        this.name = $.name;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(B2CResourceSKUArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private B2CResourceSKUArgs $;

        public Builder() {
            $ = new B2CResourceSKUArgs();
        }

        public Builder(B2CResourceSKUArgs defaults) {
            $ = new B2CResourceSKUArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the SKU for the tenant.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<B2CResourceSKUName> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the SKU for the tenant.
         * 
         * @return builder
         * 
         */
        public Builder name(B2CResourceSKUName name) {
            return name(Output.of(name));
        }

        /**
         * @param tier The tier of the tenant.
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable Output<B2CResourceSKUTier> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier The tier of the tenant.
         * 
         * @return builder
         * 
         */
        public Builder tier(B2CResourceSKUTier tier) {
            return tier(Output.of(tier));
        }

        public B2CResourceSKUArgs build() {
            return $;
        }
    }

}
