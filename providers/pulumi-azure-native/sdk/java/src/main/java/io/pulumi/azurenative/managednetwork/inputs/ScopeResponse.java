// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managednetwork.inputs;

import io.pulumi.azurenative.managednetwork.inputs.ResourceIdResponse;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Scope of a Managed Network
 * 
 */
public final class ScopeResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScopeResponse Empty = new ScopeResponse();

    /**
     * The collection of management groups covered by the Managed Network
     * 
     */
    @Import(name="managementGroups")
      private final @Nullable List<ResourceIdResponse> managementGroups;

    public List<ResourceIdResponse> getManagementGroups() {
        return this.managementGroups == null ? List.of() : this.managementGroups;
    }

    /**
     * The collection of  subnets covered by the Managed Network
     * 
     */
    @Import(name="subnets")
      private final @Nullable List<ResourceIdResponse> subnets;

    public List<ResourceIdResponse> getSubnets() {
        return this.subnets == null ? List.of() : this.subnets;
    }

    /**
     * The collection of subscriptions covered by the Managed Network
     * 
     */
    @Import(name="subscriptions")
      private final @Nullable List<ResourceIdResponse> subscriptions;

    public List<ResourceIdResponse> getSubscriptions() {
        return this.subscriptions == null ? List.of() : this.subscriptions;
    }

    /**
     * The collection of virtual nets covered by the Managed Network
     * 
     */
    @Import(name="virtualNetworks")
      private final @Nullable List<ResourceIdResponse> virtualNetworks;

    public List<ResourceIdResponse> getVirtualNetworks() {
        return this.virtualNetworks == null ? List.of() : this.virtualNetworks;
    }

    public ScopeResponse(
        @Nullable List<ResourceIdResponse> managementGroups,
        @Nullable List<ResourceIdResponse> subnets,
        @Nullable List<ResourceIdResponse> subscriptions,
        @Nullable List<ResourceIdResponse> virtualNetworks) {
        this.managementGroups = managementGroups;
        this.subnets = subnets;
        this.subscriptions = subscriptions;
        this.virtualNetworks = virtualNetworks;
    }

    private ScopeResponse() {
        this.managementGroups = List.of();
        this.subnets = List.of();
        this.subscriptions = List.of();
        this.virtualNetworks = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScopeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ResourceIdResponse> managementGroups;
        private @Nullable List<ResourceIdResponse> subnets;
        private @Nullable List<ResourceIdResponse> subscriptions;
        private @Nullable List<ResourceIdResponse> virtualNetworks;

        public Builder() {
    	      // Empty
        }

        public Builder(ScopeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managementGroups = defaults.managementGroups;
    	      this.subnets = defaults.subnets;
    	      this.subscriptions = defaults.subscriptions;
    	      this.virtualNetworks = defaults.virtualNetworks;
        }

        public Builder managementGroups(@Nullable List<ResourceIdResponse> managementGroups) {
            this.managementGroups = managementGroups;
            return this;
        }
        public Builder managementGroups(ResourceIdResponse... managementGroups) {
            return managementGroups(List.of(managementGroups));
        }
        public Builder subnets(@Nullable List<ResourceIdResponse> subnets) {
            this.subnets = subnets;
            return this;
        }
        public Builder subnets(ResourceIdResponse... subnets) {
            return subnets(List.of(subnets));
        }
        public Builder subscriptions(@Nullable List<ResourceIdResponse> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }
        public Builder subscriptions(ResourceIdResponse... subscriptions) {
            return subscriptions(List.of(subscriptions));
        }
        public Builder virtualNetworks(@Nullable List<ResourceIdResponse> virtualNetworks) {
            this.virtualNetworks = virtualNetworks;
            return this;
        }
        public Builder virtualNetworks(ResourceIdResponse... virtualNetworks) {
            return virtualNetworks(List.of(virtualNetworks));
        }        public ScopeResponse build() {
            return new ScopeResponse(managementGroups, subnets, subscriptions, virtualNetworks);
        }
    }
}
