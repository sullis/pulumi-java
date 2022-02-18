// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managednetwork.inputs;

import io.pulumi.azurenative.managednetwork.inputs.ResourceIdArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Scope of a Managed Network
 * 
 */
public final class ScopeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScopeArgs Empty = new ScopeArgs();

    /**
     * The collection of management groups covered by the Managed Network
     * 
     */
    @InputImport(name="managementGroups")
    private final @Nullable Input<List<ResourceIdArgs>> managementGroups;

    public Input<List<ResourceIdArgs>> getManagementGroups() {
        return this.managementGroups == null ? Input.empty() : this.managementGroups;
    }

    /**
     * The collection of  subnets covered by the Managed Network
     * 
     */
    @InputImport(name="subnets")
    private final @Nullable Input<List<ResourceIdArgs>> subnets;

    public Input<List<ResourceIdArgs>> getSubnets() {
        return this.subnets == null ? Input.empty() : this.subnets;
    }

    /**
     * The collection of subscriptions covered by the Managed Network
     * 
     */
    @InputImport(name="subscriptions")
    private final @Nullable Input<List<ResourceIdArgs>> subscriptions;

    public Input<List<ResourceIdArgs>> getSubscriptions() {
        return this.subscriptions == null ? Input.empty() : this.subscriptions;
    }

    /**
     * The collection of virtual nets covered by the Managed Network
     * 
     */
    @InputImport(name="virtualNetworks")
    private final @Nullable Input<List<ResourceIdArgs>> virtualNetworks;

    public Input<List<ResourceIdArgs>> getVirtualNetworks() {
        return this.virtualNetworks == null ? Input.empty() : this.virtualNetworks;
    }

    public ScopeArgs(
        @Nullable Input<List<ResourceIdArgs>> managementGroups,
        @Nullable Input<List<ResourceIdArgs>> subnets,
        @Nullable Input<List<ResourceIdArgs>> subscriptions,
        @Nullable Input<List<ResourceIdArgs>> virtualNetworks) {
        this.managementGroups = managementGroups;
        this.subnets = subnets;
        this.subscriptions = subscriptions;
        this.virtualNetworks = virtualNetworks;
    }

    private ScopeArgs() {
        this.managementGroups = Input.empty();
        this.subnets = Input.empty();
        this.subscriptions = Input.empty();
        this.virtualNetworks = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ResourceIdArgs>> managementGroups;
        private @Nullable Input<List<ResourceIdArgs>> subnets;
        private @Nullable Input<List<ResourceIdArgs>> subscriptions;
        private @Nullable Input<List<ResourceIdArgs>> virtualNetworks;

        public Builder() {
    	      // Empty
        }

        public Builder(ScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managementGroups = defaults.managementGroups;
    	      this.subnets = defaults.subnets;
    	      this.subscriptions = defaults.subscriptions;
    	      this.virtualNetworks = defaults.virtualNetworks;
        }

        public Builder setManagementGroups(@Nullable Input<List<ResourceIdArgs>> managementGroups) {
            this.managementGroups = managementGroups;
            return this;
        }

        public Builder setManagementGroups(@Nullable List<ResourceIdArgs> managementGroups) {
            this.managementGroups = Input.ofNullable(managementGroups);
            return this;
        }

        public Builder setSubnets(@Nullable Input<List<ResourceIdArgs>> subnets) {
            this.subnets = subnets;
            return this;
        }

        public Builder setSubnets(@Nullable List<ResourceIdArgs> subnets) {
            this.subnets = Input.ofNullable(subnets);
            return this;
        }

        public Builder setSubscriptions(@Nullable Input<List<ResourceIdArgs>> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }

        public Builder setSubscriptions(@Nullable List<ResourceIdArgs> subscriptions) {
            this.subscriptions = Input.ofNullable(subscriptions);
            return this;
        }

        public Builder setVirtualNetworks(@Nullable Input<List<ResourceIdArgs>> virtualNetworks) {
            this.virtualNetworks = virtualNetworks;
            return this;
        }

        public Builder setVirtualNetworks(@Nullable List<ResourceIdArgs> virtualNetworks) {
            this.virtualNetworks = Input.ofNullable(virtualNetworks);
            return this;
        }

        public ScopeArgs build() {
            return new ScopeArgs(managementGroups, subnets, subscriptions, virtualNetworks);
        }
    }
}
