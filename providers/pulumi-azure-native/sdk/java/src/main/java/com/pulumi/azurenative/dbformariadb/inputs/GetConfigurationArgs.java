// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbformariadb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConfigurationArgs Empty = new GetConfigurationArgs();

    /**
     * The name of the server configuration.
     * 
     */
    @Import(name="configurationName", required=true)
    private Output<String> configurationName;

    /**
     * @return The name of the server configuration.
     * 
     */
    public Output<String> configurationName() {
        return this.configurationName;
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
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
    private Output<String> serverName;

    /**
     * @return The name of the server.
     * 
     */
    public Output<String> serverName() {
        return this.serverName;
    }

    private GetConfigurationArgs() {}

    private GetConfigurationArgs(GetConfigurationArgs $) {
        this.configurationName = $.configurationName;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConfigurationArgs $;

        public Builder() {
            $ = new GetConfigurationArgs();
        }

        public Builder(GetConfigurationArgs defaults) {
            $ = new GetConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configurationName The name of the server configuration.
         * 
         * @return builder
         * 
         */
        public Builder configurationName(Output<String> configurationName) {
            $.configurationName = configurationName;
            return this;
        }

        /**
         * @param configurationName The name of the server configuration.
         * 
         * @return builder
         * 
         */
        public Builder configurationName(String configurationName) {
            return configurationName(Output.of(configurationName));
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
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        public GetConfigurationArgs build() {
            $.configurationName = Objects.requireNonNull($.configurationName, "expected parameter 'configurationName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
