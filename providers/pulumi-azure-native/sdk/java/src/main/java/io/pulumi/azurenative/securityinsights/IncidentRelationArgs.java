// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IncidentRelationArgs extends io.pulumi.resources.ResourceArgs {

    public static final IncidentRelationArgs Empty = new IncidentRelationArgs();

    /**
     * Incident ID
     * 
     */
    @InputImport(name="incidentId", required=true)
    private final Input<String> incidentId;

    public Input<String> getIncidentId() {
        return this.incidentId;
    }

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @InputImport(name="operationalInsightsResourceProvider", required=true)
    private final Input<String> operationalInsightsResourceProvider;

    public Input<String> getOperationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * The resource ID of the related resource
     * 
     */
    @InputImport(name="relatedResourceId", required=true)
    private final Input<String> relatedResourceId;

    public Input<String> getRelatedResourceId() {
        return this.relatedResourceId;
    }

    /**
     * Relation Name
     * 
     */
    @InputImport(name="relationName")
    private final @Nullable Input<String> relationName;

    public Input<String> getRelationName() {
        return this.relationName == null ? Input.empty() : this.relationName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
    private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public IncidentRelationArgs(
        Input<String> incidentId,
        Input<String> operationalInsightsResourceProvider,
        Input<String> relatedResourceId,
        @Nullable Input<String> relationName,
        Input<String> resourceGroupName,
        Input<String> workspaceName) {
        this.incidentId = Objects.requireNonNull(incidentId, "expected parameter 'incidentId' to be non-null");
        this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
        this.relatedResourceId = Objects.requireNonNull(relatedResourceId, "expected parameter 'relatedResourceId' to be non-null");
        this.relationName = relationName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private IncidentRelationArgs() {
        this.incidentId = Input.empty();
        this.operationalInsightsResourceProvider = Input.empty();
        this.relatedResourceId = Input.empty();
        this.relationName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IncidentRelationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> incidentId;
        private Input<String> operationalInsightsResourceProvider;
        private Input<String> relatedResourceId;
        private @Nullable Input<String> relationName;
        private Input<String> resourceGroupName;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(IncidentRelationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.incidentId = defaults.incidentId;
    	      this.operationalInsightsResourceProvider = defaults.operationalInsightsResourceProvider;
    	      this.relatedResourceId = defaults.relatedResourceId;
    	      this.relationName = defaults.relationName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setIncidentId(Input<String> incidentId) {
            this.incidentId = Objects.requireNonNull(incidentId);
            return this;
        }

        public Builder setIncidentId(String incidentId) {
            this.incidentId = Input.of(Objects.requireNonNull(incidentId));
            return this;
        }

        public Builder setOperationalInsightsResourceProvider(Input<String> operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider);
            return this;
        }

        public Builder setOperationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Input.of(Objects.requireNonNull(operationalInsightsResourceProvider));
            return this;
        }

        public Builder setRelatedResourceId(Input<String> relatedResourceId) {
            this.relatedResourceId = Objects.requireNonNull(relatedResourceId);
            return this;
        }

        public Builder setRelatedResourceId(String relatedResourceId) {
            this.relatedResourceId = Input.of(Objects.requireNonNull(relatedResourceId));
            return this;
        }

        public Builder setRelationName(@Nullable Input<String> relationName) {
            this.relationName = relationName;
            return this;
        }

        public Builder setRelationName(@Nullable String relationName) {
            this.relationName = Input.ofNullable(relationName);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }

        public IncidentRelationArgs build() {
            return new IncidentRelationArgs(incidentId, operationalInsightsResourceProvider, relatedResourceId, relationName, resourceGroupName, workspaceName);
        }
    }
}
