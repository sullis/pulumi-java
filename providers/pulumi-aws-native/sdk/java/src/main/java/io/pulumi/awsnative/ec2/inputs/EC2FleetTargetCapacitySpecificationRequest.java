// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.enums.EC2FleetTargetCapacitySpecificationRequestDefaultTargetCapacityType;
import io.pulumi.awsnative.ec2.enums.EC2FleetTargetCapacitySpecificationRequestTargetCapacityUnitType;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EC2FleetTargetCapacitySpecificationRequest extends io.pulumi.resources.InvokeArgs {

    public static final EC2FleetTargetCapacitySpecificationRequest Empty = new EC2FleetTargetCapacitySpecificationRequest();

    @InputImport(name="defaultTargetCapacityType")
    private final @Nullable EC2FleetTargetCapacitySpecificationRequestDefaultTargetCapacityType defaultTargetCapacityType;

    public Optional<EC2FleetTargetCapacitySpecificationRequestDefaultTargetCapacityType> getDefaultTargetCapacityType() {
        return this.defaultTargetCapacityType == null ? Optional.empty() : Optional.ofNullable(this.defaultTargetCapacityType);
    }

    @InputImport(name="onDemandTargetCapacity")
    private final @Nullable Integer onDemandTargetCapacity;

    public Optional<Integer> getOnDemandTargetCapacity() {
        return this.onDemandTargetCapacity == null ? Optional.empty() : Optional.ofNullable(this.onDemandTargetCapacity);
    }

    @InputImport(name="spotTargetCapacity")
    private final @Nullable Integer spotTargetCapacity;

    public Optional<Integer> getSpotTargetCapacity() {
        return this.spotTargetCapacity == null ? Optional.empty() : Optional.ofNullable(this.spotTargetCapacity);
    }

    @InputImport(name="targetCapacityUnitType")
    private final @Nullable EC2FleetTargetCapacitySpecificationRequestTargetCapacityUnitType targetCapacityUnitType;

    public Optional<EC2FleetTargetCapacitySpecificationRequestTargetCapacityUnitType> getTargetCapacityUnitType() {
        return this.targetCapacityUnitType == null ? Optional.empty() : Optional.ofNullable(this.targetCapacityUnitType);
    }

    @InputImport(name="totalTargetCapacity", required=true)
    private final Integer totalTargetCapacity;

    public Integer getTotalTargetCapacity() {
        return this.totalTargetCapacity;
    }

    public EC2FleetTargetCapacitySpecificationRequest(
        @Nullable EC2FleetTargetCapacitySpecificationRequestDefaultTargetCapacityType defaultTargetCapacityType,
        @Nullable Integer onDemandTargetCapacity,
        @Nullable Integer spotTargetCapacity,
        @Nullable EC2FleetTargetCapacitySpecificationRequestTargetCapacityUnitType targetCapacityUnitType,
        Integer totalTargetCapacity) {
        this.defaultTargetCapacityType = defaultTargetCapacityType;
        this.onDemandTargetCapacity = onDemandTargetCapacity;
        this.spotTargetCapacity = spotTargetCapacity;
        this.targetCapacityUnitType = targetCapacityUnitType;
        this.totalTargetCapacity = Objects.requireNonNull(totalTargetCapacity, "expected parameter 'totalTargetCapacity' to be non-null");
    }

    private EC2FleetTargetCapacitySpecificationRequest() {
        this.defaultTargetCapacityType = null;
        this.onDemandTargetCapacity = null;
        this.spotTargetCapacity = null;
        this.targetCapacityUnitType = null;
        this.totalTargetCapacity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetTargetCapacitySpecificationRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EC2FleetTargetCapacitySpecificationRequestDefaultTargetCapacityType defaultTargetCapacityType;
        private @Nullable Integer onDemandTargetCapacity;
        private @Nullable Integer spotTargetCapacity;
        private @Nullable EC2FleetTargetCapacitySpecificationRequestTargetCapacityUnitType targetCapacityUnitType;
        private Integer totalTargetCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetTargetCapacitySpecificationRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultTargetCapacityType = defaults.defaultTargetCapacityType;
    	      this.onDemandTargetCapacity = defaults.onDemandTargetCapacity;
    	      this.spotTargetCapacity = defaults.spotTargetCapacity;
    	      this.targetCapacityUnitType = defaults.targetCapacityUnitType;
    	      this.totalTargetCapacity = defaults.totalTargetCapacity;
        }

        public Builder setDefaultTargetCapacityType(@Nullable EC2FleetTargetCapacitySpecificationRequestDefaultTargetCapacityType defaultTargetCapacityType) {
            this.defaultTargetCapacityType = defaultTargetCapacityType;
            return this;
        }

        public Builder setOnDemandTargetCapacity(@Nullable Integer onDemandTargetCapacity) {
            this.onDemandTargetCapacity = onDemandTargetCapacity;
            return this;
        }

        public Builder setSpotTargetCapacity(@Nullable Integer spotTargetCapacity) {
            this.spotTargetCapacity = spotTargetCapacity;
            return this;
        }

        public Builder setTargetCapacityUnitType(@Nullable EC2FleetTargetCapacitySpecificationRequestTargetCapacityUnitType targetCapacityUnitType) {
            this.targetCapacityUnitType = targetCapacityUnitType;
            return this;
        }

        public Builder setTotalTargetCapacity(Integer totalTargetCapacity) {
            this.totalTargetCapacity = Objects.requireNonNull(totalTargetCapacity);
            return this;
        }

        public EC2FleetTargetCapacitySpecificationRequest build() {
            return new EC2FleetTargetCapacitySpecificationRequest(defaultTargetCapacityType, onDemandTargetCapacity, spotTargetCapacity, targetCapacityUnitType, totalTargetCapacity);
        }
    }
}
