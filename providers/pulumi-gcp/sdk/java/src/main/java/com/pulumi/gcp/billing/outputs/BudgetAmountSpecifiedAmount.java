// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.billing.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BudgetAmountSpecifiedAmount {
    /**
     * @return The 3-letter currency code defined in ISO 4217.
     * 
     */
    private final @Nullable String currencyCode;
    /**
     * @return Number of nano (10^-9) units of the amount.
     * The value must be between -999,999,999 and +999,999,999
     * inclusive. If units is positive, nanos must be positive or
     * zero. If units is zero, nanos can be positive, zero, or
     * negative. If units is negative, nanos must be negative or
     * zero. For example $-1.75 is represented as units=-1 and
     * nanos=-750,000,000.
     * 
     */
    private final @Nullable Integer nanos;
    /**
     * @return The whole units of the amount. For example if currencyCode
     * is &#34;USD&#34;, then 1 unit is one US dollar.
     * 
     */
    private final @Nullable String units;

    @CustomType.Constructor
    private BudgetAmountSpecifiedAmount(
        @CustomType.Parameter("currencyCode") @Nullable String currencyCode,
        @CustomType.Parameter("nanos") @Nullable Integer nanos,
        @CustomType.Parameter("units") @Nullable String units) {
        this.currencyCode = currencyCode;
        this.nanos = nanos;
        this.units = units;
    }

    /**
     * @return The 3-letter currency code defined in ISO 4217.
     * 
     */
    public Optional<String> currencyCode() {
        return Optional.ofNullable(this.currencyCode);
    }
    /**
     * @return Number of nano (10^-9) units of the amount.
     * The value must be between -999,999,999 and +999,999,999
     * inclusive. If units is positive, nanos must be positive or
     * zero. If units is zero, nanos can be positive, zero, or
     * negative. If units is negative, nanos must be negative or
     * zero. For example $-1.75 is represented as units=-1 and
     * nanos=-750,000,000.
     * 
     */
    public Optional<Integer> nanos() {
        return Optional.ofNullable(this.nanos);
    }
    /**
     * @return The whole units of the amount. For example if currencyCode
     * is &#34;USD&#34;, then 1 unit is one US dollar.
     * 
     */
    public Optional<String> units() {
        return Optional.ofNullable(this.units);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetAmountSpecifiedAmount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String currencyCode;
        private @Nullable Integer nanos;
        private @Nullable String units;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetAmountSpecifiedAmount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currencyCode = defaults.currencyCode;
    	      this.nanos = defaults.nanos;
    	      this.units = defaults.units;
        }

        public Builder currencyCode(@Nullable String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }
        public Builder nanos(@Nullable Integer nanos) {
            this.nanos = nanos;
            return this;
        }
        public Builder units(@Nullable String units) {
            this.units = units;
            return this;
        }        public BudgetAmountSpecifiedAmount build() {
            return new BudgetAmountSpecifiedAmount(currencyCode, nanos, units);
        }
    }
}
