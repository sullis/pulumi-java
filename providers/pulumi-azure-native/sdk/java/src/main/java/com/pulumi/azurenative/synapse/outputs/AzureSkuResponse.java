// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureSkuResponse {
    /**
     * @return The number of instances of the cluster.
     * 
     */
    private final @Nullable Integer capacity;
    /**
     * @return SKU name.
     * 
     */
    private final String name;
    /**
     * @return SKU tier.
     * 
     */
    private final String tier;

    @CustomType.Constructor
    private AzureSkuResponse(
        @CustomType.Parameter("capacity") @Nullable Integer capacity,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("tier") String tier) {
        this.capacity = capacity;
        this.name = name;
        this.tier = tier;
    }

    /**
     * @return The number of instances of the cluster.
     * 
     */
    public Optional<Integer> capacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * @return SKU name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return SKU tier.
     * 
     */
    public String tier() {
        return this.tier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacity;
        private String name;
        private String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder tier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }        public AzureSkuResponse build() {
            return new AzureSkuResponse(capacity, name, tier);
        }
    }
}
