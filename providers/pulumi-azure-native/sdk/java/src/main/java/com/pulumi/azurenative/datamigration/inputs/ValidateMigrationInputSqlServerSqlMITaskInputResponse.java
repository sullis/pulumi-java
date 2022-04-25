// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.BlobShareResponse;
import com.pulumi.azurenative.datamigration.inputs.FileShareResponse;
import com.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlMIDatabaseInputResponse;
import com.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Input for task that validates migration input for SQL to Azure SQL Managed Instance
 * 
 */
public final class ValidateMigrationInputSqlServerSqlMITaskInputResponse extends com.pulumi.resources.InvokeArgs {

    public static final ValidateMigrationInputSqlServerSqlMITaskInputResponse Empty = new ValidateMigrationInputSqlServerSqlMITaskInputResponse();

    /**
     * SAS URI of Azure Storage Account Container to be used for storing backup files.
     * 
     */
    @Import(name="backupBlobShare", required=true)
    private BlobShareResponse backupBlobShare;

    /**
     * @return SAS URI of Azure Storage Account Container to be used for storing backup files.
     * 
     */
    public BlobShareResponse backupBlobShare() {
        return this.backupBlobShare;
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
     * Backup Mode to specify whether to use existing backup or create new backup.
     * 
     */
    @Import(name="backupMode")
    private @Nullable String backupMode;

    /**
     * @return Backup Mode to specify whether to use existing backup or create new backup.
     * 
     */
    public Optional<String> backupMode() {
        return Optional.ofNullable(this.backupMode);
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
     * Logins to migrate
     * 
     */
    @Import(name="selectedLogins")
    private @Nullable List<String> selectedLogins;

    /**
     * @return Logins to migrate
     * 
     */
    public Optional<List<String>> selectedLogins() {
        return Optional.ofNullable(this.selectedLogins);
    }

    /**
     * Information for connecting to source
     * 
     */
    @Import(name="sourceConnectionInfo", required=true)
    private SqlConnectionInfoResponse sourceConnectionInfo;

    /**
     * @return Information for connecting to source
     * 
     */
    public SqlConnectionInfoResponse sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Information for connecting to target
     * 
     */
    @Import(name="targetConnectionInfo", required=true)
    private SqlConnectionInfoResponse targetConnectionInfo;

    /**
     * @return Information for connecting to target
     * 
     */
    public SqlConnectionInfoResponse targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    private ValidateMigrationInputSqlServerSqlMITaskInputResponse() {}

    private ValidateMigrationInputSqlServerSqlMITaskInputResponse(ValidateMigrationInputSqlServerSqlMITaskInputResponse $) {
        this.backupBlobShare = $.backupBlobShare;
        this.backupFileShare = $.backupFileShare;
        this.backupMode = $.backupMode;
        this.selectedDatabases = $.selectedDatabases;
        this.selectedLogins = $.selectedLogins;
        this.sourceConnectionInfo = $.sourceConnectionInfo;
        this.targetConnectionInfo = $.targetConnectionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ValidateMigrationInputSqlServerSqlMITaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ValidateMigrationInputSqlServerSqlMITaskInputResponse $;

        public Builder() {
            $ = new ValidateMigrationInputSqlServerSqlMITaskInputResponse();
        }

        public Builder(ValidateMigrationInputSqlServerSqlMITaskInputResponse defaults) {
            $ = new ValidateMigrationInputSqlServerSqlMITaskInputResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupBlobShare SAS URI of Azure Storage Account Container to be used for storing backup files.
         * 
         * @return builder
         * 
         */
        public Builder backupBlobShare(BlobShareResponse backupBlobShare) {
            $.backupBlobShare = backupBlobShare;
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
         * @param backupMode Backup Mode to specify whether to use existing backup or create new backup.
         * 
         * @return builder
         * 
         */
        public Builder backupMode(@Nullable String backupMode) {
            $.backupMode = backupMode;
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
         * @param selectedLogins Logins to migrate
         * 
         * @return builder
         * 
         */
        public Builder selectedLogins(@Nullable List<String> selectedLogins) {
            $.selectedLogins = selectedLogins;
            return this;
        }

        /**
         * @param selectedLogins Logins to migrate
         * 
         * @return builder
         * 
         */
        public Builder selectedLogins(String... selectedLogins) {
            return selectedLogins(List.of(selectedLogins));
        }

        /**
         * @param sourceConnectionInfo Information for connecting to source
         * 
         * @return builder
         * 
         */
        public Builder sourceConnectionInfo(SqlConnectionInfoResponse sourceConnectionInfo) {
            $.sourceConnectionInfo = sourceConnectionInfo;
            return this;
        }

        /**
         * @param targetConnectionInfo Information for connecting to target
         * 
         * @return builder
         * 
         */
        public Builder targetConnectionInfo(SqlConnectionInfoResponse targetConnectionInfo) {
            $.targetConnectionInfo = targetConnectionInfo;
            return this;
        }

        public ValidateMigrationInputSqlServerSqlMITaskInputResponse build() {
            $.backupBlobShare = Objects.requireNonNull($.backupBlobShare, "expected parameter 'backupBlobShare' to be non-null");
            $.selectedDatabases = Objects.requireNonNull($.selectedDatabases, "expected parameter 'selectedDatabases' to be non-null");
            $.sourceConnectionInfo = Objects.requireNonNull($.sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
            $.targetConnectionInfo = Objects.requireNonNull($.targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
            return $;
        }
    }

}
