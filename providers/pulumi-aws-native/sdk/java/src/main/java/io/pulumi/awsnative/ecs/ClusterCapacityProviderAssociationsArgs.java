// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs;

import io.pulumi.awsnative.ecs.enums.ClusterCapacityProviderAssociationsCapacityProvider;
import io.pulumi.awsnative.ecs.inputs.ClusterCapacityProviderAssociationsCapacityProviderStrategyArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ClusterCapacityProviderAssociationsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterCapacityProviderAssociationsArgs Empty = new ClusterCapacityProviderAssociationsArgs();

    @InputImport(name="capacityProviders", required=true)
    private final Input<List<Either<ClusterCapacityProviderAssociationsCapacityProvider,String>>> capacityProviders;

    public Input<List<Either<ClusterCapacityProviderAssociationsCapacityProvider,String>>> getCapacityProviders() {
        return this.capacityProviders;
    }

    @InputImport(name="cluster", required=true)
    private final Input<String> cluster;

    public Input<String> getCluster() {
        return this.cluster;
    }

    @InputImport(name="defaultCapacityProviderStrategy", required=true)
    private final Input<List<ClusterCapacityProviderAssociationsCapacityProviderStrategyArgs>> defaultCapacityProviderStrategy;

    public Input<List<ClusterCapacityProviderAssociationsCapacityProviderStrategyArgs>> getDefaultCapacityProviderStrategy() {
        return this.defaultCapacityProviderStrategy;
    }

    public ClusterCapacityProviderAssociationsArgs(
        Input<List<Either<ClusterCapacityProviderAssociationsCapacityProvider,String>>> capacityProviders,
        Input<String> cluster,
        Input<List<ClusterCapacityProviderAssociationsCapacityProviderStrategyArgs>> defaultCapacityProviderStrategy) {
        this.capacityProviders = Objects.requireNonNull(capacityProviders, "expected parameter 'capacityProviders' to be non-null");
        this.cluster = Objects.requireNonNull(cluster, "expected parameter 'cluster' to be non-null");
        this.defaultCapacityProviderStrategy = Objects.requireNonNull(defaultCapacityProviderStrategy, "expected parameter 'defaultCapacityProviderStrategy' to be non-null");
    }

    private ClusterCapacityProviderAssociationsArgs() {
        this.capacityProviders = Input.empty();
        this.cluster = Input.empty();
        this.defaultCapacityProviderStrategy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCapacityProviderAssociationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<Either<ClusterCapacityProviderAssociationsCapacityProvider,String>>> capacityProviders;
        private Input<String> cluster;
        private Input<List<ClusterCapacityProviderAssociationsCapacityProviderStrategyArgs>> defaultCapacityProviderStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterCapacityProviderAssociationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityProviders = defaults.capacityProviders;
    	      this.cluster = defaults.cluster;
    	      this.defaultCapacityProviderStrategy = defaults.defaultCapacityProviderStrategy;
        }

        public Builder setCapacityProviders(Input<List<Either<ClusterCapacityProviderAssociationsCapacityProvider,String>>> capacityProviders) {
            this.capacityProviders = Objects.requireNonNull(capacityProviders);
            return this;
        }

        public Builder setCapacityProviders(List<Either<ClusterCapacityProviderAssociationsCapacityProvider,String>> capacityProviders) {
            this.capacityProviders = Input.of(Objects.requireNonNull(capacityProviders));
            return this;
        }

        public Builder setCluster(Input<String> cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }

        public Builder setCluster(String cluster) {
            this.cluster = Input.of(Objects.requireNonNull(cluster));
            return this;
        }

        public Builder setDefaultCapacityProviderStrategy(Input<List<ClusterCapacityProviderAssociationsCapacityProviderStrategyArgs>> defaultCapacityProviderStrategy) {
            this.defaultCapacityProviderStrategy = Objects.requireNonNull(defaultCapacityProviderStrategy);
            return this;
        }

        public Builder setDefaultCapacityProviderStrategy(List<ClusterCapacityProviderAssociationsCapacityProviderStrategyArgs> defaultCapacityProviderStrategy) {
            this.defaultCapacityProviderStrategy = Input.of(Objects.requireNonNull(defaultCapacityProviderStrategy));
            return this;
        }

        public ClusterCapacityProviderAssociationsArgs build() {
            return new ClusterCapacityProviderAssociationsArgs(capacityProviders, cluster, defaultCapacityProviderStrategy);
        }
    }
}
