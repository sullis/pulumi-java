// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseManagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetManagedDatabaseSqlTuningAdvisorTasksExecutionPlanStatsComparisonArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedDatabaseSqlTuningAdvisorTasksExecutionPlanStatsComparisonArgs Empty = new GetManagedDatabaseSqlTuningAdvisorTasksExecutionPlanStatsComparisonArgs();

    /**
     * The execution ID for an execution of a SQL tuning task. This is not the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="executionId", required=true)
    private Output<String> executionId;

    /**
     * @return The execution ID for an execution of a SQL tuning task. This is not the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Output<String> executionId() {
        return this.executionId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
     * 
     */
    @Import(name="managedDatabaseId", required=true)
    private Output<String> managedDatabaseId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
     * 
     */
    public Output<String> managedDatabaseId() {
        return this.managedDatabaseId;
    }

    /**
     * The SQL object ID for the SQL tuning task. This is not the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="sqlObjectId", required=true)
    private Output<String> sqlObjectId;

    /**
     * @return The SQL object ID for the SQL tuning task. This is not the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Output<String> sqlObjectId() {
        return this.sqlObjectId;
    }

    /**
     * The SQL tuning task identifier. This is not the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="sqlTuningAdvisorTaskId", required=true)
    private Output<String> sqlTuningAdvisorTaskId;

    /**
     * @return The SQL tuning task identifier. This is not the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Output<String> sqlTuningAdvisorTaskId() {
        return this.sqlTuningAdvisorTaskId;
    }

    private GetManagedDatabaseSqlTuningAdvisorTasksExecutionPlanStatsComparisonArgs() {}

    private GetManagedDatabaseSqlTuningAdvisorTasksExecutionPlanStatsComparisonArgs(GetManagedDatabaseSqlTuningAdvisorTasksExecutionPlanStatsComparisonArgs $) {
        this.executionId = $.executionId;
        this.managedDatabaseId = $.managedDatabaseId;
        this.sqlObjectId = $.sqlObjectId;
        this.sqlTuningAdvisorTaskId = $.sqlTuningAdvisorTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedDatabaseSqlTuningAdvisorTasksExecutionPlanStatsComparisonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedDatabaseSqlTuningAdvisorTasksExecutionPlanStatsComparisonArgs $;

        public Builder() {
            $ = new GetManagedDatabaseSqlTuningAdvisorTasksExecutionPlanStatsComparisonArgs();
        }

        public Builder(GetManagedDatabaseSqlTuningAdvisorTasksExecutionPlanStatsComparisonArgs defaults) {
            $ = new GetManagedDatabaseSqlTuningAdvisorTasksExecutionPlanStatsComparisonArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param executionId The execution ID for an execution of a SQL tuning task. This is not the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder executionId(Output<String> executionId) {
            $.executionId = executionId;
            return this;
        }

        /**
         * @param executionId The execution ID for an execution of a SQL tuning task. This is not the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder executionId(String executionId) {
            return executionId(Output.of(executionId));
        }

        /**
         * @param managedDatabaseId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder managedDatabaseId(Output<String> managedDatabaseId) {
            $.managedDatabaseId = managedDatabaseId;
            return this;
        }

        /**
         * @param managedDatabaseId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder managedDatabaseId(String managedDatabaseId) {
            return managedDatabaseId(Output.of(managedDatabaseId));
        }

        /**
         * @param sqlObjectId The SQL object ID for the SQL tuning task. This is not the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder sqlObjectId(Output<String> sqlObjectId) {
            $.sqlObjectId = sqlObjectId;
            return this;
        }

        /**
         * @param sqlObjectId The SQL object ID for the SQL tuning task. This is not the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder sqlObjectId(String sqlObjectId) {
            return sqlObjectId(Output.of(sqlObjectId));
        }

        /**
         * @param sqlTuningAdvisorTaskId The SQL tuning task identifier. This is not the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder sqlTuningAdvisorTaskId(Output<String> sqlTuningAdvisorTaskId) {
            $.sqlTuningAdvisorTaskId = sqlTuningAdvisorTaskId;
            return this;
        }

        /**
         * @param sqlTuningAdvisorTaskId The SQL tuning task identifier. This is not the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder sqlTuningAdvisorTaskId(String sqlTuningAdvisorTaskId) {
            return sqlTuningAdvisorTaskId(Output.of(sqlTuningAdvisorTaskId));
        }

        public GetManagedDatabaseSqlTuningAdvisorTasksExecutionPlanStatsComparisonArgs build() {
            $.executionId = Objects.requireNonNull($.executionId, "expected parameter 'executionId' to be non-null");
            $.managedDatabaseId = Objects.requireNonNull($.managedDatabaseId, "expected parameter 'managedDatabaseId' to be non-null");
            $.sqlObjectId = Objects.requireNonNull($.sqlObjectId, "expected parameter 'sqlObjectId' to be non-null");
            $.sqlTuningAdvisorTaskId = Objects.requireNonNull($.sqlTuningAdvisorTaskId, "expected parameter 'sqlTuningAdvisorTaskId' to be non-null");
            return $;
        }
    }

}
