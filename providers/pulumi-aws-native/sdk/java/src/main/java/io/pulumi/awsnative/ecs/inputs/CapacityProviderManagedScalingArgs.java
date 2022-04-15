// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.awsnative.ecs.enums.CapacityProviderManagedScalingStatus;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The managed scaling settings for the Auto Scaling group capacity provider.
 * 
 */
public final class CapacityProviderManagedScalingArgs extends io.pulumi.resources.ResourceArgs {

    public static final CapacityProviderManagedScalingArgs Empty = new CapacityProviderManagedScalingArgs();

    @Import(name="instanceWarmupPeriod")
      private final @Nullable Output<Integer> instanceWarmupPeriod;

    public Output<Integer> instanceWarmupPeriod() {
        return this.instanceWarmupPeriod == null ? Codegen.empty() : this.instanceWarmupPeriod;
    }

    @Import(name="maximumScalingStepSize")
      private final @Nullable Output<Integer> maximumScalingStepSize;

    public Output<Integer> maximumScalingStepSize() {
        return this.maximumScalingStepSize == null ? Codegen.empty() : this.maximumScalingStepSize;
    }

    @Import(name="minimumScalingStepSize")
      private final @Nullable Output<Integer> minimumScalingStepSize;

    public Output<Integer> minimumScalingStepSize() {
        return this.minimumScalingStepSize == null ? Codegen.empty() : this.minimumScalingStepSize;
    }

    @Import(name="status")
      private final @Nullable Output<CapacityProviderManagedScalingStatus> status;

    public Output<CapacityProviderManagedScalingStatus> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    @Import(name="targetCapacity")
      private final @Nullable Output<Integer> targetCapacity;

    public Output<Integer> targetCapacity() {
        return this.targetCapacity == null ? Codegen.empty() : this.targetCapacity;
    }

    public CapacityProviderManagedScalingArgs(
        @Nullable Output<Integer> instanceWarmupPeriod,
        @Nullable Output<Integer> maximumScalingStepSize,
        @Nullable Output<Integer> minimumScalingStepSize,
        @Nullable Output<CapacityProviderManagedScalingStatus> status,
        @Nullable Output<Integer> targetCapacity) {
        this.instanceWarmupPeriod = instanceWarmupPeriod;
        this.maximumScalingStepSize = maximumScalingStepSize;
        this.minimumScalingStepSize = minimumScalingStepSize;
        this.status = status;
        this.targetCapacity = targetCapacity;
    }

    private CapacityProviderManagedScalingArgs() {
        this.instanceWarmupPeriod = Codegen.empty();
        this.maximumScalingStepSize = Codegen.empty();
        this.minimumScalingStepSize = Codegen.empty();
        this.status = Codegen.empty();
        this.targetCapacity = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityProviderManagedScalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> instanceWarmupPeriod;
        private @Nullable Output<Integer> maximumScalingStepSize;
        private @Nullable Output<Integer> minimumScalingStepSize;
        private @Nullable Output<CapacityProviderManagedScalingStatus> status;
        private @Nullable Output<Integer> targetCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityProviderManagedScalingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceWarmupPeriod = defaults.instanceWarmupPeriod;
    	      this.maximumScalingStepSize = defaults.maximumScalingStepSize;
    	      this.minimumScalingStepSize = defaults.minimumScalingStepSize;
    	      this.status = defaults.status;
    	      this.targetCapacity = defaults.targetCapacity;
        }

        public Builder instanceWarmupPeriod(@Nullable Output<Integer> instanceWarmupPeriod) {
            this.instanceWarmupPeriod = instanceWarmupPeriod;
            return this;
        }
        public Builder instanceWarmupPeriod(@Nullable Integer instanceWarmupPeriod) {
            this.instanceWarmupPeriod = Codegen.ofNullable(instanceWarmupPeriod);
            return this;
        }
        public Builder maximumScalingStepSize(@Nullable Output<Integer> maximumScalingStepSize) {
            this.maximumScalingStepSize = maximumScalingStepSize;
            return this;
        }
        public Builder maximumScalingStepSize(@Nullable Integer maximumScalingStepSize) {
            this.maximumScalingStepSize = Codegen.ofNullable(maximumScalingStepSize);
            return this;
        }
        public Builder minimumScalingStepSize(@Nullable Output<Integer> minimumScalingStepSize) {
            this.minimumScalingStepSize = minimumScalingStepSize;
            return this;
        }
        public Builder minimumScalingStepSize(@Nullable Integer minimumScalingStepSize) {
            this.minimumScalingStepSize = Codegen.ofNullable(minimumScalingStepSize);
            return this;
        }
        public Builder status(@Nullable Output<CapacityProviderManagedScalingStatus> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable CapacityProviderManagedScalingStatus status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder targetCapacity(@Nullable Output<Integer> targetCapacity) {
            this.targetCapacity = targetCapacity;
            return this;
        }
        public Builder targetCapacity(@Nullable Integer targetCapacity) {
            this.targetCapacity = Codegen.ofNullable(targetCapacity);
            return this;
        }        public CapacityProviderManagedScalingArgs build() {
            return new CapacityProviderManagedScalingArgs(instanceWarmupPeriod, maximumScalingStepSize, minimumScalingStepSize, status, targetCapacity);
        }
    }
}
