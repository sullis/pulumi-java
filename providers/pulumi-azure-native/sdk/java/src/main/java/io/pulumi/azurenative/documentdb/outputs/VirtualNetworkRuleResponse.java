// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualNetworkRuleResponse {
    /**
     * Resource ID of a subnet, for example: /subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/subnets/{subnetName}.
     * 
     */
    private final @Nullable String id;
    /**
     * Create firewall rule before the virtual network has vnet service endpoint enabled.
     * 
     */
    private final @Nullable Boolean ignoreMissingVNetServiceEndpoint;

    @OutputCustomType.Constructor({"id","ignoreMissingVNetServiceEndpoint"})
    private VirtualNetworkRuleResponse(
        @Nullable String id,
        @Nullable Boolean ignoreMissingVNetServiceEndpoint) {
        this.id = id;
        this.ignoreMissingVNetServiceEndpoint = ignoreMissingVNetServiceEndpoint;
    }

    /**
     * Resource ID of a subnet, for example: /subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/subnets/{subnetName}.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Create firewall rule before the virtual network has vnet service endpoint enabled.
     * 
    */
    public Optional<Boolean> getIgnoreMissingVNetServiceEndpoint() {
        return Optional.ofNullable(this.ignoreMissingVNetServiceEndpoint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable Boolean ignoreMissingVNetServiceEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ignoreMissingVNetServiceEndpoint = defaults.ignoreMissingVNetServiceEndpoint;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIgnoreMissingVNetServiceEndpoint(@Nullable Boolean ignoreMissingVNetServiceEndpoint) {
            this.ignoreMissingVNetServiceEndpoint = ignoreMissingVNetServiceEndpoint;
            return this;
        }
        public VirtualNetworkRuleResponse build() {
            return new VirtualNetworkRuleResponse(id, ignoreMissingVNetServiceEndpoint);
        }
    }
}