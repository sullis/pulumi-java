// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGatewayArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGatewayArgs Empty = new GetGatewayArgs();

    /**
     * Gateway entity identifier. Must be unique in the current API Management service instance. Must not have value &#39;managed&#39;
     * 
     */
    @Import(name="gatewayId", required=true)
    private Output<String> gatewayId;

    /**
     * @return Gateway entity identifier. Must be unique in the current API Management service instance. Must not have value &#39;managed&#39;
     * 
     */
    public Output<String> gatewayId() {
        return this.gatewayId;
    }

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
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the API Management service.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private GetGatewayArgs() {}

    private GetGatewayArgs(GetGatewayArgs $) {
        this.gatewayId = $.gatewayId;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGatewayArgs $;

        public Builder() {
            $ = new GetGatewayArgs();
        }

        public Builder(GetGatewayArgs defaults) {
            $ = new GetGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must not have value &#39;managed&#39;
         * 
         * @return builder
         * 
         */
        public Builder gatewayId(Output<String> gatewayId) {
            $.gatewayId = gatewayId;
            return this;
        }

        /**
         * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must not have value &#39;managed&#39;
         * 
         * @return builder
         * 
         */
        public Builder gatewayId(String gatewayId) {
            return gatewayId(Output.of(gatewayId));
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
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public GetGatewayArgs build() {
            $.gatewayId = Objects.requireNonNull($.gatewayId, "expected parameter 'gatewayId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
