// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.outputs;

import com.pulumi.azurenative.cdn.outputs.HealthProbeParametersResponse;
import com.pulumi.azurenative.cdn.outputs.ResourceReferenceResponse;
import com.pulumi.azurenative.cdn.outputs.ResponseBasedOriginErrorDetectionParametersResponse;
import com.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOriginGroupResult {
    /**
     * @return Health probe settings to the origin that is used to determine the health of the origin.
     * 
     */
    private final @Nullable HealthProbeParametersResponse healthProbeSettings;
    /**
     * @return Resource ID.
     * 
     */
    private final String id;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return The source of the content being delivered via CDN within given origin group.
     * 
     */
    private final List<ResourceReferenceResponse> origins;
    /**
     * @return Provisioning status of the origin group.
     * 
     */
    private final String provisioningState;
    /**
     * @return Resource status of the origin group.
     * 
     */
    private final String resourceState;
    /**
     * @return The JSON object that contains the properties to determine origin health using real requests/responses. This property is currently not supported.
     * 
     */
    private final @Nullable ResponseBasedOriginErrorDetectionParametersResponse responseBasedOriginErrorDetectionSettings;
    /**
     * @return Read only system data
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Time in minutes to shift the traffic to the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10 mins. This property is currently not supported.
     * 
     */
    private final @Nullable Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetOriginGroupResult(
        @CustomType.Parameter("healthProbeSettings") @Nullable HealthProbeParametersResponse healthProbeSettings,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("origins") List<ResourceReferenceResponse> origins,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("resourceState") String resourceState,
        @CustomType.Parameter("responseBasedOriginErrorDetectionSettings") @Nullable ResponseBasedOriginErrorDetectionParametersResponse responseBasedOriginErrorDetectionSettings,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("trafficRestorationTimeToHealedOrNewEndpointsInMinutes") @Nullable Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes,
        @CustomType.Parameter("type") String type) {
        this.healthProbeSettings = healthProbeSettings;
        this.id = id;
        this.name = name;
        this.origins = origins;
        this.provisioningState = provisioningState;
        this.resourceState = resourceState;
        this.responseBasedOriginErrorDetectionSettings = responseBasedOriginErrorDetectionSettings;
        this.systemData = systemData;
        this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes = trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
        this.type = type;
    }

    /**
     * @return Health probe settings to the origin that is used to determine the health of the origin.
     * 
     */
    public Optional<HealthProbeParametersResponse> healthProbeSettings() {
        return Optional.ofNullable(this.healthProbeSettings);
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The source of the content being delivered via CDN within given origin group.
     * 
     */
    public List<ResourceReferenceResponse> origins() {
        return this.origins;
    }
    /**
     * @return Provisioning status of the origin group.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Resource status of the origin group.
     * 
     */
    public String resourceState() {
        return this.resourceState;
    }
    /**
     * @return The JSON object that contains the properties to determine origin health using real requests/responses. This property is currently not supported.
     * 
     */
    public Optional<ResponseBasedOriginErrorDetectionParametersResponse> responseBasedOriginErrorDetectionSettings() {
        return Optional.ofNullable(this.responseBasedOriginErrorDetectionSettings);
    }
    /**
     * @return Read only system data
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Time in minutes to shift the traffic to the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10 mins. This property is currently not supported.
     * 
     */
    public Optional<Integer> trafficRestorationTimeToHealedOrNewEndpointsInMinutes() {
        return Optional.ofNullable(this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOriginGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable HealthProbeParametersResponse healthProbeSettings;
        private String id;
        private String name;
        private List<ResourceReferenceResponse> origins;
        private String provisioningState;
        private String resourceState;
        private @Nullable ResponseBasedOriginErrorDetectionParametersResponse responseBasedOriginErrorDetectionSettings;
        private SystemDataResponse systemData;
        private @Nullable Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOriginGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthProbeSettings = defaults.healthProbeSettings;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.origins = defaults.origins;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceState = defaults.resourceState;
    	      this.responseBasedOriginErrorDetectionSettings = defaults.responseBasedOriginErrorDetectionSettings;
    	      this.systemData = defaults.systemData;
    	      this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes = defaults.trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
    	      this.type = defaults.type;
        }

        public Builder healthProbeSettings(@Nullable HealthProbeParametersResponse healthProbeSettings) {
            this.healthProbeSettings = healthProbeSettings;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder origins(List<ResourceReferenceResponse> origins) {
            this.origins = Objects.requireNonNull(origins);
            return this;
        }
        public Builder origins(ResourceReferenceResponse... origins) {
            return origins(List.of(origins));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder resourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }
        public Builder responseBasedOriginErrorDetectionSettings(@Nullable ResponseBasedOriginErrorDetectionParametersResponse responseBasedOriginErrorDetectionSettings) {
            this.responseBasedOriginErrorDetectionSettings = responseBasedOriginErrorDetectionSettings;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder trafficRestorationTimeToHealedOrNewEndpointsInMinutes(@Nullable Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
            this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes = trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetOriginGroupResult build() {
            return new GetOriginGroupResult(healthProbeSettings, id, name, origins, provisioningState, resourceState, responseBasedOriginErrorDetectionSettings, systemData, trafficRestorationTimeToHealedOrNewEndpointsInMinutes, type);
        }
    }
}
