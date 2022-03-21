// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainConfigurationAuthorizerConfig extends io.pulumi.resources.InvokeArgs {

    public static final DomainConfigurationAuthorizerConfig Empty = new DomainConfigurationAuthorizerConfig();

    @Import(name="allowAuthorizerOverride")
      private final @Nullable Boolean allowAuthorizerOverride;

    public Optional<Boolean> getAllowAuthorizerOverride() {
        return this.allowAuthorizerOverride == null ? Optional.empty() : Optional.ofNullable(this.allowAuthorizerOverride);
    }

    @Import(name="defaultAuthorizerName")
      private final @Nullable String defaultAuthorizerName;

    public Optional<String> getDefaultAuthorizerName() {
        return this.defaultAuthorizerName == null ? Optional.empty() : Optional.ofNullable(this.defaultAuthorizerName);
    }

    public DomainConfigurationAuthorizerConfig(
        @Nullable Boolean allowAuthorizerOverride,
        @Nullable String defaultAuthorizerName) {
        this.allowAuthorizerOverride = allowAuthorizerOverride;
        this.defaultAuthorizerName = defaultAuthorizerName;
    }

    private DomainConfigurationAuthorizerConfig() {
        this.allowAuthorizerOverride = null;
        this.defaultAuthorizerName = null;
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

        public Builder allowAuthorizerOverride(@Nullable Boolean allowAuthorizerOverride) {
            this.allowAuthorizerOverride = allowAuthorizerOverride;
            return this;
        }
        public Builder defaultAuthorizerName(@Nullable String defaultAuthorizerName) {
            this.defaultAuthorizerName = defaultAuthorizerName;
            return this;
        }        public DomainConfigurationAuthorizerConfig build() {
            return new DomainConfigurationAuthorizerConfig(allowAuthorizerOverride, defaultAuthorizerName);
        }
    }
}
