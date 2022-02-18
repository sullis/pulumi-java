// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVirtualNetworkRuleResult {
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Create firewall rule before the virtual network has vnet service endpoint enabled.
     * 
     */
    private final @Nullable Boolean ignoreMissingVnetServiceEndpoint;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Virtual Network Rule State
     * 
     */
    private final String state;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;
    /**
     * The ARM resource id of the virtual network subnet.
     * 
     */
    private final String virtualNetworkSubnetId;

    @OutputCustomType.Constructor({"id","ignoreMissingVnetServiceEndpoint","name","state","type","virtualNetworkSubnetId"})
    private GetVirtualNetworkRuleResult(
        String id,
        @Nullable Boolean ignoreMissingVnetServiceEndpoint,
        String name,
        String state,
        String type,
        String virtualNetworkSubnetId) {
        this.id = Objects.requireNonNull(id);
        this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
        this.name = Objects.requireNonNull(name);
        this.state = Objects.requireNonNull(state);
        this.type = Objects.requireNonNull(type);
        this.virtualNetworkSubnetId = Objects.requireNonNull(virtualNetworkSubnetId);
    }

    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Create firewall rule before the virtual network has vnet service endpoint enabled.
     * 
     */
    public Optional<Boolean> getIgnoreMissingVnetServiceEndpoint() {
        return Optional.ofNullable(this.ignoreMissingVnetServiceEndpoint);
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Virtual Network Rule State
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The ARM resource id of the virtual network subnet.
     * 
     */
    public String getVirtualNetworkSubnetId() {
        return this.virtualNetworkSubnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNetworkRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable Boolean ignoreMissingVnetServiceEndpoint;
        private String name;
        private String state;
        private String type;
        private String virtualNetworkSubnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualNetworkRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ignoreMissingVnetServiceEndpoint = defaults.ignoreMissingVnetServiceEndpoint;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.virtualNetworkSubnetId = defaults.virtualNetworkSubnetId;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIgnoreMissingVnetServiceEndpoint(@Nullable Boolean ignoreMissingVnetServiceEndpoint) {
            this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVirtualNetworkSubnetId(String virtualNetworkSubnetId) {
            this.virtualNetworkSubnetId = Objects.requireNonNull(virtualNetworkSubnetId);
            return this;
        }

        public GetVirtualNetworkRuleResult build() {
            return new GetVirtualNetworkRuleResult(id, ignoreMissingVnetServiceEndpoint, name, state, type, virtualNetworkSubnetId);
        }
    }
}
