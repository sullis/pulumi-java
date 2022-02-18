// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.azurenative.edgeorder.inputs.BillingMeterDetailsResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Cost information for the product system
 * 
 */
public final class CostInformationResponse extends io.pulumi.resources.InvokeArgs {

    public static final CostInformationResponse Empty = new CostInformationResponse();

    /**
     * Default url to display billing information
     * 
     */
    @InputImport(name="billingInfoUrl", required=true)
    private final String billingInfoUrl;

    public String getBillingInfoUrl() {
        return this.billingInfoUrl;
    }

    /**
     * Details on the various billing aspects for the product system.
     * 
     */
    @InputImport(name="billingMeterDetails", required=true)
    private final List<BillingMeterDetailsResponse> billingMeterDetails;

    public List<BillingMeterDetailsResponse> getBillingMeterDetails() {
        return this.billingMeterDetails;
    }

    public CostInformationResponse(
        String billingInfoUrl,
        List<BillingMeterDetailsResponse> billingMeterDetails) {
        this.billingInfoUrl = Objects.requireNonNull(billingInfoUrl, "expected parameter 'billingInfoUrl' to be non-null");
        this.billingMeterDetails = Objects.requireNonNull(billingMeterDetails, "expected parameter 'billingMeterDetails' to be non-null");
    }

    private CostInformationResponse() {
        this.billingInfoUrl = null;
        this.billingMeterDetails = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CostInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String billingInfoUrl;
        private List<BillingMeterDetailsResponse> billingMeterDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(CostInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingInfoUrl = defaults.billingInfoUrl;
    	      this.billingMeterDetails = defaults.billingMeterDetails;
        }

        public Builder setBillingInfoUrl(String billingInfoUrl) {
            this.billingInfoUrl = Objects.requireNonNull(billingInfoUrl);
            return this;
        }

        public Builder setBillingMeterDetails(List<BillingMeterDetailsResponse> billingMeterDetails) {
            this.billingMeterDetails = Objects.requireNonNull(billingMeterDetails);
            return this;
        }

        public CostInformationResponse build() {
            return new CostInformationResponse(billingInfoUrl, billingMeterDetails);
        }
    }
}
