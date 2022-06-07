// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMaintenanceConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMaintenanceConfigurationArgs Empty = new GetMaintenanceConfigurationArgs();

    /**
     * The name of the maintenance configuration.
     * 
     */
    @Import(name="configName", required=true)
    private Output<String> configName;

    /**
     * @return The name of the maintenance configuration.
     * 
     */
    public Output<String> configName() {
        return this.configName;
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

    /**
     * The name of the managed cluster resource.
     * 
     */
    @Import(name="resourceName", required=true)
    private Output<String> resourceName;

    /**
     * @return The name of the managed cluster resource.
     * 
     */
    public Output<String> resourceName() {
        return this.resourceName;
    }

    private GetMaintenanceConfigurationArgs() {}

    private GetMaintenanceConfigurationArgs(GetMaintenanceConfigurationArgs $) {
        this.configName = $.configName;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMaintenanceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMaintenanceConfigurationArgs $;

        public Builder() {
            $ = new GetMaintenanceConfigurationArgs();
        }

        public Builder(GetMaintenanceConfigurationArgs defaults) {
            $ = new GetMaintenanceConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configName The name of the maintenance configuration.
         * 
         * @return builder
         * 
         */
        public Builder configName(Output<String> configName) {
            $.configName = configName;
            return this;
        }

        /**
         * @param configName The name of the maintenance configuration.
         * 
         * @return builder
         * 
         */
        public Builder configName(String configName) {
            return configName(Output.of(configName));
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

        /**
         * @param resourceName The name of the managed cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName The name of the managed cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        public GetMaintenanceConfigurationArgs build() {
            $.configName = Objects.requireNonNull($.configName, "expected parameter 'configName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
