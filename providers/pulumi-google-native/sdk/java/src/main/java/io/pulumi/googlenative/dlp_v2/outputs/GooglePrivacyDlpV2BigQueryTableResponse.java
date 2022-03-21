// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
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

    @CustomType.Constructor
    private GooglePrivacyDlpV2BigQueryTableResponse(
        @CustomType.Parameter("datasetId") String datasetId,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("tableId") String tableId) {
        this.datasetId = datasetId;
        this.project = project;
        this.tableId = tableId;
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

        public Builder datasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder tableId(String tableId) {
            this.tableId = Objects.requireNonNull(tableId);
            return this;
        }        public GooglePrivacyDlpV2BigQueryTableResponse build() {
            return new GooglePrivacyDlpV2BigQueryTableResponse(datasetId, project, tableId);
        }
    }
}
