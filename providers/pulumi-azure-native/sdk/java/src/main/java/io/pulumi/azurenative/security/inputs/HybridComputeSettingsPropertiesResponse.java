// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.inputs.ProxyServerPropertiesResponse;
import io.pulumi.azurenative.security.inputs.ServicePrincipalPropertiesResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings for hybrid compute management
 * 
 */
public final class HybridComputeSettingsPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final HybridComputeSettingsPropertiesResponse Empty = new HybridComputeSettingsPropertiesResponse();

    /**
     * Whether or not to automatically install Azure Arc (hybrid compute) agents on machines
     * 
     */
    @InputImport(name="autoProvision", required=true)
      private final String autoProvision;

    public String getAutoProvision() {
        return this.autoProvision;
    }

    /**
     * State of the service principal and its secret
     * 
     */
    @InputImport(name="hybridComputeProvisioningState", required=true)
      private final String hybridComputeProvisioningState;

    public String getHybridComputeProvisioningState() {
        return this.hybridComputeProvisioningState;
    }

    /**
     * For a non-Azure machine that is not connected directly to the internet, specify a proxy server that the non-Azure machine can use.
     * 
     */
    @InputImport(name="proxyServer")
      private final @Nullable ProxyServerPropertiesResponse proxyServer;

    public Optional<ProxyServerPropertiesResponse> getProxyServer() {
        return this.proxyServer == null ? Optional.empty() : Optional.ofNullable(this.proxyServer);
    }

    /**
     * The location where the metadata of machines will be stored
     * 
     */
    @InputImport(name="region")
      private final @Nullable String region;

    public Optional<String> getRegion() {
        return this.region == null ? Optional.empty() : Optional.ofNullable(this.region);
    }

    /**
     * The name of the resource group where Arc (Hybrid Compute) connectors are connected.
     * 
     */
    @InputImport(name="resourceGroupName")
      private final @Nullable String resourceGroupName;

    public Optional<String> getResourceGroupName() {
        return this.resourceGroupName == null ? Optional.empty() : Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * An object to access resources that are secured by an Azure AD tenant.
     * 
     */
    @InputImport(name="servicePrincipal")
      private final @Nullable ServicePrincipalPropertiesResponse servicePrincipal;

    public Optional<ServicePrincipalPropertiesResponse> getServicePrincipal() {
        return this.servicePrincipal == null ? Optional.empty() : Optional.ofNullable(this.servicePrincipal);
    }

    public HybridComputeSettingsPropertiesResponse(
        String autoProvision,
        String hybridComputeProvisioningState,
        @Nullable ProxyServerPropertiesResponse proxyServer,
        @Nullable String region,
        @Nullable String resourceGroupName,
        @Nullable ServicePrincipalPropertiesResponse servicePrincipal) {
        this.autoProvision = Objects.requireNonNull(autoProvision, "expected parameter 'autoProvision' to be non-null");
        this.hybridComputeProvisioningState = Objects.requireNonNull(hybridComputeProvisioningState, "expected parameter 'hybridComputeProvisioningState' to be non-null");
        this.proxyServer = proxyServer;
        this.region = region;
        this.resourceGroupName = resourceGroupName;
        this.servicePrincipal = servicePrincipal;
    }

    private HybridComputeSettingsPropertiesResponse() {
        this.autoProvision = null;
        this.hybridComputeProvisioningState = null;
        this.proxyServer = null;
        this.region = null;
        this.resourceGroupName = null;
        this.servicePrincipal = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HybridComputeSettingsPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoProvision;
        private String hybridComputeProvisioningState;
        private @Nullable ProxyServerPropertiesResponse proxyServer;
        private @Nullable String region;
        private @Nullable String resourceGroupName;
        private @Nullable ServicePrincipalPropertiesResponse servicePrincipal;

        public Builder() {
    	      // Empty
        }

        public Builder(HybridComputeSettingsPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoProvision = defaults.autoProvision;
    	      this.hybridComputeProvisioningState = defaults.hybridComputeProvisioningState;
    	      this.proxyServer = defaults.proxyServer;
    	      this.region = defaults.region;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.servicePrincipal = defaults.servicePrincipal;
        }

        public Builder setAutoProvision(String autoProvision) {
            this.autoProvision = Objects.requireNonNull(autoProvision);
            return this;
        }

        public Builder setHybridComputeProvisioningState(String hybridComputeProvisioningState) {
            this.hybridComputeProvisioningState = Objects.requireNonNull(hybridComputeProvisioningState);
            return this;
        }

        public Builder setProxyServer(@Nullable ProxyServerPropertiesResponse proxyServer) {
            this.proxyServer = proxyServer;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = region;
            return this;
        }

        public Builder setResourceGroupName(@Nullable String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder setServicePrincipal(@Nullable ServicePrincipalPropertiesResponse servicePrincipal) {
            this.servicePrincipal = servicePrincipal;
            return this;
        }
        public HybridComputeSettingsPropertiesResponse build() {
            return new HybridComputeSettingsPropertiesResponse(autoProvision, hybridComputeProvisioningState, proxyServer, region, resourceGroupName, servicePrincipal);
        }
    }
}