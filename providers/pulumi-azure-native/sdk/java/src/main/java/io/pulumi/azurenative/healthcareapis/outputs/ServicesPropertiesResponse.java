// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.outputs;

import io.pulumi.azurenative.healthcareapis.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.healthcareapis.outputs.ServiceAccessPolicyEntryResponse;
import io.pulumi.azurenative.healthcareapis.outputs.ServiceAcrConfigurationInfoResponse;
import io.pulumi.azurenative.healthcareapis.outputs.ServiceAuthenticationConfigurationInfoResponse;
import io.pulumi.azurenative.healthcareapis.outputs.ServiceCorsConfigurationInfoResponse;
import io.pulumi.azurenative.healthcareapis.outputs.ServiceCosmosDbConfigurationInfoResponse;
import io.pulumi.azurenative.healthcareapis.outputs.ServiceExportConfigurationInfoResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServicesPropertiesResponse {
    /**
     * The access policies of the service instance.
     * 
     */
    private final @Nullable List<ServiceAccessPolicyEntryResponse> accessPolicies;
    /**
     * The azure container registry settings used for convert data operation of the service instance.
     * 
     */
    private final @Nullable ServiceAcrConfigurationInfoResponse acrConfiguration;
    /**
     * The authentication configuration for the service instance.
     * 
     */
    private final @Nullable ServiceAuthenticationConfigurationInfoResponse authenticationConfiguration;
    /**
     * The settings for the CORS configuration of the service instance.
     * 
     */
    private final @Nullable ServiceCorsConfigurationInfoResponse corsConfiguration;
    /**
     * The settings for the Cosmos DB database backing the service.
     * 
     */
    private final @Nullable ServiceCosmosDbConfigurationInfoResponse cosmosDbConfiguration;
    /**
     * The settings for the export operation of the service instance.
     * 
     */
    private final @Nullable ServiceExportConfigurationInfoResponse exportConfiguration;
    /**
     * The list of private endpoint connections that are set up for this resource.
     * 
     */
    private final @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * The provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * Control permission for data plane traffic coming from public networks while private endpoint is enabled.
     * 
     */
    private final @Nullable String publicNetworkAccess;

    @OutputCustomType.Constructor({"accessPolicies","acrConfiguration","authenticationConfiguration","corsConfiguration","cosmosDbConfiguration","exportConfiguration","privateEndpointConnections","provisioningState","publicNetworkAccess"})
    private ServicesPropertiesResponse(
        @Nullable List<ServiceAccessPolicyEntryResponse> accessPolicies,
        @Nullable ServiceAcrConfigurationInfoResponse acrConfiguration,
        @Nullable ServiceAuthenticationConfigurationInfoResponse authenticationConfiguration,
        @Nullable ServiceCorsConfigurationInfoResponse corsConfiguration,
        @Nullable ServiceCosmosDbConfigurationInfoResponse cosmosDbConfiguration,
        @Nullable ServiceExportConfigurationInfoResponse exportConfiguration,
        @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        String provisioningState,
        @Nullable String publicNetworkAccess) {
        this.accessPolicies = accessPolicies;
        this.acrConfiguration = acrConfiguration;
        this.authenticationConfiguration = authenticationConfiguration;
        this.corsConfiguration = corsConfiguration;
        this.cosmosDbConfiguration = cosmosDbConfiguration;
        this.exportConfiguration = exportConfiguration;
        this.privateEndpointConnections = privateEndpointConnections;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.publicNetworkAccess = publicNetworkAccess;
    }

    /**
     * The access policies of the service instance.
     * 
     */
    public List<ServiceAccessPolicyEntryResponse> getAccessPolicies() {
        return this.accessPolicies == null ? List.of() : this.accessPolicies;
    }
    /**
     * The azure container registry settings used for convert data operation of the service instance.
     * 
     */
    public Optional<ServiceAcrConfigurationInfoResponse> getAcrConfiguration() {
        return Optional.ofNullable(this.acrConfiguration);
    }
    /**
     * The authentication configuration for the service instance.
     * 
     */
    public Optional<ServiceAuthenticationConfigurationInfoResponse> getAuthenticationConfiguration() {
        return Optional.ofNullable(this.authenticationConfiguration);
    }
    /**
     * The settings for the CORS configuration of the service instance.
     * 
     */
    public Optional<ServiceCorsConfigurationInfoResponse> getCorsConfiguration() {
        return Optional.ofNullable(this.corsConfiguration);
    }
    /**
     * The settings for the Cosmos DB database backing the service.
     * 
     */
    public Optional<ServiceCosmosDbConfigurationInfoResponse> getCosmosDbConfiguration() {
        return Optional.ofNullable(this.cosmosDbConfiguration);
    }
    /**
     * The settings for the export operation of the service instance.
     * 
     */
    public Optional<ServiceExportConfigurationInfoResponse> getExportConfiguration() {
        return Optional.ofNullable(this.exportConfiguration);
    }
    /**
     * The list of private endpoint connections that are set up for this resource.
     * 
     */
    public List<PrivateEndpointConnectionResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections == null ? List.of() : this.privateEndpointConnections;
    }
    /**
     * The provisioning state.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Control permission for data plane traffic coming from public networks while private endpoint is enabled.
     * 
     */
    public Optional<String> getPublicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicesPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ServiceAccessPolicyEntryResponse> accessPolicies;
        private @Nullable ServiceAcrConfigurationInfoResponse acrConfiguration;
        private @Nullable ServiceAuthenticationConfigurationInfoResponse authenticationConfiguration;
        private @Nullable ServiceCorsConfigurationInfoResponse corsConfiguration;
        private @Nullable ServiceCosmosDbConfigurationInfoResponse cosmosDbConfiguration;
        private @Nullable ServiceExportConfigurationInfoResponse exportConfiguration;
        private @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private @Nullable String publicNetworkAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicesPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicies = defaults.accessPolicies;
    	      this.acrConfiguration = defaults.acrConfiguration;
    	      this.authenticationConfiguration = defaults.authenticationConfiguration;
    	      this.corsConfiguration = defaults.corsConfiguration;
    	      this.cosmosDbConfiguration = defaults.cosmosDbConfiguration;
    	      this.exportConfiguration = defaults.exportConfiguration;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
        }

        public Builder setAccessPolicies(@Nullable List<ServiceAccessPolicyEntryResponse> accessPolicies) {
            this.accessPolicies = accessPolicies;
            return this;
        }

        public Builder setAcrConfiguration(@Nullable ServiceAcrConfigurationInfoResponse acrConfiguration) {
            this.acrConfiguration = acrConfiguration;
            return this;
        }

        public Builder setAuthenticationConfiguration(@Nullable ServiceAuthenticationConfigurationInfoResponse authenticationConfiguration) {
            this.authenticationConfiguration = authenticationConfiguration;
            return this;
        }

        public Builder setCorsConfiguration(@Nullable ServiceCorsConfigurationInfoResponse corsConfiguration) {
            this.corsConfiguration = corsConfiguration;
            return this;
        }

        public Builder setCosmosDbConfiguration(@Nullable ServiceCosmosDbConfigurationInfoResponse cosmosDbConfiguration) {
            this.cosmosDbConfiguration = cosmosDbConfiguration;
            return this;
        }

        public Builder setExportConfiguration(@Nullable ServiceExportConfigurationInfoResponse exportConfiguration) {
            this.exportConfiguration = exportConfiguration;
            return this;
        }

        public Builder setPrivateEndpointConnections(@Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = privateEndpointConnections;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public ServicesPropertiesResponse build() {
            return new ServicesPropertiesResponse(accessPolicies, acrConfiguration, authenticationConfiguration, corsConfiguration, cosmosDbConfiguration, exportConfiguration, privateEndpointConnections, provisioningState, publicNetworkAccess);
        }
    }
}
