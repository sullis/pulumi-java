// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.awsnative.ecs.enums.TaskSetScaleUnit;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TaskSetScale {
    /**
     * The unit of measure for the scale value.
     * 
     */
    private final @Nullable TaskSetScaleUnit unit;
    /**
     * The value, specified as a percent total of a service's desiredCount, to scale the task set. Accepted values are numbers between 0 and 100.
     * 
     */
    private final @Nullable Double value;

    @OutputCustomType.Constructor({"unit","value"})
    private TaskSetScale(
        @Nullable TaskSetScaleUnit unit,
        @Nullable Double value) {
        this.unit = unit;
        this.value = value;
    }

    /**
     * The unit of measure for the scale value.
     * 
     */
    public Optional<TaskSetScaleUnit> getUnit() {
        return Optional.ofNullable(this.unit);
    }
    /**
     * The value, specified as a percent total of a service's desiredCount, to scale the task set. Accepted values are numbers between 0 and 100.
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
        private @Nullable TaskSetScaleUnit unit;
        private @Nullable Double value;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskSetScale defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        public Builder setUnit(@Nullable TaskSetScaleUnit unit) {
            this.unit = unit;
            return this;
        }

        public Builder setValue(@Nullable Double value) {
            this.value = value;
            return this;
        }

        public TaskSetScale build() {
            return new TaskSetScale(unit, value);
        }
    }
}
