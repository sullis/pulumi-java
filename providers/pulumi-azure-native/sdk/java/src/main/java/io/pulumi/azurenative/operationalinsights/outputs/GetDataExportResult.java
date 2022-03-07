// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDataExportResult {
    /**
     * The latest data export rule modification time.
     * 
     */
    private final @Nullable String createdDate;
    /**
     * The data export rule ID.
     * 
     */
    private final @Nullable String dataExportId;
    /**
     * Active when enabled.
     * 
     */
    private final @Nullable Boolean enable;
    /**
     * Optional. Allows to define an Event Hub name. Not applicable when destination is Storage Account.
     * 
     */
    private final @Nullable String eventHubName;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Date and time when the export was last modified.
     * 
     */
    private final @Nullable String lastModifiedDate;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The destination resource ID. This can be copied from the Properties entry of the destination resource in Azure.
     * 
     */
    private final String resourceId;
    /**
     * An array of tables to export, for example: [“Heartbeat, SecurityEvent”].
     * 
     */
    private final List<String> tableNames;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"createdDate","dataExportId","enable","eventHubName","id","lastModifiedDate","name","resourceId","tableNames","type"})
    private GetDataExportResult(
        @Nullable String createdDate,
        @Nullable String dataExportId,
        @Nullable Boolean enable,
        @Nullable String eventHubName,
        String id,
        @Nullable String lastModifiedDate,
        String name,
        String resourceId,
        List<String> tableNames,
        String type) {
        this.createdDate = createdDate;
        this.dataExportId = dataExportId;
        this.enable = enable;
        this.eventHubName = eventHubName;
        this.id = Objects.requireNonNull(id);
        this.lastModifiedDate = lastModifiedDate;
        this.name = Objects.requireNonNull(name);
        this.resourceId = Objects.requireNonNull(resourceId);
        this.tableNames = Objects.requireNonNull(tableNames);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The latest data export rule modification time.
     * 
    */
    public Optional<String> getCreatedDate() {
        return Optional.ofNullable(this.createdDate);
    }
    /**
     * The data export rule ID.
     * 
    */
    public Optional<String> getDataExportId() {
        return Optional.ofNullable(this.dataExportId);
    }
    /**
     * Active when enabled.
     * 
    */
    public Optional<Boolean> getEnable() {
        return Optional.ofNullable(this.enable);
    }
    /**
     * Optional. Allows to define an Event Hub name. Not applicable when destination is Storage Account.
     * 
    */
    public Optional<String> getEventHubName() {
        return Optional.ofNullable(this.eventHubName);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Date and time when the export was last modified.
     * 
    */
    public Optional<String> getLastModifiedDate() {
        return Optional.ofNullable(this.lastModifiedDate);
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The destination resource ID. This can be copied from the Properties entry of the destination resource in Azure.
     * 
    */
    public String getResourceId() {
        return this.resourceId;
    }
    /**
     * An array of tables to export, for example: [“Heartbeat, SecurityEvent”].
     * 
    */
    public List<String> getTableNames() {
        return this.tableNames;
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

    public static Builder builder(GetDataExportResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String createdDate;
        private @Nullable String dataExportId;
        private @Nullable Boolean enable;
        private @Nullable String eventHubName;
        private String id;
        private @Nullable String lastModifiedDate;
        private String name;
        private String resourceId;
        private List<String> tableNames;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataExportResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdDate = defaults.createdDate;
    	      this.dataExportId = defaults.dataExportId;
    	      this.enable = defaults.enable;
    	      this.eventHubName = defaults.eventHubName;
    	      this.id = defaults.id;
    	      this.lastModifiedDate = defaults.lastModifiedDate;
    	      this.name = defaults.name;
    	      this.resourceId = defaults.resourceId;
    	      this.tableNames = defaults.tableNames;
    	      this.type = defaults.type;
        }

        public Builder setCreatedDate(@Nullable String createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public Builder setDataExportId(@Nullable String dataExportId) {
            this.dataExportId = dataExportId;
            return this;
        }

        public Builder setEnable(@Nullable Boolean enable) {
            this.enable = enable;
            return this;
        }

        public Builder setEventHubName(@Nullable String eventHubName) {
            this.eventHubName = eventHubName;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastModifiedDate(@Nullable String lastModifiedDate) {
            this.lastModifiedDate = lastModifiedDate;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setTableNames(List<String> tableNames) {
            this.tableNames = Objects.requireNonNull(tableNames);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetDataExportResult build() {
            return new GetDataExportResult(createdDate, dataExportId, enable, eventHubName, id, lastModifiedDate, name, resourceId, tableNames, type);
        }
    }
}