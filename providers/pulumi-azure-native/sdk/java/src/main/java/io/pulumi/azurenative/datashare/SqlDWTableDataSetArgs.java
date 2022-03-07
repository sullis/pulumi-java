// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SqlDWTableDataSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlDWTableDataSetArgs Empty = new SqlDWTableDataSetArgs();

    /**
     * The name of the share account.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the dataSet.
     * 
     */
    @InputImport(name="dataSetName")
      private final @Nullable Input<String> dataSetName;

    public Input<String> getDataSetName() {
        return this.dataSetName == null ? Input.empty() : this.dataSetName;
    }

    /**
     * DataWarehouse name of the source data set
     * 
     */
    @InputImport(name="dataWarehouseName", required=true)
      private final Input<String> dataWarehouseName;

    public Input<String> getDataWarehouseName() {
        return this.dataWarehouseName;
    }

    /**
     * Kind of data set.
     * Expected value is 'SqlDWTable'.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Schema of the table. Default value is dbo.
     * 
     */
    @InputImport(name="schemaName", required=true)
      private final Input<String> schemaName;

    public Input<String> getSchemaName() {
        return this.schemaName;
    }

    /**
     * The name of the share to add the data set to.
     * 
     */
    @InputImport(name="shareName", required=true)
      private final Input<String> shareName;

    public Input<String> getShareName() {
        return this.shareName;
    }

    /**
     * Resource id of SQL server
     * 
     */
    @InputImport(name="sqlServerResourceId", required=true)
      private final Input<String> sqlServerResourceId;

    public Input<String> getSqlServerResourceId() {
        return this.sqlServerResourceId;
    }

    /**
     * SQL DW table name.
     * 
     */
    @InputImport(name="tableName", required=true)
      private final Input<String> tableName;

    public Input<String> getTableName() {
        return this.tableName;
    }

    public SqlDWTableDataSetArgs(
        Input<String> accountName,
        @Nullable Input<String> dataSetName,
        Input<String> dataWarehouseName,
        Input<String> kind,
        Input<String> resourceGroupName,
        Input<String> schemaName,
        Input<String> shareName,
        Input<String> sqlServerResourceId,
        Input<String> tableName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.dataSetName = dataSetName;
        this.dataWarehouseName = Objects.requireNonNull(dataWarehouseName, "expected parameter 'dataWarehouseName' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.schemaName = Objects.requireNonNull(schemaName, "expected parameter 'schemaName' to be non-null");
        this.shareName = Objects.requireNonNull(shareName, "expected parameter 'shareName' to be non-null");
        this.sqlServerResourceId = Objects.requireNonNull(sqlServerResourceId, "expected parameter 'sqlServerResourceId' to be non-null");
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
    }

    private SqlDWTableDataSetArgs() {
        this.accountName = Input.empty();
        this.dataSetName = Input.empty();
        this.dataWarehouseName = Input.empty();
        this.kind = Input.empty();
        this.resourceGroupName = Input.empty();
        this.schemaName = Input.empty();
        this.shareName = Input.empty();
        this.sqlServerResourceId = Input.empty();
        this.tableName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlDWTableDataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<String> dataSetName;
        private Input<String> dataWarehouseName;
        private Input<String> kind;
        private Input<String> resourceGroupName;
        private Input<String> schemaName;
        private Input<String> shareName;
        private Input<String> sqlServerResourceId;
        private Input<String> tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlDWTableDataSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.dataSetName = defaults.dataSetName;
    	      this.dataWarehouseName = defaults.dataWarehouseName;
    	      this.kind = defaults.kind;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.schemaName = defaults.schemaName;
    	      this.shareName = defaults.shareName;
    	      this.sqlServerResourceId = defaults.sqlServerResourceId;
    	      this.tableName = defaults.tableName;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setDataSetName(@Nullable Input<String> dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }

        public Builder setDataSetName(@Nullable String dataSetName) {
            this.dataSetName = Input.ofNullable(dataSetName);
            return this;
        }

        public Builder setDataWarehouseName(Input<String> dataWarehouseName) {
            this.dataWarehouseName = Objects.requireNonNull(dataWarehouseName);
            return this;
        }

        public Builder setDataWarehouseName(String dataWarehouseName) {
            this.dataWarehouseName = Input.of(Objects.requireNonNull(dataWarehouseName));
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

        public Builder setShareName(Input<String> shareName) {
            this.shareName = Objects.requireNonNull(shareName);
            return this;
        }

        public Builder setShareName(String shareName) {
            this.shareName = Input.of(Objects.requireNonNull(shareName));
            return this;
        }

        public Builder setSqlServerResourceId(Input<String> sqlServerResourceId) {
            this.sqlServerResourceId = Objects.requireNonNull(sqlServerResourceId);
            return this;
        }

        public Builder setSqlServerResourceId(String sqlServerResourceId) {
            this.sqlServerResourceId = Input.of(Objects.requireNonNull(sqlServerResourceId));
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
        public SqlDWTableDataSetArgs build() {
            return new SqlDWTableDataSetArgs(accountName, dataSetName, dataWarehouseName, kind, resourceGroupName, schemaName, shareName, sqlServerResourceId, tableName);
        }
    }
}