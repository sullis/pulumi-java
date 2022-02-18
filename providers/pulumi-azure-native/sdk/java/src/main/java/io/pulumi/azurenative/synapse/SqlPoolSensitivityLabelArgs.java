// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.synapse.enums.SensitivityLabelRank;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SqlPoolSensitivityLabelArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlPoolSensitivityLabelArgs Empty = new SqlPoolSensitivityLabelArgs();

    /**
     * The name of the column.
     * 
     */
    @InputImport(name="columnName", required=true)
    private final Input<String> columnName;

    public Input<String> getColumnName() {
        return this.columnName;
    }

    /**
     * The information type.
     * 
     */
    @InputImport(name="informationType")
    private final @Nullable Input<String> informationType;

    public Input<String> getInformationType() {
        return this.informationType == null ? Input.empty() : this.informationType;
    }

    /**
     * The information type ID.
     * 
     */
    @InputImport(name="informationTypeId")
    private final @Nullable Input<String> informationTypeId;

    public Input<String> getInformationTypeId() {
        return this.informationTypeId == null ? Input.empty() : this.informationTypeId;
    }

    /**
     * The label ID.
     * 
     */
    @InputImport(name="labelId")
    private final @Nullable Input<String> labelId;

    public Input<String> getLabelId() {
        return this.labelId == null ? Input.empty() : this.labelId;
    }

    /**
     * The label name.
     * 
     */
    @InputImport(name="labelName")
    private final @Nullable Input<String> labelName;

    public Input<String> getLabelName() {
        return this.labelName == null ? Input.empty() : this.labelName;
    }

    @InputImport(name="rank")
    private final @Nullable Input<SensitivityLabelRank> rank;

    public Input<SensitivityLabelRank> getRank() {
        return this.rank == null ? Input.empty() : this.rank;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the schema.
     * 
     */
    @InputImport(name="schemaName", required=true)
    private final Input<String> schemaName;

    public Input<String> getSchemaName() {
        return this.schemaName;
    }

    /**
     * The source of the sensitivity label.
     * 
     */
    @InputImport(name="sensitivityLabelSource")
    private final @Nullable Input<String> sensitivityLabelSource;

    public Input<String> getSensitivityLabelSource() {
        return this.sensitivityLabelSource == null ? Input.empty() : this.sensitivityLabelSource;
    }

    /**
     * SQL pool name
     * 
     */
    @InputImport(name="sqlPoolName", required=true)
    private final Input<String> sqlPoolName;

    public Input<String> getSqlPoolName() {
        return this.sqlPoolName;
    }

    /**
     * The name of the table.
     * 
     */
    @InputImport(name="tableName", required=true)
    private final Input<String> tableName;

    public Input<String> getTableName() {
        return this.tableName;
    }

    /**
     * The name of the workspace
     * 
     */
    @InputImport(name="workspaceName", required=true)
    private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public SqlPoolSensitivityLabelArgs(
        Input<String> columnName,
        @Nullable Input<String> informationType,
        @Nullable Input<String> informationTypeId,
        @Nullable Input<String> labelId,
        @Nullable Input<String> labelName,
        @Nullable Input<SensitivityLabelRank> rank,
        Input<String> resourceGroupName,
        Input<String> schemaName,
        @Nullable Input<String> sensitivityLabelSource,
        Input<String> sqlPoolName,
        Input<String> tableName,
        Input<String> workspaceName) {
        this.columnName = Objects.requireNonNull(columnName, "expected parameter 'columnName' to be non-null");
        this.informationType = informationType;
        this.informationTypeId = informationTypeId;
        this.labelId = labelId;
        this.labelName = labelName;
        this.rank = rank;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.schemaName = Objects.requireNonNull(schemaName, "expected parameter 'schemaName' to be non-null");
        this.sensitivityLabelSource = sensitivityLabelSource;
        this.sqlPoolName = Objects.requireNonNull(sqlPoolName, "expected parameter 'sqlPoolName' to be non-null");
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private SqlPoolSensitivityLabelArgs() {
        this.columnName = Input.empty();
        this.informationType = Input.empty();
        this.informationTypeId = Input.empty();
        this.labelId = Input.empty();
        this.labelName = Input.empty();
        this.rank = Input.empty();
        this.resourceGroupName = Input.empty();
        this.schemaName = Input.empty();
        this.sensitivityLabelSource = Input.empty();
        this.sqlPoolName = Input.empty();
        this.tableName = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlPoolSensitivityLabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> columnName;
        private @Nullable Input<String> informationType;
        private @Nullable Input<String> informationTypeId;
        private @Nullable Input<String> labelId;
        private @Nullable Input<String> labelName;
        private @Nullable Input<SensitivityLabelRank> rank;
        private Input<String> resourceGroupName;
        private Input<String> schemaName;
        private @Nullable Input<String> sensitivityLabelSource;
        private Input<String> sqlPoolName;
        private Input<String> tableName;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlPoolSensitivityLabelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnName = defaults.columnName;
    	      this.informationType = defaults.informationType;
    	      this.informationTypeId = defaults.informationTypeId;
    	      this.labelId = defaults.labelId;
    	      this.labelName = defaults.labelName;
    	      this.rank = defaults.rank;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.schemaName = defaults.schemaName;
    	      this.sensitivityLabelSource = defaults.sensitivityLabelSource;
    	      this.sqlPoolName = defaults.sqlPoolName;
    	      this.tableName = defaults.tableName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setColumnName(Input<String> columnName) {
            this.columnName = Objects.requireNonNull(columnName);
            return this;
        }

        public Builder setColumnName(String columnName) {
            this.columnName = Input.of(Objects.requireNonNull(columnName));
            return this;
        }

        public Builder setInformationType(@Nullable Input<String> informationType) {
            this.informationType = informationType;
            return this;
        }

        public Builder setInformationType(@Nullable String informationType) {
            this.informationType = Input.ofNullable(informationType);
            return this;
        }

        public Builder setInformationTypeId(@Nullable Input<String> informationTypeId) {
            this.informationTypeId = informationTypeId;
            return this;
        }

        public Builder setInformationTypeId(@Nullable String informationTypeId) {
            this.informationTypeId = Input.ofNullable(informationTypeId);
            return this;
        }

        public Builder setLabelId(@Nullable Input<String> labelId) {
            this.labelId = labelId;
            return this;
        }

        public Builder setLabelId(@Nullable String labelId) {
            this.labelId = Input.ofNullable(labelId);
            return this;
        }

        public Builder setLabelName(@Nullable Input<String> labelName) {
            this.labelName = labelName;
            return this;
        }

        public Builder setLabelName(@Nullable String labelName) {
            this.labelName = Input.ofNullable(labelName);
            return this;
        }

        public Builder setRank(@Nullable Input<SensitivityLabelRank> rank) {
            this.rank = rank;
            return this;
        }

        public Builder setRank(@Nullable SensitivityLabelRank rank) {
            this.rank = Input.ofNullable(rank);
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

        public Builder setSchemaName(Input<String> schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }

        public Builder setSchemaName(String schemaName) {
            this.schemaName = Input.of(Objects.requireNonNull(schemaName));
            return this;
        }

        public Builder setSensitivityLabelSource(@Nullable Input<String> sensitivityLabelSource) {
            this.sensitivityLabelSource = sensitivityLabelSource;
            return this;
        }

        public Builder setSensitivityLabelSource(@Nullable String sensitivityLabelSource) {
            this.sensitivityLabelSource = Input.ofNullable(sensitivityLabelSource);
            return this;
        }

        public Builder setSqlPoolName(Input<String> sqlPoolName) {
            this.sqlPoolName = Objects.requireNonNull(sqlPoolName);
            return this;
        }

        public Builder setSqlPoolName(String sqlPoolName) {
            this.sqlPoolName = Input.of(Objects.requireNonNull(sqlPoolName));
            return this;
        }

        public Builder setTableName(Input<String> tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public Builder setTableName(String tableName) {
            this.tableName = Input.of(Objects.requireNonNull(tableName));
            return this;
        }

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }

        public SqlPoolSensitivityLabelArgs build() {
            return new SqlPoolSensitivityLabelArgs(columnName, informationType, informationTypeId, labelId, labelName, rank, resourceGroupName, schemaName, sensitivityLabelSource, sqlPoolName, tableName, workspaceName);
        }
    }
}
