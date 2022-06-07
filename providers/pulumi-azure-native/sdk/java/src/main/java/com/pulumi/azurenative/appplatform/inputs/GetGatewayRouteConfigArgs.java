// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGatewayRouteConfigArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGatewayRouteConfigArgs Empty = new GetGatewayRouteConfigArgs();

    /**
     * The name of Spring Cloud Gateway.
     * 
     */
    @Import(name="gatewayName", required=true)
    private Output<String> gatewayName;

    /**
     * @return The name of Spring Cloud Gateway.
     * 
     */
    public Output<String> gatewayName() {
        return this.gatewayName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Spring Cloud Gateway route config.
     * 
     */
    @Import(name="routeConfigName", required=true)
    private Output<String> routeConfigName;

    /**
     * @return The name of the Spring Cloud Gateway route config.
     * 
     */
    public Output<String> routeConfigName() {
        return this.routeConfigName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the Service resource.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private GetGatewayRouteConfigArgs() {}

    private GetGatewayRouteConfigArgs(GetGatewayRouteConfigArgs $) {
        this.gatewayName = $.gatewayName;
        this.resourceGroupName = $.resourceGroupName;
        this.routeConfigName = $.routeConfigName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGatewayRouteConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGatewayRouteConfigArgs $;

        public Builder() {
            $ = new GetGatewayRouteConfigArgs();
        }

        public Builder(GetGatewayRouteConfigArgs defaults) {
            $ = new GetGatewayRouteConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gatewayName The name of Spring Cloud Gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayName(Output<String> gatewayName) {
            $.gatewayName = gatewayName;
            return this;
        }

        /**
         * @param gatewayName The name of Spring Cloud Gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayName(String gatewayName) {
            return gatewayName(Output.of(gatewayName));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param routeConfigName The name of the Spring Cloud Gateway route config.
         * 
         * @return builder
         * 
         */
        public Builder routeConfigName(Output<String> routeConfigName) {
            $.routeConfigName = routeConfigName;
            return this;
        }

        /**
         * @param routeConfigName The name of the Spring Cloud Gateway route config.
         * 
         * @return builder
         * 
         */
        public Builder routeConfigName(String routeConfigName) {
            return routeConfigName(Output.of(routeConfigName));
        }

        /**
         * @param serviceName The name of the Service resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the Service resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public GetGatewayRouteConfigArgs build() {
            $.gatewayName = Objects.requireNonNull($.gatewayName, "expected parameter 'gatewayName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.routeConfigName = Objects.requireNonNull($.routeConfigName, "expected parameter 'routeConfigName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
