// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.outputs;

import com.pulumi.azurenative.migrate.outputs.LBBackendAddressPoolResourceSettingsResponse;
import com.pulumi.azurenative.migrate.outputs.LBFrontendIPConfigurationResourceSettingsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerResourceSettingsResponse {
    /**
     * @return Gets or sets the backend address pools of the load balancer.
     * 
     */
    private final @Nullable List<LBBackendAddressPoolResourceSettingsResponse> backendAddressPools;
    /**
     * @return Gets or sets the frontend IP configurations of the load balancer.
     * 
     */
    private final @Nullable List<LBFrontendIPConfigurationResourceSettingsResponse> frontendIPConfigurations;
    /**
     * @return The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is &#39;Microsoft.Network/loadBalancers&#39;.
     * 
     */
    private final String resourceType;
    /**
     * @return Gets or sets load balancer sku (Basic/Standard).
     * 
     */
    private final @Nullable String sku;
    /**
     * @return Gets or sets the target Resource name.
     * 
     */
    private final String targetResourceName;
    /**
     * @return Gets or sets the csv list of zones common for all frontend IP configurations. Note this is given
     *  precedence only if frontend IP configurations settings are not present.
     * 
     */
    private final @Nullable String zones;

    @CustomType.Constructor
    private LoadBalancerResourceSettingsResponse(
        @CustomType.Parameter("backendAddressPools") @Nullable List<LBBackendAddressPoolResourceSettingsResponse> backendAddressPools,
        @CustomType.Parameter("frontendIPConfigurations") @Nullable List<LBFrontendIPConfigurationResourceSettingsResponse> frontendIPConfigurations,
        @CustomType.Parameter("resourceType") String resourceType,
        @CustomType.Parameter("sku") @Nullable String sku,
        @CustomType.Parameter("targetResourceName") String targetResourceName,
        @CustomType.Parameter("zones") @Nullable String zones) {
        this.backendAddressPools = backendAddressPools;
        this.frontendIPConfigurations = frontendIPConfigurations;
        this.resourceType = resourceType;
        this.sku = sku;
        this.targetResourceName = targetResourceName;
        this.zones = zones;
    }

    /**
     * @return Gets or sets the backend address pools of the load balancer.
     * 
     */
    public List<LBBackendAddressPoolResourceSettingsResponse> backendAddressPools() {
        return this.backendAddressPools == null ? List.of() : this.backendAddressPools;
    }
    /**
     * @return Gets or sets the frontend IP configurations of the load balancer.
     * 
     */
    public List<LBFrontendIPConfigurationResourceSettingsResponse> frontendIPConfigurations() {
        return this.frontendIPConfigurations == null ? List.of() : this.frontendIPConfigurations;
    }
    /**
     * @return The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is &#39;Microsoft.Network/loadBalancers&#39;.
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }
    /**
     * @return Gets or sets load balancer sku (Basic/Standard).
     * 
     */
    public Optional<String> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * @return Gets or sets the target Resource name.
     * 
     */
    public String targetResourceName() {
        return this.targetResourceName;
    }
    /**
     * @return Gets or sets the csv list of zones common for all frontend IP configurations. Note this is given
     *  precedence only if frontend IP configurations settings are not present.
     * 
     */
    public Optional<String> zones() {
        return Optional.ofNullable(this.zones);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<LBBackendAddressPoolResourceSettingsResponse> backendAddressPools;
        private @Nullable List<LBFrontendIPConfigurationResourceSettingsResponse> frontendIPConfigurations;
        private String resourceType;
        private @Nullable String sku;
        private String targetResourceName;
        private @Nullable String zones;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendAddressPools = defaults.backendAddressPools;
    	      this.frontendIPConfigurations = defaults.frontendIPConfigurations;
    	      this.resourceType = defaults.resourceType;
    	      this.sku = defaults.sku;
    	      this.targetResourceName = defaults.targetResourceName;
    	      this.zones = defaults.zones;
        }

        public Builder backendAddressPools(@Nullable List<LBBackendAddressPoolResourceSettingsResponse> backendAddressPools) {
            this.backendAddressPools = backendAddressPools;
            return this;
        }
        public Builder backendAddressPools(LBBackendAddressPoolResourceSettingsResponse... backendAddressPools) {
            return backendAddressPools(List.of(backendAddressPools));
        }
        public Builder frontendIPConfigurations(@Nullable List<LBFrontendIPConfigurationResourceSettingsResponse> frontendIPConfigurations) {
            this.frontendIPConfigurations = frontendIPConfigurations;
            return this;
        }
        public Builder frontendIPConfigurations(LBFrontendIPConfigurationResourceSettingsResponse... frontendIPConfigurations) {
            return frontendIPConfigurations(List.of(frontendIPConfigurations));
        }
        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public Builder sku(@Nullable String sku) {
            this.sku = sku;
            return this;
        }
        public Builder targetResourceName(String targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }
        public Builder zones(@Nullable String zones) {
            this.zones = zones;
            return this;
        }        public LoadBalancerResourceSettingsResponse build() {
            return new LoadBalancerResourceSettingsResponse(backendAddressPools, frontendIPConfigurations, resourceType, sku, targetResourceName, zones);
        }
    }
}
