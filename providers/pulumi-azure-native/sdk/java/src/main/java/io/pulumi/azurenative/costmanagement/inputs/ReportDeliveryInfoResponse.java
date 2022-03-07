// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.inputs.ReportDeliveryDestinationResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * The delivery information associated with a report.
 * 
 */
public final class ReportDeliveryInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReportDeliveryInfoResponse Empty = new ReportDeliveryInfoResponse();

    /**
     * Has destination for the report being delivered.
     * 
     */
    @InputImport(name="destination", required=true)
      private final ReportDeliveryDestinationResponse destination;

    public ReportDeliveryDestinationResponse getDestination() {
        return this.destination;
    }

    public ReportDeliveryInfoResponse(ReportDeliveryDestinationResponse destination) {
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
    }

    private ReportDeliveryInfoResponse() {
        this.destination = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportDeliveryInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportDeliveryDestinationResponse destination;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportDeliveryInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
        }

        public Builder setDestination(ReportDeliveryDestinationResponse destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public ReportDeliveryInfoResponse build() {
            return new ReportDeliveryInfoResponse(destination);
        }
    }
}