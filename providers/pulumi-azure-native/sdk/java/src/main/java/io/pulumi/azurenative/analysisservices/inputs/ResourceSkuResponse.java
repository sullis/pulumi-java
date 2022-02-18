// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.analysisservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents the SKU name and Azure pricing tier for Analysis Services resource.
 * 
 */
public final class ResourceSkuResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceSkuResponse Empty = new ResourceSkuResponse();

    /**
     * The number of instances in the read only query pool.
     * 
     */
    @InputImport(name="capacity")
    private final @Nullable Integer capacity;

    public Optional<Integer> getCapacity() {
        return this.capacity == null ? Optional.empty() : Optional.ofNullable(this.capacity);
    }

    /**
     * Name of the SKU level.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The name of the Azure pricing tier to which the SKU applies.
     * 
     */
    @InputImport(name="tier")
    private final @Nullable String tier;

    public Optional<String> getTier() {
        return this.tier == null ? Optional.empty() : Optional.ofNullable(this.tier);
    }

    public ResourceSkuResponse(
        @Nullable Integer capacity,
        String name,
        @Nullable String tier) {
        this.capacity = capacity == null ? 1 : capacity;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.tier = tier;
    }

    private ResourceSkuResponse() {
        this.capacity = null;
        this.name = null;
        this.tier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacity;
        private String name;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder setCapacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }

        public ResourceSkuResponse build() {
            return new ResourceSkuResponse(capacity, name, tier);
        }
    }
}
