// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs;

import io.pulumi.awsnative.ecs.inputs.ClusterCapacityProviderStrategyItemArgs;
import io.pulumi.awsnative.ecs.inputs.ClusterConfigurationArgs;
import io.pulumi.awsnative.ecs.inputs.ClusterSettingsArgs;
import io.pulumi.awsnative.ecs.inputs.ClusterTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    @Import(name="capacityProviders")
      private final @Nullable Output<List<String>> capacityProviders;

    public Output<List<String>> capacityProviders() {
        return this.capacityProviders == null ? Codegen.empty() : this.capacityProviders;
    }

    /**
     * A user-generated string that you use to identify your cluster. If you don't specify a name, AWS CloudFormation generates a unique physical ID for the name.
     * 
     */
    @Import(name="clusterName")
      private final @Nullable Output<String> clusterName;

    public Output<String> clusterName() {
        return this.clusterName == null ? Codegen.empty() : this.clusterName;
    }

    @Import(name="clusterSettings")
      private final @Nullable Output<List<ClusterSettingsArgs>> clusterSettings;

    public Output<List<ClusterSettingsArgs>> clusterSettings() {
        return this.clusterSettings == null ? Codegen.empty() : this.clusterSettings;
    }

    @Import(name="configuration")
      private final @Nullable Output<ClusterConfigurationArgs> configuration;

    public Output<ClusterConfigurationArgs> configuration() {
        return this.configuration == null ? Codegen.empty() : this.configuration;
    }

    @Import(name="defaultCapacityProviderStrategy")
      private final @Nullable Output<List<ClusterCapacityProviderStrategyItemArgs>> defaultCapacityProviderStrategy;

    public Output<List<ClusterCapacityProviderStrategyItemArgs>> defaultCapacityProviderStrategy() {
        return this.defaultCapacityProviderStrategy == null ? Codegen.empty() : this.defaultCapacityProviderStrategy;
    }

    @Import(name="tags")
      private final @Nullable Output<List<ClusterTagArgs>> tags;

    public Output<List<ClusterTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ClusterArgs(
        @Nullable Output<List<String>> capacityProviders,
        @Nullable Output<String> clusterName,
        @Nullable Output<List<ClusterSettingsArgs>> clusterSettings,
        @Nullable Output<ClusterConfigurationArgs> configuration,
        @Nullable Output<List<ClusterCapacityProviderStrategyItemArgs>> defaultCapacityProviderStrategy,
        @Nullable Output<List<ClusterTagArgs>> tags) {
        this.capacityProviders = capacityProviders;
        this.clusterName = clusterName;
        this.clusterSettings = clusterSettings;
        this.configuration = configuration;
        this.defaultCapacityProviderStrategy = defaultCapacityProviderStrategy;
        this.tags = tags;
    }

    private ClusterArgs() {
        this.capacityProviders = Codegen.empty();
        this.clusterName = Codegen.empty();
        this.clusterSettings = Codegen.empty();
        this.configuration = Codegen.empty();
        this.defaultCapacityProviderStrategy = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> capacityProviders;
        private @Nullable Output<String> clusterName;
        private @Nullable Output<List<ClusterSettingsArgs>> clusterSettings;
        private @Nullable Output<ClusterConfigurationArgs> configuration;
        private @Nullable Output<List<ClusterCapacityProviderStrategyItemArgs>> defaultCapacityProviderStrategy;
        private @Nullable Output<List<ClusterTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityProviders = defaults.capacityProviders;
    	      this.clusterName = defaults.clusterName;
    	      this.clusterSettings = defaults.clusterSettings;
    	      this.configuration = defaults.configuration;
    	      this.defaultCapacityProviderStrategy = defaults.defaultCapacityProviderStrategy;
    	      this.tags = defaults.tags;
        }

        public Builder capacityProviders(@Nullable Output<List<String>> capacityProviders) {
            this.capacityProviders = capacityProviders;
            return this;
        }
        public Builder capacityProviders(@Nullable List<String> capacityProviders) {
            this.capacityProviders = Codegen.ofNullable(capacityProviders);
            return this;
        }
        public Builder capacityProviders(String... capacityProviders) {
            return capacityProviders(List.of(capacityProviders));
        }
        public Builder clusterName(@Nullable Output<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public Builder clusterName(@Nullable String clusterName) {
            this.clusterName = Codegen.ofNullable(clusterName);
            return this;
        }
        public Builder clusterSettings(@Nullable Output<List<ClusterSettingsArgs>> clusterSettings) {
            this.clusterSettings = clusterSettings;
            return this;
        }
        public Builder clusterSettings(@Nullable List<ClusterSettingsArgs> clusterSettings) {
            this.clusterSettings = Codegen.ofNullable(clusterSettings);
            return this;
        }
        public Builder clusterSettings(ClusterSettingsArgs... clusterSettings) {
            return clusterSettings(List.of(clusterSettings));
        }
        public Builder configuration(@Nullable Output<ClusterConfigurationArgs> configuration) {
            this.configuration = configuration;
            return this;
        }
        public Builder configuration(@Nullable ClusterConfigurationArgs configuration) {
            this.configuration = Codegen.ofNullable(configuration);
            return this;
        }
        public Builder defaultCapacityProviderStrategy(@Nullable Output<List<ClusterCapacityProviderStrategyItemArgs>> defaultCapacityProviderStrategy) {
            this.defaultCapacityProviderStrategy = defaultCapacityProviderStrategy;
            return this;
        }
        public Builder defaultCapacityProviderStrategy(@Nullable List<ClusterCapacityProviderStrategyItemArgs> defaultCapacityProviderStrategy) {
            this.defaultCapacityProviderStrategy = Codegen.ofNullable(defaultCapacityProviderStrategy);
            return this;
        }
        public Builder defaultCapacityProviderStrategy(ClusterCapacityProviderStrategyItemArgs... defaultCapacityProviderStrategy) {
            return defaultCapacityProviderStrategy(List.of(defaultCapacityProviderStrategy));
        }
        public Builder tags(@Nullable Output<List<ClusterTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<ClusterTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(ClusterTagArgs... tags) {
            return tags(List.of(tags));
        }        public ClusterArgs build() {
            return new ClusterArgs(capacityProviders, clusterName, clusterSettings, configuration, defaultCapacityProviderStrategy, tags);
        }
    }
}
