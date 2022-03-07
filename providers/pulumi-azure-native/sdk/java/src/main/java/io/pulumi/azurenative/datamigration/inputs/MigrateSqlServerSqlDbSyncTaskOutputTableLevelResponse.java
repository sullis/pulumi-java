// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class MigrateSqlServerSqlDbSyncTaskOutputTableLevelResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrateSqlServerSqlDbSyncTaskOutputTableLevelResponse Empty = new MigrateSqlServerSqlDbSyncTaskOutputTableLevelResponse();

    /**
     * Number of applied deletes
     * 
     */
    @InputImport(name="cdcDeleteCounter", required=true)
      private final Double cdcDeleteCounter;

    public Double getCdcDeleteCounter() {
        return this.cdcDeleteCounter;
    }

    /**
     * Number of applied inserts
     * 
     */
    @InputImport(name="cdcInsertCounter", required=true)
      private final Double cdcInsertCounter;

    public Double getCdcInsertCounter() {
        return this.cdcInsertCounter;
    }

    /**
     * Number of applied updates
     * 
     */
    @InputImport(name="cdcUpdateCounter", required=true)
      private final Double cdcUpdateCounter;

    public Double getCdcUpdateCounter() {
        return this.cdcUpdateCounter;
    }

    /**
     * Number of data errors occurred
     * 
     */
    @InputImport(name="dataErrorsCounter", required=true)
      private final Double dataErrorsCounter;

    public Double getDataErrorsCounter() {
        return this.dataErrorsCounter;
    }

    /**
     * Name of the database
     * 
     */
    @InputImport(name="databaseName", required=true)
      private final String databaseName;

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * Full load end time
     * 
     */
    @InputImport(name="fullLoadEndedOn", required=true)
      private final String fullLoadEndedOn;

    public String getFullLoadEndedOn() {
        return this.fullLoadEndedOn;
    }

    /**
     * Estimate to finish full load
     * 
     */
    @InputImport(name="fullLoadEstFinishTime", required=true)
      private final String fullLoadEstFinishTime;

    public String getFullLoadEstFinishTime() {
        return this.fullLoadEstFinishTime;
    }

    /**
     * Full load start time
     * 
     */
    @InputImport(name="fullLoadStartedOn", required=true)
      private final String fullLoadStartedOn;

    public String getFullLoadStartedOn() {
        return this.fullLoadStartedOn;
    }

    /**
     * Number of rows applied in full load
     * 
     */
    @InputImport(name="fullLoadTotalRows", required=true)
      private final Double fullLoadTotalRows;

    public Double getFullLoadTotalRows() {
        return this.fullLoadTotalRows;
    }

    /**
     * Result identifier
     * 
     */
    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Last modified time on target
     * 
     */
    @InputImport(name="lastModifiedTime", required=true)
      private final String lastModifiedTime;

    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Result type
     * Expected value is 'TableLevelOutput'.
     * 
     */
    @InputImport(name="resultType", required=true)
      private final String resultType;

    public String getResultType() {
        return this.resultType;
    }

    /**
     * Current state of the table migration
     * 
     */
    @InputImport(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    /**
     * Name of the table
     * 
     */
    @InputImport(name="tableName", required=true)
      private final String tableName;

    public String getTableName() {
        return this.tableName;
    }

    /**
     * Total number of applied changes
     * 
     */
    @InputImport(name="totalChangesApplied", required=true)
      private final Double totalChangesApplied;

    public Double getTotalChangesApplied() {
        return this.totalChangesApplied;
    }

    public MigrateSqlServerSqlDbSyncTaskOutputTableLevelResponse(
        Double cdcDeleteCounter,
        Double cdcInsertCounter,
        Double cdcUpdateCounter,
        Double dataErrorsCounter,
        String databaseName,
        String fullLoadEndedOn,
        String fullLoadEstFinishTime,
        String fullLoadStartedOn,
        Double fullLoadTotalRows,
        String id,
        String lastModifiedTime,
        String resultType,
        String state,
        String tableName,
        Double totalChangesApplied) {
        this.cdcDeleteCounter = Objects.requireNonNull(cdcDeleteCounter, "expected parameter 'cdcDeleteCounter' to be non-null");
        this.cdcInsertCounter = Objects.requireNonNull(cdcInsertCounter, "expected parameter 'cdcInsertCounter' to be non-null");
        this.cdcUpdateCounter = Objects.requireNonNull(cdcUpdateCounter, "expected parameter 'cdcUpdateCounter' to be non-null");
        this.dataErrorsCounter = Objects.requireNonNull(dataErrorsCounter, "expected parameter 'dataErrorsCounter' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.fullLoadEndedOn = Objects.requireNonNull(fullLoadEndedOn, "expected parameter 'fullLoadEndedOn' to be non-null");
        this.fullLoadEstFinishTime = Objects.requireNonNull(fullLoadEstFinishTime, "expected parameter 'fullLoadEstFinishTime' to be non-null");
        this.fullLoadStartedOn = Objects.requireNonNull(fullLoadStartedOn, "expected parameter 'fullLoadStartedOn' to be non-null");
        this.fullLoadTotalRows = Objects.requireNonNull(fullLoadTotalRows, "expected parameter 'fullLoadTotalRows' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime, "expected parameter 'lastModifiedTime' to be non-null");
        this.resultType = Objects.requireNonNull(resultType, "expected parameter 'resultType' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
        this.totalChangesApplied = Objects.requireNonNull(totalChangesApplied, "expected parameter 'totalChangesApplied' to be non-null");
    }

    private MigrateSqlServerSqlDbSyncTaskOutputTableLevelResponse() {
        this.cdcDeleteCounter = null;
        this.cdcInsertCounter = null;
        this.cdcUpdateCounter = null;
        this.dataErrorsCounter = null;
        this.databaseName = null;
        this.fullLoadEndedOn = null;
        this.fullLoadEstFinishTime = null;
        this.fullLoadStartedOn = null;
        this.fullLoadTotalRows = null;
        this.id = null;
        this.lastModifiedTime = null;
        this.resultType = null;
        this.state = null;
        this.tableName = null;
        this.totalChangesApplied = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlDbSyncTaskOutputTableLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double cdcDeleteCounter;
        private Double cdcInsertCounter;
        private Double cdcUpdateCounter;
        private Double dataErrorsCounter;
        private String databaseName;
        private String fullLoadEndedOn;
        private String fullLoadEstFinishTime;
        private String fullLoadStartedOn;
        private Double fullLoadTotalRows;
        private String id;
        private String lastModifiedTime;
        private String resultType;
        private String state;
        private String tableName;
        private Double totalChangesApplied;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlDbSyncTaskOutputTableLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cdcDeleteCounter = defaults.cdcDeleteCounter;
    	      this.cdcInsertCounter = defaults.cdcInsertCounter;
    	      this.cdcUpdateCounter = defaults.cdcUpdateCounter;
    	      this.dataErrorsCounter = defaults.dataErrorsCounter;
    	      this.databaseName = defaults.databaseName;
    	      this.fullLoadEndedOn = defaults.fullLoadEndedOn;
    	      this.fullLoadEstFinishTime = defaults.fullLoadEstFinishTime;
    	      this.fullLoadStartedOn = defaults.fullLoadStartedOn;
    	      this.fullLoadTotalRows = defaults.fullLoadTotalRows;
    	      this.id = defaults.id;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.resultType = defaults.resultType;
    	      this.state = defaults.state;
    	      this.tableName = defaults.tableName;
    	      this.totalChangesApplied = defaults.totalChangesApplied;
        }

        public Builder setCdcDeleteCounter(Double cdcDeleteCounter) {
            this.cdcDeleteCounter = Objects.requireNonNull(cdcDeleteCounter);
            return this;
        }

        public Builder setCdcInsertCounter(Double cdcInsertCounter) {
            this.cdcInsertCounter = Objects.requireNonNull(cdcInsertCounter);
            return this;
        }

        public Builder setCdcUpdateCounter(Double cdcUpdateCounter) {
            this.cdcUpdateCounter = Objects.requireNonNull(cdcUpdateCounter);
            return this;
        }

        public Builder setDataErrorsCounter(Double dataErrorsCounter) {
            this.dataErrorsCounter = Objects.requireNonNull(dataErrorsCounter);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setFullLoadEndedOn(String fullLoadEndedOn) {
            this.fullLoadEndedOn = Objects.requireNonNull(fullLoadEndedOn);
            return this;
        }

        public Builder setFullLoadEstFinishTime(String fullLoadEstFinishTime) {
            this.fullLoadEstFinishTime = Objects.requireNonNull(fullLoadEstFinishTime);
            return this;
        }

        public Builder setFullLoadStartedOn(String fullLoadStartedOn) {
            this.fullLoadStartedOn = Objects.requireNonNull(fullLoadStartedOn);
            return this;
        }

        public Builder setFullLoadTotalRows(Double fullLoadTotalRows) {
            this.fullLoadTotalRows = Objects.requireNonNull(fullLoadTotalRows);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }

        public Builder setResultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setTableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public Builder setTotalChangesApplied(Double totalChangesApplied) {
            this.totalChangesApplied = Objects.requireNonNull(totalChangesApplied);
            return this;
        }
        public MigrateSqlServerSqlDbSyncTaskOutputTableLevelResponse build() {
            return new MigrateSqlServerSqlDbSyncTaskOutputTableLevelResponse(cdcDeleteCounter, cdcInsertCounter, cdcUpdateCounter, dataErrorsCounter, databaseName, fullLoadEndedOn, fullLoadEstFinishTime, fullLoadStartedOn, fullLoadTotalRows, id, lastModifiedTime, resultType, state, tableName, totalChangesApplied);
        }
    }
}