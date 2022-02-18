// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.network.outputs.FrontendIPConfigurationResponse;
import io.pulumi.azurenative.network.outputs.NetworkInterfaceResponse;
import io.pulumi.azurenative.network.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.network.outputs.PrivateLinkServiceIpConfigurationResponse;
import io.pulumi.azurenative.network.outputs.PrivateLinkServicePropertiesResponseAutoApproval;
import io.pulumi.azurenative.network.outputs.PrivateLinkServicePropertiesResponseVisibility;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPrivateLinkServiceResult {
    /**
     * The alias of the private link service.
     * 
     */
    private final String alias;
    /**
     * The auto-approval list of the private link service.
     * 
     */
    private final @Nullable PrivateLinkServicePropertiesResponseAutoApproval autoApproval;
    /**
     * Whether the private link service is enabled for proxy protocol or not.
     * 
     */
    private final @Nullable Boolean enableProxyProtocol;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * The extended location of the load balancer.
     * 
     */
    private final @Nullable ExtendedLocationResponse extendedLocation;
    /**
     * The list of Fqdn.
     * 
     */
    private final @Nullable List<String> fqdns;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * An array of private link service IP configurations.
     * 
     */
    private final @Nullable List<PrivateLinkServiceIpConfigurationResponse> ipConfigurations;
    /**
     * An array of references to the load balancer IP configurations.
     * 
     */
    private final @Nullable List<FrontendIPConfigurationResponse> loadBalancerFrontendIpConfigurations;
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
     * An array of references to the network interfaces created for this private link service.
     * 
     */
    private final List<NetworkInterfaceResponse> networkInterfaces;
    /**
     * An array of list about connections to the private endpoint.
     * 
     */
    private final List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * The provisioning state of the private link service resource.
     * 
     */
    private final String provisioningState;
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
     * The visibility list of the private link service.
     * 
     */
    private final @Nullable PrivateLinkServicePropertiesResponseVisibility visibility;

    @OutputCustomType.Constructor({"alias","autoApproval","enableProxyProtocol","etag","extendedLocation","fqdns","id","ipConfigurations","loadBalancerFrontendIpConfigurations","location","name","networkInterfaces","privateEndpointConnections","provisioningState","tags","type","visibility"})
    private GetPrivateLinkServiceResult(
        String alias,
        @Nullable PrivateLinkServicePropertiesResponseAutoApproval autoApproval,
        @Nullable Boolean enableProxyProtocol,
        String etag,
        @Nullable ExtendedLocationResponse extendedLocation,
        @Nullable List<String> fqdns,
        @Nullable String id,
        @Nullable List<PrivateLinkServiceIpConfigurationResponse> ipConfigurations,
        @Nullable List<FrontendIPConfigurationResponse> loadBalancerFrontendIpConfigurations,
        @Nullable String location,
        String name,
        List<NetworkInterfaceResponse> networkInterfaces,
        List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        String provisioningState,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable PrivateLinkServicePropertiesResponseVisibility visibility) {
        this.alias = Objects.requireNonNull(alias);
        this.autoApproval = autoApproval;
        this.enableProxyProtocol = enableProxyProtocol;
        this.etag = Objects.requireNonNull(etag);
        this.extendedLocation = extendedLocation;
        this.fqdns = fqdns;
        this.id = id;
        this.ipConfigurations = ipConfigurations;
        this.loadBalancerFrontendIpConfigurations = loadBalancerFrontendIpConfigurations;
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.networkInterfaces = Objects.requireNonNull(networkInterfaces);
        this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.visibility = visibility;
    }

    /**
     * The alias of the private link service.
     * 
     */
    public String getAlias() {
        return this.alias;
    }
    /**
     * The auto-approval list of the private link service.
     * 
     */
    public Optional<PrivateLinkServicePropertiesResponseAutoApproval> getAutoApproval() {
        return Optional.ofNullable(this.autoApproval);
    }
    /**
     * Whether the private link service is enabled for proxy protocol or not.
     * 
     */
    public Optional<Boolean> getEnableProxyProtocol() {
        return Optional.ofNullable(this.enableProxyProtocol);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The extended location of the load balancer.
     * 
     */
    public Optional<ExtendedLocationResponse> getExtendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }
    /**
     * The list of Fqdn.
     * 
     */
    public List<String> getFqdns() {
        return this.fqdns == null ? List.of() : this.fqdns;
    }
    /**
     * Resource ID.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * An array of private link service IP configurations.
     * 
     */
    public List<PrivateLinkServiceIpConfigurationResponse> getIpConfigurations() {
        return this.ipConfigurations == null ? List.of() : this.ipConfigurations;
    }
    /**
     * An array of references to the load balancer IP configurations.
     * 
     */
    public List<FrontendIPConfigurationResponse> getLoadBalancerFrontendIpConfigurations() {
        return this.loadBalancerFrontendIpConfigurations == null ? List.of() : this.loadBalancerFrontendIpConfigurations;
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
     * An array of references to the network interfaces created for this private link service.
     * 
     */
    public List<NetworkInterfaceResponse> getNetworkInterfaces() {
        return this.networkInterfaces;
    }
    /**
     * An array of list about connections to the private endpoint.
     * 
     */
    public List<PrivateEndpointConnectionResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * The provisioning state of the private link service resource.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
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
     * The visibility list of the private link service.
     * 
     */
    public Optional<PrivateLinkServicePropertiesResponseVisibility> getVisibility() {
        return Optional.ofNullable(this.visibility);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateLinkServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alias;
        private @Nullable PrivateLinkServicePropertiesResponseAutoApproval autoApproval;
        private @Nullable Boolean enableProxyProtocol;
        private String etag;
        private @Nullable ExtendedLocationResponse extendedLocation;
        private @Nullable List<String> fqdns;
        private @Nullable String id;
        private @Nullable List<PrivateLinkServiceIpConfigurationResponse> ipConfigurations;
        private @Nullable List<FrontendIPConfigurationResponse> loadBalancerFrontendIpConfigurations;
        private @Nullable String location;
        private String name;
        private List<NetworkInterfaceResponse> networkInterfaces;
        private List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable PrivateLinkServicePropertiesResponseVisibility visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateLinkServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.autoApproval = defaults.autoApproval;
    	      this.enableProxyProtocol = defaults.enableProxyProtocol;
    	      this.etag = defaults.etag;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.fqdns = defaults.fqdns;
    	      this.id = defaults.id;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.loadBalancerFrontendIpConfigurations = defaults.loadBalancerFrontendIpConfigurations;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.visibility = defaults.visibility;
        }

        public Builder setAlias(String alias) {
            this.alias = Objects.requireNonNull(alias);
            return this;
        }

        public Builder setAutoApproval(@Nullable PrivateLinkServicePropertiesResponseAutoApproval autoApproval) {
            this.autoApproval = autoApproval;
            return this;
        }

        public Builder setEnableProxyProtocol(@Nullable Boolean enableProxyProtocol) {
            this.enableProxyProtocol = enableProxyProtocol;
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

        public Builder setFqdns(@Nullable List<String> fqdns) {
            this.fqdns = fqdns;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIpConfigurations(@Nullable List<PrivateLinkServiceIpConfigurationResponse> ipConfigurations) {
            this.ipConfigurations = ipConfigurations;
            return this;
        }

        public Builder setLoadBalancerFrontendIpConfigurations(@Nullable List<FrontendIPConfigurationResponse> loadBalancerFrontendIpConfigurations) {
            this.loadBalancerFrontendIpConfigurations = loadBalancerFrontendIpConfigurations;
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

        public Builder setNetworkInterfaces(List<NetworkInterfaceResponse> networkInterfaces) {
            this.networkInterfaces = Objects.requireNonNull(networkInterfaces);
            return this;
        }

        public Builder setPrivateEndpointConnections(List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
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

        public Builder setVisibility(@Nullable PrivateLinkServicePropertiesResponseVisibility visibility) {
            this.visibility = visibility;
            return this;
        }

        public GetPrivateLinkServiceResult build() {
            return new GetPrivateLinkServiceResult(alias, autoApproval, enableProxyProtocol, etag, extendedLocation, fqdns, id, ipConfigurations, loadBalancerFrontendIpConfigurations, location, name, networkInterfaces, privateEndpointConnections, provisioningState, tags, type, visibility);
        }
    }
}
