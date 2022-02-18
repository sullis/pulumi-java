// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.azurenative.customerinsights.outputs.ConnectorMappingPropertiesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetConnectorMappingResult {
    /**
     * The connector mapping name
     * 
     */
    private final String connectorMappingName;
    /**
     * The connector name.
     * 
     */
    private final String connectorName;
    /**
     * Type of connector.
     * 
     */
    private final @Nullable String connectorType;
    /**
     * The created time.
     * 
     */
    private final String created;
    /**
     * The DataFormat ID.
     * 
     */
    private final String dataFormatId;
    /**
     * The description of the connector mapping.
     * 
     */
    private final @Nullable String description;
    /**
     * Display name for the connector mapping.
     * 
     */
    private final @Nullable String displayName;
    /**
     * Defines which entity type the file should map to.
     * 
     */
    private final String entityType;
    /**
     * The mapping entity name.
     * 
     */
    private final String entityTypeName;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * The last modified time.
     * 
     */
    private final String lastModified;
    /**
     * The properties of the mapping.
     * 
     */
    private final ConnectorMappingPropertiesResponse mappingProperties;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The next run time based on customer's settings.
     * 
     */
    private final String nextRunTime;
    /**
     * The RunId.
     * 
     */
    private final String runId;
    /**
     * State of connector mapping.
     * 
     */
    private final String state;
    /**
     * The hub name.
     * 
     */
    private final String tenantId;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"connectorMappingName","connectorName","connectorType","created","dataFormatId","description","displayName","entityType","entityTypeName","id","lastModified","mappingProperties","name","nextRunTime","runId","state","tenantId","type"})
    private GetConnectorMappingResult(
        String connectorMappingName,
        String connectorName,
        @Nullable String connectorType,
        String created,
        String dataFormatId,
        @Nullable String description,
        @Nullable String displayName,
        String entityType,
        String entityTypeName,
        String id,
        String lastModified,
        ConnectorMappingPropertiesResponse mappingProperties,
        String name,
        String nextRunTime,
        String runId,
        String state,
        String tenantId,
        String type) {
        this.connectorMappingName = Objects.requireNonNull(connectorMappingName);
        this.connectorName = Objects.requireNonNull(connectorName);
        this.connectorType = connectorType;
        this.created = Objects.requireNonNull(created);
        this.dataFormatId = Objects.requireNonNull(dataFormatId);
        this.description = description;
        this.displayName = displayName;
        this.entityType = Objects.requireNonNull(entityType);
        this.entityTypeName = Objects.requireNonNull(entityTypeName);
        this.id = Objects.requireNonNull(id);
        this.lastModified = Objects.requireNonNull(lastModified);
        this.mappingProperties = Objects.requireNonNull(mappingProperties);
        this.name = Objects.requireNonNull(name);
        this.nextRunTime = Objects.requireNonNull(nextRunTime);
        this.runId = Objects.requireNonNull(runId);
        this.state = Objects.requireNonNull(state);
        this.tenantId = Objects.requireNonNull(tenantId);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The connector mapping name
     * 
     */
    public String getConnectorMappingName() {
        return this.connectorMappingName;
    }
    /**
     * The connector name.
     * 
     */
    public String getConnectorName() {
        return this.connectorName;
    }
    /**
     * Type of connector.
     * 
     */
    public Optional<String> getConnectorType() {
        return Optional.ofNullable(this.connectorType);
    }
    /**
     * The created time.
     * 
     */
    public String getCreated() {
        return this.created;
    }
    /**
     * The DataFormat ID.
     * 
     */
    public String getDataFormatId() {
        return this.dataFormatId;
    }
    /**
     * The description of the connector mapping.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Display name for the connector mapping.
     * 
     */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * Defines which entity type the file should map to.
     * 
     */
    public String getEntityType() {
        return this.entityType;
    }
    /**
     * The mapping entity name.
     * 
     */
    public String getEntityTypeName() {
        return this.entityTypeName;
    }
    /**
     * Resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The last modified time.
     * 
     */
    public String getLastModified() {
        return this.lastModified;
    }
    /**
     * The properties of the mapping.
     * 
     */
    public ConnectorMappingPropertiesResponse getMappingProperties() {
        return this.mappingProperties;
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The next run time based on customer's settings.
     * 
     */
    public String getNextRunTime() {
        return this.nextRunTime;
    }
    /**
     * The RunId.
     * 
     */
    public String getRunId() {
        return this.runId;
    }
    /**
     * State of connector mapping.
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * The hub name.
     * 
     */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
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

        public Builder setConnectorMappingName(String connectorMappingName) {
            this.connectorMappingName = Objects.requireNonNull(connectorMappingName);
            return this;
        }

        public Builder setConnectorName(String connectorName) {
            this.connectorName = Objects.requireNonNull(connectorName);
            return this;
        }

        public Builder setConnectorType(@Nullable String connectorType) {
            this.connectorType = connectorType;
            return this;
        }

        public Builder setCreated(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }

        public Builder setDataFormatId(String dataFormatId) {
            this.dataFormatId = Objects.requireNonNull(dataFormatId);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setEntityType(String entityType) {
            this.entityType = Objects.requireNonNull(entityType);
            return this;
        }

        public Builder setEntityTypeName(String entityTypeName) {
            this.entityTypeName = Objects.requireNonNull(entityTypeName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }

        public Builder setMappingProperties(ConnectorMappingPropertiesResponse mappingProperties) {
            this.mappingProperties = Objects.requireNonNull(mappingProperties);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNextRunTime(String nextRunTime) {
            this.nextRunTime = Objects.requireNonNull(nextRunTime);
            return this;
        }

        public Builder setRunId(String runId) {
            this.runId = Objects.requireNonNull(runId);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetConnectorMappingResult build() {
            return new GetConnectorMappingResult(connectorMappingName, connectorName, connectorType, created, dataFormatId, description, displayName, entityType, entityTypeName, id, lastModified, mappingProperties, name, nextRunTime, runId, state, tenantId, type);
        }
    }
}
