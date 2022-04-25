// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListWorkflowTriggerCallbackUrlArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListWorkflowTriggerCallbackUrlArgs Empty = new ListWorkflowTriggerCallbackUrlArgs();

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The workflow trigger name.
     * 
     */
    @Import(name="triggerName", required=true)
    private String triggerName;

    /**
     * @return The workflow trigger name.
     * 
     */
    public String triggerName() {
        return this.triggerName;
    }

    /**
     * The workflow name.
     * 
     */
    @Import(name="workflowName", required=true)
    private String workflowName;

    /**
     * @return The workflow name.
     * 
     */
    public String workflowName() {
        return this.workflowName;
    }

    private ListWorkflowTriggerCallbackUrlArgs() {}

    private ListWorkflowTriggerCallbackUrlArgs(ListWorkflowTriggerCallbackUrlArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.triggerName = $.triggerName;
        this.workflowName = $.workflowName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListWorkflowTriggerCallbackUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListWorkflowTriggerCallbackUrlArgs $;

        public Builder() {
            $ = new ListWorkflowTriggerCallbackUrlArgs();
        }

        public Builder(ListWorkflowTriggerCallbackUrlArgs defaults) {
            $ = new ListWorkflowTriggerCallbackUrlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param triggerName The workflow trigger name.
         * 
         * @return builder
         * 
         */
        public Builder triggerName(String triggerName) {
            $.triggerName = triggerName;
            return this;
        }

        /**
         * @param workflowName The workflow name.
         * 
         * @return builder
         * 
         */
        public Builder workflowName(String workflowName) {
            $.workflowName = workflowName;
            return this;
        }

        public ListWorkflowTriggerCallbackUrlArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.triggerName = Objects.requireNonNull($.triggerName, "expected parameter 'triggerName' to be non-null");
            $.workflowName = Objects.requireNonNull($.workflowName, "expected parameter 'workflowName' to be non-null");
            return $;
        }
    }

}
