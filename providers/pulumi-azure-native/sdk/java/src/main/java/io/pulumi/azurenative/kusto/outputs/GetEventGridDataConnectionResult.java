// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetEventGridDataConnectionResult {
    /**
     * The name of blob storage event type to process.
     * 
     */
    private final @Nullable String blobStorageEventType;
    /**
     * The event hub consumer group.
     * 
     */
    private final String consumerGroup;
    /**
     * The data format of the message. Optionally the data format can be added to each message.
     * 
     */
    private final @Nullable String dataFormat;
    /**
     * The resource ID where the event grid is configured to send events.
     * 
     */
    private final String eventHubResourceId;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * A Boolean value that, if set to true, indicates that ingestion should ignore the first record of every file
     * 
     */
    private final @Nullable Boolean ignoreFirstRecord;
    /**
     * Kind of the endpoint for the data connection
     * Expected value is 'EventGrid'.
     * 
     */
    private final String kind;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     * 
     */
    private final @Nullable String mappingRuleName;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The provisioned state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * The resource ID of the storage account where the data resides.
     * 
     */
    private final String storageAccountResourceId;
    /**
     * The table where the data should be ingested. Optionally the table information can be added to each message.
     * 
     */
    private final @Nullable String tableName;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"blobStorageEventType","consumerGroup","dataFormat","eventHubResourceId","id","ignoreFirstRecord","kind","location","mappingRuleName","name","provisioningState","storageAccountResourceId","tableName","type"})
    private GetEventGridDataConnectionResult(
        @Nullable String blobStorageEventType,
        String consumerGroup,
        @Nullable String dataFormat,
        String eventHubResourceId,
        String id,
        @Nullable Boolean ignoreFirstRecord,
        String kind,
        @Nullable String location,
        @Nullable String mappingRuleName,
        String name,
        String provisioningState,
        String storageAccountResourceId,
        @Nullable String tableName,
        String type) {
        this.blobStorageEventType = blobStorageEventType;
        this.consumerGroup = Objects.requireNonNull(consumerGroup);
        this.dataFormat = dataFormat;
        this.eventHubResourceId = Objects.requireNonNull(eventHubResourceId);
        this.id = Objects.requireNonNull(id);
        this.ignoreFirstRecord = ignoreFirstRecord;
        this.kind = Objects.requireNonNull(kind);
        this.location = location;
        this.mappingRuleName = mappingRuleName;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.storageAccountResourceId = Objects.requireNonNull(storageAccountResourceId);
        this.tableName = tableName;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The name of blob storage event type to process.
     * 
     */
    public Optional<String> getBlobStorageEventType() {
        return Optional.ofNullable(this.blobStorageEventType);
    }
    /**
     * The event hub consumer group.
     * 
     */
    public String getConsumerGroup() {
        return this.consumerGroup;
    }
    /**
     * The data format of the message. Optionally the data format can be added to each message.
     * 
     */
    public Optional<String> getDataFormat() {
        return Optional.ofNullable(this.dataFormat);
    }
    /**
     * The resource ID where the event grid is configured to send events.
     * 
     */
    public String getEventHubResourceId() {
        return this.eventHubResourceId;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * A Boolean value that, if set to true, indicates that ingestion should ignore the first record of every file
     * 
     */
    public Optional<Boolean> getIgnoreFirstRecord() {
        return Optional.ofNullable(this.ignoreFirstRecord);
    }
    /**
     * Kind of the endpoint for the data connection
     * Expected value is 'EventGrid'.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * Resource location.
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     * 
     */
    public Optional<String> getMappingRuleName() {
        return Optional.ofNullable(this.mappingRuleName);
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioned state of the resource.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource ID of the storage account where the data resides.
     * 
     */
    public String getStorageAccountResourceId() {
        return this.storageAccountResourceId;
    }
    /**
     * The table where the data should be ingested. Optionally the table information can be added to each message.
     * 
     */
    public Optional<String> getTableName() {
        return Optional.ofNullable(this.tableName);
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventGridDataConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String blobStorageEventType;
        private String consumerGroup;
        private @Nullable String dataFormat;
        private String eventHubResourceId;
        private String id;
        private @Nullable Boolean ignoreFirstRecord;
        private String kind;
        private @Nullable String location;
        private @Nullable String mappingRuleName;
        private String name;
        private String provisioningState;
        private String storageAccountResourceId;
        private @Nullable String tableName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventGridDataConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobStorageEventType = defaults.blobStorageEventType;
    	      this.consumerGroup = defaults.consumerGroup;
    	      this.dataFormat = defaults.dataFormat;
    	      this.eventHubResourceId = defaults.eventHubResourceId;
    	      this.id = defaults.id;
    	      this.ignoreFirstRecord = defaults.ignoreFirstRecord;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.mappingRuleName = defaults.mappingRuleName;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.storageAccountResourceId = defaults.storageAccountResourceId;
    	      this.tableName = defaults.tableName;
    	      this.type = defaults.type;
        }

        public Builder setBlobStorageEventType(@Nullable String blobStorageEventType) {
            this.blobStorageEventType = blobStorageEventType;
            return this;
        }

        public Builder setConsumerGroup(String consumerGroup) {
            this.consumerGroup = Objects.requireNonNull(consumerGroup);
            return this;
        }

        public Builder setDataFormat(@Nullable String dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }

        public Builder setEventHubResourceId(String eventHubResourceId) {
            this.eventHubResourceId = Objects.requireNonNull(eventHubResourceId);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIgnoreFirstRecord(@Nullable Boolean ignoreFirstRecord) {
            this.ignoreFirstRecord = ignoreFirstRecord;
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setMappingRuleName(@Nullable String mappingRuleName) {
            this.mappingRuleName = mappingRuleName;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setStorageAccountResourceId(String storageAccountResourceId) {
            this.storageAccountResourceId = Objects.requireNonNull(storageAccountResourceId);
            return this;
        }

        public Builder setTableName(@Nullable String tableName) {
            this.tableName = tableName;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetEventGridDataConnectionResult build() {
            return new GetEventGridDataConnectionResult(blobStorageEventType, consumerGroup, dataFormat, eventHubResourceId, id, ignoreFirstRecord, kind, location, mappingRuleName, name, provisioningState, storageAccountResourceId, tableName, type);
        }
    }
}
