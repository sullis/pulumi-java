// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.bigquery_v2.outputs.BiEngineStatisticsResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.BigQueryModelTrainingResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.DatasetReferenceResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.DmlStatisticsResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.ExplainQueryStageResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.JobStatistics2ReservationUsageItemResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.MlStatisticsResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.QueryParameterResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.QueryTimelineSampleResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.RoutineReferenceResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.RowAccessPolicyReferenceResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.TableReferenceResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.TableSchemaResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class JobStatistics2Response {
    /**
     * BI Engine specific Statistics. [Output-only] BI Engine specific Statistics.
     * 
     */
    private final BiEngineStatisticsResponse biEngineStatistics;
    /**
     * Billing tier for the job.
     * 
     */
    private final Integer billingTier;
    /**
     * Whether the query result was fetched from the query cache.
     * 
     */
    private final Boolean cacheHit;
    /**
     * [Preview] The number of row access policies affected by a DDL statement. Present only for DROP ALL ROW ACCESS POLICIES queries.
     * 
     */
    private final String ddlAffectedRowAccessPolicyCount;
    /**
     * The DDL destination table. Present only for ALTER TABLE RENAME TO queries. Note that ddl_target_table is used just for its type information.
     * 
     */
    private final TableReferenceResponse ddlDestinationTable;
    /**
     * The DDL operation performed, possibly dependent on the pre-existence of the DDL target. Possible values (new values might be added in the future): "CREATE": The query created the DDL target. "SKIP": No-op. Example cases: the query is CREATE TABLE IF NOT EXISTS while the table already exists, or the query is DROP TABLE IF EXISTS while the table does not exist. "REPLACE": The query replaced the DDL target. Example case: the query is CREATE OR REPLACE TABLE, and the table already exists. "DROP": The query deleted the DDL target.
     * 
     */
    private final String ddlOperationPerformed;
    /**
     * The DDL target dataset. Present only for CREATE/ALTER/DROP SCHEMA queries.
     * 
     */
    private final DatasetReferenceResponse ddlTargetDataset;
    /**
     * The DDL target routine. Present only for CREATE/DROP FUNCTION/PROCEDURE queries.
     * 
     */
    private final RoutineReferenceResponse ddlTargetRoutine;
    /**
     * [Preview] The DDL target row access policy. Present only for CREATE/DROP ROW ACCESS POLICY queries.
     * 
     */
    private final RowAccessPolicyReferenceResponse ddlTargetRowAccessPolicy;
    /**
     * The DDL target table. Present only for CREATE/DROP TABLE/VIEW and DROP ALL ROW ACCESS POLICIES queries.
     * 
     */
    private final TableReferenceResponse ddlTargetTable;
    /**
     * Detailed statistics for DML statements Present only for DML statements INSERT, UPDATE, DELETE or TRUNCATE.
     * 
     */
    private final DmlStatisticsResponse dmlStats;
    /**
     * The original estimate of bytes processed for the job.
     * 
     */
    private final String estimatedBytesProcessed;
    /**
     * Statistics of a BigQuery ML training job.
     * 
     */
    private final MlStatisticsResponse mlStatistics;
    /**
     * [Output-only, Beta] Information about create model query job progress.
     * 
     */
    private final BigQueryModelTrainingResponse modelTraining;
    /**
     * The number of rows affected by a DML statement. Present only for DML statements INSERT, UPDATE or DELETE.
     * 
     */
    private final String numDmlAffectedRows;
    /**
     * Describes execution plan for the query.
     * 
     */
    private final List<ExplainQueryStageResponse> queryPlan;
    /**
     * Referenced routines (persistent user-defined functions and stored procedures) for the job.
     * 
     */
    private final List<RoutineReferenceResponse> referencedRoutines;
    /**
     * Referenced tables for the job. Queries that reference more than 50 tables will not have a complete list.
     * 
     */
    private final List<TableReferenceResponse> referencedTables;
    /**
     * Job resource usage breakdown by reservation.
     * 
     */
    private final List<JobStatistics2ReservationUsageItemResponse> reservationUsage;
    /**
     * The schema of the results. Present only for successful dry run of non-legacy SQL queries.
     * 
     */
    private final TableSchemaResponse schema;
    /**
     * The type of query statement, if valid. Possible values (new values might be added in the future): "SELECT": SELECT query. "INSERT": INSERT query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. "UPDATE": UPDATE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. "DELETE": DELETE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. "MERGE": MERGE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. "ALTER_TABLE": ALTER TABLE query. "ALTER_VIEW": ALTER VIEW query. "ASSERT": ASSERT condition AS 'description'. "CREATE_FUNCTION": CREATE FUNCTION query. "CREATE_MODEL": CREATE [OR REPLACE] MODEL ... AS SELECT ... . "CREATE_PROCEDURE": CREATE PROCEDURE query. "CREATE_TABLE": CREATE [OR REPLACE] TABLE without AS SELECT. "CREATE_TABLE_AS_SELECT": CREATE [OR REPLACE] TABLE ... AS SELECT ... . "CREATE_VIEW": CREATE [OR REPLACE] VIEW ... AS SELECT ... . "DROP_FUNCTION" : DROP FUNCTION query. "DROP_PROCEDURE": DROP PROCEDURE query. "DROP_TABLE": DROP TABLE query. "DROP_VIEW": DROP VIEW query.
     * 
     */
    private final String statementType;
    /**
     * [Beta] Describes a timeline of job execution.
     * 
     */
    private final List<QueryTimelineSampleResponse> timeline;
    /**
     * Total bytes billed for the job.
     * 
     */
    private final String totalBytesBilled;
    /**
     * Total bytes processed for the job.
     * 
     */
    private final String totalBytesProcessed;
    /**
     * For dry-run jobs, totalBytesProcessed is an estimate and this field specifies the accuracy of the estimate. Possible values can be: UNKNOWN: accuracy of the estimate is unknown. PRECISE: estimate is precise. LOWER_BOUND: estimate is lower bound of what the query would cost. UPPER_BOUND: estimate is upper bound of what the query would cost.
     * 
     */
    private final String totalBytesProcessedAccuracy;
    /**
     * Total number of partitions processed from all partitioned tables referenced in the job.
     * 
     */
    private final String totalPartitionsProcessed;
    /**
     * Slot-milliseconds for the job.
     * 
     */
    private final String totalSlotMs;
    /**
     * Standard SQL only: list of undeclared query parameters detected during a dry run validation.
     * 
     */
    private final List<QueryParameterResponse> undeclaredQueryParameters;

    @OutputCustomType.Constructor({"biEngineStatistics","billingTier","cacheHit","ddlAffectedRowAccessPolicyCount","ddlDestinationTable","ddlOperationPerformed","ddlTargetDataset","ddlTargetRoutine","ddlTargetRowAccessPolicy","ddlTargetTable","dmlStats","estimatedBytesProcessed","mlStatistics","modelTraining","numDmlAffectedRows","queryPlan","referencedRoutines","referencedTables","reservationUsage","schema","statementType","timeline","totalBytesBilled","totalBytesProcessed","totalBytesProcessedAccuracy","totalPartitionsProcessed","totalSlotMs","undeclaredQueryParameters"})
    private JobStatistics2Response(
        BiEngineStatisticsResponse biEngineStatistics,
        Integer billingTier,
        Boolean cacheHit,
        String ddlAffectedRowAccessPolicyCount,
        TableReferenceResponse ddlDestinationTable,
        String ddlOperationPerformed,
        DatasetReferenceResponse ddlTargetDataset,
        RoutineReferenceResponse ddlTargetRoutine,
        RowAccessPolicyReferenceResponse ddlTargetRowAccessPolicy,
        TableReferenceResponse ddlTargetTable,
        DmlStatisticsResponse dmlStats,
        String estimatedBytesProcessed,
        MlStatisticsResponse mlStatistics,
        BigQueryModelTrainingResponse modelTraining,
        String numDmlAffectedRows,
        List<ExplainQueryStageResponse> queryPlan,
        List<RoutineReferenceResponse> referencedRoutines,
        List<TableReferenceResponse> referencedTables,
        List<JobStatistics2ReservationUsageItemResponse> reservationUsage,
        TableSchemaResponse schema,
        String statementType,
        List<QueryTimelineSampleResponse> timeline,
        String totalBytesBilled,
        String totalBytesProcessed,
        String totalBytesProcessedAccuracy,
        String totalPartitionsProcessed,
        String totalSlotMs,
        List<QueryParameterResponse> undeclaredQueryParameters) {
        this.biEngineStatistics = Objects.requireNonNull(biEngineStatistics);
        this.billingTier = Objects.requireNonNull(billingTier);
        this.cacheHit = Objects.requireNonNull(cacheHit);
        this.ddlAffectedRowAccessPolicyCount = Objects.requireNonNull(ddlAffectedRowAccessPolicyCount);
        this.ddlDestinationTable = Objects.requireNonNull(ddlDestinationTable);
        this.ddlOperationPerformed = Objects.requireNonNull(ddlOperationPerformed);
        this.ddlTargetDataset = Objects.requireNonNull(ddlTargetDataset);
        this.ddlTargetRoutine = Objects.requireNonNull(ddlTargetRoutine);
        this.ddlTargetRowAccessPolicy = Objects.requireNonNull(ddlTargetRowAccessPolicy);
        this.ddlTargetTable = Objects.requireNonNull(ddlTargetTable);
        this.dmlStats = Objects.requireNonNull(dmlStats);
        this.estimatedBytesProcessed = Objects.requireNonNull(estimatedBytesProcessed);
        this.mlStatistics = Objects.requireNonNull(mlStatistics);
        this.modelTraining = Objects.requireNonNull(modelTraining);
        this.numDmlAffectedRows = Objects.requireNonNull(numDmlAffectedRows);
        this.queryPlan = Objects.requireNonNull(queryPlan);
        this.referencedRoutines = Objects.requireNonNull(referencedRoutines);
        this.referencedTables = Objects.requireNonNull(referencedTables);
        this.reservationUsage = Objects.requireNonNull(reservationUsage);
        this.schema = Objects.requireNonNull(schema);
        this.statementType = Objects.requireNonNull(statementType);
        this.timeline = Objects.requireNonNull(timeline);
        this.totalBytesBilled = Objects.requireNonNull(totalBytesBilled);
        this.totalBytesProcessed = Objects.requireNonNull(totalBytesProcessed);
        this.totalBytesProcessedAccuracy = Objects.requireNonNull(totalBytesProcessedAccuracy);
        this.totalPartitionsProcessed = Objects.requireNonNull(totalPartitionsProcessed);
        this.totalSlotMs = Objects.requireNonNull(totalSlotMs);
        this.undeclaredQueryParameters = Objects.requireNonNull(undeclaredQueryParameters);
    }

    /**
     * BI Engine specific Statistics. [Output-only] BI Engine specific Statistics.
     * 
    */
    public BiEngineStatisticsResponse getBiEngineStatistics() {
        return this.biEngineStatistics;
    }
    /**
     * Billing tier for the job.
     * 
    */
    public Integer getBillingTier() {
        return this.billingTier;
    }
    /**
     * Whether the query result was fetched from the query cache.
     * 
    */
    public Boolean getCacheHit() {
        return this.cacheHit;
    }
    /**
     * [Preview] The number of row access policies affected by a DDL statement. Present only for DROP ALL ROW ACCESS POLICIES queries.
     * 
    */
    public String getDdlAffectedRowAccessPolicyCount() {
        return this.ddlAffectedRowAccessPolicyCount;
    }
    /**
     * The DDL destination table. Present only for ALTER TABLE RENAME TO queries. Note that ddl_target_table is used just for its type information.
     * 
    */
    public TableReferenceResponse getDdlDestinationTable() {
        return this.ddlDestinationTable;
    }
    /**
     * The DDL operation performed, possibly dependent on the pre-existence of the DDL target. Possible values (new values might be added in the future): "CREATE": The query created the DDL target. "SKIP": No-op. Example cases: the query is CREATE TABLE IF NOT EXISTS while the table already exists, or the query is DROP TABLE IF EXISTS while the table does not exist. "REPLACE": The query replaced the DDL target. Example case: the query is CREATE OR REPLACE TABLE, and the table already exists. "DROP": The query deleted the DDL target.
     * 
    */
    public String getDdlOperationPerformed() {
        return this.ddlOperationPerformed;
    }
    /**
     * The DDL target dataset. Present only for CREATE/ALTER/DROP SCHEMA queries.
     * 
    */
    public DatasetReferenceResponse getDdlTargetDataset() {
        return this.ddlTargetDataset;
    }
    /**
     * The DDL target routine. Present only for CREATE/DROP FUNCTION/PROCEDURE queries.
     * 
    */
    public RoutineReferenceResponse getDdlTargetRoutine() {
        return this.ddlTargetRoutine;
    }
    /**
     * [Preview] The DDL target row access policy. Present only for CREATE/DROP ROW ACCESS POLICY queries.
     * 
    */
    public RowAccessPolicyReferenceResponse getDdlTargetRowAccessPolicy() {
        return this.ddlTargetRowAccessPolicy;
    }
    /**
     * The DDL target table. Present only for CREATE/DROP TABLE/VIEW and DROP ALL ROW ACCESS POLICIES queries.
     * 
    */
    public TableReferenceResponse getDdlTargetTable() {
        return this.ddlTargetTable;
    }
    /**
     * Detailed statistics for DML statements Present only for DML statements INSERT, UPDATE, DELETE or TRUNCATE.
     * 
    */
    public DmlStatisticsResponse getDmlStats() {
        return this.dmlStats;
    }
    /**
     * The original estimate of bytes processed for the job.
     * 
    */
    public String getEstimatedBytesProcessed() {
        return this.estimatedBytesProcessed;
    }
    /**
     * Statistics of a BigQuery ML training job.
     * 
    */
    public MlStatisticsResponse getMlStatistics() {
        return this.mlStatistics;
    }
    /**
     * [Output-only, Beta] Information about create model query job progress.
     * 
    */
    public BigQueryModelTrainingResponse getModelTraining() {
        return this.modelTraining;
    }
    /**
     * The number of rows affected by a DML statement. Present only for DML statements INSERT, UPDATE or DELETE.
     * 
    */
    public String getNumDmlAffectedRows() {
        return this.numDmlAffectedRows;
    }
    /**
     * Describes execution plan for the query.
     * 
    */
    public List<ExplainQueryStageResponse> getQueryPlan() {
        return this.queryPlan;
    }
    /**
     * Referenced routines (persistent user-defined functions and stored procedures) for the job.
     * 
    */
    public List<RoutineReferenceResponse> getReferencedRoutines() {
        return this.referencedRoutines;
    }
    /**
     * Referenced tables for the job. Queries that reference more than 50 tables will not have a complete list.
     * 
    */
    public List<TableReferenceResponse> getReferencedTables() {
        return this.referencedTables;
    }
    /**
     * Job resource usage breakdown by reservation.
     * 
    */
    public List<JobStatistics2ReservationUsageItemResponse> getReservationUsage() {
        return this.reservationUsage;
    }
    /**
     * The schema of the results. Present only for successful dry run of non-legacy SQL queries.
     * 
    */
    public TableSchemaResponse getSchema() {
        return this.schema;
    }
    /**
     * The type of query statement, if valid. Possible values (new values might be added in the future): "SELECT": SELECT query. "INSERT": INSERT query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. "UPDATE": UPDATE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. "DELETE": DELETE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. "MERGE": MERGE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. "ALTER_TABLE": ALTER TABLE query. "ALTER_VIEW": ALTER VIEW query. "ASSERT": ASSERT condition AS 'description'. "CREATE_FUNCTION": CREATE FUNCTION query. "CREATE_MODEL": CREATE [OR REPLACE] MODEL ... AS SELECT ... . "CREATE_PROCEDURE": CREATE PROCEDURE query. "CREATE_TABLE": CREATE [OR REPLACE] TABLE without AS SELECT. "CREATE_TABLE_AS_SELECT": CREATE [OR REPLACE] TABLE ... AS SELECT ... . "CREATE_VIEW": CREATE [OR REPLACE] VIEW ... AS SELECT ... . "DROP_FUNCTION" : DROP FUNCTION query. "DROP_PROCEDURE": DROP PROCEDURE query. "DROP_TABLE": DROP TABLE query. "DROP_VIEW": DROP VIEW query.
     * 
    */
    public String getStatementType() {
        return this.statementType;
    }
    /**
     * [Beta] Describes a timeline of job execution.
     * 
    */
    public List<QueryTimelineSampleResponse> getTimeline() {
        return this.timeline;
    }
    /**
     * Total bytes billed for the job.
     * 
    */
    public String getTotalBytesBilled() {
        return this.totalBytesBilled;
    }
    /**
     * Total bytes processed for the job.
     * 
    */
    public String getTotalBytesProcessed() {
        return this.totalBytesProcessed;
    }
    /**
     * For dry-run jobs, totalBytesProcessed is an estimate and this field specifies the accuracy of the estimate. Possible values can be: UNKNOWN: accuracy of the estimate is unknown. PRECISE: estimate is precise. LOWER_BOUND: estimate is lower bound of what the query would cost. UPPER_BOUND: estimate is upper bound of what the query would cost.
     * 
    */
    public String getTotalBytesProcessedAccuracy() {
        return this.totalBytesProcessedAccuracy;
    }
    /**
     * Total number of partitions processed from all partitioned tables referenced in the job.
     * 
    */
    public String getTotalPartitionsProcessed() {
        return this.totalPartitionsProcessed;
    }
    /**
     * Slot-milliseconds for the job.
     * 
    */
    public String getTotalSlotMs() {
        return this.totalSlotMs;
    }
    /**
     * Standard SQL only: list of undeclared query parameters detected during a dry run validation.
     * 
    */
    public List<QueryParameterResponse> getUndeclaredQueryParameters() {
        return this.undeclaredQueryParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatistics2Response defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BiEngineStatisticsResponse biEngineStatistics;
        private Integer billingTier;
        private Boolean cacheHit;
        private String ddlAffectedRowAccessPolicyCount;
        private TableReferenceResponse ddlDestinationTable;
        private String ddlOperationPerformed;
        private DatasetReferenceResponse ddlTargetDataset;
        private RoutineReferenceResponse ddlTargetRoutine;
        private RowAccessPolicyReferenceResponse ddlTargetRowAccessPolicy;
        private TableReferenceResponse ddlTargetTable;
        private DmlStatisticsResponse dmlStats;
        private String estimatedBytesProcessed;
        private MlStatisticsResponse mlStatistics;
        private BigQueryModelTrainingResponse modelTraining;
        private String numDmlAffectedRows;
        private List<ExplainQueryStageResponse> queryPlan;
        private List<RoutineReferenceResponse> referencedRoutines;
        private List<TableReferenceResponse> referencedTables;
        private List<JobStatistics2ReservationUsageItemResponse> reservationUsage;
        private TableSchemaResponse schema;
        private String statementType;
        private List<QueryTimelineSampleResponse> timeline;
        private String totalBytesBilled;
        private String totalBytesProcessed;
        private String totalBytesProcessedAccuracy;
        private String totalPartitionsProcessed;
        private String totalSlotMs;
        private List<QueryParameterResponse> undeclaredQueryParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatistics2Response defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.biEngineStatistics = defaults.biEngineStatistics;
    	      this.billingTier = defaults.billingTier;
    	      this.cacheHit = defaults.cacheHit;
    	      this.ddlAffectedRowAccessPolicyCount = defaults.ddlAffectedRowAccessPolicyCount;
    	      this.ddlDestinationTable = defaults.ddlDestinationTable;
    	      this.ddlOperationPerformed = defaults.ddlOperationPerformed;
    	      this.ddlTargetDataset = defaults.ddlTargetDataset;
    	      this.ddlTargetRoutine = defaults.ddlTargetRoutine;
    	      this.ddlTargetRowAccessPolicy = defaults.ddlTargetRowAccessPolicy;
    	      this.ddlTargetTable = defaults.ddlTargetTable;
    	      this.dmlStats = defaults.dmlStats;
    	      this.estimatedBytesProcessed = defaults.estimatedBytesProcessed;
    	      this.mlStatistics = defaults.mlStatistics;
    	      this.modelTraining = defaults.modelTraining;
    	      this.numDmlAffectedRows = defaults.numDmlAffectedRows;
    	      this.queryPlan = defaults.queryPlan;
    	      this.referencedRoutines = defaults.referencedRoutines;
    	      this.referencedTables = defaults.referencedTables;
    	      this.reservationUsage = defaults.reservationUsage;
    	      this.schema = defaults.schema;
    	      this.statementType = defaults.statementType;
    	      this.timeline = defaults.timeline;
    	      this.totalBytesBilled = defaults.totalBytesBilled;
    	      this.totalBytesProcessed = defaults.totalBytesProcessed;
    	      this.totalBytesProcessedAccuracy = defaults.totalBytesProcessedAccuracy;
    	      this.totalPartitionsProcessed = defaults.totalPartitionsProcessed;
    	      this.totalSlotMs = defaults.totalSlotMs;
    	      this.undeclaredQueryParameters = defaults.undeclaredQueryParameters;
        }

        public Builder setBiEngineStatistics(BiEngineStatisticsResponse biEngineStatistics) {
            this.biEngineStatistics = Objects.requireNonNull(biEngineStatistics);
            return this;
        }

        public Builder setBillingTier(Integer billingTier) {
            this.billingTier = Objects.requireNonNull(billingTier);
            return this;
        }

        public Builder setCacheHit(Boolean cacheHit) {
            this.cacheHit = Objects.requireNonNull(cacheHit);
            return this;
        }

        public Builder setDdlAffectedRowAccessPolicyCount(String ddlAffectedRowAccessPolicyCount) {
            this.ddlAffectedRowAccessPolicyCount = Objects.requireNonNull(ddlAffectedRowAccessPolicyCount);
            return this;
        }

        public Builder setDdlDestinationTable(TableReferenceResponse ddlDestinationTable) {
            this.ddlDestinationTable = Objects.requireNonNull(ddlDestinationTable);
            return this;
        }

        public Builder setDdlOperationPerformed(String ddlOperationPerformed) {
            this.ddlOperationPerformed = Objects.requireNonNull(ddlOperationPerformed);
            return this;
        }

        public Builder setDdlTargetDataset(DatasetReferenceResponse ddlTargetDataset) {
            this.ddlTargetDataset = Objects.requireNonNull(ddlTargetDataset);
            return this;
        }

        public Builder setDdlTargetRoutine(RoutineReferenceResponse ddlTargetRoutine) {
            this.ddlTargetRoutine = Objects.requireNonNull(ddlTargetRoutine);
            return this;
        }

        public Builder setDdlTargetRowAccessPolicy(RowAccessPolicyReferenceResponse ddlTargetRowAccessPolicy) {
            this.ddlTargetRowAccessPolicy = Objects.requireNonNull(ddlTargetRowAccessPolicy);
            return this;
        }

        public Builder setDdlTargetTable(TableReferenceResponse ddlTargetTable) {
            this.ddlTargetTable = Objects.requireNonNull(ddlTargetTable);
            return this;
        }

        public Builder setDmlStats(DmlStatisticsResponse dmlStats) {
            this.dmlStats = Objects.requireNonNull(dmlStats);
            return this;
        }

        public Builder setEstimatedBytesProcessed(String estimatedBytesProcessed) {
            this.estimatedBytesProcessed = Objects.requireNonNull(estimatedBytesProcessed);
            return this;
        }

        public Builder setMlStatistics(MlStatisticsResponse mlStatistics) {
            this.mlStatistics = Objects.requireNonNull(mlStatistics);
            return this;
        }

        public Builder setModelTraining(BigQueryModelTrainingResponse modelTraining) {
            this.modelTraining = Objects.requireNonNull(modelTraining);
            return this;
        }

        public Builder setNumDmlAffectedRows(String numDmlAffectedRows) {
            this.numDmlAffectedRows = Objects.requireNonNull(numDmlAffectedRows);
            return this;
        }

        public Builder setQueryPlan(List<ExplainQueryStageResponse> queryPlan) {
            this.queryPlan = Objects.requireNonNull(queryPlan);
            return this;
        }

        public Builder setReferencedRoutines(List<RoutineReferenceResponse> referencedRoutines) {
            this.referencedRoutines = Objects.requireNonNull(referencedRoutines);
            return this;
        }

        public Builder setReferencedTables(List<TableReferenceResponse> referencedTables) {
            this.referencedTables = Objects.requireNonNull(referencedTables);
            return this;
        }

        public Builder setReservationUsage(List<JobStatistics2ReservationUsageItemResponse> reservationUsage) {
            this.reservationUsage = Objects.requireNonNull(reservationUsage);
            return this;
        }

        public Builder setSchema(TableSchemaResponse schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }

        public Builder setStatementType(String statementType) {
            this.statementType = Objects.requireNonNull(statementType);
            return this;
        }

        public Builder setTimeline(List<QueryTimelineSampleResponse> timeline) {
            this.timeline = Objects.requireNonNull(timeline);
            return this;
        }

        public Builder setTotalBytesBilled(String totalBytesBilled) {
            this.totalBytesBilled = Objects.requireNonNull(totalBytesBilled);
            return this;
        }

        public Builder setTotalBytesProcessed(String totalBytesProcessed) {
            this.totalBytesProcessed = Objects.requireNonNull(totalBytesProcessed);
            return this;
        }

        public Builder setTotalBytesProcessedAccuracy(String totalBytesProcessedAccuracy) {
            this.totalBytesProcessedAccuracy = Objects.requireNonNull(totalBytesProcessedAccuracy);
            return this;
        }

        public Builder setTotalPartitionsProcessed(String totalPartitionsProcessed) {
            this.totalPartitionsProcessed = Objects.requireNonNull(totalPartitionsProcessed);
            return this;
        }

        public Builder setTotalSlotMs(String totalSlotMs) {
            this.totalSlotMs = Objects.requireNonNull(totalSlotMs);
            return this;
        }

        public Builder setUndeclaredQueryParameters(List<QueryParameterResponse> undeclaredQueryParameters) {
            this.undeclaredQueryParameters = Objects.requireNonNull(undeclaredQueryParameters);
            return this;
        }
        public JobStatistics2Response build() {
            return new JobStatistics2Response(biEngineStatistics, billingTier, cacheHit, ddlAffectedRowAccessPolicyCount, ddlDestinationTable, ddlOperationPerformed, ddlTargetDataset, ddlTargetRoutine, ddlTargetRowAccessPolicy, ddlTargetTable, dmlStats, estimatedBytesProcessed, mlStatistics, modelTraining, numDmlAffectedRows, queryPlan, referencedRoutines, referencedTables, reservationUsage, schema, statementType, timeline, totalBytesBilled, totalBytesProcessed, totalBytesProcessedAccuracy, totalPartitionsProcessed, totalSlotMs, undeclaredQueryParameters);
        }
    }
}