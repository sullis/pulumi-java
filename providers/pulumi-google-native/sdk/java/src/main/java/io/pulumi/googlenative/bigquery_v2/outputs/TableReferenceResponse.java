// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TableReferenceResponse {
    /**
     * [Required] The ID of the dataset containing this table.
     * 
     */
    private final String datasetId;
    /**
     * [Required] The ID of the project containing this table.
     * 
     */
    private final String project;
    /**
     * [Required] The ID of the table. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters.
     * 
     */
    private final String tableId;

    @OutputCustomType.Constructor({"datasetId","project","tableId"})
    private TableReferenceResponse(
        String datasetId,
        String project,
        String tableId) {
        this.datasetId = Objects.requireNonNull(datasetId);
        this.project = Objects.requireNonNull(project);
        this.tableId = Objects.requireNonNull(tableId);
    }

    /**
     * [Required] The ID of the dataset containing this table.
     * 
    */
    public String getDatasetId() {
        return this.datasetId;
    }
    /**
     * [Required] The ID of the project containing this table.
     * 
    */
    public String getProject() {
        return this.project;
    }
    /**
     * [Required] The ID of the table. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters.
     * 
    */
    public String getTableId() {
        return this.tableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetId;
        private String project;
        private String tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(TableReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.project = defaults.project;
    	      this.tableId = defaults.tableId;
        }

        public Builder setDatasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setTableId(String tableId) {
            this.tableId = Objects.requireNonNull(tableId);
            return this;
        }
        public TableReferenceResponse build() {
            return new TableReferenceResponse(datasetId, project, tableId);
        }
    }
}