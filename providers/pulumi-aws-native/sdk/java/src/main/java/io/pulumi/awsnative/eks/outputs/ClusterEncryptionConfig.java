// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eks.outputs;

import io.pulumi.awsnative.eks.outputs.ClusterEncryptionConfigProviderProperties;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterEncryptionConfig {
    /**
     * The encryption provider for the cluster.
     * 
     */
    private final @Nullable ClusterEncryptionConfigProviderProperties provider;
    /**
     * Specifies the resources to be encrypted. The only supported value is "secrets".
     * 
     */
    private final @Nullable List<String> resources;

    @CustomType.Constructor
    private ClusterEncryptionConfig(
        @CustomType.Parameter("provider") @Nullable ClusterEncryptionConfigProviderProperties provider,
        @CustomType.Parameter("resources") @Nullable List<String> resources) {
        this.provider = provider;
        this.resources = resources;
    }

    /**
     * The encryption provider for the cluster.
     * 
    */
    public Optional<ClusterEncryptionConfigProviderProperties> provider() {
        return Optional.ofNullable(this.provider);
    }
    /**
     * Specifies the resources to be encrypted. The only supported value is "secrets".
     * 
    */
    public List<String> resources() {
        return this.resources == null ? List.of() : this.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEncryptionConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClusterEncryptionConfigProviderProperties provider;
        private @Nullable List<String> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterEncryptionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provider = defaults.provider;
    	      this.resources = defaults.resources;
        }

        public Builder provider(@Nullable ClusterEncryptionConfigProviderProperties provider) {
            this.provider = provider;
            return this;
        }
        public Builder resources(@Nullable List<String> resources) {
            this.resources = resources;
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }        public ClusterEncryptionConfig build() {
            return new ClusterEncryptionConfig(provider, resources);
        }
    }
}
