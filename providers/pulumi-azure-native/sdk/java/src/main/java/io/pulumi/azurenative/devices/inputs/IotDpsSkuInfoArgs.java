// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.azurenative.devices.enums.IotDpsSku;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * List of possible provisioning service SKUs.
 * 
 */
public final class IotDpsSkuInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final IotDpsSkuInfoArgs Empty = new IotDpsSkuInfoArgs();

    /**
     * The number of units to provision
     * 
     */
    @InputImport(name="capacity")
      private final @Nullable Input<Double> capacity;

    public Input<Double> getCapacity() {
        return this.capacity == null ? Input.empty() : this.capacity;
    }

    /**
     * Sku name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<Either<String,IotDpsSku>> name;

    public Input<Either<String,IotDpsSku>> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public IotDpsSkuInfoArgs(
        @Nullable Input<Double> capacity,
        @Nullable Input<Either<String,IotDpsSku>> name) {
        this.capacity = capacity;
        this.name = name;
    }

    private IotDpsSkuInfoArgs() {
        this.capacity = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotDpsSkuInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> capacity;
        private @Nullable Input<Either<String,IotDpsSku>> name;

        public Builder() {
    	      // Empty
        }

        public Builder(IotDpsSkuInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
        }

        public Builder setCapacity(@Nullable Input<Double> capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setCapacity(@Nullable Double capacity) {
            this.capacity = Input.ofNullable(capacity);
            return this;
        }

        public Builder setName(@Nullable Input<Either<String,IotDpsSku>> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable Either<String,IotDpsSku> name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public IotDpsSkuInfoArgs build() {
            return new IotDpsSkuInfoArgs(capacity, name);
        }
    }
}