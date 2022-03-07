// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualRouterPeeringArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualRouterPeeringArgs Empty = new VirtualRouterPeeringArgs();

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
     * Name of the virtual router peering that is unique within a virtual router.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Peer ASN.
     * 
     */
    @InputImport(name="peerAsn")
      private final @Nullable Input<Double> peerAsn;

    public Input<Double> getPeerAsn() {
        return this.peerAsn == null ? Input.empty() : this.peerAsn;
    }

    /**
     * Peer IP.
     * 
     */
    @InputImport(name="peerIp")
      private final @Nullable Input<String> peerIp;

    public Input<String> getPeerIp() {
        return this.peerIp == null ? Input.empty() : this.peerIp;
    }

    /**
     * The name of the Virtual Router Peering.
     * 
     */
    @InputImport(name="peeringName")
      private final @Nullable Input<String> peeringName;

    public Input<String> getPeeringName() {
        return this.peeringName == null ? Input.empty() : this.peeringName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Virtual Router.
     * 
     */
    @InputImport(name="virtualRouterName", required=true)
      private final Input<String> virtualRouterName;

    public Input<String> getVirtualRouterName() {
        return this.virtualRouterName;
    }

    public VirtualRouterPeeringArgs(
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        @Nullable Input<Double> peerAsn,
        @Nullable Input<String> peerIp,
        @Nullable Input<String> peeringName,
        Input<String> resourceGroupName,
        Input<String> virtualRouterName) {
        this.id = id;
        this.name = name;
        this.peerAsn = peerAsn;
        this.peerIp = peerIp;
        this.peeringName = peeringName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.virtualRouterName = Objects.requireNonNull(virtualRouterName, "expected parameter 'virtualRouterName' to be non-null");
    }

    private VirtualRouterPeeringArgs() {
        this.id = Input.empty();
        this.name = Input.empty();
        this.peerAsn = Input.empty();
        this.peerIp = Input.empty();
        this.peeringName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.virtualRouterName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualRouterPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private @Nullable Input<Double> peerAsn;
        private @Nullable Input<String> peerIp;
        private @Nullable Input<String> peeringName;
        private Input<String> resourceGroupName;
        private Input<String> virtualRouterName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualRouterPeeringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.peerAsn = defaults.peerAsn;
    	      this.peerIp = defaults.peerIp;
    	      this.peeringName = defaults.peeringName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.virtualRouterName = defaults.virtualRouterName;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
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

        public Builder setPeerAsn(@Nullable Input<Double> peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }

        public Builder setPeerAsn(@Nullable Double peerAsn) {
            this.peerAsn = Input.ofNullable(peerAsn);
            return this;
        }

        public Builder setPeerIp(@Nullable Input<String> peerIp) {
            this.peerIp = peerIp;
            return this;
        }

        public Builder setPeerIp(@Nullable String peerIp) {
            this.peerIp = Input.ofNullable(peerIp);
            return this;
        }

        public Builder setPeeringName(@Nullable Input<String> peeringName) {
            this.peeringName = peeringName;
            return this;
        }

        public Builder setPeeringName(@Nullable String peeringName) {
            this.peeringName = Input.ofNullable(peeringName);
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

        public Builder setVirtualRouterName(Input<String> virtualRouterName) {
            this.virtualRouterName = Objects.requireNonNull(virtualRouterName);
            return this;
        }

        public Builder setVirtualRouterName(String virtualRouterName) {
            this.virtualRouterName = Input.of(Objects.requireNonNull(virtualRouterName));
            return this;
        }
        public VirtualRouterPeeringArgs build() {
            return new VirtualRouterPeeringArgs(id, name, peerAsn, peerIp, peeringName, resourceGroupName, virtualRouterName);
        }
    }
}