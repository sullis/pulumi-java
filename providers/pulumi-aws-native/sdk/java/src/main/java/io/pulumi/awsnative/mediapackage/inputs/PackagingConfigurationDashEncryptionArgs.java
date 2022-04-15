// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationSpekeKeyProviderArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


/**
 * A Dynamic Adaptive Streaming over HTTP (DASH) encryption configuration.
 * 
 */
public final class PackagingConfigurationDashEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PackagingConfigurationDashEncryptionArgs Empty = new PackagingConfigurationDashEncryptionArgs();

    @Import(name="spekeKeyProvider", required=true)
      private final Output<PackagingConfigurationSpekeKeyProviderArgs> spekeKeyProvider;

    public Output<PackagingConfigurationSpekeKeyProviderArgs> spekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    public PackagingConfigurationDashEncryptionArgs(Output<PackagingConfigurationSpekeKeyProviderArgs> spekeKeyProvider) {
        this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider, "expected parameter 'spekeKeyProvider' to be non-null");
    }

    private PackagingConfigurationDashEncryptionArgs() {
        this.spekeKeyProvider = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingConfigurationDashEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<PackagingConfigurationSpekeKeyProviderArgs> spekeKeyProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingConfigurationDashEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spekeKeyProvider = defaults.spekeKeyProvider;
        }

        public Builder spekeKeyProvider(Output<PackagingConfigurationSpekeKeyProviderArgs> spekeKeyProvider) {
            this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider);
            return this;
        }
        public Builder spekeKeyProvider(PackagingConfigurationSpekeKeyProviderArgs spekeKeyProvider) {
            this.spekeKeyProvider = Output.of(Objects.requireNonNull(spekeKeyProvider));
            return this;
        }        public PackagingConfigurationDashEncryptionArgs build() {
            return new PackagingConfigurationDashEncryptionArgs(spekeKeyProvider);
        }
    }
}
