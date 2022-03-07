// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIotHubDataConnectionResult {
    /**
     * The iot hub consumer group.
     * 
     */
    private final String consumerGroup;
    /**
     * The data format of the message. Optionally the data format can be added to each message.
     * 
     */
    private final @Nullable String dataFormat;
    /**
     * System properties of the iot hub
     * 
     */
    private final @Nullable List<String> eventSystemProperties;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The resource ID of the Iot hub to be used to create a data connection.
     * 
     */
    private final String iotHubResourceId;
    /**
     * Kind of the endpoint for the data connection
     * Expected value is 'IotHub'.
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
     * The name of the share access policy
     * 
     */
    private final String sharedAccessPolicyName;
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

    @OutputCustomType.Constructor({"consumerGroup","dataFormat","eventSystemProperties","id","iotHubResourceId","kind","location","mappingRuleName","name","provisioningState","sharedAccessPolicyName","tableName","type"})
    private GetIotHubDataConnectionResult(
        String consumerGroup,
        @Nullable String dataFormat,
        @Nullable List<String> eventSystemProperties,
        String id,
        String iotHubResourceId,
        String kind,
        @Nullable String location,
        @Nullable String mappingRuleName,
        String name,
        String provisioningState,
        String sharedAccessPolicyName,
        @Nullable String tableName,
        String type) {
        this.consumerGroup = Objects.requireNonNull(consumerGroup);
        this.dataFormat = dataFormat;
        this.eventSystemProperties = eventSystemProperties;
        this.id = Objects.requireNonNull(id);
        this.iotHubResourceId = Objects.requireNonNull(iotHubResourceId);
        this.kind = Objects.requireNonNull(kind);
        this.location = location;
        this.mappingRuleName = mappingRuleName;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.sharedAccessPolicyName = Objects.requireNonNull(sharedAccessPolicyName);
        this.tableName = tableName;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The iot hub consumer group.
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
     * System properties of the iot hub
     * 
    */
    public List<String> getEventSystemProperties() {
        return this.eventSystemProperties == null ? List.of() : this.eventSystemProperties;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The resource ID of the Iot hub to be used to create a data connection.
     * 
    */
    public String getIotHubResourceId() {
        return this.iotHubResourceId;
    }
    /**
     * Kind of the endpoint for the data connection
     * Expected value is 'IotHub'.
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
     * The name of the share access policy
     * 
    */
    public String getSharedAccessPolicyName() {
        return this.sharedAccessPolicyName;
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

    public static Builder builder(GetIotHubDataConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String consumerGroup;
        private @Nullable String dataFormat;
        private @Nullable List<String> eventSystemProperties;
        private String id;
        private String iotHubResourceId;
        private String kind;
        private @Nullable String location;
        private @Nullable String mappingRuleName;
        private String name;
        private String provisioningState;
        private String sharedAccessPolicyName;
        private @Nullable String tableName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIotHubDataConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerGroup = defaults.consumerGroup;
    	      this.dataFormat = defaults.dataFormat;
    	      this.eventSystemProperties = defaults.eventSystemProperties;
    	      this.id = defaults.id;
    	      this.iotHubResourceId = defaults.iotHubResourceId;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.mappingRuleName = defaults.mappingRuleName;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sharedAccessPolicyName = defaults.sharedAccessPolicyName;
    	      this.tableName = defaults.tableName;
    	      this.type = defaults.type;
        }

        public Builder setConsumerGroup(String consumerGroup) {
            this.consumerGroup = Objects.requireNonNull(consumerGroup);
            return this;
        }

        public Builder setDataFormat(@Nullable String dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }

        public Builder setEventSystemProperties(@Nullable List<String> eventSystemProperties) {
            this.eventSystemProperties = eventSystemProperties;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIotHubResourceId(String iotHubResourceId) {
            this.iotHubResourceId = Objects.requireNonNull(iotHubResourceId);
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

        public Builder setSharedAccessPolicyName(String sharedAccessPolicyName) {
            this.sharedAccessPolicyName = Objects.requireNonNull(sharedAccessPolicyName);
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
        public GetIotHubDataConnectionResult build() {
            return new GetIotHubDataConnectionResult(consumerGroup, dataFormat, eventSystemProperties, id, iotHubResourceId, kind, location, mappingRuleName, name, provisioningState, sharedAccessPolicyName, tableName, type);
        }
    }
}