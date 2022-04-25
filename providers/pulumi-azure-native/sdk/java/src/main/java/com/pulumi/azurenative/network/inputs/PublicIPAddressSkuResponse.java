// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SKU of a public IP address.
 * 
 */
public final class PublicIPAddressSkuResponse extends com.pulumi.resources.InvokeArgs {

    public static final PublicIPAddressSkuResponse Empty = new PublicIPAddressSkuResponse();

    /**
     * Name of a public IP address SKU.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of a public IP address SKU.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Tier of a public IP address SKU.
     * 
     */
    @Import(name="tier")
    private @Nullable String tier;

    /**
     * @return Tier of a public IP address SKU.
     * 
     */
    public Optional<String> tier() {
        return Optional.ofNullable(this.tier);
    }

    private PublicIPAddressSkuResponse() {}

    private PublicIPAddressSkuResponse(PublicIPAddressSkuResponse $) {
        this.name = $.name;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PublicIPAddressSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PublicIPAddressSkuResponse $;

        public Builder() {
            $ = new PublicIPAddressSkuResponse();
        }

        public Builder(PublicIPAddressSkuResponse defaults) {
            $ = new PublicIPAddressSkuResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of a public IP address SKU.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param tier Tier of a public IP address SKU.
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable String tier) {
            $.tier = tier;
            return this;
        }

        public PublicIPAddressSkuResponse build() {
            return $;
        }
    }

}
