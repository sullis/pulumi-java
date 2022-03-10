// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.outputs;

import io.pulumi.awsnative.groundstation.outputs.ConfigSpectrumConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConfigAntennaDownlinkConfig {
    private final @Nullable ConfigSpectrumConfig spectrumConfig;

    @OutputCustomType.Constructor
    private ConfigAntennaDownlinkConfig(@OutputCustomType.Parameter("spectrumConfig") @Nullable ConfigSpectrumConfig spectrumConfig) {
        this.spectrumConfig = spectrumConfig;
    }

    public Optional<ConfigSpectrumConfig> getSpectrumConfig() {
        return Optional.ofNullable(this.spectrumConfig);
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

        public Builder setSpectrumConfig(@Nullable ConfigSpectrumConfig spectrumConfig) {
            this.spectrumConfig = spectrumConfig;
            return this;
        }
        public ConfigAntennaDownlinkConfig build() {
            return new ConfigAntennaDownlinkConfig(spectrumConfig);
        }
    }
}
