// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FleetTargetCapacitySpecification {
    /**
     * Default target capacity type. Valid values: `on-demand`, `spot`.
     * 
     */
    private final String defaultTargetCapacityType;
    /**
     * The number of On-Demand units to request.
     * 
     */
    private final @Nullable Integer onDemandTargetCapacity;
    /**
     * The number of Spot units to request.
     * 
     */
    private final @Nullable Integer spotTargetCapacity;
    /**
     * The number of units to request, filled using `default_target_capacity_type`.
     * 
     */
    private final Integer totalTargetCapacity;

    @CustomType.Constructor
    private FleetTargetCapacitySpecification(
        @CustomType.Parameter("defaultTargetCapacityType") String defaultTargetCapacityType,
        @CustomType.Parameter("onDemandTargetCapacity") @Nullable Integer onDemandTargetCapacity,
        @CustomType.Parameter("spotTargetCapacity") @Nullable Integer spotTargetCapacity,
        @CustomType.Parameter("totalTargetCapacity") Integer totalTargetCapacity) {
        this.defaultTargetCapacityType = defaultTargetCapacityType;
        this.onDemandTargetCapacity = onDemandTargetCapacity;
        this.spotTargetCapacity = spotTargetCapacity;
        this.totalTargetCapacity = totalTargetCapacity;
    }

    /**
     * Default target capacity type. Valid values: `on-demand`, `spot`.
     * 
    */
    public String getDefaultTargetCapacityType() {
        return this.defaultTargetCapacityType;
    }
    /**
     * The number of On-Demand units to request.
     * 
    */
    public Optional<Integer> getOnDemandTargetCapacity() {
        return Optional.ofNullable(this.onDemandTargetCapacity);
    }
    /**
     * The number of Spot units to request.
     * 
    */
    public Optional<Integer> getSpotTargetCapacity() {
        return Optional.ofNullable(this.spotTargetCapacity);
    }
    /**
     * The number of units to request, filled using `default_target_capacity_type`.
     * 
    */
    public Integer getTotalTargetCapacity() {
        return this.totalTargetCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetTargetCapacitySpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultTargetCapacityType;
        private @Nullable Integer onDemandTargetCapacity;
        private @Nullable Integer spotTargetCapacity;
        private Integer totalTargetCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetTargetCapacitySpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultTargetCapacityType = defaults.defaultTargetCapacityType;
    	      this.onDemandTargetCapacity = defaults.onDemandTargetCapacity;
    	      this.spotTargetCapacity = defaults.spotTargetCapacity;
    	      this.totalTargetCapacity = defaults.totalTargetCapacity;
        }

        public Builder defaultTargetCapacityType(String defaultTargetCapacityType) {
            this.defaultTargetCapacityType = Objects.requireNonNull(defaultTargetCapacityType);
            return this;
        }
        public Builder onDemandTargetCapacity(@Nullable Integer onDemandTargetCapacity) {
            this.onDemandTargetCapacity = onDemandTargetCapacity;
            return this;
        }
        public Builder spotTargetCapacity(@Nullable Integer spotTargetCapacity) {
            this.spotTargetCapacity = spotTargetCapacity;
            return this;
        }
        public Builder totalTargetCapacity(Integer totalTargetCapacity) {
            this.totalTargetCapacity = Objects.requireNonNull(totalTargetCapacity);
            return this;
        }        public FleetTargetCapacitySpecification build() {
            return new FleetTargetCapacitySpecification(defaultTargetCapacityType, onDemandTargetCapacity, spotTargetCapacity, totalTargetCapacity);
        }
    }
}
