// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetReferenceArgs Empty = new DatasetReferenceArgs();

    /**
     * [Required] A unique ID for this dataset, without the project name. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters.
     * 
     */
    @InputImport(name="datasetId")
      private final @Nullable Input<String> datasetId;

    public Input<String> getDatasetId() {
        return this.datasetId == null ? Input.empty() : this.datasetId;
    }

    /**
     * [Optional] The ID of the project containing this dataset.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public DatasetReferenceArgs(
        @Nullable Input<String> datasetId,
        @Nullable Input<String> project) {
        this.datasetId = datasetId;
        this.project = project;
    }

    private DatasetReferenceArgs() {
        this.datasetId = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> datasetId;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.project = defaults.project;
        }

        public Builder setDatasetId(@Nullable Input<String> datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        public Builder setDatasetId(@Nullable String datasetId) {
            this.datasetId = Input.ofNullable(datasetId);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }
        public DatasetReferenceArgs build() {
            return new DatasetReferenceArgs(datasetId, project);
        }
    }
}