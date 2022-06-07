// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVpnGatewayPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpnGatewayPlainArgs Empty = new GetVpnGatewayPlainArgs();

    /**
     * The name of the gateway.
     * 
     */
    @Import(name="gatewayName", required=true)
    private String gatewayName;

    /**
     * @return The name of the gateway.
     * 
     */
    public String gatewayName() {
        return this.gatewayName;
    }

    /**
     * The resource group name of the VpnGateway.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name of the VpnGateway.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetVpnGatewayPlainArgs() {}

    private GetVpnGatewayPlainArgs(GetVpnGatewayPlainArgs $) {
        this.gatewayName = $.gatewayName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpnGatewayPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpnGatewayPlainArgs $;

        public Builder() {
            $ = new GetVpnGatewayPlainArgs();
        }

        public Builder(GetVpnGatewayPlainArgs defaults) {
            $ = new GetVpnGatewayPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gatewayName The name of the gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayName(String gatewayName) {
            $.gatewayName = gatewayName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name of the VpnGateway.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetVpnGatewayPlainArgs build() {
            $.gatewayName = Objects.requireNonNull($.gatewayName, "expected parameter 'gatewayName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
