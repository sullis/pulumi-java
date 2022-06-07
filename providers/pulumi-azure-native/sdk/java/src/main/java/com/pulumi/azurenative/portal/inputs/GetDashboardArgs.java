// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.portal.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDashboardArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDashboardArgs Empty = new GetDashboardArgs();

    /**
     * The name of the dashboard.
     * 
     */
    @Import(name="dashboardName", required=true)
    private Output<String> dashboardName;

    /**
     * @return The name of the dashboard.
     * 
     */
    public Output<String> dashboardName() {
        return this.dashboardName;
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

    private GetDashboardArgs() {}

    private GetDashboardArgs(GetDashboardArgs $) {
        this.dashboardName = $.dashboardName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDashboardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDashboardArgs $;

        public Builder() {
            $ = new GetDashboardArgs();
        }

        public Builder(GetDashboardArgs defaults) {
            $ = new GetDashboardArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dashboardName The name of the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder dashboardName(Output<String> dashboardName) {
            $.dashboardName = dashboardName;
            return this;
        }

        /**
         * @param dashboardName The name of the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder dashboardName(String dashboardName) {
            return dashboardName(Output.of(dashboardName));
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

        public GetDashboardArgs build() {
            $.dashboardName = Objects.requireNonNull($.dashboardName, "expected parameter 'dashboardName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
