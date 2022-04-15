// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.outputs.SpotFleetInstanceRequirementsRequest;
import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpotFleetLaunchTemplateOverrides {
    private final @Nullable String availabilityZone;
    private final @Nullable SpotFleetInstanceRequirementsRequest instanceRequirements;
    private final @Nullable String instanceType;
    private final @Nullable String spotPrice;
    private final @Nullable String subnetId;
    private final @Nullable Double weightedCapacity;

    @CustomType.Constructor
    private SpotFleetLaunchTemplateOverrides(
        @CustomType.Parameter("availabilityZone") @Nullable String availabilityZone,
        @CustomType.Parameter("instanceRequirements") @Nullable SpotFleetInstanceRequirementsRequest instanceRequirements,
        @CustomType.Parameter("instanceType") @Nullable String instanceType,
        @CustomType.Parameter("spotPrice") @Nullable String spotPrice,
        @CustomType.Parameter("subnetId") @Nullable String subnetId,
        @CustomType.Parameter("weightedCapacity") @Nullable Double weightedCapacity) {
        this.availabilityZone = availabilityZone;
        this.instanceRequirements = instanceRequirements;
        this.instanceType = instanceType;
        this.spotPrice = spotPrice;
        this.subnetId = subnetId;
        this.weightedCapacity = weightedCapacity;
    }

    public Optional<String> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }
    public Optional<SpotFleetInstanceRequirementsRequest> instanceRequirements() {
        return Optional.ofNullable(this.instanceRequirements);
    }
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    public Optional<String> spotPrice() {
        return Optional.ofNullable(this.spotPrice);
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

        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public Builder instanceRequirements(@Nullable SpotFleetInstanceRequirementsRequest instanceRequirements) {
            this.instanceRequirements = instanceRequirements;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder spotPrice(@Nullable String spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public Builder weightedCapacity(@Nullable Double weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }        public SpotFleetLaunchTemplateOverrides build() {
            return new SpotFleetLaunchTemplateOverrides(availabilityZone, instanceRequirements, instanceType, spotPrice, subnetId, weightedCapacity);
        }
    }
}
