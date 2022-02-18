// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.inputs.SpotFleetInstanceRequirementsRequest;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotFleetLaunchTemplateOverrides extends io.pulumi.resources.InvokeArgs {

    public static final SpotFleetLaunchTemplateOverrides Empty = new SpotFleetLaunchTemplateOverrides();

    @InputImport(name="availabilityZone")
    private final @Nullable String availabilityZone;

    public Optional<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Optional.empty() : Optional.ofNullable(this.availabilityZone);
    }

    @InputImport(name="instanceRequirements")
    private final @Nullable SpotFleetInstanceRequirementsRequest instanceRequirements;

    public Optional<SpotFleetInstanceRequirementsRequest> getInstanceRequirements() {
        return this.instanceRequirements == null ? Optional.empty() : Optional.ofNullable(this.instanceRequirements);
    }

    @InputImport(name="instanceType")
    private final @Nullable String instanceType;

    public Optional<String> getInstanceType() {
        return this.instanceType == null ? Optional.empty() : Optional.ofNullable(this.instanceType);
    }

    @InputImport(name="spotPrice")
    private final @Nullable String spotPrice;

    public Optional<String> getSpotPrice() {
        return this.spotPrice == null ? Optional.empty() : Optional.ofNullable(this.spotPrice);
    }

    @InputImport(name="subnetId")
    private final @Nullable String subnetId;

    public Optional<String> getSubnetId() {
        return this.subnetId == null ? Optional.empty() : Optional.ofNullable(this.subnetId);
    }

    @InputImport(name="weightedCapacity")
    private final @Nullable Double weightedCapacity;

    public Optional<Double> getWeightedCapacity() {
        return this.weightedCapacity == null ? Optional.empty() : Optional.ofNullable(this.weightedCapacity);
    }

    public SpotFleetLaunchTemplateOverrides(
        @Nullable String availabilityZone,
        @Nullable SpotFleetInstanceRequirementsRequest instanceRequirements,
        @Nullable String instanceType,
        @Nullable String spotPrice,
        @Nullable String subnetId,
        @Nullable Double weightedCapacity) {
        this.availabilityZone = availabilityZone;
        this.instanceRequirements = instanceRequirements;
        this.instanceType = instanceType;
        this.spotPrice = spotPrice;
        this.subnetId = subnetId;
        this.weightedCapacity = weightedCapacity;
    }

    private SpotFleetLaunchTemplateOverrides() {
        this.availabilityZone = null;
        this.instanceRequirements = null;
        this.instanceType = null;
        this.spotPrice = null;
        this.subnetId = null;
        this.weightedCapacity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetLaunchTemplateOverrides defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String availabilityZone;
        private @Nullable SpotFleetInstanceRequirementsRequest instanceRequirements;
        private @Nullable String instanceType;
        private @Nullable String spotPrice;
        private @Nullable String subnetId;
        private @Nullable Double weightedCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetLaunchTemplateOverrides defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.instanceRequirements = defaults.instanceRequirements;
    	      this.instanceType = defaults.instanceType;
    	      this.spotPrice = defaults.spotPrice;
    	      this.subnetId = defaults.subnetId;
    	      this.weightedCapacity = defaults.weightedCapacity;
        }

        public Builder setAvailabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder setInstanceRequirements(@Nullable SpotFleetInstanceRequirementsRequest instanceRequirements) {
            this.instanceRequirements = instanceRequirements;
            return this;
        }

        public Builder setInstanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder setSpotPrice(@Nullable String spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder setWeightedCapacity(@Nullable Double weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }

        public SpotFleetLaunchTemplateOverrides build() {
            return new SpotFleetLaunchTemplateOverrides(availabilityZone, instanceRequirements, instanceType, spotPrice, subnetId, weightedCapacity);
        }
    }
}
