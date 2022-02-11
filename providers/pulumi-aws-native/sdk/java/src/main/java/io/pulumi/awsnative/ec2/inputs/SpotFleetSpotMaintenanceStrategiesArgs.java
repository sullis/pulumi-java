// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.inputs.SpotFleetSpotCapacityRebalanceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotFleetSpotMaintenanceStrategiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetSpotMaintenanceStrategiesArgs Empty = new SpotFleetSpotMaintenanceStrategiesArgs();

    @InputImport(name="capacityRebalance")
    private final @Nullable Input<SpotFleetSpotCapacityRebalanceArgs> capacityRebalance;

    public Input<SpotFleetSpotCapacityRebalanceArgs> getCapacityRebalance() {
        return this.capacityRebalance == null ? Input.empty() : this.capacityRebalance;
    }

    public SpotFleetSpotMaintenanceStrategiesArgs(@Nullable Input<SpotFleetSpotCapacityRebalanceArgs> capacityRebalance) {
        this.capacityRebalance = capacityRebalance;
    }

    private SpotFleetSpotMaintenanceStrategiesArgs() {
        this.capacityRebalance = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetSpotMaintenanceStrategiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SpotFleetSpotCapacityRebalanceArgs> capacityRebalance;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetSpotMaintenanceStrategiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityRebalance = defaults.capacityRebalance;
        }

        public Builder setCapacityRebalance(@Nullable Input<SpotFleetSpotCapacityRebalanceArgs> capacityRebalance) {
            this.capacityRebalance = capacityRebalance;
            return this;
        }

        public Builder setCapacityRebalance(@Nullable SpotFleetSpotCapacityRebalanceArgs capacityRebalance) {
            this.capacityRebalance = Input.ofNullable(capacityRebalance);
            return this;
        }

        public SpotFleetSpotMaintenanceStrategiesArgs build() {
            return new SpotFleetSpotMaintenanceStrategiesArgs(capacityRebalance);
        }
    }
}
