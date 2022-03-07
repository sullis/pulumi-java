// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datacatalog_v1.enums.EntryType;
import io.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1BigQueryDateShardedSpecArgs;
import io.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1BigQueryTableSpecArgs;
import io.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1BusinessContextArgs;
import io.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1DataSourceConnectionSpecArgs;
import io.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1DatabaseTableSpecArgs;
import io.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1GcsFilesetSpecArgs;
import io.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1RoutineSpecArgs;
import io.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1SchemaArgs;
import io.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1SystemTimestampsArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EntryArgs extends io.pulumi.resources.ResourceArgs {

    public static final EntryArgs Empty = new EntryArgs();

    /**
     * Specification for a group of BigQuery tables with the `[prefix]YYYYMMDD` name pattern. For more information, see [Introduction to partitioned tables] (https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding).
     * 
     */
    @InputImport(name="bigqueryDateShardedSpec")
      private final @Nullable Input<GoogleCloudDatacatalogV1BigQueryDateShardedSpecArgs> bigqueryDateShardedSpec;

    public Input<GoogleCloudDatacatalogV1BigQueryDateShardedSpecArgs> getBigqueryDateShardedSpec() {
        return this.bigqueryDateShardedSpec == null ? Input.empty() : this.bigqueryDateShardedSpec;
    }

    /**
     * Specification that applies to a BigQuery table. Valid only for entries with the `TABLE` type.
     * 
     */
    @InputImport(name="bigqueryTableSpec")
      private final @Nullable Input<GoogleCloudDatacatalogV1BigQueryTableSpecArgs> bigqueryTableSpec;

    public Input<GoogleCloudDatacatalogV1BigQueryTableSpecArgs> getBigqueryTableSpec() {
        return this.bigqueryTableSpec == null ? Input.empty() : this.bigqueryTableSpec;
    }

    /**
     * Business Context of the entry.
     * 
     */
    @InputImport(name="businessContext")
      private final @Nullable Input<GoogleCloudDatacatalogV1BusinessContextArgs> businessContext;

    public Input<GoogleCloudDatacatalogV1BusinessContextArgs> getBusinessContext() {
        return this.businessContext == null ? Input.empty() : this.businessContext;
    }

    /**
     * Specification that applies to a data source connection. Valid only for entries with the `DATA_SOURCE_CONNECTION` type.
     * 
     */
    @InputImport(name="dataSourceConnectionSpec")
      private final @Nullable Input<GoogleCloudDatacatalogV1DataSourceConnectionSpecArgs> dataSourceConnectionSpec;

    public Input<GoogleCloudDatacatalogV1DataSourceConnectionSpecArgs> getDataSourceConnectionSpec() {
        return this.dataSourceConnectionSpec == null ? Input.empty() : this.dataSourceConnectionSpec;
    }

    /**
     * Specification that applies to a table resource. Valid only for entries with the `TABLE` type.
     * 
     */
    @InputImport(name="databaseTableSpec")
      private final @Nullable Input<GoogleCloudDatacatalogV1DatabaseTableSpecArgs> databaseTableSpec;

    public Input<GoogleCloudDatacatalogV1DatabaseTableSpecArgs> getDatabaseTableSpec() {
        return this.databaseTableSpec == null ? Input.empty() : this.databaseTableSpec;
    }

    /**
     * Entry description that can consist of several sentences or paragraphs that describe entry contents. The description must not contain Unicode non-characters as well as C0 and C1 control codes except tabs (HT), new lines (LF), carriage returns (CR), and page breaks (FF). The maximum size is 2000 bytes when encoded in UTF-8. Default value is an empty string.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Display name of an entry. The name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), and can't start or end with spaces. The maximum size is 200 bytes when encoded in UTF-8. Default value is an empty string.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    @InputImport(name="entryGroupId", required=true)
      private final Input<String> entryGroupId;

    public Input<String> getEntryGroupId() {
        return this.entryGroupId;
    }

    @InputImport(name="entryId", required=true)
      private final Input<String> entryId;

    public Input<String> getEntryId() {
        return this.entryId;
    }

    /**
     * Fully qualified name (FQN) of the resource. Set automatically for entries representing resources from synced systems. Settable only during creation and read-only afterwards. Can be used for search and lookup of the entries. FQNs take two forms: * For non-regionalized resources: `{SYSTEM}:{PROJECT}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` * For regionalized resources: `{SYSTEM}:{PROJECT}.{LOCATION_ID}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` Example for a DPMS table: `dataproc_metastore:{PROJECT_ID}.{LOCATION_ID}.{INSTANCE_ID}.{DATABASE_ID}.{TABLE_ID}`
     * 
     */
    @InputImport(name="fullyQualifiedName")
      private final @Nullable Input<String> fullyQualifiedName;

    public Input<String> getFullyQualifiedName() {
        return this.fullyQualifiedName == null ? Input.empty() : this.fullyQualifiedName;
    }

    /**
     * Specification that applies to a Cloud Storage fileset. Valid only for entries with the `FILESET` type.
     * 
     */
    @InputImport(name="gcsFilesetSpec")
      private final @Nullable Input<GoogleCloudDatacatalogV1GcsFilesetSpecArgs> gcsFilesetSpec;

    public Input<GoogleCloudDatacatalogV1GcsFilesetSpecArgs> getGcsFilesetSpec() {
        return this.gcsFilesetSpec == null ? Input.empty() : this.gcsFilesetSpec;
    }

    /**
     * Cloud labels attached to the entry. In Data Catalog, you can create and modify labels attached only to custom entries. Synced entries have unmodifiable labels that come from the source system.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The resource this metadata entry refers to. For Google Cloud Platform resources, `linked_resource` is the [Full Resource Name] (https://cloud.google.com/apis/design/resource_names#full_resource_name). For example, the `linked_resource` for a table resource from BigQuery is: `//bigquery.googleapis.com/projects/{PROJECT_ID}/datasets/{DATASET_ID}/tables/{TABLE_ID}` Output only when the entry is one of the types in the `EntryType` enum. For entries with a `user_specified_type`, this field is optional and defaults to an empty string. The resource string must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), periods (.), colons (:), slashes (/), dashes (-), and hashes (#). The maximum size is 200 bytes when encoded in UTF-8.
     * 
     */
    @InputImport(name="linkedResource")
      private final @Nullable Input<String> linkedResource;

    public Input<String> getLinkedResource() {
        return this.linkedResource == null ? Input.empty() : this.linkedResource;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Specification that applies to a user-defined function or procedure. Valid only for entries with the `ROUTINE` type.
     * 
     */
    @InputImport(name="routineSpec")
      private final @Nullable Input<GoogleCloudDatacatalogV1RoutineSpecArgs> routineSpec;

    public Input<GoogleCloudDatacatalogV1RoutineSpecArgs> getRoutineSpec() {
        return this.routineSpec == null ? Input.empty() : this.routineSpec;
    }

    /**
     * Schema of the entry. An entry might not have any schema attached to it.
     * 
     */
    @InputImport(name="schema")
      private final @Nullable Input<GoogleCloudDatacatalogV1SchemaArgs> schema;

    public Input<GoogleCloudDatacatalogV1SchemaArgs> getSchema() {
        return this.schema == null ? Input.empty() : this.schema;
    }

    /**
     * Timestamps from the underlying resource, not from the Data Catalog entry. Output only when the entry has a type listed in the `EntryType` enum. For entries with `user_specified_type`, this field is optional and defaults to an empty timestamp.
     * 
     */
    @InputImport(name="sourceSystemTimestamps")
      private final @Nullable Input<GoogleCloudDatacatalogV1SystemTimestampsArgs> sourceSystemTimestamps;

    public Input<GoogleCloudDatacatalogV1SystemTimestampsArgs> getSourceSystemTimestamps() {
        return this.sourceSystemTimestamps == null ? Input.empty() : this.sourceSystemTimestamps;
    }

    /**
     * The type of the entry. Only used for entries with types listed in the `EntryType` enum. Currently, only `FILESET` enum value is allowed. All other entries created in Data Catalog must use the `user_specified_type`.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<EntryType> type;

    public Input<EntryType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * Indicates the entry's source system that Data Catalog doesn't automatically integrate with. The `user_specified_system` string has the following limitations: * Is case insensitive. * Must begin with a letter or underscore. * Can only contain letters, numbers, and underscores. * Must be at least 1 character and at most 64 characters long.
     * 
     */
    @InputImport(name="userSpecifiedSystem")
      private final @Nullable Input<String> userSpecifiedSystem;

    public Input<String> getUserSpecifiedSystem() {
        return this.userSpecifiedSystem == null ? Input.empty() : this.userSpecifiedSystem;
    }

    /**
     * Custom entry type that doesn't match any of the values allowed for input and listed in the `EntryType` enum. When creating an entry, first check the type values in the enum. If there are no appropriate types for the new entry, provide a custom value, for example, `my_special_type`. The `user_specified_type` string has the following limitations: * Is case insensitive. * Must begin with a letter or underscore. * Can only contain letters, numbers, and underscores. * Must be at least 1 character and at most 64 characters long.
     * 
     */
    @InputImport(name="userSpecifiedType")
      private final @Nullable Input<String> userSpecifiedType;

    public Input<String> getUserSpecifiedType() {
        return this.userSpecifiedType == null ? Input.empty() : this.userSpecifiedType;
    }

    public EntryArgs(
        @Nullable Input<GoogleCloudDatacatalogV1BigQueryDateShardedSpecArgs> bigqueryDateShardedSpec,
        @Nullable Input<GoogleCloudDatacatalogV1BigQueryTableSpecArgs> bigqueryTableSpec,
        @Nullable Input<GoogleCloudDatacatalogV1BusinessContextArgs> businessContext,
        @Nullable Input<GoogleCloudDatacatalogV1DataSourceConnectionSpecArgs> dataSourceConnectionSpec,
        @Nullable Input<GoogleCloudDatacatalogV1DatabaseTableSpecArgs> databaseTableSpec,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        Input<String> entryGroupId,
        Input<String> entryId,
        @Nullable Input<String> fullyQualifiedName,
        @Nullable Input<GoogleCloudDatacatalogV1GcsFilesetSpecArgs> gcsFilesetSpec,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> linkedResource,
        @Nullable Input<String> location,
        @Nullable Input<String> project,
        @Nullable Input<GoogleCloudDatacatalogV1RoutineSpecArgs> routineSpec,
        @Nullable Input<GoogleCloudDatacatalogV1SchemaArgs> schema,
        @Nullable Input<GoogleCloudDatacatalogV1SystemTimestampsArgs> sourceSystemTimestamps,
        @Nullable Input<EntryType> type,
        @Nullable Input<String> userSpecifiedSystem,
        @Nullable Input<String> userSpecifiedType) {
        this.bigqueryDateShardedSpec = bigqueryDateShardedSpec;
        this.bigqueryTableSpec = bigqueryTableSpec;
        this.businessContext = businessContext;
        this.dataSourceConnectionSpec = dataSourceConnectionSpec;
        this.databaseTableSpec = databaseTableSpec;
        this.description = description;
        this.displayName = displayName;
        this.entryGroupId = Objects.requireNonNull(entryGroupId, "expected parameter 'entryGroupId' to be non-null");
        this.entryId = Objects.requireNonNull(entryId, "expected parameter 'entryId' to be non-null");
        this.fullyQualifiedName = fullyQualifiedName;
        this.gcsFilesetSpec = gcsFilesetSpec;
        this.labels = labels;
        this.linkedResource = linkedResource;
        this.location = location;
        this.project = project;
        this.routineSpec = routineSpec;
        this.schema = schema;
        this.sourceSystemTimestamps = sourceSystemTimestamps;
        this.type = type;
        this.userSpecifiedSystem = userSpecifiedSystem;
        this.userSpecifiedType = userSpecifiedType;
    }

    private EntryArgs() {
        this.bigqueryDateShardedSpec = Input.empty();
        this.bigqueryTableSpec = Input.empty();
        this.businessContext = Input.empty();
        this.dataSourceConnectionSpec = Input.empty();
        this.databaseTableSpec = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.entryGroupId = Input.empty();
        this.entryId = Input.empty();
        this.fullyQualifiedName = Input.empty();
        this.gcsFilesetSpec = Input.empty();
        this.labels = Input.empty();
        this.linkedResource = Input.empty();
        this.location = Input.empty();
        this.project = Input.empty();
        this.routineSpec = Input.empty();
        this.schema = Input.empty();
        this.sourceSystemTimestamps = Input.empty();
        this.type = Input.empty();
        this.userSpecifiedSystem = Input.empty();
        this.userSpecifiedType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudDatacatalogV1BigQueryDateShardedSpecArgs> bigqueryDateShardedSpec;
        private @Nullable Input<GoogleCloudDatacatalogV1BigQueryTableSpecArgs> bigqueryTableSpec;
        private @Nullable Input<GoogleCloudDatacatalogV1BusinessContextArgs> businessContext;
        private @Nullable Input<GoogleCloudDatacatalogV1DataSourceConnectionSpecArgs> dataSourceConnectionSpec;
        private @Nullable Input<GoogleCloudDatacatalogV1DatabaseTableSpecArgs> databaseTableSpec;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private Input<String> entryGroupId;
        private Input<String> entryId;
        private @Nullable Input<String> fullyQualifiedName;
        private @Nullable Input<GoogleCloudDatacatalogV1GcsFilesetSpecArgs> gcsFilesetSpec;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> linkedResource;
        private @Nullable Input<String> location;
        private @Nullable Input<String> project;
        private @Nullable Input<GoogleCloudDatacatalogV1RoutineSpecArgs> routineSpec;
        private @Nullable Input<GoogleCloudDatacatalogV1SchemaArgs> schema;
        private @Nullable Input<GoogleCloudDatacatalogV1SystemTimestampsArgs> sourceSystemTimestamps;
        private @Nullable Input<EntryType> type;
        private @Nullable Input<String> userSpecifiedSystem;
        private @Nullable Input<String> userSpecifiedType;

        public Builder() {
    	      // Empty
        }

        public Builder(EntryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryDateShardedSpec = defaults.bigqueryDateShardedSpec;
    	      this.bigqueryTableSpec = defaults.bigqueryTableSpec;
    	      this.businessContext = defaults.businessContext;
    	      this.dataSourceConnectionSpec = defaults.dataSourceConnectionSpec;
    	      this.databaseTableSpec = defaults.databaseTableSpec;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.entryGroupId = defaults.entryGroupId;
    	      this.entryId = defaults.entryId;
    	      this.fullyQualifiedName = defaults.fullyQualifiedName;
    	      this.gcsFilesetSpec = defaults.gcsFilesetSpec;
    	      this.labels = defaults.labels;
    	      this.linkedResource = defaults.linkedResource;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.routineSpec = defaults.routineSpec;
    	      this.schema = defaults.schema;
    	      this.sourceSystemTimestamps = defaults.sourceSystemTimestamps;
    	      this.type = defaults.type;
    	      this.userSpecifiedSystem = defaults.userSpecifiedSystem;
    	      this.userSpecifiedType = defaults.userSpecifiedType;
        }

        public Builder setBigqueryDateShardedSpec(@Nullable Input<GoogleCloudDatacatalogV1BigQueryDateShardedSpecArgs> bigqueryDateShardedSpec) {
            this.bigqueryDateShardedSpec = bigqueryDateShardedSpec;
            return this;
        }

        public Builder setBigqueryDateShardedSpec(@Nullable GoogleCloudDatacatalogV1BigQueryDateShardedSpecArgs bigqueryDateShardedSpec) {
            this.bigqueryDateShardedSpec = Input.ofNullable(bigqueryDateShardedSpec);
            return this;
        }

        public Builder setBigqueryTableSpec(@Nullable Input<GoogleCloudDatacatalogV1BigQueryTableSpecArgs> bigqueryTableSpec) {
            this.bigqueryTableSpec = bigqueryTableSpec;
            return this;
        }

        public Builder setBigqueryTableSpec(@Nullable GoogleCloudDatacatalogV1BigQueryTableSpecArgs bigqueryTableSpec) {
            this.bigqueryTableSpec = Input.ofNullable(bigqueryTableSpec);
            return this;
        }

        public Builder setBusinessContext(@Nullable Input<GoogleCloudDatacatalogV1BusinessContextArgs> businessContext) {
            this.businessContext = businessContext;
            return this;
        }

        public Builder setBusinessContext(@Nullable GoogleCloudDatacatalogV1BusinessContextArgs businessContext) {
            this.businessContext = Input.ofNullable(businessContext);
            return this;
        }

        public Builder setDataSourceConnectionSpec(@Nullable Input<GoogleCloudDatacatalogV1DataSourceConnectionSpecArgs> dataSourceConnectionSpec) {
            this.dataSourceConnectionSpec = dataSourceConnectionSpec;
            return this;
        }

        public Builder setDataSourceConnectionSpec(@Nullable GoogleCloudDatacatalogV1DataSourceConnectionSpecArgs dataSourceConnectionSpec) {
            this.dataSourceConnectionSpec = Input.ofNullable(dataSourceConnectionSpec);
            return this;
        }

        public Builder setDatabaseTableSpec(@Nullable Input<GoogleCloudDatacatalogV1DatabaseTableSpecArgs> databaseTableSpec) {
            this.databaseTableSpec = databaseTableSpec;
            return this;
        }

        public Builder setDatabaseTableSpec(@Nullable GoogleCloudDatacatalogV1DatabaseTableSpecArgs databaseTableSpec) {
            this.databaseTableSpec = Input.ofNullable(databaseTableSpec);
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

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setEntryGroupId(Input<String> entryGroupId) {
            this.entryGroupId = Objects.requireNonNull(entryGroupId);
            return this;
        }

        public Builder setEntryGroupId(String entryGroupId) {
            this.entryGroupId = Input.of(Objects.requireNonNull(entryGroupId));
            return this;
        }

        public Builder setEntryId(Input<String> entryId) {
            this.entryId = Objects.requireNonNull(entryId);
            return this;
        }

        public Builder setEntryId(String entryId) {
            this.entryId = Input.of(Objects.requireNonNull(entryId));
            return this;
        }

        public Builder setFullyQualifiedName(@Nullable Input<String> fullyQualifiedName) {
            this.fullyQualifiedName = fullyQualifiedName;
            return this;
        }

        public Builder setFullyQualifiedName(@Nullable String fullyQualifiedName) {
            this.fullyQualifiedName = Input.ofNullable(fullyQualifiedName);
            return this;
        }

        public Builder setGcsFilesetSpec(@Nullable Input<GoogleCloudDatacatalogV1GcsFilesetSpecArgs> gcsFilesetSpec) {
            this.gcsFilesetSpec = gcsFilesetSpec;
            return this;
        }

        public Builder setGcsFilesetSpec(@Nullable GoogleCloudDatacatalogV1GcsFilesetSpecArgs gcsFilesetSpec) {
            this.gcsFilesetSpec = Input.ofNullable(gcsFilesetSpec);
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

        public Builder setLinkedResource(@Nullable Input<String> linkedResource) {
            this.linkedResource = linkedResource;
            return this;
        }

        public Builder setLinkedResource(@Nullable String linkedResource) {
            this.linkedResource = Input.ofNullable(linkedResource);
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRoutineSpec(@Nullable Input<GoogleCloudDatacatalogV1RoutineSpecArgs> routineSpec) {
            this.routineSpec = routineSpec;
            return this;
        }

        public Builder setRoutineSpec(@Nullable GoogleCloudDatacatalogV1RoutineSpecArgs routineSpec) {
            this.routineSpec = Input.ofNullable(routineSpec);
            return this;
        }

        public Builder setSchema(@Nullable Input<GoogleCloudDatacatalogV1SchemaArgs> schema) {
            this.schema = schema;
            return this;
        }

        public Builder setSchema(@Nullable GoogleCloudDatacatalogV1SchemaArgs schema) {
            this.schema = Input.ofNullable(schema);
            return this;
        }

        public Builder setSourceSystemTimestamps(@Nullable Input<GoogleCloudDatacatalogV1SystemTimestampsArgs> sourceSystemTimestamps) {
            this.sourceSystemTimestamps = sourceSystemTimestamps;
            return this;
        }

        public Builder setSourceSystemTimestamps(@Nullable GoogleCloudDatacatalogV1SystemTimestampsArgs sourceSystemTimestamps) {
            this.sourceSystemTimestamps = Input.ofNullable(sourceSystemTimestamps);
            return this;
        }

        public Builder setType(@Nullable Input<EntryType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable EntryType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setUserSpecifiedSystem(@Nullable Input<String> userSpecifiedSystem) {
            this.userSpecifiedSystem = userSpecifiedSystem;
            return this;
        }

        public Builder setUserSpecifiedSystem(@Nullable String userSpecifiedSystem) {
            this.userSpecifiedSystem = Input.ofNullable(userSpecifiedSystem);
            return this;
        }

        public Builder setUserSpecifiedType(@Nullable Input<String> userSpecifiedType) {
            this.userSpecifiedType = userSpecifiedType;
            return this;
        }

        public Builder setUserSpecifiedType(@Nullable String userSpecifiedType) {
            this.userSpecifiedType = Input.ofNullable(userSpecifiedType);
            return this;
        }
        public EntryArgs build() {
            return new EntryArgs(bigqueryDateShardedSpec, bigqueryTableSpec, businessContext, dataSourceConnectionSpec, databaseTableSpec, description, displayName, entryGroupId, entryId, fullyQualifiedName, gcsFilesetSpec, labels, linkedResource, location, project, routineSpec, schema, sourceSystemTimestamps, type, userSpecifiedSystem, userSpecifiedType);
        }
    }
}