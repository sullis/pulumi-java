// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.billingbudgets_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents an amount of money with its currency type.
 * 
 */
public final class GoogleTypeMoneyArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleTypeMoneyArgs Empty = new GoogleTypeMoneyArgs();

    /**
     * The three-letter currency code defined in ISO 4217.
     * 
     */
    @Import(name="currencyCode")
    private @Nullable Output<String> currencyCode;

    /**
     * @return The three-letter currency code defined in ISO 4217.
     * 
     */
    public Optional<Output<String>> currencyCode() {
        return Optional.ofNullable(this.currencyCode);
    }

    /**
     * Number of nano (10^-9) units of the amount. The value must be between -999,999,999 and +999,999,999 inclusive. If `units` is positive, `nanos` must be positive or zero. If `units` is zero, `nanos` can be positive, zero, or negative. If `units` is negative, `nanos` must be negative or zero. For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
     * 
     */
    @Import(name="nanos")
    private @Nullable Output<Integer> nanos;

    /**
     * @return Number of nano (10^-9) units of the amount. The value must be between -999,999,999 and +999,999,999 inclusive. If `units` is positive, `nanos` must be positive or zero. If `units` is zero, `nanos` can be positive, zero, or negative. If `units` is negative, `nanos` must be negative or zero. For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
     * 
     */
    public Optional<Output<Integer>> nanos() {
        return Optional.ofNullable(this.nanos);
    }

    /**
     * The whole units of the amount. For example if `currencyCode` is `&#34;USD&#34;`, then 1 unit is one US dollar.
     * 
     */
    @Import(name="units")
    private @Nullable Output<String> units;

    /**
     * @return The whole units of the amount. For example if `currencyCode` is `&#34;USD&#34;`, then 1 unit is one US dollar.
     * 
     */
    public Optional<Output<String>> units() {
        return Optional.ofNullable(this.units);
    }

    private GoogleTypeMoneyArgs() {}

    private GoogleTypeMoneyArgs(GoogleTypeMoneyArgs $) {
        this.currencyCode = $.currencyCode;
        this.nanos = $.nanos;
        this.units = $.units;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleTypeMoneyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleTypeMoneyArgs $;

        public Builder() {
            $ = new GoogleTypeMoneyArgs();
        }

        public Builder(GoogleTypeMoneyArgs defaults) {
            $ = new GoogleTypeMoneyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param currencyCode The three-letter currency code defined in ISO 4217.
         * 
         * @return builder
         * 
         */
        public Builder currencyCode(@Nullable Output<String> currencyCode) {
            $.currencyCode = currencyCode;
            return this;
        }

        /**
         * @param currencyCode The three-letter currency code defined in ISO 4217.
         * 
         * @return builder
         * 
         */
        public Builder currencyCode(String currencyCode) {
            return currencyCode(Output.of(currencyCode));
        }

        /**
         * @param nanos Number of nano (10^-9) units of the amount. The value must be between -999,999,999 and +999,999,999 inclusive. If `units` is positive, `nanos` must be positive or zero. If `units` is zero, `nanos` can be positive, zero, or negative. If `units` is negative, `nanos` must be negative or zero. For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
         * 
         * @return builder
         * 
         */
        public Builder nanos(@Nullable Output<Integer> nanos) {
            $.nanos = nanos;
            return this;
        }

        /**
         * @param nanos Number of nano (10^-9) units of the amount. The value must be between -999,999,999 and +999,999,999 inclusive. If `units` is positive, `nanos` must be positive or zero. If `units` is zero, `nanos` can be positive, zero, or negative. If `units` is negative, `nanos` must be negative or zero. For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
         * 
         * @return builder
         * 
         */
        public Builder nanos(Integer nanos) {
            return nanos(Output.of(nanos));
        }

        /**
         * @param units The whole units of the amount. For example if `currencyCode` is `&#34;USD&#34;`, then 1 unit is one US dollar.
         * 
         * @return builder
         * 
         */
        public Builder units(@Nullable Output<String> units) {
            $.units = units;
            return this;
        }

        /**
         * @param units The whole units of the amount. For example if `currencyCode` is `&#34;USD&#34;`, then 1 unit is one US dollar.
         * 
         * @return builder
         * 
         */
        public Builder units(String units) {
            return units(Output.of(units));
        }

        public GoogleTypeMoneyArgs build() {
            return $;
        }
    }

}
