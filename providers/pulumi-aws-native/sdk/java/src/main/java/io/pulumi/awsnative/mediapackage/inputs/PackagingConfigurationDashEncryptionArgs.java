// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationSpekeKeyProviderArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * A Dynamic Adaptive Streaming over HTTP (DASH) encryption configuration.
 * 
 */
public final class PackagingConfigurationDashEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PackagingConfigurationDashEncryptionArgs Empty = new PackagingConfigurationDashEncryptionArgs();

    @InputImport(name="spekeKeyProvider", required=true)
    private final Input<PackagingConfigurationSpekeKeyProviderArgs> spekeKeyProvider;

    public Input<PackagingConfigurationSpekeKeyProviderArgs> getSpekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    public PackagingConfigurationDashEncryptionArgs(Input<PackagingConfigurationSpekeKeyProviderArgs> spekeKeyProvider) {
        this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider, "expected parameter 'spekeKeyProvider' to be non-null");
    }

    private PackagingConfigurationDashEncryptionArgs() {
        this.spekeKeyProvider = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingConfigurationDashEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<PackagingConfigurationSpekeKeyProviderArgs> spekeKeyProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingConfigurationDashEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spekeKeyProvider = defaults.spekeKeyProvider;
        }

        public Builder setSpekeKeyProvider(Input<PackagingConfigurationSpekeKeyProviderArgs> spekeKeyProvider) {
            this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider);
            return this;
        }

        public Builder setSpekeKeyProvider(PackagingConfigurationSpekeKeyProviderArgs spekeKeyProvider) {
            this.spekeKeyProvider = Input.of(Objects.requireNonNull(spekeKeyProvider));
            return this;
        }

        public PackagingConfigurationDashEncryptionArgs build() {
            return new PackagingConfigurationDashEncryptionArgs(spekeKeyProvider);
        }
    }
}
