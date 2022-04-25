// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.keyvault.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A rule governing the accessibility of a vault from a specific virtual network.
 * 
 */
public final class VirtualNetworkRuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final VirtualNetworkRuleResponse Empty = new VirtualNetworkRuleResponse();

    /**
     * Full resource id of a vnet subnet, such as &#39;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/subnet1&#39;.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return Full resource id of a vnet subnet, such as &#39;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/subnet1&#39;.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * Property to specify whether NRP will ignore the check if parent subnet has serviceEndpoints configured.
     * 
     */
    @Import(name="ignoreMissingVnetServiceEndpoint")
    private @Nullable Boolean ignoreMissingVnetServiceEndpoint;

    /**
     * @return Property to specify whether NRP will ignore the check if parent subnet has serviceEndpoints configured.
     * 
     */
    public Optional<Boolean> ignoreMissingVnetServiceEndpoint() {
        return Optional.ofNullable(this.ignoreMissingVnetServiceEndpoint);
    }

    private VirtualNetworkRuleResponse() {}

    private VirtualNetworkRuleResponse(VirtualNetworkRuleResponse $) {
        this.id = $.id;
        this.ignoreMissingVnetServiceEndpoint = $.ignoreMissingVnetServiceEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkRuleResponse $;

        public Builder() {
            $ = new VirtualNetworkRuleResponse();
        }

        public Builder(VirtualNetworkRuleResponse defaults) {
            $ = new VirtualNetworkRuleResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Full resource id of a vnet subnet, such as &#39;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/subnet1&#39;.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param ignoreMissingVnetServiceEndpoint Property to specify whether NRP will ignore the check if parent subnet has serviceEndpoints configured.
         * 
         * @return builder
         * 
         */
        public Builder ignoreMissingVnetServiceEndpoint(@Nullable Boolean ignoreMissingVnetServiceEndpoint) {
            $.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
            return this;
        }

        public VirtualNetworkRuleResponse build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
