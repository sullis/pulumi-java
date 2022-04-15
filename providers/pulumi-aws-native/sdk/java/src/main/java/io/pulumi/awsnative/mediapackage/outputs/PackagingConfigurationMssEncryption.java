// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.outputs;

import io.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationSpekeKeyProvider;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class PackagingConfigurationMssEncryption {
    private final PackagingConfigurationSpekeKeyProvider spekeKeyProvider;

    @CustomType.Constructor
    private PackagingConfigurationMssEncryption(@CustomType.Parameter("spekeKeyProvider") PackagingConfigurationSpekeKeyProvider spekeKeyProvider) {
        this.spekeKeyProvider = spekeKeyProvider;
    }

    public PackagingConfigurationSpekeKeyProvider spekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingConfigurationMssEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PackagingConfigurationSpekeKeyProvider spekeKeyProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingConfigurationMssEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spekeKeyProvider = defaults.spekeKeyProvider;
        }

        public Builder spekeKeyProvider(PackagingConfigurationSpekeKeyProvider spekeKeyProvider) {
            this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider);
            return this;
        }        public PackagingConfigurationMssEncryption build() {
            return new PackagingConfigurationMssEncryption(spekeKeyProvider);
        }
    }
}
