// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the resource properties.
 * 
 */
public final class PlacementProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final PlacementProfileResponse Empty = new PlacementProfileResponse();

    /**
     * Gets or sets the ARM Id of the cluster resource on which this virtual machine will deploy.
     * 
     */
    @InputImport(name="clusterId")
    private final @Nullable String clusterId;

    public Optional<String> getClusterId() {
        return this.clusterId == null ? Optional.empty() : Optional.ofNullable(this.clusterId);
    }

    /**
     * Gets or sets the ARM Id of the datastore resource on which the data for the virtual machine will be kept.
     * 
     */
    @InputImport(name="datastoreId")
    private final @Nullable String datastoreId;

    public Optional<String> getDatastoreId() {
        return this.datastoreId == null ? Optional.empty() : Optional.ofNullable(this.datastoreId);
    }

    /**
     * Gets or sets the ARM Id of the host resource on which this virtual machine will deploy.
     * 
     */
    @InputImport(name="hostId")
    private final @Nullable String hostId;

    public Optional<String> getHostId() {
        return this.hostId == null ? Optional.empty() : Optional.ofNullable(this.hostId);
    }

    /**
     * Gets or sets the ARM Id of the resourcePool resource on which this virtual machine will deploy.
     * 
     */
    @InputImport(name="resourcePoolId")
    private final @Nullable String resourcePoolId;

    public Optional<String> getResourcePoolId() {
        return this.resourcePoolId == null ? Optional.empty() : Optional.ofNullable(this.resourcePoolId);
    }

    public PlacementProfileResponse(
        @Nullable String clusterId,
        @Nullable String datastoreId,
        @Nullable String hostId,
        @Nullable String resourcePoolId) {
        this.clusterId = clusterId;
        this.datastoreId = datastoreId;
        this.hostId = hostId;
        this.resourcePoolId = resourcePoolId;
    }

    private PlacementProfileResponse() {
        this.clusterId = null;
        this.datastoreId = null;
        this.hostId = null;
        this.resourcePoolId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlacementProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clusterId;
        private @Nullable String datastoreId;
        private @Nullable String hostId;
        private @Nullable String resourcePoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(PlacementProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.datastoreId = defaults.datastoreId;
    	      this.hostId = defaults.hostId;
    	      this.resourcePoolId = defaults.resourcePoolId;
        }

        public Builder setClusterId(@Nullable String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        public Builder setDatastoreId(@Nullable String datastoreId) {
            this.datastoreId = datastoreId;
            return this;
        }

        public Builder setHostId(@Nullable String hostId) {
            this.hostId = hostId;
            return this;
        }

        public Builder setResourcePoolId(@Nullable String resourcePoolId) {
            this.resourcePoolId = resourcePoolId;
            return this;
        }

        public PlacementProfileResponse build() {
            return new PlacementProfileResponse(clusterId, datastoreId, hostId, resourcePoolId);
        }
    }
}
