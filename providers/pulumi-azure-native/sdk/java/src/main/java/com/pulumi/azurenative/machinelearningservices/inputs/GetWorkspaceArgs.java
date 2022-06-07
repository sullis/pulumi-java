// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWorkspaceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkspaceArgs Empty = new GetWorkspaceArgs();

    /**
     * Name of the resource group in which workspace is located.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group in which workspace is located.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    /**
     * @return Name of Azure Machine Learning workspace.
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private GetWorkspaceArgs() {}

    private GetWorkspaceArgs(GetWorkspaceArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkspaceArgs $;

        public Builder() {
            $ = new GetWorkspaceArgs();
        }

        public Builder(GetWorkspaceArgs defaults) {
            $ = new GetWorkspaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName Name of the resource group in which workspace is located.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group in which workspace is located.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param workspaceName Name of Azure Machine Learning workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName Name of Azure Machine Learning workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public GetWorkspaceArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
