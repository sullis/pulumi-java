// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListWorkflowRunActionRepetitionExpressionTracesArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListWorkflowRunActionRepetitionExpressionTracesArgs Empty = new ListWorkflowRunActionRepetitionExpressionTracesArgs();

    /**
     * The workflow action name.
     * 
     */
    @InputImport(name="actionName", required=true)
    private final String actionName;

    public String getActionName() {
        return this.actionName;
    }

    /**
     * The workflow repetition.
     * 
     */
    @InputImport(name="repetitionName", required=true)
    private final String repetitionName;

    public String getRepetitionName() {
        return this.repetitionName;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The workflow run name.
     * 
     */
    @InputImport(name="runName", required=true)
    private final String runName;

    public String getRunName() {
        return this.runName;
    }

    /**
     * The workflow name.
     * 
     */
    @InputImport(name="workflowName", required=true)
    private final String workflowName;

    public String getWorkflowName() {
        return this.workflowName;
    }

    public ListWorkflowRunActionRepetitionExpressionTracesArgs(
        String actionName,
        String repetitionName,
        String resourceGroupName,
        String runName,
        String workflowName) {
        this.actionName = Objects.requireNonNull(actionName, "expected parameter 'actionName' to be non-null");
        this.repetitionName = Objects.requireNonNull(repetitionName, "expected parameter 'repetitionName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.runName = Objects.requireNonNull(runName, "expected parameter 'runName' to be non-null");
        this.workflowName = Objects.requireNonNull(workflowName, "expected parameter 'workflowName' to be non-null");
    }

    private ListWorkflowRunActionRepetitionExpressionTracesArgs() {
        this.actionName = null;
        this.repetitionName = null;
        this.resourceGroupName = null;
        this.runName = null;
        this.workflowName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWorkflowRunActionRepetitionExpressionTracesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionName;
        private String repetitionName;
        private String resourceGroupName;
        private String runName;
        private String workflowName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWorkflowRunActionRepetitionExpressionTracesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionName = defaults.actionName;
    	      this.repetitionName = defaults.repetitionName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.runName = defaults.runName;
    	      this.workflowName = defaults.workflowName;
        }

        public Builder setActionName(String actionName) {
            this.actionName = Objects.requireNonNull(actionName);
            return this;
        }

        public Builder setRepetitionName(String repetitionName) {
            this.repetitionName = Objects.requireNonNull(repetitionName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setRunName(String runName) {
            this.runName = Objects.requireNonNull(runName);
            return this;
        }

        public Builder setWorkflowName(String workflowName) {
            this.workflowName = Objects.requireNonNull(workflowName);
            return this;
        }

        public ListWorkflowRunActionRepetitionExpressionTracesArgs build() {
            return new ListWorkflowRunActionRepetitionExpressionTracesArgs(actionName, repetitionName, resourceGroupName, runName, workflowName);
        }
    }
}
