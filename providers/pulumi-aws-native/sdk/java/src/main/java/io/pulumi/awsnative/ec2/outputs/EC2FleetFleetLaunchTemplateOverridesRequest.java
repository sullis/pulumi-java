// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.outputs.EC2FleetInstanceRequirementsRequest;
import io.pulumi.awsnative.ec2.outputs.EC2FleetPlacement;
import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EC2FleetFleetLaunchTemplateOverridesRequest {
    private final @Nullable String availabilityZone;
    private final @Nullable EC2FleetInstanceRequirementsRequest instanceRequirements;
    private final @Nullable String instanceType;
    private final @Nullable String maxPrice;
    private final @Nullable EC2FleetPlacement placement;
    private final @Nullable Double priority;
    private final @Nullable String subnetId;
    private final @Nullable Double weightedCapacity;

    @CustomType.Constructor
    private EC2FleetFleetLaunchTemplateOverridesRequest(
        @CustomType.Parameter("availabilityZone") @Nullable String availabilityZone,
        @CustomType.Parameter("instanceRequirements") @Nullable EC2FleetInstanceRequirementsRequest instanceRequirements,
        @CustomType.Parameter("instanceType") @Nullable String instanceType,
        @CustomType.Parameter("maxPrice") @Nullable String maxPrice,
        @CustomType.Parameter("placement") @Nullable EC2FleetPlacement placement,
        @CustomType.Parameter("priority") @Nullable Double priority,
        @CustomType.Parameter("subnetId") @Nullable String subnetId,
        @CustomType.Parameter("weightedCapacity") @Nullable Double weightedCapacity) {
        this.availabilityZone = availabilityZone;
        this.instanceRequirements = instanceRequirements;
        this.instanceType = instanceType;
        this.maxPrice = maxPrice;
        this.placement = placement;
        this.priority = priority;
        this.subnetId = subnetId;
        this.weightedCapacity = weightedCapacity;
    }

    public Optional<String> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }
    public Optional<EC2FleetInstanceRequirementsRequest> instanceRequirements() {
        return Optional.ofNullable(this.instanceRequirements);
    }
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    public Optional<String> maxPrice() {
        return Optional.ofNullable(this.maxPrice);
    }
    public Optional<EC2FleetPlacement> placement() {
        return Optional.ofNullable(this.placement);
    }
    public Optional<Double> priority() {
        return Optional.ofNullable(this.priority);
    }
    public Optional<String> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }
    public Optional<Double> weightedCapacity() {
        return Optional.ofNullable(this.weightedCapacity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetFleetLaunchTemplateOverridesRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String availabilityZone;
        private @Nullable EC2FleetInstanceRequirementsRequest instanceRequirements;
        private @Nullable String instanceType;
        private @Nullable String maxPrice;
        private @Nullable EC2FleetPlacement placement;
        private @Nullable Double priority;
        private @Nullable String subnetId;
        private @Nullable Double weightedCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetFleetLaunchTemplateOverridesRequest defaults) {
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

        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public Builder instanceRequirements(@Nullable EC2FleetInstanceRequirementsRequest instanceRequirements) {
            this.instanceRequirements = instanceRequirements;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder maxPrice(@Nullable String maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Builder placement(@Nullable EC2FleetPlacement placement) {
            this.placement = placement;
            return this;
        }
        public Builder priority(@Nullable Double priority) {
            this.priority = priority;
            return this;
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public Builder weightedCapacity(@Nullable Double weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }        public EC2FleetFleetLaunchTemplateOverridesRequest build() {
            return new EC2FleetFleetLaunchTemplateOverridesRequest(availabilityZone, instanceRequirements, instanceType, maxPrice, placement, priority, subnetId, weightedCapacity);
        }
    }
}
