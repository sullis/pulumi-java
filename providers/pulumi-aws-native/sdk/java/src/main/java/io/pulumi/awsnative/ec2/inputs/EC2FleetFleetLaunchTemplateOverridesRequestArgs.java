// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.inputs.EC2FleetInstanceRequirementsRequestArgs;
import io.pulumi.awsnative.ec2.inputs.EC2FleetPlacementArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EC2FleetFleetLaunchTemplateOverridesRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final EC2FleetFleetLaunchTemplateOverridesRequestArgs Empty = new EC2FleetFleetLaunchTemplateOverridesRequestArgs();

    @InputImport(name="availabilityZone")
    private final @Nullable Input<String> availabilityZone;

    public Input<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Input.empty() : this.availabilityZone;
    }

    @InputImport(name="instanceRequirements")
    private final @Nullable Input<EC2FleetInstanceRequirementsRequestArgs> instanceRequirements;

    public Input<EC2FleetInstanceRequirementsRequestArgs> getInstanceRequirements() {
        return this.instanceRequirements == null ? Input.empty() : this.instanceRequirements;
    }

    @InputImport(name="instanceType")
    private final @Nullable Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType == null ? Input.empty() : this.instanceType;
    }

    @InputImport(name="maxPrice")
    private final @Nullable Input<String> maxPrice;

    public Input<String> getMaxPrice() {
        return this.maxPrice == null ? Input.empty() : this.maxPrice;
    }

    @InputImport(name="placement")
    private final @Nullable Input<EC2FleetPlacementArgs> placement;

    public Input<EC2FleetPlacementArgs> getPlacement() {
        return this.placement == null ? Input.empty() : this.placement;
    }

    @InputImport(name="priority")
    private final @Nullable Input<Double> priority;

    public Input<Double> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    @InputImport(name="subnetId")
    private final @Nullable Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId == null ? Input.empty() : this.subnetId;
    }

    @InputImport(name="weightedCapacity")
    private final @Nullable Input<Double> weightedCapacity;

    public Input<Double> getWeightedCapacity() {
        return this.weightedCapacity == null ? Input.empty() : this.weightedCapacity;
    }

    public EC2FleetFleetLaunchTemplateOverridesRequestArgs(
        @Nullable Input<String> availabilityZone,
        @Nullable Input<EC2FleetInstanceRequirementsRequestArgs> instanceRequirements,
        @Nullable Input<String> instanceType,
        @Nullable Input<String> maxPrice,
        @Nullable Input<EC2FleetPlacementArgs> placement,
        @Nullable Input<Double> priority,
        @Nullable Input<String> subnetId,
        @Nullable Input<Double> weightedCapacity) {
        this.availabilityZone = availabilityZone;
        this.instanceRequirements = instanceRequirements;
        this.instanceType = instanceType;
        this.maxPrice = maxPrice;
        this.placement = placement;
        this.priority = priority;
        this.subnetId = subnetId;
        this.weightedCapacity = weightedCapacity;
    }

    private EC2FleetFleetLaunchTemplateOverridesRequestArgs() {
        this.availabilityZone = Input.empty();
        this.instanceRequirements = Input.empty();
        this.instanceType = Input.empty();
        this.maxPrice = Input.empty();
        this.placement = Input.empty();
        this.priority = Input.empty();
        this.subnetId = Input.empty();
        this.weightedCapacity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetFleetLaunchTemplateOverridesRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> availabilityZone;
        private @Nullable Input<EC2FleetInstanceRequirementsRequestArgs> instanceRequirements;
        private @Nullable Input<String> instanceType;
        private @Nullable Input<String> maxPrice;
        private @Nullable Input<EC2FleetPlacementArgs> placement;
        private @Nullable Input<Double> priority;
        private @Nullable Input<String> subnetId;
        private @Nullable Input<Double> weightedCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetFleetLaunchTemplateOverridesRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.instanceRequirements = defaults.instanceRequirements;
    	      this.instanceType = defaults.instanceType;
    	      this.maxPrice = defaults.maxPrice;
    	      this.placement = defaults.placement;
    	      this.priority = defaults.priority;
    	      this.subnetId = defaults.subnetId;
    	      this.weightedCapacity = defaults.weightedCapacity;
        }

        public Builder setAvailabilityZone(@Nullable Input<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder setAvailabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Input.ofNullable(availabilityZone);
            return this;
        }

        public Builder setInstanceRequirements(@Nullable Input<EC2FleetInstanceRequirementsRequestArgs> instanceRequirements) {
            this.instanceRequirements = instanceRequirements;
            return this;
        }

        public Builder setInstanceRequirements(@Nullable EC2FleetInstanceRequirementsRequestArgs instanceRequirements) {
            this.instanceRequirements = Input.ofNullable(instanceRequirements);
            return this;
        }

        public Builder setInstanceType(@Nullable Input<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder setInstanceType(@Nullable String instanceType) {
            this.instanceType = Input.ofNullable(instanceType);
            return this;
        }

        public Builder setMaxPrice(@Nullable Input<String> maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }

        public Builder setMaxPrice(@Nullable String maxPrice) {
            this.maxPrice = Input.ofNullable(maxPrice);
            return this;
        }

        public Builder setPlacement(@Nullable Input<EC2FleetPlacementArgs> placement) {
            this.placement = placement;
            return this;
        }

        public Builder setPlacement(@Nullable EC2FleetPlacementArgs placement) {
            this.placement = Input.ofNullable(placement);
            return this;
        }

        public Builder setPriority(@Nullable Input<Double> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Double priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setSubnetId(@Nullable Input<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = Input.ofNullable(subnetId);
            return this;
        }

        public Builder setWeightedCapacity(@Nullable Input<Double> weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }

        public Builder setWeightedCapacity(@Nullable Double weightedCapacity) {
            this.weightedCapacity = Input.ofNullable(weightedCapacity);
            return this;
        }

        public EC2FleetFleetLaunchTemplateOverridesRequestArgs build() {
            return new EC2FleetFleetLaunchTemplateOverridesRequestArgs(availabilityZone, instanceRequirements, instanceType, maxPrice, placement, priority, subnetId, weightedCapacity);
        }
    }
}
