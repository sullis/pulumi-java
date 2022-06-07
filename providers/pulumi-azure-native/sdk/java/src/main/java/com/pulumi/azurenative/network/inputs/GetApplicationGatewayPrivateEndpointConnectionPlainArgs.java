// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApplicationGatewayPrivateEndpointConnectionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationGatewayPrivateEndpointConnectionPlainArgs Empty = new GetApplicationGatewayPrivateEndpointConnectionPlainArgs();

    /**
     * The name of the application gateway.
     * 
     */
    @Import(name="applicationGatewayName", required=true)
    private String applicationGatewayName;

    /**
     * @return The name of the application gateway.
     * 
     */
    public String applicationGatewayName() {
        return this.applicationGatewayName;
    }

    /**
     * The name of the application gateway private endpoint connection.
     * 
     */
    @Import(name="connectionName", required=true)
    private String connectionName;

    /**
     * @return The name of the application gateway private endpoint connection.
     * 
     */
    public String connectionName() {
        return this.connectionName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetApplicationGatewayPrivateEndpointConnectionPlainArgs() {}

    private GetApplicationGatewayPrivateEndpointConnectionPlainArgs(GetApplicationGatewayPrivateEndpointConnectionPlainArgs $) {
        this.applicationGatewayName = $.applicationGatewayName;
        this.connectionName = $.connectionName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationGatewayPrivateEndpointConnectionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationGatewayPrivateEndpointConnectionPlainArgs $;

        public Builder() {
            $ = new GetApplicationGatewayPrivateEndpointConnectionPlainArgs();
        }

        public Builder(GetApplicationGatewayPrivateEndpointConnectionPlainArgs defaults) {
            $ = new GetApplicationGatewayPrivateEndpointConnectionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationGatewayName The name of the application gateway.
         * 
         * @return builder
         * 
         */
        public Builder applicationGatewayName(String applicationGatewayName) {
            $.applicationGatewayName = applicationGatewayName;
            return this;
        }

        /**
         * @param connectionName The name of the application gateway private endpoint connection.
         * 
         * @return builder
         * 
         */
        public Builder connectionName(String connectionName) {
            $.connectionName = connectionName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetApplicationGatewayPrivateEndpointConnectionPlainArgs build() {
            $.applicationGatewayName = Objects.requireNonNull($.applicationGatewayName, "expected parameter 'applicationGatewayName' to be non-null");
            $.connectionName = Objects.requireNonNull($.connectionName, "expected parameter 'connectionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
