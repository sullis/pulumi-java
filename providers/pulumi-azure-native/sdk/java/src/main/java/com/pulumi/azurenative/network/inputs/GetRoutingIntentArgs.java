// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRoutingIntentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRoutingIntentArgs Empty = new GetRoutingIntentArgs();

    /**
     * The resource group name of the RoutingIntent.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name of the RoutingIntent.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the RoutingIntent.
     * 
     */
    @Import(name="routingIntentName", required=true)
    private String routingIntentName;

    /**
     * @return The name of the RoutingIntent.
     * 
     */
    public String routingIntentName() {
        return this.routingIntentName;
    }

    /**
     * The name of the VirtualHub.
     * 
     */
    @Import(name="virtualHubName", required=true)
    private String virtualHubName;

    /**
     * @return The name of the VirtualHub.
     * 
     */
    public String virtualHubName() {
        return this.virtualHubName;
    }

    private GetRoutingIntentArgs() {}

    private GetRoutingIntentArgs(GetRoutingIntentArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.routingIntentName = $.routingIntentName;
        this.virtualHubName = $.virtualHubName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRoutingIntentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRoutingIntentArgs $;

        public Builder() {
            $ = new GetRoutingIntentArgs();
        }

        public Builder(GetRoutingIntentArgs defaults) {
            $ = new GetRoutingIntentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The resource group name of the RoutingIntent.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param routingIntentName The name of the RoutingIntent.
         * 
         * @return builder
         * 
         */
        public Builder routingIntentName(String routingIntentName) {
            $.routingIntentName = routingIntentName;
            return this;
        }

        /**
         * @param virtualHubName The name of the VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder virtualHubName(String virtualHubName) {
            $.virtualHubName = virtualHubName;
            return this;
        }

        public GetRoutingIntentArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.routingIntentName = Objects.requireNonNull($.routingIntentName, "expected parameter 'routingIntentName' to be non-null");
            $.virtualHubName = Objects.requireNonNull($.virtualHubName, "expected parameter 'virtualHubName' to be non-null");
            return $;
        }
    }

}
