// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LoadBalancerBackendAddressResponse {
    /**
     * IP Address belonging to the referenced virtual network.
     * 
     */
    private final @Nullable String ipAddress;
    /**
     * Reference to the frontend ip address configuration defined in regional loadbalancer.
     * 
     */
    private final @Nullable SubResourceResponse loadBalancerFrontendIPConfiguration;
    /**
     * Name of the backend address.
     * 
     */
    private final @Nullable String name;
    /**
     * Reference to IP address defined in network interfaces.
     * 
     */
    private final SubResourceResponse networkInterfaceIPConfiguration;
    /**
     * Reference to an existing subnet.
     * 
     */
    private final @Nullable SubResourceResponse subnet;
    /**
     * Reference to an existing virtual network.
     * 
     */
    private final @Nullable SubResourceResponse virtualNetwork;

    @OutputCustomType.Constructor({"ipAddress","loadBalancerFrontendIPConfiguration","name","networkInterfaceIPConfiguration","subnet","virtualNetwork"})
    private LoadBalancerBackendAddressResponse(
        @Nullable String ipAddress,
        @Nullable SubResourceResponse loadBalancerFrontendIPConfiguration,
        @Nullable String name,
        SubResourceResponse networkInterfaceIPConfiguration,
        @Nullable SubResourceResponse subnet,
        @Nullable SubResourceResponse virtualNetwork) {
        this.ipAddress = ipAddress;
        this.loadBalancerFrontendIPConfiguration = loadBalancerFrontendIPConfiguration;
        this.name = name;
        this.networkInterfaceIPConfiguration = Objects.requireNonNull(networkInterfaceIPConfiguration);
        this.subnet = subnet;
        this.virtualNetwork = virtualNetwork;
    }

    /**
     * IP Address belonging to the referenced virtual network.
     * 
    */
    public Optional<String> getIpAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * Reference to the frontend ip address configuration defined in regional loadbalancer.
     * 
    */
    public Optional<SubResourceResponse> getLoadBalancerFrontendIPConfiguration() {
        return Optional.ofNullable(this.loadBalancerFrontendIPConfiguration);
    }
    /**
     * Name of the backend address.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Reference to IP address defined in network interfaces.
     * 
    */
    public SubResourceResponse getNetworkInterfaceIPConfiguration() {
        return this.networkInterfaceIPConfiguration;
    }
    /**
     * Reference to an existing subnet.
     * 
    */
    public Optional<SubResourceResponse> getSubnet() {
        return Optional.ofNullable(this.subnet);
    }
    /**
     * Reference to an existing virtual network.
     * 
    */
    public Optional<SubResourceResponse> getVirtualNetwork() {
        return Optional.ofNullable(this.virtualNetwork);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerBackendAddressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ipAddress;
        private @Nullable SubResourceResponse loadBalancerFrontendIPConfiguration;
        private @Nullable String name;
        private SubResourceResponse networkInterfaceIPConfiguration;
        private @Nullable SubResourceResponse subnet;
        private @Nullable SubResourceResponse virtualNetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerBackendAddressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.loadBalancerFrontendIPConfiguration = defaults.loadBalancerFrontendIPConfiguration;
    	      this.name = defaults.name;
    	      this.networkInterfaceIPConfiguration = defaults.networkInterfaceIPConfiguration;
    	      this.subnet = defaults.subnet;
    	      this.virtualNetwork = defaults.virtualNetwork;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setLoadBalancerFrontendIPConfiguration(@Nullable SubResourceResponse loadBalancerFrontendIPConfiguration) {
            this.loadBalancerFrontendIPConfiguration = loadBalancerFrontendIPConfiguration;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setNetworkInterfaceIPConfiguration(SubResourceResponse networkInterfaceIPConfiguration) {
            this.networkInterfaceIPConfiguration = Objects.requireNonNull(networkInterfaceIPConfiguration);
            return this;
        }

        public Builder setSubnet(@Nullable SubResourceResponse subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder setVirtualNetwork(@Nullable SubResourceResponse virtualNetwork) {
            this.virtualNetwork = virtualNetwork;
            return this;
        }
        public LoadBalancerBackendAddressResponse build() {
            return new LoadBalancerBackendAddressResponse(ipAddress, loadBalancerFrontendIPConfiguration, name, networkInterfaceIPConfiguration, subnet, virtualNetwork);
        }
    }
}