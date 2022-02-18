// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetWorkflowArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWorkflowArgs Empty = new GetWorkflowArgs();

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
     * The workflow name.
     * 
     */
    @InputImport(name="workflowName", required=true)
    private final String workflowName;

    public String getWorkflowName() {
        return this.workflowName;
    }

    public GetWorkflowArgs(
        String resourceGroupName,
        String workflowName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workflowName = Objects.requireNonNull(workflowName, "expected parameter 'workflowName' to be non-null");
    }

    private GetWorkflowArgs() {
        this.resourceGroupName = null;
        this.workflowName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkflowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String workflowName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkflowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workflowName = defaults.workflowName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setWorkflowName(String workflowName) {
            this.workflowName = Objects.requireNonNull(workflowName);
            return this;
        }

        public GetWorkflowArgs build() {
            return new GetWorkflowArgs(resourceGroupName, workflowName);
        }
    }
}
