// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.outputs;

import io.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationSpekeKeyProvider;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class PackagingConfigurationDashEncryption {
    private final PackagingConfigurationSpekeKeyProvider spekeKeyProvider;

    @OutputCustomType.Constructor({"spekeKeyProvider"})
    private PackagingConfigurationDashEncryption(PackagingConfigurationSpekeKeyProvider spekeKeyProvider) {
        this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider);
    }

    public PackagingConfigurationSpekeKeyProvider getSpekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingConfigurationDashEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PackagingConfigurationSpekeKeyProvider spekeKeyProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingConfigurationDashEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spekeKeyProvider = defaults.spekeKeyProvider;
        }

        public Builder setSpekeKeyProvider(PackagingConfigurationSpekeKeyProvider spekeKeyProvider) {
            this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider);
            return this;
        }

        public PackagingConfigurationDashEncryption build() {
            return new PackagingConfigurationDashEncryption(spekeKeyProvider);
        }
    }
}
