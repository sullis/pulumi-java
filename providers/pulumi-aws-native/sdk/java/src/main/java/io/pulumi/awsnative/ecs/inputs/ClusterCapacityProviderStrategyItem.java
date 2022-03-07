// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A capacity provider strategy consists of one or more capacity providers along with the `base` and `weight` to assign to them. A capacity provider must be associated with the cluster to be used in a capacity provider strategy. The PutClusterCapacityProviders API is used to associate a capacity provider with a cluster. Only capacity providers with an `ACTIVE` or `UPDATING` status can be used.
 * 
 */
public final class ClusterCapacityProviderStrategyItem extends io.pulumi.resources.InvokeArgs {

    public static final ClusterCapacityProviderStrategyItem Empty = new ClusterCapacityProviderStrategyItem();

    @InputImport(name="base")
      private final @Nullable Integer base;

    public Optional<Integer> getBase() {
        return this.base == null ? Optional.empty() : Optional.ofNullable(this.base);
    }

    @InputImport(name="capacityProvider")
      private final @Nullable String capacityProvider;

    public Optional<String> getCapacityProvider() {
        return this.capacityProvider == null ? Optional.empty() : Optional.ofNullable(this.capacityProvider);
    }

    @InputImport(name="weight")
      private final @Nullable Integer weight;

    public Optional<Integer> getWeight() {
        return this.weight == null ? Optional.empty() : Optional.ofNullable(this.weight);
    }

    public ClusterCapacityProviderStrategyItem(
        @Nullable Integer base,
        @Nullable String capacityProvider,
        @Nullable Integer weight) {
        this.base = base;
        this.capacityProvider = capacityProvider;
        this.weight = weight;
    }

    private ClusterCapacityProviderStrategyItem() {
        this.base = null;
        this.capacityProvider = null;
        this.weight = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCapacityProviderStrategyItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer base;
        private @Nullable String capacityProvider;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterCapacityProviderStrategyItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.base = defaults.base;
    	      this.capacityProvider = defaults.capacityProvider;
    	      this.weight = defaults.weight;
        }

        public Builder setBase(@Nullable Integer base) {
            this.base = base;
            return this;
        }

        public Builder setCapacityProvider(@Nullable String capacityProvider) {
            this.capacityProvider = capacityProvider;
            return this;
        }

        public Builder setWeight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }
        public ClusterCapacityProviderStrategyItem build() {
            return new ClusterCapacityProviderStrategyItem(base, capacityProvider, weight);
        }
    }
}