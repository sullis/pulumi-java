// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.azurenative.operationalinsights.enums.ClusterSkuNameEnum;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The cluster sku definition.
 * 
 */
public final class ClusterSkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterSkuArgs Empty = new ClusterSkuArgs();

    /**
     * The capacity value
     * 
     */
    @InputImport(name="capacity")
    private final @Nullable Input<Double> capacity;

    public Input<Double> getCapacity() {
        return this.capacity == null ? Input.empty() : this.capacity;
    }

    /**
     * The name of the SKU.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<Either<String,ClusterSkuNameEnum>> name;

    public Input<Either<String,ClusterSkuNameEnum>> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public ClusterSkuArgs(
        @Nullable Input<Double> capacity,
        @Nullable Input<Either<String,ClusterSkuNameEnum>> name) {
        this.capacity = capacity;
        this.name = name;
    }

    private ClusterSkuArgs() {
        this.capacity = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> capacity;
        private @Nullable Input<Either<String,ClusterSkuNameEnum>> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterSkuArgs defaults) {
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

        public Builder setName(@Nullable Input<Either<String,ClusterSkuNameEnum>> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable Either<String,ClusterSkuNameEnum> name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public ClusterSkuArgs build() {
            return new ClusterSkuArgs(capacity, name);
        }
    }
}
