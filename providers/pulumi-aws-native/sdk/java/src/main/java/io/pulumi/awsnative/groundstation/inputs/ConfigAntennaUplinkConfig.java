// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.awsnative.groundstation.inputs.ConfigEirp;
import io.pulumi.awsnative.groundstation.inputs.ConfigUplinkSpectrumConfig;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigAntennaUplinkConfig extends io.pulumi.resources.InvokeArgs {

    public static final ConfigAntennaUplinkConfig Empty = new ConfigAntennaUplinkConfig();

    @InputImport(name="spectrumConfig")
    private final @Nullable ConfigUplinkSpectrumConfig spectrumConfig;

    public Optional<ConfigUplinkSpectrumConfig> getSpectrumConfig() {
        return this.spectrumConfig == null ? Optional.empty() : Optional.ofNullable(this.spectrumConfig);
    }

    @InputImport(name="targetEirp")
    private final @Nullable ConfigEirp targetEirp;

    public Optional<ConfigEirp> getTargetEirp() {
        return this.targetEirp == null ? Optional.empty() : Optional.ofNullable(this.targetEirp);
    }

    @InputImport(name="transmitDisabled")
    private final @Nullable Boolean transmitDisabled;

    public Optional<Boolean> getTransmitDisabled() {
        return this.transmitDisabled == null ? Optional.empty() : Optional.ofNullable(this.transmitDisabled);
    }

    public ConfigAntennaUplinkConfig(
        @Nullable ConfigUplinkSpectrumConfig spectrumConfig,
        @Nullable ConfigEirp targetEirp,
        @Nullable Boolean transmitDisabled) {
        this.spectrumConfig = spectrumConfig;
        this.targetEirp = targetEirp;
        this.transmitDisabled = transmitDisabled;
    }

    private ConfigAntennaUplinkConfig() {
        this.spectrumConfig = null;
        this.targetEirp = null;
        this.transmitDisabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigAntennaUplinkConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConfigUplinkSpectrumConfig spectrumConfig;
        private @Nullable ConfigEirp targetEirp;
        private @Nullable Boolean transmitDisabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigAntennaUplinkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spectrumConfig = defaults.spectrumConfig;
    	      this.targetEirp = defaults.targetEirp;
    	      this.transmitDisabled = defaults.transmitDisabled;
        }

        public Builder setSpectrumConfig(@Nullable ConfigUplinkSpectrumConfig spectrumConfig) {
            this.spectrumConfig = spectrumConfig;
            return this;
        }

        public Builder setTargetEirp(@Nullable ConfigEirp targetEirp) {
            this.targetEirp = targetEirp;
            return this;
        }

        public Builder setTransmitDisabled(@Nullable Boolean transmitDisabled) {
            this.transmitDisabled = transmitDisabled;
            return this;
        }

        public ConfigAntennaUplinkConfig build() {
            return new ConfigAntennaUplinkConfig(spectrumConfig, targetEirp, transmitDisabled);
        }
    }
}
