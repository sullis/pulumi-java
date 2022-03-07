// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableReferenceArgs Empty = new TableReferenceArgs();

    /**
     * [Required] The ID of the dataset containing this table.
     * 
     */
    @InputImport(name="datasetId")
      private final @Nullable Input<String> datasetId;

    public Input<String> getDatasetId() {
        return this.datasetId == null ? Input.empty() : this.datasetId;
    }

    /**
     * [Required] The ID of the project containing this table.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * [Required] The ID of the table. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters.
     * 
     */
    @InputImport(name="tableId")
      private final @Nullable Input<String> tableId;

    public Input<String> getTableId() {
        return this.tableId == null ? Input.empty() : this.tableId;
    }

    public TableReferenceArgs(
        @Nullable Input<String> datasetId,
        @Nullable Input<String> project,
        @Nullable Input<String> tableId) {
        this.datasetId = datasetId;
        this.project = project;
        this.tableId = tableId;
    }

    private TableReferenceArgs() {
        this.datasetId = Input.empty();
        this.project = Input.empty();
        this.tableId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> datasetId;
        private @Nullable Input<String> project;
        private @Nullable Input<String> tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(TableReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.project = defaults.project;
    	      this.tableId = defaults.tableId;
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

        public Builder setTableId(@Nullable Input<String> tableId) {
            this.tableId = tableId;
            return this;
        }

        public Builder setTableId(@Nullable String tableId) {
            this.tableId = Input.ofNullable(tableId);
            return this;
        }
        public TableReferenceArgs build() {
            return new TableReferenceArgs(datasetId, project, tableId);
        }
    }
}