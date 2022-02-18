// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlDbDatabaseInputResponse;
import io.pulumi.azurenative.datamigration.inputs.MigrationValidationOptionsResponse;
import io.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Input for the task that migrates on-prem SQL Server databases to Azure SQL Database
 * 
 */
public final class MigrateSqlServerSqlDbTaskInputResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrateSqlServerSqlDbTaskInputResponse Empty = new MigrateSqlServerSqlDbTaskInputResponse();

    /**
     * Databases to migrate
     * 
     */
    @InputImport(name="selectedDatabases", required=true)
    private final List<MigrateSqlServerSqlDbDatabaseInputResponse> selectedDatabases;

    public List<MigrateSqlServerSqlDbDatabaseInputResponse> getSelectedDatabases() {
        return this.selectedDatabases;
    }

    /**
     * Information for connecting to source
     * 
     */
    @InputImport(name="sourceConnectionInfo", required=true)
    private final SqlConnectionInfoResponse sourceConnectionInfo;

    public SqlConnectionInfoResponse getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Information for connecting to target
     * 
     */
    @InputImport(name="targetConnectionInfo", required=true)
    private final SqlConnectionInfoResponse targetConnectionInfo;

    public SqlConnectionInfoResponse getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    /**
     * Options for enabling various post migration validations. Available options,
     *  1.) Data Integrity Check: Performs a checksum based comparison on source and target tables after the migration to ensure the correctness of the data.
     *  2.) Schema Validation: Performs a thorough schema comparison between the source and target tables and provides a list of differences between the source and target database, 3.) Query Analysis: Executes a set of queries picked up automatically either from the Query Plan Cache or Query Store and execute them and compares the execution time between the source and target database.
     * 
     */
    @InputImport(name="validationOptions")
    private final @Nullable MigrationValidationOptionsResponse validationOptions;

    public Optional<MigrationValidationOptionsResponse> getValidationOptions() {
        return this.validationOptions == null ? Optional.empty() : Optional.ofNullable(this.validationOptions);
    }

    public MigrateSqlServerSqlDbTaskInputResponse(
        List<MigrateSqlServerSqlDbDatabaseInputResponse> selectedDatabases,
        SqlConnectionInfoResponse sourceConnectionInfo,
        SqlConnectionInfoResponse targetConnectionInfo,
        @Nullable MigrationValidationOptionsResponse validationOptions) {
        this.selectedDatabases = Objects.requireNonNull(selectedDatabases, "expected parameter 'selectedDatabases' to be non-null");
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
        this.validationOptions = validationOptions;
    }

    private MigrateSqlServerSqlDbTaskInputResponse() {
        this.selectedDatabases = List.of();
        this.sourceConnectionInfo = null;
        this.targetConnectionInfo = null;
        this.validationOptions = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlDbTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MigrateSqlServerSqlDbDatabaseInputResponse> selectedDatabases;
        private SqlConnectionInfoResponse sourceConnectionInfo;
        private SqlConnectionInfoResponse targetConnectionInfo;
        private @Nullable MigrationValidationOptionsResponse validationOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlDbTaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selectedDatabases = defaults.selectedDatabases;
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
    	      this.validationOptions = defaults.validationOptions;
        }

        public Builder setSelectedDatabases(List<MigrateSqlServerSqlDbDatabaseInputResponse> selectedDatabases) {
            this.selectedDatabases = Objects.requireNonNull(selectedDatabases);
            return this;
        }

        public Builder setSourceConnectionInfo(SqlConnectionInfoResponse sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }

        public Builder setTargetConnectionInfo(SqlConnectionInfoResponse targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }

        public Builder setValidationOptions(@Nullable MigrationValidationOptionsResponse validationOptions) {
            this.validationOptions = validationOptions;
            return this;
        }

        public MigrateSqlServerSqlDbTaskInputResponse build() {
            return new MigrateSqlServerSqlDbTaskInputResponse(selectedDatabases, sourceConnectionInfo, targetConnectionInfo, validationOptions);
        }
    }
}
