// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1.inputs.SchemaConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * The configuration for exporting to BigQuery.
 * 
 */
public final class GoogleCloudHealthcareV1FhirBigQueryDestinationResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudHealthcareV1FhirBigQueryDestinationResponse Empty = new GoogleCloudHealthcareV1FhirBigQueryDestinationResponse();

    /**
     * BigQuery URI to an existing dataset, up to 2000 characters long, in the format `bq://projectId.bqDatasetId`.
     * 
     */
    @InputImport(name="datasetUri", required=true)
      private final String datasetUri;

    public String getDatasetUri() {
        return this.datasetUri;
    }

    /**
     * If this flag is `TRUE`, all tables are deleted from the dataset before the new exported tables are written. If the flag is not set and the destination dataset contains tables, the export call returns an error. If `write_disposition` is specified, this parameter is ignored. force=false is equivalent to write_disposition=WRITE_EMPTY and force=true is equivalent to write_disposition=WRITE_TRUNCATE.
     * 
     */
    @InputImport(name="force", required=true)
      private final Boolean force;

    public Boolean getForce() {
        return this.force;
    }

    /**
     * The configuration for the exported BigQuery schema.
     * 
     */
    @InputImport(name="schemaConfig", required=true)
      private final SchemaConfigResponse schemaConfig;

    public SchemaConfigResponse getSchemaConfig() {
        return this.schemaConfig;
    }

    /**
     * Determines if existing data in the destination dataset is overwritten, appended to, or not written if the tables contain data. If a write_disposition is specified, the `force` parameter is ignored.
     * 
     */
    @InputImport(name="writeDisposition", required=true)
      private final String writeDisposition;

    public String getWriteDisposition() {
        return this.writeDisposition;
    }

    public GoogleCloudHealthcareV1FhirBigQueryDestinationResponse(
        String datasetUri,
        Boolean force,
        SchemaConfigResponse schemaConfig,
        String writeDisposition) {
        this.datasetUri = Objects.requireNonNull(datasetUri, "expected parameter 'datasetUri' to be non-null");
        this.force = Objects.requireNonNull(force, "expected parameter 'force' to be non-null");
        this.schemaConfig = Objects.requireNonNull(schemaConfig, "expected parameter 'schemaConfig' to be non-null");
        this.writeDisposition = Objects.requireNonNull(writeDisposition, "expected parameter 'writeDisposition' to be non-null");
    }

    private GoogleCloudHealthcareV1FhirBigQueryDestinationResponse() {
        this.datasetUri = null;
        this.force = null;
        this.schemaConfig = null;
        this.writeDisposition = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudHealthcareV1FhirBigQueryDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetUri;
        private Boolean force;
        private SchemaConfigResponse schemaConfig;
        private String writeDisposition;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudHealthcareV1FhirBigQueryDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetUri = defaults.datasetUri;
    	      this.force = defaults.force;
    	      this.schemaConfig = defaults.schemaConfig;
    	      this.writeDisposition = defaults.writeDisposition;
        }

        public Builder setDatasetUri(String datasetUri) {
            this.datasetUri = Objects.requireNonNull(datasetUri);
            return this;
        }

        public Builder setForce(Boolean force) {
            this.force = Objects.requireNonNull(force);
            return this;
        }

        public Builder setSchemaConfig(SchemaConfigResponse schemaConfig) {
            this.schemaConfig = Objects.requireNonNull(schemaConfig);
            return this;
        }

        public Builder setWriteDisposition(String writeDisposition) {
            this.writeDisposition = Objects.requireNonNull(writeDisposition);
            return this;
        }
        public GoogleCloudHealthcareV1FhirBigQueryDestinationResponse build() {
            return new GoogleCloudHealthcareV1FhirBigQueryDestinationResponse(datasetUri, force, schemaConfig, writeDisposition);
        }
    }
}