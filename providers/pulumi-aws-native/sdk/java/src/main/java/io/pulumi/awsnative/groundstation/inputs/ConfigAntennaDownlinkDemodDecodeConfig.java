// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.awsnative.groundstation.inputs.ConfigDecodeConfig;
import io.pulumi.awsnative.groundstation.inputs.ConfigDemodulationConfig;
import io.pulumi.awsnative.groundstation.inputs.ConfigSpectrumConfig;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigAntennaDownlinkDemodDecodeConfig extends io.pulumi.resources.InvokeArgs {

    public static final ConfigAntennaDownlinkDemodDecodeConfig Empty = new ConfigAntennaDownlinkDemodDecodeConfig();

    @InputImport(name="decodeConfig")
    private final @Nullable ConfigDecodeConfig decodeConfig;

    public Optional<ConfigDecodeConfig> getDecodeConfig() {
        return this.decodeConfig == null ? Optional.empty() : Optional.ofNullable(this.decodeConfig);
    }

    @InputImport(name="demodulationConfig")
    private final @Nullable ConfigDemodulationConfig demodulationConfig;

    public Optional<ConfigDemodulationConfig> getDemodulationConfig() {
        return this.demodulationConfig == null ? Optional.empty() : Optional.ofNullable(this.demodulationConfig);
    }

    @InputImport(name="spectrumConfig")
    private final @Nullable ConfigSpectrumConfig spectrumConfig;

    public Optional<ConfigSpectrumConfig> getSpectrumConfig() {
        return this.spectrumConfig == null ? Optional.empty() : Optional.ofNullable(this.spectrumConfig);
    }

    public ConfigAntennaDownlinkDemodDecodeConfig(
        @Nullable ConfigDecodeConfig decodeConfig,
        @Nullable ConfigDemodulationConfig demodulationConfig,
        @Nullable ConfigSpectrumConfig spectrumConfig) {
        this.decodeConfig = decodeConfig;
        this.demodulationConfig = demodulationConfig;
        this.spectrumConfig = spectrumConfig;
    }

    private ConfigAntennaDownlinkDemodDecodeConfig() {
        this.decodeConfig = null;
        this.demodulationConfig = null;
        this.spectrumConfig = null;
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
