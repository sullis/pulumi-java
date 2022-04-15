// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.awsnative.groundstation.inputs.ConfigDecodeConfigArgs;
import io.pulumi.awsnative.groundstation.inputs.ConfigDemodulationConfigArgs;
import io.pulumi.awsnative.groundstation.inputs.ConfigSpectrumConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigAntennaDownlinkDemodDecodeConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigAntennaDownlinkDemodDecodeConfigArgs Empty = new ConfigAntennaDownlinkDemodDecodeConfigArgs();

    @Import(name="decodeConfig")
      private final @Nullable Output<ConfigDecodeConfigArgs> decodeConfig;

    public Output<ConfigDecodeConfigArgs> decodeConfig() {
        return this.decodeConfig == null ? Codegen.empty() : this.decodeConfig;
    }

    @Import(name="demodulationConfig")
      private final @Nullable Output<ConfigDemodulationConfigArgs> demodulationConfig;

    public Output<ConfigDemodulationConfigArgs> demodulationConfig() {
        return this.demodulationConfig == null ? Codegen.empty() : this.demodulationConfig;
    }

    @Import(name="spectrumConfig")
      private final @Nullable Output<ConfigSpectrumConfigArgs> spectrumConfig;

    public Output<ConfigSpectrumConfigArgs> spectrumConfig() {
        return this.spectrumConfig == null ? Codegen.empty() : this.spectrumConfig;
    }

    public ConfigAntennaDownlinkDemodDecodeConfigArgs(
        @Nullable Output<ConfigDecodeConfigArgs> decodeConfig,
        @Nullable Output<ConfigDemodulationConfigArgs> demodulationConfig,
        @Nullable Output<ConfigSpectrumConfigArgs> spectrumConfig) {
        this.decodeConfig = decodeConfig;
        this.demodulationConfig = demodulationConfig;
        this.spectrumConfig = spectrumConfig;
    }

    private ConfigAntennaDownlinkDemodDecodeConfigArgs() {
        this.decodeConfig = Codegen.empty();
        this.demodulationConfig = Codegen.empty();
        this.spectrumConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigAntennaDownlinkDemodDecodeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ConfigDecodeConfigArgs> decodeConfig;
        private @Nullable Output<ConfigDemodulationConfigArgs> demodulationConfig;
        private @Nullable Output<ConfigSpectrumConfigArgs> spectrumConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigAntennaDownlinkDemodDecodeConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.decodeConfig = defaults.decodeConfig;
    	      this.demodulationConfig = defaults.demodulationConfig;
    	      this.spectrumConfig = defaults.spectrumConfig;
        }

        public Builder decodeConfig(@Nullable Output<ConfigDecodeConfigArgs> decodeConfig) {
            this.decodeConfig = decodeConfig;
            return this;
        }
        public Builder decodeConfig(@Nullable ConfigDecodeConfigArgs decodeConfig) {
            this.decodeConfig = Codegen.ofNullable(decodeConfig);
            return this;
        }
        public Builder demodulationConfig(@Nullable Output<ConfigDemodulationConfigArgs> demodulationConfig) {
            this.demodulationConfig = demodulationConfig;
            return this;
        }
        public Builder demodulationConfig(@Nullable ConfigDemodulationConfigArgs demodulationConfig) {
            this.demodulationConfig = Codegen.ofNullable(demodulationConfig);
            return this;
        }
        public Builder spectrumConfig(@Nullable Output<ConfigSpectrumConfigArgs> spectrumConfig) {
            this.spectrumConfig = spectrumConfig;
            return this;
        }
        public Builder spectrumConfig(@Nullable ConfigSpectrumConfigArgs spectrumConfig) {
            this.spectrumConfig = Codegen.ofNullable(spectrumConfig);
            return this;
        }        public ConfigAntennaDownlinkDemodDecodeConfigArgs build() {
            return new ConfigAntennaDownlinkDemodDecodeConfigArgs(decodeConfig, demodulationConfig, spectrumConfig);
        }
    }
}
