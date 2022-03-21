// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.AddressSpaceArgs;
import io.pulumi.azurenative.network.inputs.DhcpOptionsArgs;
import io.pulumi.azurenative.network.inputs.ExtendedLocationArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.azurenative.network.inputs.SubnetArgs;
import io.pulumi.azurenative.network.inputs.VirtualNetworkBgpCommunitiesArgs;
import io.pulumi.azurenative.network.inputs.VirtualNetworkPeeringArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNetworkArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkArgs Empty = new VirtualNetworkArgs();

    /**
     * The AddressSpace that contains an array of IP address ranges that can be used by subnets.
     * 
     */
    @Import(name="addressSpace")
      private final @Nullable Output<AddressSpaceArgs> addressSpace;

    public Output<AddressSpaceArgs> getAddressSpace() {
        return this.addressSpace == null ? Output.empty() : this.addressSpace;
    }

    /**
     * Bgp Communities sent over ExpressRoute with each route corresponding to a prefix in this VNET.
     * 
     */
    @Import(name="bgpCommunities")
      private final @Nullable Output<VirtualNetworkBgpCommunitiesArgs> bgpCommunities;

    public Output<VirtualNetworkBgpCommunitiesArgs> getBgpCommunities() {
        return this.bgpCommunities == null ? Output.empty() : this.bgpCommunities;
    }

    /**
     * The DDoS protection plan associated with the virtual network.
     * 
     */
    @Import(name="ddosProtectionPlan")
      private final @Nullable Output<SubResourceArgs> ddosProtectionPlan;

    public Output<SubResourceArgs> getDdosProtectionPlan() {
        return this.ddosProtectionPlan == null ? Output.empty() : this.ddosProtectionPlan;
    }

    /**
     * The dhcpOptions that contains an array of DNS servers available to VMs deployed in the virtual network.
     * 
     */
    @Import(name="dhcpOptions")
      private final @Nullable Output<DhcpOptionsArgs> dhcpOptions;

    public Output<DhcpOptionsArgs> getDhcpOptions() {
        return this.dhcpOptions == null ? Output.empty() : this.dhcpOptions;
    }

    /**
     * Indicates if DDoS protection is enabled for all the protected resources in the virtual network. It requires a DDoS protection plan associated with the resource.
     * 
     */
    @Import(name="enableDdosProtection")
      private final @Nullable Output<Boolean> enableDdosProtection;

    public Output<Boolean> getEnableDdosProtection() {
        return this.enableDdosProtection == null ? Output.empty() : this.enableDdosProtection;
    }

    /**
     * Indicates if VM protection is enabled for all the subnets in the virtual network.
     * 
     */
    @Import(name="enableVmProtection")
      private final @Nullable Output<Boolean> enableVmProtection;

    public Output<Boolean> getEnableVmProtection() {
        return this.enableVmProtection == null ? Output.empty() : this.enableVmProtection;
    }

    /**
     * The extended location of the virtual network.
     * 
     */
    @Import(name="extendedLocation")
      private final @Nullable Output<ExtendedLocationArgs> extendedLocation;

    public Output<ExtendedLocationArgs> getExtendedLocation() {
        return this.extendedLocation == null ? Output.empty() : this.extendedLocation;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * Array of IpAllocation which reference this VNET.
     * 
     */
    @Import(name="ipAllocations")
      private final @Nullable Output<List<SubResourceArgs>> ipAllocations;

    public Output<List<SubResourceArgs>> getIpAllocations() {
        return this.ipAllocations == null ? Output.empty() : this.ipAllocations;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A list of subnets in a Virtual Network.
     * 
     */
    @Import(name="subnets")
      private final @Nullable Output<List<SubnetArgs>> subnets;

    public Output<List<SubnetArgs>> getSubnets() {
        return this.subnets == null ? Output.empty() : this.subnets;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The name of the virtual network.
     * 
     */
    @Import(name="virtualNetworkName")
      private final @Nullable Output<String> virtualNetworkName;

    public Output<String> getVirtualNetworkName() {
        return this.virtualNetworkName == null ? Output.empty() : this.virtualNetworkName;
    }

    /**
     * A list of peerings in a Virtual Network.
     * 
     */
    @Import(name="virtualNetworkPeerings")
      private final @Nullable Output<List<VirtualNetworkPeeringArgs>> virtualNetworkPeerings;

    public Output<List<VirtualNetworkPeeringArgs>> getVirtualNetworkPeerings() {
        return this.virtualNetworkPeerings == null ? Output.empty() : this.virtualNetworkPeerings;
    }

    public VirtualNetworkArgs(
        @Nullable Output<AddressSpaceArgs> addressSpace,
        @Nullable Output<VirtualNetworkBgpCommunitiesArgs> bgpCommunities,
        @Nullable Output<SubResourceArgs> ddosProtectionPlan,
        @Nullable Output<DhcpOptionsArgs> dhcpOptions,
        @Nullable Output<Boolean> enableDdosProtection,
        @Nullable Output<Boolean> enableVmProtection,
        @Nullable Output<ExtendedLocationArgs> extendedLocation,
        @Nullable Output<String> id,
        @Nullable Output<List<SubResourceArgs>> ipAllocations,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<List<SubnetArgs>> subnets,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> virtualNetworkName,
        @Nullable Output<List<VirtualNetworkPeeringArgs>> virtualNetworkPeerings) {
        this.addressSpace = addressSpace;
        this.bgpCommunities = bgpCommunities;
        this.ddosProtectionPlan = ddosProtectionPlan;
        this.dhcpOptions = dhcpOptions;
        this.enableDdosProtection = enableDdosProtection == null ? Output.ofNullable(false) : enableDdosProtection;
        this.enableVmProtection = enableVmProtection == null ? Output.ofNullable(false) : enableVmProtection;
        this.extendedLocation = extendedLocation;
        this.id = id;
        this.ipAllocations = ipAllocations;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.subnets = subnets;
        this.tags = tags;
        this.virtualNetworkName = virtualNetworkName;
        this.virtualNetworkPeerings = virtualNetworkPeerings;
    }

    private VirtualNetworkArgs() {
        this.addressSpace = Output.empty();
        this.bgpCommunities = Output.empty();
        this.ddosProtectionPlan = Output.empty();
        this.dhcpOptions = Output.empty();
        this.enableDdosProtection = Output.empty();
        this.enableVmProtection = Output.empty();
        this.extendedLocation = Output.empty();
        this.id = Output.empty();
        this.ipAllocations = Output.empty();
        this.location = Output.empty();
        this.resourceGroupName = Output.empty();
        this.subnets = Output.empty();
        this.tags = Output.empty();
        this.virtualNetworkName = Output.empty();
        this.virtualNetworkPeerings = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AddressSpaceArgs> addressSpace;
        private @Nullable Output<VirtualNetworkBgpCommunitiesArgs> bgpCommunities;
        private @Nullable Output<SubResourceArgs> ddosProtectionPlan;
        private @Nullable Output<DhcpOptionsArgs> dhcpOptions;
        private @Nullable Output<Boolean> enableDdosProtection;
        private @Nullable Output<Boolean> enableVmProtection;
        private @Nullable Output<ExtendedLocationArgs> extendedLocation;
        private @Nullable Output<String> id;
        private @Nullable Output<List<SubResourceArgs>> ipAllocations;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<List<SubnetArgs>> subnets;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> virtualNetworkName;
        private @Nullable Output<List<VirtualNetworkPeeringArgs>> virtualNetworkPeerings;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressSpace = defaults.addressSpace;
    	      this.bgpCommunities = defaults.bgpCommunities;
    	      this.ddosProtectionPlan = defaults.ddosProtectionPlan;
    	      this.dhcpOptions = defaults.dhcpOptions;
    	      this.enableDdosProtection = defaults.enableDdosProtection;
    	      this.enableVmProtection = defaults.enableVmProtection;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.id = defaults.id;
    	      this.ipAllocations = defaults.ipAllocations;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.subnets = defaults.subnets;
    	      this.tags = defaults.tags;
    	      this.virtualNetworkName = defaults.virtualNetworkName;
    	      this.virtualNetworkPeerings = defaults.virtualNetworkPeerings;
        }

        public Builder addressSpace(@Nullable Output<AddressSpaceArgs> addressSpace) {
            this.addressSpace = addressSpace;
            return this;
        }
        public Builder addressSpace(@Nullable AddressSpaceArgs addressSpace) {
            this.addressSpace = Output.ofNullable(addressSpace);
            return this;
        }
        public Builder bgpCommunities(@Nullable Output<VirtualNetworkBgpCommunitiesArgs> bgpCommunities) {
            this.bgpCommunities = bgpCommunities;
            return this;
        }
        public Builder bgpCommunities(@Nullable VirtualNetworkBgpCommunitiesArgs bgpCommunities) {
            this.bgpCommunities = Output.ofNullable(bgpCommunities);
            return this;
        }
        public Builder ddosProtectionPlan(@Nullable Output<SubResourceArgs> ddosProtectionPlan) {
            this.ddosProtectionPlan = ddosProtectionPlan;
            return this;
        }
        public Builder ddosProtectionPlan(@Nullable SubResourceArgs ddosProtectionPlan) {
            this.ddosProtectionPlan = Output.ofNullable(ddosProtectionPlan);
            return this;
        }
        public Builder dhcpOptions(@Nullable Output<DhcpOptionsArgs> dhcpOptions) {
            this.dhcpOptions = dhcpOptions;
            return this;
        }
        public Builder dhcpOptions(@Nullable DhcpOptionsArgs dhcpOptions) {
            this.dhcpOptions = Output.ofNullable(dhcpOptions);
            return this;
        }
        public Builder enableDdosProtection(@Nullable Output<Boolean> enableDdosProtection) {
            this.enableDdosProtection = enableDdosProtection;
            return this;
        }
        public Builder enableDdosProtection(@Nullable Boolean enableDdosProtection) {
            this.enableDdosProtection = Output.ofNullable(enableDdosProtection);
            return this;
        }
        public Builder enableVmProtection(@Nullable Output<Boolean> enableVmProtection) {
            this.enableVmProtection = enableVmProtection;
            return this;
        }
        public Builder enableVmProtection(@Nullable Boolean enableVmProtection) {
            this.enableVmProtection = Output.ofNullable(enableVmProtection);
            return this;
        }
        public Builder extendedLocation(@Nullable Output<ExtendedLocationArgs> extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }
        public Builder extendedLocation(@Nullable ExtendedLocationArgs extendedLocation) {
            this.extendedLocation = Output.ofNullable(extendedLocation);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }
        public Builder ipAllocations(@Nullable Output<List<SubResourceArgs>> ipAllocations) {
            this.ipAllocations = ipAllocations;
            return this;
        }
        public Builder ipAllocations(@Nullable List<SubResourceArgs> ipAllocations) {
            this.ipAllocations = Output.ofNullable(ipAllocations);
            return this;
        }
        public Builder ipAllocations(SubResourceArgs... ipAllocations) {
            return ipAllocations(List.of(ipAllocations));
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder subnets(@Nullable Output<List<SubnetArgs>> subnets) {
            this.subnets = subnets;
            return this;
        }
        public Builder subnets(@Nullable List<SubnetArgs> subnets) {
            this.subnets = Output.ofNullable(subnets);
            return this;
        }
        public Builder subnets(SubnetArgs... subnets) {
            return subnets(List.of(subnets));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder virtualNetworkName(@Nullable Output<String> virtualNetworkName) {
            this.virtualNetworkName = virtualNetworkName;
            return this;
        }
        public Builder virtualNetworkName(@Nullable String virtualNetworkName) {
            this.virtualNetworkName = Output.ofNullable(virtualNetworkName);
            return this;
        }
        public Builder virtualNetworkPeerings(@Nullable Output<List<VirtualNetworkPeeringArgs>> virtualNetworkPeerings) {
            this.virtualNetworkPeerings = virtualNetworkPeerings;
            return this;
        }
        public Builder virtualNetworkPeerings(@Nullable List<VirtualNetworkPeeringArgs> virtualNetworkPeerings) {
            this.virtualNetworkPeerings = Output.ofNullable(virtualNetworkPeerings);
            return this;
        }
        public Builder virtualNetworkPeerings(VirtualNetworkPeeringArgs... virtualNetworkPeerings) {
            return virtualNetworkPeerings(List.of(virtualNetworkPeerings));
        }        public VirtualNetworkArgs build() {
            return new VirtualNetworkArgs(addressSpace, bgpCommunities, ddosProtectionPlan, dhcpOptions, enableDdosProtection, enableVmProtection, extendedLocation, id, ipAllocations, location, resourceGroupName, subnets, tags, virtualNetworkName, virtualNetworkPeerings);
        }
    }
}
