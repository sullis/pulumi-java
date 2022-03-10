// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DomainConfigurationAuthorizerConfig {
    private final @Nullable Boolean allowAuthorizerOverride;
    private final @Nullable String defaultAuthorizerName;

    @OutputCustomType.Constructor
    private DomainConfigurationAuthorizerConfig(
        @OutputCustomType.Parameter("allowAuthorizerOverride") @Nullable Boolean allowAuthorizerOverride,
        @OutputCustomType.Parameter("defaultAuthorizerName") @Nullable String defaultAuthorizerName) {
        this.allowAuthorizerOverride = allowAuthorizerOverride;
        this.defaultAuthorizerName = defaultAuthorizerName;
    }

    public Optional<Boolean> getAllowAuthorizerOverride() {
        return Optional.ofNullable(this.allowAuthorizerOverride);
    }
    public Optional<String> getDefaultAuthorizerName() {
        return Optional.ofNullable(this.defaultAuthorizerName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainConfigurationAuthorizerConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowAuthorizerOverride;
        private @Nullable String defaultAuthorizerName;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainConfigurationAuthorizerConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAuthorizerOverride = defaults.allowAuthorizerOverride;
    	      this.defaultAuthorizerName = defaults.defaultAuthorizerName;
        }

        public Builder setAllowAuthorizerOverride(@Nullable Boolean allowAuthorizerOverride) {
            this.allowAuthorizerOverride = allowAuthorizerOverride;
            return this;
        }

        public Builder setDefaultAuthorizerName(@Nullable String defaultAuthorizerName) {
            this.defaultAuthorizerName = defaultAuthorizerName;
            return this;
        }
        public DomainConfigurationAuthorizerConfig build() {
            return new DomainConfigurationAuthorizerConfig(allowAuthorizerOverride, defaultAuthorizerName);
        }
    }
}
