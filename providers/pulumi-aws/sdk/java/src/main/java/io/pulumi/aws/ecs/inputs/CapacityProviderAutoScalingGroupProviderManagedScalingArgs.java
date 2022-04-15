// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CapacityProviderAutoScalingGroupProviderManagedScalingArgs extends io.pulumi.resources.ResourceArgs {

    public static final CapacityProviderAutoScalingGroupProviderManagedScalingArgs Empty = new CapacityProviderAutoScalingGroupProviderManagedScalingArgs();

    /**
     * Period of time, in seconds, after a newly launched Amazon EC2 instance can contribute to CloudWatch metrics for Auto Scaling group. If this parameter is omitted, the default value of 300 seconds is used.
     * 
     */
    @Import(name="instanceWarmupPeriod")
      private final @Nullable Output<Integer> instanceWarmupPeriod;

    public Output<Integer> instanceWarmupPeriod() {
        return this.instanceWarmupPeriod == null ? Codegen.empty() : this.instanceWarmupPeriod;
    }

    /**
     * Maximum step adjustment size. A number between 1 and 10,000.
     * 
     */
    @Import(name="maximumScalingStepSize")
      private final @Nullable Output<Integer> maximumScalingStepSize;

    public Output<Integer> maximumScalingStepSize() {
        return this.maximumScalingStepSize == null ? Codegen.empty() : this.maximumScalingStepSize;
    }

    /**
     * Minimum step adjustment size. A number between 1 and 10,000.
     * 
     */
    @Import(name="minimumScalingStepSize")
      private final @Nullable Output<Integer> minimumScalingStepSize;

    public Output<Integer> minimumScalingStepSize() {
        return this.minimumScalingStepSize == null ? Codegen.empty() : this.minimumScalingStepSize;
    }

    /**
     * Whether auto scaling is managed by ECS. Valid values are `ENABLED` and `DISABLED`.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * Target utilization for the capacity provider. A number between 1 and 100.
     * 
     */
    @Import(name="targetCapacity")
      private final @Nullable Output<Integer> targetCapacity;

    public Output<Integer> targetCapacity() {
        return this.targetCapacity == null ? Codegen.empty() : this.targetCapacity;
    }

    public CapacityProviderAutoScalingGroupProviderManagedScalingArgs(
        @Nullable Output<Integer> instanceWarmupPeriod,
        @Nullable Output<Integer> maximumScalingStepSize,
        @Nullable Output<Integer> minimumScalingStepSize,
        @Nullable Output<String> status,
        @Nullable Output<Integer> targetCapacity) {
        this.instanceWarmupPeriod = instanceWarmupPeriod;
        this.maximumScalingStepSize = maximumScalingStepSize;
        this.minimumScalingStepSize = minimumScalingStepSize;
        this.status = status;
        this.targetCapacity = targetCapacity;
    }

    private CapacityProviderAutoScalingGroupProviderManagedScalingArgs() {
        this.instanceWarmupPeriod = Codegen.empty();
        this.maximumScalingStepSize = Codegen.empty();
        this.minimumScalingStepSize = Codegen.empty();
        this.status = Codegen.empty();
        this.targetCapacity = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityProviderAutoScalingGroupProviderManagedScalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> instanceWarmupPeriod;
        private @Nullable Output<Integer> maximumScalingStepSize;
        private @Nullable Output<Integer> minimumScalingStepSize;
        private @Nullable Output<String> status;
        private @Nullable Output<Integer> targetCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityProviderAutoScalingGroupProviderManagedScalingArgs defaults) {
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
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
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
        }        public CapacityProviderAutoScalingGroupProviderManagedScalingArgs build() {
            return new CapacityProviderAutoScalingGroupProviderManagedScalingArgs(instanceWarmupPeriod, maximumScalingStepSize, minimumScalingStepSize, status, targetCapacity);
        }
    }
}
