// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskSetScale {
    /**
     * The unit of measure for the scale value. Default: `PERCENT`.
     * 
     */
    private final @Nullable String unit;
    /**
     * The value, specified as a percent total of a service's `desiredCount`, to scale the task set. Defaults to `0` if not specified. Accepted values are numbers between 0.0 and 100.0.
     * 
     */
    private final @Nullable Double value;

    @CustomType.Constructor
    private TaskSetScale(
        @CustomType.Parameter("unit") @Nullable String unit,
        @CustomType.Parameter("value") @Nullable Double value) {
        this.unit = unit;
        this.value = value;
    }

    /**
     * The unit of measure for the scale value. Default: `PERCENT`.
     * 
    */
    public Optional<String> getUnit() {
        return Optional.ofNullable(this.unit);
    }
    /**
     * The value, specified as a percent total of a service's `desiredCount`, to scale the task set. Defaults to `0` if not specified. Accepted values are numbers between 0.0 and 100.0.
     * 
    */
    public Optional<Double> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSetScale defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String unit;
        private @Nullable Double value;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskSetScale defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        public Builder unit(@Nullable String unit) {
            this.unit = unit;
            return this;
        }
        public Builder value(@Nullable Double value) {
            this.value = value;
            return this;
        }        public TaskSetScale build() {
            return new TaskSetScale(unit, value);
        }
    }
}
