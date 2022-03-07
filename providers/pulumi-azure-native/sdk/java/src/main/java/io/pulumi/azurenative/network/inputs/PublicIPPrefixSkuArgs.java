// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.PublicIPPrefixSkuName;
import io.pulumi.azurenative.network.enums.PublicIPPrefixSkuTier;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SKU of a public IP prefix.
 * 
 */
public final class PublicIPPrefixSkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final PublicIPPrefixSkuArgs Empty = new PublicIPPrefixSkuArgs();

    /**
     * Name of a public IP prefix SKU.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<Either<String,PublicIPPrefixSkuName>> name;

    public Input<Either<String,PublicIPPrefixSkuName>> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Tier of a public IP prefix SKU.
     * 
     */
    @InputImport(name="tier")
      private final @Nullable Input<Either<String,PublicIPPrefixSkuTier>> tier;

    public Input<Either<String,PublicIPPrefixSkuTier>> getTier() {
        return this.tier == null ? Input.empty() : this.tier;
    }

    public PublicIPPrefixSkuArgs(
        @Nullable Input<Either<String,PublicIPPrefixSkuName>> name,
        @Nullable Input<Either<String,PublicIPPrefixSkuTier>> tier) {
        this.name = name;
        this.tier = tier;
    }

    private PublicIPPrefixSkuArgs() {
        this.name = Input.empty();
        this.tier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicIPPrefixSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,PublicIPPrefixSkuName>> name;
        private @Nullable Input<Either<String,PublicIPPrefixSkuTier>> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicIPPrefixSkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder setName(@Nullable Input<Either<String,PublicIPPrefixSkuName>> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable Either<String,PublicIPPrefixSkuName> name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setTier(@Nullable Input<Either<String,PublicIPPrefixSkuTier>> tier) {
            this.tier = tier;
            return this;
        }

        public Builder setTier(@Nullable Either<String,PublicIPPrefixSkuTier> tier) {
            this.tier = Input.ofNullable(tier);
            return this;
        }
        public PublicIPPrefixSkuArgs build() {
            return new PublicIPPrefixSkuArgs(name, tier);
        }
    }
}