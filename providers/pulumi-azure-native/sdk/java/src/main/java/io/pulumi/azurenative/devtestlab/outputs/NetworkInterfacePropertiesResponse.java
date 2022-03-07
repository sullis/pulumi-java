// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.azurenative.devtestlab.outputs.SharedPublicIpAddressConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkInterfacePropertiesResponse {
    /**
     * The DNS name.
     * 
     */
    private final @Nullable String dnsName;
    /**
     * The private IP address.
     * 
     */
    private final @Nullable String privateIpAddress;
    /**
     * The public IP address.
     * 
     */
    private final @Nullable String publicIpAddress;
    /**
     * The resource ID of the public IP address.
     * 
     */
    private final @Nullable String publicIpAddressId;
    /**
     * The RdpAuthority property is a server DNS host name or IP address followed by the service port number for RDP (Remote Desktop Protocol).
     * 
     */
    private final @Nullable String rdpAuthority;
    /**
     * The configuration for sharing a public IP address across multiple virtual machines.
     * 
     */
    private final @Nullable SharedPublicIpAddressConfigurationResponse sharedPublicIpAddressConfiguration;
    /**
     * The SshAuthority property is a server DNS host name or IP address followed by the service port number for SSH.
     * 
     */
    private final @Nullable String sshAuthority;
    /**
     * The resource ID of the sub net.
     * 
     */
    private final @Nullable String subnetId;
    /**
     * The resource ID of the virtual network.
     * 
     */
    private final @Nullable String virtualNetworkId;

    @OutputCustomType.Constructor({"dnsName","privateIpAddress","publicIpAddress","publicIpAddressId","rdpAuthority","sharedPublicIpAddressConfiguration","sshAuthority","subnetId","virtualNetworkId"})
    private NetworkInterfacePropertiesResponse(
        @Nullable String dnsName,
        @Nullable String privateIpAddress,
        @Nullable String publicIpAddress,
        @Nullable String publicIpAddressId,
        @Nullable String rdpAuthority,
        @Nullable SharedPublicIpAddressConfigurationResponse sharedPublicIpAddressConfiguration,
        @Nullable String sshAuthority,
        @Nullable String subnetId,
        @Nullable String virtualNetworkId) {
        this.dnsName = dnsName;
        this.privateIpAddress = privateIpAddress;
        this.publicIpAddress = publicIpAddress;
        this.publicIpAddressId = publicIpAddressId;
        this.rdpAuthority = rdpAuthority;
        this.sharedPublicIpAddressConfiguration = sharedPublicIpAddressConfiguration;
        this.sshAuthority = sshAuthority;
        this.subnetId = subnetId;
        this.virtualNetworkId = virtualNetworkId;
    }

    /**
     * The DNS name.
     * 
    */
    public Optional<String> getDnsName() {
        return Optional.ofNullable(this.dnsName);
    }
    /**
     * The private IP address.
     * 
    */
    public Optional<String> getPrivateIpAddress() {
        return Optional.ofNullable(this.privateIpAddress);
    }
    /**
     * The public IP address.
     * 
    */
    public Optional<String> getPublicIpAddress() {
        return Optional.ofNullable(this.publicIpAddress);
    }
    /**
     * The resource ID of the public IP address.
     * 
    */
    public Optional<String> getPublicIpAddressId() {
        return Optional.ofNullable(this.publicIpAddressId);
    }
    /**
     * The RdpAuthority property is a server DNS host name or IP address followed by the service port number for RDP (Remote Desktop Protocol).
     * 
    */
    public Optional<String> getRdpAuthority() {
        return Optional.ofNullable(this.rdpAuthority);
    }
    /**
     * The configuration for sharing a public IP address across multiple virtual machines.
     * 
    */
    public Optional<SharedPublicIpAddressConfigurationResponse> getSharedPublicIpAddressConfiguration() {
        return Optional.ofNullable(this.sharedPublicIpAddressConfiguration);
    }
    /**
     * The SshAuthority property is a server DNS host name or IP address followed by the service port number for SSH.
     * 
    */
    public Optional<String> getSshAuthority() {
        return Optional.ofNullable(this.sshAuthority);
    }
    /**
     * The resource ID of the sub net.
     * 
    */
    public Optional<String> getSubnetId() {
        return Optional.ofNullable(this.subnetId);
    }
    /**
     * The resource ID of the virtual network.
     * 
    */
    public Optional<String> getVirtualNetworkId() {
        return Optional.ofNullable(this.virtualNetworkId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfacePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dnsName;
        private @Nullable String privateIpAddress;
        private @Nullable String publicIpAddress;
        private @Nullable String publicIpAddressId;
        private @Nullable String rdpAuthority;
        private @Nullable SharedPublicIpAddressConfigurationResponse sharedPublicIpAddressConfiguration;
        private @Nullable String sshAuthority;
        private @Nullable String subnetId;
        private @Nullable String virtualNetworkId;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfacePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsName = defaults.dnsName;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.publicIpAddress = defaults.publicIpAddress;
    	      this.publicIpAddressId = defaults.publicIpAddressId;
    	      this.rdpAuthority = defaults.rdpAuthority;
    	      this.sharedPublicIpAddressConfiguration = defaults.sharedPublicIpAddressConfiguration;
    	      this.sshAuthority = defaults.sshAuthority;
    	      this.subnetId = defaults.subnetId;
    	      this.virtualNetworkId = defaults.virtualNetworkId;
        }

        public Builder setDnsName(@Nullable String dnsName) {
            this.dnsName = dnsName;
            return this;
        }

        public Builder setPrivateIpAddress(@Nullable String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        public Builder setPublicIpAddress(@Nullable String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }

        public Builder setPublicIpAddressId(@Nullable String publicIpAddressId) {
            this.publicIpAddressId = publicIpAddressId;
            return this;
        }

        public Builder setRdpAuthority(@Nullable String rdpAuthority) {
            this.rdpAuthority = rdpAuthority;
            return this;
        }

        public Builder setSharedPublicIpAddressConfiguration(@Nullable SharedPublicIpAddressConfigurationResponse sharedPublicIpAddressConfiguration) {
            this.sharedPublicIpAddressConfiguration = sharedPublicIpAddressConfiguration;
            return this;
        }

        public Builder setSshAuthority(@Nullable String sshAuthority) {
            this.sshAuthority = sshAuthority;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder setVirtualNetworkId(@Nullable String virtualNetworkId) {
            this.virtualNetworkId = virtualNetworkId;
            return this;
        }
        public NetworkInterfacePropertiesResponse build() {
            return new NetworkInterfacePropertiesResponse(dnsName, privateIpAddress, publicIpAddress, publicIpAddressId, rdpAuthority, sharedPublicIpAddressConfiguration, sshAuthority, subnetId, virtualNetworkId);
        }
    }
}