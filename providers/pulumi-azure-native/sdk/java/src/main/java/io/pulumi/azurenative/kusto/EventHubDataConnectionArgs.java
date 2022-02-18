// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.kusto.enums.Compression;
import io.pulumi.azurenative.kusto.enums.EventHubDataFormat;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventHubDataConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventHubDataConnectionArgs Empty = new EventHubDataConnectionArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @InputImport(name="clusterName", required=true)
    private final Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * The event hub messages compression type
     * 
     */
    @InputImport(name="compression")
    private final @Nullable Input<Either<String,Compression>> compression;

    public Input<Either<String,Compression>> getCompression() {
        return this.compression == null ? Input.empty() : this.compression;
    }

    /**
     * The event hub consumer group.
     * 
     */
    @InputImport(name="consumerGroup", required=true)
    private final Input<String> consumerGroup;

    public Input<String> getConsumerGroup() {
        return this.consumerGroup;
    }

    /**
     * The name of the data connection.
     * 
     */
    @InputImport(name="dataConnectionName")
    private final @Nullable Input<String> dataConnectionName;

    public Input<String> getDataConnectionName() {
        return this.dataConnectionName == null ? Input.empty() : this.dataConnectionName;
    }

    /**
     * The data format of the message. Optionally the data format can be added to each message.
     * 
     */
    @InputImport(name="dataFormat")
    private final @Nullable Input<Either<String,EventHubDataFormat>> dataFormat;

    public Input<Either<String,EventHubDataFormat>> getDataFormat() {
        return this.dataFormat == null ? Input.empty() : this.dataFormat;
    }

    /**
     * The name of the database in the Kusto cluster.
     * 
     */
    @InputImport(name="databaseName", required=true)
    private final Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName;
    }

    /**
     * The resource ID of the event hub to be used to create a data connection.
     * 
     */
    @InputImport(name="eventHubResourceId", required=true)
    private final Input<String> eventHubResourceId;

    public Input<String> getEventHubResourceId() {
        return this.eventHubResourceId;
    }

    /**
     * System properties of the event hub
     * 
     */
    @InputImport(name="eventSystemProperties")
    private final @Nullable Input<List<String>> eventSystemProperties;

    public Input<List<String>> getEventSystemProperties() {
        return this.eventSystemProperties == null ? Input.empty() : this.eventSystemProperties;
    }

    /**
     * Kind of the endpoint for the data connection
     * Expected value is 'EventHub'.
     * 
     */
    @InputImport(name="kind", required=true)
    private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The resource ID of a managed identity (system or user assigned) to be used to authenticate with event hub.
     * 
     */
    @InputImport(name="managedIdentityResourceId")
    private final @Nullable Input<String> managedIdentityResourceId;

    public Input<String> getManagedIdentityResourceId() {
        return this.managedIdentityResourceId == null ? Input.empty() : this.managedIdentityResourceId;
    }

    /**
     * The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     * 
     */
    @InputImport(name="mappingRuleName")
    private final @Nullable Input<String> mappingRuleName;

    public Input<String> getMappingRuleName() {
        return this.mappingRuleName == null ? Input.empty() : this.mappingRuleName;
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The table where the data should be ingested. Optionally the table information can be added to each message.
     * 
     */
    @InputImport(name="tableName")
    private final @Nullable Input<String> tableName;

    public Input<String> getTableName() {
        return this.tableName == null ? Input.empty() : this.tableName;
    }

    public EventHubDataConnectionArgs(
        Input<String> clusterName,
        @Nullable Input<Either<String,Compression>> compression,
        Input<String> consumerGroup,
        @Nullable Input<String> dataConnectionName,
        @Nullable Input<Either<String,EventHubDataFormat>> dataFormat,
        Input<String> databaseName,
        Input<String> eventHubResourceId,
        @Nullable Input<List<String>> eventSystemProperties,
        Input<String> kind,
        @Nullable Input<String> location,
        @Nullable Input<String> managedIdentityResourceId,
        @Nullable Input<String> mappingRuleName,
        Input<String> resourceGroupName,
        @Nullable Input<String> tableName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.compression = compression;
        this.consumerGroup = Objects.requireNonNull(consumerGroup, "expected parameter 'consumerGroup' to be non-null");
        this.dataConnectionName = dataConnectionName;
        this.dataFormat = dataFormat;
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.eventHubResourceId = Objects.requireNonNull(eventHubResourceId, "expected parameter 'eventHubResourceId' to be non-null");
        this.eventSystemProperties = eventSystemProperties;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.location = location;
        this.managedIdentityResourceId = managedIdentityResourceId;
        this.mappingRuleName = mappingRuleName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tableName = tableName;
    }

    private EventHubDataConnectionArgs() {
        this.clusterName = Input.empty();
        this.compression = Input.empty();
        this.consumerGroup = Input.empty();
        this.dataConnectionName = Input.empty();
        this.dataFormat = Input.empty();
        this.databaseName = Input.empty();
        this.eventHubResourceId = Input.empty();
        this.eventSystemProperties = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.managedIdentityResourceId = Input.empty();
        this.mappingRuleName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tableName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHubDataConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clusterName;
        private @Nullable Input<Either<String,Compression>> compression;
        private Input<String> consumerGroup;
        private @Nullable Input<String> dataConnectionName;
        private @Nullable Input<Either<String,EventHubDataFormat>> dataFormat;
        private Input<String> databaseName;
        private Input<String> eventHubResourceId;
        private @Nullable Input<List<String>> eventSystemProperties;
        private Input<String> kind;
        private @Nullable Input<String> location;
        private @Nullable Input<String> managedIdentityResourceId;
        private @Nullable Input<String> mappingRuleName;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHubDataConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.compression = defaults.compression;
    	      this.consumerGroup = defaults.consumerGroup;
    	      this.dataConnectionName = defaults.dataConnectionName;
    	      this.dataFormat = defaults.dataFormat;
    	      this.databaseName = defaults.databaseName;
    	      this.eventHubResourceId = defaults.eventHubResourceId;
    	      this.eventSystemProperties = defaults.eventSystemProperties;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.managedIdentityResourceId = defaults.managedIdentityResourceId;
    	      this.mappingRuleName = defaults.mappingRuleName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tableName = defaults.tableName;
        }

        public Builder setClusterName(Input<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Input.of(Objects.requireNonNull(clusterName));
            return this;
        }

        public Builder setCompression(@Nullable Input<Either<String,Compression>> compression) {
            this.compression = compression;
            return this;
        }

        public Builder setCompression(@Nullable Either<String,Compression> compression) {
            this.compression = Input.ofNullable(compression);
            return this;
        }

        public Builder setConsumerGroup(Input<String> consumerGroup) {
            this.consumerGroup = Objects.requireNonNull(consumerGroup);
            return this;
        }

        public Builder setConsumerGroup(String consumerGroup) {
            this.consumerGroup = Input.of(Objects.requireNonNull(consumerGroup));
            return this;
        }

        public Builder setDataConnectionName(@Nullable Input<String> dataConnectionName) {
            this.dataConnectionName = dataConnectionName;
            return this;
        }

        public Builder setDataConnectionName(@Nullable String dataConnectionName) {
            this.dataConnectionName = Input.ofNullable(dataConnectionName);
            return this;
        }

        public Builder setDataFormat(@Nullable Input<Either<String,EventHubDataFormat>> dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }

        public Builder setDataFormat(@Nullable Either<String,EventHubDataFormat> dataFormat) {
            this.dataFormat = Input.ofNullable(dataFormat);
            return this;
        }

        public Builder setDatabaseName(Input<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Input.of(Objects.requireNonNull(databaseName));
            return this;
        }

        public Builder setEventHubResourceId(Input<String> eventHubResourceId) {
            this.eventHubResourceId = Objects.requireNonNull(eventHubResourceId);
            return this;
        }

        public Builder setEventHubResourceId(String eventHubResourceId) {
            this.eventHubResourceId = Input.of(Objects.requireNonNull(eventHubResourceId));
            return this;
        }

        public Builder setEventSystemProperties(@Nullable Input<List<String>> eventSystemProperties) {
            this.eventSystemProperties = eventSystemProperties;
            return this;
        }

        public Builder setEventSystemProperties(@Nullable List<String> eventSystemProperties) {
            this.eventSystemProperties = Input.ofNullable(eventSystemProperties);
            return this;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
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

        public Builder setManagedIdentityResourceId(@Nullable Input<String> managedIdentityResourceId) {
            this.managedIdentityResourceId = managedIdentityResourceId;
            return this;
        }

        public Builder setManagedIdentityResourceId(@Nullable String managedIdentityResourceId) {
            this.managedIdentityResourceId = Input.ofNullable(managedIdentityResourceId);
            return this;
        }

        public Builder setMappingRuleName(@Nullable Input<String> mappingRuleName) {
            this.mappingRuleName = mappingRuleName;
            return this;
        }

        public Builder setMappingRuleName(@Nullable String mappingRuleName) {
            this.mappingRuleName = Input.ofNullable(mappingRuleName);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTableName(@Nullable Input<String> tableName) {
            this.tableName = tableName;
            return this;
        }

        public Builder setTableName(@Nullable String tableName) {
            this.tableName = Input.ofNullable(tableName);
            return this;
        }

        public EventHubDataConnectionArgs build() {
            return new EventHubDataConnectionArgs(clusterName, compression, consumerGroup, dataConnectionName, dataFormat, databaseName, eventHubResourceId, eventSystemProperties, kind, location, managedIdentityResourceId, mappingRuleName, resourceGroupName, tableName);
        }
    }
}
