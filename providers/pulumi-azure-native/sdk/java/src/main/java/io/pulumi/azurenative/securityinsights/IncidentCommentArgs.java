// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IncidentCommentArgs extends io.pulumi.resources.ResourceArgs {

    public static final IncidentCommentArgs Empty = new IncidentCommentArgs();

    /**
     * Incident comment ID
     * 
     */
    @Import(name="incidentCommentId")
      private final @Nullable Output<String> incidentCommentId;

    public Output<String> getIncidentCommentId() {
        return this.incidentCommentId == null ? Output.empty() : this.incidentCommentId;
    }

    /**
     * Incident ID
     * 
     */
    @Import(name="incidentId", required=true)
      private final Output<String> incidentId;

    public Output<String> getIncidentId() {
        return this.incidentId;
    }

    /**
     * The comment message
     * 
     */
    @Import(name="message", required=true)
      private final Output<String> message;

    public Output<String> getMessage() {
        return this.message;
    }

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @Import(name="operationalInsightsResourceProvider", required=true)
      private final Output<String> operationalInsightsResourceProvider;

    public Output<String> getOperationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public IncidentCommentArgs(
        @Nullable Output<String> incidentCommentId,
        Output<String> incidentId,
        Output<String> message,
        Output<String> operationalInsightsResourceProvider,
        Output<String> resourceGroupName,
        Output<String> workspaceName) {
        this.incidentCommentId = incidentCommentId;
        this.incidentId = Objects.requireNonNull(incidentId, "expected parameter 'incidentId' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private IncidentCommentArgs() {
        this.incidentCommentId = Output.empty();
        this.incidentId = Output.empty();
        this.message = Output.empty();
        this.operationalInsightsResourceProvider = Output.empty();
        this.resourceGroupName = Output.empty();
        this.workspaceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IncidentCommentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> incidentCommentId;
        private Output<String> incidentId;
        private Output<String> message;
        private Output<String> operationalInsightsResourceProvider;
        private Output<String> resourceGroupName;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(IncidentCommentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.incidentCommentId = defaults.incidentCommentId;
    	      this.incidentId = defaults.incidentId;
    	      this.message = defaults.message;
    	      this.operationalInsightsResourceProvider = defaults.operationalInsightsResourceProvider;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder incidentCommentId(@Nullable Output<String> incidentCommentId) {
            this.incidentCommentId = incidentCommentId;
            return this;
        }
        public Builder incidentCommentId(@Nullable String incidentCommentId) {
            this.incidentCommentId = Output.ofNullable(incidentCommentId);
            return this;
        }
        public Builder incidentId(Output<String> incidentId) {
            this.incidentId = Objects.requireNonNull(incidentId);
            return this;
        }
        public Builder incidentId(String incidentId) {
            this.incidentId = Output.of(Objects.requireNonNull(incidentId));
            return this;
        }
        public Builder message(Output<String> message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder message(String message) {
            this.message = Output.of(Objects.requireNonNull(message));
            return this;
        }
        public Builder operationalInsightsResourceProvider(Output<String> operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider);
            return this;
        }
        public Builder operationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Output.of(Objects.requireNonNull(operationalInsightsResourceProvider));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }        public IncidentCommentArgs build() {
            return new IncidentCommentArgs(incidentCommentId, incidentId, message, operationalInsightsResourceProvider, resourceGroupName, workspaceName);
        }
    }
}
