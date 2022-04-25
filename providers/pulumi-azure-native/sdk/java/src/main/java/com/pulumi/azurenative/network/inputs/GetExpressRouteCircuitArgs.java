// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetExpressRouteCircuitArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExpressRouteCircuitArgs Empty = new GetExpressRouteCircuitArgs();

    /**
     * The name of express route circuit.
     * 
     */
    @Import(name="circuitName", required=true)
    private String circuitName;

    /**
     * @return The name of express route circuit.
     * 
     */
    public String circuitName() {
        return this.circuitName;
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

    private GetExpressRouteCircuitArgs() {}

    private GetExpressRouteCircuitArgs(GetExpressRouteCircuitArgs $) {
        this.circuitName = $.circuitName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExpressRouteCircuitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExpressRouteCircuitArgs $;

        public Builder() {
            $ = new GetExpressRouteCircuitArgs();
        }

        public Builder(GetExpressRouteCircuitArgs defaults) {
            $ = new GetExpressRouteCircuitArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param circuitName The name of express route circuit.
         * 
         * @return builder
         * 
         */
        public Builder circuitName(String circuitName) {
            $.circuitName = circuitName;
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

        public GetExpressRouteCircuitArgs build() {
            $.circuitName = Objects.requireNonNull($.circuitName, "expected parameter 'circuitName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
