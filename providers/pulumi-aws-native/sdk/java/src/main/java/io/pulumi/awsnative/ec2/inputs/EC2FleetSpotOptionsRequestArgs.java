// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.enums.EC2FleetSpotOptionsRequestAllocationStrategy;
import io.pulumi.awsnative.ec2.enums.EC2FleetSpotOptionsRequestInstanceInterruptionBehavior;
import io.pulumi.awsnative.ec2.inputs.EC2FleetMaintenanceStrategiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EC2FleetSpotOptionsRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final EC2FleetSpotOptionsRequestArgs Empty = new EC2FleetSpotOptionsRequestArgs();

    @Import(name="allocationStrategy")
      private final @Nullable Output<EC2FleetSpotOptionsRequestAllocationStrategy> allocationStrategy;

    public Output<EC2FleetSpotOptionsRequestAllocationStrategy> allocationStrategy() {
        return this.allocationStrategy == null ? Codegen.empty() : this.allocationStrategy;
    }

    @Import(name="instanceInterruptionBehavior")
      private final @Nullable Output<EC2FleetSpotOptionsRequestInstanceInterruptionBehavior> instanceInterruptionBehavior;

    public Output<EC2FleetSpotOptionsRequestInstanceInterruptionBehavior> instanceInterruptionBehavior() {
        return this.instanceInterruptionBehavior == null ? Codegen.empty() : this.instanceInterruptionBehavior;
    }

    @Import(name="instancePoolsToUseCount")
      private final @Nullable Output<Integer> instancePoolsToUseCount;

    public Output<Integer> instancePoolsToUseCount() {
        return this.instancePoolsToUseCount == null ? Codegen.empty() : this.instancePoolsToUseCount;
    }

    @Import(name="maintenanceStrategies")
      private final @Nullable Output<EC2FleetMaintenanceStrategiesArgs> maintenanceStrategies;

    public Output<EC2FleetMaintenanceStrategiesArgs> maintenanceStrategies() {
        return this.maintenanceStrategies == null ? Codegen.empty() : this.maintenanceStrategies;
    }

    @Import(name="maxTotalPrice")
      private final @Nullable Output<String> maxTotalPrice;

    public Output<String> maxTotalPrice() {
        return this.maxTotalPrice == null ? Codegen.empty() : this.maxTotalPrice;
    }

    @Import(name="minTargetCapacity")
      private final @Nullable Output<Integer> minTargetCapacity;

    public Output<Integer> minTargetCapacity() {
        return this.minTargetCapacity == null ? Codegen.empty() : this.minTargetCapacity;
    }

    @Import(name="singleAvailabilityZone")
      private final @Nullable Output<Boolean> singleAvailabilityZone;

    public Output<Boolean> singleAvailabilityZone() {
        return this.singleAvailabilityZone == null ? Codegen.empty() : this.singleAvailabilityZone;
    }

    @Import(name="singleInstanceType")
      private final @Nullable Output<Boolean> singleInstanceType;

    public Output<Boolean> singleInstanceType() {
        return this.singleInstanceType == null ? Codegen.empty() : this.singleInstanceType;
    }

    public EC2FleetSpotOptionsRequestArgs(
        @Nullable Output<EC2FleetSpotOptionsRequestAllocationStrategy> allocationStrategy,
        @Nullable Output<EC2FleetSpotOptionsRequestInstanceInterruptionBehavior> instanceInterruptionBehavior,
        @Nullable Output<Integer> instancePoolsToUseCount,
        @Nullable Output<EC2FleetMaintenanceStrategiesArgs> maintenanceStrategies,
        @Nullable Output<String> maxTotalPrice,
        @Nullable Output<Integer> minTargetCapacity,
        @Nullable Output<Boolean> singleAvailabilityZone,
        @Nullable Output<Boolean> singleInstanceType) {
        this.allocationStrategy = allocationStrategy;
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
        this.instancePoolsToUseCount = instancePoolsToUseCount;
        this.maintenanceStrategies = maintenanceStrategies;
        this.maxTotalPrice = maxTotalPrice;
        this.minTargetCapacity = minTargetCapacity;
        this.singleAvailabilityZone = singleAvailabilityZone;
        this.singleInstanceType = singleInstanceType;
    }

    private EC2FleetSpotOptionsRequestArgs() {
        this.allocationStrategy = Codegen.empty();
        this.instanceInterruptionBehavior = Codegen.empty();
        this.instancePoolsToUseCount = Codegen.empty();
        this.maintenanceStrategies = Codegen.empty();
        this.maxTotalPrice = Codegen.empty();
        this.minTargetCapacity = Codegen.empty();
        this.singleAvailabilityZone = Codegen.empty();
        this.singleInstanceType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetSpotOptionsRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EC2FleetSpotOptionsRequestAllocationStrategy> allocationStrategy;
        private @Nullable Output<EC2FleetSpotOptionsRequestInstanceInterruptionBehavior> instanceInterruptionBehavior;
        private @Nullable Output<Integer> instancePoolsToUseCount;
        private @Nullable Output<EC2FleetMaintenanceStrategiesArgs> maintenanceStrategies;
        private @Nullable Output<String> maxTotalPrice;
        private @Nullable Output<Integer> minTargetCapacity;
        private @Nullable Output<Boolean> singleAvailabilityZone;
        private @Nullable Output<Boolean> singleInstanceType;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetSpotOptionsRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationStrategy = defaults.allocationStrategy;
    	      this.instanceInterruptionBehavior = defaults.instanceInterruptionBehavior;
    	      this.instancePoolsToUseCount = defaults.instancePoolsToUseCount;
    	      this.maintenanceStrategies = defaults.maintenanceStrategies;
    	      this.maxTotalPrice = defaults.maxTotalPrice;
    	      this.minTargetCapacity = defaults.minTargetCapacity;
    	      this.singleAvailabilityZone = defaults.singleAvailabilityZone;
    	      this.singleInstanceType = defaults.singleInstanceType;
        }

        public Builder allocationStrategy(@Nullable Output<EC2FleetSpotOptionsRequestAllocationStrategy> allocationStrategy) {
            this.allocationStrategy = allocationStrategy;
            return this;
        }
        public Builder allocationStrategy(@Nullable EC2FleetSpotOptionsRequestAllocationStrategy allocationStrategy) {
            this.allocationStrategy = Codegen.ofNullable(allocationStrategy);
            return this;
        }
        public Builder instanceInterruptionBehavior(@Nullable Output<EC2FleetSpotOptionsRequestInstanceInterruptionBehavior> instanceInterruptionBehavior) {
            this.instanceInterruptionBehavior = instanceInterruptionBehavior;
            return this;
        }
        public Builder instanceInterruptionBehavior(@Nullable EC2FleetSpotOptionsRequestInstanceInterruptionBehavior instanceInterruptionBehavior) {
            this.instanceInterruptionBehavior = Codegen.ofNullable(instanceInterruptionBehavior);
            return this;
        }
        public Builder instancePoolsToUseCount(@Nullable Output<Integer> instancePoolsToUseCount) {
            this.instancePoolsToUseCount = instancePoolsToUseCount;
            return this;
        }
        public Builder instancePoolsToUseCount(@Nullable Integer instancePoolsToUseCount) {
            this.instancePoolsToUseCount = Codegen.ofNullable(instancePoolsToUseCount);
            return this;
        }
        public Builder maintenanceStrategies(@Nullable Output<EC2FleetMaintenanceStrategiesArgs> maintenanceStrategies) {
            this.maintenanceStrategies = maintenanceStrategies;
            return this;
        }
        public Builder maintenanceStrategies(@Nullable EC2FleetMaintenanceStrategiesArgs maintenanceStrategies) {
            this.maintenanceStrategies = Codegen.ofNullable(maintenanceStrategies);
            return this;
        }
        public Builder maxTotalPrice(@Nullable Output<String> maxTotalPrice) {
            this.maxTotalPrice = maxTotalPrice;
            return this;
        }
        public Builder maxTotalPrice(@Nullable String maxTotalPrice) {
            this.maxTotalPrice = Codegen.ofNullable(maxTotalPrice);
            return this;
        }
        public Builder minTargetCapacity(@Nullable Output<Integer> minTargetCapacity) {
            this.minTargetCapacity = minTargetCapacity;
            return this;
        }
        public Builder minTargetCapacity(@Nullable Integer minTargetCapacity) {
            this.minTargetCapacity = Codegen.ofNullable(minTargetCapacity);
            return this;
        }
        public Builder singleAvailabilityZone(@Nullable Output<Boolean> singleAvailabilityZone) {
            this.singleAvailabilityZone = singleAvailabilityZone;
            return this;
        }
        public Builder singleAvailabilityZone(@Nullable Boolean singleAvailabilityZone) {
            this.singleAvailabilityZone = Codegen.ofNullable(singleAvailabilityZone);
            return this;
        }
        public Builder singleInstanceType(@Nullable Output<Boolean> singleInstanceType) {
            this.singleInstanceType = singleInstanceType;
            return this;
        }
        public Builder singleInstanceType(@Nullable Boolean singleInstanceType) {
            this.singleInstanceType = Codegen.ofNullable(singleInstanceType);
            return this;
        }        public EC2FleetSpotOptionsRequestArgs build() {
            return new EC2FleetSpotOptionsRequestArgs(allocationStrategy, instanceInterruptionBehavior, instancePoolsToUseCount, maintenanceStrategies, maxTotalPrice, minTargetCapacity, singleAvailabilityZone, singleInstanceType);
        }
    }
}
