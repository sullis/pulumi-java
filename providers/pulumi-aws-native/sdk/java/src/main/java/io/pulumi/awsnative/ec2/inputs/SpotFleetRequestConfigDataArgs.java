// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.enums.SpotFleetRequestConfigDataAllocationStrategy;
import io.pulumi.awsnative.ec2.enums.SpotFleetRequestConfigDataExcessCapacityTerminationPolicy;
import io.pulumi.awsnative.ec2.enums.SpotFleetRequestConfigDataInstanceInterruptionBehavior;
import io.pulumi.awsnative.ec2.enums.SpotFleetRequestConfigDataTargetCapacityUnitType;
import io.pulumi.awsnative.ec2.enums.SpotFleetRequestConfigDataType;
import io.pulumi.awsnative.ec2.inputs.SpotFleetLaunchSpecificationArgs;
import io.pulumi.awsnative.ec2.inputs.SpotFleetLaunchTemplateConfigArgs;
import io.pulumi.awsnative.ec2.inputs.SpotFleetLoadBalancersConfigArgs;
import io.pulumi.awsnative.ec2.inputs.SpotFleetSpotMaintenanceStrategiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotFleetRequestConfigDataArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetRequestConfigDataArgs Empty = new SpotFleetRequestConfigDataArgs();

    @InputImport(name="allocationStrategy")
    private final @Nullable Input<SpotFleetRequestConfigDataAllocationStrategy> allocationStrategy;

    public Input<SpotFleetRequestConfigDataAllocationStrategy> getAllocationStrategy() {
        return this.allocationStrategy == null ? Input.empty() : this.allocationStrategy;
    }

    @InputImport(name="context")
    private final @Nullable Input<String> context;

    public Input<String> getContext() {
        return this.context == null ? Input.empty() : this.context;
    }

    @InputImport(name="excessCapacityTerminationPolicy")
    private final @Nullable Input<SpotFleetRequestConfigDataExcessCapacityTerminationPolicy> excessCapacityTerminationPolicy;

    public Input<SpotFleetRequestConfigDataExcessCapacityTerminationPolicy> getExcessCapacityTerminationPolicy() {
        return this.excessCapacityTerminationPolicy == null ? Input.empty() : this.excessCapacityTerminationPolicy;
    }

    @InputImport(name="iamFleetRole", required=true)
    private final Input<String> iamFleetRole;

    public Input<String> getIamFleetRole() {
        return this.iamFleetRole;
    }

    @InputImport(name="instanceInterruptionBehavior")
    private final @Nullable Input<SpotFleetRequestConfigDataInstanceInterruptionBehavior> instanceInterruptionBehavior;

    public Input<SpotFleetRequestConfigDataInstanceInterruptionBehavior> getInstanceInterruptionBehavior() {
        return this.instanceInterruptionBehavior == null ? Input.empty() : this.instanceInterruptionBehavior;
    }

    @InputImport(name="instancePoolsToUseCount")
    private final @Nullable Input<Integer> instancePoolsToUseCount;

    public Input<Integer> getInstancePoolsToUseCount() {
        return this.instancePoolsToUseCount == null ? Input.empty() : this.instancePoolsToUseCount;
    }

    @InputImport(name="launchSpecifications")
    private final @Nullable Input<List<SpotFleetLaunchSpecificationArgs>> launchSpecifications;

    public Input<List<SpotFleetLaunchSpecificationArgs>> getLaunchSpecifications() {
        return this.launchSpecifications == null ? Input.empty() : this.launchSpecifications;
    }

    @InputImport(name="launchTemplateConfigs")
    private final @Nullable Input<List<SpotFleetLaunchTemplateConfigArgs>> launchTemplateConfigs;

    public Input<List<SpotFleetLaunchTemplateConfigArgs>> getLaunchTemplateConfigs() {
        return this.launchTemplateConfigs == null ? Input.empty() : this.launchTemplateConfigs;
    }

    @InputImport(name="loadBalancersConfig")
    private final @Nullable Input<SpotFleetLoadBalancersConfigArgs> loadBalancersConfig;

    public Input<SpotFleetLoadBalancersConfigArgs> getLoadBalancersConfig() {
        return this.loadBalancersConfig == null ? Input.empty() : this.loadBalancersConfig;
    }

    @InputImport(name="onDemandAllocationStrategy")
    private final @Nullable Input<String> onDemandAllocationStrategy;

    public Input<String> getOnDemandAllocationStrategy() {
        return this.onDemandAllocationStrategy == null ? Input.empty() : this.onDemandAllocationStrategy;
    }

    @InputImport(name="onDemandMaxTotalPrice")
    private final @Nullable Input<String> onDemandMaxTotalPrice;

    public Input<String> getOnDemandMaxTotalPrice() {
        return this.onDemandMaxTotalPrice == null ? Input.empty() : this.onDemandMaxTotalPrice;
    }

    @InputImport(name="onDemandTargetCapacity")
    private final @Nullable Input<Integer> onDemandTargetCapacity;

    public Input<Integer> getOnDemandTargetCapacity() {
        return this.onDemandTargetCapacity == null ? Input.empty() : this.onDemandTargetCapacity;
    }

    @InputImport(name="replaceUnhealthyInstances")
    private final @Nullable Input<Boolean> replaceUnhealthyInstances;

    public Input<Boolean> getReplaceUnhealthyInstances() {
        return this.replaceUnhealthyInstances == null ? Input.empty() : this.replaceUnhealthyInstances;
    }

    @InputImport(name="spotMaintenanceStrategies")
    private final @Nullable Input<SpotFleetSpotMaintenanceStrategiesArgs> spotMaintenanceStrategies;

    public Input<SpotFleetSpotMaintenanceStrategiesArgs> getSpotMaintenanceStrategies() {
        return this.spotMaintenanceStrategies == null ? Input.empty() : this.spotMaintenanceStrategies;
    }

    @InputImport(name="spotMaxTotalPrice")
    private final @Nullable Input<String> spotMaxTotalPrice;

    public Input<String> getSpotMaxTotalPrice() {
        return this.spotMaxTotalPrice == null ? Input.empty() : this.spotMaxTotalPrice;
    }

    @InputImport(name="spotPrice")
    private final @Nullable Input<String> spotPrice;

    public Input<String> getSpotPrice() {
        return this.spotPrice == null ? Input.empty() : this.spotPrice;
    }

    @InputImport(name="targetCapacity", required=true)
    private final Input<Integer> targetCapacity;

    public Input<Integer> getTargetCapacity() {
        return this.targetCapacity;
    }

    @InputImport(name="targetCapacityUnitType")
    private final @Nullable Input<SpotFleetRequestConfigDataTargetCapacityUnitType> targetCapacityUnitType;

    public Input<SpotFleetRequestConfigDataTargetCapacityUnitType> getTargetCapacityUnitType() {
        return this.targetCapacityUnitType == null ? Input.empty() : this.targetCapacityUnitType;
    }

    @InputImport(name="terminateInstancesWithExpiration")
    private final @Nullable Input<Boolean> terminateInstancesWithExpiration;

    public Input<Boolean> getTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration == null ? Input.empty() : this.terminateInstancesWithExpiration;
    }

    @InputImport(name="type")
    private final @Nullable Input<SpotFleetRequestConfigDataType> type;

    public Input<SpotFleetRequestConfigDataType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    @InputImport(name="validFrom")
    private final @Nullable Input<String> validFrom;

    public Input<String> getValidFrom() {
        return this.validFrom == null ? Input.empty() : this.validFrom;
    }

    @InputImport(name="validUntil")
    private final @Nullable Input<String> validUntil;

    public Input<String> getValidUntil() {
        return this.validUntil == null ? Input.empty() : this.validUntil;
    }

    public SpotFleetRequestConfigDataArgs(
        @Nullable Input<SpotFleetRequestConfigDataAllocationStrategy> allocationStrategy,
        @Nullable Input<String> context,
        @Nullable Input<SpotFleetRequestConfigDataExcessCapacityTerminationPolicy> excessCapacityTerminationPolicy,
        Input<String> iamFleetRole,
        @Nullable Input<SpotFleetRequestConfigDataInstanceInterruptionBehavior> instanceInterruptionBehavior,
        @Nullable Input<Integer> instancePoolsToUseCount,
        @Nullable Input<List<SpotFleetLaunchSpecificationArgs>> launchSpecifications,
        @Nullable Input<List<SpotFleetLaunchTemplateConfigArgs>> launchTemplateConfigs,
        @Nullable Input<SpotFleetLoadBalancersConfigArgs> loadBalancersConfig,
        @Nullable Input<String> onDemandAllocationStrategy,
        @Nullable Input<String> onDemandMaxTotalPrice,
        @Nullable Input<Integer> onDemandTargetCapacity,
        @Nullable Input<Boolean> replaceUnhealthyInstances,
        @Nullable Input<SpotFleetSpotMaintenanceStrategiesArgs> spotMaintenanceStrategies,
        @Nullable Input<String> spotMaxTotalPrice,
        @Nullable Input<String> spotPrice,
        Input<Integer> targetCapacity,
        @Nullable Input<SpotFleetRequestConfigDataTargetCapacityUnitType> targetCapacityUnitType,
        @Nullable Input<Boolean> terminateInstancesWithExpiration,
        @Nullable Input<SpotFleetRequestConfigDataType> type,
        @Nullable Input<String> validFrom,
        @Nullable Input<String> validUntil) {
        this.allocationStrategy = allocationStrategy;
        this.context = context;
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
        this.iamFleetRole = Objects.requireNonNull(iamFleetRole, "expected parameter 'iamFleetRole' to be non-null");
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
        this.instancePoolsToUseCount = instancePoolsToUseCount;
        this.launchSpecifications = launchSpecifications;
        this.launchTemplateConfigs = launchTemplateConfigs;
        this.loadBalancersConfig = loadBalancersConfig;
        this.onDemandAllocationStrategy = onDemandAllocationStrategy;
        this.onDemandMaxTotalPrice = onDemandMaxTotalPrice;
        this.onDemandTargetCapacity = onDemandTargetCapacity;
        this.replaceUnhealthyInstances = replaceUnhealthyInstances;
        this.spotMaintenanceStrategies = spotMaintenanceStrategies;
        this.spotMaxTotalPrice = spotMaxTotalPrice;
        this.spotPrice = spotPrice;
        this.targetCapacity = Objects.requireNonNull(targetCapacity, "expected parameter 'targetCapacity' to be non-null");
        this.targetCapacityUnitType = targetCapacityUnitType;
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
        this.type = type;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
    }

    private SpotFleetRequestConfigDataArgs() {
        this.allocationStrategy = Input.empty();
        this.context = Input.empty();
        this.excessCapacityTerminationPolicy = Input.empty();
        this.iamFleetRole = Input.empty();
        this.instanceInterruptionBehavior = Input.empty();
        this.instancePoolsToUseCount = Input.empty();
        this.launchSpecifications = Input.empty();
        this.launchTemplateConfigs = Input.empty();
        this.loadBalancersConfig = Input.empty();
        this.onDemandAllocationStrategy = Input.empty();
        this.onDemandMaxTotalPrice = Input.empty();
        this.onDemandTargetCapacity = Input.empty();
        this.replaceUnhealthyInstances = Input.empty();
        this.spotMaintenanceStrategies = Input.empty();
        this.spotMaxTotalPrice = Input.empty();
        this.spotPrice = Input.empty();
        this.targetCapacity = Input.empty();
        this.targetCapacityUnitType = Input.empty();
        this.terminateInstancesWithExpiration = Input.empty();
        this.type = Input.empty();
        this.validFrom = Input.empty();
        this.validUntil = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetRequestConfigDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SpotFleetRequestConfigDataAllocationStrategy> allocationStrategy;
        private @Nullable Input<String> context;
        private @Nullable Input<SpotFleetRequestConfigDataExcessCapacityTerminationPolicy> excessCapacityTerminationPolicy;
        private Input<String> iamFleetRole;
        private @Nullable Input<SpotFleetRequestConfigDataInstanceInterruptionBehavior> instanceInterruptionBehavior;
        private @Nullable Input<Integer> instancePoolsToUseCount;
        private @Nullable Input<List<SpotFleetLaunchSpecificationArgs>> launchSpecifications;
        private @Nullable Input<List<SpotFleetLaunchTemplateConfigArgs>> launchTemplateConfigs;
        private @Nullable Input<SpotFleetLoadBalancersConfigArgs> loadBalancersConfig;
        private @Nullable Input<String> onDemandAllocationStrategy;
        private @Nullable Input<String> onDemandMaxTotalPrice;
        private @Nullable Input<Integer> onDemandTargetCapacity;
        private @Nullable Input<Boolean> replaceUnhealthyInstances;
        private @Nullable Input<SpotFleetSpotMaintenanceStrategiesArgs> spotMaintenanceStrategies;
        private @Nullable Input<String> spotMaxTotalPrice;
        private @Nullable Input<String> spotPrice;
        private Input<Integer> targetCapacity;
        private @Nullable Input<SpotFleetRequestConfigDataTargetCapacityUnitType> targetCapacityUnitType;
        private @Nullable Input<Boolean> terminateInstancesWithExpiration;
        private @Nullable Input<SpotFleetRequestConfigDataType> type;
        private @Nullable Input<String> validFrom;
        private @Nullable Input<String> validUntil;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetRequestConfigDataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationStrategy = defaults.allocationStrategy;
    	      this.context = defaults.context;
    	      this.excessCapacityTerminationPolicy = defaults.excessCapacityTerminationPolicy;
    	      this.iamFleetRole = defaults.iamFleetRole;
    	      this.instanceInterruptionBehavior = defaults.instanceInterruptionBehavior;
    	      this.instancePoolsToUseCount = defaults.instancePoolsToUseCount;
    	      this.launchSpecifications = defaults.launchSpecifications;
    	      this.launchTemplateConfigs = defaults.launchTemplateConfigs;
    	      this.loadBalancersConfig = defaults.loadBalancersConfig;
    	      this.onDemandAllocationStrategy = defaults.onDemandAllocationStrategy;
    	      this.onDemandMaxTotalPrice = defaults.onDemandMaxTotalPrice;
    	      this.onDemandTargetCapacity = defaults.onDemandTargetCapacity;
    	      this.replaceUnhealthyInstances = defaults.replaceUnhealthyInstances;
    	      this.spotMaintenanceStrategies = defaults.spotMaintenanceStrategies;
    	      this.spotMaxTotalPrice = defaults.spotMaxTotalPrice;
    	      this.spotPrice = defaults.spotPrice;
    	      this.targetCapacity = defaults.targetCapacity;
    	      this.targetCapacityUnitType = defaults.targetCapacityUnitType;
    	      this.terminateInstancesWithExpiration = defaults.terminateInstancesWithExpiration;
    	      this.type = defaults.type;
    	      this.validFrom = defaults.validFrom;
    	      this.validUntil = defaults.validUntil;
        }

        public Builder setAllocationStrategy(@Nullable Input<SpotFleetRequestConfigDataAllocationStrategy> allocationStrategy) {
            this.allocationStrategy = allocationStrategy;
            return this;
        }

        public Builder setAllocationStrategy(@Nullable SpotFleetRequestConfigDataAllocationStrategy allocationStrategy) {
            this.allocationStrategy = Input.ofNullable(allocationStrategy);
            return this;
        }

        public Builder setContext(@Nullable Input<String> context) {
            this.context = context;
            return this;
        }

        public Builder setContext(@Nullable String context) {
            this.context = Input.ofNullable(context);
            return this;
        }

        public Builder setExcessCapacityTerminationPolicy(@Nullable Input<SpotFleetRequestConfigDataExcessCapacityTerminationPolicy> excessCapacityTerminationPolicy) {
            this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
            return this;
        }

        public Builder setExcessCapacityTerminationPolicy(@Nullable SpotFleetRequestConfigDataExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
            this.excessCapacityTerminationPolicy = Input.ofNullable(excessCapacityTerminationPolicy);
            return this;
        }

        public Builder setIamFleetRole(Input<String> iamFleetRole) {
            this.iamFleetRole = Objects.requireNonNull(iamFleetRole);
            return this;
        }

        public Builder setIamFleetRole(String iamFleetRole) {
            this.iamFleetRole = Input.of(Objects.requireNonNull(iamFleetRole));
            return this;
        }

        public Builder setInstanceInterruptionBehavior(@Nullable Input<SpotFleetRequestConfigDataInstanceInterruptionBehavior> instanceInterruptionBehavior) {
            this.instanceInterruptionBehavior = instanceInterruptionBehavior;
            return this;
        }

        public Builder setInstanceInterruptionBehavior(@Nullable SpotFleetRequestConfigDataInstanceInterruptionBehavior instanceInterruptionBehavior) {
            this.instanceInterruptionBehavior = Input.ofNullable(instanceInterruptionBehavior);
            return this;
        }

        public Builder setInstancePoolsToUseCount(@Nullable Input<Integer> instancePoolsToUseCount) {
            this.instancePoolsToUseCount = instancePoolsToUseCount;
            return this;
        }

        public Builder setInstancePoolsToUseCount(@Nullable Integer instancePoolsToUseCount) {
            this.instancePoolsToUseCount = Input.ofNullable(instancePoolsToUseCount);
            return this;
        }

        public Builder setLaunchSpecifications(@Nullable Input<List<SpotFleetLaunchSpecificationArgs>> launchSpecifications) {
            this.launchSpecifications = launchSpecifications;
            return this;
        }

        public Builder setLaunchSpecifications(@Nullable List<SpotFleetLaunchSpecificationArgs> launchSpecifications) {
            this.launchSpecifications = Input.ofNullable(launchSpecifications);
            return this;
        }

        public Builder setLaunchTemplateConfigs(@Nullable Input<List<SpotFleetLaunchTemplateConfigArgs>> launchTemplateConfigs) {
            this.launchTemplateConfigs = launchTemplateConfigs;
            return this;
        }

        public Builder setLaunchTemplateConfigs(@Nullable List<SpotFleetLaunchTemplateConfigArgs> launchTemplateConfigs) {
            this.launchTemplateConfigs = Input.ofNullable(launchTemplateConfigs);
            return this;
        }

        public Builder setLoadBalancersConfig(@Nullable Input<SpotFleetLoadBalancersConfigArgs> loadBalancersConfig) {
            this.loadBalancersConfig = loadBalancersConfig;
            return this;
        }

        public Builder setLoadBalancersConfig(@Nullable SpotFleetLoadBalancersConfigArgs loadBalancersConfig) {
            this.loadBalancersConfig = Input.ofNullable(loadBalancersConfig);
            return this;
        }

        public Builder setOnDemandAllocationStrategy(@Nullable Input<String> onDemandAllocationStrategy) {
            this.onDemandAllocationStrategy = onDemandAllocationStrategy;
            return this;
        }

        public Builder setOnDemandAllocationStrategy(@Nullable String onDemandAllocationStrategy) {
            this.onDemandAllocationStrategy = Input.ofNullable(onDemandAllocationStrategy);
            return this;
        }

        public Builder setOnDemandMaxTotalPrice(@Nullable Input<String> onDemandMaxTotalPrice) {
            this.onDemandMaxTotalPrice = onDemandMaxTotalPrice;
            return this;
        }

        public Builder setOnDemandMaxTotalPrice(@Nullable String onDemandMaxTotalPrice) {
            this.onDemandMaxTotalPrice = Input.ofNullable(onDemandMaxTotalPrice);
            return this;
        }

        public Builder setOnDemandTargetCapacity(@Nullable Input<Integer> onDemandTargetCapacity) {
            this.onDemandTargetCapacity = onDemandTargetCapacity;
            return this;
        }

        public Builder setOnDemandTargetCapacity(@Nullable Integer onDemandTargetCapacity) {
            this.onDemandTargetCapacity = Input.ofNullable(onDemandTargetCapacity);
            return this;
        }

        public Builder setReplaceUnhealthyInstances(@Nullable Input<Boolean> replaceUnhealthyInstances) {
            this.replaceUnhealthyInstances = replaceUnhealthyInstances;
            return this;
        }

        public Builder setReplaceUnhealthyInstances(@Nullable Boolean replaceUnhealthyInstances) {
            this.replaceUnhealthyInstances = Input.ofNullable(replaceUnhealthyInstances);
            return this;
        }

        public Builder setSpotMaintenanceStrategies(@Nullable Input<SpotFleetSpotMaintenanceStrategiesArgs> spotMaintenanceStrategies) {
            this.spotMaintenanceStrategies = spotMaintenanceStrategies;
            return this;
        }

        public Builder setSpotMaintenanceStrategies(@Nullable SpotFleetSpotMaintenanceStrategiesArgs spotMaintenanceStrategies) {
            this.spotMaintenanceStrategies = Input.ofNullable(spotMaintenanceStrategies);
            return this;
        }

        public Builder setSpotMaxTotalPrice(@Nullable Input<String> spotMaxTotalPrice) {
            this.spotMaxTotalPrice = spotMaxTotalPrice;
            return this;
        }

        public Builder setSpotMaxTotalPrice(@Nullable String spotMaxTotalPrice) {
            this.spotMaxTotalPrice = Input.ofNullable(spotMaxTotalPrice);
            return this;
        }

        public Builder setSpotPrice(@Nullable Input<String> spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }

        public Builder setSpotPrice(@Nullable String spotPrice) {
            this.spotPrice = Input.ofNullable(spotPrice);
            return this;
        }

        public Builder setTargetCapacity(Input<Integer> targetCapacity) {
            this.targetCapacity = Objects.requireNonNull(targetCapacity);
            return this;
        }

        public Builder setTargetCapacity(Integer targetCapacity) {
            this.targetCapacity = Input.of(Objects.requireNonNull(targetCapacity));
            return this;
        }

        public Builder setTargetCapacityUnitType(@Nullable Input<SpotFleetRequestConfigDataTargetCapacityUnitType> targetCapacityUnitType) {
            this.targetCapacityUnitType = targetCapacityUnitType;
            return this;
        }

        public Builder setTargetCapacityUnitType(@Nullable SpotFleetRequestConfigDataTargetCapacityUnitType targetCapacityUnitType) {
            this.targetCapacityUnitType = Input.ofNullable(targetCapacityUnitType);
            return this;
        }

        public Builder setTerminateInstancesWithExpiration(@Nullable Input<Boolean> terminateInstancesWithExpiration) {
            this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
            return this;
        }

        public Builder setTerminateInstancesWithExpiration(@Nullable Boolean terminateInstancesWithExpiration) {
            this.terminateInstancesWithExpiration = Input.ofNullable(terminateInstancesWithExpiration);
            return this;
        }

        public Builder setType(@Nullable Input<SpotFleetRequestConfigDataType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable SpotFleetRequestConfigDataType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setValidFrom(@Nullable Input<String> validFrom) {
            this.validFrom = validFrom;
            return this;
        }

        public Builder setValidFrom(@Nullable String validFrom) {
            this.validFrom = Input.ofNullable(validFrom);
            return this;
        }

        public Builder setValidUntil(@Nullable Input<String> validUntil) {
            this.validUntil = validUntil;
            return this;
        }

        public Builder setValidUntil(@Nullable String validUntil) {
            this.validUntil = Input.ofNullable(validUntil);
            return this;
        }

        public SpotFleetRequestConfigDataArgs build() {
            return new SpotFleetRequestConfigDataArgs(allocationStrategy, context, excessCapacityTerminationPolicy, iamFleetRole, instanceInterruptionBehavior, instancePoolsToUseCount, launchSpecifications, launchTemplateConfigs, loadBalancersConfig, onDemandAllocationStrategy, onDemandMaxTotalPrice, onDemandTargetCapacity, replaceUnhealthyInstances, spotMaintenanceStrategies, spotMaxTotalPrice, spotPrice, targetCapacity, targetCapacityUnitType, terminateInstancesWithExpiration, type, validFrom, validUntil);
        }
    }
}
