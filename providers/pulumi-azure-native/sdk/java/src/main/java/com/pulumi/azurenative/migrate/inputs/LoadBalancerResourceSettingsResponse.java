// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.inputs;

import com.pulumi.azurenative.migrate.inputs.LBBackendAddressPoolResourceSettingsResponse;
import com.pulumi.azurenative.migrate.inputs.LBFrontendIPConfigurationResourceSettingsResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the load balancer resource settings.
 * 
 */
public final class LoadBalancerResourceSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final LoadBalancerResourceSettingsResponse Empty = new LoadBalancerResourceSettingsResponse();

    /**
     * Gets or sets the backend address pools of the load balancer.
     * 
     */
    @Import(name="backendAddressPools")
    private @Nullable List<LBBackendAddressPoolResourceSettingsResponse> backendAddressPools;

    /**
     * @return Gets or sets the backend address pools of the load balancer.
     * 
     */
    public Optional<List<LBBackendAddressPoolResourceSettingsResponse>> backendAddressPools() {
        return Optional.ofNullable(this.backendAddressPools);
    }

    /**
     * Gets or sets the frontend IP configurations of the load balancer.
     * 
     */
    @Import(name="frontendIPConfigurations")
    private @Nullable List<LBFrontendIPConfigurationResourceSettingsResponse> frontendIPConfigurations;

    /**
     * @return Gets or sets the frontend IP configurations of the load balancer.
     * 
     */
    public Optional<List<LBFrontendIPConfigurationResourceSettingsResponse>> frontendIPConfigurations() {
        return Optional.ofNullable(this.frontendIPConfigurations);
    }

    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is &#39;Microsoft.Network/loadBalancers&#39;.
     * 
     */
    @Import(name="resourceType", required=true)
    private String resourceType;

    /**
     * @return The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is &#39;Microsoft.Network/loadBalancers&#39;.
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Gets or sets load balancer sku (Basic/Standard).
     * 
     */
    @Import(name="sku")
    private @Nullable String sku;

    /**
     * @return Gets or sets load balancer sku (Basic/Standard).
     * 
     */
    public Optional<String> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * Gets or sets the target Resource name.
     * 
     */
    @Import(name="targetResourceName", required=true)
    private String targetResourceName;

    /**
     * @return Gets or sets the target Resource name.
     * 
     */
    public String targetResourceName() {
        return this.targetResourceName;
    }

    /**
     * Gets or sets the csv list of zones common for all frontend IP configurations. Note this is given
     *  precedence only if frontend IP configurations settings are not present.
     * 
     */
    @Import(name="zones")
    private @Nullable String zones;

    /**
     * @return Gets or sets the csv list of zones common for all frontend IP configurations. Note this is given
     *  precedence only if frontend IP configurations settings are not present.
     * 
     */
    public Optional<String> zones() {
        return Optional.ofNullable(this.zones);
    }

    private LoadBalancerResourceSettingsResponse() {}

    private LoadBalancerResourceSettingsResponse(LoadBalancerResourceSettingsResponse $) {
        this.backendAddressPools = $.backendAddressPools;
        this.frontendIPConfigurations = $.frontendIPConfigurations;
        this.resourceType = $.resourceType;
        this.sku = $.sku;
        this.targetResourceName = $.targetResourceName;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerResourceSettingsResponse $;

        public Builder() {
            $ = new LoadBalancerResourceSettingsResponse();
        }

        public Builder(LoadBalancerResourceSettingsResponse defaults) {
            $ = new LoadBalancerResourceSettingsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendAddressPools Gets or sets the backend address pools of the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder backendAddressPools(@Nullable List<LBBackendAddressPoolResourceSettingsResponse> backendAddressPools) {
            $.backendAddressPools = backendAddressPools;
            return this;
        }

        /**
         * @param backendAddressPools Gets or sets the backend address pools of the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder backendAddressPools(LBBackendAddressPoolResourceSettingsResponse... backendAddressPools) {
            return backendAddressPools(List.of(backendAddressPools));
        }

        /**
         * @param frontendIPConfigurations Gets or sets the frontend IP configurations of the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder frontendIPConfigurations(@Nullable List<LBFrontendIPConfigurationResourceSettingsResponse> frontendIPConfigurations) {
            $.frontendIPConfigurations = frontendIPConfigurations;
            return this;
        }

        /**
         * @param frontendIPConfigurations Gets or sets the frontend IP configurations of the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder frontendIPConfigurations(LBFrontendIPConfigurationResourceSettingsResponse... frontendIPConfigurations) {
            return frontendIPConfigurations(List.of(frontendIPConfigurations));
        }

        /**
         * @param resourceType The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
         * Expected value is &#39;Microsoft.Network/loadBalancers&#39;.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param sku Gets or sets load balancer sku (Basic/Standard).
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable String sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param targetResourceName Gets or sets the target Resource name.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceName(String targetResourceName) {
            $.targetResourceName = targetResourceName;
            return this;
        }

        /**
         * @param zones Gets or sets the csv list of zones common for all frontend IP configurations. Note this is given
         *  precedence only if frontend IP configurations settings are not present.
         * 
         * @return builder
         * 
         */
        public Builder zones(@Nullable String zones) {
            $.zones = zones;
            return this;
        }

        public LoadBalancerResourceSettingsResponse build() {
            $.resourceType = Codegen.stringProp("resourceType").arg($.resourceType).require();
            $.targetResourceName = Objects.requireNonNull($.targetResourceName, "expected parameter 'targetResourceName' to be non-null");
            return $;
        }
    }

}
