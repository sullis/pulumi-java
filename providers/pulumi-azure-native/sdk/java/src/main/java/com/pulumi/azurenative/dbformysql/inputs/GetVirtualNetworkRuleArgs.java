// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbformysql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualNetworkRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVirtualNetworkRuleArgs Empty = new GetVirtualNetworkRuleArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
    private Output<String> serverName;

    /**
     * @return The name of the server.
     * 
     */
    public Output<String> serverName() {
        return this.serverName;
    }

    /**
     * The name of the virtual network rule.
     * 
     */
    @Import(name="virtualNetworkRuleName", required=true)
    private Output<String> virtualNetworkRuleName;

    /**
     * @return The name of the virtual network rule.
     * 
     */
    public Output<String> virtualNetworkRuleName() {
        return this.virtualNetworkRuleName;
    }

    private GetVirtualNetworkRuleArgs() {}

    private GetVirtualNetworkRuleArgs(GetVirtualNetworkRuleArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
        this.virtualNetworkRuleName = $.virtualNetworkRuleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualNetworkRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualNetworkRuleArgs $;

        public Builder() {
            $ = new GetVirtualNetworkRuleArgs();
        }

        public Builder(GetVirtualNetworkRuleArgs defaults) {
            $ = new GetVirtualNetworkRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        /**
         * @param virtualNetworkRuleName The name of the virtual network rule.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkRuleName(Output<String> virtualNetworkRuleName) {
            $.virtualNetworkRuleName = virtualNetworkRuleName;
            return this;
        }

        /**
         * @param virtualNetworkRuleName The name of the virtual network rule.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkRuleName(String virtualNetworkRuleName) {
            return virtualNetworkRuleName(Output.of(virtualNetworkRuleName));
        }

        public GetVirtualNetworkRuleArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            $.virtualNetworkRuleName = Objects.requireNonNull($.virtualNetworkRuleName, "expected parameter 'virtualNetworkRuleName' to be non-null");
            return $;
        }
    }

}
