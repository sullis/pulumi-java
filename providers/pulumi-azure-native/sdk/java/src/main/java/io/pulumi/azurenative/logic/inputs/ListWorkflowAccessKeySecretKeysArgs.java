// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListWorkflowAccessKeySecretKeysArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListWorkflowAccessKeySecretKeysArgs Empty = new ListWorkflowAccessKeySecretKeysArgs();

    /**
     * The workflow access key name.
     * 
     */
    @InputImport(name="accessKeyName", required=true)
    private final String accessKeyName;

    public String getAccessKeyName() {
        return this.accessKeyName;
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
     * The workflow name.
     * 
     */
    @InputImport(name="workflowName", required=true)
    private final String workflowName;

    public String getWorkflowName() {
        return this.workflowName;
    }

    public ListWorkflowAccessKeySecretKeysArgs(
        String accessKeyName,
        String resourceGroupName,
        String workflowName) {
        this.accessKeyName = Objects.requireNonNull(accessKeyName, "expected parameter 'accessKeyName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workflowName = Objects.requireNonNull(workflowName, "expected parameter 'workflowName' to be non-null");
    }

    private ListWorkflowAccessKeySecretKeysArgs() {
        this.accessKeyName = null;
        this.resourceGroupName = null;
        this.workflowName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWorkflowAccessKeySecretKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessKeyName;
        private String resourceGroupName;
        private String workflowName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWorkflowAccessKeySecretKeysArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyName = defaults.accessKeyName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workflowName = defaults.workflowName;
        }

        public Builder setAccessKeyName(String accessKeyName) {
            this.accessKeyName = Objects.requireNonNull(accessKeyName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setWorkflowName(String workflowName) {
            this.workflowName = Objects.requireNonNull(workflowName);
            return this;
        }

        public ListWorkflowAccessKeySecretKeysArgs build() {
            return new ListWorkflowAccessKeySecretKeysArgs(accessKeyName, resourceGroupName, workflowName);
        }
    }
}
