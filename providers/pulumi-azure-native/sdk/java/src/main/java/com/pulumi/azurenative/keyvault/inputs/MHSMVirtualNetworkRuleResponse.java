// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.keyvault.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A rule governing the accessibility of a managed hsm pool from a specific virtual network.
 * 
 */
public final class MHSMVirtualNetworkRuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final MHSMVirtualNetworkRuleResponse Empty = new MHSMVirtualNetworkRuleResponse();

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

    private MHSMVirtualNetworkRuleResponse() {}

    private MHSMVirtualNetworkRuleResponse(MHSMVirtualNetworkRuleResponse $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MHSMVirtualNetworkRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MHSMVirtualNetworkRuleResponse $;

        public Builder() {
            $ = new MHSMVirtualNetworkRuleResponse();
        }

        public Builder(MHSMVirtualNetworkRuleResponse defaults) {
            $ = new MHSMVirtualNetworkRuleResponse(Objects.requireNonNull(defaults));
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

        public MHSMVirtualNetworkRuleResponse build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
