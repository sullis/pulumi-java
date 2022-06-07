// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetConnectivityConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectivityConfigurationArgs Empty = new GetConnectivityConfigurationArgs();

    /**
     * The name of the network manager connectivity configuration.
     * 
     */
    @Import(name="configurationName", required=true)
    private Output<String> configurationName;

    /**
     * @return The name of the network manager connectivity configuration.
     * 
     */
    public Output<String> configurationName() {
        return this.configurationName;
    }

    /**
     * The name of the network manager.
     * 
     */
    @Import(name="networkManagerName", required=true)
    private Output<String> networkManagerName;

    /**
     * @return The name of the network manager.
     * 
     */
    public Output<String> networkManagerName() {
        return this.networkManagerName;
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

    private GetConnectivityConfigurationArgs() {}

    private GetConnectivityConfigurationArgs(GetConnectivityConfigurationArgs $) {
        this.configurationName = $.configurationName;
        this.networkManagerName = $.networkManagerName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectivityConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectivityConfigurationArgs $;

        public Builder() {
            $ = new GetConnectivityConfigurationArgs();
        }

        public Builder(GetConnectivityConfigurationArgs defaults) {
            $ = new GetConnectivityConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configurationName The name of the network manager connectivity configuration.
         * 
         * @return builder
         * 
         */
        public Builder configurationName(Output<String> configurationName) {
            $.configurationName = configurationName;
            return this;
        }

        /**
         * @param configurationName The name of the network manager connectivity configuration.
         * 
         * @return builder
         * 
         */
        public Builder configurationName(String configurationName) {
            return configurationName(Output.of(configurationName));
        }

        /**
         * @param networkManagerName The name of the network manager.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerName(Output<String> networkManagerName) {
            $.networkManagerName = networkManagerName;
            return this;
        }

        /**
         * @param networkManagerName The name of the network manager.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerName(String networkManagerName) {
            return networkManagerName(Output.of(networkManagerName));
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

        public GetConnectivityConfigurationArgs build() {
            $.configurationName = Objects.requireNonNull($.configurationName, "expected parameter 'configurationName' to be non-null");
            $.networkManagerName = Objects.requireNonNull($.networkManagerName, "expected parameter 'networkManagerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
