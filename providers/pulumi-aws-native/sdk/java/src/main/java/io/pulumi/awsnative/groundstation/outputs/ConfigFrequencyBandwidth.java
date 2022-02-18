// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.outputs;

import io.pulumi.awsnative.groundstation.enums.ConfigBandwidthUnits;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConfigFrequencyBandwidth {
    private final @Nullable ConfigBandwidthUnits units;
    private final @Nullable Double value;

    @OutputCustomType.Constructor({"units","value"})
    private ConfigFrequencyBandwidth(
        @Nullable ConfigBandwidthUnits units,
        @Nullable Double value) {
        this.units = units;
        this.value = value;
    }

    public Optional<ConfigBandwidthUnits> getUnits() {
        return Optional.ofNullable(this.units);
    }
    public Optional<Double> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigFrequencyBandwidth defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConfigBandwidthUnits units;
        private @Nullable Double value;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigFrequencyBandwidth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.units = defaults.units;
    	      this.value = defaults.value;
        }

        public Builder setUnits(@Nullable ConfigBandwidthUnits units) {
            this.units = units;
            return this;
        }

        public Builder setValue(@Nullable Double value) {
            this.value = value;
            return this;
        }

        public ConfigFrequencyBandwidth build() {
            return new ConfigFrequencyBandwidth(units, value);
        }
    }
}
