// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.bigquery_v2.inputs.ModelReferenceResponse;
import io.pulumi.googlenative.bigquery_v2.inputs.TableReferenceResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class JobConfigurationExtractResponse extends io.pulumi.resources.InvokeArgs {

    public static final JobConfigurationExtractResponse Empty = new JobConfigurationExtractResponse();

    /**
     * [Optional] The compression type to use for exported files. Possible values include GZIP, DEFLATE, SNAPPY, and NONE. The default value is NONE. DEFLATE and SNAPPY are only supported for Avro. Not applicable when extracting models.
     * 
     */
    @Import(name="compression", required=true)
      private final String compression;

    public String getCompression() {
        return this.compression;
    }

    /**
     * [Optional] The exported file format. Possible values include CSV, NEWLINE_DELIMITED_JSON, PARQUET or AVRO for tables and ML_TF_SAVED_MODEL or ML_XGBOOST_BOOSTER for models. The default value for tables is CSV. Tables with nested or repeated fields cannot be exported as CSV. The default value for models is ML_TF_SAVED_MODEL.
     * 
     */
    @Import(name="destinationFormat", required=true)
      private final String destinationFormat;

    public String getDestinationFormat() {
        return this.destinationFormat;
    }

    /**
     * [Pick one] DEPRECATED: Use destinationUris instead, passing only one URI as necessary. The fully-qualified Google Cloud Storage URI where the extracted table should be written.
     * 
     */
    @Import(name="destinationUri", required=true)
      private final String destinationUri;

    public String getDestinationUri() {
        return this.destinationUri;
    }

    /**
     * [Pick one] A list of fully-qualified Google Cloud Storage URIs where the extracted table should be written.
     * 
     */
    @Import(name="destinationUris", required=true)
      private final List<String> destinationUris;

    public List<String> getDestinationUris() {
        return this.destinationUris;
    }

    /**
     * [Optional] Delimiter to use between fields in the exported data. Default is ','. Not applicable when extracting models.
     * 
     */
    @Import(name="fieldDelimiter", required=true)
      private final String fieldDelimiter;

    public String getFieldDelimiter() {
        return this.fieldDelimiter;
    }

    /**
     * [Optional] Whether to print out a header row in the results. Default is true. Not applicable when extracting models.
     * 
     */
    @Import(name="printHeader", required=true)
      private final Boolean printHeader;

    public Boolean getPrintHeader() {
        return this.printHeader;
    }

    /**
     * A reference to the model being exported.
     * 
     */
    @Import(name="sourceModel", required=true)
      private final ModelReferenceResponse sourceModel;

    public ModelReferenceResponse getSourceModel() {
        return this.sourceModel;
    }

    /**
     * A reference to the table being exported.
     * 
     */
    @Import(name="sourceTable", required=true)
      private final TableReferenceResponse sourceTable;

    public TableReferenceResponse getSourceTable() {
        return this.sourceTable;
    }

    /**
     * [Optional] If destinationFormat is set to "AVRO", this flag indicates whether to enable extracting applicable column types (such as TIMESTAMP) to their corresponding AVRO logical types (timestamp-micros), instead of only using their raw types (avro-long). Not applicable when extracting models.
     * 
     */
    @Import(name="useAvroLogicalTypes", required=true)
      private final Boolean useAvroLogicalTypes;

    public Boolean getUseAvroLogicalTypes() {
        return this.useAvroLogicalTypes;
    }

    public JobConfigurationExtractResponse(
        String compression,
        String destinationFormat,
        String destinationUri,
        List<String> destinationUris,
        String fieldDelimiter,
        Boolean printHeader,
        ModelReferenceResponse sourceModel,
        TableReferenceResponse sourceTable,
        Boolean useAvroLogicalTypes) {
        this.compression = Objects.requireNonNull(compression, "expected parameter 'compression' to be non-null");
        this.destinationFormat = Objects.requireNonNull(destinationFormat, "expected parameter 'destinationFormat' to be non-null");
        this.destinationUri = Objects.requireNonNull(destinationUri, "expected parameter 'destinationUri' to be non-null");
        this.destinationUris = Objects.requireNonNull(destinationUris, "expected parameter 'destinationUris' to be non-null");
        this.fieldDelimiter = Objects.requireNonNull(fieldDelimiter, "expected parameter 'fieldDelimiter' to be non-null");
        this.printHeader = Objects.requireNonNull(printHeader, "expected parameter 'printHeader' to be non-null");
        this.sourceModel = Objects.requireNonNull(sourceModel, "expected parameter 'sourceModel' to be non-null");
        this.sourceTable = Objects.requireNonNull(sourceTable, "expected parameter 'sourceTable' to be non-null");
        this.useAvroLogicalTypes = Objects.requireNonNull(useAvroLogicalTypes, "expected parameter 'useAvroLogicalTypes' to be non-null");
    }

    private JobConfigurationExtractResponse() {
        this.compression = null;
        this.destinationFormat = null;
        this.destinationUri = null;
        this.destinationUris = List.of();
        this.fieldDelimiter = null;
        this.printHeader = null;
        this.sourceModel = null;
        this.sourceTable = null;
        this.useAvroLogicalTypes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobConfigurationExtractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compression;
        private String destinationFormat;
        private String destinationUri;
        private List<String> destinationUris;
        private String fieldDelimiter;
        private Boolean printHeader;
        private ModelReferenceResponse sourceModel;
        private TableReferenceResponse sourceTable;
        private Boolean useAvroLogicalTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(JobConfigurationExtractResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compression = defaults.compression;
    	      this.destinationFormat = defaults.destinationFormat;
    	      this.destinationUri = defaults.destinationUri;
    	      this.destinationUris = defaults.destinationUris;
    	      this.fieldDelimiter = defaults.fieldDelimiter;
    	      this.printHeader = defaults.printHeader;
    	      this.sourceModel = defaults.sourceModel;
    	      this.sourceTable = defaults.sourceTable;
    	      this.useAvroLogicalTypes = defaults.useAvroLogicalTypes;
        }

        public Builder compression(String compression) {
            this.compression = Objects.requireNonNull(compression);
            return this;
        }
        public Builder destinationFormat(String destinationFormat) {
            this.destinationFormat = Objects.requireNonNull(destinationFormat);
            return this;
        }
        public Builder destinationUri(String destinationUri) {
            this.destinationUri = Objects.requireNonNull(destinationUri);
            return this;
        }
        public Builder destinationUris(List<String> destinationUris) {
            this.destinationUris = Objects.requireNonNull(destinationUris);
            return this;
        }
        public Builder destinationUris(String... destinationUris) {
            return destinationUris(List.of(destinationUris));
        }
        public Builder fieldDelimiter(String fieldDelimiter) {
            this.fieldDelimiter = Objects.requireNonNull(fieldDelimiter);
            return this;
        }
        public Builder printHeader(Boolean printHeader) {
            this.printHeader = Objects.requireNonNull(printHeader);
            return this;
        }
        public Builder sourceModel(ModelReferenceResponse sourceModel) {
            this.sourceModel = Objects.requireNonNull(sourceModel);
            return this;
        }
        public Builder sourceTable(TableReferenceResponse sourceTable) {
            this.sourceTable = Objects.requireNonNull(sourceTable);
            return this;
        }
        public Builder useAvroLogicalTypes(Boolean useAvroLogicalTypes) {
            this.useAvroLogicalTypes = Objects.requireNonNull(useAvroLogicalTypes);
            return this;
        }        public JobConfigurationExtractResponse build() {
            return new JobConfigurationExtractResponse(compression, destinationFormat, destinationUri, destinationUris, fieldDelimiter, printHeader, sourceModel, sourceTable, useAvroLogicalTypes);
        }
    }
}
