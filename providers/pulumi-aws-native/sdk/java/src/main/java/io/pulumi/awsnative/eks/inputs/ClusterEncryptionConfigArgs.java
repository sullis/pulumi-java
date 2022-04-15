// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eks.inputs;

import io.pulumi.awsnative.eks.inputs.ClusterEncryptionConfigProviderPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The encryption configuration for the cluster
 * 
 */
public final class ClusterEncryptionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterEncryptionConfigArgs Empty = new ClusterEncryptionConfigArgs();

    /**
     * The encryption provider for the cluster.
     * 
     */
    @Import(name="provider")
      private final @Nullable Output<ClusterEncryptionConfigProviderPropertiesArgs> provider;

    public Output<ClusterEncryptionConfigProviderPropertiesArgs> provider() {
        return this.provider == null ? Codegen.empty() : this.provider;
    }

    /**
     * Specifies the resources to be encrypted. The only supported value is "secrets".
     * 
     */
    @Import(name="resources")
      private final @Nullable Output<List<String>> resources;

    public Output<List<String>> resources() {
        return this.resources == null ? Codegen.empty() : this.resources;
    }

    public ClusterEncryptionConfigArgs(
        @Nullable Output<ClusterEncryptionConfigProviderPropertiesArgs> provider,
        @Nullable Output<List<String>> resources) {
        this.provider = provider;
        this.resources = resources;
    }

    private ClusterEncryptionConfigArgs() {
        this.provider = Codegen.empty();
        this.resources = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEncryptionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ClusterEncryptionConfigProviderPropertiesArgs> provider;
        private @Nullable Output<List<String>> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterEncryptionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provider = defaults.provider;
    	      this.resources = defaults.resources;
        }

        public Builder provider(@Nullable Output<ClusterEncryptionConfigProviderPropertiesArgs> provider) {
            this.provider = provider;
            return this;
        }
        public Builder provider(@Nullable ClusterEncryptionConfigProviderPropertiesArgs provider) {
            this.provider = Codegen.ofNullable(provider);
            return this;
        }
        public Builder resources(@Nullable Output<List<String>> resources) {
            this.resources = resources;
            return this;
        }
        public Builder resources(@Nullable List<String> resources) {
            this.resources = Codegen.ofNullable(resources);
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }        public ClusterEncryptionConfigArgs build() {
            return new ClusterEncryptionConfigArgs(provider, resources);
        }
    }
}
