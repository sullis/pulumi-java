// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.inputs.InstanceFailoverGroupReadOnlyEndpointArgs;
import io.pulumi.azurenative.sql.inputs.InstanceFailoverGroupReadWriteEndpointArgs;
import io.pulumi.azurenative.sql.inputs.ManagedInstancePairInfoArgs;
import io.pulumi.azurenative.sql.inputs.PartnerRegionInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFailoverGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFailoverGroupArgs Empty = new InstanceFailoverGroupArgs();

    /**
     * The name of the failover group.
     * 
     */
    @InputImport(name="failoverGroupName")
      private final @Nullable Input<String> failoverGroupName;

    public Input<String> getFailoverGroupName() {
        return this.failoverGroupName == null ? Input.empty() : this.failoverGroupName;
    }

    /**
     * The name of the region where the resource is located.
     * 
     */
    @InputImport(name="locationName", required=true)
      private final Input<String> locationName;

    public Input<String> getLocationName() {
        return this.locationName;
    }

    /**
     * List of managed instance pairs in the failover group.
     * 
     */
    @InputImport(name="managedInstancePairs", required=true)
      private final Input<List<ManagedInstancePairInfoArgs>> managedInstancePairs;

    public Input<List<ManagedInstancePairInfoArgs>> getManagedInstancePairs() {
        return this.managedInstancePairs;
    }

    /**
     * Partner region information for the failover group.
     * 
     */
    @InputImport(name="partnerRegions", required=true)
      private final Input<List<PartnerRegionInfoArgs>> partnerRegions;

    public Input<List<PartnerRegionInfoArgs>> getPartnerRegions() {
        return this.partnerRegions;
    }

    /**
     * Read-only endpoint of the failover group instance.
     * 
     */
    @InputImport(name="readOnlyEndpoint")
      private final @Nullable Input<InstanceFailoverGroupReadOnlyEndpointArgs> readOnlyEndpoint;

    public Input<InstanceFailoverGroupReadOnlyEndpointArgs> getReadOnlyEndpoint() {
        return this.readOnlyEndpoint == null ? Input.empty() : this.readOnlyEndpoint;
    }

    /**
     * Read-write endpoint of the failover group instance.
     * 
     */
    @InputImport(name="readWriteEndpoint", required=true)
      private final Input<InstanceFailoverGroupReadWriteEndpointArgs> readWriteEndpoint;

    public Input<InstanceFailoverGroupReadWriteEndpointArgs> getReadWriteEndpoint() {
        return this.readWriteEndpoint;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public InstanceFailoverGroupArgs(
        @Nullable Input<String> failoverGroupName,
        Input<String> locationName,
        Input<List<ManagedInstancePairInfoArgs>> managedInstancePairs,
        Input<List<PartnerRegionInfoArgs>> partnerRegions,
        @Nullable Input<InstanceFailoverGroupReadOnlyEndpointArgs> readOnlyEndpoint,
        Input<InstanceFailoverGroupReadWriteEndpointArgs> readWriteEndpoint,
        Input<String> resourceGroupName) {
        this.failoverGroupName = failoverGroupName;
        this.locationName = Objects.requireNonNull(locationName, "expected parameter 'locationName' to be non-null");
        this.managedInstancePairs = Objects.requireNonNull(managedInstancePairs, "expected parameter 'managedInstancePairs' to be non-null");
        this.partnerRegions = Objects.requireNonNull(partnerRegions, "expected parameter 'partnerRegions' to be non-null");
        this.readOnlyEndpoint = readOnlyEndpoint;
        this.readWriteEndpoint = Objects.requireNonNull(readWriteEndpoint, "expected parameter 'readWriteEndpoint' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private InstanceFailoverGroupArgs() {
        this.failoverGroupName = Input.empty();
        this.locationName = Input.empty();
        this.managedInstancePairs = Input.empty();
        this.partnerRegions = Input.empty();
        this.readOnlyEndpoint = Input.empty();
        this.readWriteEndpoint = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFailoverGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> failoverGroupName;
        private Input<String> locationName;
        private Input<List<ManagedInstancePairInfoArgs>> managedInstancePairs;
        private Input<List<PartnerRegionInfoArgs>> partnerRegions;
        private @Nullable Input<InstanceFailoverGroupReadOnlyEndpointArgs> readOnlyEndpoint;
        private Input<InstanceFailoverGroupReadWriteEndpointArgs> readWriteEndpoint;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFailoverGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverGroupName = defaults.failoverGroupName;
    	      this.locationName = defaults.locationName;
    	      this.managedInstancePairs = defaults.managedInstancePairs;
    	      this.partnerRegions = defaults.partnerRegions;
    	      this.readOnlyEndpoint = defaults.readOnlyEndpoint;
    	      this.readWriteEndpoint = defaults.readWriteEndpoint;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setFailoverGroupName(@Nullable Input<String> failoverGroupName) {
            this.failoverGroupName = failoverGroupName;
            return this;
        }

        public Builder setFailoverGroupName(@Nullable String failoverGroupName) {
            this.failoverGroupName = Input.ofNullable(failoverGroupName);
            return this;
        }

        public Builder setLocationName(Input<String> locationName) {
            this.locationName = Objects.requireNonNull(locationName);
            return this;
        }

        public Builder setLocationName(String locationName) {
            this.locationName = Input.of(Objects.requireNonNull(locationName));
            return this;
        }

        public Builder setManagedInstancePairs(Input<List<ManagedInstancePairInfoArgs>> managedInstancePairs) {
            this.managedInstancePairs = Objects.requireNonNull(managedInstancePairs);
            return this;
        }

        public Builder setManagedInstancePairs(List<ManagedInstancePairInfoArgs> managedInstancePairs) {
            this.managedInstancePairs = Input.of(Objects.requireNonNull(managedInstancePairs));
            return this;
        }

        public Builder setPartnerRegions(Input<List<PartnerRegionInfoArgs>> partnerRegions) {
            this.partnerRegions = Objects.requireNonNull(partnerRegions);
            return this;
        }

        public Builder setPartnerRegions(List<PartnerRegionInfoArgs> partnerRegions) {
            this.partnerRegions = Input.of(Objects.requireNonNull(partnerRegions));
            return this;
        }

        public Builder setReadOnlyEndpoint(@Nullable Input<InstanceFailoverGroupReadOnlyEndpointArgs> readOnlyEndpoint) {
            this.readOnlyEndpoint = readOnlyEndpoint;
            return this;
        }

        public Builder setReadOnlyEndpoint(@Nullable InstanceFailoverGroupReadOnlyEndpointArgs readOnlyEndpoint) {
            this.readOnlyEndpoint = Input.ofNullable(readOnlyEndpoint);
            return this;
        }

        public Builder setReadWriteEndpoint(Input<InstanceFailoverGroupReadWriteEndpointArgs> readWriteEndpoint) {
            this.readWriteEndpoint = Objects.requireNonNull(readWriteEndpoint);
            return this;
        }

        public Builder setReadWriteEndpoint(InstanceFailoverGroupReadWriteEndpointArgs readWriteEndpoint) {
            this.readWriteEndpoint = Input.of(Objects.requireNonNull(readWriteEndpoint));
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
        public InstanceFailoverGroupArgs build() {
            return new InstanceFailoverGroupArgs(failoverGroupName, locationName, managedInstancePairs, partnerRegions, readOnlyEndpoint, readWriteEndpoint, resourceGroupName);
        }
    }
}