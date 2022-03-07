// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateReservationAffinitySpecificReservationArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFromTemplateReservationAffinityArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFromTemplateReservationAffinityArgs Empty = new InstanceFromTemplateReservationAffinityArgs();

    @InputImport(name="specificReservation")
      private final @Nullable Input<InstanceFromTemplateReservationAffinitySpecificReservationArgs> specificReservation;

    public Input<InstanceFromTemplateReservationAffinitySpecificReservationArgs> getSpecificReservation() {
        return this.specificReservation == null ? Input.empty() : this.specificReservation;
    }

    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public InstanceFromTemplateReservationAffinityArgs(
        @Nullable Input<InstanceFromTemplateReservationAffinitySpecificReservationArgs> specificReservation,
        Input<String> type) {
        this.specificReservation = specificReservation;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private InstanceFromTemplateReservationAffinityArgs() {
        this.specificReservation = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromTemplateReservationAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<InstanceFromTemplateReservationAffinitySpecificReservationArgs> specificReservation;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromTemplateReservationAffinityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.specificReservation = defaults.specificReservation;
    	      this.type = defaults.type;
        }

        public Builder setSpecificReservation(@Nullable Input<InstanceFromTemplateReservationAffinitySpecificReservationArgs> specificReservation) {
            this.specificReservation = specificReservation;
            return this;
        }

        public Builder setSpecificReservation(@Nullable InstanceFromTemplateReservationAffinitySpecificReservationArgs specificReservation) {
            this.specificReservation = Input.ofNullable(specificReservation);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public InstanceFromTemplateReservationAffinityArgs build() {
            return new InstanceFromTemplateReservationAffinityArgs(specificReservation, type);
        }
    }
}