// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.bigquery.inputs.TableEncryptionConfigurationGetArgs;
import io.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationGetArgs;
import io.pulumi.gcp.bigquery.inputs.TableMaterializedViewGetArgs;
import io.pulumi.gcp.bigquery.inputs.TableRangePartitioningGetArgs;
import io.pulumi.gcp.bigquery.inputs.TableTimePartitioningGetArgs;
import io.pulumi.gcp.bigquery.inputs.TableViewGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableState extends io.pulumi.resources.ResourceArgs {

    public static final TableState Empty = new TableState();

    /**
     * Specifies column names to use for data clustering.
     * Up to four top-level columns are allowed, and should be specified in
     * descending priority order.
     * 
     */
    @InputImport(name="clusterings")
      private final @Nullable Input<List<String>> clusterings;

    public Input<List<String>> getClusterings() {
        return this.clusterings == null ? Input.empty() : this.clusterings;
    }

    /**
     * The time when this table was created, in milliseconds since the epoch.
     * 
     */
    @InputImport(name="creationTime")
      private final @Nullable Input<Integer> creationTime;

    public Input<Integer> getCreationTime() {
        return this.creationTime == null ? Input.empty() : this.creationTime;
    }

    /**
     * The dataset ID to create the table in.
     * Changing this forces a new resource to be created.
     * 
     */
    @InputImport(name="datasetId")
      private final @Nullable Input<String> datasetId;

    public Input<String> getDatasetId() {
        return this.datasetId == null ? Input.empty() : this.datasetId;
    }

    /**
     * Whether or not to allow the provider to destroy the instance. Unless this field is set to false
     * in state, a `=destroy` or `=update` that would delete the instance will fail.
     * 
     */
    @InputImport(name="deletionProtection")
      private final @Nullable Input<Boolean> deletionProtection;

    public Input<Boolean> getDeletionProtection() {
        return this.deletionProtection == null ? Input.empty() : this.deletionProtection;
    }

    /**
     * The field description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Specifies how the table should be encrypted.
     * If left blank, the table will be encrypted with a Google-managed key; that process
     * is transparent to the user.  Structure is documented below.
     * 
     */
    @InputImport(name="encryptionConfiguration")
      private final @Nullable Input<TableEncryptionConfigurationGetArgs> encryptionConfiguration;

    public Input<TableEncryptionConfigurationGetArgs> getEncryptionConfiguration() {
        return this.encryptionConfiguration == null ? Input.empty() : this.encryptionConfiguration;
    }

    /**
     * A hash of the resource.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * The time when this table expires, in
     * milliseconds since the epoch. If not present, the table will persist
     * indefinitely. Expired tables will be deleted and their storage
     * reclaimed.
     * 
     */
    @InputImport(name="expirationTime")
      private final @Nullable Input<Integer> expirationTime;

    public Input<Integer> getExpirationTime() {
        return this.expirationTime == null ? Input.empty() : this.expirationTime;
    }

    /**
     * Describes the data format,
     * location, and other properties of a table stored outside of BigQuery.
     * By defining these properties, the data source can then be queried as
     * if it were a standard BigQuery table. Structure is documented below.
     * 
     */
    @InputImport(name="externalDataConfiguration")
      private final @Nullable Input<TableExternalDataConfigurationGetArgs> externalDataConfiguration;

    public Input<TableExternalDataConfigurationGetArgs> getExternalDataConfiguration() {
        return this.externalDataConfiguration == null ? Input.empty() : this.externalDataConfiguration;
    }

    /**
     * A descriptive name for the table.
     * 
     */
    @InputImport(name="friendlyName")
      private final @Nullable Input<String> friendlyName;

    public Input<String> getFriendlyName() {
        return this.friendlyName == null ? Input.empty() : this.friendlyName;
    }

    /**
     * A mapping of labels to assign to the resource.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The time when this table was last modified, in milliseconds since the epoch.
     * 
     */
    @InputImport(name="lastModifiedTime")
      private final @Nullable Input<Integer> lastModifiedTime;

    public Input<Integer> getLastModifiedTime() {
        return this.lastModifiedTime == null ? Input.empty() : this.lastModifiedTime;
    }

    /**
     * The geographic location where the table resides. This value is inherited from the dataset.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * If specified, configures this table as a materialized view.
     * Structure is documented below.
     * 
     */
    @InputImport(name="materializedView")
      private final @Nullable Input<TableMaterializedViewGetArgs> materializedView;

    public Input<TableMaterializedViewGetArgs> getMaterializedView() {
        return this.materializedView == null ? Input.empty() : this.materializedView;
    }

    /**
     * The size of this table in bytes, excluding any data in the streaming buffer.
     * 
     */
    @InputImport(name="numBytes")
      private final @Nullable Input<Integer> numBytes;

    public Input<Integer> getNumBytes() {
        return this.numBytes == null ? Input.empty() : this.numBytes;
    }

    /**
     * The number of bytes in the table that are considered "long-term storage".
     * 
     */
    @InputImport(name="numLongTermBytes")
      private final @Nullable Input<Integer> numLongTermBytes;

    public Input<Integer> getNumLongTermBytes() {
        return this.numLongTermBytes == null ? Input.empty() : this.numLongTermBytes;
    }

    /**
     * The number of rows of data in this table, excluding any data in the streaming buffer.
     * 
     */
    @InputImport(name="numRows")
      private final @Nullable Input<Integer> numRows;

    public Input<Integer> getNumRows() {
        return this.numRows == null ? Input.empty() : this.numRows;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * If specified, configures range-based
     * partitioning for this table. Structure is documented below.
     * 
     */
    @InputImport(name="rangePartitioning")
      private final @Nullable Input<TableRangePartitioningGetArgs> rangePartitioning;

    public Input<TableRangePartitioningGetArgs> getRangePartitioning() {
        return this.rangePartitioning == null ? Input.empty() : this.rangePartitioning;
    }

    /**
     * A JSON schema for the external table. Schema is required
     * for CSV and JSON formats if autodetect is not on. Schema is disallowed
     * for Google Cloud Bigtable, Cloud Datastore backups, Avro, ORC and Parquet formats.
     * ~>**NOTE:** Because this field expects a JSON string, any changes to the
     * string will create a diff, even if the JSON itself hasn't changed.
     * Furthermore drift for this field cannot not be detected because BigQuery
     * only uses this schema to compute the effective schema for the table, therefore
     * any changes on the configured value will force the table to be recreated.
     * This schema is effectively only applied when creating a table from an external
     * datasource, after creation the computed schema will be stored in
     * `google_bigquery_table.schema`
     * 
     */
    @InputImport(name="schema")
      private final @Nullable Input<String> schema;

    public Input<String> getSchema() {
        return this.schema == null ? Input.empty() : this.schema;
    }

    /**
     * The URI of the created resource.
     * 
     */
    @InputImport(name="selfLink")
      private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    /**
     * A unique ID for the resource.
     * Changing this forces a new resource to be created.
     * 
     */
    @InputImport(name="tableId")
      private final @Nullable Input<String> tableId;

    public Input<String> getTableId() {
        return this.tableId == null ? Input.empty() : this.tableId;
    }

    /**
     * If specified, configures time-based
     * partitioning for this table. Structure is documented below.
     * 
     */
    @InputImport(name="timePartitioning")
      private final @Nullable Input<TableTimePartitioningGetArgs> timePartitioning;

    public Input<TableTimePartitioningGetArgs> getTimePartitioning() {
        return this.timePartitioning == null ? Input.empty() : this.timePartitioning;
    }

    /**
     * The supported types are DAY, HOUR, MONTH, and YEAR,
     * which will generate one partition per day, hour, month, and year, respectively.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * If specified, configures this table as a view.
     * Structure is documented below.
     * 
     */
    @InputImport(name="view")
      private final @Nullable Input<TableViewGetArgs> view;

    public Input<TableViewGetArgs> getView() {
        return this.view == null ? Input.empty() : this.view;
    }

    public TableState(
        @Nullable Input<List<String>> clusterings,
        @Nullable Input<Integer> creationTime,
        @Nullable Input<String> datasetId,
        @Nullable Input<Boolean> deletionProtection,
        @Nullable Input<String> description,
        @Nullable Input<TableEncryptionConfigurationGetArgs> encryptionConfiguration,
        @Nullable Input<String> etag,
        @Nullable Input<Integer> expirationTime,
        @Nullable Input<TableExternalDataConfigurationGetArgs> externalDataConfiguration,
        @Nullable Input<String> friendlyName,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<Integer> lastModifiedTime,
        @Nullable Input<String> location,
        @Nullable Input<TableMaterializedViewGetArgs> materializedView,
        @Nullable Input<Integer> numBytes,
        @Nullable Input<Integer> numLongTermBytes,
        @Nullable Input<Integer> numRows,
        @Nullable Input<String> project,
        @Nullable Input<TableRangePartitioningGetArgs> rangePartitioning,
        @Nullable Input<String> schema,
        @Nullable Input<String> selfLink,
        @Nullable Input<String> tableId,
        @Nullable Input<TableTimePartitioningGetArgs> timePartitioning,
        @Nullable Input<String> type,
        @Nullable Input<TableViewGetArgs> view) {
        this.clusterings = clusterings;
        this.creationTime = creationTime;
        this.datasetId = datasetId;
        this.deletionProtection = deletionProtection;
        this.description = description;
        this.encryptionConfiguration = encryptionConfiguration;
        this.etag = etag;
        this.expirationTime = expirationTime;
        this.externalDataConfiguration = externalDataConfiguration;
        this.friendlyName = friendlyName;
        this.labels = labels;
        this.lastModifiedTime = lastModifiedTime;
        this.location = location;
        this.materializedView = materializedView;
        this.numBytes = numBytes;
        this.numLongTermBytes = numLongTermBytes;
        this.numRows = numRows;
        this.project = project;
        this.rangePartitioning = rangePartitioning;
        this.schema = schema;
        this.selfLink = selfLink;
        this.tableId = tableId;
        this.timePartitioning = timePartitioning;
        this.type = type;
        this.view = view;
    }

    private TableState() {
        this.clusterings = Input.empty();
        this.creationTime = Input.empty();
        this.datasetId = Input.empty();
        this.deletionProtection = Input.empty();
        this.description = Input.empty();
        this.encryptionConfiguration = Input.empty();
        this.etag = Input.empty();
        this.expirationTime = Input.empty();
        this.externalDataConfiguration = Input.empty();
        this.friendlyName = Input.empty();
        this.labels = Input.empty();
        this.lastModifiedTime = Input.empty();
        this.location = Input.empty();
        this.materializedView = Input.empty();
        this.numBytes = Input.empty();
        this.numLongTermBytes = Input.empty();
        this.numRows = Input.empty();
        this.project = Input.empty();
        this.rangePartitioning = Input.empty();
        this.schema = Input.empty();
        this.selfLink = Input.empty();
        this.tableId = Input.empty();
        this.timePartitioning = Input.empty();
        this.type = Input.empty();
        this.view = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> clusterings;
        private @Nullable Input<Integer> creationTime;
        private @Nullable Input<String> datasetId;
        private @Nullable Input<Boolean> deletionProtection;
        private @Nullable Input<String> description;
        private @Nullable Input<TableEncryptionConfigurationGetArgs> encryptionConfiguration;
        private @Nullable Input<String> etag;
        private @Nullable Input<Integer> expirationTime;
        private @Nullable Input<TableExternalDataConfigurationGetArgs> externalDataConfiguration;
        private @Nullable Input<String> friendlyName;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<Integer> lastModifiedTime;
        private @Nullable Input<String> location;
        private @Nullable Input<TableMaterializedViewGetArgs> materializedView;
        private @Nullable Input<Integer> numBytes;
        private @Nullable Input<Integer> numLongTermBytes;
        private @Nullable Input<Integer> numRows;
        private @Nullable Input<String> project;
        private @Nullable Input<TableRangePartitioningGetArgs> rangePartitioning;
        private @Nullable Input<String> schema;
        private @Nullable Input<String> selfLink;
        private @Nullable Input<String> tableId;
        private @Nullable Input<TableTimePartitioningGetArgs> timePartitioning;
        private @Nullable Input<String> type;
        private @Nullable Input<TableViewGetArgs> view;

        public Builder() {
    	      // Empty
        }

        public Builder(TableState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterings = defaults.clusterings;
    	      this.creationTime = defaults.creationTime;
    	      this.datasetId = defaults.datasetId;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.description = defaults.description;
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.etag = defaults.etag;
    	      this.expirationTime = defaults.expirationTime;
    	      this.externalDataConfiguration = defaults.externalDataConfiguration;
    	      this.friendlyName = defaults.friendlyName;
    	      this.labels = defaults.labels;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.location = defaults.location;
    	      this.materializedView = defaults.materializedView;
    	      this.numBytes = defaults.numBytes;
    	      this.numLongTermBytes = defaults.numLongTermBytes;
    	      this.numRows = defaults.numRows;
    	      this.project = defaults.project;
    	      this.rangePartitioning = defaults.rangePartitioning;
    	      this.schema = defaults.schema;
    	      this.selfLink = defaults.selfLink;
    	      this.tableId = defaults.tableId;
    	      this.timePartitioning = defaults.timePartitioning;
    	      this.type = defaults.type;
    	      this.view = defaults.view;
        }

        public Builder setClusterings(@Nullable Input<List<String>> clusterings) {
            this.clusterings = clusterings;
            return this;
        }

        public Builder setClusterings(@Nullable List<String> clusterings) {
            this.clusterings = Input.ofNullable(clusterings);
            return this;
        }

        public Builder setCreationTime(@Nullable Input<Integer> creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder setCreationTime(@Nullable Integer creationTime) {
            this.creationTime = Input.ofNullable(creationTime);
            return this;
        }

        public Builder setDatasetId(@Nullable Input<String> datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        public Builder setDatasetId(@Nullable String datasetId) {
            this.datasetId = Input.ofNullable(datasetId);
            return this;
        }

        public Builder setDeletionProtection(@Nullable Input<Boolean> deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }

        public Builder setDeletionProtection(@Nullable Boolean deletionProtection) {
            this.deletionProtection = Input.ofNullable(deletionProtection);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEncryptionConfiguration(@Nullable Input<TableEncryptionConfigurationGetArgs> encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        public Builder setEncryptionConfiguration(@Nullable TableEncryptionConfigurationGetArgs encryptionConfiguration) {
            this.encryptionConfiguration = Input.ofNullable(encryptionConfiguration);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setExpirationTime(@Nullable Input<Integer> expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        public Builder setExpirationTime(@Nullable Integer expirationTime) {
            this.expirationTime = Input.ofNullable(expirationTime);
            return this;
        }

        public Builder setExternalDataConfiguration(@Nullable Input<TableExternalDataConfigurationGetArgs> externalDataConfiguration) {
            this.externalDataConfiguration = externalDataConfiguration;
            return this;
        }

        public Builder setExternalDataConfiguration(@Nullable TableExternalDataConfigurationGetArgs externalDataConfiguration) {
            this.externalDataConfiguration = Input.ofNullable(externalDataConfiguration);
            return this;
        }

        public Builder setFriendlyName(@Nullable Input<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = Input.ofNullable(friendlyName);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLastModifiedTime(@Nullable Input<Integer> lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        public Builder setLastModifiedTime(@Nullable Integer lastModifiedTime) {
            this.lastModifiedTime = Input.ofNullable(lastModifiedTime);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMaterializedView(@Nullable Input<TableMaterializedViewGetArgs> materializedView) {
            this.materializedView = materializedView;
            return this;
        }

        public Builder setMaterializedView(@Nullable TableMaterializedViewGetArgs materializedView) {
            this.materializedView = Input.ofNullable(materializedView);
            return this;
        }

        public Builder setNumBytes(@Nullable Input<Integer> numBytes) {
            this.numBytes = numBytes;
            return this;
        }

        public Builder setNumBytes(@Nullable Integer numBytes) {
            this.numBytes = Input.ofNullable(numBytes);
            return this;
        }

        public Builder setNumLongTermBytes(@Nullable Input<Integer> numLongTermBytes) {
            this.numLongTermBytes = numLongTermBytes;
            return this;
        }

        public Builder setNumLongTermBytes(@Nullable Integer numLongTermBytes) {
            this.numLongTermBytes = Input.ofNullable(numLongTermBytes);
            return this;
        }

        public Builder setNumRows(@Nullable Input<Integer> numRows) {
            this.numRows = numRows;
            return this;
        }

        public Builder setNumRows(@Nullable Integer numRows) {
            this.numRows = Input.ofNullable(numRows);
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

        public Builder setRangePartitioning(@Nullable Input<TableRangePartitioningGetArgs> rangePartitioning) {
            this.rangePartitioning = rangePartitioning;
            return this;
        }

        public Builder setRangePartitioning(@Nullable TableRangePartitioningGetArgs rangePartitioning) {
            this.rangePartitioning = Input.ofNullable(rangePartitioning);
            return this;
        }

        public Builder setSchema(@Nullable Input<String> schema) {
            this.schema = schema;
            return this;
        }

        public Builder setSchema(@Nullable String schema) {
            this.schema = Input.ofNullable(schema);
            return this;
        }

        public Builder setSelfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder setSelfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
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

        public Builder setTimePartitioning(@Nullable Input<TableTimePartitioningGetArgs> timePartitioning) {
            this.timePartitioning = timePartitioning;
            return this;
        }

        public Builder setTimePartitioning(@Nullable TableTimePartitioningGetArgs timePartitioning) {
            this.timePartitioning = Input.ofNullable(timePartitioning);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setView(@Nullable Input<TableViewGetArgs> view) {
            this.view = view;
            return this;
        }

        public Builder setView(@Nullable TableViewGetArgs view) {
            this.view = Input.ofNullable(view);
            return this;
        }
        public TableState build() {
            return new TableState(clusterings, creationTime, datasetId, deletionProtection, description, encryptionConfiguration, etag, expirationTime, externalDataConfiguration, friendlyName, labels, lastModifiedTime, location, materializedView, numBytes, numLongTermBytes, numRows, project, rangePartitioning, schema, selfLink, tableId, timePartitioning, type, view);
        }
    }
}