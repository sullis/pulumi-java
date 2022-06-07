// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEntityInsightsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEntityInsightsArgs Empty = new GetEntityInsightsArgs();

    /**
     * Indicates if query time range should be extended with default time range of the query. Default value is false
     * 
     */
    @Import(name="addDefaultExtendedTimeRange")
    private @Nullable Output<Boolean> addDefaultExtendedTimeRange;

    /**
     * @return Indicates if query time range should be extended with default time range of the query. Default value is false
     * 
     */
    public Optional<Output<Boolean>> addDefaultExtendedTimeRange() {
        return Optional.ofNullable(this.addDefaultExtendedTimeRange);
    }

    /**
     * The end timeline date, so the results returned are before this date.
     * 
     */
    @Import(name="endTime", required=true)
    private Output<String> endTime;

    /**
     * @return The end timeline date, so the results returned are before this date.
     * 
     */
    public Output<String> endTime() {
        return this.endTime;
    }

    /**
     * entity ID
     * 
     */
    @Import(name="entityId", required=true)
    private Output<String> entityId;

    /**
     * @return entity ID
     * 
     */
    public Output<String> entityId() {
        return this.entityId;
    }

    /**
     * List of Insights Query Id. If empty, default value is all insights of this entity
     * 
     */
    @Import(name="insightQueryIds")
    private @Nullable Output<List<String>> insightQueryIds;

    /**
     * @return List of Insights Query Id. If empty, default value is all insights of this entity
     * 
     */
    public Optional<Output<List<String>>> insightQueryIds() {
        return Optional.ofNullable(this.insightQueryIds);
    }

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
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The start timeline date, so the results returned are after this date.
     * 
     */
    @Import(name="startTime", required=true)
    private Output<String> startTime;

    /**
     * @return The start timeline date, so the results returned are after this date.
     * 
     */
    public Output<String> startTime() {
        return this.startTime;
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

    private GetEntityInsightsArgs() {}

    private GetEntityInsightsArgs(GetEntityInsightsArgs $) {
        this.addDefaultExtendedTimeRange = $.addDefaultExtendedTimeRange;
        this.endTime = $.endTime;
        this.entityId = $.entityId;
        this.insightQueryIds = $.insightQueryIds;
        this.operationalInsightsResourceProvider = $.operationalInsightsResourceProvider;
        this.resourceGroupName = $.resourceGroupName;
        this.startTime = $.startTime;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEntityInsightsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEntityInsightsArgs $;

        public Builder() {
            $ = new GetEntityInsightsArgs();
        }

        public Builder(GetEntityInsightsArgs defaults) {
            $ = new GetEntityInsightsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addDefaultExtendedTimeRange Indicates if query time range should be extended with default time range of the query. Default value is false
         * 
         * @return builder
         * 
         */
        public Builder addDefaultExtendedTimeRange(@Nullable Output<Boolean> addDefaultExtendedTimeRange) {
            $.addDefaultExtendedTimeRange = addDefaultExtendedTimeRange;
            return this;
        }

        /**
         * @param addDefaultExtendedTimeRange Indicates if query time range should be extended with default time range of the query. Default value is false
         * 
         * @return builder
         * 
         */
        public Builder addDefaultExtendedTimeRange(Boolean addDefaultExtendedTimeRange) {
            return addDefaultExtendedTimeRange(Output.of(addDefaultExtendedTimeRange));
        }

        /**
         * @param endTime The end timeline date, so the results returned are before this date.
         * 
         * @return builder
         * 
         */
        public Builder endTime(Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param endTime The end timeline date, so the results returned are before this date.
         * 
         * @return builder
         * 
         */
        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        /**
         * @param entityId entity ID
         * 
         * @return builder
         * 
         */
        public Builder entityId(Output<String> entityId) {
            $.entityId = entityId;
            return this;
        }

        /**
         * @param entityId entity ID
         * 
         * @return builder
         * 
         */
        public Builder entityId(String entityId) {
            return entityId(Output.of(entityId));
        }

        /**
         * @param insightQueryIds List of Insights Query Id. If empty, default value is all insights of this entity
         * 
         * @return builder
         * 
         */
        public Builder insightQueryIds(@Nullable Output<List<String>> insightQueryIds) {
            $.insightQueryIds = insightQueryIds;
            return this;
        }

        /**
         * @param insightQueryIds List of Insights Query Id. If empty, default value is all insights of this entity
         * 
         * @return builder
         * 
         */
        public Builder insightQueryIds(List<String> insightQueryIds) {
            return insightQueryIds(Output.of(insightQueryIds));
        }

        /**
         * @param insightQueryIds List of Insights Query Id. If empty, default value is all insights of this entity
         * 
         * @return builder
         * 
         */
        public Builder insightQueryIds(String... insightQueryIds) {
            return insightQueryIds(List.of(insightQueryIds));
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
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param startTime The start timeline date, so the results returned are after this date.
         * 
         * @return builder
         * 
         */
        public Builder startTime(Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime The start timeline date, so the results returned are after this date.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
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

        public GetEntityInsightsArgs build() {
            $.endTime = Objects.requireNonNull($.endTime, "expected parameter 'endTime' to be non-null");
            $.entityId = Objects.requireNonNull($.entityId, "expected parameter 'entityId' to be non-null");
            $.operationalInsightsResourceProvider = Objects.requireNonNull($.operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
