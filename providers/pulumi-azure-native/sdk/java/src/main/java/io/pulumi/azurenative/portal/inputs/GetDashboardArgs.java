// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDashboardArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDashboardArgs Empty = new GetDashboardArgs();

    /**
     * The name of the dashboard.
     * 
     */
    @InputImport(name="dashboardName", required=true)
    private final String dashboardName;

    public String getDashboardName() {
        return this.dashboardName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetDashboardArgs(
        String dashboardName,
        String resourceGroupName) {
        this.dashboardName = Objects.requireNonNull(dashboardName, "expected parameter 'dashboardName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetDashboardArgs() {
        this.dashboardName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDashboardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dashboardName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDashboardArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dashboardName = defaults.dashboardName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setDashboardName(String dashboardName) {
            this.dashboardName = Objects.requireNonNull(dashboardName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetDashboardArgs build() {
            return new GetDashboardArgs(dashboardName, resourceGroupName);
        }
    }
}
