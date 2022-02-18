// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.outputs;

import io.pulumi.awsnative.groundstation.outputs.ConfigDecodeConfig;
import io.pulumi.awsnative.groundstation.outputs.ConfigDemodulationConfig;
import io.pulumi.awsnative.groundstation.outputs.ConfigSpectrumConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConfigAntennaDownlinkDemodDecodeConfig {
    private final @Nullable ConfigDecodeConfig decodeConfig;
    private final @Nullable ConfigDemodulationConfig demodulationConfig;
    private final @Nullable ConfigSpectrumConfig spectrumConfig;

    @OutputCustomType.Constructor({"decodeConfig","demodulationConfig","spectrumConfig"})
    private ConfigAntennaDownlinkDemodDecodeConfig(
        @Nullable ConfigDecodeConfig decodeConfig,
        @Nullable ConfigDemodulationConfig demodulationConfig,
        @Nullable ConfigSpectrumConfig spectrumConfig) {
        this.decodeConfig = decodeConfig;
        this.demodulationConfig = demodulationConfig;
        this.spectrumConfig = spectrumConfig;
    }

    public Optional<ConfigDecodeConfig> getDecodeConfig() {
        return Optional.ofNullable(this.decodeConfig);
    }
    public Optional<ConfigDemodulationConfig> getDemodulationConfig() {
        return Optional.ofNullable(this.demodulationConfig);
    }
    public Optional<ConfigSpectrumConfig> getSpectrumConfig() {
        return Optional.ofNullable(this.spectrumConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigAntennaDownlinkDemodDecodeConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConfigDecodeConfig decodeConfig;
        private @Nullable ConfigDemodulationConfig demodulationConfig;
        private @Nullable ConfigSpectrumConfig spectrumConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigAntennaDownlinkDemodDecodeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.decodeConfig = defaults.decodeConfig;
    	      this.demodulationConfig = defaults.demodulationConfig;
    	      this.spectrumConfig = defaults.spectrumConfig;
        }

        public Builder setDecodeConfig(@Nullable ConfigDecodeConfig decodeConfig) {
            this.decodeConfig = decodeConfig;
            return this;
        }

        public Builder setDemodulationConfig(@Nullable ConfigDemodulationConfig demodulationConfig) {
            this.demodulationConfig = demodulationConfig;
            return this;
        }

        public Builder setSpectrumConfig(@Nullable ConfigSpectrumConfig spectrumConfig) {
            this.spectrumConfig = spectrumConfig;
            return this;
        }

        public ConfigAntennaDownlinkDemodDecodeConfig build() {
            return new ConfigAntennaDownlinkDemodDecodeConfig(decodeConfig, demodulationConfig, spectrumConfig);
        }
    }
}
