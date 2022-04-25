// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SkuResponse {
    /**
     * @return Capacity of the particular SKU.
     * 
     */
    private final @Nullable Integer capacity;
    /**
     * @return If the service has different generations of hardware, for the same SKU, then that can be captured here.
     * 
     */
    private final @Nullable String family;
    /**
     * @return The name of the SKU, typically, a letter + Number code, e.g. P3.
     * 
     */
    private final String name;
    /**
     * @return Size of the particular SKU
     * 
     */
    private final @Nullable String size;
    /**
     * @return The tier or edition of the particular SKU, e.g. Basic, Premium.
     * 
     */
    private final @Nullable String tier;

    @CustomType.Constructor
    private SkuResponse(
        @CustomType.Parameter("capacity") @Nullable Integer capacity,
        @CustomType.Parameter("family") @Nullable String family,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("size") @Nullable String size,
        @CustomType.Parameter("tier") @Nullable String tier) {
        this.capacity = capacity;
        this.family = family;
        this.name = name;
        this.size = size;
        this.tier = tier;
    }

    /**
     * @return Capacity of the particular SKU.
     * 
     */
    public Optional<Integer> capacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * @return If the service has different generations of hardware, for the same SKU, then that can be captured here.
     * 
     */
    public Optional<String> family() {
        return Optional.ofNullable(this.family);
    }
    /**
     * @return The name of the SKU, typically, a letter + Number code, e.g. P3.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Size of the particular SKU
     * 
     */
    public Optional<String> size() {
        return Optional.ofNullable(this.size);
    }
    /**
     * @return The tier or edition of the particular SKU, e.g. Basic, Premium.
     * 
     */
    public Optional<String> tier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacity;
        private @Nullable String family;
        private String name;
        private @Nullable String size;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
    	      this.size = defaults.size;
    	      this.tier = defaults.tier;
        }

        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder family(@Nullable String family) {
            this.family = family;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder size(@Nullable String size) {
            this.size = size;
            return this;
        }
        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }        public SkuResponse build() {
            return new SkuResponse(capacity, family, name, size, tier);
        }
    }
}
