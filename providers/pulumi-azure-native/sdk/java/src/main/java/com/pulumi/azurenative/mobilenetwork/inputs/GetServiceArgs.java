// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.mobilenetwork.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServiceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceArgs Empty = new GetServiceArgs();

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

    /**
     * The name of the service. You must not use any of the following reserved strings - `default`, `requested` or `service`
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the service. You must not use any of the following reserved strings - `default`, `requested` or `service`
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private GetServiceArgs() {}

    private GetServiceArgs(GetServiceArgs $) {
        this.mobileNetworkName = $.mobileNetworkName;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceArgs $;

        public Builder() {
            $ = new GetServiceArgs();
        }

        public Builder(GetServiceArgs defaults) {
            $ = new GetServiceArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param serviceName The name of the service. You must not use any of the following reserved strings - `default`, `requested` or `service`
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the service. You must not use any of the following reserved strings - `default`, `requested` or `service`
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public GetServiceArgs build() {
            $.mobileNetworkName = Objects.requireNonNull($.mobileNetworkName, "expected parameter 'mobileNetworkName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
