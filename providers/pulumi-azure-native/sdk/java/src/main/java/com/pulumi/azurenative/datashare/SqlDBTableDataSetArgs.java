// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlDBTableDataSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlDBTableDataSetArgs Empty = new SqlDBTableDataSetArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The name of the share account.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The name of the dataSet.
     * 
     */
    @Import(name="dataSetName")
    private @Nullable Output<String> dataSetName;

    /**
     * @return The name of the dataSet.
     * 
     */
    public Optional<Output<String>> dataSetName() {
        return Optional.ofNullable(this.dataSetName);
    }

    /**
     * Database name of the source data set
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return Database name of the source data set
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * Kind of data set.
     * Expected value is &#39;SqlDBTable&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return Kind of data set.
     * Expected value is &#39;SqlDBTable&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Schema of the table. Default value is dbo.
     * 
     */
    @Import(name="schemaName", required=true)
    private Output<String> schemaName;

    /**
     * @return Schema of the table. Default value is dbo.
     * 
     */
    public Output<String> schemaName() {
        return this.schemaName;
    }

    /**
     * The name of the share to add the data set to.
     * 
     */
    @Import(name="shareName", required=true)
    private Output<String> shareName;

    /**
     * @return The name of the share to add the data set to.
     * 
     */
    public Output<String> shareName() {
        return this.shareName;
    }

    /**
     * Resource id of SQL server
     * 
     */
    @Import(name="sqlServerResourceId", required=true)
    private Output<String> sqlServerResourceId;

    /**
     * @return Resource id of SQL server
     * 
     */
    public Output<String> sqlServerResourceId() {
        return this.sqlServerResourceId;
    }

    /**
     * SQL DB table name.
     * 
     */
    @Import(name="tableName", required=true)
    private Output<String> tableName;

    /**
     * @return SQL DB table name.
     * 
     */
    public Output<String> tableName() {
        return this.tableName;
    }

    private SqlDBTableDataSetArgs() {}

    private SqlDBTableDataSetArgs(SqlDBTableDataSetArgs $) {
        this.accountName = $.accountName;
        this.dataSetName = $.dataSetName;
        this.databaseName = $.databaseName;
        this.kind = $.kind;
        this.resourceGroupName = $.resourceGroupName;
        this.schemaName = $.schemaName;
        this.shareName = $.shareName;
        this.sqlServerResourceId = $.sqlServerResourceId;
        this.tableName = $.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlDBTableDataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlDBTableDataSetArgs $;

        public Builder() {
            $ = new SqlDBTableDataSetArgs();
        }

        public Builder(SqlDBTableDataSetArgs defaults) {
            $ = new SqlDBTableDataSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the share account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the share account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param dataSetName The name of the dataSet.
         * 
         * @return builder
         * 
         */
        public Builder dataSetName(@Nullable Output<String> dataSetName) {
            $.dataSetName = dataSetName;
            return this;
        }

        /**
         * @param dataSetName The name of the dataSet.
         * 
         * @return builder
         * 
         */
        public Builder dataSetName(String dataSetName) {
            return dataSetName(Output.of(dataSetName));
        }

        /**
         * @param databaseName Database name of the source data set
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName Database name of the source data set
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param kind Kind of data set.
         * Expected value is &#39;SqlDBTable&#39;.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind of data set.
         * Expected value is &#39;SqlDBTable&#39;.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param schemaName Schema of the table. Default value is dbo.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(Output<String> schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        /**
         * @param schemaName Schema of the table. Default value is dbo.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(String schemaName) {
            return schemaName(Output.of(schemaName));
        }

        /**
         * @param shareName The name of the share to add the data set to.
         * 
         * @return builder
         * 
         */
        public Builder shareName(Output<String> shareName) {
            $.shareName = shareName;
            return this;
        }

        /**
         * @param shareName The name of the share to add the data set to.
         * 
         * @return builder
         * 
         */
        public Builder shareName(String shareName) {
            return shareName(Output.of(shareName));
        }

        /**
         * @param sqlServerResourceId Resource id of SQL server
         * 
         * @return builder
         * 
         */
        public Builder sqlServerResourceId(Output<String> sqlServerResourceId) {
            $.sqlServerResourceId = sqlServerResourceId;
            return this;
        }

        /**
         * @param sqlServerResourceId Resource id of SQL server
         * 
         * @return builder
         * 
         */
        public Builder sqlServerResourceId(String sqlServerResourceId) {
            return sqlServerResourceId(Output.of(sqlServerResourceId));
        }

        /**
         * @param tableName SQL DB table name.
         * 
         * @return builder
         * 
         */
        public Builder tableName(Output<String> tableName) {
            $.tableName = tableName;
            return this;
        }

        /**
         * @param tableName SQL DB table name.
         * 
         * @return builder
         * 
         */
        public Builder tableName(String tableName) {
            return tableName(Output.of(tableName));
        }

        public SqlDBTableDataSetArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.kind = Codegen.stringProp("kind").output().arg($.kind).require();
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.schemaName = Objects.requireNonNull($.schemaName, "expected parameter 'schemaName' to be non-null");
            $.shareName = Objects.requireNonNull($.shareName, "expected parameter 'shareName' to be non-null");
            $.sqlServerResourceId = Objects.requireNonNull($.sqlServerResourceId, "expected parameter 'sqlServerResourceId' to be non-null");
            $.tableName = Objects.requireNonNull($.tableName, "expected parameter 'tableName' to be non-null");
            return $;
        }
    }

}
