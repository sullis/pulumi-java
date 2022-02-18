// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managednetwork.outputs;

import io.pulumi.azurenative.managednetwork.outputs.ManagedNetworkGroupResponse;
import io.pulumi.azurenative.managednetwork.outputs.ManagedNetworkPeeringPolicyResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ConnectivityCollectionResponse {
    /**
     * The collection of connectivity related Managed Network Groups within the Managed Network
     * 
     */
    private final List<ManagedNetworkGroupResponse> groups;
    /**
     * The collection of Managed Network Peering Policies within the Managed Network
     * 
     */
    private final List<ManagedNetworkPeeringPolicyResponse> peerings;

    @OutputCustomType.Constructor({"groups","peerings"})
    private ConnectivityCollectionResponse(
        List<ManagedNetworkGroupResponse> groups,
        List<ManagedNetworkPeeringPolicyResponse> peerings) {
        this.groups = Objects.requireNonNull(groups);
        this.peerings = Objects.requireNonNull(peerings);
    }

    /**
     * The collection of connectivity related Managed Network Groups within the Managed Network
     * 
     */
    public List<ManagedNetworkGroupResponse> getGroups() {
        return this.groups;
    }
    /**
     * The collection of Managed Network Peering Policies within the Managed Network
     * 
     */
    public List<ManagedNetworkPeeringPolicyResponse> getPeerings() {
        return this.peerings;
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
