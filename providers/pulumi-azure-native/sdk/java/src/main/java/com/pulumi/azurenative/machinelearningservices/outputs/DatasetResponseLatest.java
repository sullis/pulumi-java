// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.azurenative.machinelearningservices.outputs.DatasetResponseDataPath;
import com.pulumi.azurenative.machinelearningservices.outputs.DatasetStateResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.UserInfoResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatasetResponseLatest {
    /**
     * @return User who created.
     * 
     */
    private final @Nullable UserInfoResponse createdBy;
    /**
     * @return The dataset creation time (UTC).
     * 
     */
    private final String createdTime;
    /**
     * @return  Datastore and reference to location of data such as relativePath, Sql Query and etc.
     * 
     */
    private final @Nullable DatasetResponseDataPath dataPath;
    /**
     * @return Dataflow Json
     * 
     */
    private final String dataflow;
    /**
     * @return Dataset state
     * 
     */
    private final @Nullable DatasetStateResponse datasetDefinitionState;
    /**
     * @return Unique Dataset identifier.
     * 
     */
    private final String datasetId;
    /**
     * @return Description about the dataset.
     * 
     */
    private final String description;
    /**
     * @return eTag description
     * 
     */
    private final String etag;
    /**
     * @return Dataset FileType, specified by user.
     * 
     */
    private final String fileType;
    /**
     * @return The dataset last modified time (UTC).
     * 
     */
    private final String modifiedTime;
    /**
     * @return Summary of Definition changes.
     * 
     */
    private final String notes;
    /**
     * @return Indicates how the source data is partitioned. This is defined to filter on a range of partitioned data before performing actions or materialization.
     * 
     */
    private final Boolean partitionFormatInPath;
    /**
     * @return Properties stores information like name of time series column for time series dataset.
     * 
     */
    private final @Nullable Map<String,Object> properties;
    /**
     * @return Indicates the saved dataset this definition is mapping to, populated on Get.
     * 
     */
    private final String savedDatasetId;
    /**
     * @return Tags associated with the dataset.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return  Telemetry information about the dataset including information like which service the dataset was created from.
     * 
     */
    private final Map<String,String> telemetryInfo;
    /**
     * @return  Whether to use description and tags from the definition level as opposed to dataset level (old behavior).
     * 
     */
    private final Boolean useDescriptionTagsFromDefinition;
    /**
     * @return An identifier uniquely identifies a definition change.
     * 
     */
    private final String versionId;

    @CustomType.Constructor
    private DatasetResponseLatest(
        @CustomType.Parameter("createdBy") @Nullable UserInfoResponse createdBy,
        @CustomType.Parameter("createdTime") String createdTime,
        @CustomType.Parameter("dataPath") @Nullable DatasetResponseDataPath dataPath,
        @CustomType.Parameter("dataflow") String dataflow,
        @CustomType.Parameter("datasetDefinitionState") @Nullable DatasetStateResponse datasetDefinitionState,
        @CustomType.Parameter("datasetId") String datasetId,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("fileType") String fileType,
        @CustomType.Parameter("modifiedTime") String modifiedTime,
        @CustomType.Parameter("notes") String notes,
        @CustomType.Parameter("partitionFormatInPath") Boolean partitionFormatInPath,
        @CustomType.Parameter("properties") @Nullable Map<String,Object> properties,
        @CustomType.Parameter("savedDatasetId") String savedDatasetId,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("telemetryInfo") Map<String,String> telemetryInfo,
        @CustomType.Parameter("useDescriptionTagsFromDefinition") Boolean useDescriptionTagsFromDefinition,
        @CustomType.Parameter("versionId") String versionId) {
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.dataPath = dataPath;
        this.dataflow = dataflow;
        this.datasetDefinitionState = datasetDefinitionState;
        this.datasetId = datasetId;
        this.description = description;
        this.etag = etag;
        this.fileType = fileType;
        this.modifiedTime = modifiedTime;
        this.notes = notes;
        this.partitionFormatInPath = partitionFormatInPath;
        this.properties = properties;
        this.savedDatasetId = savedDatasetId;
        this.tags = tags;
        this.telemetryInfo = telemetryInfo;
        this.useDescriptionTagsFromDefinition = useDescriptionTagsFromDefinition;
        this.versionId = versionId;
    }

    /**
     * @return User who created.
     * 
     */
    public Optional<UserInfoResponse> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }
    /**
     * @return The dataset creation time (UTC).
     * 
     */
    public String createdTime() {
        return this.createdTime;
    }
    /**
     * @return  Datastore and reference to location of data such as relativePath, Sql Query and etc.
     * 
     */
    public Optional<DatasetResponseDataPath> dataPath() {
        return Optional.ofNullable(this.dataPath);
    }
    /**
     * @return Dataflow Json
     * 
     */
    public String dataflow() {
        return this.dataflow;
    }
    /**
     * @return Dataset state
     * 
     */
    public Optional<DatasetStateResponse> datasetDefinitionState() {
        return Optional.ofNullable(this.datasetDefinitionState);
    }
    /**
     * @return Unique Dataset identifier.
     * 
     */
    public String datasetId() {
        return this.datasetId;
    }
    /**
     * @return Description about the dataset.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return eTag description
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Dataset FileType, specified by user.
     * 
     */
    public String fileType() {
        return this.fileType;
    }
    /**
     * @return The dataset last modified time (UTC).
     * 
     */
    public String modifiedTime() {
        return this.modifiedTime;
    }
    /**
     * @return Summary of Definition changes.
     * 
     */
    public String notes() {
        return this.notes;
    }
    /**
     * @return Indicates how the source data is partitioned. This is defined to filter on a range of partitioned data before performing actions or materialization.
     * 
     */
    public Boolean partitionFormatInPath() {
        return this.partitionFormatInPath;
    }
    /**
     * @return Properties stores information like name of time series column for time series dataset.
     * 
     */
    public Map<String,Object> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * @return Indicates the saved dataset this definition is mapping to, populated on Get.
     * 
     */
    public String savedDatasetId() {
        return this.savedDatasetId;
    }
    /**
     * @return Tags associated with the dataset.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return  Telemetry information about the dataset including information like which service the dataset was created from.
     * 
     */
    public Map<String,String> telemetryInfo() {
        return this.telemetryInfo;
    }
    /**
     * @return  Whether to use description and tags from the definition level as opposed to dataset level (old behavior).
     * 
     */
    public Boolean useDescriptionTagsFromDefinition() {
        return this.useDescriptionTagsFromDefinition;
    }
    /**
     * @return An identifier uniquely identifies a definition change.
     * 
     */
    public String versionId() {
        return this.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetResponseLatest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable UserInfoResponse createdBy;
        private String createdTime;
        private @Nullable DatasetResponseDataPath dataPath;
        private String dataflow;
        private @Nullable DatasetStateResponse datasetDefinitionState;
        private String datasetId;
        private String description;
        private String etag;
        private String fileType;
        private String modifiedTime;
        private String notes;
        private Boolean partitionFormatInPath;
        private @Nullable Map<String,Object> properties;
        private String savedDatasetId;
        private Map<String,String> tags;
        private Map<String,String> telemetryInfo;
        private Boolean useDescriptionTagsFromDefinition;
        private String versionId;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetResponseLatest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdBy = defaults.createdBy;
    	      this.createdTime = defaults.createdTime;
    	      this.dataPath = defaults.dataPath;
    	      this.dataflow = defaults.dataflow;
    	      this.datasetDefinitionState = defaults.datasetDefinitionState;
    	      this.datasetId = defaults.datasetId;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.fileType = defaults.fileType;
    	      this.modifiedTime = defaults.modifiedTime;
    	      this.notes = defaults.notes;
    	      this.partitionFormatInPath = defaults.partitionFormatInPath;
    	      this.properties = defaults.properties;
    	      this.savedDatasetId = defaults.savedDatasetId;
    	      this.tags = defaults.tags;
    	      this.telemetryInfo = defaults.telemetryInfo;
    	      this.useDescriptionTagsFromDefinition = defaults.useDescriptionTagsFromDefinition;
    	      this.versionId = defaults.versionId;
        }

        public Builder createdBy(@Nullable UserInfoResponse createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public Builder createdTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }
        public Builder dataPath(@Nullable DatasetResponseDataPath dataPath) {
            this.dataPath = dataPath;
            return this;
        }
        public Builder dataflow(String dataflow) {
            this.dataflow = Objects.requireNonNull(dataflow);
            return this;
        }
        public Builder datasetDefinitionState(@Nullable DatasetStateResponse datasetDefinitionState) {
            this.datasetDefinitionState = datasetDefinitionState;
            return this;
        }
        public Builder datasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder fileType(String fileType) {
            this.fileType = Objects.requireNonNull(fileType);
            return this;
        }
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = Objects.requireNonNull(modifiedTime);
            return this;
        }
        public Builder notes(String notes) {
            this.notes = Objects.requireNonNull(notes);
            return this;
        }
        public Builder partitionFormatInPath(Boolean partitionFormatInPath) {
            this.partitionFormatInPath = Objects.requireNonNull(partitionFormatInPath);
            return this;
        }
        public Builder properties(@Nullable Map<String,Object> properties) {
            this.properties = properties;
            return this;
        }
        public Builder savedDatasetId(String savedDatasetId) {
            this.savedDatasetId = Objects.requireNonNull(savedDatasetId);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder telemetryInfo(Map<String,String> telemetryInfo) {
            this.telemetryInfo = Objects.requireNonNull(telemetryInfo);
            return this;
        }
        public Builder useDescriptionTagsFromDefinition(Boolean useDescriptionTagsFromDefinition) {
            this.useDescriptionTagsFromDefinition = Objects.requireNonNull(useDescriptionTagsFromDefinition);
            return this;
        }
        public Builder versionId(String versionId) {
            this.versionId = Objects.requireNonNull(versionId);
            return this;
        }        public DatasetResponseLatest build() {
            return new DatasetResponseLatest(createdBy, createdTime, dataPath, dataflow, datasetDefinitionState, datasetId, description, etag, fileType, modifiedTime, notes, partitionFormatInPath, properties, savedDatasetId, tags, telemetryInfo, useDescriptionTagsFromDefinition, versionId);
        }
    }
}
