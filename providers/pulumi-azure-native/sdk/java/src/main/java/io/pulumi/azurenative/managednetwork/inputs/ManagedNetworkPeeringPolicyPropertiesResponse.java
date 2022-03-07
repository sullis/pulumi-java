// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managednetwork.inputs;

import io.pulumi.azurenative.managednetwork.inputs.ResourceIdResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a Managed Network Peering Policy
 * 
 */
public final class ManagedNetworkPeeringPolicyPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedNetworkPeeringPolicyPropertiesResponse Empty = new ManagedNetworkPeeringPolicyPropertiesResponse();

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
     * Gets or sets the hub virtual network ID
     * 
     */
    @InputImport(name="hub")
      private final @Nullable ResourceIdResponse hub;

    public Optional<ResourceIdResponse> getHub() {
        return this.hub == null ? Optional.empty() : Optional.ofNullable(this.hub);
    }

    /**
     * Gets or sets the mesh group IDs
     * 
     */
    @InputImport(name="mesh")
      private final @Nullable List<ResourceIdResponse> mesh;

    public List<ResourceIdResponse> getMesh() {
        return this.mesh == null ? List.of() : this.mesh;
    }

    /**
     * Provisioning state of the ManagedNetwork resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Gets or sets the spokes group IDs
     * 
     */
    @InputImport(name="spokes")
      private final @Nullable List<ResourceIdResponse> spokes;

    public List<ResourceIdResponse> getSpokes() {
        return this.spokes == null ? List.of() : this.spokes;
    }

    /**
     * Gets or sets the connectivity type of a network structure policy
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public ManagedNetworkPeeringPolicyPropertiesResponse(
        String etag,
        @Nullable ResourceIdResponse hub,
        @Nullable List<ResourceIdResponse> mesh,
        String provisioningState,
        @Nullable List<ResourceIdResponse> spokes,
        String type) {
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.hub = hub;
        this.mesh = mesh;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.spokes = spokes;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ManagedNetworkPeeringPolicyPropertiesResponse() {
        this.etag = null;
        this.hub = null;
        this.mesh = List.of();
        this.provisioningState = null;
        this.spokes = List.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedNetworkPeeringPolicyPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable ResourceIdResponse hub;
        private @Nullable List<ResourceIdResponse> mesh;
        private String provisioningState;
        private @Nullable List<ResourceIdResponse> spokes;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedNetworkPeeringPolicyPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.hub = defaults.hub;
    	      this.mesh = defaults.mesh;
    	      this.provisioningState = defaults.provisioningState;
    	      this.spokes = defaults.spokes;
    	      this.type = defaults.type;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setHub(@Nullable ResourceIdResponse hub) {
            this.hub = hub;
            return this;
        }

        public Builder setMesh(@Nullable List<ResourceIdResponse> mesh) {
            this.mesh = mesh;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSpokes(@Nullable List<ResourceIdResponse> spokes) {
            this.spokes = spokes;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ManagedNetworkPeeringPolicyPropertiesResponse build() {
            return new ManagedNetworkPeeringPolicyPropertiesResponse(etag, hub, mesh, provisioningState, spokes, type);
        }
    }
}