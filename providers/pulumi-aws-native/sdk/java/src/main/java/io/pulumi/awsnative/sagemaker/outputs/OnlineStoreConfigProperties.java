// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.FeatureGroupOnlineStoreSecurityConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OnlineStoreConfigProperties {
    private final @Nullable Boolean enableOnlineStore;
    private final @Nullable FeatureGroupOnlineStoreSecurityConfig securityConfig;

    @OutputCustomType.Constructor({"enableOnlineStore","securityConfig"})
    private OnlineStoreConfigProperties(
        @Nullable Boolean enableOnlineStore,
        @Nullable FeatureGroupOnlineStoreSecurityConfig securityConfig) {
        this.enableOnlineStore = enableOnlineStore;
        this.securityConfig = securityConfig;
    }

    public Optional<Boolean> getEnableOnlineStore() {
        return Optional.ofNullable(this.enableOnlineStore);
    }
    public Optional<FeatureGroupOnlineStoreSecurityConfig> getSecurityConfig() {
        return Optional.ofNullable(this.securityConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnlineStoreConfigProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableOnlineStore;
        private @Nullable FeatureGroupOnlineStoreSecurityConfig securityConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(OnlineStoreConfigProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableOnlineStore = defaults.enableOnlineStore;
    	      this.securityConfig = defaults.securityConfig;
        }

        public Builder setEnableOnlineStore(@Nullable Boolean enableOnlineStore) {
            this.enableOnlineStore = enableOnlineStore;
            return this;
        }

        public Builder setSecurityConfig(@Nullable FeatureGroupOnlineStoreSecurityConfig securityConfig) {
            this.securityConfig = securityConfig;
            return this;
        }

        public OnlineStoreConfigProperties build() {
            return new OnlineStoreConfigProperties(enableOnlineStore, securityConfig);
        }
    }
}
