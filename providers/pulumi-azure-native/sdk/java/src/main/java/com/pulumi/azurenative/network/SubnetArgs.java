// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.enums.VirtualNetworkPrivateEndpointNetworkPolicies;
import com.pulumi.azurenative.network.enums.VirtualNetworkPrivateLinkServiceNetworkPolicies;
import com.pulumi.azurenative.network.inputs.ApplicationGatewayIPConfigurationArgs;
import com.pulumi.azurenative.network.inputs.DelegationArgs;
import com.pulumi.azurenative.network.inputs.NetworkSecurityGroupArgs;
import com.pulumi.azurenative.network.inputs.RouteTableArgs;
import com.pulumi.azurenative.network.inputs.ServiceEndpointPolicyArgs;
import com.pulumi.azurenative.network.inputs.ServiceEndpointPropertiesFormatArgs;
import com.pulumi.azurenative.network.inputs.SubResourceArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubnetArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubnetArgs Empty = new SubnetArgs();

    /**
     * The address prefix for the subnet.
     * 
     */
    @Import(name="addressPrefix")
    private @Nullable Output<String> addressPrefix;

    /**
     * @return The address prefix for the subnet.
     * 
     */
    public Optional<Output<String>> addressPrefix() {
        return Optional.ofNullable(this.addressPrefix);
    }

    /**
     * List of address prefixes for the subnet.
     * 
     */
    @Import(name="addressPrefixes")
    private @Nullable Output<List<String>> addressPrefixes;

    /**
     * @return List of address prefixes for the subnet.
     * 
     */
    public Optional<Output<List<String>>> addressPrefixes() {
        return Optional.ofNullable(this.addressPrefixes);
    }

    /**
     * Application gateway IP configurations of virtual network resource.
     * 
     */
    @Import(name="applicationGatewayIpConfigurations")
    private @Nullable Output<List<ApplicationGatewayIPConfigurationArgs>> applicationGatewayIpConfigurations;

    /**
     * @return Application gateway IP configurations of virtual network resource.
     * 
     */
    public Optional<Output<List<ApplicationGatewayIPConfigurationArgs>>> applicationGatewayIpConfigurations() {
        return Optional.ofNullable(this.applicationGatewayIpConfigurations);
    }

    /**
     * An array of references to the delegations on the subnet.
     * 
     */
    @Import(name="delegations")
    private @Nullable Output<List<DelegationArgs>> delegations;

    /**
     * @return An array of references to the delegations on the subnet.
     * 
     */
    public Optional<Output<List<DelegationArgs>>> delegations() {
        return Optional.ofNullable(this.delegations);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Array of IpAllocation which reference this subnet.
     * 
     */
    @Import(name="ipAllocations")
    private @Nullable Output<List<SubResourceArgs>> ipAllocations;

    /**
     * @return Array of IpAllocation which reference this subnet.
     * 
     */
    public Optional<Output<List<SubResourceArgs>>> ipAllocations() {
        return Optional.ofNullable(this.ipAllocations);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Nat gateway associated with this subnet.
     * 
     */
    @Import(name="natGateway")
    private @Nullable Output<SubResourceArgs> natGateway;

    /**
     * @return Nat gateway associated with this subnet.
     * 
     */
    public Optional<Output<SubResourceArgs>> natGateway() {
        return Optional.ofNullable(this.natGateway);
    }

    /**
     * The reference to the NetworkSecurityGroup resource.
     * 
     */
    @Import(name="networkSecurityGroup")
    private @Nullable Output<NetworkSecurityGroupArgs> networkSecurityGroup;

    /**
     * @return The reference to the NetworkSecurityGroup resource.
     * 
     */
    public Optional<Output<NetworkSecurityGroupArgs>> networkSecurityGroup() {
        return Optional.ofNullable(this.networkSecurityGroup);
    }

    /**
     * Enable or Disable apply network policies on private end point in the subnet.
     * 
     */
    @Import(name="privateEndpointNetworkPolicies")
    private @Nullable Output<Either<String,VirtualNetworkPrivateEndpointNetworkPolicies>> privateEndpointNetworkPolicies;

    /**
     * @return Enable or Disable apply network policies on private end point in the subnet.
     * 
     */
    public Optional<Output<Either<String,VirtualNetworkPrivateEndpointNetworkPolicies>>> privateEndpointNetworkPolicies() {
        return Optional.ofNullable(this.privateEndpointNetworkPolicies);
    }

    /**
     * Enable or Disable apply network policies on private link service in the subnet.
     * 
     */
    @Import(name="privateLinkServiceNetworkPolicies")
    private @Nullable Output<Either<String,VirtualNetworkPrivateLinkServiceNetworkPolicies>> privateLinkServiceNetworkPolicies;

    /**
     * @return Enable or Disable apply network policies on private link service in the subnet.
     * 
     */
    public Optional<Output<Either<String,VirtualNetworkPrivateLinkServiceNetworkPolicies>>> privateLinkServiceNetworkPolicies() {
        return Optional.ofNullable(this.privateLinkServiceNetworkPolicies);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The reference to the RouteTable resource.
     * 
     */
    @Import(name="routeTable")
    private @Nullable Output<RouteTableArgs> routeTable;

    /**
     * @return The reference to the RouteTable resource.
     * 
     */
    public Optional<Output<RouteTableArgs>> routeTable() {
        return Optional.ofNullable(this.routeTable);
    }

    /**
     * An array of service endpoint policies.
     * 
     */
    @Import(name="serviceEndpointPolicies")
    private @Nullable Output<List<ServiceEndpointPolicyArgs>> serviceEndpointPolicies;

    /**
     * @return An array of service endpoint policies.
     * 
     */
    public Optional<Output<List<ServiceEndpointPolicyArgs>>> serviceEndpointPolicies() {
        return Optional.ofNullable(this.serviceEndpointPolicies);
    }

    /**
     * An array of service endpoints.
     * 
     */
    @Import(name="serviceEndpoints")
    private @Nullable Output<List<ServiceEndpointPropertiesFormatArgs>> serviceEndpoints;

    /**
     * @return An array of service endpoints.
     * 
     */
    public Optional<Output<List<ServiceEndpointPropertiesFormatArgs>>> serviceEndpoints() {
        return Optional.ofNullable(this.serviceEndpoints);
    }

    /**
     * The name of the subnet.
     * 
     */
    @Import(name="subnetName")
    private @Nullable Output<String> subnetName;

    /**
     * @return The name of the subnet.
     * 
     */
    public Optional<Output<String>> subnetName() {
        return Optional.ofNullable(this.subnetName);
    }

    /**
     * Resource type.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The name of the virtual network.
     * 
     */
    @Import(name="virtualNetworkName", required=true)
    private Output<String> virtualNetworkName;

    /**
     * @return The name of the virtual network.
     * 
     */
    public Output<String> virtualNetworkName() {
        return this.virtualNetworkName;
    }

    private SubnetArgs() {}

    private SubnetArgs(SubnetArgs $) {
        this.addressPrefix = $.addressPrefix;
        this.addressPrefixes = $.addressPrefixes;
        this.applicationGatewayIpConfigurations = $.applicationGatewayIpConfigurations;
        this.delegations = $.delegations;
        this.id = $.id;
        this.ipAllocations = $.ipAllocations;
        this.name = $.name;
        this.natGateway = $.natGateway;
        this.networkSecurityGroup = $.networkSecurityGroup;
        this.privateEndpointNetworkPolicies = $.privateEndpointNetworkPolicies;
        this.privateLinkServiceNetworkPolicies = $.privateLinkServiceNetworkPolicies;
        this.resourceGroupName = $.resourceGroupName;
        this.routeTable = $.routeTable;
        this.serviceEndpointPolicies = $.serviceEndpointPolicies;
        this.serviceEndpoints = $.serviceEndpoints;
        this.subnetName = $.subnetName;
        this.type = $.type;
        this.virtualNetworkName = $.virtualNetworkName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubnetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubnetArgs $;

        public Builder() {
            $ = new SubnetArgs();
        }

        public Builder(SubnetArgs defaults) {
            $ = new SubnetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressPrefix The address prefix for the subnet.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefix(@Nullable Output<String> addressPrefix) {
            $.addressPrefix = addressPrefix;
            return this;
        }

        /**
         * @param addressPrefix The address prefix for the subnet.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefix(String addressPrefix) {
            return addressPrefix(Output.of(addressPrefix));
        }

        /**
         * @param addressPrefixes List of address prefixes for the subnet.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixes(@Nullable Output<List<String>> addressPrefixes) {
            $.addressPrefixes = addressPrefixes;
            return this;
        }

        /**
         * @param addressPrefixes List of address prefixes for the subnet.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixes(List<String> addressPrefixes) {
            return addressPrefixes(Output.of(addressPrefixes));
        }

        /**
         * @param addressPrefixes List of address prefixes for the subnet.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixes(String... addressPrefixes) {
            return addressPrefixes(List.of(addressPrefixes));
        }

        /**
         * @param applicationGatewayIpConfigurations Application gateway IP configurations of virtual network resource.
         * 
         * @return builder
         * 
         */
        public Builder applicationGatewayIpConfigurations(@Nullable Output<List<ApplicationGatewayIPConfigurationArgs>> applicationGatewayIpConfigurations) {
            $.applicationGatewayIpConfigurations = applicationGatewayIpConfigurations;
            return this;
        }

        /**
         * @param applicationGatewayIpConfigurations Application gateway IP configurations of virtual network resource.
         * 
         * @return builder
         * 
         */
        public Builder applicationGatewayIpConfigurations(List<ApplicationGatewayIPConfigurationArgs> applicationGatewayIpConfigurations) {
            return applicationGatewayIpConfigurations(Output.of(applicationGatewayIpConfigurations));
        }

        /**
         * @param applicationGatewayIpConfigurations Application gateway IP configurations of virtual network resource.
         * 
         * @return builder
         * 
         */
        public Builder applicationGatewayIpConfigurations(ApplicationGatewayIPConfigurationArgs... applicationGatewayIpConfigurations) {
            return applicationGatewayIpConfigurations(List.of(applicationGatewayIpConfigurations));
        }

        /**
         * @param delegations An array of references to the delegations on the subnet.
         * 
         * @return builder
         * 
         */
        public Builder delegations(@Nullable Output<List<DelegationArgs>> delegations) {
            $.delegations = delegations;
            return this;
        }

        /**
         * @param delegations An array of references to the delegations on the subnet.
         * 
         * @return builder
         * 
         */
        public Builder delegations(List<DelegationArgs> delegations) {
            return delegations(Output.of(delegations));
        }

        /**
         * @param delegations An array of references to the delegations on the subnet.
         * 
         * @return builder
         * 
         */
        public Builder delegations(DelegationArgs... delegations) {
            return delegations(List.of(delegations));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param ipAllocations Array of IpAllocation which reference this subnet.
         * 
         * @return builder
         * 
         */
        public Builder ipAllocations(@Nullable Output<List<SubResourceArgs>> ipAllocations) {
            $.ipAllocations = ipAllocations;
            return this;
        }

        /**
         * @param ipAllocations Array of IpAllocation which reference this subnet.
         * 
         * @return builder
         * 
         */
        public Builder ipAllocations(List<SubResourceArgs> ipAllocations) {
            return ipAllocations(Output.of(ipAllocations));
        }

        /**
         * @param ipAllocations Array of IpAllocation which reference this subnet.
         * 
         * @return builder
         * 
         */
        public Builder ipAllocations(SubResourceArgs... ipAllocations) {
            return ipAllocations(List.of(ipAllocations));
        }

        /**
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param natGateway Nat gateway associated with this subnet.
         * 
         * @return builder
         * 
         */
        public Builder natGateway(@Nullable Output<SubResourceArgs> natGateway) {
            $.natGateway = natGateway;
            return this;
        }

        /**
         * @param natGateway Nat gateway associated with this subnet.
         * 
         * @return builder
         * 
         */
        public Builder natGateway(SubResourceArgs natGateway) {
            return natGateway(Output.of(natGateway));
        }

        /**
         * @param networkSecurityGroup The reference to the NetworkSecurityGroup resource.
         * 
         * @return builder
         * 
         */
        public Builder networkSecurityGroup(@Nullable Output<NetworkSecurityGroupArgs> networkSecurityGroup) {
            $.networkSecurityGroup = networkSecurityGroup;
            return this;
        }

        /**
         * @param networkSecurityGroup The reference to the NetworkSecurityGroup resource.
         * 
         * @return builder
         * 
         */
        public Builder networkSecurityGroup(NetworkSecurityGroupArgs networkSecurityGroup) {
            return networkSecurityGroup(Output.of(networkSecurityGroup));
        }

        /**
         * @param privateEndpointNetworkPolicies Enable or Disable apply network policies on private end point in the subnet.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointNetworkPolicies(@Nullable Output<Either<String,VirtualNetworkPrivateEndpointNetworkPolicies>> privateEndpointNetworkPolicies) {
            $.privateEndpointNetworkPolicies = privateEndpointNetworkPolicies;
            return this;
        }

        /**
         * @param privateEndpointNetworkPolicies Enable or Disable apply network policies on private end point in the subnet.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointNetworkPolicies(Either<String,VirtualNetworkPrivateEndpointNetworkPolicies> privateEndpointNetworkPolicies) {
            return privateEndpointNetworkPolicies(Output.of(privateEndpointNetworkPolicies));
        }

        /**
         * @param privateEndpointNetworkPolicies Enable or Disable apply network policies on private end point in the subnet.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointNetworkPolicies(String privateEndpointNetworkPolicies) {
            return privateEndpointNetworkPolicies(Either.ofLeft(privateEndpointNetworkPolicies));
        }

        /**
         * @param privateEndpointNetworkPolicies Enable or Disable apply network policies on private end point in the subnet.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointNetworkPolicies(VirtualNetworkPrivateEndpointNetworkPolicies privateEndpointNetworkPolicies) {
            return privateEndpointNetworkPolicies(Either.ofRight(privateEndpointNetworkPolicies));
        }

        /**
         * @param privateLinkServiceNetworkPolicies Enable or Disable apply network policies on private link service in the subnet.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceNetworkPolicies(@Nullable Output<Either<String,VirtualNetworkPrivateLinkServiceNetworkPolicies>> privateLinkServiceNetworkPolicies) {
            $.privateLinkServiceNetworkPolicies = privateLinkServiceNetworkPolicies;
            return this;
        }

        /**
         * @param privateLinkServiceNetworkPolicies Enable or Disable apply network policies on private link service in the subnet.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceNetworkPolicies(Either<String,VirtualNetworkPrivateLinkServiceNetworkPolicies> privateLinkServiceNetworkPolicies) {
            return privateLinkServiceNetworkPolicies(Output.of(privateLinkServiceNetworkPolicies));
        }

        /**
         * @param privateLinkServiceNetworkPolicies Enable or Disable apply network policies on private link service in the subnet.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceNetworkPolicies(String privateLinkServiceNetworkPolicies) {
            return privateLinkServiceNetworkPolicies(Either.ofLeft(privateLinkServiceNetworkPolicies));
        }

        /**
         * @param privateLinkServiceNetworkPolicies Enable or Disable apply network policies on private link service in the subnet.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceNetworkPolicies(VirtualNetworkPrivateLinkServiceNetworkPolicies privateLinkServiceNetworkPolicies) {
            return privateLinkServiceNetworkPolicies(Either.ofRight(privateLinkServiceNetworkPolicies));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param routeTable The reference to the RouteTable resource.
         * 
         * @return builder
         * 
         */
        public Builder routeTable(@Nullable Output<RouteTableArgs> routeTable) {
            $.routeTable = routeTable;
            return this;
        }

        /**
         * @param routeTable The reference to the RouteTable resource.
         * 
         * @return builder
         * 
         */
        public Builder routeTable(RouteTableArgs routeTable) {
            return routeTable(Output.of(routeTable));
        }

        /**
         * @param serviceEndpointPolicies An array of service endpoint policies.
         * 
         * @return builder
         * 
         */
        public Builder serviceEndpointPolicies(@Nullable Output<List<ServiceEndpointPolicyArgs>> serviceEndpointPolicies) {
            $.serviceEndpointPolicies = serviceEndpointPolicies;
            return this;
        }

        /**
         * @param serviceEndpointPolicies An array of service endpoint policies.
         * 
         * @return builder
         * 
         */
        public Builder serviceEndpointPolicies(List<ServiceEndpointPolicyArgs> serviceEndpointPolicies) {
            return serviceEndpointPolicies(Output.of(serviceEndpointPolicies));
        }

        /**
         * @param serviceEndpointPolicies An array of service endpoint policies.
         * 
         * @return builder
         * 
         */
        public Builder serviceEndpointPolicies(ServiceEndpointPolicyArgs... serviceEndpointPolicies) {
            return serviceEndpointPolicies(List.of(serviceEndpointPolicies));
        }

        /**
         * @param serviceEndpoints An array of service endpoints.
         * 
         * @return builder
         * 
         */
        public Builder serviceEndpoints(@Nullable Output<List<ServiceEndpointPropertiesFormatArgs>> serviceEndpoints) {
            $.serviceEndpoints = serviceEndpoints;
            return this;
        }

        /**
         * @param serviceEndpoints An array of service endpoints.
         * 
         * @return builder
         * 
         */
        public Builder serviceEndpoints(List<ServiceEndpointPropertiesFormatArgs> serviceEndpoints) {
            return serviceEndpoints(Output.of(serviceEndpoints));
        }

        /**
         * @param serviceEndpoints An array of service endpoints.
         * 
         * @return builder
         * 
         */
        public Builder serviceEndpoints(ServiceEndpointPropertiesFormatArgs... serviceEndpoints) {
            return serviceEndpoints(List.of(serviceEndpoints));
        }

        /**
         * @param subnetName The name of the subnet.
         * 
         * @return builder
         * 
         */
        public Builder subnetName(@Nullable Output<String> subnetName) {
            $.subnetName = subnetName;
            return this;
        }

        /**
         * @param subnetName The name of the subnet.
         * 
         * @return builder
         * 
         */
        public Builder subnetName(String subnetName) {
            return subnetName(Output.of(subnetName));
        }

        /**
         * @param type Resource type.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Resource type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param virtualNetworkName The name of the virtual network.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkName(Output<String> virtualNetworkName) {
            $.virtualNetworkName = virtualNetworkName;
            return this;
        }

        /**
         * @param virtualNetworkName The name of the virtual network.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkName(String virtualNetworkName) {
            return virtualNetworkName(Output.of(virtualNetworkName));
        }

        public SubnetArgs build() {
            $.privateEndpointNetworkPolicies = Codegen.stringProp("privateEndpointNetworkPolicies").left(VirtualNetworkPrivateEndpointNetworkPolicies.class).output().arg($.privateEndpointNetworkPolicies).def("Enabled").getNullable();
            $.privateLinkServiceNetworkPolicies = Codegen.stringProp("privateLinkServiceNetworkPolicies").left(VirtualNetworkPrivateLinkServiceNetworkPolicies.class).output().arg($.privateLinkServiceNetworkPolicies).def("Enabled").getNullable();
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualNetworkName = Objects.requireNonNull($.virtualNetworkName, "expected parameter 'virtualNetworkName' to be non-null");
            return $;
        }
    }

}
