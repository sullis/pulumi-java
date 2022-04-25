// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.AzureActiveDirectoryAppResponse;
import com.pulumi.azurenative.datamigration.inputs.FileShareResponse;
import com.pulumi.azurenative.datamigration.inputs.MiSqlConnectionInfoResponse;
import com.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlMIDatabaseInputResponse;
import com.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Input for task that migrates SQL Server databases to Azure SQL Database Managed Instance online scenario.
 * 
 */
public final class ValidateMigrationInputSqlServerSqlMISyncTaskInputResponse extends com.pulumi.resources.InvokeArgs {

    public static final ValidateMigrationInputSqlServerSqlMISyncTaskInputResponse Empty = new ValidateMigrationInputSqlServerSqlMISyncTaskInputResponse();

    /**
     * Azure Active Directory Application the DMS instance will use to connect to the target instance of Azure SQL Database Managed Instance and the Azure Storage Account
     * 
     */
    @Import(name="azureApp", required=true)
    private AzureActiveDirectoryAppResponse azureApp;

    /**
     * @return Azure Active Directory Application the DMS instance will use to connect to the target instance of Azure SQL Database Managed Instance and the Azure Storage Account
     * 
     */
    public AzureActiveDirectoryAppResponse azureApp() {
        return this.azureApp;
    }

    /**
     * Backup file share information for all selected databases.
     * 
     */
    @Import(name="backupFileShare")
    private @Nullable FileShareResponse backupFileShare;

    /**
     * @return Backup file share information for all selected databases.
     * 
     */
    public Optional<FileShareResponse> backupFileShare() {
        return Optional.ofNullable(this.backupFileShare);
    }

    /**
     * Databases to migrate
     * 
     */
    @Import(name="selectedDatabases", required=true)
    private List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases;

    /**
     * @return Databases to migrate
     * 
     */
    public List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases() {
        return this.selectedDatabases;
    }

    /**
     * Connection information for source SQL Server
     * 
     */
    @Import(name="sourceConnectionInfo", required=true)
    private SqlConnectionInfoResponse sourceConnectionInfo;

    /**
     * @return Connection information for source SQL Server
     * 
     */
    public SqlConnectionInfoResponse sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Fully qualified resourceId of storage
     * 
     */
    @Import(name="storageResourceId", required=true)
    private String storageResourceId;

    /**
     * @return Fully qualified resourceId of storage
     * 
     */
    public String storageResourceId() {
        return this.storageResourceId;
    }

    /**
     * Connection information for Azure SQL Database Managed Instance
     * 
     */
    @Import(name="targetConnectionInfo", required=true)
    private MiSqlConnectionInfoResponse targetConnectionInfo;

    /**
     * @return Connection information for Azure SQL Database Managed Instance
     * 
     */
    public MiSqlConnectionInfoResponse targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    private ValidateMigrationInputSqlServerSqlMISyncTaskInputResponse() {}

    private ValidateMigrationInputSqlServerSqlMISyncTaskInputResponse(ValidateMigrationInputSqlServerSqlMISyncTaskInputResponse $) {
        this.azureApp = $.azureApp;
        this.backupFileShare = $.backupFileShare;
        this.selectedDatabases = $.selectedDatabases;
        this.sourceConnectionInfo = $.sourceConnectionInfo;
        this.storageResourceId = $.storageResourceId;
        this.targetConnectionInfo = $.targetConnectionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ValidateMigrationInputSqlServerSqlMISyncTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ValidateMigrationInputSqlServerSqlMISyncTaskInputResponse $;

        public Builder() {
            $ = new ValidateMigrationInputSqlServerSqlMISyncTaskInputResponse();
        }

        public Builder(ValidateMigrationInputSqlServerSqlMISyncTaskInputResponse defaults) {
            $ = new ValidateMigrationInputSqlServerSqlMISyncTaskInputResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param azureApp Azure Active Directory Application the DMS instance will use to connect to the target instance of Azure SQL Database Managed Instance and the Azure Storage Account
         * 
         * @return builder
         * 
         */
        public Builder azureApp(AzureActiveDirectoryAppResponse azureApp) {
            $.azureApp = azureApp;
            return this;
        }

        /**
         * @param backupFileShare Backup file share information for all selected databases.
         * 
         * @return builder
         * 
         */
        public Builder backupFileShare(@Nullable FileShareResponse backupFileShare) {
            $.backupFileShare = backupFileShare;
            return this;
        }

        /**
         * @param selectedDatabases Databases to migrate
         * 
         * @return builder
         * 
         */
        public Builder selectedDatabases(List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases) {
            $.selectedDatabases = selectedDatabases;
            return this;
        }

        /**
         * @param selectedDatabases Databases to migrate
         * 
         * @return builder
         * 
         */
        public Builder selectedDatabases(MigrateSqlServerSqlMIDatabaseInputResponse... selectedDatabases) {
            return selectedDatabases(List.of(selectedDatabases));
        }

        /**
         * @param sourceConnectionInfo Connection information for source SQL Server
         * 
         * @return builder
         * 
         */
        public Builder sourceConnectionInfo(SqlConnectionInfoResponse sourceConnectionInfo) {
            $.sourceConnectionInfo = sourceConnectionInfo;
            return this;
        }

        /**
         * @param storageResourceId Fully qualified resourceId of storage
         * 
         * @return builder
         * 
         */
        public Builder storageResourceId(String storageResourceId) {
            $.storageResourceId = storageResourceId;
            return this;
        }

        /**
         * @param targetConnectionInfo Connection information for Azure SQL Database Managed Instance
         * 
         * @return builder
         * 
         */
        public Builder targetConnectionInfo(MiSqlConnectionInfoResponse targetConnectionInfo) {
            $.targetConnectionInfo = targetConnectionInfo;
            return this;
        }

        public ValidateMigrationInputSqlServerSqlMISyncTaskInputResponse build() {
            $.azureApp = Objects.requireNonNull($.azureApp, "expected parameter 'azureApp' to be non-null");
            $.selectedDatabases = Objects.requireNonNull($.selectedDatabases, "expected parameter 'selectedDatabases' to be non-null");
            $.sourceConnectionInfo = Objects.requireNonNull($.sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
            $.storageResourceId = Objects.requireNonNull($.storageResourceId, "expected parameter 'storageResourceId' to be non-null");
            $.targetConnectionInfo = Objects.requireNonNull($.targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
            return $;
        }
    }

}
