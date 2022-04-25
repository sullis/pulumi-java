// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FleetTargetCapacitySpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final FleetTargetCapacitySpecificationArgs Empty = new FleetTargetCapacitySpecificationArgs();

    /**
     * Default target capacity type. Valid values: `on-demand`, `spot`.
     * 
     */
    @Import(name="defaultTargetCapacityType", required=true)
    private Output<String> defaultTargetCapacityType;

    /**
     * @return Default target capacity type. Valid values: `on-demand`, `spot`.
     * 
     */
    public Output<String> defaultTargetCapacityType() {
        return this.defaultTargetCapacityType;
    }

    /**
     * The number of On-Demand units to request.
     * 
     */
    @Import(name="onDemandTargetCapacity")
    private @Nullable Output<Integer> onDemandTargetCapacity;

    /**
     * @return The number of On-Demand units to request.
     * 
     */
    public Optional<Output<Integer>> onDemandTargetCapacity() {
        return Optional.ofNullable(this.onDemandTargetCapacity);
    }

    /**
     * The number of Spot units to request.
     * 
     */
    @Import(name="spotTargetCapacity")
    private @Nullable Output<Integer> spotTargetCapacity;

    /**
     * @return The number of Spot units to request.
     * 
     */
    public Optional<Output<Integer>> spotTargetCapacity() {
        return Optional.ofNullable(this.spotTargetCapacity);
    }

    /**
     * The number of units to request, filled using `default_target_capacity_type`.
     * 
     */
    @Import(name="totalTargetCapacity", required=true)
    private Output<Integer> totalTargetCapacity;

    /**
     * @return The number of units to request, filled using `default_target_capacity_type`.
     * 
     */
    public Output<Integer> totalTargetCapacity() {
        return this.totalTargetCapacity;
    }

    private FleetTargetCapacitySpecificationArgs() {}

    private FleetTargetCapacitySpecificationArgs(FleetTargetCapacitySpecificationArgs $) {
        this.defaultTargetCapacityType = $.defaultTargetCapacityType;
        this.onDemandTargetCapacity = $.onDemandTargetCapacity;
        this.spotTargetCapacity = $.spotTargetCapacity;
        this.totalTargetCapacity = $.totalTargetCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FleetTargetCapacitySpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FleetTargetCapacitySpecificationArgs $;

        public Builder() {
            $ = new FleetTargetCapacitySpecificationArgs();
        }

        public Builder(FleetTargetCapacitySpecificationArgs defaults) {
            $ = new FleetTargetCapacitySpecificationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultTargetCapacityType Default target capacity type. Valid values: `on-demand`, `spot`.
         * 
         * @return builder
         * 
         */
        public Builder defaultTargetCapacityType(Output<String> defaultTargetCapacityType) {
            $.defaultTargetCapacityType = defaultTargetCapacityType;
            return this;
        }

        /**
         * @param defaultTargetCapacityType Default target capacity type. Valid values: `on-demand`, `spot`.
         * 
         * @return builder
         * 
         */
        public Builder defaultTargetCapacityType(String defaultTargetCapacityType) {
            return defaultTargetCapacityType(Output.of(defaultTargetCapacityType));
        }

        /**
         * @param onDemandTargetCapacity The number of On-Demand units to request.
         * 
         * @return builder
         * 
         */
        public Builder onDemandTargetCapacity(@Nullable Output<Integer> onDemandTargetCapacity) {
            $.onDemandTargetCapacity = onDemandTargetCapacity;
            return this;
        }

        /**
         * @param onDemandTargetCapacity The number of On-Demand units to request.
         * 
         * @return builder
         * 
         */
        public Builder onDemandTargetCapacity(Integer onDemandTargetCapacity) {
            return onDemandTargetCapacity(Output.of(onDemandTargetCapacity));
        }

        /**
         * @param spotTargetCapacity The number of Spot units to request.
         * 
         * @return builder
         * 
         */
        public Builder spotTargetCapacity(@Nullable Output<Integer> spotTargetCapacity) {
            $.spotTargetCapacity = spotTargetCapacity;
            return this;
        }

        /**
         * @param spotTargetCapacity The number of Spot units to request.
         * 
         * @return builder
         * 
         */
        public Builder spotTargetCapacity(Integer spotTargetCapacity) {
            return spotTargetCapacity(Output.of(spotTargetCapacity));
        }

        /**
         * @param totalTargetCapacity The number of units to request, filled using `default_target_capacity_type`.
         * 
         * @return builder
         * 
         */
        public Builder totalTargetCapacity(Output<Integer> totalTargetCapacity) {
            $.totalTargetCapacity = totalTargetCapacity;
            return this;
        }

        /**
         * @param totalTargetCapacity The number of units to request, filled using `default_target_capacity_type`.
         * 
         * @return builder
         * 
         */
        public Builder totalTargetCapacity(Integer totalTargetCapacity) {
            return totalTargetCapacity(Output.of(totalTargetCapacity));
        }

        public FleetTargetCapacitySpecificationArgs build() {
            $.defaultTargetCapacityType = Objects.requireNonNull($.defaultTargetCapacityType, "expected parameter 'defaultTargetCapacityType' to be non-null");
            $.totalTargetCapacity = Objects.requireNonNull($.totalTargetCapacity, "expected parameter 'totalTargetCapacity' to be non-null");
            return $;
        }
    }

}
