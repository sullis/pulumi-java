// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobQueryDefaultDatasetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobQueryDefaultDatasetGetArgs Empty = new JobQueryDefaultDatasetGetArgs();

    /**
     * The ID of the dataset containing this model.
     * 
     */
    @InputImport(name="datasetId", required=true)
      private final Input<String> datasetId;

    public Input<String> getDatasetId() {
        return this.datasetId;
    }

    /**
     * The ID of the project containing this model.
     * 
     */
    @InputImport(name="projectId")
      private final @Nullable Input<String> projectId;

    public Input<String> getProjectId() {
        return this.projectId == null ? Input.empty() : this.projectId;
    }

    public JobQueryDefaultDatasetGetArgs(
        Input<String> datasetId,
        @Nullable Input<String> projectId) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.projectId = projectId;
    }

    private JobQueryDefaultDatasetGetArgs() {
        this.datasetId = Input.empty();
        this.projectId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobQueryDefaultDatasetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> datasetId;
        private @Nullable Input<String> projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(JobQueryDefaultDatasetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.projectId = defaults.projectId;
        }

        public Builder setDatasetId(Input<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder setDatasetId(String datasetId) {
            this.datasetId = Input.of(Objects.requireNonNull(datasetId));
            return this;
        }

        public Builder setProjectId(@Nullable Input<String> projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setProjectId(@Nullable String projectId) {
            this.projectId = Input.ofNullable(projectId);
            return this;
        }
        public JobQueryDefaultDatasetGetArgs build() {
            return new JobQueryDefaultDatasetGetArgs(datasetId, projectId);
        }
    }
}