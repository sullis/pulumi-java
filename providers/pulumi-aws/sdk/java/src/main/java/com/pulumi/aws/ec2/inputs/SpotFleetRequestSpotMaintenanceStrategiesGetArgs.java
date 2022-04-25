// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.SpotFleetRequestSpotMaintenanceStrategiesCapacityRebalanceGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotFleetRequestSpotMaintenanceStrategiesGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpotFleetRequestSpotMaintenanceStrategiesGetArgs Empty = new SpotFleetRequestSpotMaintenanceStrategiesGetArgs();

    /**
     * Nested argument containing the capacity rebalance for your fleet request. Defined below.
     * 
     */
    @Import(name="capacityRebalance")
    private @Nullable Output<SpotFleetRequestSpotMaintenanceStrategiesCapacityRebalanceGetArgs> capacityRebalance;

    /**
     * @return Nested argument containing the capacity rebalance for your fleet request. Defined below.
     * 
     */
    public Optional<Output<SpotFleetRequestSpotMaintenanceStrategiesCapacityRebalanceGetArgs>> capacityRebalance() {
        return Optional.ofNullable(this.capacityRebalance);
    }

    private SpotFleetRequestSpotMaintenanceStrategiesGetArgs() {}

    private SpotFleetRequestSpotMaintenanceStrategiesGetArgs(SpotFleetRequestSpotMaintenanceStrategiesGetArgs $) {
        this.capacityRebalance = $.capacityRebalance;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpotFleetRequestSpotMaintenanceStrategiesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpotFleetRequestSpotMaintenanceStrategiesGetArgs $;

        public Builder() {
            $ = new SpotFleetRequestSpotMaintenanceStrategiesGetArgs();
        }

        public Builder(SpotFleetRequestSpotMaintenanceStrategiesGetArgs defaults) {
            $ = new SpotFleetRequestSpotMaintenanceStrategiesGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacityRebalance Nested argument containing the capacity rebalance for your fleet request. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder capacityRebalance(@Nullable Output<SpotFleetRequestSpotMaintenanceStrategiesCapacityRebalanceGetArgs> capacityRebalance) {
            $.capacityRebalance = capacityRebalance;
            return this;
        }

        /**
         * @param capacityRebalance Nested argument containing the capacity rebalance for your fleet request. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder capacityRebalance(SpotFleetRequestSpotMaintenanceStrategiesCapacityRebalanceGetArgs capacityRebalance) {
            return capacityRebalance(Output.of(capacityRebalance));
        }

        public SpotFleetRequestSpotMaintenanceStrategiesGetArgs build() {
            return $;
        }
    }

}
