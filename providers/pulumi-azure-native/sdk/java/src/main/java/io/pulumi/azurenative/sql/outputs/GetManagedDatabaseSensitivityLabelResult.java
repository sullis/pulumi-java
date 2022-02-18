// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetManagedDatabaseSensitivityLabelResult {
    /**
     * The column name.
     * 
     */
    private final String columnName;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * The information type.
     * 
     */
    private final @Nullable String informationType;
    /**
     * The information type ID.
     * 
     */
    private final @Nullable String informationTypeId;
    /**
     * Is sensitivity recommendation disabled. Applicable for recommended sensitivity label only. Specifies whether the sensitivity recommendation on this column is disabled (dismissed) or not.
     * 
     */
    private final Boolean isDisabled;
    /**
     * The label ID.
     * 
     */
    private final @Nullable String labelId;
    /**
     * The label name.
     * 
     */
    private final @Nullable String labelName;
    /**
     * Resource that manages the sensitivity label.
     * 
     */
    private final String managedBy;
    /**
     * Resource name.
     * 
     */
    private final String name;
    private final @Nullable String rank;
    /**
     * The schema name.
     * 
     */
    private final String schemaName;
    /**
     * The table name.
     * 
     */
    private final String tableName;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"columnName","id","informationType","informationTypeId","isDisabled","labelId","labelName","managedBy","name","rank","schemaName","tableName","type"})
    private GetManagedDatabaseSensitivityLabelResult(
        String columnName,
        String id,
        @Nullable String informationType,
        @Nullable String informationTypeId,
        Boolean isDisabled,
        @Nullable String labelId,
        @Nullable String labelName,
        String managedBy,
        String name,
        @Nullable String rank,
        String schemaName,
        String tableName,
        String type) {
        this.columnName = Objects.requireNonNull(columnName);
        this.id = Objects.requireNonNull(id);
        this.informationType = informationType;
        this.informationTypeId = informationTypeId;
        this.isDisabled = Objects.requireNonNull(isDisabled);
        this.labelId = labelId;
        this.labelName = labelName;
        this.managedBy = Objects.requireNonNull(managedBy);
        this.name = Objects.requireNonNull(name);
        this.rank = rank;
        this.schemaName = Objects.requireNonNull(schemaName);
        this.tableName = Objects.requireNonNull(tableName);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The column name.
     * 
     */
    public String getColumnName() {
        return this.columnName;
    }
    /**
     * Resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The information type.
     * 
     */
    public Optional<String> getInformationType() {
        return Optional.ofNullable(this.informationType);
    }
    /**
     * The information type ID.
     * 
     */
    public Optional<String> getInformationTypeId() {
        return Optional.ofNullable(this.informationTypeId);
    }
    /**
     * Is sensitivity recommendation disabled. Applicable for recommended sensitivity label only. Specifies whether the sensitivity recommendation on this column is disabled (dismissed) or not.
     * 
     */
    public Boolean getIsDisabled() {
        return this.isDisabled;
    }
    /**
     * The label ID.
     * 
     */
    public Optional<String> getLabelId() {
        return Optional.ofNullable(this.labelId);
    }
    /**
     * The label name.
     * 
     */
    public Optional<String> getLabelName() {
        return Optional.ofNullable(this.labelName);
    }
    /**
     * Resource that manages the sensitivity label.
     * 
     */
    public String getManagedBy() {
        return this.managedBy;
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    public Optional<String> getRank() {
        return Optional.ofNullable(this.rank);
    }
    /**
     * The schema name.
     * 
     */
    public String getSchemaName() {
        return this.schemaName;
    }
    /**
     * The table name.
     * 
     */
    public String getTableName() {
        return this.tableName;
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

    public static Builder builder(GetManagedDatabaseSensitivityLabelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String columnName;
        private String id;
        private @Nullable String informationType;
        private @Nullable String informationTypeId;
        private Boolean isDisabled;
        private @Nullable String labelId;
        private @Nullable String labelName;
        private String managedBy;
        private String name;
        private @Nullable String rank;
        private String schemaName;
        private String tableName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedDatabaseSensitivityLabelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnName = defaults.columnName;
    	      this.id = defaults.id;
    	      this.informationType = defaults.informationType;
    	      this.informationTypeId = defaults.informationTypeId;
    	      this.isDisabled = defaults.isDisabled;
    	      this.labelId = defaults.labelId;
    	      this.labelName = defaults.labelName;
    	      this.managedBy = defaults.managedBy;
    	      this.name = defaults.name;
    	      this.rank = defaults.rank;
    	      this.schemaName = defaults.schemaName;
    	      this.tableName = defaults.tableName;
    	      this.type = defaults.type;
        }

        public Builder setColumnName(String columnName) {
            this.columnName = Objects.requireNonNull(columnName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInformationType(@Nullable String informationType) {
            this.informationType = informationType;
            return this;
        }

        public Builder setInformationTypeId(@Nullable String informationTypeId) {
            this.informationTypeId = informationTypeId;
            return this;
        }

        public Builder setIsDisabled(Boolean isDisabled) {
            this.isDisabled = Objects.requireNonNull(isDisabled);
            return this;
        }

        public Builder setLabelId(@Nullable String labelId) {
            this.labelId = labelId;
            return this;
        }

        public Builder setLabelName(@Nullable String labelName) {
            this.labelName = labelName;
            return this;
        }

        public Builder setManagedBy(String managedBy) {
            this.managedBy = Objects.requireNonNull(managedBy);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRank(@Nullable String rank) {
            this.rank = rank;
            return this;
        }

        public Builder setSchemaName(String schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }

        public Builder setTableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetManagedDatabaseSensitivityLabelResult build() {
            return new GetManagedDatabaseSensitivityLabelResult(columnName, id, informationType, informationTypeId, isDisabled, labelId, labelName, managedBy, name, rank, schemaName, tableName, type);
        }
    }
}
