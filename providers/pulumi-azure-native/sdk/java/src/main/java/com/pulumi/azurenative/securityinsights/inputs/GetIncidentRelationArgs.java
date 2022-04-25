// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIncidentRelationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIncidentRelationArgs Empty = new GetIncidentRelationArgs();

    /**
     * Incident ID
     * 
     */
    @Import(name="incidentId", required=true)
    private String incidentId;

    /**
     * @return Incident ID
     * 
     */
    public String incidentId() {
        return this.incidentId;
    }

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @Import(name="operationalInsightsResourceProvider", required=true)
    private String operationalInsightsResourceProvider;

    /**
     * @return The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    public String operationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * Relation Name
     * 
     */
    @Import(name="relationName", required=true)
    private String relationName;

    /**
     * @return Relation Name
     * 
     */
    public String relationName() {
        return this.relationName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    /**
     * @return The name of the workspace.
     * 
     */
    public String workspaceName() {
        return this.workspaceName;
    }

    private GetIncidentRelationArgs() {}

    private GetIncidentRelationArgs(GetIncidentRelationArgs $) {
        this.incidentId = $.incidentId;
        this.operationalInsightsResourceProvider = $.operationalInsightsResourceProvider;
        this.relationName = $.relationName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIncidentRelationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIncidentRelationArgs $;

        public Builder() {
            $ = new GetIncidentRelationArgs();
        }

        public Builder(GetIncidentRelationArgs defaults) {
            $ = new GetIncidentRelationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param incidentId Incident ID
         * 
         * @return builder
         * 
         */
        public Builder incidentId(String incidentId) {
            $.incidentId = incidentId;
            return this;
        }

        /**
         * @param operationalInsightsResourceProvider The namespace of workspaces resource provider- Microsoft.OperationalInsights.
         * 
         * @return builder
         * 
         */
        public Builder operationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            $.operationalInsightsResourceProvider = operationalInsightsResourceProvider;
            return this;
        }

        /**
         * @param relationName Relation Name
         * 
         * @return builder
         * 
         */
        public Builder relationName(String relationName) {
            $.relationName = relationName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetIncidentRelationArgs build() {
            $.incidentId = Objects.requireNonNull($.incidentId, "expected parameter 'incidentId' to be non-null");
            $.operationalInsightsResourceProvider = Objects.requireNonNull($.operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
            $.relationName = Objects.requireNonNull($.relationName, "expected parameter 'relationName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
