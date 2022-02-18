// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.AddressSpaceResponse;
import io.pulumi.azurenative.network.inputs.SubResourceResponse;
import io.pulumi.azurenative.network.inputs.VirtualNetworkBgpCommunitiesResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Peerings in a virtual network resource.
 * 
 */
public final class VirtualNetworkPeeringResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualNetworkPeeringResponse Empty = new VirtualNetworkPeeringResponse();

    /**
     * Whether the forwarded traffic from the VMs in the local virtual network will be allowed/disallowed in remote virtual network.
     * 
     */
    @InputImport(name="allowForwardedTraffic")
    private final @Nullable Boolean allowForwardedTraffic;

    public Optional<Boolean> getAllowForwardedTraffic() {
        return this.allowForwardedTraffic == null ? Optional.empty() : Optional.ofNullable(this.allowForwardedTraffic);
    }

    /**
     * If gateway links can be used in remote virtual networking to link to this virtual network.
     * 
     */
    @InputImport(name="allowGatewayTransit")
    private final @Nullable Boolean allowGatewayTransit;

    public Optional<Boolean> getAllowGatewayTransit() {
        return this.allowGatewayTransit == null ? Optional.empty() : Optional.ofNullable(this.allowGatewayTransit);
    }

    /**
     * Whether the VMs in the local virtual network space would be able to access the VMs in remote virtual network space.
     * 
     */
    @InputImport(name="allowVirtualNetworkAccess")
    private final @Nullable Boolean allowVirtualNetworkAccess;

    public Optional<Boolean> getAllowVirtualNetworkAccess() {
        return this.allowVirtualNetworkAccess == null ? Optional.empty() : Optional.ofNullable(this.allowVirtualNetworkAccess);
    }

    /**
     * If we need to verify the provisioning state of the remote gateway.
     * 
     */
    @InputImport(name="doNotVerifyRemoteGateways")
    private final @Nullable Boolean doNotVerifyRemoteGateways;

    public Optional<Boolean> getDoNotVerifyRemoteGateways() {
        return this.doNotVerifyRemoteGateways == null ? Optional.empty() : Optional.ofNullable(this.doNotVerifyRemoteGateways);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @InputImport(name="etag", required=true)
    private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The status of the virtual network peering.
     * 
     */
    @InputImport(name="peeringState")
    private final @Nullable String peeringState;

    public Optional<String> getPeeringState() {
        return this.peeringState == null ? Optional.empty() : Optional.ofNullable(this.peeringState);
    }

    /**
     * The provisioning state of the virtual network peering resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * The reference to the remote virtual network address space.
     * 
     */
    @InputImport(name="remoteAddressSpace")
    private final @Nullable AddressSpaceResponse remoteAddressSpace;

    public Optional<AddressSpaceResponse> getRemoteAddressSpace() {
        return this.remoteAddressSpace == null ? Optional.empty() : Optional.ofNullable(this.remoteAddressSpace);
    }

    /**
     * The reference to the remote virtual network's Bgp Communities.
     * 
     */
    @InputImport(name="remoteBgpCommunities")
    private final @Nullable VirtualNetworkBgpCommunitiesResponse remoteBgpCommunities;

    public Optional<VirtualNetworkBgpCommunitiesResponse> getRemoteBgpCommunities() {
        return this.remoteBgpCommunities == null ? Optional.empty() : Optional.ofNullable(this.remoteBgpCommunities);
    }

    /**
     * The reference to the remote virtual network. The remote virtual network can be in the same or different region (preview). See here to register for the preview and learn more (https://docs.microsoft.com/en-us/azure/virtual-network/virtual-network-create-peering).
     * 
     */
    @InputImport(name="remoteVirtualNetwork")
    private final @Nullable SubResourceResponse remoteVirtualNetwork;

    public Optional<SubResourceResponse> getRemoteVirtualNetwork() {
        return this.remoteVirtualNetwork == null ? Optional.empty() : Optional.ofNullable(this.remoteVirtualNetwork);
    }

    /**
     * The resourceGuid property of the Virtual Network peering resource.
     * 
     */
    @InputImport(name="resourceGuid", required=true)
    private final String resourceGuid;

    public String getResourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Resource type.
     * 
     */
    @InputImport(name="type")
    private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    /**
     * If remote gateways can be used on this virtual network. If the flag is set to true, and allowGatewayTransit on remote peering is also true, virtual network will use gateways of remote virtual network for transit. Only one peering can have this flag set to true. This flag cannot be set if virtual network already has a gateway.
     * 
     */
    @InputImport(name="useRemoteGateways")
    private final @Nullable Boolean useRemoteGateways;

    public Optional<Boolean> getUseRemoteGateways() {
        return this.useRemoteGateways == null ? Optional.empty() : Optional.ofNullable(this.useRemoteGateways);
    }

    public VirtualNetworkPeeringResponse(
        @Nullable Boolean allowForwardedTraffic,
        @Nullable Boolean allowGatewayTransit,
        @Nullable Boolean allowVirtualNetworkAccess,
        @Nullable Boolean doNotVerifyRemoteGateways,
        String etag,
        @Nullable String id,
        @Nullable String name,
        @Nullable String peeringState,
        String provisioningState,
        @Nullable AddressSpaceResponse remoteAddressSpace,
        @Nullable VirtualNetworkBgpCommunitiesResponse remoteBgpCommunities,
        @Nullable SubResourceResponse remoteVirtualNetwork,
        String resourceGuid,
        @Nullable String type,
        @Nullable Boolean useRemoteGateways) {
        this.allowForwardedTraffic = allowForwardedTraffic;
        this.allowGatewayTransit = allowGatewayTransit;
        this.allowVirtualNetworkAccess = allowVirtualNetworkAccess;
        this.doNotVerifyRemoteGateways = doNotVerifyRemoteGateways;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.name = name;
        this.peeringState = peeringState;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.remoteAddressSpace = remoteAddressSpace;
        this.remoteBgpCommunities = remoteBgpCommunities;
        this.remoteVirtualNetwork = remoteVirtualNetwork;
        this.resourceGuid = Objects.requireNonNull(resourceGuid, "expected parameter 'resourceGuid' to be non-null");
        this.type = type;
        this.useRemoteGateways = useRemoteGateways;
    }

    private VirtualNetworkPeeringResponse() {
        this.allowForwardedTraffic = null;
        this.allowGatewayTransit = null;
        this.allowVirtualNetworkAccess = null;
        this.doNotVerifyRemoteGateways = null;
        this.etag = null;
        this.id = null;
        this.name = null;
        this.peeringState = null;
        this.provisioningState = null;
        this.remoteAddressSpace = null;
        this.remoteBgpCommunities = null;
        this.remoteVirtualNetwork = null;
        this.resourceGuid = null;
        this.type = null;
        this.useRemoteGateways = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkPeeringResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowForwardedTraffic;
        private @Nullable Boolean allowGatewayTransit;
        private @Nullable Boolean allowVirtualNetworkAccess;
        private @Nullable Boolean doNotVerifyRemoteGateways;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable String peeringState;
        private String provisioningState;
        private @Nullable AddressSpaceResponse remoteAddressSpace;
        private @Nullable VirtualNetworkBgpCommunitiesResponse remoteBgpCommunities;
        private @Nullable SubResourceResponse remoteVirtualNetwork;
        private String resourceGuid;
        private @Nullable String type;
        private @Nullable Boolean useRemoteGateways;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkPeeringResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowForwardedTraffic = defaults.allowForwardedTraffic;
    	      this.allowGatewayTransit = defaults.allowGatewayTransit;
    	      this.allowVirtualNetworkAccess = defaults.allowVirtualNetworkAccess;
    	      this.doNotVerifyRemoteGateways = defaults.doNotVerifyRemoteGateways;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.peeringState = defaults.peeringState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.remoteAddressSpace = defaults.remoteAddressSpace;
    	      this.remoteBgpCommunities = defaults.remoteBgpCommunities;
    	      this.remoteVirtualNetwork = defaults.remoteVirtualNetwork;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.type = defaults.type;
    	      this.useRemoteGateways = defaults.useRemoteGateways;
        }

        public Builder setAllowForwardedTraffic(@Nullable Boolean allowForwardedTraffic) {
            this.allowForwardedTraffic = allowForwardedTraffic;
            return this;
        }

        public Builder setAllowGatewayTransit(@Nullable Boolean allowGatewayTransit) {
            this.allowGatewayTransit = allowGatewayTransit;
            return this;
        }

        public Builder setAllowVirtualNetworkAccess(@Nullable Boolean allowVirtualNetworkAccess) {
            this.allowVirtualNetworkAccess = allowVirtualNetworkAccess;
            return this;
        }

        public Builder setDoNotVerifyRemoteGateways(@Nullable Boolean doNotVerifyRemoteGateways) {
            this.doNotVerifyRemoteGateways = doNotVerifyRemoteGateways;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPeeringState(@Nullable String peeringState) {
            this.peeringState = peeringState;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRemoteAddressSpace(@Nullable AddressSpaceResponse remoteAddressSpace) {
            this.remoteAddressSpace = remoteAddressSpace;
            return this;
        }

        public Builder setRemoteBgpCommunities(@Nullable VirtualNetworkBgpCommunitiesResponse remoteBgpCommunities) {
            this.remoteBgpCommunities = remoteBgpCommunities;
            return this;
        }

        public Builder setRemoteVirtualNetwork(@Nullable SubResourceResponse remoteVirtualNetwork) {
            this.remoteVirtualNetwork = remoteVirtualNetwork;
            return this;
        }

        public Builder setResourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setUseRemoteGateways(@Nullable Boolean useRemoteGateways) {
            this.useRemoteGateways = useRemoteGateways;
            return this;
        }

        public VirtualNetworkPeeringResponse build() {
            return new VirtualNetworkPeeringResponse(allowForwardedTraffic, allowGatewayTransit, allowVirtualNetworkAccess, doNotVerifyRemoteGateways, etag, id, name, peeringState, provisioningState, remoteAddressSpace, remoteBgpCommunities, remoteVirtualNetwork, resourceGuid, type, useRemoteGateways);
        }
    }
}
