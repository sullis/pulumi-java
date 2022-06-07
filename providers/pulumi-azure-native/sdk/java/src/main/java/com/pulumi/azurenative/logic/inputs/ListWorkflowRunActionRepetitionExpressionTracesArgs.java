// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListWorkflowRunActionRepetitionExpressionTracesArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListWorkflowRunActionRepetitionExpressionTracesArgs Empty = new ListWorkflowRunActionRepetitionExpressionTracesArgs();

    /**
     * The workflow action name.
     * 
     */
    @Import(name="actionName", required=true)
    private Output<String> actionName;

    /**
     * @return The workflow action name.
     * 
     */
    public Output<String> actionName() {
        return this.actionName;
    }

    /**
     * The workflow repetition.
     * 
     */
    @Import(name="repetitionName", required=true)
    private Output<String> repetitionName;

    /**
     * @return The workflow repetition.
     * 
     */
    public Output<String> repetitionName() {
        return this.repetitionName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The workflow run name.
     * 
     */
    @Import(name="runName", required=true)
    private Output<String> runName;

    /**
     * @return The workflow run name.
     * 
     */
    public Output<String> runName() {
        return this.runName;
    }

    /**
     * The workflow name.
     * 
     */
    @Import(name="workflowName", required=true)
    private Output<String> workflowName;

    /**
     * @return The workflow name.
     * 
     */
    public Output<String> workflowName() {
        return this.workflowName;
    }

    private ListWorkflowRunActionRepetitionExpressionTracesArgs() {}

    private ListWorkflowRunActionRepetitionExpressionTracesArgs(ListWorkflowRunActionRepetitionExpressionTracesArgs $) {
        this.actionName = $.actionName;
        this.repetitionName = $.repetitionName;
        this.resourceGroupName = $.resourceGroupName;
        this.runName = $.runName;
        this.workflowName = $.workflowName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListWorkflowRunActionRepetitionExpressionTracesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListWorkflowRunActionRepetitionExpressionTracesArgs $;

        public Builder() {
            $ = new ListWorkflowRunActionRepetitionExpressionTracesArgs();
        }

        public Builder(ListWorkflowRunActionRepetitionExpressionTracesArgs defaults) {
            $ = new ListWorkflowRunActionRepetitionExpressionTracesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionName The workflow action name.
         * 
         * @return builder
         * 
         */
        public Builder actionName(Output<String> actionName) {
            $.actionName = actionName;
            return this;
        }

        /**
         * @param actionName The workflow action name.
         * 
         * @return builder
         * 
         */
        public Builder actionName(String actionName) {
            return actionName(Output.of(actionName));
        }

        /**
         * @param repetitionName The workflow repetition.
         * 
         * @return builder
         * 
         */
        public Builder repetitionName(Output<String> repetitionName) {
            $.repetitionName = repetitionName;
            return this;
        }

        /**
         * @param repetitionName The workflow repetition.
         * 
         * @return builder
         * 
         */
        public Builder repetitionName(String repetitionName) {
            return repetitionName(Output.of(repetitionName));
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param runName The workflow run name.
         * 
         * @return builder
         * 
         */
        public Builder runName(Output<String> runName) {
            $.runName = runName;
            return this;
        }

        /**
         * @param runName The workflow run name.
         * 
         * @return builder
         * 
         */
        public Builder runName(String runName) {
            return runName(Output.of(runName));
        }

        /**
         * @param workflowName The workflow name.
         * 
         * @return builder
         * 
         */
        public Builder workflowName(Output<String> workflowName) {
            $.workflowName = workflowName;
            return this;
        }

        /**
         * @param workflowName The workflow name.
         * 
         * @return builder
         * 
         */
        public Builder workflowName(String workflowName) {
            return workflowName(Output.of(workflowName));
        }

        public ListWorkflowRunActionRepetitionExpressionTracesArgs build() {
            $.actionName = Objects.requireNonNull($.actionName, "expected parameter 'actionName' to be non-null");
            $.repetitionName = Objects.requireNonNull($.repetitionName, "expected parameter 'repetitionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.runName = Objects.requireNonNull($.runName, "expected parameter 'runName' to be non-null");
            $.workflowName = Objects.requireNonNull($.workflowName, "expected parameter 'workflowName' to be non-null");
            return $;
        }
    }

}
