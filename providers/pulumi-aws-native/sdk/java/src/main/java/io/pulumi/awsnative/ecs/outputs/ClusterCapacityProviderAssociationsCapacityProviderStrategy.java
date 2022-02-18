// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterCapacityProviderAssociationsCapacityProviderStrategy {
    private final @Nullable Integer base;
    private final String capacityProvider;
    private final @Nullable Integer weight;

    @OutputCustomType.Constructor({"base","capacityProvider","weight"})
    private ClusterCapacityProviderAssociationsCapacityProviderStrategy(
        @Nullable Integer base,
        String capacityProvider,
        @Nullable Integer weight) {
        this.base = base;
        this.capacityProvider = Objects.requireNonNull(capacityProvider);
        this.weight = weight;
    }

    public Optional<Integer> getBase() {
        return Optional.ofNullable(this.base);
    }
    public String getCapacityProvider() {
        return this.capacityProvider;
    }
    public Optional<Integer> getWeight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCapacityProviderAssociationsCapacityProviderStrategy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer base;
        private String capacityProvider;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterCapacityProviderAssociationsCapacityProviderStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.base = defaults.base;
    	      this.capacityProvider = defaults.capacityProvider;
    	      this.weight = defaults.weight;
        }

        public Builder setBase(@Nullable Integer base) {
            this.base = base;
            return this;
        }

        public Builder setCapacityProvider(String capacityProvider) {
            this.capacityProvider = Objects.requireNonNull(capacityProvider);
            return this;
        }

        public Builder setWeight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }

        public ClusterCapacityProviderAssociationsCapacityProviderStrategy build() {
            return new ClusterCapacityProviderAssociationsCapacityProviderStrategy(base, capacityProvider, weight);
        }
    }
}
