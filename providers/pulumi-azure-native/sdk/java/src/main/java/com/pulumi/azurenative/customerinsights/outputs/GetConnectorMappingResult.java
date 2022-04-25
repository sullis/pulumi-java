// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.outputs;

import com.pulumi.azurenative.customerinsights.outputs.ConnectorMappingPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetConnectorMappingResult {
    /**
     * @return The connector mapping name
     * 
     */
    private final String connectorMappingName;
    /**
     * @return The connector name.
     * 
     */
    private final String connectorName;
    /**
     * @return Type of connector.
     * 
     */
    private final @Nullable String connectorType;
    /**
     * @return The created time.
     * 
     */
    private final String created;
    /**
     * @return The DataFormat ID.
     * 
     */
    private final String dataFormatId;
    /**
     * @return The description of the connector mapping.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Display name for the connector mapping.
     * 
     */
    private final @Nullable String displayName;
    /**
     * @return Defines which entity type the file should map to.
     * 
     */
    private final String entityType;
    /**
     * @return The mapping entity name.
     * 
     */
    private final String entityTypeName;
    /**
     * @return Resource ID.
     * 
     */
    private final String id;
    /**
     * @return The last modified time.
     * 
     */
    private final String lastModified;
    /**
     * @return The properties of the mapping.
     * 
     */
    private final ConnectorMappingPropertiesResponse mappingProperties;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return The next run time based on customer&#39;s settings.
     * 
     */
    private final String nextRunTime;
    /**
     * @return The RunId.
     * 
     */
    private final String runId;
    /**
     * @return State of connector mapping.
     * 
     */
    private final String state;
    /**
     * @return The hub name.
     * 
     */
    private final String tenantId;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetConnectorMappingResult(
        @CustomType.Parameter("connectorMappingName") String connectorMappingName,
        @CustomType.Parameter("connectorName") String connectorName,
        @CustomType.Parameter("connectorType") @Nullable String connectorType,
        @CustomType.Parameter("created") String created,
        @CustomType.Parameter("dataFormatId") String dataFormatId,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("entityType") String entityType,
        @CustomType.Parameter("entityTypeName") String entityTypeName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastModified") String lastModified,
        @CustomType.Parameter("mappingProperties") ConnectorMappingPropertiesResponse mappingProperties,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nextRunTime") String nextRunTime,
        @CustomType.Parameter("runId") String runId,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("type") String type) {
        this.connectorMappingName = connectorMappingName;
        this.connectorName = connectorName;
        this.connectorType = connectorType;
        this.created = created;
        this.dataFormatId = dataFormatId;
        this.description = description;
        this.displayName = displayName;
        this.entityType = entityType;
        this.entityTypeName = entityTypeName;
        this.id = id;
        this.lastModified = lastModified;
        this.mappingProperties = mappingProperties;
        this.name = name;
        this.nextRunTime = nextRunTime;
        this.runId = runId;
        this.state = state;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * @return The connector mapping name
     * 
     */
    public String connectorMappingName() {
        return this.connectorMappingName;
    }
    /**
     * @return The connector name.
     * 
     */
    public String connectorName() {
        return this.connectorName;
    }
    /**
     * @return Type of connector.
     * 
     */
    public Optional<String> connectorType() {
        return Optional.ofNullable(this.connectorType);
    }
    /**
     * @return The created time.
     * 
     */
    public String created() {
        return this.created;
    }
    /**
     * @return The DataFormat ID.
     * 
     */
    public String dataFormatId() {
        return this.dataFormatId;
    }
    /**
     * @return The description of the connector mapping.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Display name for the connector mapping.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return Defines which entity type the file should map to.
     * 
     */
    public String entityType() {
        return this.entityType;
    }
    /**
     * @return The mapping entity name.
     * 
     */
    public String entityTypeName() {
        return this.entityTypeName;
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The last modified time.
     * 
     */
    public String lastModified() {
        return this.lastModified;
    }
    /**
     * @return The properties of the mapping.
     * 
     */
    public ConnectorMappingPropertiesResponse mappingProperties() {
        return this.mappingProperties;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The next run time based on customer&#39;s settings.
     * 
     */
    public String nextRunTime() {
        return this.nextRunTime;
    }
    /**
     * @return The RunId.
     * 
     */
    public String runId() {
        return this.runId;
    }
    /**
     * @return State of connector mapping.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The hub name.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectorMappingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectorMappingName;
        private String connectorName;
        private @Nullable String connectorType;
        private String created;
        private String dataFormatId;
        private @Nullable String description;
        private @Nullable String displayName;
        private String entityType;
        private String entityTypeName;
        private String id;
        private String lastModified;
        private ConnectorMappingPropertiesResponse mappingProperties;
        private String name;
        private String nextRunTime;
        private String runId;
        private String state;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectorMappingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectorMappingName = defaults.connectorMappingName;
    	      this.connectorName = defaults.connectorName;
    	      this.connectorType = defaults.connectorType;
    	      this.created = defaults.created;
    	      this.dataFormatId = defaults.dataFormatId;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.entityType = defaults.entityType;
    	      this.entityTypeName = defaults.entityTypeName;
    	      this.id = defaults.id;
    	      this.lastModified = defaults.lastModified;
    	      this.mappingProperties = defaults.mappingProperties;
    	      this.name = defaults.name;
    	      this.nextRunTime = defaults.nextRunTime;
    	      this.runId = defaults.runId;
    	      this.state = defaults.state;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder connectorMappingName(String connectorMappingName) {
            this.connectorMappingName = Objects.requireNonNull(connectorMappingName);
            return this;
        }
        public Builder connectorName(String connectorName) {
            this.connectorName = Objects.requireNonNull(connectorName);
            return this;
        }
        public Builder connectorType(@Nullable String connectorType) {
            this.connectorType = connectorType;
            return this;
        }
        public Builder created(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }
        public Builder dataFormatId(String dataFormatId) {
            this.dataFormatId = Objects.requireNonNull(dataFormatId);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder entityType(String entityType) {
            this.entityType = Objects.requireNonNull(entityType);
            return this;
        }
        public Builder entityTypeName(String entityTypeName) {
            this.entityTypeName = Objects.requireNonNull(entityTypeName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }
        public Builder mappingProperties(ConnectorMappingPropertiesResponse mappingProperties) {
            this.mappingProperties = Objects.requireNonNull(mappingProperties);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nextRunTime(String nextRunTime) {
            this.nextRunTime = Objects.requireNonNull(nextRunTime);
            return this;
        }
        public Builder runId(String runId) {
            this.runId = Objects.requireNonNull(runId);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetConnectorMappingResult build() {
            return new GetConnectorMappingResult(connectorMappingName, connectorName, connectorType, created, dataFormatId, description, displayName, entityType, entityTypeName, id, lastModified, mappingProperties, name, nextRunTime, runId, state, tenantId, type);
        }
    }
}
