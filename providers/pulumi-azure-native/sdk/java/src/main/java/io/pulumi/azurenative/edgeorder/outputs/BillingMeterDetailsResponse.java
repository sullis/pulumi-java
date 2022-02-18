// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.outputs;

import io.pulumi.azurenative.edgeorder.outputs.Pav2MeterDetailsResponse;
import io.pulumi.azurenative.edgeorder.outputs.PurchaseMeterDetailsResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BillingMeterDetailsResponse {
    /**
     * Frequency of recurrence
     * 
     */
    private final String frequency;
    /**
     * Represents MeterDetails
     * 
     */
    private final Either<Pav2MeterDetailsResponse,PurchaseMeterDetailsResponse> meterDetails;
    /**
     * Represents Metering type (eg one-time or recurrent)
     * 
     */
    private final String meteringType;
    /**
     * Represents Billing type name
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"frequency","meterDetails","meteringType","name"})
    private BillingMeterDetailsResponse(
        String frequency,
        Either<Pav2MeterDetailsResponse,PurchaseMeterDetailsResponse> meterDetails,
        String meteringType,
        String name) {
        this.frequency = Objects.requireNonNull(frequency);
        this.meterDetails = Objects.requireNonNull(meterDetails);
        this.meteringType = Objects.requireNonNull(meteringType);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * Frequency of recurrence
     * 
     */
    public String getFrequency() {
        return this.frequency;
    }
    /**
     * Represents MeterDetails
     * 
     */
    public Either<Pav2MeterDetailsResponse,PurchaseMeterDetailsResponse> getMeterDetails() {
        return this.meterDetails;
    }
    /**
     * Represents Metering type (eg one-time or recurrent)
     * 
     */
    public String getMeteringType() {
        return this.meteringType;
    }
    /**
     * Represents Billing type name
     * 
     */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BillingMeterDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String frequency;
        private Either<Pav2MeterDetailsResponse,PurchaseMeterDetailsResponse> meterDetails;
        private String meteringType;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(BillingMeterDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frequency = defaults.frequency;
    	      this.meterDetails = defaults.meterDetails;
    	      this.meteringType = defaults.meteringType;
    	      this.name = defaults.name;
        }

        public Builder setFrequency(String frequency) {
            this.frequency = Objects.requireNonNull(frequency);
            return this;
        }

        public Builder setMeterDetails(Either<Pav2MeterDetailsResponse,PurchaseMeterDetailsResponse> meterDetails) {
            this.meterDetails = Objects.requireNonNull(meterDetails);
            return this;
        }

        public Builder setMeteringType(String meteringType) {
            this.meteringType = Objects.requireNonNull(meteringType);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public BillingMeterDetailsResponse build() {
            return new BillingMeterDetailsResponse(frequency, meterDetails, meteringType, name);
        }
    }
}
