// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.awsnative.ecs.outputs.ClusterCapacityProviderAssociationsCapacityProviderStrategy;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterCapacityProviderAssociationsResult {
    private final @Nullable List<String> capacityProviders;
    private final @Nullable List<ClusterCapacityProviderAssociationsCapacityProviderStrategy> defaultCapacityProviderStrategy;

    @CustomType.Constructor
    private GetClusterCapacityProviderAssociationsResult(
        @CustomType.Parameter("capacityProviders") @Nullable List<String> capacityProviders,
        @CustomType.Parameter("defaultCapacityProviderStrategy") @Nullable List<ClusterCapacityProviderAssociationsCapacityProviderStrategy> defaultCapacityProviderStrategy) {
        this.capacityProviders = capacityProviders;
        this.defaultCapacityProviderStrategy = defaultCapacityProviderStrategy;
    }

    public List<String> capacityProviders() {
        return this.capacityProviders == null ? List.of() : this.capacityProviders;
    }
    public List<ClusterCapacityProviderAssociationsCapacityProviderStrategy> defaultCapacityProviderStrategy() {
        return this.defaultCapacityProviderStrategy == null ? List.of() : this.defaultCapacityProviderStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterCapacityProviderAssociationsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> capacityProviders;
        private @Nullable List<ClusterCapacityProviderAssociationsCapacityProviderStrategy> defaultCapacityProviderStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterCapacityProviderAssociationsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityProviders = defaults.capacityProviders;
    	      this.defaultCapacityProviderStrategy = defaults.defaultCapacityProviderStrategy;
        }

        public Builder capacityProviders(@Nullable List<String> capacityProviders) {
            this.capacityProviders = capacityProviders;
            return this;
        }
        public Builder capacityProviders(String... capacityProviders) {
            return capacityProviders(List.of(capacityProviders));
        }
        public Builder defaultCapacityProviderStrategy(@Nullable List<ClusterCapacityProviderAssociationsCapacityProviderStrategy> defaultCapacityProviderStrategy) {
            this.defaultCapacityProviderStrategy = defaultCapacityProviderStrategy;
            return this;
        }
        public Builder defaultCapacityProviderStrategy(ClusterCapacityProviderAssociationsCapacityProviderStrategy... defaultCapacityProviderStrategy) {
            return defaultCapacityProviderStrategy(List.of(defaultCapacityProviderStrategy));
        }        public GetClusterCapacityProviderAssociationsResult build() {
            return new GetClusterCapacityProviderAssociationsResult(capacityProviders, defaultCapacityProviderStrategy);
        }
    }
}
