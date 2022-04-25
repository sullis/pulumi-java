// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurestack.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Additional properties of the product
 * 
 */
public final class ProductPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final ProductPropertiesResponse Empty = new ProductPropertiesResponse();

    /**
     * The version.
     * 
     */
    @Import(name="version")
    private @Nullable String version;

    /**
     * @return The version.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    private ProductPropertiesResponse() {}

    private ProductPropertiesResponse(ProductPropertiesResponse $) {
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProductPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProductPropertiesResponse $;

        public Builder() {
            $ = new ProductPropertiesResponse();
        }

        public Builder(ProductPropertiesResponse defaults) {
            $ = new ProductPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param version The version.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable String version) {
            $.version = version;
            return this;
        }

        public ProductPropertiesResponse build() {
            return $;
        }
    }

}
