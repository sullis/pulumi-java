// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.SubResourceResponse;
import com.pulumi.azurenative.compute.outputs.VirtualMachinePublicIPAddressConfigurationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineNetworkInterfaceIPConfigurationResponse {
    /**
     * @return Specifies an array of references to backend address pools of application gateways. A virtual machine can reference backend address pools of multiple application gateways. Multiple virtual machines cannot use the same application gateway.
     * 
     */
    private final @Nullable List<SubResourceResponse> applicationGatewayBackendAddressPools;
    /**
     * @return Specifies an array of references to application security group.
     * 
     */
    private final @Nullable List<SubResourceResponse> applicationSecurityGroups;
    /**
     * @return Specifies an array of references to backend address pools of load balancers. A virtual machine can reference backend address pools of one public and one internal load balancer. [Multiple virtual machines cannot use the same basic sku load balancer].
     * 
     */
    private final @Nullable List<SubResourceResponse> loadBalancerBackendAddressPools;
    /**
     * @return The IP configuration name.
     * 
     */
    private final String name;
    /**
     * @return Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     * 
     */
    private final @Nullable Boolean primary;
    /**
     * @return Available from Api-Version 2017-03-30 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.  Possible values are: &#39;IPv4&#39; and &#39;IPv6&#39;.
     * 
     */
    private final @Nullable String privateIPAddressVersion;
    /**
     * @return The publicIPAddressConfiguration.
     * 
     */
    private final @Nullable VirtualMachinePublicIPAddressConfigurationResponse publicIPAddressConfiguration;
    /**
     * @return Specifies the identifier of the subnet.
     * 
     */
    private final @Nullable SubResourceResponse subnet;

    @CustomType.Constructor
    private VirtualMachineNetworkInterfaceIPConfigurationResponse(
        @CustomType.Parameter("applicationGatewayBackendAddressPools") @Nullable List<SubResourceResponse> applicationGatewayBackendAddressPools,
        @CustomType.Parameter("applicationSecurityGroups") @Nullable List<SubResourceResponse> applicationSecurityGroups,
        @CustomType.Parameter("loadBalancerBackendAddressPools") @Nullable List<SubResourceResponse> loadBalancerBackendAddressPools,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("primary") @Nullable Boolean primary,
        @CustomType.Parameter("privateIPAddressVersion") @Nullable String privateIPAddressVersion,
        @CustomType.Parameter("publicIPAddressConfiguration") @Nullable VirtualMachinePublicIPAddressConfigurationResponse publicIPAddressConfiguration,
        @CustomType.Parameter("subnet") @Nullable SubResourceResponse subnet) {
        this.applicationGatewayBackendAddressPools = applicationGatewayBackendAddressPools;
        this.applicationSecurityGroups = applicationSecurityGroups;
        this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
        this.name = name;
        this.primary = primary;
        this.privateIPAddressVersion = privateIPAddressVersion;
        this.publicIPAddressConfiguration = publicIPAddressConfiguration;
        this.subnet = subnet;
    }

    /**
     * @return Specifies an array of references to backend address pools of application gateways. A virtual machine can reference backend address pools of multiple application gateways. Multiple virtual machines cannot use the same application gateway.
     * 
     */
    public List<SubResourceResponse> applicationGatewayBackendAddressPools() {
        return this.applicationGatewayBackendAddressPools == null ? List.of() : this.applicationGatewayBackendAddressPools;
    }
    /**
     * @return Specifies an array of references to application security group.
     * 
     */
    public List<SubResourceResponse> applicationSecurityGroups() {
        return this.applicationSecurityGroups == null ? List.of() : this.applicationSecurityGroups;
    }
    /**
     * @return Specifies an array of references to backend address pools of load balancers. A virtual machine can reference backend address pools of one public and one internal load balancer. [Multiple virtual machines cannot use the same basic sku load balancer].
     * 
     */
    public List<SubResourceResponse> loadBalancerBackendAddressPools() {
        return this.loadBalancerBackendAddressPools == null ? List.of() : this.loadBalancerBackendAddressPools;
    }
    /**
     * @return The IP configuration name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     * 
     */
    public Optional<Boolean> primary() {
        return Optional.ofNullable(this.primary);
    }
    /**
     * @return Available from Api-Version 2017-03-30 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.  Possible values are: &#39;IPv4&#39; and &#39;IPv6&#39;.
     * 
     */
    public Optional<String> privateIPAddressVersion() {
        return Optional.ofNullable(this.privateIPAddressVersion);
    }
    /**
     * @return The publicIPAddressConfiguration.
     * 
     */
    public Optional<VirtualMachinePublicIPAddressConfigurationResponse> publicIPAddressConfiguration() {
        return Optional.ofNullable(this.publicIPAddressConfiguration);
    }
    /**
     * @return Specifies the identifier of the subnet.
     * 
     */
    public Optional<SubResourceResponse> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineNetworkInterfaceIPConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SubResourceResponse> applicationGatewayBackendAddressPools;
        private @Nullable List<SubResourceResponse> applicationSecurityGroups;
        private @Nullable List<SubResourceResponse> loadBalancerBackendAddressPools;
        private String name;
        private @Nullable Boolean primary;
        private @Nullable String privateIPAddressVersion;
        private @Nullable VirtualMachinePublicIPAddressConfigurationResponse publicIPAddressConfiguration;
        private @Nullable SubResourceResponse subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineNetworkInterfaceIPConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationGatewayBackendAddressPools = defaults.applicationGatewayBackendAddressPools;
    	      this.applicationSecurityGroups = defaults.applicationSecurityGroups;
    	      this.loadBalancerBackendAddressPools = defaults.loadBalancerBackendAddressPools;
    	      this.name = defaults.name;
    	      this.primary = defaults.primary;
    	      this.privateIPAddressVersion = defaults.privateIPAddressVersion;
    	      this.publicIPAddressConfiguration = defaults.publicIPAddressConfiguration;
    	      this.subnet = defaults.subnet;
        }

        public Builder applicationGatewayBackendAddressPools(@Nullable List<SubResourceResponse> applicationGatewayBackendAddressPools) {
            this.applicationGatewayBackendAddressPools = applicationGatewayBackendAddressPools;
            return this;
        }
        public Builder applicationGatewayBackendAddressPools(SubResourceResponse... applicationGatewayBackendAddressPools) {
            return applicationGatewayBackendAddressPools(List.of(applicationGatewayBackendAddressPools));
        }
        public Builder applicationSecurityGroups(@Nullable List<SubResourceResponse> applicationSecurityGroups) {
            this.applicationSecurityGroups = applicationSecurityGroups;
            return this;
        }
        public Builder applicationSecurityGroups(SubResourceResponse... applicationSecurityGroups) {
            return applicationSecurityGroups(List.of(applicationSecurityGroups));
        }
        public Builder loadBalancerBackendAddressPools(@Nullable List<SubResourceResponse> loadBalancerBackendAddressPools) {
            this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
            return this;
        }
        public Builder loadBalancerBackendAddressPools(SubResourceResponse... loadBalancerBackendAddressPools) {
            return loadBalancerBackendAddressPools(List.of(loadBalancerBackendAddressPools));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder primary(@Nullable Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Builder privateIPAddressVersion(@Nullable String privateIPAddressVersion) {
            this.privateIPAddressVersion = privateIPAddressVersion;
            return this;
        }
        public Builder publicIPAddressConfiguration(@Nullable VirtualMachinePublicIPAddressConfigurationResponse publicIPAddressConfiguration) {
            this.publicIPAddressConfiguration = publicIPAddressConfiguration;
            return this;
        }
        public Builder subnet(@Nullable SubResourceResponse subnet) {
            this.subnet = subnet;
            return this;
        }        public VirtualMachineNetworkInterfaceIPConfigurationResponse build() {
            return new VirtualMachineNetworkInterfaceIPConfigurationResponse(applicationGatewayBackendAddressPools, applicationSecurityGroups, loadBalancerBackendAddressPools, name, primary, privateIPAddressVersion, publicIPAddressConfiguration, subnet);
        }
    }
}
