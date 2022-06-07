// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualNetworkTapPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVirtualNetworkTapPlainArgs Empty = new GetVirtualNetworkTapPlainArgs();

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

    /**
     * The name of virtual network tap.
     * 
     */
    @Import(name="tapName", required=true)
    private String tapName;

    /**
     * @return The name of virtual network tap.
     * 
     */
    public String tapName() {
        return this.tapName;
    }

    private GetVirtualNetworkTapPlainArgs() {}

    private GetVirtualNetworkTapPlainArgs(GetVirtualNetworkTapPlainArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.tapName = $.tapName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualNetworkTapPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualNetworkTapPlainArgs $;

        public Builder() {
            $ = new GetVirtualNetworkTapPlainArgs();
        }

        public Builder(GetVirtualNetworkTapPlainArgs defaults) {
            $ = new GetVirtualNetworkTapPlainArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param tapName The name of virtual network tap.
         * 
         * @return builder
         * 
         */
        public Builder tapName(String tapName) {
            $.tapName = tapName;
            return this;
        }

        public GetVirtualNetworkTapPlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.tapName = Objects.requireNonNull($.tapName, "expected parameter 'tapName' to be non-null");
            return $;
        }
    }

}
