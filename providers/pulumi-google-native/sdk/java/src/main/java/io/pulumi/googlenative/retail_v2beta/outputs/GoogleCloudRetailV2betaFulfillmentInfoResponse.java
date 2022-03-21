// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudRetailV2betaFulfillmentInfoResponse {
    /**
     * The IDs for this type, such as the store IDs for FulfillmentInfo.type.pickup-in-store or the region IDs for FulfillmentInfo.type.same-day-delivery. A maximum of 3000 values are allowed. Each value must be a string with a length limit of 30 characters, matching the pattern `[a-zA-Z0-9_-]+`, such as "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    private final List<String> placeIds;
    /**
     * The fulfillment type, including commonly used types (such as pickup in store and same day delivery), and custom types. Customers have to map custom types to their display names before rendering UI. Supported values: * "pickup-in-store" * "ship-to-store" * "same-day-delivery" * "next-day-delivery" * "custom-type-1" * "custom-type-2" * "custom-type-3" * "custom-type-4" * "custom-type-5" If this field is set to an invalid value other than these, an INVALID_ARGUMENT error is returned.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GoogleCloudRetailV2betaFulfillmentInfoResponse(
        @CustomType.Parameter("placeIds") List<String> placeIds,
        @CustomType.Parameter("type") String type) {
        this.placeIds = placeIds;
        this.type = type;
    }

    /**
     * The IDs for this type, such as the store IDs for FulfillmentInfo.type.pickup-in-store or the region IDs for FulfillmentInfo.type.same-day-delivery. A maximum of 3000 values are allowed. Each value must be a string with a length limit of 30 characters, matching the pattern `[a-zA-Z0-9_-]+`, such as "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is returned.
     * 
    */
    public List<String> getPlaceIds() {
        return this.placeIds;
    }
    /**
     * The fulfillment type, including commonly used types (such as pickup in store and same day delivery), and custom types. Customers have to map custom types to their display names before rendering UI. Supported values: * "pickup-in-store" * "ship-to-store" * "same-day-delivery" * "next-day-delivery" * "custom-type-1" * "custom-type-2" * "custom-type-3" * "custom-type-4" * "custom-type-5" If this field is set to an invalid value other than these, an INVALID_ARGUMENT error is returned.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaFulfillmentInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> placeIds;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaFulfillmentInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.placeIds = defaults.placeIds;
    	      this.type = defaults.type;
        }

        public Builder placeIds(List<String> placeIds) {
            this.placeIds = Objects.requireNonNull(placeIds);
            return this;
        }
        public Builder placeIds(String... placeIds) {
            return placeIds(List.of(placeIds));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GoogleCloudRetailV2betaFulfillmentInfoResponse build() {
            return new GoogleCloudRetailV2betaFulfillmentInfoResponse(placeIds, type);
        }
    }
}
