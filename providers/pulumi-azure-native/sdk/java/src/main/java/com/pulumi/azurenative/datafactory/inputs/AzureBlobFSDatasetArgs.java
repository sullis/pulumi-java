// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AvroFormatArgs;
import com.pulumi.azurenative.datafactory.inputs.DatasetCompressionArgs;
import com.pulumi.azurenative.datafactory.inputs.DatasetFolderArgs;
import com.pulumi.azurenative.datafactory.inputs.JsonFormatArgs;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.OrcFormatArgs;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import com.pulumi.azurenative.datafactory.inputs.ParquetFormatArgs;
import com.pulumi.azurenative.datafactory.inputs.TextFormatArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The Azure Data Lake Storage Gen2 storage.
 * 
 */
public final class AzureBlobFSDatasetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureBlobFSDatasetArgs Empty = new AzureBlobFSDatasetArgs();

    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<List<Object>> annotations;

    public Output<List<Object>> annotations() {
        return this.annotations == null ? Codegen.empty() : this.annotations;
    }

    /**
     * The data compression method used for the blob storage.
     * 
     */
    @Import(name="compression")
      private final @Nullable Output<DatasetCompressionArgs> compression;

    public Output<DatasetCompressionArgs> compression() {
        return this.compression == null ? Codegen.empty() : this.compression;
    }

    /**
     * Dataset description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The name of the Azure Data Lake Storage Gen2. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileName")
      private final @Nullable Output<Object> fileName;

    public Output<Object> fileName() {
        return this.fileName == null ? Codegen.empty() : this.fileName;
    }

    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    @Import(name="folder")
      private final @Nullable Output<DatasetFolderArgs> folder;

    public Output<DatasetFolderArgs> folder() {
        return this.folder == null ? Codegen.empty() : this.folder;
    }

    /**
     * The path of the Azure Data Lake Storage Gen2 storage. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="folderPath")
      private final @Nullable Output<Object> folderPath;

    public Output<Object> folderPath() {
        return this.folderPath == null ? Codegen.empty() : this.folderPath;
    }

    /**
     * The format of the Azure Data Lake Storage Gen2 storage.
     * 
     */
    @Import(name="format")
      private final @Nullable Output<Object> format;

    public Output<Object> format() {
        return this.format == null ? Codegen.empty() : this.format;
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName", required=true)
      private final Output<LinkedServiceReferenceArgs> linkedServiceName;

    public Output<LinkedServiceReferenceArgs> linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Parameters for dataset.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Output<Map<String,ParameterSpecificationArgs>> parameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    @Import(name="schema")
      private final @Nullable Output<Object> schema;

    public Output<Object> schema() {
        return this.schema == null ? Codegen.empty() : this.schema;
    }

    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    @Import(name="structure")
      private final @Nullable Output<Object> structure;

    public Output<Object> structure() {
        return this.structure == null ? Codegen.empty() : this.structure;
    }

    /**
     * Type of dataset.
     * Expected value is 'AzureBlobFSFile'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public AzureBlobFSDatasetArgs(
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<DatasetCompressionArgs> compression,
        @Nullable Output<String> description,
        @Nullable Output<Object> fileName,
        @Nullable Output<DatasetFolderArgs> folder,
        @Nullable Output<Object> folderPath,
        @Nullable Output<Object> format,
        Output<LinkedServiceReferenceArgs> linkedServiceName,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<Object> schema,
        @Nullable Output<Object> structure,
        Output<String> type) {
        this.annotations = annotations;
        this.compression = compression;
        this.description = description;
        this.fileName = fileName;
        this.folder = folder;
        this.folderPath = folderPath;
        this.format = format;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.parameters = parameters;
        this.schema = schema;
        this.structure = structure;
        this.type = Codegen.stringProp("type").output().arg(type).require();
    }

    private AzureBlobFSDatasetArgs() {
        this.annotations = Codegen.empty();
        this.compression = Codegen.empty();
        this.description = Codegen.empty();
        this.fileName = Codegen.empty();
        this.folder = Codegen.empty();
        this.folderPath = Codegen.empty();
        this.format = Codegen.empty();
        this.linkedServiceName = Codegen.empty();
        this.parameters = Codegen.empty();
        this.schema = Codegen.empty();
        this.structure = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBlobFSDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<DatasetCompressionArgs> compression;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> fileName;
        private @Nullable Output<DatasetFolderArgs> folder;
        private @Nullable Output<Object> folderPath;
        private @Nullable Output<Object> format;
        private Output<LinkedServiceReferenceArgs> linkedServiceName;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<Object> schema;
        private @Nullable Output<Object> structure;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBlobFSDatasetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.compression = defaults.compression;
    	      this.description = defaults.description;
    	      this.fileName = defaults.fileName;
    	      this.folder = defaults.folder;
    	      this.folderPath = defaults.folderPath;
    	      this.format = defaults.format;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.parameters = defaults.parameters;
    	      this.schema = defaults.schema;
    	      this.structure = defaults.structure;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Codegen.ofNullable(annotations);
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder compression(@Nullable Output<DatasetCompressionArgs> compression) {
            this.compression = compression;
            return this;
        }
        public Builder compression(@Nullable DatasetCompressionArgs compression) {
            this.compression = Codegen.ofNullable(compression);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder fileName(@Nullable Output<Object> fileName) {
            this.fileName = fileName;
            return this;
        }
        public Builder fileName(@Nullable Object fileName) {
            this.fileName = Codegen.ofNullable(fileName);
            return this;
        }
        public Builder folder(@Nullable Output<DatasetFolderArgs> folder) {
            this.folder = folder;
            return this;
        }
        public Builder folder(@Nullable DatasetFolderArgs folder) {
            this.folder = Codegen.ofNullable(folder);
            return this;
        }
        public Builder folderPath(@Nullable Output<Object> folderPath) {
            this.folderPath = folderPath;
            return this;
        }
        public Builder folderPath(@Nullable Object folderPath) {
            this.folderPath = Codegen.ofNullable(folderPath);
            return this;
        }
        public Builder format(@Nullable Output<Object> format) {
            this.format = format;
            return this;
        }
        public Builder format(@Nullable Object format) {
            this.format = Codegen.ofNullable(format);
            return this;
        }
        public Builder linkedServiceName(Output<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }
        public Builder linkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Output.of(Objects.requireNonNull(linkedServiceName));
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder schema(@Nullable Output<Object> schema) {
            this.schema = schema;
            return this;
        }
        public Builder schema(@Nullable Object schema) {
            this.schema = Codegen.ofNullable(schema);
            return this;
        }
        public Builder structure(@Nullable Output<Object> structure) {
            this.structure = structure;
            return this;
        }
        public Builder structure(@Nullable Object structure) {
            this.structure = Codegen.ofNullable(structure);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public AzureBlobFSDatasetArgs build() {
            return new AzureBlobFSDatasetArgs(annotations, compression, description, fileName, folder, folderPath, format, linkedServiceName, parameters, schema, structure, type);
        }
    }
}
