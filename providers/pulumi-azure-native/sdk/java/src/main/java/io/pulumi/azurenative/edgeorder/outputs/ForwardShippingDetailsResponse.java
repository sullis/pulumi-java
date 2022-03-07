// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ForwardShippingDetailsResponse {
    /**
     * Carrier Name for display purpose. Not to be used for any processing.
     * 
     */
    private final String carrierDisplayName;
    /**
     * Name of the carrier.
     * 
     */
    private final String carrierName;
    /**
     * TrackingId of the package
     * 
     */
    private final String trackingId;
    /**
     * TrackingUrl of the package.
     * 
     */
    private final String trackingUrl;

    @OutputCustomType.Constructor({"carrierDisplayName","carrierName","trackingId","trackingUrl"})
    private ForwardShippingDetailsResponse(
        String carrierDisplayName,
        String carrierName,
        String trackingId,
        String trackingUrl) {
        this.carrierDisplayName = Objects.requireNonNull(carrierDisplayName);
        this.carrierName = Objects.requireNonNull(carrierName);
        this.trackingId = Objects.requireNonNull(trackingId);
        this.trackingUrl = Objects.requireNonNull(trackingUrl);
    }

    /**
     * Carrier Name for display purpose. Not to be used for any processing.
     * 
    */
    public String getCarrierDisplayName() {
        return this.carrierDisplayName;
    }
    /**
     * Name of the carrier.
     * 
    */
    public String getCarrierName() {
        return this.carrierName;
    }
    /**
     * TrackingId of the package
     * 
    */
    public String getTrackingId() {
        return this.trackingId;
    }
    /**
     * TrackingUrl of the package.
     * 
    */
    public String getTrackingUrl() {
        return this.trackingUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ForwardShippingDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String carrierDisplayName;
        private String carrierName;
        private String trackingId;
        private String trackingUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ForwardShippingDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.carrierDisplayName = defaults.carrierDisplayName;
    	      this.carrierName = defaults.carrierName;
    	      this.trackingId = defaults.trackingId;
    	      this.trackingUrl = defaults.trackingUrl;
        }

        public Builder setCarrierDisplayName(String carrierDisplayName) {
            this.carrierDisplayName = Objects.requireNonNull(carrierDisplayName);
            return this;
        }

        public Builder setCarrierName(String carrierName) {
            this.carrierName = Objects.requireNonNull(carrierName);
            return this;
        }

        public Builder setTrackingId(String trackingId) {
            this.trackingId = Objects.requireNonNull(trackingId);
            return this;
        }

        public Builder setTrackingUrl(String trackingUrl) {
            this.trackingUrl = Objects.requireNonNull(trackingUrl);
            return this;
        }
        public ForwardShippingDetailsResponse build() {
            return new ForwardShippingDetailsResponse(carrierDisplayName, carrierName, trackingId, trackingUrl);
        }
    }
}