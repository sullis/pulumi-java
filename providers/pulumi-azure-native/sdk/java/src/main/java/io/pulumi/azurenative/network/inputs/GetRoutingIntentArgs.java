// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetRoutingIntentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRoutingIntentArgs Empty = new GetRoutingIntentArgs();

    /**
     * The resource group name of the RoutingIntent.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the RoutingIntent.
     * 
     */
    @InputImport(name="routingIntentName", required=true)
    private final String routingIntentName;

    public String getRoutingIntentName() {
        return this.routingIntentName;
    }

    /**
     * The name of the VirtualHub.
     * 
     */
    @InputImport(name="virtualHubName", required=true)
    private final String virtualHubName;

    public String getVirtualHubName() {
        return this.virtualHubName;
    }

    public GetRoutingIntentArgs(
        String resourceGroupName,
        String routingIntentName,
        String virtualHubName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.routingIntentName = Objects.requireNonNull(routingIntentName, "expected parameter 'routingIntentName' to be non-null");
        this.virtualHubName = Objects.requireNonNull(virtualHubName, "expected parameter 'virtualHubName' to be non-null");
    }

    private GetRoutingIntentArgs() {
        this.resourceGroupName = null;
        this.routingIntentName = null;
        this.virtualHubName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoutingIntentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String routingIntentName;
        private String virtualHubName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRoutingIntentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.routingIntentName = defaults.routingIntentName;
    	      this.virtualHubName = defaults.virtualHubName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setRoutingIntentName(String routingIntentName) {
            this.routingIntentName = Objects.requireNonNull(routingIntentName);
            return this;
        }

        public Builder setVirtualHubName(String virtualHubName) {
            this.virtualHubName = Objects.requireNonNull(virtualHubName);
            return this;
        }

        public GetRoutingIntentArgs build() {
            return new GetRoutingIntentArgs(resourceGroupName, routingIntentName, virtualHubName);
        }
    }
}
