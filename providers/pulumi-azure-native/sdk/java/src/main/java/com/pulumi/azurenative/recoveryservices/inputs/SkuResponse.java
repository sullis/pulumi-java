// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Identifies the unique system identifier for each Azure resource.
 * 
 */
public final class SkuResponse extends com.pulumi.resources.InvokeArgs {

    public static final SkuResponse Empty = new SkuResponse();

    /**
     * The Sku name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The Sku name.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The Sku tier.
     * 
     */
    @Import(name="tier")
    private @Nullable String tier;

    /**
     * @return The Sku tier.
     * 
     */
    public Optional<String> tier() {
        return Optional.ofNullable(this.tier);
    }

    private SkuResponse() {}

    private SkuResponse(SkuResponse $) {
        this.name = $.name;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SkuResponse $;

        public Builder() {
            $ = new SkuResponse();
        }

        public Builder(SkuResponse defaults) {
            $ = new SkuResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The Sku name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param tier The Sku tier.
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable String tier) {
            $.tier = tier;
            return this;
        }

        public SkuResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
