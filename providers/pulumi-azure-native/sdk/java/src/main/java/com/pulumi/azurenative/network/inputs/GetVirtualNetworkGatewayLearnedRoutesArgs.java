// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualNetworkGatewayLearnedRoutesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVirtualNetworkGatewayLearnedRoutesArgs Empty = new GetVirtualNetworkGatewayLearnedRoutesArgs();

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the virtual network gateway.
     * 
     */
    @Import(name="virtualNetworkGatewayName", required=true)
    private Output<String> virtualNetworkGatewayName;

    /**
     * @return The name of the virtual network gateway.
     * 
     */
    public Output<String> virtualNetworkGatewayName() {
        return this.virtualNetworkGatewayName;
    }

    private GetVirtualNetworkGatewayLearnedRoutesArgs() {}

    private GetVirtualNetworkGatewayLearnedRoutesArgs(GetVirtualNetworkGatewayLearnedRoutesArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.virtualNetworkGatewayName = $.virtualNetworkGatewayName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualNetworkGatewayLearnedRoutesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualNetworkGatewayLearnedRoutesArgs $;

        public Builder() {
            $ = new GetVirtualNetworkGatewayLearnedRoutesArgs();
        }

        public Builder(GetVirtualNetworkGatewayLearnedRoutesArgs defaults) {
            $ = new GetVirtualNetworkGatewayLearnedRoutesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param virtualNetworkGatewayName The name of the virtual network gateway.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkGatewayName(Output<String> virtualNetworkGatewayName) {
            $.virtualNetworkGatewayName = virtualNetworkGatewayName;
            return this;
        }

        /**
         * @param virtualNetworkGatewayName The name of the virtual network gateway.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkGatewayName(String virtualNetworkGatewayName) {
            return virtualNetworkGatewayName(Output.of(virtualNetworkGatewayName));
        }

        public GetVirtualNetworkGatewayLearnedRoutesArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualNetworkGatewayName = Objects.requireNonNull($.virtualNetworkGatewayName, "expected parameter 'virtualNetworkGatewayName' to be non-null");
            return $;
        }
    }

}
