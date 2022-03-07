// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2BigQueryTableResponse {
    /**
     * Dataset ID of the table.
     * 
     */
    private final String datasetId;
    /**
     * The Google Cloud Platform project ID of the project containing the table. If omitted, project ID is inferred from the API call.
     * 
     */
    private final String project;
    /**
     * Name of the table.
     * 
     */
    private final String tableId;

    @OutputCustomType.Constructor({"datasetId","project","tableId"})
    private GooglePrivacyDlpV2BigQueryTableResponse(
        String datasetId,
        String project,
        String tableId) {
        this.datasetId = Objects.requireNonNull(datasetId);
        this.project = Objects.requireNonNull(project);
        this.tableId = Objects.requireNonNull(tableId);
    }

    /**
     * Dataset ID of the table.
     * 
    */
    public String getDatasetId() {
        return this.datasetId;
    }
    /**
     * The Google Cloud Platform project ID of the project containing the table. If omitted, project ID is inferred from the API call.
     * 
    */
    public String getProject() {
        return this.project;
    }
    /**
     * Name of the table.
     * 
    */
    public String getTableId() {
        return this.tableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2BigQueryTableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetId;
        private String project;
        private String tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2BigQueryTableResponse defaults) {
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
        public GooglePrivacyDlpV2BigQueryTableResponse build() {
            return new GooglePrivacyDlpV2BigQueryTableResponse(datasetId, project, tableId);
        }
    }
}