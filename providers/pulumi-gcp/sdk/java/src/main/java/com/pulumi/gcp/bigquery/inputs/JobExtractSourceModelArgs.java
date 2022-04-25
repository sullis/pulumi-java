// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class JobExtractSourceModelArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobExtractSourceModelArgs Empty = new JobExtractSourceModelArgs();

    /**
     * The ID of the dataset containing this model.
     * 
     */
    @Import(name="datasetId", required=true)
    private Output<String> datasetId;

    /**
     * @return The ID of the dataset containing this model.
     * 
     */
    public Output<String> datasetId() {
        return this.datasetId;
    }

    /**
     * The ID of the model.
     * 
     */
    @Import(name="modelId", required=true)
    private Output<String> modelId;

    /**
     * @return The ID of the model.
     * 
     */
    public Output<String> modelId() {
        return this.modelId;
    }

    /**
     * The ID of the project containing this model.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The ID of the project containing this model.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private JobExtractSourceModelArgs() {}

    private JobExtractSourceModelArgs(JobExtractSourceModelArgs $) {
        this.datasetId = $.datasetId;
        this.modelId = $.modelId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobExtractSourceModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobExtractSourceModelArgs $;

        public Builder() {
            $ = new JobExtractSourceModelArgs();
        }

        public Builder(JobExtractSourceModelArgs defaults) {
            $ = new JobExtractSourceModelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datasetId The ID of the dataset containing this model.
         * 
         * @return builder
         * 
         */
        public Builder datasetId(Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        /**
         * @param datasetId The ID of the dataset containing this model.
         * 
         * @return builder
         * 
         */
        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        /**
         * @param modelId The ID of the model.
         * 
         * @return builder
         * 
         */
        public Builder modelId(Output<String> modelId) {
            $.modelId = modelId;
            return this;
        }

        /**
         * @param modelId The ID of the model.
         * 
         * @return builder
         * 
         */
        public Builder modelId(String modelId) {
            return modelId(Output.of(modelId));
        }

        /**
         * @param projectId The ID of the project containing this model.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The ID of the project containing this model.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public JobExtractSourceModelArgs build() {
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.modelId = Objects.requireNonNull($.modelId, "expected parameter 'modelId' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}
