// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.IPAllocationMethod;
import io.pulumi.azurenative.network.inputs.PublicIPAddressArgs;
import io.pulumi.azurenative.network.inputs.SubnetArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualHubIpConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualHubIpConfigurationArgs Empty = new VirtualHubIpConfigurationArgs();

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The name of the ipconfig.
     * 
     */
    @InputImport(name="ipConfigName")
    private final @Nullable Input<String> ipConfigName;

    public Input<String> getIpConfigName() {
        return this.ipConfigName == null ? Input.empty() : this.ipConfigName;
    }

    /**
     * Name of the Ip Configuration.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The private IP address of the IP configuration.
     * 
     */
    @InputImport(name="privateIPAddress")
    private final @Nullable Input<String> privateIPAddress;

    public Input<String> getPrivateIPAddress() {
        return this.privateIPAddress == null ? Input.empty() : this.privateIPAddress;
    }

    /**
     * The private IP address allocation method.
     * 
     */
    @InputImport(name="privateIPAllocationMethod")
    private final @Nullable Input<Either<String,IPAllocationMethod>> privateIPAllocationMethod;

    public Input<Either<String,IPAllocationMethod>> getPrivateIPAllocationMethod() {
        return this.privateIPAllocationMethod == null ? Input.empty() : this.privateIPAllocationMethod;
    }

    /**
     * The reference to the public IP resource.
     * 
     */
    @InputImport(name="publicIPAddress")
    private final @Nullable Input<PublicIPAddressArgs> publicIPAddress;

    public Input<PublicIPAddressArgs> getPublicIPAddress() {
        return this.publicIPAddress == null ? Input.empty() : this.publicIPAddress;
    }

    /**
     * The resource group name of the VirtualHub.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The reference to the subnet resource.
     * 
     */
    @InputImport(name="subnet")
    private final @Nullable Input<SubnetArgs> subnet;

    public Input<SubnetArgs> getSubnet() {
        return this.subnet == null ? Input.empty() : this.subnet;
    }

    /**
     * The name of the VirtualHub.
     * 
     */
    @InputImport(name="virtualHubName", required=true)
    private final Input<String> virtualHubName;

    public Input<String> getVirtualHubName() {
        return this.virtualHubName;
    }

    public VirtualHubIpConfigurationArgs(
        @Nullable Input<String> id,
        @Nullable Input<String> ipConfigName,
        @Nullable Input<String> name,
        @Nullable Input<String> privateIPAddress,
        @Nullable Input<Either<String,IPAllocationMethod>> privateIPAllocationMethod,
        @Nullable Input<PublicIPAddressArgs> publicIPAddress,
        Input<String> resourceGroupName,
        @Nullable Input<SubnetArgs> subnet,
        Input<String> virtualHubName) {
        this.id = id;
        this.ipConfigName = ipConfigName;
        this.name = name;
        this.privateIPAddress = privateIPAddress;
        this.privateIPAllocationMethod = privateIPAllocationMethod;
        this.publicIPAddress = publicIPAddress;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.subnet = subnet;
        this.virtualHubName = Objects.requireNonNull(virtualHubName, "expected parameter 'virtualHubName' to be non-null");
    }

    private VirtualHubIpConfigurationArgs() {
        this.id = Input.empty();
        this.ipConfigName = Input.empty();
        this.name = Input.empty();
        this.privateIPAddress = Input.empty();
        this.privateIPAllocationMethod = Input.empty();
        this.publicIPAddress = Input.empty();
        this.resourceGroupName = Input.empty();
        this.subnet = Input.empty();
        this.virtualHubName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualHubIpConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<String> ipConfigName;
        private @Nullable Input<String> name;
        private @Nullable Input<String> privateIPAddress;
        private @Nullable Input<Either<String,IPAllocationMethod>> privateIPAllocationMethod;
        private @Nullable Input<PublicIPAddressArgs> publicIPAddress;
        private Input<String> resourceGroupName;
        private @Nullable Input<SubnetArgs> subnet;
        private Input<String> virtualHubName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualHubIpConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ipConfigName = defaults.ipConfigName;
    	      this.name = defaults.name;
    	      this.privateIPAddress = defaults.privateIPAddress;
    	      this.privateIPAllocationMethod = defaults.privateIPAllocationMethod;
    	      this.publicIPAddress = defaults.publicIPAddress;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.subnet = defaults.subnet;
    	      this.virtualHubName = defaults.virtualHubName;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setIpConfigName(@Nullable Input<String> ipConfigName) {
            this.ipConfigName = ipConfigName;
            return this;
        }

        public Builder setIpConfigName(@Nullable String ipConfigName) {
            this.ipConfigName = Input.ofNullable(ipConfigName);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPrivateIPAddress(@Nullable Input<String> privateIPAddress) {
            this.privateIPAddress = privateIPAddress;
            return this;
        }

        public Builder setPrivateIPAddress(@Nullable String privateIPAddress) {
            this.privateIPAddress = Input.ofNullable(privateIPAddress);
            return this;
        }

        public Builder setPrivateIPAllocationMethod(@Nullable Input<Either<String,IPAllocationMethod>> privateIPAllocationMethod) {
            this.privateIPAllocationMethod = privateIPAllocationMethod;
            return this;
        }

        public Builder setPrivateIPAllocationMethod(@Nullable Either<String,IPAllocationMethod> privateIPAllocationMethod) {
            this.privateIPAllocationMethod = Input.ofNullable(privateIPAllocationMethod);
            return this;
        }

        public Builder setPublicIPAddress(@Nullable Input<PublicIPAddressArgs> publicIPAddress) {
            this.publicIPAddress = publicIPAddress;
            return this;
        }

        public Builder setPublicIPAddress(@Nullable PublicIPAddressArgs publicIPAddress) {
            this.publicIPAddress = Input.ofNullable(publicIPAddress);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSubnet(@Nullable Input<SubnetArgs> subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder setSubnet(@Nullable SubnetArgs subnet) {
            this.subnet = Input.ofNullable(subnet);
            return this;
        }

        public Builder setVirtualHubName(Input<String> virtualHubName) {
            this.virtualHubName = Objects.requireNonNull(virtualHubName);
            return this;
        }

        public Builder setVirtualHubName(String virtualHubName) {
            this.virtualHubName = Input.of(Objects.requireNonNull(virtualHubName));
            return this;
        }

        public VirtualHubIpConfigurationArgs build() {
            return new VirtualHubIpConfigurationArgs(id, ipConfigName, name, privateIPAddress, privateIPAllocationMethod, publicIPAddress, resourceGroupName, subnet, virtualHubName);
        }
    }
}
