// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azureactivedirectory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class B2CTenantResourcePropertiesResponseBillingConfig {
    /**
     * The type of billing. Will be MAU for all new customers. If 'Auths', it can be updated to 'MAU'. Cannot be changed if value is 'MAU'. Learn more about Azure AD B2C billing at [aka.ms/b2cBilling](https://aka.ms/b2cbilling).
     * 
     */
    private final @Nullable String billingType;
    /**
     * The data from which the billing type took effect
     * 
     */
    private final String effectiveStartDateUtc;

    @OutputCustomType.Constructor({"billingType","effectiveStartDateUtc"})
    private B2CTenantResourcePropertiesResponseBillingConfig(
        @Nullable String billingType,
        String effectiveStartDateUtc) {
        this.billingType = billingType;
        this.effectiveStartDateUtc = Objects.requireNonNull(effectiveStartDateUtc);
    }

    /**
     * The type of billing. Will be MAU for all new customers. If 'Auths', it can be updated to 'MAU'. Cannot be changed if value is 'MAU'. Learn more about Azure AD B2C billing at [aka.ms/b2cBilling](https://aka.ms/b2cbilling).
     * 
    */
    public Optional<String> getBillingType() {
        return Optional.ofNullable(this.billingType);
    }
    /**
     * The data from which the billing type took effect
     * 
    */
    public String getEffectiveStartDateUtc() {
        return this.effectiveStartDateUtc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(B2CTenantResourcePropertiesResponseBillingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String billingType;
        private String effectiveStartDateUtc;

        public Builder() {
    	      // Empty
        }

        public Builder(B2CTenantResourcePropertiesResponseBillingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingType = defaults.billingType;
    	      this.effectiveStartDateUtc = defaults.effectiveStartDateUtc;
        }

        public Builder setBillingType(@Nullable String billingType) {
            this.billingType = billingType;
            return this;
        }

        public Builder setEffectiveStartDateUtc(String effectiveStartDateUtc) {
            this.effectiveStartDateUtc = Objects.requireNonNull(effectiveStartDateUtc);
            return this;
        }
        public B2CTenantResourcePropertiesResponseBillingConfig build() {
            return new B2CTenantResourcePropertiesResponseBillingConfig(billingType, effectiveStartDateUtc);
        }
    }
}