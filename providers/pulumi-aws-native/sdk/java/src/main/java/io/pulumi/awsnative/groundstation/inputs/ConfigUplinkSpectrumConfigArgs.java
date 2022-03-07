// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.awsnative.groundstation.enums.ConfigPolarization;
import io.pulumi.awsnative.groundstation.inputs.ConfigFrequencyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigUplinkSpectrumConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigUplinkSpectrumConfigArgs Empty = new ConfigUplinkSpectrumConfigArgs();

    @InputImport(name="centerFrequency")
      private final @Nullable Input<ConfigFrequencyArgs> centerFrequency;

    public Input<ConfigFrequencyArgs> getCenterFrequency() {
        return this.centerFrequency == null ? Input.empty() : this.centerFrequency;
    }

    @InputImport(name="polarization")
      private final @Nullable Input<ConfigPolarization> polarization;

    public Input<ConfigPolarization> getPolarization() {
        return this.polarization == null ? Input.empty() : this.polarization;
    }

    public ConfigUplinkSpectrumConfigArgs(
        @Nullable Input<ConfigFrequencyArgs> centerFrequency,
        @Nullable Input<ConfigPolarization> polarization) {
        this.centerFrequency = centerFrequency;
        this.polarization = polarization;
    }

    private ConfigUplinkSpectrumConfigArgs() {
        this.centerFrequency = Input.empty();
        this.polarization = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigUplinkSpectrumConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConfigFrequencyArgs> centerFrequency;
        private @Nullable Input<ConfigPolarization> polarization;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigUplinkSpectrumConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.centerFrequency = defaults.centerFrequency;
    	      this.polarization = defaults.polarization;
        }

        public Builder setCenterFrequency(@Nullable Input<ConfigFrequencyArgs> centerFrequency) {
            this.centerFrequency = centerFrequency;
            return this;
        }

        public Builder setCenterFrequency(@Nullable ConfigFrequencyArgs centerFrequency) {
            this.centerFrequency = Input.ofNullable(centerFrequency);
            return this;
        }

        public Builder setPolarization(@Nullable Input<ConfigPolarization> polarization) {
            this.polarization = polarization;
            return this;
        }

        public Builder setPolarization(@Nullable ConfigPolarization polarization) {
            this.polarization = Input.ofNullable(polarization);
            return this;
        }
        public ConfigUplinkSpectrumConfigArgs build() {
            return new ConfigUplinkSpectrumConfigArgs(centerFrequency, polarization);
        }
    }
}