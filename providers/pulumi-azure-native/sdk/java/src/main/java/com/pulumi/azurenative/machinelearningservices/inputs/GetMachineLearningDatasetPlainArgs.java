// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMachineLearningDatasetPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMachineLearningDatasetPlainArgs Empty = new GetMachineLearningDatasetPlainArgs();

    /**
     * The Dataset name.
     * 
     */
    @Import(name="datasetName", required=true)
    private String datasetName;

    /**
     * @return The Dataset name.
     * 
     */
    public String datasetName() {
        return this.datasetName;
    }

    /**
     * Name of the resource group in which workspace is located.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the resource group in which workspace is located.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    /**
     * @return Name of Azure Machine Learning workspace.
     * 
     */
    public String workspaceName() {
        return this.workspaceName;
    }

    private GetMachineLearningDatasetPlainArgs() {}

    private GetMachineLearningDatasetPlainArgs(GetMachineLearningDatasetPlainArgs $) {
        this.datasetName = $.datasetName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMachineLearningDatasetPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMachineLearningDatasetPlainArgs $;

        public Builder() {
            $ = new GetMachineLearningDatasetPlainArgs();
        }

        public Builder(GetMachineLearningDatasetPlainArgs defaults) {
            $ = new GetMachineLearningDatasetPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datasetName The Dataset name.
         * 
         * @return builder
         * 
         */
        public Builder datasetName(String datasetName) {
            $.datasetName = datasetName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group in which workspace is located.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param workspaceName Name of Azure Machine Learning workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetMachineLearningDatasetPlainArgs build() {
            $.datasetName = Objects.requireNonNull($.datasetName, "expected parameter 'datasetName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
