// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.outputs;

import com.pulumi.azurenative.costmanagement.outputs.ReportDeliveryDestinationResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class ReportDeliveryInfoResponse {
    /**
     * @return Has destination for the report being delivered.
     * 
     */
    private final ReportDeliveryDestinationResponse destination;

    @CustomType.Constructor
    private ReportDeliveryInfoResponse(@CustomType.Parameter("destination") ReportDeliveryDestinationResponse destination) {
        this.destination = destination;
    }

    /**
     * @return Has destination for the report being delivered.
     * 
     */
    public ReportDeliveryDestinationResponse destination() {
        return this.destination;
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

        public Builder destination(ReportDeliveryDestinationResponse destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }        public ReportDeliveryInfoResponse build() {
            return new ReportDeliveryInfoResponse(destination);
        }
    }
}
