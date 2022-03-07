// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managednetwork.inputs;

import io.pulumi.azurenative.managednetwork.inputs.ManagedNetworkGroupResponse;
import io.pulumi.azurenative.managednetwork.inputs.ManagedNetworkPeeringPolicyResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


/**
 * The collection of Connectivity related groups and policies within the Managed Network
 * 
 */
public final class ConnectivityCollectionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectivityCollectionResponse Empty = new ConnectivityCollectionResponse();

    /**
     * The collection of connectivity related Managed Network Groups within the Managed Network
     * 
     */
    @InputImport(name="groups", required=true)
      private final List<ManagedNetworkGroupResponse> groups;

    public List<ManagedNetworkGroupResponse> getGroups() {
        return this.groups;
    }

    /**
     * The collection of Managed Network Peering Policies within the Managed Network
     * 
     */
    @InputImport(name="peerings", required=true)
      private final List<ManagedNetworkPeeringPolicyResponse> peerings;

    public List<ManagedNetworkPeeringPolicyResponse> getPeerings() {
        return this.peerings;
    }

    public ConnectivityCollectionResponse(
        List<ManagedNetworkGroupResponse> groups,
        List<ManagedNetworkPeeringPolicyResponse> peerings) {
        this.groups = Objects.requireNonNull(groups, "expected parameter 'groups' to be non-null");
        this.peerings = Objects.requireNonNull(peerings, "expected parameter 'peerings' to be non-null");
    }

    private ConnectivityCollectionResponse() {
        this.groups = List.of();
        this.peerings = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectivityCollectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ManagedNetworkGroupResponse> groups;
        private List<ManagedNetworkPeeringPolicyResponse> peerings;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectivityCollectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groups = defaults.groups;
    	      this.peerings = defaults.peerings;
        }

        public Builder setGroups(List<ManagedNetworkGroupResponse> groups) {
            this.groups = Objects.requireNonNull(groups);
            return this;
        }

        public Builder setPeerings(List<ManagedNetworkPeeringPolicyResponse> peerings) {
            this.peerings = Objects.requireNonNull(peerings);
            return this;
        }
        public ConnectivityCollectionResponse build() {
            return new ConnectivityCollectionResponse(groups, peerings);
        }
    }
}