// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNetworkRuleResponse {
    /**
     * @return The action of virtual network rule.
     * 
     */
    private final @Nullable String action;
    /**
     * @return Gets the state of virtual network rule.
     * 
     */
    private final @Nullable String state;
    /**
     * @return Resource ID of a subnet, for example: /subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     * 
     */
    private final String virtualNetworkResourceId;

    @CustomType.Constructor
    private VirtualNetworkRuleResponse(
        @CustomType.Parameter("action") @Nullable String action,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("virtualNetworkResourceId") String virtualNetworkResourceId) {
        this.action = action;
        this.state = state;
        this.virtualNetworkResourceId = virtualNetworkResourceId;
    }

    /**
     * @return The action of virtual network rule.
     * 
     */
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    /**
     * @return Gets the state of virtual network rule.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * @return Resource ID of a subnet, for example: /subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     * 
     */
    public String virtualNetworkResourceId() {
        return this.virtualNetworkResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private @Nullable String state;
        private String virtualNetworkResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.state = defaults.state;
    	      this.virtualNetworkResourceId = defaults.virtualNetworkResourceId;
        }

        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder virtualNetworkResourceId(String virtualNetworkResourceId) {
            this.virtualNetworkResourceId = Objects.requireNonNull(virtualNetworkResourceId);
            return this;
        }        public VirtualNetworkRuleResponse build() {
            return new VirtualNetworkRuleResponse(action, state, virtualNetworkResourceId);
        }
    }
}
