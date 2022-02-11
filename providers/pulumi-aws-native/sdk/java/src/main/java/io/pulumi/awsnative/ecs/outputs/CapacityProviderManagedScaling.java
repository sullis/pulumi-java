// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.awsnative.ecs.enums.CapacityProviderManagedScalingStatus;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CapacityProviderManagedScaling {
    private final @Nullable Integer instanceWarmupPeriod;
    private final @Nullable Integer maximumScalingStepSize;
    private final @Nullable Integer minimumScalingStepSize;
    private final @Nullable CapacityProviderManagedScalingStatus status;
    private final @Nullable Integer targetCapacity;

    @OutputCustomType.Constructor({"instanceWarmupPeriod","maximumScalingStepSize","minimumScalingStepSize","status","targetCapacity"})
    private CapacityProviderManagedScaling(
        @Nullable Integer instanceWarmupPeriod,
        @Nullable Integer maximumScalingStepSize,
        @Nullable Integer minimumScalingStepSize,
        @Nullable CapacityProviderManagedScalingStatus status,
        @Nullable Integer targetCapacity) {
        this.instanceWarmupPeriod = instanceWarmupPeriod;
        this.maximumScalingStepSize = maximumScalingStepSize;
        this.minimumScalingStepSize = minimumScalingStepSize;
        this.status = status;
        this.targetCapacity = targetCapacity;
    }

    public Optional<Integer> getInstanceWarmupPeriod() {
        return Optional.ofNullable(this.instanceWarmupPeriod);
    }
    public Optional<Integer> getMaximumScalingStepSize() {
        return Optional.ofNullable(this.maximumScalingStepSize);
    }
    public Optional<Integer> getMinimumScalingStepSize() {
        return Optional.ofNullable(this.minimumScalingStepSize);
    }
    public Optional<CapacityProviderManagedScalingStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }
    public Optional<Integer> getTargetCapacity() {
        return Optional.ofNullable(this.targetCapacity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityProviderManagedScaling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer instanceWarmupPeriod;
        private @Nullable Integer maximumScalingStepSize;
        private @Nullable Integer minimumScalingStepSize;
        private @Nullable CapacityProviderManagedScalingStatus status;
        private @Nullable Integer targetCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityProviderManagedScaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceWarmupPeriod = defaults.instanceWarmupPeriod;
    	      this.maximumScalingStepSize = defaults.maximumScalingStepSize;
    	      this.minimumScalingStepSize = defaults.minimumScalingStepSize;
    	      this.status = defaults.status;
    	      this.targetCapacity = defaults.targetCapacity;
        }

        public Builder setInstanceWarmupPeriod(@Nullable Integer instanceWarmupPeriod) {
            this.instanceWarmupPeriod = instanceWarmupPeriod;
            return this;
        }

        public Builder setMaximumScalingStepSize(@Nullable Integer maximumScalingStepSize) {
            this.maximumScalingStepSize = maximumScalingStepSize;
            return this;
        }

        public Builder setMinimumScalingStepSize(@Nullable Integer minimumScalingStepSize) {
            this.minimumScalingStepSize = minimumScalingStepSize;
            return this;
        }

        public Builder setStatus(@Nullable CapacityProviderManagedScalingStatus status) {
            this.status = status;
            return this;
        }

        public Builder setTargetCapacity(@Nullable Integer targetCapacity) {
            this.targetCapacity = targetCapacity;
            return this;
        }

        public CapacityProviderManagedScaling build() {
            return new CapacityProviderManagedScaling(instanceWarmupPeriod, maximumScalingStepSize, minimumScalingStepSize, status, targetCapacity);
        }
    }
}
