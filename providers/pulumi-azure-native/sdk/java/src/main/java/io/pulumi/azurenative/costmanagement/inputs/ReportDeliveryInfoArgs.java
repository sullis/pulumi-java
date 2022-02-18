// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.inputs.ReportDeliveryDestinationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


/**
 * The delivery information associated with a report.
 * 
 */
public final class ReportDeliveryInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReportDeliveryInfoArgs Empty = new ReportDeliveryInfoArgs();

    /**
     * Has destination for the report being delivered.
     * 
     */
    @InputImport(name="destination", required=true)
    private final Input<ReportDeliveryDestinationArgs> destination;

    public Input<ReportDeliveryDestinationArgs> getDestination() {
        return this.destination;
    }

    public ReportDeliveryInfoArgs(Input<ReportDeliveryDestinationArgs> destination) {
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
    }

    private ReportDeliveryInfoArgs() {
        this.destination = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportDeliveryInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ReportDeliveryDestinationArgs> destination;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportDeliveryInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
        }

        public Builder setDestination(Input<ReportDeliveryDestinationArgs> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder setDestination(ReportDeliveryDestinationArgs destination) {
            this.destination = Input.of(Objects.requireNonNull(destination));
            return this;
        }

        public ReportDeliveryInfoArgs build() {
            return new ReportDeliveryInfoArgs(destination);
        }
    }
}
