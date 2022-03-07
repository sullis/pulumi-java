// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managednetwork.inputs;

import io.pulumi.azurenative.managednetwork.enums.Type;
import io.pulumi.azurenative.managednetwork.inputs.ResourceIdArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of a Managed Network Peering Policy
 * 
 */
public final class ManagedNetworkPeeringPolicyPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedNetworkPeeringPolicyPropertiesArgs Empty = new ManagedNetworkPeeringPolicyPropertiesArgs();

    /**
     * Gets or sets the hub virtual network ID
     * 
     */
    @InputImport(name="hub")
      private final @Nullable Input<ResourceIdArgs> hub;

    public Input<ResourceIdArgs> getHub() {
        return this.hub == null ? Input.empty() : this.hub;
    }

    /**
     * Gets or sets the mesh group IDs
     * 
     */
    @InputImport(name="mesh")
      private final @Nullable Input<List<ResourceIdArgs>> mesh;

    public Input<List<ResourceIdArgs>> getMesh() {
        return this.mesh == null ? Input.empty() : this.mesh;
    }

    /**
     * Gets or sets the spokes group IDs
     * 
     */
    @InputImport(name="spokes")
      private final @Nullable Input<List<ResourceIdArgs>> spokes;

    public Input<List<ResourceIdArgs>> getSpokes() {
        return this.spokes == null ? Input.empty() : this.spokes;
    }

    /**
     * Gets or sets the connectivity type of a network structure policy
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<Either<String,Type>> type;

    public Input<Either<String,Type>> getType() {
        return this.type;
    }

    public ManagedNetworkPeeringPolicyPropertiesArgs(
        @Nullable Input<ResourceIdArgs> hub,
        @Nullable Input<List<ResourceIdArgs>> mesh,
        @Nullable Input<List<ResourceIdArgs>> spokes,
        Input<Either<String,Type>> type) {
        this.hub = hub;
        this.mesh = mesh;
        this.spokes = spokes;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ManagedNetworkPeeringPolicyPropertiesArgs() {
        this.hub = Input.empty();
        this.mesh = Input.empty();
        this.spokes = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedNetworkPeeringPolicyPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ResourceIdArgs> hub;
        private @Nullable Input<List<ResourceIdArgs>> mesh;
        private @Nullable Input<List<ResourceIdArgs>> spokes;
        private Input<Either<String,Type>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedNetworkPeeringPolicyPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hub = defaults.hub;
    	      this.mesh = defaults.mesh;
    	      this.spokes = defaults.spokes;
    	      this.type = defaults.type;
        }

        public Builder setHub(@Nullable Input<ResourceIdArgs> hub) {
            this.hub = hub;
            return this;
        }

        public Builder setHub(@Nullable ResourceIdArgs hub) {
            this.hub = Input.ofNullable(hub);
            return this;
        }

        public Builder setMesh(@Nullable Input<List<ResourceIdArgs>> mesh) {
            this.mesh = mesh;
            return this;
        }

        public Builder setMesh(@Nullable List<ResourceIdArgs> mesh) {
            this.mesh = Input.ofNullable(mesh);
            return this;
        }

        public Builder setSpokes(@Nullable Input<List<ResourceIdArgs>> spokes) {
            this.spokes = spokes;
            return this;
        }

        public Builder setSpokes(@Nullable List<ResourceIdArgs> spokes) {
            this.spokes = Input.ofNullable(spokes);
            return this;
        }

        public Builder setType(Input<Either<String,Type>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(Either<String,Type> type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ManagedNetworkPeeringPolicyPropertiesArgs build() {
            return new ManagedNetworkPeeringPolicyPropertiesArgs(hub, mesh, spokes, type);
        }
    }
}