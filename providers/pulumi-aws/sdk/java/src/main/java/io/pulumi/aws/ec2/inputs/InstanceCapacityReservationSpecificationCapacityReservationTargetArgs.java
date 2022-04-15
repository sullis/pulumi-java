// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceCapacityReservationSpecificationCapacityReservationTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceCapacityReservationSpecificationCapacityReservationTargetArgs Empty = new InstanceCapacityReservationSpecificationCapacityReservationTargetArgs();

    /**
     * The ID of the Capacity Reservation in which to run the instance.
     * 
     */
    @Import(name="capacityReservationId")
      private final @Nullable Output<String> capacityReservationId;

    public Output<String> capacityReservationId() {
        return this.capacityReservationId == null ? Codegen.empty() : this.capacityReservationId;
    }

    public InstanceCapacityReservationSpecificationCapacityReservationTargetArgs(@Nullable Output<String> capacityReservationId) {
        this.capacityReservationId = capacityReservationId;
    }

    private InstanceCapacityReservationSpecificationCapacityReservationTargetArgs() {
        this.capacityReservationId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceCapacityReservationSpecificationCapacityReservationTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> capacityReservationId;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceCapacityReservationSpecificationCapacityReservationTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityReservationId = defaults.capacityReservationId;
        }

        public Builder capacityReservationId(@Nullable Output<String> capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            return this;
        }
        public Builder capacityReservationId(@Nullable String capacityReservationId) {
            this.capacityReservationId = Codegen.ofNullable(capacityReservationId);
            return this;
        }        public InstanceCapacityReservationSpecificationCapacityReservationTargetArgs build() {
            return new InstanceCapacityReservationSpecificationCapacityReservationTargetArgs(capacityReservationId);
        }
    }
}
