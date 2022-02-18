// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowAccessKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowAccessKeyArgs Empty = new WorkflowAccessKeyArgs();

    /**
     * The workflow access key name.
     * 
     */
    @InputImport(name="accessKeyName")
    private final @Nullable Input<String> accessKeyName;

    public Input<String> getAccessKeyName() {
        return this.accessKeyName == null ? Input.empty() : this.accessKeyName;
    }

    /**
     * Gets or sets the resource id.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Gets or sets the not-after time.
     * 
     */
    @InputImport(name="notAfter")
    private final @Nullable Input<String> notAfter;

    public Input<String> getNotAfter() {
        return this.notAfter == null ? Input.empty() : this.notAfter;
    }

    /**
     * Gets or sets the not-before time.
     * 
     */
    @InputImport(name="notBefore")
    private final @Nullable Input<String> notBefore;

    public Input<String> getNotBefore() {
        return this.notBefore == null ? Input.empty() : this.notBefore;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The workflow name.
     * 
     */
    @InputImport(name="workflowName", required=true)
    private final Input<String> workflowName;

    public Input<String> getWorkflowName() {
        return this.workflowName;
    }

    public WorkflowAccessKeyArgs(
        @Nullable Input<String> accessKeyName,
        @Nullable Input<String> id,
        @Nullable Input<String> notAfter,
        @Nullable Input<String> notBefore,
        Input<String> resourceGroupName,
        Input<String> workflowName) {
        this.accessKeyName = accessKeyName;
        this.id = id;
        this.notAfter = notAfter;
        this.notBefore = notBefore;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workflowName = Objects.requireNonNull(workflowName, "expected parameter 'workflowName' to be non-null");
    }

    private WorkflowAccessKeyArgs() {
        this.accessKeyName = Input.empty();
        this.id = Input.empty();
        this.notAfter = Input.empty();
        this.notBefore = Input.empty();
        this.resourceGroupName = Input.empty();
        this.workflowName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowAccessKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessKeyName;
        private @Nullable Input<String> id;
        private @Nullable Input<String> notAfter;
        private @Nullable Input<String> notBefore;
        private Input<String> resourceGroupName;
        private Input<String> workflowName;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowAccessKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyName = defaults.accessKeyName;
    	      this.id = defaults.id;
    	      this.notAfter = defaults.notAfter;
    	      this.notBefore = defaults.notBefore;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workflowName = defaults.workflowName;
        }

        public Builder setAccessKeyName(@Nullable Input<String> accessKeyName) {
            this.accessKeyName = accessKeyName;
            return this;
        }

        public Builder setAccessKeyName(@Nullable String accessKeyName) {
            this.accessKeyName = Input.ofNullable(accessKeyName);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setNotAfter(@Nullable Input<String> notAfter) {
            this.notAfter = notAfter;
            return this;
        }

        public Builder setNotAfter(@Nullable String notAfter) {
            this.notAfter = Input.ofNullable(notAfter);
            return this;
        }

        public Builder setNotBefore(@Nullable Input<String> notBefore) {
            this.notBefore = notBefore;
            return this;
        }

        public Builder setNotBefore(@Nullable String notBefore) {
            this.notBefore = Input.ofNullable(notBefore);
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

        public Builder setWorkflowName(Input<String> workflowName) {
            this.workflowName = Objects.requireNonNull(workflowName);
            return this;
        }

        public Builder setWorkflowName(String workflowName) {
            this.workflowName = Input.of(Objects.requireNonNull(workflowName));
            return this;
        }

        public WorkflowAccessKeyArgs build() {
            return new WorkflowAccessKeyArgs(accessKeyName, id, notAfter, notBefore, resourceGroupName, workflowName);
        }
    }
}
