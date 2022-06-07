// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGatewayPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGatewayPlainArgs Empty = new GetGatewayPlainArgs();

    /**
     * The identity of the gateway.
     * 
     */
    @Import(name="gatewayResourceName", required=true)
    private String gatewayResourceName;

    /**
     * @return The identity of the gateway.
     * 
     */
    public String gatewayResourceName() {
        return this.gatewayResourceName;
    }

    /**
     * Azure resource group name
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Azure resource group name
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetGatewayPlainArgs() {}

    private GetGatewayPlainArgs(GetGatewayPlainArgs $) {
        this.gatewayResourceName = $.gatewayResourceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGatewayPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGatewayPlainArgs $;

        public Builder() {
            $ = new GetGatewayPlainArgs();
        }

        public Builder(GetGatewayPlainArgs defaults) {
            $ = new GetGatewayPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gatewayResourceName The identity of the gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayResourceName(String gatewayResourceName) {
            $.gatewayResourceName = gatewayResourceName;
            return this;
        }

        /**
         * @param resourceGroupName Azure resource group name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetGatewayPlainArgs build() {
            $.gatewayResourceName = Objects.requireNonNull($.gatewayResourceName, "expected parameter 'gatewayResourceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
