// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.mobilenetwork.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMobileNetworkArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMobileNetworkArgs Empty = new GetMobileNetworkArgs();

    /**
     * The name of the mobile network.
     * 
     */
    @Import(name="mobileNetworkName", required=true)
    private Output<String> mobileNetworkName;

    /**
     * @return The name of the mobile network.
     * 
     */
    public Output<String> mobileNetworkName() {
        return this.mobileNetworkName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetMobileNetworkArgs() {}

    private GetMobileNetworkArgs(GetMobileNetworkArgs $) {
        this.mobileNetworkName = $.mobileNetworkName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMobileNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMobileNetworkArgs $;

        public Builder() {
            $ = new GetMobileNetworkArgs();
        }

        public Builder(GetMobileNetworkArgs defaults) {
            $ = new GetMobileNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mobileNetworkName The name of the mobile network.
         * 
         * @return builder
         * 
         */
        public Builder mobileNetworkName(Output<String> mobileNetworkName) {
            $.mobileNetworkName = mobileNetworkName;
            return this;
        }

        /**
         * @param mobileNetworkName The name of the mobile network.
         * 
         * @return builder
         * 
         */
        public Builder mobileNetworkName(String mobileNetworkName) {
            return mobileNetworkName(Output.of(mobileNetworkName));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetMobileNetworkArgs build() {
            $.mobileNetworkName = Objects.requireNonNull($.mobileNetworkName, "expected parameter 'mobileNetworkName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
