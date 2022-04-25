// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.ResourceHealthDetailsResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * KPI Resource Health Details
 * 
 */
public final class KPIResourceHealthDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final KPIResourceHealthDetailsResponse Empty = new KPIResourceHealthDetailsResponse();

    /**
     * Resource Health Status
     * 
     */
    @Import(name="resourceHealthDetails")
    private @Nullable List<ResourceHealthDetailsResponse> resourceHealthDetails;

    /**
     * @return Resource Health Status
     * 
     */
    public Optional<List<ResourceHealthDetailsResponse>> resourceHealthDetails() {
        return Optional.ofNullable(this.resourceHealthDetails);
    }

    /**
     * Resource Health Status
     * 
     */
    @Import(name="resourceHealthStatus")
    private @Nullable String resourceHealthStatus;

    /**
     * @return Resource Health Status
     * 
     */
    public Optional<String> resourceHealthStatus() {
        return Optional.ofNullable(this.resourceHealthStatus);
    }

    private KPIResourceHealthDetailsResponse() {}

    private KPIResourceHealthDetailsResponse(KPIResourceHealthDetailsResponse $) {
        this.resourceHealthDetails = $.resourceHealthDetails;
        this.resourceHealthStatus = $.resourceHealthStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KPIResourceHealthDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KPIResourceHealthDetailsResponse $;

        public Builder() {
            $ = new KPIResourceHealthDetailsResponse();
        }

        public Builder(KPIResourceHealthDetailsResponse defaults) {
            $ = new KPIResourceHealthDetailsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceHealthDetails Resource Health Status
         * 
         * @return builder
         * 
         */
        public Builder resourceHealthDetails(@Nullable List<ResourceHealthDetailsResponse> resourceHealthDetails) {
            $.resourceHealthDetails = resourceHealthDetails;
            return this;
        }

        /**
         * @param resourceHealthDetails Resource Health Status
         * 
         * @return builder
         * 
         */
        public Builder resourceHealthDetails(ResourceHealthDetailsResponse... resourceHealthDetails) {
            return resourceHealthDetails(List.of(resourceHealthDetails));
        }

        /**
         * @param resourceHealthStatus Resource Health Status
         * 
         * @return builder
         * 
         */
        public Builder resourceHealthStatus(@Nullable String resourceHealthStatus) {
            $.resourceHealthStatus = resourceHealthStatus;
            return this;
        }

        public KPIResourceHealthDetailsResponse build() {
            return $;
        }
    }

}
