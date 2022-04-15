// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.SpotFleetRequestSpotMaintenanceStrategiesCapacityRebalanceGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotFleetRequestSpotMaintenanceStrategiesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetRequestSpotMaintenanceStrategiesGetArgs Empty = new SpotFleetRequestSpotMaintenanceStrategiesGetArgs();

    /**
     * Nested argument containing the capacity rebalance for your fleet request. Defined below.
     * 
     */
    @Import(name="capacityRebalance")
      private final @Nullable Output<SpotFleetRequestSpotMaintenanceStrategiesCapacityRebalanceGetArgs> capacityRebalance;

    public Output<SpotFleetRequestSpotMaintenanceStrategiesCapacityRebalanceGetArgs> capacityRebalance() {
        return this.capacityRebalance == null ? Codegen.empty() : this.capacityRebalance;
    }

    public SpotFleetRequestSpotMaintenanceStrategiesGetArgs(@Nullable Output<SpotFleetRequestSpotMaintenanceStrategiesCapacityRebalanceGetArgs> capacityRebalance) {
        this.capacityRebalance = capacityRebalance;
    }

    private SpotFleetRequestSpotMaintenanceStrategiesGetArgs() {
        this.capacityRebalance = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetRequestSpotMaintenanceStrategiesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SpotFleetRequestSpotMaintenanceStrategiesCapacityRebalanceGetArgs> capacityRebalance;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetRequestSpotMaintenanceStrategiesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityRebalance = defaults.capacityRebalance;
        }

        public Builder capacityRebalance(@Nullable Output<SpotFleetRequestSpotMaintenanceStrategiesCapacityRebalanceGetArgs> capacityRebalance) {
            this.capacityRebalance = capacityRebalance;
            return this;
        }
        public Builder capacityRebalance(@Nullable SpotFleetRequestSpotMaintenanceStrategiesCapacityRebalanceGetArgs capacityRebalance) {
            this.capacityRebalance = Codegen.ofNullable(capacityRebalance);
            return this;
        }        public SpotFleetRequestSpotMaintenanceStrategiesGetArgs build() {
            return new SpotFleetRequestSpotMaintenanceStrategiesGetArgs(capacityRebalance);
        }
    }
}
