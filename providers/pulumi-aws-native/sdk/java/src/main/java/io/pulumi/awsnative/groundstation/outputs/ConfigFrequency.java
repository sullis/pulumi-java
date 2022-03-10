// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.outputs;

import io.pulumi.awsnative.groundstation.enums.ConfigFrequencyUnits;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConfigFrequency {
    private final @Nullable ConfigFrequencyUnits units;
    private final @Nullable Double value;

    @OutputCustomType.Constructor
    private ConfigFrequency(
        @OutputCustomType.Parameter("units") @Nullable ConfigFrequencyUnits units,
        @OutputCustomType.Parameter("value") @Nullable Double value) {
        this.units = units;
        this.value = value;
    }

    public Optional<ConfigFrequencyUnits> getUnits() {
        return Optional.ofNullable(this.units);
    }
    public Optional<Double> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigFrequency defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConfigFrequencyUnits units;
        private @Nullable Double value;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigFrequency defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.units = defaults.units;
    	      this.value = defaults.value;
        }

        public Builder setUnits(@Nullable ConfigFrequencyUnits units) {
            this.units = units;
            return this;
        }

        public Builder setValue(@Nullable Double value) {
            this.value = value;
            return this;
        }
        public ConfigFrequency build() {
            return new ConfigFrequency(units, value);
        }
    }
}
