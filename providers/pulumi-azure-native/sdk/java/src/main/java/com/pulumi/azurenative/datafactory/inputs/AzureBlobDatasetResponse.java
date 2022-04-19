// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AvroFormatResponse;
import com.pulumi.azurenative.datafactory.inputs.DatasetCompressionResponse;
import com.pulumi.azurenative.datafactory.inputs.DatasetResponseFolder;
import com.pulumi.azurenative.datafactory.inputs.JsonFormatResponse;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.OrcFormatResponse;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import com.pulumi.azurenative.datafactory.inputs.ParquetFormatResponse;
import com.pulumi.azurenative.datafactory.inputs.TextFormatResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Azure Blob storage.
 * 
 */
public final class AzureBlobDatasetResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureBlobDatasetResponse Empty = new AzureBlobDatasetResponse();

    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    @Import(name="annotations")
      private final @Nullable List<Object> annotations;

    public List<Object> annotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    /**
     * The data compression method used for the blob storage.
     * 
     */
    @Import(name="compression")
      private final @Nullable DatasetCompressionResponse compression;

    public Optional<DatasetCompressionResponse> compression() {
        return this.compression == null ? Optional.empty() : Optional.ofNullable(this.compression);
    }

    /**
     * Dataset description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The name of the Azure Blob. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileName")
      private final @Nullable Object fileName;

    public Optional<Object> fileName() {
        return this.fileName == null ? Optional.empty() : Optional.ofNullable(this.fileName);
    }

    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    @Import(name="folder")
      private final @Nullable DatasetResponseFolder folder;

    public Optional<DatasetResponseFolder> folder() {
        return this.folder == null ? Optional.empty() : Optional.ofNullable(this.folder);
    }

    /**
     * The path of the Azure Blob storage. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="folderPath")
      private final @Nullable Object folderPath;

    public Optional<Object> folderPath() {
        return this.folderPath == null ? Optional.empty() : Optional.ofNullable(this.folderPath);
    }

    /**
     * The format of the Azure Blob storage.
     * 
     */
    @Import(name="format")
      private final @Nullable Object format;

    public Object format() {
        return this.format == null ? null : this.format;
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName", required=true)
      private final LinkedServiceReferenceResponse linkedServiceName;

    public LinkedServiceReferenceResponse linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * The end of Azure Blob's modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="modifiedDatetimeEnd")
      private final @Nullable Object modifiedDatetimeEnd;

    public Optional<Object> modifiedDatetimeEnd() {
        return this.modifiedDatetimeEnd == null ? Optional.empty() : Optional.ofNullable(this.modifiedDatetimeEnd);
    }

    /**
     * The start of Azure Blob's modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="modifiedDatetimeStart")
      private final @Nullable Object modifiedDatetimeStart;

    public Optional<Object> modifiedDatetimeStart() {
        return this.modifiedDatetimeStart == null ? Optional.empty() : Optional.ofNullable(this.modifiedDatetimeStart);
    }

    /**
     * Parameters for dataset.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    @Import(name="schema")
      private final @Nullable Object schema;

    public Optional<Object> schema() {
        return this.schema == null ? Optional.empty() : Optional.ofNullable(this.schema);
    }

    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    @Import(name="structure")
      private final @Nullable Object structure;

    public Optional<Object> structure() {
        return this.structure == null ? Optional.empty() : Optional.ofNullable(this.structure);
    }

    /**
     * The root of blob path. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tableRootLocation")
      private final @Nullable Object tableRootLocation;

    public Optional<Object> tableRootLocation() {
        return this.tableRootLocation == null ? Optional.empty() : Optional.ofNullable(this.tableRootLocation);
    }

    /**
     * Type of dataset.
     * Expected value is 'AzureBlob'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public AzureBlobDatasetResponse(
        @Nullable List<Object> annotations,
        @Nullable DatasetCompressionResponse compression,
        @Nullable String description,
        @Nullable Object fileName,
        @Nullable DatasetResponseFolder folder,
        @Nullable Object folderPath,
        @Nullable Object format,
        LinkedServiceReferenceResponse linkedServiceName,
        @Nullable Object modifiedDatetimeEnd,
        @Nullable Object modifiedDatetimeStart,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Object schema,
        @Nullable Object structure,
        @Nullable Object tableRootLocation,
        String type) {
        this.annotations = annotations;
        this.compression = compression;
        this.description = description;
        this.fileName = fileName;
        this.folder = folder;
        this.folderPath = folderPath;
        this.format = format;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        this.parameters = parameters;
        this.schema = schema;
        this.structure = structure;
        this.tableRootLocation = tableRootLocation;
        this.type = Codegen.stringProp("type").arg(type).require();
    }

    private AzureBlobDatasetResponse() {
        this.annotations = List.of();
        this.compression = null;
        this.description = null;
        this.fileName = null;
        this.folder = null;
        this.folderPath = null;
        this.format = null;
        this.linkedServiceName = null;
        this.modifiedDatetimeEnd = null;
        this.modifiedDatetimeStart = null;
        this.parameters = Map.of();
        this.schema = null;
        this.structure = null;
        this.tableRootLocation = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBlobDatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable DatasetCompressionResponse compression;
        private @Nullable String description;
        private @Nullable Object fileName;
        private @Nullable DatasetResponseFolder folder;
        private @Nullable Object folderPath;
        private @Nullable Object format;
        private LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable Object modifiedDatetimeEnd;
        private @Nullable Object modifiedDatetimeStart;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object schema;
        private @Nullable Object structure;
        private @Nullable Object tableRootLocation;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBlobDatasetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.compression = defaults.compression;
    	      this.description = defaults.description;
    	      this.fileName = defaults.fileName;
    	      this.folder = defaults.folder;
    	      this.folderPath = defaults.folderPath;
    	      this.format = defaults.format;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.modifiedDatetimeEnd = defaults.modifiedDatetimeEnd;
    	      this.modifiedDatetimeStart = defaults.modifiedDatetimeStart;
    	      this.parameters = defaults.parameters;
    	      this.schema = defaults.schema;
    	      this.structure = defaults.structure;
    	      this.tableRootLocation = defaults.tableRootLocation;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder compression(@Nullable DatasetCompressionResponse compression) {
            this.compression = compression;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder fileName(@Nullable Object fileName) {
            this.fileName = fileName;
            return this;
        }
        public Builder folder(@Nullable DatasetResponseFolder folder) {
            this.folder = folder;
            return this;
        }
        public Builder folderPath(@Nullable Object folderPath) {
            this.folderPath = folderPath;
            return this;
        }
        public Builder format(@Nullable Object format) {
            this.format = format;
            return this;
        }
        public Builder linkedServiceName(LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }
        public Builder modifiedDatetimeEnd(@Nullable Object modifiedDatetimeEnd) {
            this.modifiedDatetimeEnd = modifiedDatetimeEnd;
            return this;
        }
        public Builder modifiedDatetimeStart(@Nullable Object modifiedDatetimeStart) {
            this.modifiedDatetimeStart = modifiedDatetimeStart;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder schema(@Nullable Object schema) {
            this.schema = schema;
            return this;
        }
        public Builder structure(@Nullable Object structure) {
            this.structure = structure;
            return this;
        }
        public Builder tableRootLocation(@Nullable Object tableRootLocation) {
            this.tableRootLocation = tableRootLocation;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AzureBlobDatasetResponse build() {
            return new AzureBlobDatasetResponse(annotations, compression, description, fileName, folder, folderPath, format, linkedServiceName, modifiedDatetimeEnd, modifiedDatetimeStart, parameters, schema, structure, tableRootLocation, type);
        }
    }
}
