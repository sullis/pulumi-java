// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.InstanceReservationAffinitySpecificReservationArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceReservationAffinityArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceReservationAffinityArgs Empty = new InstanceReservationAffinityArgs();

    /**
     * Specifies the label selector for the reservation to use..
     * Structure is documented below.
     * 
     */
    @Import(name="specificReservation")
      private final @Nullable Output<InstanceReservationAffinitySpecificReservationArgs> specificReservation;

    public Output<InstanceReservationAffinitySpecificReservationArgs> getSpecificReservation() {
        return this.specificReservation == null ? Output.empty() : this.specificReservation;
    }

    /**
     * The type of reservation from which this instance can consume resources.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public InstanceReservationAffinityArgs(
        @Nullable Output<InstanceReservationAffinitySpecificReservationArgs> specificReservation,
        Output<String> type) {
        this.specificReservation = specificReservation;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private InstanceReservationAffinityArgs() {
        this.specificReservation = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceReservationAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<InstanceReservationAffinitySpecificReservationArgs> specificReservation;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceReservationAffinityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.specificReservation = defaults.specificReservation;
    	      this.type = defaults.type;
        }

        public Builder specificReservation(@Nullable Output<InstanceReservationAffinitySpecificReservationArgs> specificReservation) {
            this.specificReservation = specificReservation;
            return this;
        }
        public Builder specificReservation(@Nullable InstanceReservationAffinitySpecificReservationArgs specificReservation) {
            this.specificReservation = Output.ofNullable(specificReservation);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public InstanceReservationAffinityArgs build() {
            return new InstanceReservationAffinityArgs(specificReservation, type);
        }
    }
}
