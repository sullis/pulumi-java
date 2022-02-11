// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.awsnative.ecs.enums.TaskSetScaleUnit;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskSetScale extends io.pulumi.resources.InvokeArgs {

    public static final TaskSetScale Empty = new TaskSetScale();

    @InputImport(name="unit")
    private final @Nullable TaskSetScaleUnit unit;

    public Optional<TaskSetScaleUnit> getUnit() {
        return this.unit == null ? Optional.empty() : Optional.ofNullable(this.unit);
    }

    @InputImport(name="value")
    private final @Nullable Double value;

    public Optional<Double> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public TaskSetScale(
        @Nullable TaskSetScaleUnit unit,
        @Nullable Double value) {
        this.unit = unit;
        this.value = value;
    }

    private TaskSetScale() {
        this.unit = null;
        this.value = null;
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
