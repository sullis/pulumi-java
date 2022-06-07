// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scvmm.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualNetworkPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVirtualNetworkPlainArgs Empty = new GetVirtualNetworkPlainArgs();

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
     * Name of the VirtualNetwork.
     * 
     */
    @Import(name="virtualNetworkName", required=true)
    private String virtualNetworkName;

    /**
     * @return Name of the VirtualNetwork.
     * 
     */
    public String virtualNetworkName() {
        return this.virtualNetworkName;
    }

    private GetVirtualNetworkPlainArgs() {}

    private GetVirtualNetworkPlainArgs(GetVirtualNetworkPlainArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.virtualNetworkName = $.virtualNetworkName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualNetworkPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualNetworkPlainArgs $;

        public Builder() {
            $ = new GetVirtualNetworkPlainArgs();
        }

        public Builder(GetVirtualNetworkPlainArgs defaults) {
            $ = new GetVirtualNetworkPlainArgs(Objects.requireNonNull(defaults));
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
         * @param virtualNetworkName Name of the VirtualNetwork.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkName(String virtualNetworkName) {
            $.virtualNetworkName = virtualNetworkName;
            return this;
        }

        public GetVirtualNetworkPlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualNetworkName = Objects.requireNonNull($.virtualNetworkName, "expected parameter 'virtualNetworkName' to be non-null");
            return $;
        }
    }

}
