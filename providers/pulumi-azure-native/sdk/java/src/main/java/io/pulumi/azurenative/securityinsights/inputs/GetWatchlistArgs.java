// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetWatchlistArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWatchlistArgs Empty = new GetWatchlistArgs();

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @InputImport(name="operationalInsightsResourceProvider", required=true)
    private final String operationalInsightsResourceProvider;

    public String getOperationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Watchlist Alias
     * 
     */
    @InputImport(name="watchlistAlias", required=true)
    private final String watchlistAlias;

    public String getWatchlistAlias() {
        return this.watchlistAlias;
    }

    /**
     * The name of the workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
    private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetWatchlistArgs(
        String operationalInsightsResourceProvider,
        String resourceGroupName,
        String watchlistAlias,
        String workspaceName) {
        this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.watchlistAlias = Objects.requireNonNull(watchlistAlias, "expected parameter 'watchlistAlias' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetWatchlistArgs() {
        this.operationalInsightsResourceProvider = null;
        this.resourceGroupName = null;
        this.watchlistAlias = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWatchlistArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String operationalInsightsResourceProvider;
        private String resourceGroupName;
        private String watchlistAlias;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWatchlistArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operationalInsightsResourceProvider = defaults.operationalInsightsResourceProvider;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.watchlistAlias = defaults.watchlistAlias;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setOperationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setWatchlistAlias(String watchlistAlias) {
            this.watchlistAlias = Objects.requireNonNull(watchlistAlias);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public GetWatchlistArgs build() {
            return new GetWatchlistArgs(operationalInsightsResourceProvider, resourceGroupName, watchlistAlias, workspaceName);
        }
    }
}
