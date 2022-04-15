// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.inputs.EC2FleetCapacityRebalanceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EC2FleetMaintenanceStrategiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final EC2FleetMaintenanceStrategiesArgs Empty = new EC2FleetMaintenanceStrategiesArgs();

    @Import(name="capacityRebalance")
      private final @Nullable Output<EC2FleetCapacityRebalanceArgs> capacityRebalance;

    public Output<EC2FleetCapacityRebalanceArgs> capacityRebalance() {
        return this.capacityRebalance == null ? Codegen.empty() : this.capacityRebalance;
    }

    public EC2FleetMaintenanceStrategiesArgs(@Nullable Output<EC2FleetCapacityRebalanceArgs> capacityRebalance) {
        this.capacityRebalance = capacityRebalance;
    }

    private EC2FleetMaintenanceStrategiesArgs() {
        this.capacityRebalance = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetMaintenanceStrategiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EC2FleetCapacityRebalanceArgs> capacityRebalance;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetMaintenanceStrategiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityRebalance = defaults.capacityRebalance;
        }

        public Builder capacityRebalance(@Nullable Output<EC2FleetCapacityRebalanceArgs> capacityRebalance) {
            this.capacityRebalance = capacityRebalance;
            return this;
        }
        public Builder capacityRebalance(@Nullable EC2FleetCapacityRebalanceArgs capacityRebalance) {
            this.capacityRebalance = Codegen.ofNullable(capacityRebalance);
            return this;
        }        public EC2FleetMaintenanceStrategiesArgs build() {
            return new EC2FleetMaintenanceStrategiesArgs(capacityRebalance);
        }
    }
}
