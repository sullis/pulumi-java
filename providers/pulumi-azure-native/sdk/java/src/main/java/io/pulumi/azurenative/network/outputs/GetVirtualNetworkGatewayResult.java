// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.AddressSpaceResponse;
import io.pulumi.azurenative.network.outputs.BgpSettingsResponse;
import io.pulumi.azurenative.network.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.VirtualNetworkGatewayIPConfigurationResponse;
import io.pulumi.azurenative.network.outputs.VirtualNetworkGatewaySkuResponse;
import io.pulumi.azurenative.network.outputs.VpnClientConfigurationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVirtualNetworkGatewayResult {
    /**
     * ActiveActive flag.
     * 
     */
    private final @Nullable Boolean activeActive;
    /**
     * Virtual network gateway's BGP speaker settings.
     * 
     */
    private final @Nullable BgpSettingsResponse bgpSettings;
    /**
     * The reference to the address space resource which represents the custom routes address space specified by the customer for virtual network gateway and VpnClient.
     * 
     */
    private final @Nullable AddressSpaceResponse customRoutes;
    /**
     * Whether BGP is enabled for this virtual network gateway or not.
     * 
     */
    private final @Nullable Boolean enableBgp;
    /**
     * Whether dns forwarding is enabled or not.
     * 
     */
    private final @Nullable Boolean enableDnsForwarding;
    /**
     * Whether private IP needs to be enabled on this gateway for connections or not.
     * 
     */
    private final @Nullable Boolean enablePrivateIpAddress;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * The extended location of type local virtual network gateway.
     * 
     */
    private final @Nullable ExtendedLocationResponse extendedLocation;
    /**
     * The reference to the LocalNetworkGateway resource which represents local network site having default routes. Assign Null value in case of removing existing default site setting.
     * 
     */
    private final @Nullable SubResourceResponse gatewayDefaultSite;
    /**
     * The type of this virtual network gateway.
     * 
     */
    private final @Nullable String gatewayType;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The IP address allocated by the gateway to which dns requests can be sent.
     * 
     */
    private final String inboundDnsForwardingEndpoint;
    /**
     * IP configurations for virtual network gateway.
     * 
     */
    private final @Nullable List<VirtualNetworkGatewayIPConfigurationResponse> ipConfigurations;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The provisioning state of the virtual network gateway resource.
     * 
     */
    private final String provisioningState;
    /**
     * The resource GUID property of the virtual network gateway resource.
     * 
     */
    private final String resourceGuid;
    /**
     * The reference to the VirtualNetworkGatewaySku resource which represents the SKU selected for Virtual network gateway.
     * 
     */
    private final @Nullable VirtualNetworkGatewaySkuResponse sku;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * Customer vnet resource id. VirtualNetworkGateway of type local gateway is associated with the customer vnet.
     * 
     */
    private final @Nullable String vNetExtendedLocationResourceId;
    /**
     * The reference to the VpnClientConfiguration resource which represents the P2S VpnClient configurations.
     * 
     */
    private final @Nullable VpnClientConfigurationResponse vpnClientConfiguration;
    /**
     * The generation for this VirtualNetworkGateway. Must be None if gatewayType is not VPN.
     * 
     */
    private final @Nullable String vpnGatewayGeneration;
    /**
     * The type of this virtual network gateway.
     * 
     */
    private final @Nullable String vpnType;

    @OutputCustomType.Constructor({"activeActive","bgpSettings","customRoutes","enableBgp","enableDnsForwarding","enablePrivateIpAddress","etag","extendedLocation","gatewayDefaultSite","gatewayType","id","inboundDnsForwardingEndpoint","ipConfigurations","location","name","provisioningState","resourceGuid","sku","tags","type","vNetExtendedLocationResourceId","vpnClientConfiguration","vpnGatewayGeneration","vpnType"})
    private GetVirtualNetworkGatewayResult(
        @Nullable Boolean activeActive,
        @Nullable BgpSettingsResponse bgpSettings,
        @Nullable AddressSpaceResponse customRoutes,
        @Nullable Boolean enableBgp,
        @Nullable Boolean enableDnsForwarding,
        @Nullable Boolean enablePrivateIpAddress,
        String etag,
        @Nullable ExtendedLocationResponse extendedLocation,
        @Nullable SubResourceResponse gatewayDefaultSite,
        @Nullable String gatewayType,
        @Nullable String id,
        String inboundDnsForwardingEndpoint,
        @Nullable List<VirtualNetworkGatewayIPConfigurationResponse> ipConfigurations,
        @Nullable String location,
        String name,
        String provisioningState,
        String resourceGuid,
        @Nullable VirtualNetworkGatewaySkuResponse sku,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable String vNetExtendedLocationResourceId,
        @Nullable VpnClientConfigurationResponse vpnClientConfiguration,
        @Nullable String vpnGatewayGeneration,
        @Nullable String vpnType) {
        this.activeActive = activeActive;
        this.bgpSettings = bgpSettings;
        this.customRoutes = customRoutes;
        this.enableBgp = enableBgp;
        this.enableDnsForwarding = enableDnsForwarding;
        this.enablePrivateIpAddress = enablePrivateIpAddress;
        this.etag = Objects.requireNonNull(etag);
        this.extendedLocation = extendedLocation;
        this.gatewayDefaultSite = gatewayDefaultSite;
        this.gatewayType = gatewayType;
        this.id = id;
        this.inboundDnsForwardingEndpoint = Objects.requireNonNull(inboundDnsForwardingEndpoint);
        this.ipConfigurations = ipConfigurations;
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.resourceGuid = Objects.requireNonNull(resourceGuid);
        this.sku = sku;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.vNetExtendedLocationResourceId = vNetExtendedLocationResourceId;
        this.vpnClientConfiguration = vpnClientConfiguration;
        this.vpnGatewayGeneration = vpnGatewayGeneration;
        this.vpnType = vpnType;
    }

    /**
     * ActiveActive flag.
     * 
     */
    public Optional<Boolean> getActiveActive() {
        return Optional.ofNullable(this.activeActive);
    }
    /**
     * Virtual network gateway's BGP speaker settings.
     * 
     */
    public Optional<BgpSettingsResponse> getBgpSettings() {
        return Optional.ofNullable(this.bgpSettings);
    }
    /**
     * The reference to the address space resource which represents the custom routes address space specified by the customer for virtual network gateway and VpnClient.
     * 
     */
    public Optional<AddressSpaceResponse> getCustomRoutes() {
        return Optional.ofNullable(this.customRoutes);
    }
    /**
     * Whether BGP is enabled for this virtual network gateway or not.
     * 
     */
    public Optional<Boolean> getEnableBgp() {
        return Optional.ofNullable(this.enableBgp);
    }
    /**
     * Whether dns forwarding is enabled or not.
     * 
     */
    public Optional<Boolean> getEnableDnsForwarding() {
        return Optional.ofNullable(this.enableDnsForwarding);
    }
    /**
     * Whether private IP needs to be enabled on this gateway for connections or not.
     * 
     */
    public Optional<Boolean> getEnablePrivateIpAddress() {
        return Optional.ofNullable(this.enablePrivateIpAddress);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The extended location of type local virtual network gateway.
     * 
     */
    public Optional<ExtendedLocationResponse> getExtendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }
    /**
     * The reference to the LocalNetworkGateway resource which represents local network site having default routes. Assign Null value in case of removing existing default site setting.
     * 
     */
    public Optional<SubResourceResponse> getGatewayDefaultSite() {
        return Optional.ofNullable(this.gatewayDefaultSite);
    }
    /**
     * The type of this virtual network gateway.
     * 
     */
    public Optional<String> getGatewayType() {
        return Optional.ofNullable(this.gatewayType);
    }
    /**
     * Resource ID.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The IP address allocated by the gateway to which dns requests can be sent.
     * 
     */
    public String getInboundDnsForwardingEndpoint() {
        return this.inboundDnsForwardingEndpoint;
    }
    /**
     * IP configurations for virtual network gateway.
     * 
     */
    public List<VirtualNetworkGatewayIPConfigurationResponse> getIpConfigurations() {
        return this.ipConfigurations == null ? List.of() : this.ipConfigurations;
    }
    /**
     * Resource location.
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning state of the virtual network gateway resource.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource GUID property of the virtual network gateway resource.
     * 
     */
    public String getResourceGuid() {
        return this.resourceGuid;
    }
    /**
     * The reference to the VirtualNetworkGatewaySku resource which represents the SKU selected for Virtual network gateway.
     * 
     */
    public Optional<VirtualNetworkGatewaySkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Customer vnet resource id. VirtualNetworkGateway of type local gateway is associated with the customer vnet.
     * 
     */
    public Optional<String> getVNetExtendedLocationResourceId() {
        return Optional.ofNullable(this.vNetExtendedLocationResourceId);
    }
    /**
     * The reference to the VpnClientConfiguration resource which represents the P2S VpnClient configurations.
     * 
     */
    public Optional<VpnClientConfigurationResponse> getVpnClientConfiguration() {
        return Optional.ofNullable(this.vpnClientConfiguration);
    }
    /**
     * The generation for this VirtualNetworkGateway. Must be None if gatewayType is not VPN.
     * 
     */
    public Optional<String> getVpnGatewayGeneration() {
        return Optional.ofNullable(this.vpnGatewayGeneration);
    }
    /**
     * The type of this virtual network gateway.
     * 
     */
    public Optional<String> getVpnType() {
        return Optional.ofNullable(this.vpnType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNetworkGatewayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean activeActive;
        private @Nullable BgpSettingsResponse bgpSettings;
        private @Nullable AddressSpaceResponse customRoutes;
        private @Nullable Boolean enableBgp;
        private @Nullable Boolean enableDnsForwarding;
        private @Nullable Boolean enablePrivateIpAddress;
        private String etag;
        private @Nullable ExtendedLocationResponse extendedLocation;
        private @Nullable SubResourceResponse gatewayDefaultSite;
        private @Nullable String gatewayType;
        private @Nullable String id;
        private String inboundDnsForwardingEndpoint;
        private @Nullable List<VirtualNetworkGatewayIPConfigurationResponse> ipConfigurations;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private String resourceGuid;
        private @Nullable VirtualNetworkGatewaySkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable String vNetExtendedLocationResourceId;
        private @Nullable VpnClientConfigurationResponse vpnClientConfiguration;
        private @Nullable String vpnGatewayGeneration;
        private @Nullable String vpnType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualNetworkGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeActive = defaults.activeActive;
    	      this.bgpSettings = defaults.bgpSettings;
    	      this.customRoutes = defaults.customRoutes;
    	      this.enableBgp = defaults.enableBgp;
    	      this.enableDnsForwarding = defaults.enableDnsForwarding;
    	      this.enablePrivateIpAddress = defaults.enablePrivateIpAddress;
    	      this.etag = defaults.etag;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.gatewayDefaultSite = defaults.gatewayDefaultSite;
    	      this.gatewayType = defaults.gatewayType;
    	      this.id = defaults.id;
    	      this.inboundDnsForwardingEndpoint = defaults.inboundDnsForwardingEndpoint;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.vNetExtendedLocationResourceId = defaults.vNetExtendedLocationResourceId;
    	      this.vpnClientConfiguration = defaults.vpnClientConfiguration;
    	      this.vpnGatewayGeneration = defaults.vpnGatewayGeneration;
    	      this.vpnType = defaults.vpnType;
        }

        public Builder setActiveActive(@Nullable Boolean activeActive) {
            this.activeActive = activeActive;
            return this;
        }

        public Builder setBgpSettings(@Nullable BgpSettingsResponse bgpSettings) {
            this.bgpSettings = bgpSettings;
            return this;
        }

        public Builder setCustomRoutes(@Nullable AddressSpaceResponse customRoutes) {
            this.customRoutes = customRoutes;
            return this;
        }

        public Builder setEnableBgp(@Nullable Boolean enableBgp) {
            this.enableBgp = enableBgp;
            return this;
        }

        public Builder setEnableDnsForwarding(@Nullable Boolean enableDnsForwarding) {
            this.enableDnsForwarding = enableDnsForwarding;
            return this;
        }

        public Builder setEnablePrivateIpAddress(@Nullable Boolean enablePrivateIpAddress) {
            this.enablePrivateIpAddress = enablePrivateIpAddress;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setExtendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder setGatewayDefaultSite(@Nullable SubResourceResponse gatewayDefaultSite) {
            this.gatewayDefaultSite = gatewayDefaultSite;
            return this;
        }

        public Builder setGatewayType(@Nullable String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setInboundDnsForwardingEndpoint(String inboundDnsForwardingEndpoint) {
            this.inboundDnsForwardingEndpoint = Objects.requireNonNull(inboundDnsForwardingEndpoint);
            return this;
        }

        public Builder setIpConfigurations(@Nullable List<VirtualNetworkGatewayIPConfigurationResponse> ipConfigurations) {
            this.ipConfigurations = ipConfigurations;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setResourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }

        public Builder setSku(@Nullable VirtualNetworkGatewaySkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVNetExtendedLocationResourceId(@Nullable String vNetExtendedLocationResourceId) {
            this.vNetExtendedLocationResourceId = vNetExtendedLocationResourceId;
            return this;
        }

        public Builder setVpnClientConfiguration(@Nullable VpnClientConfigurationResponse vpnClientConfiguration) {
            this.vpnClientConfiguration = vpnClientConfiguration;
            return this;
        }

        public Builder setVpnGatewayGeneration(@Nullable String vpnGatewayGeneration) {
            this.vpnGatewayGeneration = vpnGatewayGeneration;
            return this;
        }

        public Builder setVpnType(@Nullable String vpnType) {
            this.vpnType = vpnType;
            return this;
        }

        public GetVirtualNetworkGatewayResult build() {
            return new GetVirtualNetworkGatewayResult(activeActive, bgpSettings, customRoutes, enableBgp, enableDnsForwarding, enablePrivateIpAddress, etag, extendedLocation, gatewayDefaultSite, gatewayType, id, inboundDnsForwardingEndpoint, ipConfigurations, location, name, provisioningState, resourceGuid, sku, tags, type, vNetExtendedLocationResourceId, vpnClientConfiguration, vpnGatewayGeneration, vpnType);
        }
    }
}
