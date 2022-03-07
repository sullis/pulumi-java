// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A rule governing the accessibility of a managed hsm pool from a specific virtual network.
 * 
 */
public final class MHSMVirtualNetworkRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final MHSMVirtualNetworkRuleResponse Empty = new MHSMVirtualNetworkRuleResponse();

    /**
     * Full resource id of a vnet subnet, such as '/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/subnet1'.
     * 
     */
    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    public MHSMVirtualNetworkRuleResponse(String id) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private MHSMVirtualNetworkRuleResponse() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MHSMVirtualNetworkRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(MHSMVirtualNetworkRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public MHSMVirtualNetworkRuleResponse build() {
            return new MHSMVirtualNetworkRuleResponse(id);
        }
    }
}