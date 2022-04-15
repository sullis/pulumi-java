// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.awsnative.groundstation.inputs.ConfigSpectrumConfig;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigAntennaDownlinkConfig extends io.pulumi.resources.InvokeArgs {

    public static final ConfigAntennaDownlinkConfig Empty = new ConfigAntennaDownlinkConfig();

    @Import(name="spectrumConfig")
      private final @Nullable ConfigSpectrumConfig spectrumConfig;

    public Optional<ConfigSpectrumConfig> spectrumConfig() {
        return this.spectrumConfig == null ? Optional.empty() : Optional.ofNullable(this.spectrumConfig);
    }

    public ConfigAntennaDownlinkConfig(@Nullable ConfigSpectrumConfig spectrumConfig) {
        this.spectrumConfig = spectrumConfig;
    }

    private ConfigAntennaDownlinkConfig() {
        this.spectrumConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigAntennaDownlinkConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConfigSpectrumConfig spectrumConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigAntennaDownlinkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spectrumConfig = defaults.spectrumConfig;
        }

        public Builder spectrumConfig(@Nullable ConfigSpectrumConfig spectrumConfig) {
            this.spectrumConfig = spectrumConfig;
            return this;
        }        public ConfigAntennaDownlinkConfig build() {
            return new ConfigAntennaDownlinkConfig(spectrumConfig);
        }
    }
}
