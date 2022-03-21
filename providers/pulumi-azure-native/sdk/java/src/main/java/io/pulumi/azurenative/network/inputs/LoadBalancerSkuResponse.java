// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SKU of a load balancer.
 * 
 */
public final class LoadBalancerSkuResponse extends io.pulumi.resources.InvokeArgs {

    public static final LoadBalancerSkuResponse Empty = new LoadBalancerSkuResponse();

    /**
     * Name of a load balancer SKU.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Tier of a load balancer SKU.
     * 
     */
    @Import(name="tier")
      private final @Nullable String tier;

    public Optional<String> getTier() {
        return this.tier == null ? Optional.empty() : Optional.ofNullable(this.tier);
    }

    public LoadBalancerSkuResponse(
        @Nullable String name,
        @Nullable String tier) {
        this.name = name;
        this.tier = tier;
    }

    private LoadBalancerSkuResponse() {
        this.name = null;
        this.tier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }        public LoadBalancerSkuResponse build() {
            return new LoadBalancerSkuResponse(name, tier);
        }
    }
}
