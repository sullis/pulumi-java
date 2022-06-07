// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWatchlistItemArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWatchlistItemArgs Empty = new GetWatchlistItemArgs();

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @Import(name="operationalInsightsResourceProvider", required=true)
    private Output<String> operationalInsightsResourceProvider;

    /**
     * @return The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    public Output<String> operationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
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
     * Watchlist Alias
     * 
     */
    @Import(name="watchlistAlias", required=true)
    private Output<String> watchlistAlias;

    /**
     * @return Watchlist Alias
     * 
     */
    public Output<String> watchlistAlias() {
        return this.watchlistAlias;
    }

    /**
     * Watchlist Item Id (GUID)
     * 
     */
    @Import(name="watchlistItemId", required=true)
    private Output<String> watchlistItemId;

    /**
     * @return Watchlist Item Id (GUID)
     * 
     */
    public Output<String> watchlistItemId() {
        return this.watchlistItemId;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    /**
     * @return The name of the workspace.
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private GetWatchlistItemArgs() {}

    private GetWatchlistItemArgs(GetWatchlistItemArgs $) {
        this.operationalInsightsResourceProvider = $.operationalInsightsResourceProvider;
        this.resourceGroupName = $.resourceGroupName;
        this.watchlistAlias = $.watchlistAlias;
        this.watchlistItemId = $.watchlistItemId;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWatchlistItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWatchlistItemArgs $;

        public Builder() {
            $ = new GetWatchlistItemArgs();
        }

        public Builder(GetWatchlistItemArgs defaults) {
            $ = new GetWatchlistItemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param operationalInsightsResourceProvider The namespace of workspaces resource provider- Microsoft.OperationalInsights.
         * 
         * @return builder
         * 
         */
        public Builder operationalInsightsResourceProvider(Output<String> operationalInsightsResourceProvider) {
            $.operationalInsightsResourceProvider = operationalInsightsResourceProvider;
            return this;
        }

        /**
         * @param operationalInsightsResourceProvider The namespace of workspaces resource provider- Microsoft.OperationalInsights.
         * 
         * @return builder
         * 
         */
        public Builder operationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            return operationalInsightsResourceProvider(Output.of(operationalInsightsResourceProvider));
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
         * @param watchlistAlias Watchlist Alias
         * 
         * @return builder
         * 
         */
        public Builder watchlistAlias(Output<String> watchlistAlias) {
            $.watchlistAlias = watchlistAlias;
            return this;
        }

        /**
         * @param watchlistAlias Watchlist Alias
         * 
         * @return builder
         * 
         */
        public Builder watchlistAlias(String watchlistAlias) {
            return watchlistAlias(Output.of(watchlistAlias));
        }

        /**
         * @param watchlistItemId Watchlist Item Id (GUID)
         * 
         * @return builder
         * 
         */
        public Builder watchlistItemId(Output<String> watchlistItemId) {
            $.watchlistItemId = watchlistItemId;
            return this;
        }

        /**
         * @param watchlistItemId Watchlist Item Id (GUID)
         * 
         * @return builder
         * 
         */
        public Builder watchlistItemId(String watchlistItemId) {
            return watchlistItemId(Output.of(watchlistItemId));
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public GetWatchlistItemArgs build() {
            $.operationalInsightsResourceProvider = Objects.requireNonNull($.operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.watchlistAlias = Objects.requireNonNull($.watchlistAlias, "expected parameter 'watchlistAlias' to be non-null");
            $.watchlistItemId = Objects.requireNonNull($.watchlistItemId, "expected parameter 'watchlistItemId' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
