// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.DatabaseSummaryResultResponse;
import com.pulumi.azurenative.datamigration.inputs.MigrationReportResultResponse;
import com.pulumi.azurenative.datamigration.inputs.ReportableExceptionResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Migration level result for Sql server to Azure Sql DB migration.
 * 
 */
public final class MigrateSqlServerSqlDbTaskOutputMigrationLevelResponse extends com.pulumi.resources.InvokeArgs {

    public static final MigrateSqlServerSqlDbTaskOutputMigrationLevelResponse Empty = new MigrateSqlServerSqlDbTaskOutputMigrationLevelResponse();

    /**
     * Summary of database results in the migration
     * 
     */
    @Import(name="databaseSummary", required=true)
      private final Map<String,DatabaseSummaryResultResponse> databaseSummary;

    public Map<String,DatabaseSummaryResultResponse> databaseSummary() {
        return this.databaseSummary;
    }

    /**
     * Selected databases as a map from database name to database id
     * 
     */
    @Import(name="databases", required=true)
      private final Map<String,String> databases;

    public Map<String,String> databases() {
        return this.databases;
    }

    /**
     * Duration of task execution in seconds.
     * 
     */
    @Import(name="durationInSeconds", required=true)
      private final Double durationInSeconds;

    public Double durationInSeconds() {
        return this.durationInSeconds;
    }

    /**
     * Migration end time
     * 
     */
    @Import(name="endedOn", required=true)
      private final String endedOn;

    public String endedOn() {
        return this.endedOn;
    }

    /**
     * Migration exceptions and warnings.
     * 
     */
    @Import(name="exceptionsAndWarnings", required=true)
      private final List<ReportableExceptionResponse> exceptionsAndWarnings;

    public List<ReportableExceptionResponse> exceptionsAndWarnings() {
        return this.exceptionsAndWarnings;
    }

    /**
     * Result identifier
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * Migration progress message
     * 
     */
    @Import(name="message", required=true)
      private final String message;

    public String message() {
        return this.message;
    }

    /**
     * Migration Report Result, provides unique url for downloading your migration report.
     * 
     */
    @Import(name="migrationReport", required=true)
      private final MigrationReportResultResponse migrationReport;

    public MigrationReportResultResponse migrationReport() {
        return this.migrationReport;
    }

    /**
     * Result type
     * Expected value is 'MigrationLevelOutput'.
     * 
     */
    @Import(name="resultType", required=true)
      private final String resultType;

    public String resultType() {
        return this.resultType;
    }

    /**
     * Source server brand version
     * 
     */
    @Import(name="sourceServerBrandVersion", required=true)
      private final String sourceServerBrandVersion;

    public String sourceServerBrandVersion() {
        return this.sourceServerBrandVersion;
    }

    /**
     * Source server version
     * 
     */
    @Import(name="sourceServerVersion", required=true)
      private final String sourceServerVersion;

    public String sourceServerVersion() {
        return this.sourceServerVersion;
    }

    /**
     * Migration start time
     * 
     */
    @Import(name="startedOn", required=true)
      private final String startedOn;

    public String startedOn() {
        return this.startedOn;
    }

    /**
     * Current status of migration
     * 
     */
    @Import(name="status", required=true)
      private final String status;

    public String status() {
        return this.status;
    }

    /**
     * Migration status message
     * 
     */
    @Import(name="statusMessage", required=true)
      private final String statusMessage;

    public String statusMessage() {
        return this.statusMessage;
    }

    /**
     * Target server brand version
     * 
     */
    @Import(name="targetServerBrandVersion", required=true)
      private final String targetServerBrandVersion;

    public String targetServerBrandVersion() {
        return this.targetServerBrandVersion;
    }

    /**
     * Target server version
     * 
     */
    @Import(name="targetServerVersion", required=true)
      private final String targetServerVersion;

    public String targetServerVersion() {
        return this.targetServerVersion;
    }

