// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.inputs;

import io.pulumi.azurenative.azurearcdata.enums.PostgresInstanceSkuTier;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The resource model definition representing SKU for Azure Database for PostgresSQL - Azure Arc
 * 
 */
public final class PostgresInstanceSkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final PostgresInstanceSkuArgs Empty = new PostgresInstanceSkuArgs();

    /**
     * If the SKU supports scale out/in then the capacity integer should be included. If scale out/in is not possible for the resource this may be omitted.
     * 
     */
    @InputImport(name="capacity")
      private final @Nullable Input<Integer> capacity;

    public Input<Integer> getCapacity() {
        return this.capacity == null ? Input.empty() : this.capacity;
    }

    /**
     * Whether dev/test is enabled. When the dev field is set to true, the resource is used for dev/test purpose.
     * 
     */
    @InputImport(name="dev")
      private final @Nullable Input<Boolean> dev;

    public Input<Boolean> getDev() {
        return this.dev == null ? Input.empty() : this.dev;
    }

    /**
     * If the service has different generations of hardware, for the same SKU, then that can be captured here.
     * 
     */
    @InputImport(name="family")
      private final @Nullable Input<String> family;

    public Input<String> getFamily() {
        return this.family == null ? Input.empty() : this.family;
    }

    /**
     * The name of the SKU.  It is typically a letter+number code
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The SKU size. When the name field is the combination of tier and some other value, this would be the standalone code.
     * 
     */
    @InputImport(name="size")
      private final @Nullable Input<String> size;

    public Input<String> getSize() {
        return this.size == null ? Input.empty() : this.size;
    }

    /**
     * This field is required to be implemented by the Resource Provider if the service has more than one tier.
     * 
     */
    @InputImport(name="tier")
      private final @Nullable Input<PostgresInstanceSkuTier> tier;

    public Input<PostgresInstanceSkuTier> getTier() {
        return this.tier == null ? Input.empty() : this.tier;
    }

    public PostgresInstanceSkuArgs(
        @Nullable Input<Integer> capacity,
        @Nullable Input<Boolean> dev,
        @Nullable Input<String> family,
        Input<String> name,
        @Nullable Input<String> size,
        @Nullable Input<PostgresInstanceSkuTier> tier) {
        this.capacity = capacity;
        this.dev = dev == null ? Input.ofNullable(true) : dev;
        this.family = family;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.size = size;
        this.tier = tier == null ? Input.ofNullable(io.pulumi.azurenative.azurearcdata.enums.PostgresInstanceSkuTier.Hyperscale) : tier;
    }

    private PostgresInstanceSkuArgs() {
        this.capacity = Input.empty();
        this.dev = Input.empty();
        this.family = Input.empty();
        this.name = Input.empty();
        this.size = Input.empty();
        this.tier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PostgresInstanceSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> capacity;
        private @Nullable Input<Boolean> dev;
        private @Nullable Input<String> family;
        private Input<String> name;
        private @Nullable Input<String> size;
        private @Nullable Input<PostgresInstanceSkuTier> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(PostgresInstanceSkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.dev = defaults.dev;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
    	      this.size = defaults.size;
    	      this.tier = defaults.tier;
        }

        public Builder setCapacity(@Nullable Input<Integer> capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setCapacity(@Nullable Integer capacity) {
            this.capacity = Input.ofNullable(capacity);
            return this;
        }

        public Builder setDev(@Nullable Input<Boolean> dev) {
            this.dev = dev;
            return this;
        }

        public Builder setDev(@Nullable Boolean dev) {
            this.dev = Input.ofNullable(dev);
            return this;
        }

        public Builder setFamily(@Nullable Input<String> family) {
            this.family = family;
            return this;
        }

        public Builder setFamily(@Nullable String family) {
            this.family = Input.ofNullable(family);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setSize(@Nullable Input<String> size) {
            this.size = size;
            return this;
        }

        public Builder setSize(@Nullable String size) {
            this.size = Input.ofNullable(size);
            return this;
        }

        public Builder setTier(@Nullable Input<PostgresInstanceSkuTier> tier) {
            this.tier = tier;
            return this;
        }

        public Builder setTier(@Nullable PostgresInstanceSkuTier tier) {
            this.tier = Input.ofNullable(tier);
            return this;
        }
        public PostgresInstanceSkuArgs build() {
            return new PostgresInstanceSkuArgs(capacity, dev, family, name, size, tier);
        }
    }
}