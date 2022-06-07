// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.maintenance.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMaintenanceConfigurationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMaintenanceConfigurationPlainArgs Empty = new GetMaintenanceConfigurationPlainArgs();

    /**
     * Resource Group Name
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Resource Group Name
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource Identifier
     * 
     */
    @Import(name="resourceName", required=true)
    private String resourceName;

    /**
     * @return Resource Identifier
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }

    private GetMaintenanceConfigurationPlainArgs() {}

    private GetMaintenanceConfigurationPlainArgs(GetMaintenanceConfigurationPlainArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMaintenanceConfigurationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMaintenanceConfigurationPlainArgs $;

        public Builder() {
            $ = new GetMaintenanceConfigurationPlainArgs();
        }

        public Builder(GetMaintenanceConfigurationPlainArgs defaults) {
            $ = new GetMaintenanceConfigurationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName Resource Group Name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceName Resource Identifier
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public GetMaintenanceConfigurationPlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