    public MigrateSqlServerSqlDbTaskOutputMigrationLevelResponse(
        Map<String,DatabaseSummaryResultResponse> databaseSummary,
        Map<String,String> databases,
        Double durationInSeconds,
        String endedOn,
        List<ReportableExceptionResponse> exceptionsAndWarnings,
        String id,
        String message,
        MigrationReportResultResponse migrationReport,
        String resultType,
        String sourceServerBrandVersion,
        String sourceServerVersion,
        String startedOn,
        String status,
        String statusMessage,
        String targetServerBrandVersion,
        String targetServerVersion) {
        this.databaseSummary = Objects.requireNonNull(databaseSummary, "expected parameter 'databaseSummary' to be non-null");
        this.databases = Objects.requireNonNull(databases, "expected parameter 'databases' to be non-null");
        this.durationInSeconds = Objects.requireNonNull(durationInSeconds, "expected parameter 'durationInSeconds' to be non-null");
        this.endedOn = Objects.requireNonNull(endedOn, "expected parameter 'endedOn' to be non-null");
        this.exceptionsAndWarnings = Objects.requireNonNull(exceptionsAndWarnings, "expected parameter 'exceptionsAndWarnings' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.migrationReport = Objects.requireNonNull(migrationReport, "expected parameter 'migrationReport' to be non-null");
        this.resultType = Codegen.stringProp("resultType").arg(resultType).require();
        this.sourceServerBrandVersion = Objects.requireNonNull(sourceServerBrandVersion, "expected parameter 'sourceServerBrandVersion' to be non-null");
        this.sourceServerVersion = Objects.requireNonNull(sourceServerVersion, "expected parameter 'sourceServerVersion' to be non-null");
        this.startedOn = Objects.requireNonNull(startedOn, "expected parameter 'startedOn' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.statusMessage = Objects.requireNonNull(statusMessage, "expected parameter 'statusMessage' to be non-null");
        this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion, "expected parameter 'targetServerBrandVersion' to be non-null");
        this.targetServerVersion = Objects.requireNonNull(targetServerVersion, "expected parameter 'targetServerVersion' to be non-null");
    }

    private MigrateSqlServerSqlDbTaskOutputMigrationLevelResponse() {
        this.databaseSummary = Map.of();
        this.databases = Map.of();
        this.durationInSeconds = null;
        this.endedOn = null;
        this.exceptionsAndWarnings = List.of();
        this.id = null;
        this.message = null;
        this.migrationReport = null;
        this.resultType = null;
        this.sourceServerBrandVersion = null;
        this.sourceServerVersion = null;
        this.startedOn = null;
        this.status = null;
        this.statusMessage = null;
        this.targetServerBrandVersion = null;
        this.targetServerVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlDbTaskOutputMigrationLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,DatabaseSummaryResultResponse> databaseSummary;
        private Map<String,String> databases;
        private Double durationInSeconds;
        private String endedOn;
        private List<ReportableExceptionResponse> exceptionsAndWarnings;
        private String id;
        private String message;
        private MigrationReportResultResponse migrationReport;
        private String resultType;
        private String sourceServerBrandVersion;
        private String sourceServerVersion;
        private String startedOn;
        private String status;
        private String statusMessage;
        private String targetServerBrandVersion;
        private String targetServerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlDbTaskOutputMigrationLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseSummary = defaults.databaseSummary;
    	      this.databases = defaults.databases;
    	      this.durationInSeconds = defaults.durationInSeconds;
    	      this.endedOn = defaults.endedOn;
    	      this.exceptionsAndWarnings = defaults.exceptionsAndWarnings;
    	      this.id = defaults.id;
    	      this.message = defaults.message;
    	      this.migrationReport = defaults.migrationReport;
    	      this.resultType = defaults.resultType;
    	      this.sourceServerBrandVersion = defaults.sourceServerBrandVersion;
    	      this.sourceServerVersion = defaults.sourceServerVersion;
    	      this.startedOn = defaults.startedOn;
    	      this.status = defaults.status;
    	      this.statusMessage = defaults.statusMessage;
    	      this.targetServerBrandVersion = defaults.targetServerBrandVersion;
    	      this.targetServerVersion = defaults.targetServerVersion;
        }

        public Builder databaseSummary(Map<String,DatabaseSummaryResultResponse> databaseSummary) {
            this.databaseSummary = Objects.requireNonNull(databaseSummary);
            return this;
        }
        public Builder databases(Map<String,String> databases) {
            this.databases = Objects.requireNonNull(databases);
            return this;
        }
        public Builder durationInSeconds(Double durationInSeconds) {
            this.durationInSeconds = Objects.requireNonNull(durationInSeconds);
            return this;
        }
        public Builder endedOn(String endedOn) {
            this.endedOn = Objects.requireNonNull(endedOn);
            return this;
        }
        public Builder exceptionsAndWarnings(List<ReportableExceptionResponse> exceptionsAndWarnings) {
            this.exceptionsAndWarnings = Objects.requireNonNull(exceptionsAndWarnings);
            return this;
        }
        public Builder exceptionsAndWarnings(ReportableExceptionResponse... exceptionsAndWarnings) {
            return exceptionsAndWarnings(List.of(exceptionsAndWarnings));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder migrationReport(MigrationReportResultResponse migrationReport) {
            this.migrationReport = Objects.requireNonNull(migrationReport);
            return this;
        }
        public Builder resultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }
        public Builder sourceServerBrandVersion(String sourceServerBrandVersion) {
            this.sourceServerBrandVersion = Objects.requireNonNull(sourceServerBrandVersion);
            return this;
        }
        public Builder sourceServerVersion(String sourceServerVersion) {
            this.sourceServerVersion = Objects.requireNonNull(sourceServerVersion);
            return this;
        }
        public Builder startedOn(String startedOn) {
            this.startedOn = Objects.requireNonNull(startedOn);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder statusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }
        public Builder targetServerBrandVersion(String targetServerBrandVersion) {
            this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion);
            return this;
        }
        public Builder targetServerVersion(String targetServerVersion) {
            this.targetServerVersion = Objects.requireNonNull(targetServerVersion);
            return this;
        }        public MigrateSqlServerSqlDbTaskOutputMigrationLevelResponse build() {
            return new MigrateSqlServerSqlDbTaskOutputMigrationLevelResponse(databaseSummary, databases, durationInSeconds, endedOn, exceptionsAndWarnings, id, message, migrationReport, resultType, sourceServerBrandVersion, sourceServerVersion, startedOn, status, statusMessage, targetServerBrandVersion, targetServerVersion);
        }
    }
}
